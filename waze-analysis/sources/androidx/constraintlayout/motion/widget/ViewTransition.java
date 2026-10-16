package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.TypedValue;
import android.util.Xml;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.KeyCache;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.R;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class ViewTransition {
    static final int ANTICIPATE = 6;
    static final int BOUNCE = 4;
    public static final String CONSTRAINT_OVERRIDE = "ConstraintOverride";
    public static final String CUSTOM_ATTRIBUTE = "CustomAttribute";
    public static final String CUSTOM_METHOD = "CustomMethod";
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    public static final String KEY_FRAME_SET_TAG = "KeyFrameSet";
    static final int LINEAR = 3;
    public static final int ONSTATE_ACTION_DOWN = 1;
    public static final int ONSTATE_ACTION_DOWN_UP = 3;
    public static final int ONSTATE_ACTION_UP = 2;
    public static final int ONSTATE_SHARED_VALUE_SET = 4;
    public static final int ONSTATE_SHARED_VALUE_UNSET = 5;
    static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    private static final String TAG = "ViewTransition";
    private static final int UNSET = -1;
    static final int VIEWTRANSITIONMODE_ALLSTATES = 1;
    static final int VIEWTRANSITIONMODE_CURRENTSTATE = 0;
    static final int VIEWTRANSITIONMODE_NOSTATE = 2;
    public static final String VIEW_TRANSITION_TAG = "ViewTransition";
    ConstraintSet.Constraint mConstraintDelta;
    Context mContext;
    private int mId;
    KeyFrames mKeyFrames;
    ConstraintSet mSet;
    private int mTargetId;
    private String mTargetString;
    int mViewTransitionMode;
    private int mOnStateTransition = -1;
    private boolean mDisabled = false;
    private int mPathMotionArc = 0;
    private int mDuration = -1;
    private int mUpDuration = -1;
    private int mDefaultInterpolator = 0;
    private String mDefaultInterpolatorString = null;
    private int mDefaultInterpolatorID = -1;
    private int mSetsTag = -1;
    private int mClearsTag = -1;
    private int mIfTagSet = -1;
    private int mIfTagNotSet = -1;
    private int mSharedValueTarget = -1;
    private int mSharedValueID = -1;
    private int mSharedValueCurrent = -1;

    /* compiled from: WazeSource */
    class Animate {
        private final int mClearsTag;
        float mDpositionDt;
        int mDuration;
        boolean mHoldAt100;
        Interpolator mInterpolator;
        long mLastRender;
        MotionController mMC;
        float mPosition;
        private final int mSetsTag;
        long mStart;
        int mUpDuration;
        ViewTransitionController mVtController;
        KeyCache mCache = new KeyCache();
        boolean mReverse = false;
        Rect mTempRec = new Rect();

        Animate(ViewTransitionController viewTransitionController, MotionController motionController, int i2, int i3, int i4, Interpolator interpolator, int i5, int i6) {
            this.mHoldAt100 = false;
            this.mVtController = viewTransitionController;
            this.mMC = motionController;
            this.mDuration = i2;
            this.mUpDuration = i3;
            long jNanoTime = System.nanoTime();
            this.mStart = jNanoTime;
            this.mLastRender = jNanoTime;
            this.mVtController.addAnimation(this);
            this.mInterpolator = interpolator;
            this.mSetsTag = i5;
            this.mClearsTag = i6;
            if (i4 == 3) {
                this.mHoldAt100 = true;
            }
            this.mDpositionDt = i2 == 0 ? Float.MAX_VALUE : 1.0f / i2;
            mutate();
        }

        void mutate() {
            if (this.mReverse) {
                mutateReverse();
            } else {
                mutateForward();
            }
        }

        void mutateForward() {
            float interpolation;
            long jNanoTime = System.nanoTime();
            long j2 = jNanoTime - this.mLastRender;
            this.mLastRender = jNanoTime;
            float f2 = this.mPosition + (((float) (j2 * 1.0E-6d)) * this.mDpositionDt);
            this.mPosition = f2;
            if (f2 >= 1.0f) {
                this.mPosition = 1.0f;
                interpolation = 1.0f;
                f2 = 1.0f;
            } else {
                interpolation = f2;
            }
            Interpolator interpolator = this.mInterpolator;
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(f2);
            }
            float f3 = interpolation;
            MotionController motionController = this.mMC;
            boolean zInterpolate = motionController.interpolate(motionController.mView, f3, jNanoTime, this.mCache);
            if (this.mPosition >= 1.0f) {
                if (this.mSetsTag != -1) {
                    this.mMC.getView().setTag(this.mSetsTag, Long.valueOf(System.nanoTime()));
                }
                if (this.mClearsTag != -1) {
                    this.mMC.getView().setTag(this.mClearsTag, null);
                }
                if (!this.mHoldAt100) {
                    this.mVtController.removeAnimation(this);
                }
            }
            if (this.mPosition < 1.0f || zInterpolate) {
                this.mVtController.invalidate();
            }
        }

        void mutateReverse() {
            float interpolation;
            long jNanoTime = System.nanoTime();
            long j2 = jNanoTime - this.mLastRender;
            this.mLastRender = jNanoTime;
            float f2 = this.mPosition - (((float) (j2 * 1.0E-6d)) * this.mDpositionDt);
            this.mPosition = f2;
            if (f2 < 0.0f) {
                this.mPosition = 0.0f;
                interpolation = 0.0f;
                f2 = 0.0f;
            } else {
                interpolation = f2;
            }
            Interpolator interpolator = this.mInterpolator;
            if (interpolator != null) {
                interpolation = interpolator.getInterpolation(f2);
            }
            float f3 = interpolation;
            MotionController motionController = this.mMC;
            boolean zInterpolate = motionController.interpolate(motionController.mView, f3, jNanoTime, this.mCache);
            if (this.mPosition <= 0.0f) {
                if (this.mSetsTag != -1) {
                    this.mMC.getView().setTag(this.mSetsTag, Long.valueOf(System.nanoTime()));
                }
                if (this.mClearsTag != -1) {
                    this.mMC.getView().setTag(this.mClearsTag, null);
                }
                this.mVtController.removeAnimation(this);
            }
            if (this.mPosition > 0.0f || zInterpolate) {
                this.mVtController.invalidate();
            }
        }

        public void reactTo(int i2, float f2, float f3) {
            if (i2 == 1) {
                if (this.mReverse) {
                    return;
                }
                reverse(true);
            } else {
                if (i2 != 2) {
                    return;
                }
                this.mMC.getView().getHitRect(this.mTempRec);
                if (this.mTempRec.contains((int) f2, (int) f3) || this.mReverse) {
                    return;
                }
                reverse(true);
            }
        }

        void reverse(boolean z) {
            int i2;
            this.mReverse = z;
            if (z && (i2 = this.mUpDuration) != -1) {
                this.mDpositionDt = i2 == 0 ? Float.MAX_VALUE : 1.0f / i2;
            }
            this.mVtController.invalidate();
            this.mLastRender = System.nanoTime();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0062 A[Catch: IOException -> 0x00cd, XmlPullParserException -> 0x00d2, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x00cd, XmlPullParserException -> 0x00d2, blocks: (B:3:0x002a, B:36:0x00c6, B:11:0x0039, B:14:0x0045, B:22:0x0062, B:26:0x0070, B:30:0x007c, B:34:0x008c, B:35:0x0093), top: B:45:0x002a }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0093 A[Catch: IOException -> 0x00cd, XmlPullParserException -> 0x00d2, TryCatch #2 {IOException -> 0x00cd, XmlPullParserException -> 0x00d2, blocks: (B:3:0x002a, B:36:0x00c6, B:11:0x0039, B:14:0x0045, B:22:0x0062, B:26:0x0070, B:30:0x007c, B:34:0x008c, B:35:0x0093), top: B:45:0x002a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    ViewTransition(android.content.Context r6, org.xmlpull.v1.XmlPullParser r7) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r5 = this;
            java.lang.String r0 = "Error parsing XML resource"
            java.lang.String r1 = "ViewTransition"
            r5.<init>()
            r2 = -1
            r5.mOnStateTransition = r2
            r3 = 0
            r5.mDisabled = r3
            r5.mPathMotionArc = r3
            r5.mDuration = r2
            r5.mUpDuration = r2
            r5.mDefaultInterpolator = r3
            r3 = 0
            r5.mDefaultInterpolatorString = r3
            r5.mDefaultInterpolatorID = r2
            r5.mSetsTag = r2
            r5.mClearsTag = r2
            r5.mIfTagSet = r2
            r5.mIfTagNotSet = r2
            r5.mSharedValueTarget = r2
            r5.mSharedValueID = r2
            r5.mSharedValueCurrent = r2
            r5.mContext = r6
            int r2 = r7.getEventType()     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
        L2e:
            r3 = 1
            if (r2 == r3) goto Lcc
            r3 = 2
            if (r2 == r3) goto L45
            r3 = 3
            if (r2 == r3) goto L39
            goto Lc6
        L39:
            java.lang.String r2 = r7.getName()     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            boolean r2 = r1.equals(r2)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            if (r2 == 0) goto Lc6
            goto Lcc
        L45:
            java.lang.String r2 = r7.getName()     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            int r3 = r2.hashCode()     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            switch(r3) {
                case -1962203927: goto L84;
                case -1239391468: goto L74;
                case 61998586: goto L6a;
                case 366511058: goto L5a;
                case 1791837707: goto L51;
                default: goto L50;
            }
        L50:
            goto L93
        L51:
            java.lang.String r3 = "CustomAttribute"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L93
            goto L62
        L5a:
            java.lang.String r3 = "CustomMethod"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L93
        L62:
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = r5.mConstraintDelta     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            java.util.HashMap<java.lang.String, androidx.constraintlayout.widget.ConstraintAttribute> r2 = r2.mCustomConstraints     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            androidx.constraintlayout.widget.ConstraintAttribute.parse(r6, r7, r2)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            goto Lc6
        L6a:
            boolean r3 = r2.equals(r1)
            if (r3 == 0) goto L93
            r5.parseViewTransitionTags(r6, r7)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            goto Lc6
        L74:
            java.lang.String r3 = "KeyFrameSet"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L93
            androidx.constraintlayout.motion.widget.KeyFrames r2 = new androidx.constraintlayout.motion.widget.KeyFrames     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            r2.<init>(r6, r7)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            r5.mKeyFrames = r2     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            goto Lc6
        L84:
            java.lang.String r3 = "ConstraintOverride"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L93
            androidx.constraintlayout.widget.ConstraintSet$Constraint r2 = androidx.constraintlayout.widget.ConstraintSet.buildDelta(r6, r7)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            r5.mConstraintDelta = r2     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            goto Lc6
        L93:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            r3.<init>()     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            java.lang.String r4 = androidx.constraintlayout.motion.widget.Debug.getLoc()     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            r3.append(r4)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            java.lang.String r4 = " unknown tag "
            r3.append(r4)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            r3.append(r2)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            java.lang.String r2 = r3.toString()     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            android.util.Log.e(r1, r2)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            r2.<init>()     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            java.lang.String r3 = ".xml:"
            r2.append(r3)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            int r3 = r7.getLineNumber()     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            r2.append(r3)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            java.lang.String r2 = r2.toString()     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            android.util.Log.e(r1, r2)     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
        Lc6:
            int r2 = r7.next()     // Catch: java.io.IOException -> Lcd org.xmlpull.v1.XmlPullParserException -> Ld2
            goto L2e
        Lcc:
            return
        Lcd:
            r5 = move-exception
            android.util.Log.e(r1, r0, r5)
            return
        Ld2:
            r5 = move-exception
            android.util.Log.e(r1, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.ViewTransition.<init>(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    private void parseViewTransitionTags(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), R.styleable.ViewTransition);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == R.styleable.ViewTransition_android_id) {
                this.mId = typedArrayObtainStyledAttributes.getResourceId(index, this.mId);
            } else if (index == 8) {
                if (MotionLayout.IS_IN_EDIT_MODE) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(8, this.mTargetId);
                    this.mTargetId = resourceId;
                    if (resourceId == -1) {
                        this.mTargetString = typedArrayObtainStyledAttributes.getString(8);
                    }
                } else if (typedArrayObtainStyledAttributes.peekValue(8).type == 3) {
                    this.mTargetString = typedArrayObtainStyledAttributes.getString(8);
                } else {
                    this.mTargetId = typedArrayObtainStyledAttributes.getResourceId(8, this.mTargetId);
                }
            } else if (index == 9) {
                this.mOnStateTransition = typedArrayObtainStyledAttributes.getInt(9, this.mOnStateTransition);
            } else if (index == 12) {
                this.mDisabled = typedArrayObtainStyledAttributes.getBoolean(12, this.mDisabled);
            } else if (index == 10) {
                this.mPathMotionArc = typedArrayObtainStyledAttributes.getInt(10, this.mPathMotionArc);
            } else if (index == 4) {
                this.mDuration = typedArrayObtainStyledAttributes.getInt(4, this.mDuration);
            } else if (index == 13) {
                this.mUpDuration = typedArrayObtainStyledAttributes.getInt(13, this.mUpDuration);
            } else if (index == 14) {
                this.mViewTransitionMode = typedArrayObtainStyledAttributes.getInt(14, this.mViewTransitionMode);
            } else if (index == 7) {
                TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(7);
                if (typedValuePeekValue.type == 1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(7, -1);
                    this.mDefaultInterpolatorID = resourceId2;
                    if (resourceId2 != -1) {
                        this.mDefaultInterpolator = -2;
                    }
                } else if (typedValuePeekValue.type == 3) {
                    String string = typedArrayObtainStyledAttributes.getString(7);
                    this.mDefaultInterpolatorString = string;
                    if (string == null || string.indexOf(DomExceptionUtils.SEPARATOR) <= 0) {
                        this.mDefaultInterpolator = -1;
                    } else {
                        this.mDefaultInterpolatorID = typedArrayObtainStyledAttributes.getResourceId(7, -1);
                        this.mDefaultInterpolator = -2;
                    }
                } else {
                    this.mDefaultInterpolator = typedArrayObtainStyledAttributes.getInteger(7, this.mDefaultInterpolator);
                }
            } else if (index == 11) {
                this.mSetsTag = typedArrayObtainStyledAttributes.getResourceId(11, this.mSetsTag);
            } else if (index == 3) {
                this.mClearsTag = typedArrayObtainStyledAttributes.getResourceId(3, this.mClearsTag);
            } else if (index == 6) {
                this.mIfTagSet = typedArrayObtainStyledAttributes.getResourceId(6, this.mIfTagSet);
            } else if (index == 5) {
                this.mIfTagNotSet = typedArrayObtainStyledAttributes.getResourceId(5, this.mIfTagNotSet);
            } else if (index == 2) {
                this.mSharedValueID = typedArrayObtainStyledAttributes.getResourceId(2, this.mSharedValueID);
            } else if (index == 1) {
                this.mSharedValueTarget = typedArrayObtainStyledAttributes.getInteger(1, this.mSharedValueTarget);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void updateTransition(MotionScene.Transition transition, View view) {
        int i2 = this.mDuration;
        if (i2 != -1) {
            transition.setDuration(i2);
        }
        transition.setPathMotionArc(this.mPathMotionArc);
        transition.setInterpolatorInfo(this.mDefaultInterpolator, this.mDefaultInterpolatorString, this.mDefaultInterpolatorID);
        int id = view.getId();
        KeyFrames keyFrames = this.mKeyFrames;
        if (keyFrames != null) {
            ArrayList<Key> keyFramesForView = keyFrames.getKeyFramesForView(-1);
            KeyFrames keyFrames2 = new KeyFrames();
            int size = keyFramesForView.size();
            for (int i3 = 0; i3 < size; i3++) {
                keyFrames2.addKey(keyFramesForView.get(i3).mo11649clone().setViewId(id));
            }
            transition.addKeyFrame(keyFrames2);
        }
    }

    void applyIndependentTransition(ViewTransitionController viewTransitionController, MotionLayout motionLayout, View view) {
        MotionController motionController = new MotionController(view);
        motionController.setBothStates(view);
        this.mKeyFrames.addAllFrames(motionController);
        motionController.setup(motionLayout.getWidth(), motionLayout.getHeight(), this.mDuration, System.nanoTime());
        new Animate(viewTransitionController, motionController, this.mDuration, this.mUpDuration, this.mOnStateTransition, getInterpolator(motionLayout.getContext()), this.mSetsTag, this.mClearsTag);
    }

    void applyTransition(ViewTransitionController viewTransitionController, MotionLayout motionLayout, int i2, ConstraintSet constraintSet, final View... viewArr) {
        if (this.mDisabled) {
            return;
        }
        int i3 = this.mViewTransitionMode;
        if (i3 == 2) {
            applyIndependentTransition(viewTransitionController, motionLayout, viewArr[0]);
            return;
        }
        if (i3 == 1) {
            for (int i4 : motionLayout.getConstraintSetIds()) {
                if (i4 != i2) {
                    ConstraintSet constraintSet2 = motionLayout.getConstraintSet(i4);
                    for (View view : viewArr) {
                        ConstraintSet.Constraint constraint = constraintSet2.getConstraint(view.getId());
                        ConstraintSet.Constraint constraint2 = this.mConstraintDelta;
                        if (constraint2 != null) {
                            constraint2.applyDelta(constraint);
                            constraint.mCustomConstraints.putAll(this.mConstraintDelta.mCustomConstraints);
                        }
                    }
                }
            }
        }
        ConstraintSet constraintSet3 = new ConstraintSet();
        constraintSet3.clone(constraintSet);
        for (View view2 : viewArr) {
            ConstraintSet.Constraint constraint3 = constraintSet3.getConstraint(view2.getId());
            ConstraintSet.Constraint constraint4 = this.mConstraintDelta;
            if (constraint4 != null) {
                constraint4.applyDelta(constraint3);
                constraint3.mCustomConstraints.putAll(this.mConstraintDelta.mCustomConstraints);
            }
        }
        motionLayout.updateState(i2, constraintSet3);
        motionLayout.updateState(com.waze.R.id.view_transition, constraintSet);
        motionLayout.setState(com.waze.R.id.view_transition, -1, -1);
        MotionScene.Transition transition = new MotionScene.Transition(-1, motionLayout.mScene, com.waze.R.id.view_transition, i2);
        for (View view3 : viewArr) {
            updateTransition(transition, view3);
        }
        motionLayout.setTransition(transition);
        motionLayout.transitionToEnd(new Runnable() { // from class: androidx.constraintlayout.motion.widget.ViewTransition$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                this.f$0.m11650x14d7500(viewArr);
            }
        });
    }

    boolean checkTags(View view) {
        int i2 = this.mIfTagSet;
        boolean z = i2 == -1 || view.getTag(i2) != null;
        int i3 = this.mIfTagNotSet;
        return z && (i3 == -1 || view.getTag(i3) == null);
    }

    int getId() {
        return this.mId;
    }

    Interpolator getInterpolator(Context context) {
        int i2 = this.mDefaultInterpolator;
        if (i2 == -2) {
            return AnimationUtils.loadInterpolator(context, this.mDefaultInterpolatorID);
        }
        if (i2 == -1) {
            final Easing interpolator = Easing.getInterpolator(this.mDefaultInterpolatorString);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.ViewTransition.1
                @Override // android.animation.TimeInterpolator
                public float getInterpolation(float f2) {
                    return (float) interpolator.get(f2);
                }
            };
        }
        if (i2 == 0) {
            return new AccelerateDecelerateInterpolator();
        }
        if (i2 == 1) {
            return new AccelerateInterpolator();
        }
        if (i2 == 2) {
            return new DecelerateInterpolator();
        }
        if (i2 == 4) {
            return new BounceInterpolator();
        }
        if (i2 == 5) {
            return new OvershootInterpolator();
        }
        if (i2 != 6) {
            return null;
        }
        return new AnticipateInterpolator();
    }

    public int getSharedValue() {
        return this.mSharedValueTarget;
    }

    public int getSharedValueCurrent() {
        return this.mSharedValueCurrent;
    }

    public int getSharedValueID() {
        return this.mSharedValueID;
    }

    public int getStateTransition() {
        return this.mOnStateTransition;
    }

    boolean isEnabled() {
        return !this.mDisabled;
    }

    /* renamed from: lambda$applyTransition$0$androidx-constraintlayout-motion-widget-ViewTransition, reason: not valid java name */
    /* synthetic */ void m11650x14d7500(View[] viewArr) {
        if (this.mSetsTag != -1) {
            for (View view : viewArr) {
                view.setTag(this.mSetsTag, Long.valueOf(System.nanoTime()));
            }
        }
        if (this.mClearsTag != -1) {
            for (View view2 : viewArr) {
                view2.setTag(this.mClearsTag, null);
            }
        }
    }

    boolean matchesView(View view) {
        String str;
        if (view == null) {
            return false;
        }
        if ((this.mTargetId == -1 && this.mTargetString == null) || !checkTags(view)) {
            return false;
        }
        if (view.getId() == this.mTargetId) {
            return true;
        }
        return this.mTargetString != null && (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) && (str = ((ConstraintLayout.LayoutParams) view.getLayoutParams()).constraintTag) != null && str.matches(this.mTargetString);
    }

    void setEnabled(boolean z) {
        this.mDisabled = !z;
    }

    void setId(int i2) {
        this.mId = i2;
    }

    public void setSharedValue(int i2) {
        this.mSharedValueTarget = i2;
    }

    public void setSharedValueCurrent(int i2) {
        this.mSharedValueCurrent = i2;
    }

    public void setSharedValueID(int i2) {
        this.mSharedValueID = i2;
    }

    public void setStateTransition(int i2) {
        this.mOnStateTransition = i2;
    }

    boolean supports(int i2) {
        int i3 = this.mOnStateTransition;
        if (i3 != 1) {
            if (i3 == 2) {
                return i2 == 1;
            }
            if (i3 != 3) {
                return false;
            }
        }
        return i2 == 0;
    }

    public String toString() {
        return "ViewTransition(" + Debug.getName(this.mContext, this.mId) + ")";
    }
}
