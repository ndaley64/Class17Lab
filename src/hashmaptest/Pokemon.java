/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmaptest;

import java.util.Objects;

/**
 *
 * @author ndaley
 */
public class Pokemon {
    private int nationalDexID;
    private String name;
    private String type1;
    private String type2;

    public Pokemon(int nationalDexID, String name, String type1, String type2) {
        setNationalDexID(nationalDexID);
        setName(name);
        setType1(type1);
        setType2(type2);
    }

    public int getNationalDexID() {
        return nationalDexID;
    }

    public void setNationalDexID(int nationalDexID) {
        this.nationalDexID = nationalDexID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType1() {
        return type1;
    }

    public void setType1(String type1) {
        this.type1 = type1;
    }

    public String getType2() {
        return type2;
    }

    public void setType2(String type2) {
        this.type2 = type2;
    }

}
