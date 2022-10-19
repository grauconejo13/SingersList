package Lab01;

//Vanessa Victorino - 301201653
public class SingerList {
    int singerID;
    String singerName;
    String singerAddress;
    String dateOfBirth;
    int numberOfAlbumsPublished;

    /*public void setSingers(int singerID,String singerName,String singerAddress,String dateOfBirth, int numberOfAlbumsPublished)
    {
        this.singerID = singerID;
        this.singerName = singerName;
        this.singerAddress = singerAddress;
        this.dateOfBirth = dateOfBirth;
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }*/

    public void setID(int singerID)
    {
        this.singerID = singerID;
    }
    public void setName(String singerName)
    {
        this.singerName = singerName;
    }
    public void setAddress(String singerAddress)
    {
        this.singerAddress = singerAddress;
    }
    public void setDateOfBirth(String dateOfBirth)
    {
        this.dateOfBirth = dateOfBirth;
    }
    public void setNumberOfAlbumsPublished(int numberOfAlbumsPublished)
    {
        this.numberOfAlbumsPublished = numberOfAlbumsPublished;
    }

    public int getID()
    {
        return singerID;
    }
    public String getName()
    {
        return singerName;
    }
    public String getAddress()
    {
        return singerAddress;
    }
    public String getDateOfBirth()
    {
        return dateOfBirth;
    }
    public int getNumberOfAlbumsPublished()
    {
        return numberOfAlbumsPublished;
    }
}
