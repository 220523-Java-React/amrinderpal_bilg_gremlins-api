package org.gremlin.Model;

import java.io.Serializable;
import java.util.Objects;

public class Gremlin implements Serializable {



    private String id;

    private Integer gage;
    private String gname;
    private String gcolor;
    private Boolean isevil;

    public Gremlin(){
    }
    public Gremlin (Integer gage, String gname, String gcolor, Boolean isevil){
        this.gage=gage;
        this.gname=gname;
        this.gcolor=gcolor;
        this.isevil=isevil;
    }
    public Gremlin (String id, Integer gage, String gname, String gcolor, Boolean isevil){
        this.id = id;
        this.gage=gage;
        this.gname=gname;
        this.gcolor=gcolor;
        this.isevil=isevil;
    }

    public String getId() {
        return id;
    }

    public Gremlin setId(String id) {
        this.id = id;
        return this;
    }
    public Integer getGage() {
        return gage;
    }

    public Gremlin setGage(Integer gage) {
        this.gage = gage;
        return this;
    }
    public String getGname() {
        return gname;
    }

    public Gremlin setGname(String gname) {
        this.gname = gname;
        return this;
    }
    public String getGcolor() {
        return gcolor;
    }

    public Gremlin setGcolor(String gcolor) {
        this.gcolor = gcolor;
        return this;
    }
    public Boolean getIsevil() {
        return isevil;
    }

    public Gremlin setIsevil(Boolean isevil) {
        this.isevil = isevil;
        return this;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Gremlin gremlin = (Gremlin) o;
        return Objects.equals(id, gremlin.id) && Objects.equals(gage, gremlin.gage) && Objects.equals(gname, gremlin.gname) && Objects.equals(gcolor, gremlin.gcolor) && Objects.equals(isevil, gremlin.isevil);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, gage, gname, gcolor, isevil);
    }

    @Override
    public String toString() {
        return "Gremlin{" +
                "id=" + id +
                ", gage='" + gage + '\'' +
                ", gname='" + gname + '\'' +
                ", gcolor=" + gcolor + '\'' +
                ", isevil" + isevil +
                '}';
    }

}
