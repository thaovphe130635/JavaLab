/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doctorinfor;

/**
 *
 * @author Thaovphe130635 <your.name at your.org>
 */
public class Doctor {
    private String Code;
    private String Name;
    private String Spec;
    private int Avai;

    public Doctor() {
    }

    public Doctor(String Code, String Name, String Spec, int Avai) {
        this.Code = Code;
        this.Name = Name;
        this.Spec = Spec;
        this.Avai = Avai;
    }

    public String getCode() {
        return Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSpec() {
        return Spec;
    }

    public void setSpec(String Spec) {
        this.Spec = Spec;
    }

    public int getAvai() {
        return Avai;
    }

    public void setAvai(int Avai) {
        this.Avai = Avai;
    }
    
}
