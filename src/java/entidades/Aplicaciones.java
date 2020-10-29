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
@Table(name = "aplicaciones")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aplicaciones.findAll", query = "SELECT a FROM Aplicaciones a")
    , @NamedQuery(name = "Aplicaciones.findByIdAplicacion", query = "SELECT a FROM Aplicaciones a WHERE a.idAplicacion = :idAplicacion")
    , @NamedQuery(name = "Aplicaciones.findByEmpresaNombre", query = "SELECT a FROM Aplicaciones a WHERE a.empresaNombre = :empresaNombre")
    , @NamedQuery(name = "Aplicaciones.findByEstado", query = "SELECT a FROM Aplicaciones a WHERE a.estado = :estado")
    , @NamedQuery(name = "Aplicaciones.findByUsuarioAlta", query = "SELECT a FROM Aplicaciones a WHERE a.usuarioAlta = :usuarioAlta")
    , @NamedQuery(name = "Aplicaciones.findByUsuarioModificacion", query = "SELECT a FROM Aplicaciones a WHERE a.usuarioModificacion = :usuarioModificacion")
    , @NamedQuery(name = "Aplicaciones.findByUsuarioBaja", query = "SELECT a FROM Aplicaciones a WHERE a.usuarioBaja = :usuarioBaja")})
public class Aplicaciones implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAplicacion")
    private Integer idAplicacion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "EmpresaNombre")
    private String empresaNombre;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Estado")
    private int estado;
    @Basic(optional = false)
    @NotNull
    @Column(name = "UsuarioAlta")
    @Temporal(TemporalType.DATE)
    private Date usuarioAlta;
    @Column(name = "UsuarioModificacion")
    @Temporal(TemporalType.DATE)
    private Date usuarioModificacion;
    @Column(name = "UsuarioBaja")
    @Temporal(TemporalType.DATE)
    private Date usuarioBaja;

    public Aplicaciones() {
    }

    public Aplicaciones(Integer idAplicacion) {
        this.idAplicacion = idAplicacion;
    }

    public Aplicaciones(Integer idAplicacion, String empresaNombre, int estado, Date usuarioAlta) {
        this.idAplicacion = idAplicacion;
        this.empresaNombre = empresaNombre;
        this.estado = estado;
        this.usuarioAlta = usuarioAlta;
    }

    public Integer getIdAplicacion() {
        return idAplicacion;
    }

    public void setIdAplicacion(Integer idAplicacion) {
        this.idAplicacion = idAplicacion;
    }

    public String getEmpresaNombre() {
        return empresaNombre;
    }

    public void setEmpresaNombre(String empresaNombre) {
        this.empresaNombre = empresaNombre;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public Date getUsuarioAlta() {
        return usuarioAlta;
    }

    public void setUsuarioAlta(Date usuarioAlta) {
        this.usuarioAlta = usuarioAlta;
    }

    public Date getUsuarioModificacion() {
        return usuarioModificacion;
    }

    public void setUsuarioModificacion(Date usuarioModificacion) {
        this.usuarioModificacion = usuarioModificacion;
    }

    public Date getUsuarioBaja() {
        return usuarioBaja;
    }

    public void setUsuarioBaja(Date usuarioBaja) {
        this.usuarioBaja = usuarioBaja;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAplicacion != null ? idAplicacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Aplicaciones)) {
            return false;
        }
        Aplicaciones other = (Aplicaciones) object;
        if ((this.idAplicacion == null && other.idAplicacion != null) || (this.idAplicacion != null && !this.idAplicacion.equals(other.idAplicacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Aplicaciones[ idAplicacion=" + idAplicacion + " ]";
    }
    
}
