/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Jimmy
 */
@Entity
@Table(name = "licencias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Licencias.findAll", query = "SELECT l FROM Licencias l")
    , @NamedQuery(name = "Licencias.findByIdlicencia", query = "SELECT l FROM Licencias l WHERE l.idlicencia = :idlicencia")
    , @NamedQuery(name = "Licencias.findByAppLicenceKey", query = "SELECT l FROM Licencias l WHERE l.appLicenceKey = :appLicenceKey")
    , @NamedQuery(name = "Licencias.findByAppRemoteKey", query = "SELECT l FROM Licencias l WHERE l.appRemoteKey = :appRemoteKey")
    , @NamedQuery(name = "Licencias.findByEstado", query = "SELECT l FROM Licencias l WHERE l.estado = :estado")
    , @NamedQuery(name = "Licencias.findByFechaFinVigencia", query = "SELECT l FROM Licencias l WHERE l.fechaFinVigencia = :fechaFinVigencia")
    , @NamedQuery(name = "Licencias.findByFechaAlta", query = "SELECT l FROM Licencias l WHERE l.fechaAlta = :fechaAlta")
    , @NamedQuery(name = "Licencias.findByFechaModificacionU", query = "SELECT l FROM Licencias l WHERE l.fechaModificacionU = :fechaModificacionU")
    , @NamedQuery(name = "Licencias.findByFechaBajaU", query = "SELECT l FROM Licencias l WHERE l.fechaBajaU = :fechaBajaU")})
public class Licencias implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idlicencia")
    private Integer idlicencia;
    @Size(max = 240)
    @Column(name = "AppLicenceKey")
    private String appLicenceKey;
    @Size(max = 240)
    @Column(name = "AppRemoteKey")
    private String appRemoteKey;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Estado")
    private int estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FechaFinVigencia")
    @Temporal(TemporalType.DATE)
    private Date fechaFinVigencia;
    @Column(name = "FechaAlta")
    @Temporal(TemporalType.DATE)
    private Date fechaAlta;
    @Column(name = "FechaModificacionU")
    @Temporal(TemporalType.DATE)
    private Date fechaModificacionU;
    @Column(name = "FechaBajaU")
    @Temporal(TemporalType.DATE)
    private Date fechaBajaU;

    public Licencias() {
    }

    public Licencias(Integer idlicencia) {
        this.idlicencia = idlicencia;
    }

    public Licencias(Integer idlicencia, int estado, Date fechaFinVigencia) {
        this.idlicencia = idlicencia;
        this.estado = estado;
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public Integer getIdlicencia() {
        return idlicencia;
    }

    public void setIdlicencia(Integer idlicencia) {
        this.idlicencia = idlicencia;
    }

    public String getAppLicenceKey() {
        return appLicenceKey;
    }

    public void setAppLicenceKey(String appLicenceKey) {
        this.appLicenceKey = appLicenceKey;
    }

    public String getAppRemoteKey() {
        return appRemoteKey;
    }

    public void setAppRemoteKey(String appRemoteKey) {
        this.appRemoteKey = appRemoteKey;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Date getFechaFinVigencia() {
        return fechaFinVigencia;
    }

    public void setFechaFinVigencia(Date fechaFinVigencia) {
        this.fechaFinVigencia = fechaFinVigencia;
    }

    public Date getFechaAlta() {
        return fechaAlta;
    }

    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    public Date getFechaModificacionU() {
        return fechaModificacionU;
    }

    public void setFechaModificacionU(Date fechaModificacionU) {
        this.fechaModificacionU = fechaModificacionU;
    }

    public Date getFechaBajaU() {
        return fechaBajaU;
    }

    public void setFechaBajaU(Date fechaBajaU) {
        this.fechaBajaU = fechaBajaU;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idlicencia != null ? idlicencia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Licencias)) {
            return false;
        }
        Licencias other = (Licencias) object;
        if ((this.idlicencia == null && other.idlicencia != null) || (this.idlicencia != null && !this.idlicencia.equals(other.idlicencia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Licencias[ idlicencia=" + idlicencia + " ]";
    }
    
}
