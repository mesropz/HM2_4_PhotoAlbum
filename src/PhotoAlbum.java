import java.util.ArrayList;

public class PhotoAlbum {
    public static void main(String[] args) {
        ArrayList<String> photoAlbum=new ArrayList<>();

        Photo myAlbum=new Photo("Photo1");
        myAlbum.setPhotoName("myPhoto");
        myAlbum.addPhoto(photoAlbum, "secondPhoto");
  //      myAlbum.giveNameToPhotoByIndex(photoAlbum,1,"lastPhoto");
        myAlbum.printQuantityOfPhotos(photoAlbum);
    }
}
