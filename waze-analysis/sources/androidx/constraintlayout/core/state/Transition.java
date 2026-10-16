package androidx.constraintlayout.core.state;

import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.CustomVariable;
import androidx.constraintlayout.core.motion.Motion;
import androidx.constraintlayout.core.motion.MotionWidget;
import androidx.constraintlayout.core.motion.key.MotionKeyAttributes;
import androidx.constraintlayout.core.motion.key.MotionKeyCycle;
import androidx.constraintlayout.core.motion.key.MotionKeyPosition;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.core.motion.utils.SpringStopEngine;
import androidx.constraintlayout.core.motion.utils.StopEngine;
import androidx.constraintlayout.core.motion.utils.StopLogicEngine;
import androidx.constraintlayout.core.motion.utils.TypedBundle;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.ConstraintWidgetContainer;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.strings.DisplayStrings;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class Transition implements TypedValues {
    static final int ANTICIPATE = 6;
    static final int BOUNCE = 4;
    private static final boolean DEBUG = false;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    public static final int END = 1;
    public static final int INTERPOLATED = 2;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    static final int LINEAR = 3;
    static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    public static final int START = 0;
    int mParentEndHeight;
    int mParentEndWidth;
    int mParentInterpolateHeight;
    int mParentInterpolatedWidth;
    int mParentStartHeight;
    int mParentStartWidth;
    final CorePixelDp mToPixel;
    boolean mWrap;
    private HashMap<Integer, HashMap<String, KeyPosition>> mKeyPositions = new HashMap<>();
    private HashMap<String, WidgetState> mState = new HashMap<>();
    private TypedBundle mBundle = new TypedBundle();
    private int mDefaultInterpolator = 0;
    private String mDefaultInterpolatorString = null;
    private Easing mEasing = null;
    private int mAutoTransition = 0;
    private int mDuration = DisplayStrings.DS_NIGHT;
    private float mStagger = 0.0f;
    private OnSwipe mOnSwipe = null;

    /* compiled from: WazeSource */
    class KeyPosition {
        int mFrame;
        String mTarget;
        int mType;
        float mX;
        float mY;

        KeyPosition(String str, int i2, int i3, float f2, float f3) {
            this.mTarget = str;
            this.mFrame = i2;
            this.mType = i3;
            this.mX = f2;
            this.mY = f3;
        }
    }

    /* compiled from: WazeSource */
    class OnSwipe {
        public static final int ANCHOR_SIDE_BOTTOM = 3;
        public static final int ANCHOR_SIDE_END = 6;
        public static final int ANCHOR_SIDE_LEFT = 1;
        public static final int ANCHOR_SIDE_MIDDLE = 4;
        public static final int ANCHOR_SIDE_RIGHT = 2;
        public static final int ANCHOR_SIDE_START = 5;
        public static final int ANCHOR_SIDE_TOP = 0;
        public static final int BOUNDARY_BOUNCE_BOTH = 3;
        public static final int BOUNDARY_BOUNCE_END = 2;
        public static final int BOUNDARY_BOUNCE_START = 1;
        public static final int BOUNDARY_OVERSHOOT = 0;
        public static final int DRAG_ANTICLOCKWISE = 7;
        public static final int DRAG_CLOCKWISE = 6;
        public static final int DRAG_DOWN = 1;
        public static final int DRAG_END = 5;
        public static final int DRAG_LEFT = 2;
        public static final int DRAG_RIGHT = 3;
        public static final int DRAG_START = 4;
        public static final int DRAG_UP = 0;
        public static final int MODE_CONTINUOUS_VELOCITY = 0;
        public static final int MODE_SPRING = 1;
        public static final int ON_UP_AUTOCOMPLETE = 0;
        public static final int ON_UP_AUTOCOMPLETE_TO_END = 2;
        public static final int ON_UP_AUTOCOMPLETE_TO_START = 1;
        public static final int ON_UP_DECELERATE = 4;
        public static final int ON_UP_DECELERATE_AND_COMPLETE = 5;
        public static final int ON_UP_NEVER_COMPLETE_TO_END = 7;
        public static final int ON_UP_NEVER_COMPLETE_TO_START = 6;
        public static final int ON_UP_STOP = 3;
        String mAnchorId;
        private int mAnchorSide;
        private StopEngine mEngine;
        String mLimitBoundsTo;
        private String mRotationCenterId;
        private long mStart;
        public static final String[] SIDES = {"top", TtmlNode.LEFT, TtmlNode.RIGHT, "bottom", "middle", TtmlNode.START, TtmlNode.END};
        private static final float[][] TOUCH_SIDES = {new float[]{0.5f, 0.0f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}, new float[]{0.5f, 1.0f}, new float[]{0.5f, 0.5f}, new float[]{0.0f, 0.5f}, new float[]{1.0f, 0.5f}};
        public static final String[] DIRECTIONS = {"up", "down", TtmlNode.LEFT, TtmlNode.RIGHT, TtmlNode.START, TtmlNode.END, "clockwise", "anticlockwise"};
        public static final String[] MODE = {"velocity", "spring"};
        public static final String[] TOUCH_UP = {"autocomplete", "toStart", "toEnd", "stop", "decelerate", "decelerateComplete", "neverCompleteStart", "neverCompleteEnd"};
        public static final String[] BOUNDARY = {"overshoot", "bounceStart", "bounceEnd", "bounceBoth"};
        private static final float[][] TOUCH_DIRECTION = {new float[]{0.0f, -1.0f}, new float[]{0.0f, 1.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}, new float[]{-1.0f, 0.0f}, new float[]{1.0f, 0.0f}};
        private boolean mDragVertical = true;
        private int mDragDirection = 0;
        private float mDragScale = 1.0f;
        private float mDragThreshold = 10.0f;
        private int mAutoCompleteMode = 0;
        private float mMaxVelocity = 4.0f;
        private float mMaxAcceleration = 1.2f;
        private int mOnTouchUp = 0;
        private float mSpringMass = 1.0f;
        private float mSpringStiffness = 400.0f;
        private float mSpringDamping = 10.0f;
        private float mSpringStopThreshold = 0.01f;
        private float mDestination = 0.0f;
        private int mSpringBoundary = 0;

        OnSwipe() {
        }

        void config(float f2, float f3, long j2, float f4) {
            SpringStopEngine springStopEngine;
            StopLogicEngine stopLogicEngine;
            StopLogicEngine.Decelerate decelerate;
            this.mStart = j2;
            float fAbs = Math.abs(f3);
            float f5 = this.mMaxVelocity;
            if (fAbs > f5) {
                f3 = Math.signum(f3) * f5;
            }
            float f6 = f3;
            float destinationPosition = getDestinationPosition(f2, f6, f4);
            this.mDestination = destinationPosition;
            if (destinationPosition == f2) {
                this.mEngine = null;
                return;
            }
            if (this.mOnTouchUp == 4 && this.mAutoCompleteMode == 0) {
                StopEngine stopEngine = this.mEngine;
                if (stopEngine instanceof StopLogicEngine.Decelerate) {
                    decelerate = (StopLogicEngine.Decelerate) stopEngine;
                } else {
                    decelerate = new StopLogicEngine.Decelerate();
                    this.mEngine = decelerate;
                }
                decelerate.config(f2, this.mDestination, f6);
                return;
            }
            int i2 = this.mAutoCompleteMode;
            StopEngine stopEngine2 = this.mEngine;
            if (i2 == 0) {
                if (stopEngine2 instanceof StopLogicEngine) {
                    stopLogicEngine = (StopLogicEngine) stopEngine2;
                } else {
                    stopLogicEngine = new StopLogicEngine();
                    this.mEngine = stopLogicEngine;
                }
                stopLogicEngine.config(f2, this.mDestination, f6, f4, this.mMaxAcceleration, this.mMaxVelocity);
                return;
            }
            if (stopEngine2 instanceof SpringStopEngine) {
                springStopEngine = (SpringStopEngine) stopEngine2;
            } else {
                springStopEngine = new SpringStopEngine();
                this.mEngine = springStopEngine;
            }
            springStopEngine.springConfig(f2, this.mDestination, f6, this.mSpringMass, this.mSpringStiffness, this.mSpringDamping, this.mSpringStopThreshold, this.mSpringBoundary);
        }

        /* JADX WARN: Removed duplicated region for block: B:29:0x004a A[RETURN] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        float getDestinationPosition(float r5, float r6, float r7) {
            /*
                r4 = this;
                float r7 = java.lang.Math.abs(r6)
                r0 = 1056964608(0x3f000000, float:0.5)
                float r7 = r7 * r0
                float r7 = r7 * r6
                float r6 = r4.mMaxAcceleration
                float r7 = r7 / r6
                int r4 = r4.mOnTouchUp
                float r7 = r7 + r5
                r6 = 0
                r1 = 1065353216(0x3f800000, float:1.0)
                switch(r4) {
                    case 1: goto L45;
                    case 2: goto L3f;
                    case 3: goto L3c;
                    case 4: goto L33;
                    case 5: goto L1e;
                    case 6: goto L1d;
                    case 7: goto L1c;
                    default: goto L14;
                }
            L14:
                double r4 = (double) r7
                r2 = 4602678819172646912(0x3fe0000000000000, double:0.5)
                int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                if (r4 <= 0) goto L4a
                return r1
            L1c:
                return r6
            L1d:
                return r1
            L1e:
                r4 = 1045220557(0x3e4ccccd, float:0.2)
                int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r4 <= 0) goto L2d
                r4 = 1061997773(0x3f4ccccd, float:0.8)
                int r4 = (r7 > r4 ? 1 : (r7 == r4 ? 0 : -1))
                if (r4 >= 0) goto L2d
                return r7
            L2d:
                int r4 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
                if (r4 <= 0) goto L32
                return r1
            L32:
                return r6
            L33:
                float r4 = java.lang.Math.min(r1, r7)
                float r4 = java.lang.Math.max(r6, r4)
                return r4
            L3c:
                r4 = 2143289344(0x7fc00000, float:NaN)
                return r4
            L3f:
                int r4 = (r5 > r6 ? 1 : (r5 == r6 ? 0 : -1))
                if (r4 > 0) goto L44
                return r6
            L44:
                return r1
            L45:
                int r4 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
                if (r4 < 0) goto L4a
                return r1
            L4a:
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.state.Transition.OnSwipe.getDestinationPosition(float, float, float):float");
        }

        float[] getDirection() {
            return TOUCH_DIRECTION[this.mDragDirection];
        }

        float getScale() {
            return this.mDragScale;
        }

        float[] getSide() {
            return TOUCH_SIDES[this.mAnchorSide];
        }

        public float getTouchUpProgress(long j2) {
            return this.mEngine.isStopped() ? this.mDestination : this.mEngine.getInterpolation((j2 - this.mStart) * 1.0E-9f);
        }

        public boolean isNotDone(float f2) {
            StopEngine stopEngine;
            return (this.mOnTouchUp == 3 || (stopEngine = this.mEngine) == null || stopEngine.isStopped()) ? false : true;
        }

        public void printInfo() {
            if (this.mAutoCompleteMode == 0) {
                System.out.println("velocity = " + this.mEngine.getVelocity());
                System.out.println("mMaxAcceleration = " + this.mMaxAcceleration);
                System.out.println("mMaxVelocity = " + this.mMaxVelocity);
                return;
            }
            System.out.println("mSpringMass          = " + this.mSpringMass);
            System.out.println("mSpringStiffness     = " + this.mSpringStiffness);
            System.out.println("mSpringDamping       = " + this.mSpringDamping);
            System.out.println("mSpringStopThreshold = " + this.mSpringStopThreshold);
            System.out.println("mSpringBoundary      = " + this.mSpringBoundary);
        }

        void setAnchorId(String str) {
            this.mAnchorId = str;
        }

        void setAnchorSide(int i2) {
            this.mAnchorSide = i2;
        }

        void setAutoCompleteMode(int i2) {
            this.mAutoCompleteMode = i2;
        }

        void setDragDirection(int i2) {
            this.mDragDirection = i2;
            this.mDragVertical = i2 < 2;
        }

        void setDragScale(float f2) {
            if (Float.isNaN(f2)) {
                return;
            }
            this.mDragScale = f2;
        }

        void setDragThreshold(float f2) {
            if (Float.isNaN(f2)) {
                return;
            }
            this.mDragThreshold = f2;
        }

        void setLimitBoundsTo(String str) {
            this.mLimitBoundsTo = str;
        }

        void setMaxAcceleration(float f2) {
            if (Float.isNaN(f2)) {
                return;
            }
            this.mMaxAcceleration = f2;
        }

        void setMaxVelocity(float f2) {
            if (Float.isNaN(f2)) {
                return;
            }
            this.mMaxVelocity = f2;
        }

        void setOnTouchUp(int i2) {
            this.mOnTouchUp = i2;
        }

        void setRotationCenterId(String str) {
            this.mRotationCenterId = str;
        }

        void setSpringBoundary(int i2) {
            this.mSpringBoundary = i2;
        }

        void setSpringDamping(float f2) {
            if (Float.isNaN(f2)) {
                return;
            }
            this.mSpringDamping = f2;
        }

        void setSpringMass(float f2) {
            if (Float.isNaN(f2)) {
                return;
            }
            this.mSpringMass = f2;
        }

        void setSpringStiffness(float f2) {
            if (Float.isNaN(f2)) {
                return;
            }
            this.mSpringStiffness = f2;
        }

        void setSpringStopThreshold(float f2) {
            if (Float.isNaN(f2)) {
                return;
            }
            this.mSpringStopThreshold = f2;
        }
    }

    public Transition(CorePixelDp corePixelDp) {
        this.mToPixel = corePixelDp;
    }

    private void calculateParentDimensions(float f2) {
        this.mParentInterpolatedWidth = (int) (this.mParentStartWidth + 0.5f + ((this.mParentEndWidth - r0) * f2));
        this.mParentInterpolateHeight = (int) (this.mParentStartHeight + 0.5f + ((this.mParentEndHeight - r0) * f2));
    }

    public static Interpolator getInterpolator(int i2, final String str) {
        switch (i2) {
            case -1:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda0
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f2) {
                        return Transition.lambda$getInterpolator$0(str, f2);
                    }
                };
            case 0:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda1
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f2) {
                        return Transition.lambda$getInterpolator$1(f2);
                    }
                };
            case 1:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda2
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f2) {
                        return Transition.lambda$getInterpolator$2(f2);
                    }
                };
            case 2:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda3
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f2) {
                        return Transition.lambda$getInterpolator$3(f2);
                    }
                };
            case 3:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda4
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f2) {
                        return Transition.lambda$getInterpolator$4(f2);
                    }
                };
            case 4:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda7
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f2) {
                        return Transition.lambda$getInterpolator$7(f2);
                    }
                };
            case 5:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda6
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f2) {
                        return Transition.lambda$getInterpolator$6(f2);
                    }
                };
            case 6:
                return new Interpolator() { // from class: androidx.constraintlayout.core.state.Transition$$ExternalSyntheticLambda5
                    @Override // androidx.constraintlayout.core.state.Interpolator
                    public final float getInterpolation(float f2) {
                        return Transition.lambda$getInterpolator$5(f2);
                    }
                };
            default:
                return null;
        }
    }

    static /* synthetic */ float lambda$getInterpolator$0(String str, float f2) {
        return (float) Easing.getInterpolator(str).get(f2);
    }

    static /* synthetic */ float lambda$getInterpolator$1(float f2) {
        return (float) Easing.getInterpolator("standard").get(f2);
    }

    static /* synthetic */ float lambda$getInterpolator$2(float f2) {
        return (float) Easing.getInterpolator("accelerate").get(f2);
    }

    static /* synthetic */ float lambda$getInterpolator$3(float f2) {
        return (float) Easing.getInterpolator("decelerate").get(f2);
    }

    static /* synthetic */ float lambda$getInterpolator$4(float f2) {
        return (float) Easing.getInterpolator("linear").get(f2);
    }

    static /* synthetic */ float lambda$getInterpolator$5(float f2) {
        return (float) Easing.getInterpolator("anticipate").get(f2);
    }

    static /* synthetic */ float lambda$getInterpolator$6(float f2) {
        return (float) Easing.getInterpolator("overshoot").get(f2);
    }

    static /* synthetic */ float lambda$getInterpolator$7(float f2) {
        return (float) Easing.getInterpolator("spline(0.0, 0.2, 0.4, 0.6, 0.8 ,1.0, 0.8, 1.0, 0.9, 1.0)").get(f2);
    }

    public void addCustomColor(int i2, String str, String str2, int i3) {
        getWidgetState(str, null, i2).getFrame(i2).addCustomColor(str2, i3);
    }

    public void addCustomFloat(int i2, String str, String str2, float f2) {
        getWidgetState(str, null, i2).getFrame(i2).addCustomFloat(str2, f2);
    }

    public void addKeyAttribute(String str, TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyAttribute(typedBundle);
    }

    public void addKeyCycle(String str, TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyCycle(typedBundle);
    }

    public void addKeyPosition(String str, int i2, int i3, float f2, float f3) {
        TypedBundle typedBundle = new TypedBundle();
        typedBundle.add(510, 2);
        typedBundle.add(100, i2);
        typedBundle.add(506, f2);
        typedBundle.add(507, f3);
        getWidgetState(str, null, 0).setKeyPosition(typedBundle);
        KeyPosition keyPosition = new KeyPosition(str, i2, i3, f2, f3);
        HashMap<Integer, HashMap<String, KeyPosition>> map = this.mKeyPositions;
        Integer numValueOf = Integer.valueOf(i2);
        HashMap<String, KeyPosition> map2 = map.get(numValueOf);
        if (map2 == null) {
            map2 = new HashMap<>();
            this.mKeyPositions.put(numValueOf, map2);
        }
        map2.put(str, keyPosition);
    }

    public void calcStagger() {
        float fMin;
        float fMax;
        float f2 = this.mStagger;
        if (f2 == 0.0f) {
            return;
        }
        double d2 = f2;
        float fAbs = Math.abs(f2);
        Iterator<String> it = this.mState.keySet().iterator();
        do {
            fMin = Float.MAX_VALUE;
            fMax = -3.4028235E38f;
            if (!it.hasNext()) {
                Iterator<String> it2 = this.mState.keySet().iterator();
                while (it2.hasNext()) {
                    Motion motion = this.mState.get(it2.next()).mMotionControl;
                    float finalX = motion.getFinalX() + motion.getFinalY();
                    fMin = Math.min(fMin, finalX);
                    fMax = Math.max(fMax, finalX);
                }
                Iterator<String> it3 = this.mState.keySet().iterator();
                while (it3.hasNext()) {
                    float f3 = 1.0f - fAbs;
                    Motion motion2 = this.mState.get(it3.next()).mMotionControl;
                    float finalX2 = motion2.getFinalX() + motion2.getFinalY();
                    float f4 = fMax - fMin;
                    float f5 = fAbs - (((finalX2 - fMin) * fAbs) / f4);
                    if (d2 < AudioStats.AUDIO_AMPLITUDE_NONE) {
                        f5 = fAbs - (((fMax - finalX2) / f4) * fAbs);
                    }
                    motion2.setStaggerScale(1.0f / f3);
                    motion2.setStaggerOffset(f5);
                }
                return;
            }
        } while (Float.isNaN(this.mState.get(it.next()).mMotionControl.getMotionStagger()));
        Iterator<String> it4 = this.mState.keySet().iterator();
        while (it4.hasNext()) {
            float motionStagger = this.mState.get(it4.next()).mMotionControl.getMotionStagger();
            if (!Float.isNaN(motionStagger)) {
                fMin = Math.min(fMin, motionStagger);
                fMax = Math.max(fMax, motionStagger);
            }
        }
        Iterator<String> it5 = this.mState.keySet().iterator();
        while (it5.hasNext()) {
            Motion motion3 = this.mState.get(it5.next()).mMotionControl;
            float motionStagger2 = motion3.getMotionStagger();
            if (!Float.isNaN(motionStagger2)) {
                float f6 = 1.0f / (1.0f - fAbs);
                float f7 = fMax - fMin;
                float f8 = fAbs - (((motionStagger2 - fMin) * fAbs) / f7);
                if (d2 < AudioStats.AUDIO_AMPLITUDE_NONE) {
                    f8 = fAbs - (((fMax - motionStagger2) / f7) * fAbs);
                }
                motion3.setStaggerScale(f6);
                motion3.setStaggerOffset(f8);
            }
        }
    }

    public void clear() {
        this.mState.clear();
    }

    public boolean contains(String str) {
        return this.mState.containsKey(str);
    }

    OnSwipe createOnSwipe() {
        OnSwipe onSwipe = new OnSwipe();
        this.mOnSwipe = onSwipe;
        return onSwipe;
    }

    public float dragToProgress(float f2, int i2, int i3, float f3, float f4) {
        float fAbs;
        float scale;
        Iterator<WidgetState> it = this.mState.values().iterator();
        WidgetState next = it.hasNext() ? it.next() : null;
        OnSwipe onSwipe = this.mOnSwipe;
        if (onSwipe == null || next == null) {
            if (next != null) {
                return (-f4) / next.mParentHeight;
            }
            return 1.0f;
        }
        String str = onSwipe.mAnchorId;
        if (str == null) {
            float[] direction = onSwipe.getDirection();
            float f5 = next.mParentHeight;
            float f6 = direction[0];
            fAbs = f6 != 0.0f ? (f3 * Math.abs(f6)) / f5 : (f4 * Math.abs(direction[1])) / f5;
            scale = this.mOnSwipe.getScale();
        } else {
            WidgetState widgetState = this.mState.get(str);
            float[] direction2 = this.mOnSwipe.getDirection();
            float[] side = this.mOnSwipe.getSide();
            float[] fArr = new float[2];
            widgetState.interpolate(i2, i3, f2, this);
            widgetState.mMotionControl.getDpDt(f2, side[0], side[1], fArr);
            float f7 = direction2[0];
            fAbs = f7 != 0.0f ? (f3 * Math.abs(f7)) / fArr[0] : (f4 * Math.abs(direction2[1])) / fArr[1];
            scale = this.mOnSwipe.getScale();
        }
        return fAbs * scale;
    }

    public void fillKeyPositions(WidgetFrame widgetFrame, float[] fArr, float[] fArr2, float[] fArr3) {
        KeyPosition keyPosition;
        int i2 = 0;
        for (int i3 = 0; i3 <= 100; i3++) {
            HashMap<String, KeyPosition> map = this.mKeyPositions.get(Integer.valueOf(i3));
            if (map != null && (keyPosition = map.get(widgetFrame.widget.stringId)) != null) {
                fArr[i2] = keyPosition.mX;
                fArr2[i2] = keyPosition.mY;
                fArr3[i2] = keyPosition.mFrame;
                i2++;
            }
        }
    }

    public KeyPosition findNextPosition(String str, int i2) {
        KeyPosition keyPosition;
        while (i2 <= 100) {
            HashMap<String, KeyPosition> map = this.mKeyPositions.get(Integer.valueOf(i2));
            if (map != null && (keyPosition = map.get(str)) != null) {
                return keyPosition;
            }
            i2++;
        }
        return null;
    }

    public KeyPosition findPreviousPosition(String str, int i2) {
        KeyPosition keyPosition;
        while (i2 >= 0) {
            HashMap<String, KeyPosition> map = this.mKeyPositions.get(Integer.valueOf(i2));
            if (map != null && (keyPosition = map.get(str)) != null) {
                return keyPosition;
            }
            i2--;
        }
        return null;
    }

    public int getAutoTransition() {
        return this.mAutoTransition;
    }

    public WidgetFrame getEnd(String str) {
        WidgetState widgetState = this.mState.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.mEnd;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public int getId(String str) {
        return 0;
    }

    public WidgetFrame getInterpolated(String str) {
        WidgetState widgetState = this.mState.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.mInterpolated;
    }

    public int getInterpolatedHeight() {
        return this.mParentInterpolateHeight;
    }

    public int getInterpolatedWidth() {
        return this.mParentInterpolatedWidth;
    }

    public int getKeyFrames(String str, float[] fArr, int[] iArr, int[] iArr2) {
        return this.mState.get(str).mMotionControl.buildKeyFrames(fArr, iArr, iArr2);
    }

    public Motion getMotion(String str) {
        return getWidgetState(str, null, 0).mMotionControl;
    }

    public int getNumberKeyPositions(WidgetFrame widgetFrame) {
        int i2 = 0;
        for (int i3 = 0; i3 <= 100; i3++) {
            HashMap<String, KeyPosition> map = this.mKeyPositions.get(Integer.valueOf(i3));
            if (map != null && map.get(widgetFrame.widget.stringId) != null) {
                i2++;
            }
        }
        return i2;
    }

    public float[] getPath(String str) {
        WidgetState widgetState = this.mState.get(str);
        float[] fArr = new float[124];
        widgetState.mMotionControl.buildPath(fArr, 62);
        return fArr;
    }

    public WidgetFrame getStart(String str) {
        WidgetState widgetState = this.mState.get(str);
        if (widgetState == null) {
            return null;
        }
        return widgetState.mStart;
    }

    public float getTouchUpProgress(long j2) {
        OnSwipe onSwipe = this.mOnSwipe;
        if (onSwipe != null) {
            return onSwipe.getTouchUpProgress(j2);
        }
        return 0.0f;
    }

    public WidgetState getWidgetState(String str, ConstraintWidget constraintWidget, int i2) {
        WidgetState widgetState = this.mState.get(str);
        if (widgetState == null) {
            widgetState = new WidgetState();
            this.mBundle.applyDelta(widgetState.mMotionControl);
            widgetState.mMotionWidgetStart.updateMotion(widgetState.mMotionControl);
            this.mState.put(str, widgetState);
            if (constraintWidget == null) {
                return widgetState;
            }
            widgetState.update(constraintWidget, i2);
        }
        return widgetState;
    }

    public boolean hasOnSwipe() {
        return this.mOnSwipe != null;
    }

    public boolean hasPositionKeyframes() {
        return this.mKeyPositions.size() > 0;
    }

    public void interpolate(int i2, int i3, float f2) {
        if (this.mWrap) {
            calculateParentDimensions(f2);
        }
        Easing easing = this.mEasing;
        if (easing != null) {
            f2 = (float) easing.get(f2);
        }
        Iterator<String> it = this.mState.keySet().iterator();
        while (it.hasNext()) {
            this.mState.get(it.next()).interpolate(i2, i3, f2, this);
        }
    }

    public boolean isEmpty() {
        return this.mState.isEmpty();
    }

    public boolean isFirstDownAccepted(float f2, float f3) {
        OnSwipe onSwipe = this.mOnSwipe;
        if (onSwipe == null) {
            return false;
        }
        String str = onSwipe.mLimitBoundsTo;
        if (str == null) {
            return true;
        }
        WidgetState widgetState = this.mState.get(str);
        if (widgetState == null) {
            System.err.println("mLimitBoundsTo target is null");
            return false;
        }
        WidgetFrame frame = widgetState.getFrame(2);
        return f2 >= ((float) frame.left) && f2 < ((float) frame.right) && f3 >= ((float) frame.top) && f3 < ((float) frame.bottom);
    }

    public boolean isTouchNotDone(float f2) {
        return this.mOnSwipe.isNotDone(f2);
    }

    void resetProperties() {
        this.mOnSwipe = null;
        this.mBundle.clear();
    }

    public void setTouchUp(float f2, long j2, float f3, float f4) {
        OnSwipe onSwipe = this.mOnSwipe;
        if (onSwipe != null) {
            WidgetState widgetState = this.mState.get(onSwipe.mAnchorId);
            float[] fArr = new float[2];
            float[] direction = this.mOnSwipe.getDirection();
            float[] side = this.mOnSwipe.getSide();
            widgetState.mMotionControl.getDpDt(f2, side[0], side[1], fArr);
            if (Math.abs((direction[0] * fArr[0]) + (direction[1] * fArr[1])) < 0.01d) {
                fArr[0] = 0.01f;
                fArr[1] = 0.01f;
            }
            this.mOnSwipe.config(f2, (direction[0] != 0.0f ? f3 / fArr[0] : f4 / fArr[1]) * this.mOnSwipe.getScale(), j2, this.mDuration * 0.001f);
        }
    }

    public void setTransitionProperties(TypedBundle typedBundle) {
        typedBundle.applyDelta(this.mBundle);
        typedBundle.applyDelta(this);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i2, String str) {
        if (i2 != 705) {
            return false;
        }
        this.mDefaultInterpolatorString = str;
        this.mEasing = Easing.getInterpolator(str);
        return false;
    }

    public void updateFrom(ConstraintWidgetContainer constraintWidgetContainer, int i2) {
        ConstraintWidget.DimensionBehaviour dimensionBehaviour = constraintWidgetContainer.mListDimensionBehaviors[0];
        ConstraintWidget.DimensionBehaviour dimensionBehaviour2 = ConstraintWidget.DimensionBehaviour.WRAP_CONTENT;
        boolean z = dimensionBehaviour == dimensionBehaviour2;
        this.mWrap = z;
        this.mWrap = z | (constraintWidgetContainer.mListDimensionBehaviors[1] == dimensionBehaviour2);
        if (i2 == 0) {
            int width = constraintWidgetContainer.getWidth();
            this.mParentStartWidth = width;
            this.mParentInterpolatedWidth = width;
            int height = constraintWidgetContainer.getHeight();
            this.mParentStartHeight = height;
            this.mParentInterpolateHeight = height;
        } else {
            this.mParentEndWidth = constraintWidgetContainer.getWidth();
            this.mParentEndHeight = constraintWidgetContainer.getHeight();
        }
        ArrayList<ConstraintWidget> children = constraintWidgetContainer.getChildren();
        int size = children.size();
        WidgetState[] widgetStateArr = new WidgetState[size];
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintWidget constraintWidget = children.get(i3);
            WidgetState widgetState = getWidgetState(constraintWidget.stringId, null, i2);
            widgetStateArr[i3] = widgetState;
            widgetState.update(constraintWidget, i2);
            String pathRelativeId = widgetState.getPathRelativeId();
            if (pathRelativeId != null) {
                widgetState.setPathRelative(getWidgetState(pathRelativeId, null, i2));
            }
        }
        calcStagger();
    }

    public void addKeyAttribute(String str, TypedBundle typedBundle, CustomVariable[] customVariableArr) {
        getWidgetState(str, null, 0).setKeyAttribute(typedBundle, customVariableArr);
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i2, int i3) {
        return false;
    }

    public WidgetFrame getEnd(ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 1).mEnd;
    }

    public WidgetFrame getInterpolated(ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 2).mInterpolated;
    }

    public WidgetFrame getStart(ConstraintWidget constraintWidget) {
        return getWidgetState(constraintWidget.stringId, null, 0).mStart;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i2, boolean z) {
        return false;
    }

    @Override // androidx.constraintlayout.core.motion.utils.TypedValues
    public boolean setValue(int i2, float f2) {
        if (i2 != 706) {
            return false;
        }
        this.mStagger = f2;
        return false;
    }

    /* compiled from: WazeSource */
    public class WidgetState {
        Motion mMotionControl;
        boolean mNeedSetup = true;
        KeyCache mKeyCache = new KeyCache();
        int mParentHeight = -1;
        int mParentWidth = -1;
        WidgetFrame mStart = new WidgetFrame();
        WidgetFrame mEnd = new WidgetFrame();
        WidgetFrame mInterpolated = new WidgetFrame();
        MotionWidget mMotionWidgetStart = new MotionWidget(this.mStart);
        MotionWidget mMotionWidgetEnd = new MotionWidget(this.mEnd);
        MotionWidget mMotionWidgetInterpolated = new MotionWidget(this.mInterpolated);

        public WidgetState() {
            Motion motion = new Motion(this.mMotionWidgetStart);
            this.mMotionControl = motion;
            motion.setStart(this.mMotionWidgetStart);
            this.mMotionControl.setEnd(this.mMotionWidgetEnd);
        }

        public WidgetFrame getFrame(int i2) {
            return i2 == 0 ? this.mStart : i2 == 1 ? this.mEnd : this.mInterpolated;
        }

        String getPathRelativeId() {
            return this.mMotionControl.getAnimateRelativeTo();
        }

        public void interpolate(int i2, int i3, float f2, Transition transition) {
            this.mParentHeight = i3;
            this.mParentWidth = i2;
            if (this.mNeedSetup) {
                this.mMotionControl.setup(i2, i3, 1.0f, System.nanoTime());
                this.mNeedSetup = false;
            }
            WidgetFrame.interpolate(i2, i3, this.mInterpolated, this.mStart, this.mEnd, transition, f2);
            this.mInterpolated.interpolatedPos = f2;
            this.mMotionControl.interpolate(this.mMotionWidgetInterpolated, f2, System.nanoTime(), this.mKeyCache);
        }

        public void setKeyAttribute(TypedBundle typedBundle, CustomVariable[] customVariableArr) {
            MotionKeyAttributes motionKeyAttributes = new MotionKeyAttributes();
            typedBundle.applyDelta(motionKeyAttributes);
            if (customVariableArr != null) {
                for (int i2 = 0; i2 < customVariableArr.length; i2++) {
                    motionKeyAttributes.mCustom.put(customVariableArr[i2].getName(), customVariableArr[i2]);
                }
            }
            this.mMotionControl.addKey(motionKeyAttributes);
        }

        public void setKeyCycle(TypedBundle typedBundle) {
            MotionKeyCycle motionKeyCycle = new MotionKeyCycle();
            typedBundle.applyDelta(motionKeyCycle);
            this.mMotionControl.addKey(motionKeyCycle);
        }

        public void setKeyPosition(TypedBundle typedBundle) {
            MotionKeyPosition motionKeyPosition = new MotionKeyPosition();
            typedBundle.applyDelta(motionKeyPosition);
            this.mMotionControl.addKey(motionKeyPosition);
        }

        public void setPathRelative(WidgetState widgetState) {
            this.mMotionControl.setupRelative(widgetState.mMotionControl);
        }

        public void update(ConstraintWidget constraintWidget, int i2) {
            if (i2 == 0) {
                this.mStart.update(constraintWidget);
                MotionWidget motionWidget = this.mMotionWidgetStart;
                motionWidget.updateMotion(motionWidget);
                this.mMotionControl.setStart(this.mMotionWidgetStart);
                this.mNeedSetup = true;
            } else if (i2 == 1) {
                this.mEnd.update(constraintWidget);
                this.mMotionControl.setEnd(this.mMotionWidgetEnd);
                this.mNeedSetup = true;
            }
            this.mParentWidth = -1;
        }

        public void setKeyAttribute(TypedBundle typedBundle) {
            MotionKeyAttributes motionKeyAttributes = new MotionKeyAttributes();
            typedBundle.applyDelta(motionKeyAttributes);
            this.mMotionControl.addKey(motionKeyAttributes);
        }
    }

    private WidgetState getWidgetState(String str) {
        return this.mState.get(str);
    }

    public Interpolator getInterpolator() {
        return getInterpolator(this.mDefaultInterpolator, this.mDefaultInterpolatorString);
    }

    public void addKeyPosition(String str, TypedBundle typedBundle) {
        getWidgetState(str, null, 0).setKeyPosition(typedBundle);
    }
}
