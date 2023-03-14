public class Kota<E> {
    private E element;
    public Kota(E kota){
        element = kota;
    }
    public E getElement(){
        return element;
    }

    public static void main(String[] args) {
        Kota<Integer> jumlahKota = new Kota<Integer>(9);
        Kota<String> namaKota = new Kota<String>("Malang");
        System.out.println("Jumlah kota dijawa timur : "+ jumlahKota.getElement()+" kota");
        System.out.println("salah satu kota di jawa timur : kota "+namaKota.getElement());
    }
}
