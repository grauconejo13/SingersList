package Lab01;

//Vanessa Victorino - 301201653
public class MainLab01 {

    public static void main(String[] args){

        //Version 2 to use loop to remove redundancy - 17JAN2024
        System.out.println("\n[Singers Listing]");

        // Create an array of SingerList objects
        SingerList[] singers = new SingerList[5];

        SingerList singers[0] = new SingerList();
        singers[0].setID(1);
        singers[0].setName("Elton John");
        singers[0].setAddress("Windsor,UK");
        singers[0].setDateOfBirth("03/25/1947");
        singers[0].setNumberOfAlbumsPublished(80);

        SingerList singers[1] = new SingerList();
        singers[1].setID(2);
        singers[1].setName("Celine Dion");
        singers[1].setAddress("Las Vegas,NV USA");
        singers[1].setDateOfBirth("03/30/1968");
        singers[1].setNumberOfAlbumsPublished(53);


        SingerList singers[2] = new SingerList();
        singers[2].setID(3);
        singers[2].setName("Taylor Swift");
        singers[2].setAddress("Nashville,TN USA");
        singers[2].setDateOfBirth("12/13/1989");
        singers[2].setNumberOfAlbumsPublished(33);


        SingerList singers[3] = new SingerList();
        singers[3].setID(4);
        singers[3].setName("Madonna");
        singers[3].setAddress("London,UK and Los Angeles,CA USA");
        singers[3].setDateOfBirth("08/16/1958");
        singers[3].setNumberOfAlbumsPublished(68);

        SingerList singers[4] = new SingerList();
        singers[4].setID(5);
        singers[4].setName("Tori Amos");
        singers[4].setAddress("Cornwall,UK");
        singers[4].setDateOfBirth("08/22/1963");
        singers[4].setNumberOfAlbumsPublished(43);


    // Loop through the array and print details
        for (SingerList singer : singers) {
            System.out.println("--------------------------------");
            System.out.println("ID: " + singer.getID());
            System.out.println("Name: " + singer.getName());
            System.out.println("Address: " + singer.getAddress());
            System.out.println("Birthdate: " + singer.getDateOfBirth());
            System.out.println("Total Album: " + singer.getNumberOfAlbumsPublished());
        }
        System.out.println("--------------------------------");
}
