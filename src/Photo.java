import java.util.ArrayList;
import java.util.Arrays;

public class Photo {
    private String photoName;
    private String[] photoAlbum;
    public Photo() {
    }

    public Photo(String photoName) {
        this.photoName = photoName;
    }

    public void giveNameToPhotoByIndex(ArrayList<String> array, int indexNumber, String name){
       name= array.get(indexNumber);
    }

    public void addPhoto(ArrayList<String> array, String name){
            array.add(name);
                }


    public void printQuantityOfPhotos(ArrayList<String> array){
        System.out.println(array.size());

    }




    public String getPhotoName() {
        return photoName;
    }

    public void setPhotoName(String photoName) {
        this.photoName = photoName;
    }


    @Override
    public String toString() {
        return "Photo{" +
                "photoName='" + photoName;
    }



    /*  private String photoName;
    private int[] photoArr;

    giveNameToPhotoByIndex()
    addPhoto()
    printQuantityOfPhotos()
    */




}
