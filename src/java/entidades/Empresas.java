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
@Table(name = "empresas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Empresas.findAll", query = "SELECT e FROM Empresas e")
    , @NamedQuery(name = "Empresas.findByIdEmpresas", query = "SELECT e FROM Empresas e WHERE e.idEmpresas = :idEmpresas")
    , @NamedQuery(name = "Empresas.findByEmpresaNombre", query = "SELECT e FROM Empresas e WHERE e.empresaNombre = :empresaNombre")
    , @NamedQuery(name = "Empresas.findByEstado", query = "SELECT e FROM Empresas e WHERE e.estado = :estado")
    , @NamedQuery(name = "Empresas.findByUsuarioAlta", query = "SELECT e FROM Empresas e WHERE e.usuarioAlta = :usuarioAlta")
    , @NamedQuery(name = "Empresas.findByUsuarioModificacion", query = "SELECT e FROM Empresas e WHERE e.usuarioModificacion = :usuarioModificacion")
    , @NamedQuery(name = "Empresas.findByUsuarioBaja", query = "SELECT e FROM Empresas e WHERE e.usuarioBaja = :usuarioBaja")})
public class Empresas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEmpresas")
    private Integer idEmpresas;
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

    public Empresas() {
    }

    public Empresas(Integer idEmpresas) {
        this.idEmpresas = idEmpresas;
    }

    public Empresas(Integer idEmpresas, String empresaNombre, int estado, Date usuarioAlta) {
        this.idEmpresas = idEmpresas;
        this.empresaNombre = empresaNombre;
        this.estado = estado;
        this.usuarioAlta = usuarioAlta;
    }

    public Integer getIdEmpresas() {
        return idEmpresas;
    }

    public void setIdEmpresas(Integer idEmpresas) {
        this.idEmpresas = idEmpresas;
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
        hash += (idEmpresas != null ? idEmpresas.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Empresas)) {
            return false;
        }
        Empresas other = (Empresas) object;
        if ((this.idEmpresas == null && other.idEmpresas != null) || (this.idEmpresas != null && !this.idEmpresas.equals(other.idEmpresas))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entidades.Empresas[ idEmpresas=" + idEmpresas + " ]";
    }
    
}
