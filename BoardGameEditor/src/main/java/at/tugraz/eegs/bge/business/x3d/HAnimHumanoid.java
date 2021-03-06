//
// Diese Datei wurde mit der JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 generiert 
// Siehe <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Änderungen an dieser Datei gehen bei einer Neukompilierung des Quellschemas verloren. 
// Generiert: 2014.05.29 um 11:56:32 PM CEST 
//


package at.tugraz.eegs.bge.business.x3d;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java-Klasse für anonymous complex type.
 * 
 * <p>Das folgende Schemafragment gibt den erwarteten Content an, der in dieser Klasse enthalten ist.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;extension base="{}X3DHumanoidNode">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;group ref="{}ChildContentModel" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{}Coordinate"/>
 *           &lt;element ref="{}CoordinateDouble"/>
 *         &lt;/choice>
 *         &lt;element ref="{}Normal" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="name" type="{}SFString" />
 *       &lt;attribute name="center" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="rotation" type="{}SFRotation" default="0 0 1 0" />
 *       &lt;attribute name="scale" type="{}SFVec3f" default="1 1 1" />
 *       &lt;attribute name="scaleOrientation" type="{}SFRotation" default="0 0 1 0" />
 *       &lt;attribute name="translation" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="info" type="{}MFString" />
 *       &lt;attribute name="version" type="{}hanimVersionValues" />
 *       &lt;attribute name="bboxCenter" type="{}SFVec3f" default="0 0 0" />
 *       &lt;attribute name="bboxSize" type="{}boundingBoxSizeType" default="-1 -1 -1" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "backgroundOrColorInterpolatorOrCoordinateInterpolator"
})
@XmlRootElement(name = "HAnimHumanoid")
public class HAnimHumanoid
    extends X3DHumanoidNode
{

    @XmlElements({
        @XmlElement(name = "Background", type = Background.class),
        @XmlElement(name = "ColorInterpolator", type = ColorInterpolator.class),
        @XmlElement(name = "CoordinateInterpolator", type = CoordinateInterpolator.class),
        @XmlElement(name = "DirectionalLight", type = DirectionalLight.class),
        @XmlElement(name = "Group", type = Group.class),
        @XmlElement(name = "NavigationInfo", type = NavigationInfo.class),
        @XmlElement(name = "NormalInterpolator", type = NormalInterpolator.class),
        @XmlElement(name = "OrientationInterpolator", type = OrientationInterpolator.class),
        @XmlElement(name = "PositionInterpolator", type = PositionInterpolator.class),
        @XmlElement(name = "ScalarInterpolator", type = ScalarInterpolator.class),
        @XmlElement(name = "Shape", type = Shape.class),
        @XmlElement(name = "TimeSensor", type = TimeSensor.class),
        @XmlElement(name = "Transform", type = Transform.class),
        @XmlElement(name = "Viewpoint", type = Viewpoint.class),
        @XmlElement(name = "WorldInfo", type = WorldInfo.class),
        @XmlElement(name = "Anchor", type = Anchor.class),
        @XmlElement(name = "BooleanFilter", type = BooleanFilter.class),
        @XmlElement(name = "BooleanSequencer", type = BooleanSequencer.class),
        @XmlElement(name = "BooleanToggle", type = BooleanToggle.class),
        @XmlElement(name = "BooleanTrigger", type = BooleanTrigger.class),
        @XmlElement(name = "CylinderSensor", type = CylinderSensor.class),
        @XmlElement(name = "Inline", type = Inline.class),
        @XmlElement(name = "IntegerSequencer", type = IntegerSequencer.class),
        @XmlElement(name = "IntegerTrigger", type = IntegerTrigger.class),
        @XmlElement(name = "KeySensor", type = KeySensor.class),
        @XmlElement(name = "PlaneSensor", type = PlaneSensor.class),
        @XmlElement(name = "PointLight", type = PointLight.class),
        @XmlElement(name = "ProximitySensor", type = ProximitySensor.class),
        @XmlElement(name = "SphereSensor", type = SphereSensor.class),
        @XmlElement(name = "SpotLight", type = SpotLight.class),
        @XmlElement(name = "StringSensor", type = StringSensor.class),
        @XmlElement(name = "Switch", type = Switch.class),
        @XmlElement(name = "TimeTrigger", type = TimeTrigger.class),
        @XmlElement(name = "TouchSensor", type = TouchSensor.class),
        @XmlElement(name = "AudioClip", type = AudioClip.class),
        @XmlElement(name = "Billboard", type = Billboard.class),
        @XmlElement(name = "Collision", type = Collision.class),
        @XmlElement(name = "Fog", type = Fog.class),
        @XmlElement(name = "LoadSensor", type = LoadSensor.class),
        @XmlElement(name = "LocalFog", type = LocalFog.class),
        @XmlElement(name = "LOD", type = LOD.class),
        @XmlElement(name = "Script", type = Script.class),
        @XmlElement(name = "Sound", type = Sound.class),
        @XmlElement(name = "VisibilitySensor", type = VisibilitySensor.class),
        @XmlElement(name = "CoordinateInterpolator2D", type = CoordinateInterpolator2D.class),
        @XmlElement(name = "PositionInterpolator2D", type = PositionInterpolator2D.class),
        @XmlElement(name = "ClipPlane", type = ClipPlane.class),
        @XmlElement(name = "EaseInEaseOut", type = EaseInEaseOut.class),
        @XmlElement(name = "LinePickSensor", type = LinePickSensor.class),
        @XmlElement(name = "PickableGroup", type = PickableGroup.class),
        @XmlElement(name = "PointPickSensor", type = PointPickSensor.class),
        @XmlElement(name = "PrimitivePickSensor", type = PrimitivePickSensor.class),
        @XmlElement(name = "VolumePickSensor", type = VolumePickSensor.class),
        @XmlElement(name = "SplinePositionInterpolator", type = SplinePositionInterpolator.class),
        @XmlElement(name = "SplinePositionInterpolator2D", type = SplinePositionInterpolator2D.class),
        @XmlElement(name = "SplineScalarInterpolator", type = SplineScalarInterpolator.class),
        @XmlElement(name = "SquadOrientationInterpolator", type = SquadOrientationInterpolator.class),
        @XmlElement(name = "StaticGroup", type = StaticGroup.class),
        @XmlElement(name = "CADAssembly", type = CADAssembly.class),
        @XmlElement(name = "CADLayer", type = CADLayer.class),
        @XmlElement(name = "CADPart", type = CADPart.class),
        @XmlElement(name = "OrthoViewpoint", type = OrthoViewpoint.class),
        @XmlElement(name = "ViewpointGroup", type = ViewpointGroup.class),
        @XmlElement(name = "ColorDamper", type = ColorDamper.class),
        @XmlElement(name = "CoordinateDamper", type = CoordinateDamper.class),
        @XmlElement(name = "OrientationChaser", type = OrientationChaser.class),
        @XmlElement(name = "OrientationDamper", type = OrientationDamper.class),
        @XmlElement(name = "PositionChaser", type = PositionChaser.class),
        @XmlElement(name = "PositionChaser2D", type = PositionChaser2D.class),
        @XmlElement(name = "PositionDamper", type = PositionDamper.class),
        @XmlElement(name = "PositionDamper2D", type = PositionDamper2D.class),
        @XmlElement(name = "ScalarChaser", type = ScalarChaser.class),
        @XmlElement(name = "TexCoordDamper2D", type = TexCoordDamper2D.class),
        @XmlElement(name = "TextureBackground", type = TextureBackground.class),
        @XmlElement(name = "CollidableShape", type = CollidableShape.class),
        @XmlElement(name = "CollisionSensor", type = CollisionSensor.class),
        @XmlElement(name = "RigidBodyCollection", type = RigidBodyCollection.class),
        @XmlElement(name = "LayerSet", type = LayerSet.class),
        @XmlElement(name = "ParticleSystem", type = ParticleSystem.class),
        @XmlElement(name = "TransformSensor", type = TransformSensor.class),
        @XmlElement(name = "EspduTransform", type = EspduTransform.class),
        @XmlElement(name = "ReceiverPdu", type = ReceiverPdu.class),
        @XmlElement(name = "SignalPdu", type = SignalPdu.class),
        @XmlElement(name = "TransmitterPdu", type = TransmitterPdu.class),
        @XmlElement(name = "DISEntityManager", type = DISEntityManager.class),
        @XmlElement(name = "GeoLocation", type = GeoLocation.class),
        @XmlElement(name = "GeoLOD", type = GeoLOD.class),
        @XmlElement(name = "GeoMetadata", type = GeoMetadata.class),
        @XmlElement(name = "GeoOrigin", type = GeoOrigin.class),
        @XmlElement(name = "GeoPositionInterpolator", type = GeoPositionInterpolator.class),
        @XmlElement(name = "GeoProximitySensor", type = GeoProximitySensor.class),
        @XmlElement(name = "GeoTouchSensor", type = GeoTouchSensor.class),
        @XmlElement(name = "GeoViewpoint", type = GeoViewpoint.class),
        @XmlElement(name = "GeoTransform", type = GeoTransform.class),
        @XmlElement(name = "HAnimHumanoid", type = HAnimHumanoid.class),
        @XmlElement(name = "HAnimJoint", type = HAnimJoint.class),
        @XmlElement(name = "HAnimSegment", type = HAnimSegment.class),
        @XmlElement(name = "HAnimSite", type = HAnimSite.class),
        @XmlElement(name = "NurbsOrientationInterpolator", type = NurbsOrientationInterpolator.class),
        @XmlElement(name = "NurbsPositionInterpolator", type = NurbsPositionInterpolator.class),
        @XmlElement(name = "NurbsSurfaceInterpolator", type = NurbsSurfaceInterpolator.class),
        @XmlElement(name = "NurbsSet", type = NurbsSet.class),
        @XmlElement(name = "ProtoInstance", type = ProtoInstance.class),
        @XmlElement(name = "Coordinate", type = Coordinate.class),
        @XmlElement(name = "CoordinateDouble", type = CoordinateDouble.class),
        @XmlElement(name = "Normal", type = Normal.class)
    })
    protected List<Object> backgroundOrColorInterpolatorOrCoordinateInterpolator;
    @XmlAttribute(name = "name")
    protected String name;
    @XmlAttribute(name = "center")
    protected String center;
    @XmlAttribute(name = "rotation")
    protected String rotation;
    @XmlAttribute(name = "scale")
    protected String scale;
    @XmlAttribute(name = "scaleOrientation")
    protected String scaleOrientation;
    @XmlAttribute(name = "translation")
    protected String translation;
    @XmlAttribute(name = "info")
    protected List<String> info;
    @XmlAttribute(name = "version")
    protected String version;
    @XmlAttribute(name = "bboxCenter")
    protected String bboxCenter;
    @XmlAttribute(name = "bboxSize")
    protected String bboxSize;

    /**
     * Gets the value of the backgroundOrColorInterpolatorOrCoordinateInterpolator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the backgroundOrColorInterpolatorOrCoordinateInterpolator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBackgroundOrColorInterpolatorOrCoordinateInterpolator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Background }
     * {@link ColorInterpolator }
     * {@link CoordinateInterpolator }
     * {@link DirectionalLight }
     * {@link Group }
     * {@link NavigationInfo }
     * {@link NormalInterpolator }
     * {@link OrientationInterpolator }
     * {@link PositionInterpolator }
     * {@link ScalarInterpolator }
     * {@link Shape }
     * {@link TimeSensor }
     * {@link Transform }
     * {@link Viewpoint }
     * {@link WorldInfo }
     * {@link Anchor }
     * {@link BooleanFilter }
     * {@link BooleanSequencer }
     * {@link BooleanToggle }
     * {@link BooleanTrigger }
     * {@link CylinderSensor }
     * {@link Inline }
     * {@link IntegerSequencer }
     * {@link IntegerTrigger }
     * {@link KeySensor }
     * {@link PlaneSensor }
     * {@link PointLight }
     * {@link ProximitySensor }
     * {@link SphereSensor }
     * {@link SpotLight }
     * {@link StringSensor }
     * {@link Switch }
     * {@link TimeTrigger }
     * {@link TouchSensor }
     * {@link AudioClip }
     * {@link Billboard }
     * {@link Collision }
     * {@link Fog }
     * {@link LoadSensor }
     * {@link LocalFog }
     * {@link LOD }
     * {@link Script }
     * {@link Sound }
     * {@link VisibilitySensor }
     * {@link CoordinateInterpolator2D }
     * {@link PositionInterpolator2D }
     * {@link ClipPlane }
     * {@link EaseInEaseOut }
     * {@link LinePickSensor }
     * {@link PickableGroup }
     * {@link PointPickSensor }
     * {@link PrimitivePickSensor }
     * {@link VolumePickSensor }
     * {@link SplinePositionInterpolator }
     * {@link SplinePositionInterpolator2D }
     * {@link SplineScalarInterpolator }
     * {@link SquadOrientationInterpolator }
     * {@link StaticGroup }
     * {@link CADAssembly }
     * {@link CADLayer }
     * {@link CADPart }
     * {@link OrthoViewpoint }
     * {@link ViewpointGroup }
     * {@link ColorDamper }
     * {@link CoordinateDamper }
     * {@link OrientationChaser }
     * {@link OrientationDamper }
     * {@link PositionChaser }
     * {@link PositionChaser2D }
     * {@link PositionDamper }
     * {@link PositionDamper2D }
     * {@link ScalarChaser }
     * {@link TexCoordDamper2D }
     * {@link TextureBackground }
     * {@link CollidableShape }
     * {@link CollisionSensor }
     * {@link RigidBodyCollection }
     * {@link LayerSet }
     * {@link ParticleSystem }
     * {@link TransformSensor }
     * {@link EspduTransform }
     * {@link ReceiverPdu }
     * {@link SignalPdu }
     * {@link TransmitterPdu }
     * {@link DISEntityManager }
     * {@link GeoLocation }
     * {@link GeoLOD }
     * {@link GeoMetadata }
     * {@link GeoOrigin }
     * {@link GeoPositionInterpolator }
     * {@link GeoProximitySensor }
     * {@link GeoTouchSensor }
     * {@link GeoViewpoint }
     * {@link GeoTransform }
     * {@link HAnimHumanoid }
     * {@link HAnimJoint }
     * {@link HAnimSegment }
     * {@link HAnimSite }
     * {@link NurbsOrientationInterpolator }
     * {@link NurbsPositionInterpolator }
     * {@link NurbsSurfaceInterpolator }
     * {@link NurbsSet }
     * {@link ProtoInstance }
     * {@link Coordinate }
     * {@link CoordinateDouble }
     * {@link Normal }
     * 
     * 
     */
    public List<Object> getBackgroundOrColorInterpolatorOrCoordinateInterpolator() {
        if (backgroundOrColorInterpolatorOrCoordinateInterpolator == null) {
            backgroundOrColorInterpolatorOrCoordinateInterpolator = new ArrayList<Object>();
        }
        return this.backgroundOrColorInterpolatorOrCoordinateInterpolator;
    }

    /**
     * Ruft den Wert der name-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Legt den Wert der name-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Ruft den Wert der center-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCenter() {
        if (center == null) {
            return "0 0 0";
        } else {
            return center;
        }
    }

    /**
     * Legt den Wert der center-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCenter(String value) {
        this.center = value;
    }

    /**
     * Ruft den Wert der rotation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRotation() {
        if (rotation == null) {
            return "0 0 1 0";
        } else {
            return rotation;
        }
    }

    /**
     * Legt den Wert der rotation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRotation(String value) {
        this.rotation = value;
    }

    /**
     * Ruft den Wert der scale-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScale() {
        if (scale == null) {
            return "1 1 1";
        } else {
            return scale;
        }
    }

    /**
     * Legt den Wert der scale-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScale(String value) {
        this.scale = value;
    }

    /**
     * Ruft den Wert der scaleOrientation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScaleOrientation() {
        if (scaleOrientation == null) {
            return "0 0 1 0";
        } else {
            return scaleOrientation;
        }
    }

    /**
     * Legt den Wert der scaleOrientation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScaleOrientation(String value) {
        this.scaleOrientation = value;
    }

    /**
     * Ruft den Wert der translation-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTranslation() {
        if (translation == null) {
            return "0 0 0";
        } else {
            return translation;
        }
    }

    /**
     * Legt den Wert der translation-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTranslation(String value) {
        this.translation = value;
    }

    /**
     * Gets the value of the info property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the info property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getInfo() {
        if (info == null) {
            info = new ArrayList<String>();
        }
        return this.info;
    }

    /**
     * Ruft den Wert der version-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Legt den Wert der version-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Ruft den Wert der bboxCenter-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBboxCenter() {
        if (bboxCenter == null) {
            return "0 0 0";
        } else {
            return bboxCenter;
        }
    }

    /**
     * Legt den Wert der bboxCenter-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBboxCenter(String value) {
        this.bboxCenter = value;
    }

    /**
     * Ruft den Wert der bboxSize-Eigenschaft ab.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBboxSize() {
        if (bboxSize == null) {
            return "-1 -1 -1";
        } else {
            return bboxSize;
        }
    }

    /**
     * Legt den Wert der bboxSize-Eigenschaft fest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBboxSize(String value) {
        this.bboxSize = value;
    }

}
