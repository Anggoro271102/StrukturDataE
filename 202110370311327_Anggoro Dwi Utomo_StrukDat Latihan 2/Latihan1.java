
import java.util.ArrayList;
public class Latihan1 {
    public static void main(String[] args) throws Exception {
            ArrayList<String> Hewan = new ArrayList<>();
            ArrayList<String> DeleteHewan = new ArrayList<>();

            Hewan.add("Sapi");
            Hewan.add("Kelinci");
            Hewan.add("Kambing");
            Hewan.add("Unta");
            Hewan.add("Domba");
            
            System.out.println("Before");
            System.out.println(Hewan);
            DeleteHewan.addAll(Hewan);
            System.out.println("Hewan Yang Dihapus\t: ");
            System.out.println(DeleteHewan.get(1)+","+DeleteHewan.get(2)+","+DeleteHewan.get(3)+"");
            DeleteHewan.remove(1);
            DeleteHewan.remove(1);
            DeleteHewan.remove(1);
            
            System.out.println("After");
            System.out.println(DeleteHewan);
        }
}

