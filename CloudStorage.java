import java.util.ArrayList;

public class CloudStorage {

    private String name;
    ArrayList<Album> albums;

    public CloudStorage(){


    }

    public ArrayList<Album> getAlbums() {
        return albums;
    }

    public void setAlbums(ArrayList<Album> albums) {
        this.albums = albums;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }






    public void upload(ArrayList<Picture> pictures){

        for (Picture picture : pictures){
            for (Album album : albums) {
                if (picture.getPlace().equals(album.getName())) {
                   if (album.getPictures() == null){
                       album.setPictures(new ArrayList<Picture>());

                       }

                       album.getPictures().add(picture);

                }

            }


        }

    }



}
