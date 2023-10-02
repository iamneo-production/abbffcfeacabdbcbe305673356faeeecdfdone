import java.util.ArrayList;
import java.util.List;

public class ApiService {
    private List<Laptop> laptops = new ArrayList<>();
    public boolean addLaptop(Laptop laptop){
        laptops.add(laptop);
        return true;
    }

    public Laptop getLaptopById(int laptopId){
        for(Laptop laptop : laptops){
            if(laptop.getLaptopid() == laptopId){
                return laptop;
            }

        }
        return null;
    }
}
