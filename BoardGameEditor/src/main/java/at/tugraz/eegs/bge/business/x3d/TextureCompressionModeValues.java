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
 * <p>Java-Klasse für textureCompressionModeValues.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * <p>
 * <pre>
 * &lt;simpleType name="textureCompressionModeValues">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="DEFAULT"/>
 *     &lt;enumeration value="FASTEST"/>
 *     &lt;enumeration value="HIGH"/>
 *     &lt;enumeration value="LOW"/>
 *     &lt;enumeration value="MEDIUM"/>
 *     &lt;enumeration value="NICEST"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "textureCompressionModeValues")
@XmlEnum
public enum TextureCompressionModeValues {

    DEFAULT,
    FASTEST,
    HIGH,
    LOW,
    MEDIUM,
    NICEST;

    public String value() {
        return name();
    }

    public static TextureCompressionModeValues fromValue(String v) {
        return valueOf(v);
    }

}
