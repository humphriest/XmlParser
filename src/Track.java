
public class Track {

        private int track_id;
        private String artist;
        private String song_name;
        private String album;
        private String genre;

        public Track() {
        }
        public Track(int track_id, String artist, String song_name, String album, String genre) {
            this.track_id = track_id;
            this.artist = artist;
            this.song_name = song_name;
            this.album = album;
            this.genre = genre;
        }

        public int getTrack_id() {
            return track_id;
        }

        public void setTrack_id(int track_id) {
            this.track_id = track_id;
        }

        public String getArtist() {
            return artist;
        }

        public void setArtist(String artist) {
            this.artist = artist;
        }

        public String getSong_name() {
            return song_name;
        }

        public void setSong_name(String song_name) {
            this.song_name = song_name;
        }

        public String getAlbum() { return album; }

        public void setAlbum(String album) { this.album = album; }

        public String getGenre() { return genre; }

        public void setGenre(String genre) { this.genre = genre;}


    }
