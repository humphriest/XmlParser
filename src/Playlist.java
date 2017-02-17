
import java.util.List;

public class Playlist {

    int id;

    private int playlistId;
    private String playlistPersistenceId;
    private String playlistName;
    private List<Track> tracks;

    public Playlist(){

    }

    public Playlist(int playlistId, String playlistPersistenceId, String playlistName, List<Track> tracks) {
        this.playlistId = playlistId;
        this.playlistPersistenceId = playlistPersistenceId;
        this.playlistName = playlistName;
        this.tracks = tracks;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPlaylistId() {
        return playlistId;
    }

    public void setPlaylistId(int playlistId) {
        this.playlistId = playlistId;
    }

    public String getPlaylistPersistenceId() {
        return playlistPersistenceId;
    }

    public void setPlaylistPersistenceId(String playlistPersistenceId) {
        this.playlistPersistenceId = playlistPersistenceId;
    }


    public String getPlaylistName() {
        return playlistName;
    }
    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }


    public List<Track> getTracks() {
        return tracks;
    }
    public void setTracks(List<Track> tracks) {
        this.tracks = tracks;
    }


}

