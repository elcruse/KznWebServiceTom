package entidades;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-10-28T00:42:51")
@StaticMetamodel(Aplicaciones.class)
public class Aplicaciones_ { 

    public static volatile SingularAttribute<Aplicaciones, Integer> idAplicacion;
    public static volatile SingularAttribute<Aplicaciones, Integer> estado;
    public static volatile SingularAttribute<Aplicaciones, String> empresaNombre;
    public static volatile SingularAttribute<Aplicaciones, Date> usuarioModificacion;
    public static volatile SingularAttribute<Aplicaciones, Date> usuarioAlta;
    public static volatile SingularAttribute<Aplicaciones, Date> usuarioBaja;

}