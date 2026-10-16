package androidx.constraintlayout.core.motion.key;

import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.utils.KeyCycleOscillator;
import androidx.constraintlayout.core.motion.utils.SplineSet;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.motion.utils.Utils;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class MotionKeyCycle extends MotionKey {
    public static final int KEY_TYPE = 4;
    static final String NAME = "KeyCycle";
    public static final int SHAPE_BOUNCE = 6;
    public static final int SHAPE_COS_WAVE = 5;
    public static final int SHAPE_REVERSE_SAW_WAVE = 4;
    public static final int SHAPE_SAW_WAVE = 3;
    public static final int SHAPE_SIN_WAVE = 0;
    public static final int SHAPE_SQUARE_WAVE = 1;
    public static final int SHAPE_TRIANGLE_WAVE = 2;
    private static final String TAG = "KeyCycle";
    public static final String WAVE_OFFSET = "waveOffset";
    public static final String WAVE_PERIOD = "wavePeriod";
    public static final String WAVE_PHASE = "wavePhase";
    public static final String WAVE_SHAPE = "waveShape";
    private String mTransitionEasing = null;
    private int mCurveFit = 0;
    private int mWaveShape = -1;
    private String mCustomWaveShape = null;
    private float mWavePeriod = Float.NaN;
    private float mWaveOffset = 0.0f;
    private float mWavePhase = 0.0f;
    private float mProgress = Float.NaN;
    private float mAlpha = Float.NaN;
    private float mElevation = Float.NaN;
    private float mRotation = Float.NaN;
    private float mTransitionPathRotate = Float.NaN;
    private float mRotationX = Float.NaN;
    private float mRotationY = Float.NaN;
    private float mScaleX = Float.NaN;
    private float mScaleY = Float.NaN;
    private float mTranslationX = Float.NaN;
    private float mTranslationY = Float.NaN;
    private float mTranslationZ = Float.NaN;

    public MotionKeyCycle() {
        this.mType = 4;
        this.mCustom = new HashMap<>();
    }

    public void addCycleValues(HashMap<String, KeyCycleOscillator> map) {
        KeyCycleOscillator keyCycleOscillator;
        KeyCycleOscillator keyCycleOscillator2;
        for (String str : map.keySet()) {
            if (str.startsWith("CUSTOM")) {
                CustomVariable customVariable = this.mCustom.get(str.substring(7));
                if (customVariable != null && customVariable.getType() == 901 && (keyCycleOscillator = map.get(str)) != null) {
                    keyCycleOscillator.setPoint(this.mFramePosition, this.mWaveShape, this.mCustomWaveShape, -1, this.mWavePeriod, this.mWaveOffset, this.mWavePhase / 360.0f, customVariable.getValueToInterpolate(), customVariable);
                }
            } else {
                float value = getValue(str);
                if (!Float.isNaN(value) && (keyCycleOscillator2 = map.get(str)) != null) {
                    keyCycleOscillator2.setPoint(this.mFramePosition, this.mWaveShape, this.mCustomWaveShape, -1, this.mWavePeriod, this.mWaveOffset, this.mWavePhase / 360.0f, value);
                }
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void addValues(HashMap<String, SplineSet> map) {
    }

    public void dump() {
        System.out.println("MotionKeyCycle{mWaveShape=" + this.mWaveShape + ", mWavePeriod=" + this.mWavePeriod + ", mWaveOffset=" + this.mWaveOffset + ", mWavePhase=" + this.mWavePhase + ", mRotation=" + this.mRotation + '}');
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    public void getAttributeNames(HashSet<String> hashSet) {
        if (!Float.isNaN(this.mAlpha)) {
            hashSet.add("alpha");
        }
        if (!Float.isNaN(this.mElevation)) {
            hashSet.add("elevation");
        }
        if (!Float.isNaN(this.mRotation)) {
            hashSet.add("rotationZ");
        }
        if (!Float.isNaN(this.mRotationX)) {
            hashSet.add("rotationX");
        }
        if (!Float.isNaN(this.mRotationY)) {
            hashSet.add("rotationY");
        }
        if (!Float.isNaN(this.mScaleX)) {
            hashSet.add("scaleX");
        }
        if (!Float.isNaN(this.mScaleY)) {
            hashSet.add("scaleY");
        }
        if (!Float.isNaN(this.mTransitionPathRotate)) {
            hashSet.add("pathRotate");
        }
        if (!Float.isNaN(this.mTranslationX)) {
            hashSet.add("translationX");
        }
        if (!Float.isNaN(this.mTranslationY)) {
            hashSet.add("translationY");
        }
        if (!Float.isNaN(this.mTranslationZ)) {
            hashSet.add("translationZ");
        }
        if (this.mCustom.size() > 0) {
            Iterator<String> it = this.mCustom.keySet().iterator();
            while (it.hasNext()) {
                hashSet.add("CUSTOM,".concat(String.valueOf(it.next())));
            }
        }
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        switch (str.hashCode()) {
            case -1581616630:
                return str.equals(TypedValues.CycleType.S_CUSTOM_WAVE_SHAPE) ? 422 : -1;
            case -1310311125:
                return str.equals("easing") ? 420 : -1;
            case -1249320806:
                return str.equals("rotationX") ? 308 : -1;
            case -1249320805:
                return str.equals("rotationY") ? 309 : -1;
            case -1249320804:
                return str.equals("rotationZ") ? 310 : -1;
            case -1225497657:
                return str.equals("translationX") ? 304 : -1;
            case -1225497656:
                return str.equals("translationY") ? 305 : -1;
            case -1225497655:
                return str.equals("translationZ") ? 306 : -1;
            case -1019779949:
                return str.equals(TypedValues.CycleType.S_WAVE_OFFSET) ? 424 : -1;
            case -1001078227:
                return str.equals("progress") ? 315 : -1;
            case -991726143:
                return str.equals(TypedValues.CycleType.S_WAVE_PERIOD) ? 423 : -1;
            case -987906986:
                return str.equals("pivotX") ? 313 : -1;
            case -987906985:
                return str.equals("pivotY") ? 314 : -1;
            case -908189618:
                return str.equals("scaleX") ? 311 : -1;
            case -908189617:
                return str.equals("scaleY") ? 312 : -1;
            case 92909918:
                return str.equals("alpha") ? 403 : -1;
            case 106629499:
                return str.equals(TypedValues.CycleType.S_WAVE_PHASE) ? 425 : -1;
            case 579057826:
                return str.equals("curveFit") ? 401 : -1;
            case 803192288:
                return str.equals("pathRotate") ? 416 : -1;
            case 1532805160:
                return str.equals("waveShape") ? 421 : -1;
            case 1941332754:
                return str.equals("visibility") ? 402 : -1;
            default:
                return -1;
        }
    }

    public float getValue(String str) {
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    return this.mRotationX;
                }
                return Float.NaN;
            case -1249320805:
                if (str.equals("rotationY")) {
                    return this.mRotationY;
                }
                return Float.NaN;
            case -1249320804:
                if (str.equals("rotationZ")) {
                    return this.mRotation;
                }
                return Float.NaN;
            case -1225497657:
                if (str.equals("translationX")) {
                    return this.mTranslationX;
                }
                return Float.NaN;
            case -1225497656:
                if (str.equals("translationY")) {
                    return this.mTranslationY;
                }
                return Float.NaN;
            case -1225497655:
                if (str.equals("translationZ")) {
                    return this.mTranslationZ;
                }
                return Float.NaN;
            case -1019779949:
                if (str.equals(TypedValues.CycleType.S_WAVE_OFFSET)) {
                    return this.mWaveOffset;
                }
                return Float.NaN;
            case -1001078227:
                if (str.equals("progress")) {
                    return this.mProgress;
                }
                return Float.NaN;
            case -908189618:
                if (str.equals("scaleX")) {
                    return this.mScaleX;
                }
                return Float.NaN;
            case -908189617:
                if (str.equals("scaleY")) {
                    return this.mScaleY;
                }
                return Float.NaN;
            case -4379043:
                if (str.equals("elevation")) {
                    return this.mElevation;
                }
                return Float.NaN;
            case 92909918:
                if (str.equals("alpha")) {
                    return this.mAlpha;
                }
                return Float.NaN;
            case 106629499:
                if (str.equals(TypedValues.CycleType.S_WAVE_PHASE)) {
                    return this.mWavePhase;
                }
                return Float.NaN;
            case 803192288:
                if (str.equals("pathRotate")) {
                    return this.mTransitionPathRotate;
                }
                return Float.NaN;
            default:
                return Float.NaN;
        }
    }

    public void printAttributes() {
        HashSet<String> hashSet = new HashSet<>();
        getAttributeNames(hashSet);
        Utils.log(" ------------- " + this.mFramePosition + " -------------");
        Utils.log("MotionKeyCycle{Shape=" + this.mWaveShape + ", Period=" + this.mWavePeriod + ", Offset=" + this.mWaveOffset + ", Phase=" + this.mWavePhase + '}');
        String[] strArr = (String[]) hashSet.toArray(new String[0]);
        for (int i2 = 0; i2 < strArr.length; i2++) {
            Utils.log(strArr[i2] + ":" + getValue(strArr[i2]));
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i2, float f2) {
        if (i2 == 315) {
            this.mProgress = f2;
            return true;
        }
        if (i2 == 403) {
            this.mAlpha = f2;
            return true;
        }
        if (i2 == 416) {
            this.mTransitionPathRotate = f2;
            return true;
        }
        switch (i2) {
            case 304:
                this.mTranslationX = f2;
                return true;
            case 305:
                this.mTranslationY = f2;
                return true;
            case 306:
                this.mTranslationZ = f2;
                return true;
            case 307:
                this.mElevation = f2;
                return true;
            case 308:
                this.mRotationX = f2;
                return true;
            case 309:
                this.mRotationY = f2;
                return true;
            case 310:
                this.mRotation = f2;
                return true;
            case 311:
                this.mScaleX = f2;
                return true;
            case 312:
                this.mScaleY = f2;
                return true;
            default:
                switch (i2) {
                    case 423:
                        this.mWavePeriod = f2;
                        return true;
                    case 424:
                        this.mWaveOffset = f2;
                        return true;
                    case 425:
                        this.mWavePhase = f2;
                        return true;
                    default:
                        return false;
                }
        }
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey
    /* renamed from: clone */
    public MotionKey mo11646clone() {
        return null;
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i2, int i3) {
        if (i2 == 401) {
            this.mCurveFit = i3;
            return true;
        }
        if (i2 == 421) {
            this.mWaveShape = i3;
            return true;
        }
        if (setValue(i2, i3)) {
            return true;
        }
        return super.setValue(i2, i3);
    }

    @Override // androidx.constraintlayout.core.motion.key.MotionKey, androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i2, String str) {
        if (i2 == 420) {
            this.mTransitionEasing = str;
            return true;
        }
        if (i2 != 422) {
            return super.setValue(i2, str);
        }
        this.mCustomWaveShape = str;
        return true;
    }
}
