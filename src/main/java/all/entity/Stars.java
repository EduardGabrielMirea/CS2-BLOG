package all.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Stars  {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    public Long S_id;
    private String name;
    private String champions;

    public Stars(Long s_id, String name, String champions) {
        S_id = s_id;
        this.name = name;
        this.champions = champions;
    }

    public Stars() {

    }

    public Long getS_id() {
        return S_id;
    }

    public void setS_id(Long s_id) {
        S_id = s_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChampions() {
        return champions;
    }

    public void setChampions(String champions) {
        this.champions = champions;
    }

    @Override
    public String toString(){
        return "Name: "+ name+"\n\t Trohpies: "+champions;
    }
}
