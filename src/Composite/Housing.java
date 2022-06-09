package Composite;

import java.util.ArrayList;

public class Housing implements IStructure {
    private String address;
    ArrayList<IStructure> structures;
    private String name;

    public Housing(String name){
    this.name = name;
        structures = new ArrayList<>();
    }
    public void addStructure(IStructure structure){
        structures.add(structure);
    }
    public void addStructure(ArrayList<IStructure> structures){
        structures.addAll(structures);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void getStructures() {
        for (IStructure s :
                structures) {
            System.out.println(s);

        }
    }

    public void setStructures(ArrayList<IStructure> structures) {
        this.structures = structures;
    }
    public IStructure getStructure(String name) {
        IStructure structure = null;
        for (IStructure structure1:
             structures) {
            if (structure1.getName().equals(name)){
                structure = structure1;
                break;
            }
        }
        return structure;
    }

    @Override
    public void enter() {

    }

    @Override
    public void exit() {

    }

    @Override
    public void location() {

    }

    @Override
    public String getName() {
        return name;
    }
}
