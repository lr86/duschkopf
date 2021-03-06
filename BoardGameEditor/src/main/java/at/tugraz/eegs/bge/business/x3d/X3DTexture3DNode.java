//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für X3DTexture3DNode complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType name="X3DTexture3DNode">
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DTextureNode">
 *       &lt;choice minOccurs="0">
 *         &lt;element ref="{}TextureProperties"/>
 *         &lt;element ref="{}ProtoInstance"/>
 *       &lt;/choice>
 *       &lt;attribute name="repeatS" type="{}SFBool" default="false" />
 *       &lt;attribute name="repeatT" type="{}SFBool" default="false" />
 *       &lt;attribute name="repeatR" type="{}SFBool" default="false" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "X3DTexture3DNode", propOrder = {
    "textureProperties",
    "protoInstance"
})
@XmlSeeAlso({
    PixelTexture3D.class,
    ImageTexture3D.class,
    ComposedTexture3D.class
})
public abstract class X3DTexture3DNode
    extends X3DTextureNode
{

    @XmlElement(name = "TextureProperties")
    protected TextureProperties textureProperties;
    @XmlElement(name = "ProtoInstance")
    protected ProtoInstance protoInstance;
    @XmlAttribute(name = "repeatS")
    protected Boolean repeatS;
    @XmlAttribute(name = "repeatT")
    protected Boolean repeatT;
    @XmlAttribute(name = "repeatR")
    protected Boolean repeatR;

    /**
     * Ruft den Wert der textureProperties-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link TextureProperties }
     *     
     */
    public TextureProperties getTextureProperties() {
        return textureProperties;
    }

    /**
     * Legt den Wert der textureProperties-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link TextureProperties }
     *     
     */
    public void setTextureProperties(TextureProperties value) {
        this.textureProperties = value;
    }

    /**
     * Appropriately typed substitute node
     * 
     * @return
     *     possible object is
     *     {@link ProtoInstance }
     *     
     */
    public ProtoInstance getProtoInstance() {
        return protoInstance;
    }

    /**
     * Legt den Wert der protoInstance-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link ProtoInstance }
     *     
     */
    public void setProtoInstance(ProtoInstance value) {
        this.protoInstance = value;
    }

    /**
     * Ruft den Wert der repeatS-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRepeatS() {
        if (repeatS == null) {
            return false;
        } else {
            return repeatS;
        }
    }

    /**
     * Legt den Wert der repeatS-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepeatS(Boolean value) {
        this.repeatS = value;
    }

    /**
     * Ruft den Wert der repeatT-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRepeatT() {
        if (repeatT == null) {
            return false;
        } else {
            return repeatT;
        }
    }

    /**
     * Legt den Wert der repeatT-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepeatT(Boolean value) {
        this.repeatT = value;
    }

    /**
     * Ruft den Wert der repeatR-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRepeatR() {
        if (repeatR == null) {
            return false;
        } else {
            return repeatR;
        }
    }

    /**
     * Legt den Wert der repeatR-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRepeatR(Boolean value) {
        this.repeatR = value;
    }

}
