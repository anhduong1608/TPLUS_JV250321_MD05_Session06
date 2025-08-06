package ra.edu.dao;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class StudentDAO {
    public List<String> getListString(){
        return List.of("One","Two","Three");
    }
}
