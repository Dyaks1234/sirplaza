/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author User
 */
@Entity
@Table(name = "MEMBERSHIP", catalog = "", schema = "ADMINS")
@NamedQueries({
    @NamedQuery(name = "Membership.findAll", query = "SELECT m FROM Membership m")
    , @NamedQuery(name = "Membership.findById", query = "SELECT m FROM Membership m WHERE m.id = :id")
    , @NamedQuery(name = "Membership.findByFname", query = "SELECT m FROM Membership m WHERE m.fname = :fname")
    , @NamedQuery(name = "Membership.findByLname", query = "SELECT m FROM Membership m WHERE m.lname = :lname")
    , @NamedQuery(name = "Membership.findByMname", query = "SELECT m FROM Membership m WHERE m.mname = :mname")
    , @NamedQuery(name = "Membership.findByNname", query = "SELECT m FROM Membership m WHERE m.nname = :nname")
    , @NamedQuery(name = "Membership.findByAddress", query = "SELECT m FROM Membership m WHERE m.address = :address")
    , @NamedQuery(name = "Membership.findByGender", query = "SELECT m FROM Membership m WHERE m.gender = :gender")
    , @NamedQuery(name = "Membership.findByAge", query = "SELECT m FROM Membership m WHERE m.age = :age")
    , @NamedQuery(name = "Membership.findByCivilstatus", query = "SELECT m FROM Membership m WHERE m.civilstatus = :civilstatus")
    , @NamedQuery(name = "Membership.findByCurrentschool", query = "SELECT m FROM Membership m WHERE m.currentschool = :currentschool")
    , @NamedQuery(name = "Membership.findByCourse", query = "SELECT m FROM Membership m WHERE m.course = :course")
    , @NamedQuery(name = "Membership.findByYearlevel", query = "SELECT m FROM Membership m WHERE m.yearlevel = :yearlevel")})
public class Membership implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @Column(name = "FNAME")
    private String fname;
    @Basic(optional = false)
    @Column(name = "LNAME")
    private String lname;
    @Basic(optional = false)
    @Column(name = "MNAME")
    private String mname;
    @Basic(optional = false)
    @Column(name = "NNAME")
    private String nname;
    @Basic(optional = false)
    @Column(name = "ADDRESS")
    private String address;
    @Basic(optional = false)
    @Column(name = "GENDER")
    private String gender;
    @Basic(optional = false)
    @Column(name = "AGE")
    private String age;
    @Basic(optional = false)
    @Column(name = "CIVILSTATUS")
    private String civilstatus;
    @Basic(optional = false)
    @Column(name = "CURRENTSCHOOL")
    private String currentschool;
    @Basic(optional = false)
    @Column(name = "COURSE")
    private String course;
    @Basic(optional = false)
    @Column(name = "YEARLEVEL")
    private String yearlevel;

    public Membership() {
    }

    public Membership(Integer id) {
        this.id = id;
    }

    public Membership(Integer id, String fname, String lname, String mname, String nname, String address, String gender, String age, String civilstatus, String currentschool, String course, String yearlevel) {
        this.id = id;
        this.fname = fname;
        this.lname = lname;
        this.mname = mname;
        this.nname = nname;
        this.address = address;
        this.gender = gender;
        this.age = age;
        this.civilstatus = civilstatus;
        this.currentschool = currentschool;
        this.course = course;
        this.yearlevel = yearlevel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        String oldFname = this.fname;
        this.fname = fname;
        changeSupport.firePropertyChange("fname", oldFname, fname);
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        String oldLname = this.lname;
        this.lname = lname;
        changeSupport.firePropertyChange("lname", oldLname, lname);
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        String oldMname = this.mname;
        this.mname = mname;
        changeSupport.firePropertyChange("mname", oldMname, mname);
    }

    public String getNname() {
        return nname;
    }

    public void setNname(String nname) {
        String oldNname = this.nname;
        this.nname = nname;
        changeSupport.firePropertyChange("nname", oldNname, nname);
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        String oldAddress = this.address;
        this.address = address;
        changeSupport.firePropertyChange("address", oldAddress, address);
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        String oldGender = this.gender;
        this.gender = gender;
        changeSupport.firePropertyChange("gender", oldGender, gender);
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        String oldAge = this.age;
        this.age = age;
        changeSupport.firePropertyChange("age", oldAge, age);
    }

    public String getCivilstatus() {
        return civilstatus;
    }

    public void setCivilstatus(String civilstatus) {
        String oldCivilstatus = this.civilstatus;
        this.civilstatus = civilstatus;
        changeSupport.firePropertyChange("civilstatus", oldCivilstatus, civilstatus);
    }

    public String getCurrentschool() {
        return currentschool;
    }

    public void setCurrentschool(String currentschool) {
        String oldCurrentschool = this.currentschool;
        this.currentschool = currentschool;
        changeSupport.firePropertyChange("currentschool", oldCurrentschool, currentschool);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        String oldCourse = this.course;
        this.course = course;
        changeSupport.firePropertyChange("course", oldCourse, course);
    }

    public String getYearlevel() {
        return yearlevel;
    }

    public void setYearlevel(String yearlevel) {
        String oldYearlevel = this.yearlevel;
        this.yearlevel = yearlevel;
        changeSupport.firePropertyChange("yearlevel", oldYearlevel, yearlevel);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Membership)) {
            return false;
        }
        Membership other = (Membership) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "login.Membership[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
