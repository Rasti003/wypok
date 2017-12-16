package pl.rasti.wypok.model;

import java.sql.Timestamp;

public class Discovery {
    private long id;
    private String name;
    private String description;
    private String url;
    private Timestamp timestamp;
    private User user;
    private int upVote;
    private int downVote;

    public Discovery() {
    }

    public Discovery(Discovery discovery) {
        this.id = discovery.id;
        this.name = discovery.name;
        this.description = discovery.description;
        this.url = discovery.url;
        this.timestamp =  new Timestamp(discovery.timestamp.getTime());
        this.user = new User(discovery.user);
        this.upVote = discovery.upVote;
        this.downVote = discovery.downVote;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Timestamp getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Timestamp timestamp) {
        this.timestamp = timestamp;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public int getUpVote() {
        return upVote;
    }

    public void setUpVote(int upVote) {
        this.upVote = upVote;
    }

    public int getDownVote() {
        return downVote;
    }

    public void setDownVote(int downVote) {
        this.downVote = downVote;
    }

    @Override
    public String toString() {
        return "Discovery{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", timestamp=" + timestamp +
                ", user=" + user +
                ", upVote=" + upVote +
                ", downVote=" + downVote +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Discovery)) return false;

        Discovery discovery = (Discovery) o;

        if (getId() != discovery.getId()) return false;
        if (getUpVote() != discovery.getUpVote()) return false;
        if (getDownVote() != discovery.getDownVote()) return false;
        if (!getName().equals(discovery.getName())) return false;
        if (!getDescription().equals(discovery.getDescription())) return false;
        if (!getUrl().equals(discovery.getUrl())) return false;
        if (!getTimestamp().equals(discovery.getTimestamp())) return false;
        return getUser().equals(discovery.getUser());
    }

    @Override
    public int hashCode() {
        int result = (int) (getId() ^ (getId() >>> 32));
        result = 31 * result + getName().hashCode();
        result = 31 * result + getDescription().hashCode();
        result = 31 * result + getUrl().hashCode();
        result = 31 * result + getTimestamp().hashCode();
        result = 31 * result + getUser().hashCode();
        result = 31 * result + getUpVote();
        result = 31 * result + getDownVote();
        return result;
    }
}

