package nl.novi.javaprogrammeren.four.hidden;

import java.util.List;

public class PrisonCell {
    private Inhabitant inMate ;
    private String celBlock;

    public PrisonCell (String celBlock) {
         this.celBlock = celBlock;
    }

    public Inhabitant getInMate() {
        return inMate;
    }

    public void setInMate(Inhabitant inMate) {
        this.inMate = inMate;
    }

    public void inMate (String name) {
        Inhabitant inMate = new Inhabitant(name);
        this.setInMate(inMate);
    }

    public String getCelBlock() {
        return celBlock;
    }

    public void setCelBlock(String celBlock) {
        this.celBlock = celBlock;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.celBlock)
                .append(" holds ")
                .append(this.inMate.getName());
          return sb.toString();
    }
}
