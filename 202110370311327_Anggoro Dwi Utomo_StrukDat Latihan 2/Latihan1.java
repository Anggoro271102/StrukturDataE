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
            System.out.println("After");
            DeleteHewan.addAll(Hewan);
            int hapus=1;
            int hapus1=2;
            int hapussaja=3;
            System.out.println("Hewan Yang Dihapus\t: ");
            System.out.println(DeleteHewan.get(hapus)+","+DeleteHewan.get(hapus1)+","+DeleteHewan.get(hapussaja)+"");
            DeleteHewan.remove(hapus);
            DeleteHewan.remove(hapus1);
            DeleteHewan.remove("Unta");
            System.out.println(DeleteHewan);
        }
}
