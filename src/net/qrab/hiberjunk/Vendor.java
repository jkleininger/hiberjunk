package net.qrab.hiberjunk;

import java.io.Serializable;
import javax.persistence.*;


@Entity
@Table(name="VENDOR")
public class Vendor implements Serializable {

  @Column(name="serial_id")
  @Id
  private Long sId;

  public Long getsId() {
    return sId;
  }

  public void setsId(Long sId) {
    this.sId = sId;
  }

  @Column(name="vid")
  private int    vId;

  @Column(name="vname")
  private String vName;

  @Column(name="vstreet")
  private String vStreet;

  @Column(name="vcity")
  private String vCity;

  @Column(name="vstate")
  private String vState;

  @Column(name="vzip")
  private String vZip;

  public int getvId() {
    return vId;
  }

  public void setvId(int vId) {
    this.vId = vId;
  }

  public String getvName() {
    return vName;
  }

  public void setvName(String vName) {
    this.vName = vName;
  }

  public String getvStreet() {
    return vStreet;
  }

  public void setvStreet(String vStreet) {
    this.vStreet = vStreet;
  }

  public String getvCity() {
    return vCity;
  }

  public void setvCity(String vCity) {
    this.vCity = vCity;
  }

  public String getvState() {
    return vState;
  }

  public void setvState(String vState) {
    this.vState = vState;
  }

  public String getvZip() {
    return vZip;
  }

  public void setvZip(String vZip) {
    this.vZip = vZip;
  }

  public Long getSId() {
    return sId;
  }

  public void setSId(Long sId) {
    this.sId = sId;
  }




}
