//sp24-bse-044 b section(hiba noor)

public class Artwork{
private String title;
private int Year;
private Artist artist;
 public Artwork(String title,int year,Artist artist){
this.title=title;
this.year=year;
this.artist=artist;}
public Artwork(String title,int year){
this.title=title;
this.year=year;
this.artist = new Artist("Unknown Artist");}

public String getTitle(){
return title;}
public int getYear(){
return year;}
public void setArtist( Artist n){
artist=n;}
public Artist getArtist(){
return artist;}
public void displayArtwork(){
System.out.println("the title is:"+title);
System.out.println("the year is:"+year);
artist.display();}
public Artwork shallowCopy() {
        return new Artwork(this.title, this.year, this.artist);
    }

    // Deep copy: 
    public Artwork deepCopy() {
        return new Artwork(this.title, this.year, new Artist(this.artist.getName()));
    }
}








}