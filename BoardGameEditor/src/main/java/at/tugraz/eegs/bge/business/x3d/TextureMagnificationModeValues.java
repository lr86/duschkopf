//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für textureMagnificationModeValues.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="textureMagnificationModeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AVG_PIXEL"/>
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="FASTEST"/>
 *     &lt;enumeration value="NEAREST_PIXEL"/>
 *     &lt;enumeration value="NICEST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "textureMagnificationModeValues")
@XmlEnum
public enum TextureMagnificationModeValues {

    AVG_PIXEL,
    DEFAULT,
    FASTEST,
    NEAREST_PIXEL,
    NICEST;

    public String value() {
        return name();
    }

    public static TextureMagnificationModeValues fromValue(String v) {
        return valueOf(v);
    }

}
