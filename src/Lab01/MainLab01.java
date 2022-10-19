package Lab01;

//Vanessa Victorino - 301201653
public class MainLab01 {

    public static void main(String[] args){

        System.out.println("\n[Singers Listing]");

        SingerList singerOne = new SingerList();
        singerOne.setID(1);
        singerOne.setName("Elton John");
        singerOne.setAddress("Windsor,UK");
        singerOne.setDateOfBirth("03/25/1947");
        singerOne.setNumberOfAlbumsPublished(80);

        System.out.println("--------------------------------");
        System.out.println("ID: " + singerOne.getID());
        System.out.println("Name: " + singerOne.getName());
        System.out.println("Address: " + singerOne.getAddress());
        System.out.println("Birthdate: " + singerOne.getDateOfBirth());
        System.out.println("Total Album: " + singerOne.getNumberOfAlbumsPublished());

        SingerList singerTwo = new SingerList();
        singerTwo.setID(2);
        singerTwo.setName("Celine Dion");
        singerTwo.setAddress("Las Vegas,NV USA");
        singerTwo.setDateOfBirth("03/30/1968");
        singerTwo.setNumberOfAlbumsPublished(53);

        System.out.println("--------------------------------");
        System.out.println("ID: " + singerTwo.getID());
        System.out.println("Name: " + singerTwo.getName());
        System.out.println("Address: " + singerTwo.getAddress());
        System.out.println("Birthdate: " + singerTwo.getDateOfBirth());
        System.out.println("Total Album: " + singerTwo.getNumberOfAlbumsPublished());

        SingerList singerThree = new SingerList();
        singerThree.setID(3);
        singerThree.setName("Taylor Swift");
        singerThree.setAddress("Nashville,TN USA");
        singerThree.setDateOfBirth("12/13/1989");
        singerThree.setNumberOfAlbumsPublished(33);

        System.out.println("--------------------------------");
        System.out.println("ID: " + singerThree.getID());
        System.out.println("Name: " + singerThree.getName());
        System.out.println("Address: " + singerThree.getAddress());
        System.out.println("Birthdate: " + singerThree.getDateOfBirth());
        System.out.println("Total Album: " + singerThree.getNumberOfAlbumsPublished());

        SingerList singerFour = new SingerList();
        singerFour.setID(4);
        singerFour.setName("Madonna");
        singerFour.setAddress("London,UK and Los Angeles,CA USA");
        singerFour.setDateOfBirth("08/16/1958");
        singerFour.setNumberOfAlbumsPublished(68);

        System.out.println("--------------------------------");
        System.out.println("ID: " + singerFour.getID());
        System.out.println("Name: " + singerFour.getName());
        System.out.println("Address: " + singerFour.getAddress());
        System.out.println("Birthdate: " + singerFour.getDateOfBirth());
        System.out.println("Total Album: " + singerFour.getNumberOfAlbumsPublished());

        SingerList singerFive = new SingerList();
        singerFive.setID(5);
        singerFive.setName("Tori Amos");
        singerFive.setAddress("Cornwall,UK");
        singerFive.setDateOfBirth("08/22/1963");
        singerFive.setNumberOfAlbumsPublished(43);

        System.out.println("--------------------------------");
        System.out.println("ID: " + singerFive.getID());
        System.out.println("Name: " + singerFive.getName());
        System.out.println("Address: " + singerFive.getAddress());
        System.out.println("Birthdate: " + singerFive.getDateOfBirth());
        System.out.println("Total Album: " + singerFive.getNumberOfAlbumsPublished());
        System.out.println("--------------------------------");
    }
}
