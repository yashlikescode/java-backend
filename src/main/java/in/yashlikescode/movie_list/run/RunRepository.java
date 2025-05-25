package in.yashlikescode.movie_list.run;

import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Repository
public class RunRepository {
    private List<Run> runs = new ArrayList<>();

    List<Run> findAll(){
        return runs;
    }

    Run findById(Integer id){
        return runs.stream()
                .filter(run->run.id()==id)
                .findFirst()
                .get();
    }

    @PostConstruct
    private void init(){
        runs.add(new Run(1, "Firsty Run", LocalDateTime.now(), LocalDateTime.now().plusHours(1),3, Location.INDOOR));
        runs.add(new Run(2, "Secondy Run", LocalDateTime.now(), LocalDateTime.now().plusHours(2),4, Location.OUTDOOR));
    }
}
