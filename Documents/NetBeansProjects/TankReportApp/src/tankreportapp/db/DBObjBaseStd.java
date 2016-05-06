
package tankreportapp.db;

import javafx.beans.property.*;



public class DBObjBaseStd {


    private IntegerProperty id;
    private StringProperty name;   
    private StringProperty label;
    private StringProperty descrShort;
    private StringProperty descrLong;    
    private IntegerProperty idx;
    private StringProperty createdDT;
    private int rowQnty=0;
    



    public DBObjBaseStd(int id, String name, String label, String descrShort, String descrLong, int idx, String createdDT) {
        this.id=new SimpleIntegerProperty(id);
        this.name=new SimpleStringProperty(name);
        this.label=new SimpleStringProperty(label);
        this.descrShort=new SimpleStringProperty(descrShort);
        this.descrLong=new SimpleStringProperty(descrLong);
        this.idx=new SimpleIntegerProperty(idx);
        this.createdDT=new SimpleStringProperty(createdDT);
            }
public Integer getId() {
        return id.get();
    }
    public void setId(Integer id) {
        this.id.set(id);
    }
    
    public String getName() {
        return name.get();
    }
    public void setName(String name) {
        this.name.set(name);
    }
    
        public String getLabel() {
        return label.get();
    }
    public void setLabel(String label) {
        this.label.set(label);
    }
    
            public String getDescrShort() {
        return descrShort.get();
    }
    public void setDescrShort(String descrShort) {
        this.descrShort.set(descrShort);
    }
    
    public Integer getIdx() {
        return idx.get();
    }
    public void setIdx(Integer idx) {
        this.idx.set(idx);
    }
   
}