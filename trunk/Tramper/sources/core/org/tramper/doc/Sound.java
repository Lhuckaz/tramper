package org.tramper.doc;


/**
 * A sound
 * @author Paul-Emile
 */
public class Sound extends SimpleDocument {
    /** id */
    protected String id;
    /** length in bytes */
    protected long length;
    /** duration in microsecond */
    protected long duration;
    /** album */
    protected String album;
    
    /**
     * 
     */
    public Sound() {
        super();
    }

    /**
     * @return length.
     */
    public long getLength() {
        return this.length;
    }

    /**
     * @param length length 
     */
    public void setLength(long length) {
        this.length = length;
    }

    /**
     * @return id.
     */
    public String getId() {
        return this.id;
    }

    /**
     * @param id id 
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return album.
     */
    public String getAlbum() {
        return this.album;
    }

    /**
     * @param album album 
     */
    public void setAlbum(String album) {
        this.album = album;
    }

    /**
     * @return duration.
     */
    public long getDuration() {
        return this.duration;
    }

    /**
     * @param duration duration 
     */
    public void setDuration(long duration) {
        this.duration = duration;
    }
    
    /**
     * @see java.lang.Object#toString()
     */
    public String toString() {
        return "audio";
    }
}
