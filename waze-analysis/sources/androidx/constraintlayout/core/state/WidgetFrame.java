package androidx.constraintlayout.core.state;

import androidx.constraintlayout.core.motion.CustomAttribute;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.parser.CLElement;
import androidx.constraintlayout.core.parser.CLKey;
import androidx.constraintlayout.core.parser.CLNumber;
import androidx.constraintlayout.core.parser.CLObject;
import androidx.constraintlayout.core.state.Transition;
import androidx.constraintlayout.core.widgets.ConstraintAnchor;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.core.os.EnvironmentCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class WidgetFrame {
    public static float phone_orientation = Float.NaN;
    public float alpha;
    public int bottom;
    public float interpolatedPos;
    public int left;
    private final HashMap<String, CustomVariable> mCustom;
    TypedBundle mMotionProperties;
    public String name;
    public float pivotX;
    public float pivotY;
    public int right;
    public float rotationX;
    public float rotationY;
    public float rotationZ;
    public float scaleX;
    public float scaleY;
    public int top;
    public float translationX;
    public float translationY;
    public float translationZ;
    public int visibility;
    public ConstraintWidget widget;

    public WidgetFrame(WidgetFrame widgetFrame) {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.mCustom = new HashMap<>();
        this.name = null;
        this.widget = widgetFrame.widget;
        this.left = widgetFrame.left;
        this.top = widgetFrame.top;
        this.right = widgetFrame.right;
        this.bottom = widgetFrame.bottom;
        updateAttributes(widgetFrame);
    }

    private static void add(StringBuilder sb, String str, float f2) {
        if (Float.isNaN(f2)) {
            return;
        }
        sb.append(str);
        sb.append(": ");
        sb.append(f2);
        sb.append(",\n");
    }

    public static void interpolate(int i2, int i3, WidgetFrame widgetFrame, WidgetFrame widgetFrame2, WidgetFrame widgetFrame3, Transition transition, float f2) {
        int i4;
        float f3;
        int i5;
        int i6;
        int i7;
        float f4;
        int i8;
        float f5;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = widgetFrame2.left;
        int i17 = widgetFrame2.top;
        int i18 = widgetFrame3.left;
        int i19 = widgetFrame3.top;
        int i20 = widgetFrame2.right - i16;
        int i21 = widgetFrame2.bottom - i17;
        int i22 = widgetFrame3.right - i18;
        int i23 = widgetFrame3.bottom - i19;
        float f6 = widgetFrame2.alpha;
        float f7 = widgetFrame3.alpha;
        if (widgetFrame2.visibility == 8) {
            i4 = i16 - ((int) (i22 / 2.0f));
            i7 = i17 - ((int) (i23 / 2.0f));
            if (Float.isNaN(f6)) {
                i6 = i22;
                i5 = i23;
                f3 = 0.0f;
            } else {
                i6 = i22;
                f3 = f6;
                i5 = i23;
            }
        } else {
            i4 = i16;
            f3 = f6;
            i5 = i21;
            i6 = i20;
            i7 = i17;
        }
        int i24 = i4;
        float f8 = i5;
        float f9 = i6;
        if (widgetFrame3.visibility == 8) {
            i18 -= (int) (f9 / 2.0f);
            i19 -= (int) (f8 / 2.0f);
            if (Float.isNaN(f7)) {
                i22 = i6;
                i23 = i5;
                f4 = 0.0f;
            } else {
                i22 = i6;
                i23 = i5;
                f4 = f7;
            }
        } else {
            f4 = f7;
        }
        if (Float.isNaN(f3) && !Float.isNaN(f4)) {
            f3 = 1.0f;
        }
        if (!Float.isNaN(f3) && Float.isNaN(f4)) {
            f4 = 1.0f;
        }
        float f10 = widgetFrame2.visibility == 4 ? 0.0f : f3;
        if (widgetFrame3.visibility == 4) {
            f4 = 0.0f;
        }
        if (widgetFrame.widget == null || !transition.hasPositionKeyframes()) {
            i8 = i18;
            f5 = f2;
            i9 = i7;
            i10 = i19;
            i11 = i24;
        } else {
            float f11 = 100.0f * f2;
            i8 = i18;
            int i25 = (int) f11;
            Transition.KeyPosition keyPositionFindPreviousPosition = transition.findPreviousPosition(widgetFrame.widget.stringId, i25);
            int i26 = i19;
            Transition.KeyPosition keyPositionFindNextPosition = transition.findNextPosition(widgetFrame.widget.stringId, i25);
            if (keyPositionFindPreviousPosition == keyPositionFindNextPosition) {
                keyPositionFindNextPosition = null;
            }
            if (keyPositionFindPreviousPosition != null) {
                float f12 = keyPositionFindPreviousPosition.mX * i2;
                float f13 = keyPositionFindPreviousPosition.mY * i3;
                i13 = keyPositionFindPreviousPosition.mFrame;
                i12 = (int) f13;
                i11 = (int) f12;
            } else {
                i12 = i7;
                i11 = i24;
                i13 = 0;
            }
            if (keyPositionFindNextPosition != null) {
                float f14 = keyPositionFindNextPosition.mX * i2;
                float f15 = keyPositionFindNextPosition.mY * i3;
                i14 = keyPositionFindNextPosition.mFrame;
                i15 = (int) f15;
                i8 = (int) f14;
            } else {
                i14 = 100;
                i15 = i26;
            }
            f5 = (f11 - i13) / (i14 - i13);
            int i27 = i12;
            i10 = i15;
            i9 = i27;
        }
        widgetFrame.widget = widgetFrame2.widget;
        int i28 = (int) (i11 + ((i8 - i11) * f5));
        widgetFrame.left = i28;
        int i29 = (int) (i9 + (f5 * (i10 - i9)));
        widgetFrame.top = i29;
        float f16 = 1.0f - f2;
        widgetFrame.right = i28 + ((int) ((f16 * f9) + (i22 * f2)));
        widgetFrame.bottom = i29 + ((int) ((f16 * f8) + (i23 * f2)));
        widgetFrame.pivotX = interpolate(widgetFrame2.pivotX, widgetFrame3.pivotX, 0.5f, f2);
        widgetFrame.pivotY = interpolate(widgetFrame2.pivotY, widgetFrame3.pivotY, 0.5f, f2);
        widgetFrame.rotationX = interpolate(widgetFrame2.rotationX, widgetFrame3.rotationX, 0.0f, f2);
        widgetFrame.rotationY = interpolate(widgetFrame2.rotationY, widgetFrame3.rotationY, 0.0f, f2);
        widgetFrame.rotationZ = interpolate(widgetFrame2.rotationZ, widgetFrame3.rotationZ, 0.0f, f2);
        widgetFrame.scaleX = interpolate(widgetFrame2.scaleX, widgetFrame3.scaleX, 1.0f, f2);
        widgetFrame.scaleY = interpolate(widgetFrame2.scaleY, widgetFrame3.scaleY, 1.0f, f2);
        widgetFrame.translationX = interpolate(widgetFrame2.translationX, widgetFrame3.translationX, 0.0f, f2);
        widgetFrame.translationY = interpolate(widgetFrame2.translationY, widgetFrame3.translationY, 0.0f, f2);
        widgetFrame.translationZ = interpolate(widgetFrame2.translationZ, widgetFrame3.translationZ, 0.0f, f2);
        widgetFrame.alpha = interpolate(f10, f4, 1.0f, f2);
        Set<String> setKeySet = widgetFrame3.mCustom.keySet();
        widgetFrame.mCustom.clear();
        for (String str : setKeySet) {
            if (widgetFrame2.mCustom.containsKey(str)) {
                CustomVariable customVariable = widgetFrame2.mCustom.get(str);
                CustomVariable customVariable2 = widgetFrame3.mCustom.get(str);
                CustomVariable customVariable3 = new CustomVariable(customVariable);
                widgetFrame.mCustom.put(str, customVariable3);
                if (customVariable.numberOfInterpolatedValues() == 1) {
                    customVariable3.setValue(Float.valueOf(interpolate(customVariable.getValueToInterpolate(), customVariable2.getValueToInterpolate(), 0.0f, f2)));
                } else {
                    int iNumberOfInterpolatedValues = customVariable.numberOfInterpolatedValues();
                    float[] fArr = new float[iNumberOfInterpolatedValues];
                    float[] fArr2 = new float[iNumberOfInterpolatedValues];
                    customVariable.getValuesToInterpolate(fArr);
                    customVariable2.getValuesToInterpolate(fArr2);
                    for (int i30 = 0; i30 < iNumberOfInterpolatedValues; i30++) {
                        fArr[i30] = interpolate(fArr[i30], fArr2[i30], 0.0f, f2);
                        customVariable3.setValue(fArr);
                    }
                }
            }
        }
    }

    private void serializeAnchor(StringBuilder sb, ConstraintAnchor.Type type) {
        ConstraintAnchor anchor = this.widget.getAnchor(type);
        if (anchor == null || anchor.mTarget == null) {
            return;
        }
        sb.append("Anchor");
        sb.append(type.name());
        sb.append(": ['");
        String str = anchor.mTarget.getOwner().stringId;
        if (str == null) {
            str = "#PARENT";
        }
        sb.append(str);
        sb.append("', '");
        sb.append(anchor.mTarget.getType().name());
        sb.append("', '");
        sb.append(anchor.mMargin);
        sb.append("'],\n");
    }

    public void addCustomColor(String str, int i2) {
        setCustomAttribute(str, 902, i2);
    }

    public void addCustomFloat(String str, float f2) {
        setCustomAttribute(str, 901, f2);
    }

    public float centerX() {
        return this.left + ((this.right - r0) / 2.0f);
    }

    public float centerY() {
        return this.top + ((this.bottom - r0) / 2.0f);
    }

    public boolean containsCustom(String str) {
        return this.mCustom.containsKey(str);
    }

    public CustomVariable getCustomAttribute(String str) {
        return this.mCustom.get(str);
    }

    public Set<String> getCustomAttributeNames() {
        return this.mCustom.keySet();
    }

    public int getCustomColor(String str) {
        if (this.mCustom.containsKey(str)) {
            return this.mCustom.get(str).getColorValue();
        }
        return -21880;
    }

    public float getCustomFloat(String str) {
        if (this.mCustom.containsKey(str)) {
            return this.mCustom.get(str).getFloatValue();
        }
        return Float.NaN;
    }

    public String getId() {
        ConstraintWidget constraintWidget = this.widget;
        return constraintWidget == null ? EnvironmentCompat.MEDIA_UNKNOWN : constraintWidget.stringId;
    }

    public TypedBundle getMotionProperties() {
        return this.mMotionProperties;
    }

    public int height() {
        return Math.max(0, this.bottom - this.top);
    }

    public boolean isDefaultTransform() {
        return Float.isNaN(this.rotationX) && Float.isNaN(this.rotationY) && Float.isNaN(this.rotationZ) && Float.isNaN(this.translationX) && Float.isNaN(this.translationY) && Float.isNaN(this.translationZ) && Float.isNaN(this.scaleX) && Float.isNaN(this.scaleY) && Float.isNaN(this.alpha);
    }

    void logv(String str) {
        String strConcat;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        if (this.widget != null) {
            strConcat = str2 + DomExceptionUtils.SEPARATOR + (this.widget.hashCode() % 1000);
        } else {
            strConcat = str2.concat("/NULL");
        }
        System.out.println(strConcat + " " + str);
    }

    void parseCustom(CLElement cLElement) {
        CLObject cLObject = (CLObject) cLElement;
        int size = cLObject.size();
        for (int i2 = 0; i2 < size; i2++) {
            CLKey cLKey = (CLKey) cLObject.get(i2);
            String strContent = cLKey.content();
            CLElement value = cLKey.getValue();
            String strContent2 = value.content();
            if (strContent2 != null && strContent2.length() < 128 && strContent2.matches("#[0-9a-fA-F]+")) {
                setCustomAttribute(strContent, 902, Integer.parseInt(strContent2.substring(1), 16));
            } else if (value instanceof CLNumber) {
                setCustomAttribute(strContent, 901, value.getFloat());
            } else {
                setCustomAttribute(strContent, 903, strContent2);
            }
        }
    }

    void printCustomAttributes() {
        String strConcat;
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str = (".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + ") " + stackTraceElement.getMethodName()) + " " + (hashCode() % 1000);
        if (this.widget != null) {
            strConcat = str + DomExceptionUtils.SEPARATOR + (this.widget.hashCode() % 1000) + " ";
        } else {
            strConcat = str.concat("/NULL ");
        }
        HashMap<String, CustomVariable> map = this.mCustom;
        if (map != null) {
            Iterator<String> it = map.keySet().iterator();
            while (it.hasNext()) {
                System.out.println(strConcat.concat(String.valueOf(this.mCustom.get(it.next()).toString())));
            }
        }
    }

    public StringBuilder serialize(StringBuilder sb, boolean z) {
        sb.append("{\n");
        add(sb, TtmlNode.LEFT, this.left);
        add(sb, "top", this.top);
        add(sb, TtmlNode.RIGHT, this.right);
        add(sb, "bottom", this.bottom);
        add(sb, "pivotX", this.pivotX);
        add(sb, "pivotY", this.pivotY);
        add(sb, "rotationX", this.rotationX);
        add(sb, "rotationY", this.rotationY);
        add(sb, "rotationZ", this.rotationZ);
        add(sb, "translationX", this.translationX);
        add(sb, "translationY", this.translationY);
        add(sb, "translationZ", this.translationZ);
        add(sb, "scaleX", this.scaleX);
        add(sb, "scaleY", this.scaleY);
        add(sb, "alpha", this.alpha);
        add(sb, "visibility", this.visibility);
        add(sb, "interpolatedPos", this.interpolatedPos);
        if (this.widget != null) {
            for (ConstraintAnchor.Type type : ConstraintAnchor.Type.values()) {
                serializeAnchor(sb, type);
            }
        }
        if (z) {
            add(sb, "phone_orientation", phone_orientation);
            add(sb, "phone_orientation", phone_orientation);
        }
        if (this.mCustom.size() != 0) {
            sb.append("custom : {\n");
            for (String str : this.mCustom.keySet()) {
                CustomVariable customVariable = this.mCustom.get(str);
                sb.append(str);
                sb.append(": ");
                switch (customVariable.getType()) {
                    case 900:
                        sb.append(customVariable.getIntegerValue());
                        sb.append(",\n");
                        break;
                    case 901:
                    case 905:
                        sb.append(customVariable.getFloatValue());
                        sb.append(",\n");
                        break;
                    case 902:
                        sb.append("'");
                        sb.append(CustomVariable.colorString(customVariable.getIntegerValue()));
                        sb.append("',\n");
                        break;
                    case 903:
                        sb.append("'");
                        sb.append(customVariable.getStringValue());
                        sb.append("',\n");
                        break;
                    case 904:
                        sb.append("'");
                        sb.append(customVariable.getBooleanValue());
                        sb.append("',\n");
                        break;
                }
            }
            sb.append("}\n");
        }
        sb.append("}\n");
        return sb;
    }

    public void setCustomAttribute(String str, int i2, float f2) {
        boolean zContainsKey = this.mCustom.containsKey(str);
        HashMap<String, CustomVariable> map = this.mCustom;
        if (zContainsKey) {
            map.get(str).setFloatValue(f2);
        } else {
            map.put(str, new CustomVariable(str, i2, f2));
        }
    }

    public void setCustomValue(CustomAttribute customAttribute, float[] fArr) {
    }

    void setMotionAttributes(TypedBundle typedBundle) {
        this.mMotionProperties = typedBundle;
    }

    public boolean setValue(String str, CLElement cLElement) {
        switch (str.hashCode()) {
            case -1881940865:
                if (!str.equals("phone_orientation")) {
                    return false;
                }
                phone_orientation = cLElement.getFloat();
                return true;
            case -1383228885:
                if (!str.equals("bottom")) {
                    return false;
                }
                this.bottom = cLElement.getInt();
                return true;
            case -1349088399:
                if (!str.equals("custom")) {
                    return false;
                }
                parseCustom(cLElement);
                return true;
            case -1249320806:
                if (!str.equals("rotationX")) {
                    return false;
                }
                this.rotationX = cLElement.getFloat();
                return true;
            case -1249320805:
                if (!str.equals("rotationY")) {
                    return false;
                }
                this.rotationY = cLElement.getFloat();
                return true;
            case -1249320804:
                if (!str.equals("rotationZ")) {
                    return false;
                }
                this.rotationZ = cLElement.getFloat();
                return true;
            case -1225497657:
                if (!str.equals("translationX")) {
                    return false;
                }
                this.translationX = cLElement.getFloat();
                return true;
            case -1225497656:
                if (!str.equals("translationY")) {
                    return false;
                }
                this.translationY = cLElement.getFloat();
                return true;
            case -1225497655:
                if (!str.equals("translationZ")) {
                    return false;
                }
                this.translationZ = cLElement.getFloat();
                return true;
            case -987906986:
                if (!str.equals("pivotX")) {
                    return false;
                }
                this.pivotX = cLElement.getFloat();
                return true;
            case -987906985:
                if (!str.equals("pivotY")) {
                    return false;
                }
                this.pivotY = cLElement.getFloat();
                return true;
            case -908189618:
                if (!str.equals("scaleX")) {
                    return false;
                }
                this.scaleX = cLElement.getFloat();
                return true;
            case -908189617:
                if (!str.equals("scaleY")) {
                    return false;
                }
                this.scaleY = cLElement.getFloat();
                return true;
            case 115029:
                if (!str.equals("top")) {
                    return false;
                }
                this.top = cLElement.getInt();
                return true;
            case 3317767:
                if (!str.equals(TtmlNode.LEFT)) {
                    return false;
                }
                this.left = cLElement.getInt();
                return true;
            case 92909918:
                if (!str.equals("alpha")) {
                    return false;
                }
                this.alpha = cLElement.getFloat();
                return true;
            case 108511772:
                if (!str.equals(TtmlNode.RIGHT)) {
                    return false;
                }
                this.right = cLElement.getInt();
                return true;
            case 642850769:
                if (!str.equals("interpolatedPos")) {
                    return false;
                }
                this.interpolatedPos = cLElement.getFloat();
                return true;
            default:
                return false;
        }
    }

    public WidgetFrame update() {
        ConstraintWidget constraintWidget = this.widget;
        if (constraintWidget != null) {
            this.left = constraintWidget.getLeft();
            this.top = this.widget.getTop();
            this.right = this.widget.getRight();
            this.bottom = this.widget.getBottom();
            updateAttributes(this.widget.frame);
        }
        return this;
    }

    public void updateAttributes(WidgetFrame widgetFrame) {
        if (widgetFrame == null) {
            return;
        }
        this.pivotX = widgetFrame.pivotX;
        this.pivotY = widgetFrame.pivotY;
        this.rotationX = widgetFrame.rotationX;
        this.rotationY = widgetFrame.rotationY;
        this.rotationZ = widgetFrame.rotationZ;
        this.translationX = widgetFrame.translationX;
        this.translationY = widgetFrame.translationY;
        this.translationZ = widgetFrame.translationZ;
        this.scaleX = widgetFrame.scaleX;
        this.scaleY = widgetFrame.scaleY;
        this.alpha = widgetFrame.alpha;
        this.visibility = widgetFrame.visibility;
        setMotionAttributes(widgetFrame.mMotionProperties);
        this.mCustom.clear();
        for (CustomVariable customVariable : widgetFrame.mCustom.values()) {
            this.mCustom.put(customVariable.getName(), customVariable.copy());
        }
    }

    public int width() {
        return Math.max(0, this.right - this.left);
    }

    private static void add(StringBuilder sb, String str, int i2) {
        sb.append(str);
        sb.append(": ");
        sb.append(i2);
        sb.append(",\n");
    }

    public void setCustomAttribute(String str, int i2, int i3) {
        boolean zContainsKey = this.mCustom.containsKey(str);
        HashMap<String, CustomVariable> map = this.mCustom;
        if (zContainsKey) {
            map.get(str).setIntValue(i3);
        } else {
            map.put(str, new CustomVariable(str, i2, i3));
        }
    }

    public void setCustomAttribute(String str, int i2, String str2) {
        boolean zContainsKey = this.mCustom.containsKey(str);
        HashMap<String, CustomVariable> map = this.mCustom;
        if (zContainsKey) {
            map.get(str).setStringValue(str2);
        } else {
            map.put(str, new CustomVariable(str, i2, str2));
        }
    }

    public void setCustomAttribute(String str, int i2, boolean z) {
        boolean zContainsKey = this.mCustom.containsKey(str);
        HashMap<String, CustomVariable> map = this.mCustom;
        if (zContainsKey) {
            map.get(str).setBooleanValue(z);
        } else {
            map.put(str, new CustomVariable(str, i2, z));
        }
    }

    public WidgetFrame update(ConstraintWidget constraintWidget) {
        if (constraintWidget == null) {
            return this;
        }
        this.widget = constraintWidget;
        update();
        return this;
    }

    public WidgetFrame() {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.mCustom = new HashMap<>();
        this.name = null;
    }

    public WidgetFrame(ConstraintWidget constraintWidget) {
        this.widget = null;
        this.left = 0;
        this.top = 0;
        this.right = 0;
        this.bottom = 0;
        this.pivotX = Float.NaN;
        this.pivotY = Float.NaN;
        this.rotationX = Float.NaN;
        this.rotationY = Float.NaN;
        this.rotationZ = Float.NaN;
        this.translationX = Float.NaN;
        this.translationY = Float.NaN;
        this.translationZ = Float.NaN;
        this.scaleX = Float.NaN;
        this.scaleY = Float.NaN;
        this.alpha = Float.NaN;
        this.interpolatedPos = Float.NaN;
        this.visibility = 0;
        this.mCustom = new HashMap<>();
        this.name = null;
        this.widget = constraintWidget;
    }

    public StringBuilder serialize(StringBuilder sb) {
        return serialize(sb, false);
    }

    private static float interpolate(float f2, float f3, float f4, float f5) {
        boolean zIsNaN = Float.isNaN(f2);
        boolean zIsNaN2 = Float.isNaN(f3);
        if (zIsNaN && zIsNaN2) {
            return Float.NaN;
        }
        if (true == zIsNaN) {
            f2 = f4;
        }
        if (true == zIsNaN2) {
            f3 = f4;
        }
        return f2 + (f5 * (f3 - f2));
    }
}
