package hust.soict.dsai.test.disc;
import hust.soict.dsai.aims.media.DigitalVideoDisc;

public class TestPassingParameter {
	
//	public static void main(String[] args) {
//		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
//		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
//		
//		swap(jungleDVD, cinderellaDVD) ;
//		
//		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
//		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
//		
//		changeTitle(jungleDVD, cinderellaDVD.getTitle());
//		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
//				
//	}
//	
//	public static void swap(Object o1, Object o2) {
//		Object tmp = o1;
//		o1 = o2;
//		o2 = tmp;
//	}
//	
//	public static void changeTitle(DigitalVideoDisc dvd, String title) {
//		String oldTitle = dvd.getTitle();
//		dvd.setTitle(title);
//		dvd = new DigitalVideoDisc(oldTitle);
//		
//	}
	
	
	public static void main(String[] args) {
        DigitalVideoDisc[] discs = new DigitalVideoDisc[2];
        discs[0] = new DigitalVideoDisc("Jungle");
        discs[1] = new DigitalVideoDisc("Cinderella");

        swap(discs);
        System.out.println("jungle dvd title: " + discs[0].getTitle());
        System.out.println("cinderella dvd title: " + discs[1].getTitle());

        changeTitle(discs[0], discs[1].getTitle());
        System.out.println("jungle dvd title: " + discs[0].getTitle());
    }

    public static void swap(DigitalVideoDisc[] discs) {
        DigitalVideoDisc tmp = discs[0];
        discs[0] = discs[1];
        discs[1] = tmp;
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
        System.out.println("jungle dvd title: " + dvd.getTitle());
    }
}
