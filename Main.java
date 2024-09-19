//sp24-bse-044 b section(hiba noor)


/*public class Main{
public static void main(String arg[]){
Artist a=new Artist();
a.display();
Artwork art1=new Artwork("Shein",2024,"lisa");
Artwork art2=new Artwork("exhibit",2023);
art2=setArtist("unknown artist");
System.out.println(art1.name);
System.out.println(art1.title);
System.out.println(art1.artist);
System.out.println(art2.name);
System.out.println(art2.title);
System.out.println(art2.getartist());}*/

public class Main {
    public static void main(String[] args) {
        // Creating an Artist object
        Artist artist1 = new Artist("Pablo Picasso");

        // Creating two Artwork objects
        Artwork artwork1 = new Artwork("Guernica", 1937, artist1);
        Artwork artwork2 = new Artwork("Untitled", 2024);

        // Setting title and year for artwork2 using encapsulation
        artwork2.displayInfo();

        System.out.println("\n--- After Encapsulation ---");
        artwork2.displayInfo();

        // Creating shallow and deep copies of artwork1
        Artwork shallowCopy = artwork1.shallowCopy();
        Artwork deepCopy = artwork1.deepCopy();

        // Display original and copied artworks
        System.out.println("\n--- Original Artwork ---");
        artwork1.displayInfo();

        System.out.println("\n--- Shallow Copy ---");
        shallowCopy.displayInfo();

        System.out.println("\n--- Deep Copy ---");
        deepCopy.displayInfo();

        // Modifying artist's name in the original artwork
        System.out.println("\n--- Modifying Artist Name in Original ---");
        artist1 = new Artist("Van Gogh");
        artwork1.displayInfo();
        shallowCopy.displayInfo();
        deepCopy.displayInfo();
    }
}


 











}