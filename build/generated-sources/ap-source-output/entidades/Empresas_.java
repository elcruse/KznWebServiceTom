package entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-28T00:42:51")
@StaticMetamodel(Empresas.class)
public class Empresas_ { 

    public static volatile SingularAttribute<Empresas, Integer> idEmpresas;
    public static volatile SingularAttribute<Empresas, Integer> estado;
    public static volatile SingularAttribute<Empresas, String> empresaNombre;
    public static volatile SingularAttribute<Empresas, Date> usuarioModificacion;
    public static volatile SingularAttribute<Empresas, Date> usuarioAlta;
    public static volatile SingularAttribute<Empresas, Date> usuarioBaja;

}