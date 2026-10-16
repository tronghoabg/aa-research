package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationUtils;
import android.view.animation.AnticipateInterpolator;
import android.view.animation.BounceInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintSet;
import androidx.constraintlayout.widget.StateSet;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.waze.R;
import com.waze.strings.DisplayStrings;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class MotionScene {
    static final int ANTICIPATE = 6;
    static final int BOUNCE = 4;
    private static final String CONSTRAINTSET_TAG = "ConstraintSet";
    private static final boolean DEBUG = false;
    private static final boolean DEBUG_DESKTOP = false;
    static final int EASE_IN = 1;
    static final int EASE_IN_OUT = 0;
    static final int EASE_OUT = 2;
    private static final String INCLUDE_TAG = "include";
    private static final String INCLUDE_TAG_UC = "Include";
    private static final int INTERPOLATOR_REFERENCE_ID = -2;
    private static final String KEYFRAMESET_TAG = "KeyFrameSet";
    public static final int LAYOUT_CALL_MEASURE = 2;
    public static final int LAYOUT_HONOR_REQUEST = 1;
    public static final int LAYOUT_IGNORE_REQUEST = 0;
    static final int LINEAR = 3;
    private static final int MIN_DURATION = 8;
    private static final String MOTIONSCENE_TAG = "MotionScene";
    private static final String ONCLICK_TAG = "OnClick";
    private static final String ONSWIPE_TAG = "OnSwipe";
    static final int OVERSHOOT = 5;
    private static final int SPLINE_STRING = -1;
    private static final String STATESET_TAG = "StateSet";
    private static final String TAG = "MotionScene";
    static final int TRANSITION_BACKWARD = 0;
    static final int TRANSITION_FORWARD = 1;
    private static final String TRANSITION_TAG = "Transition";
    public static final int UNSET = -1;
    private static final String VIEW_TRANSITION = "ViewTransition";
    private MotionEvent mLastTouchDown;
    float mLastTouchX;
    float mLastTouchY;
    private final MotionLayout mMotionLayout;
    private boolean mRtl;
    private MotionLayout.MotionTracker mVelocityTracker;
    final ViewTransitionController mViewTransitionController;
    StateSet mStateSet = null;
    Transition mCurrentTransition = null;
    private boolean mDisableAutoTransition = false;
    private ArrayList<Transition> mTransitionList = new ArrayList<>();
    private Transition mDefaultTransition = null;
    private ArrayList<Transition> mAbstractTransitionList = new ArrayList<>();
    private SparseArray<ConstraintSet> mConstraintSetMap = new SparseArray<>();
    private HashMap<String, Integer> mConstraintSetIdMap = new HashMap<>();
    private SparseIntArray mDeriveMap = new SparseIntArray();
    private int mDefaultDuration = DisplayStrings.DS_NIGHT;
    private int mLayoutDuringTransition = 0;
    private boolean mIgnoreTouch = false;
    private boolean mMotionOutsideRegion = false;

    MotionScene(Context context, MotionLayout motionLayout, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        this.mMotionLayout = motionLayout;
        this.mViewTransitionController = new ViewTransitionController(motionLayout);
        load(context, i2);
        this.mConstraintSetMap.put(R.id.motion_base, new ConstraintSet());
        this.mConstraintSetIdMap.put("motion_base", Integer.valueOf(R.id.motion_base));
    }

    private int getId(Context context, String str) {
        int identifier;
        if (str.contains(DomExceptionUtils.SEPARATOR)) {
            identifier = context.getResources().getIdentifier(str.substring(str.indexOf(47) + 1), TtmlNode.ATTR_ID, context.getPackageName());
        } else {
            identifier = -1;
        }
        if (identifier != -1) {
            return identifier;
        }
        if (str != null && str.length() > 1) {
            return Integer.parseInt(str.substring(1));
        }
        Log.e("MotionScene", "error in parsing id");
        return -1;
    }

    private int getIndex(Transition transition) {
        int i2 = transition.mId;
        if (i2 == -1) {
            throw new IllegalArgumentException("The transition must have an id");
        }
        for (int i3 = 0; i3 < this.mTransitionList.size(); i3++) {
            if (this.mTransitionList.get(i3).mId == i2) {
                return i3;
            }
        }
        return -1;
    }

    static String getLine(Context context, int i2, XmlPullParser xmlPullParser) {
        return ".(" + Debug.getName(context, i2) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + "\"";
    }

    private int getRealID(int i2) {
        int iStateGetConstraintID;
        StateSet stateSet = this.mStateSet;
        return (stateSet == null || (iStateGetConstraintID = stateSet.stateGetConstraintID(i2, -1, -1)) == -1) ? i2 : iStateGetConstraintID;
    }

    private boolean hasCycleDependency(int i2) {
        int i3 = this.mDeriveMap.get(i2);
        int size = this.mDeriveMap.size();
        while (i3 > 0) {
            if (i3 == i2) {
                return true;
            }
            int i4 = size - 1;
            if (size < 0) {
                return true;
            }
            i3 = this.mDeriveMap.get(i3);
            size = i4;
        }
        return false;
    }

    private boolean isProcessingTouch() {
        return this.mVelocityTracker != null;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0111 A[Catch: IOException -> 0x013e, XmlPullParserException -> 0x014f, TRY_ENTER, TRY_LEAVE, TryCatch #2 {IOException -> 0x013e, XmlPullParserException -> 0x014f, blocks: (B:3:0x000c, B:72:0x0137, B:9:0x001a, B:61:0x0111, B:17:0x0039, B:21:0x0048, B:26:0x0057, B:28:0x0086, B:33:0x009c, B:35:0x00a4, B:40:0x00b4, B:42:0x00c2, B:44:0x00c8, B:46:0x00d0, B:47:0x00db, B:49:0x00e1, B:51:0x00e8, B:53:0x00f0, B:52:0x00eb, B:57:0x00fe, B:65:0x011d, B:67:0x0124, B:71:0x0134), top: B:81:0x000c }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void load(android.content.Context r10, int r11) throws org.xmlpull.v1.XmlPullParserException, android.content.res.Resources.NotFoundException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionScene.load(android.content.Context, int):void");
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private int parseConstraintSet(Context context, XmlPullParser xmlPullParser) {
        ConstraintSet constraintSet = new ConstraintSet();
        constraintSet.setForceId(false);
        int attributeCount = xmlPullParser.getAttributeCount();
        int i2 = 0;
        int id = -1;
        int id2 = -1;
        while (true) {
            int i3 = 1;
            if (i2 >= attributeCount) {
                if (id != -1) {
                    if (this.mMotionLayout.mDebugPath != 0) {
                        constraintSet.setValidateOnParse(true);
                    }
                    constraintSet.load(context, xmlPullParser);
                    if (id2 != -1) {
                        this.mDeriveMap.put(id, id2);
                    }
                    this.mConstraintSetMap.put(id, constraintSet);
                }
                return id;
            }
            String attributeName = xmlPullParser.getAttributeName(i2);
            String attributeValue = xmlPullParser.getAttributeValue(i2);
            int iHashCode = attributeName.hashCode();
            if (iHashCode != -1496482599) {
                if (iHashCode != -1153153640) {
                    if (iHashCode != 3355) {
                        if (iHashCode == 973381616 && attributeName.equals("stateLabels")) {
                            constraintSet.setStateLabels(attributeValue);
                        }
                    } else if (attributeName.equals(TtmlNode.ATTR_ID)) {
                        id = getId(context, attributeValue);
                        this.mConstraintSetIdMap.put(stripID(attributeValue), Integer.valueOf(id));
                        constraintSet.mIdString = Debug.getName(context, id);
                    }
                } else if (attributeName.equals("constraintRotate")) {
                    try {
                        constraintSet.mRotate = Integer.parseInt(attributeValue);
                    } catch (NumberFormatException unused) {
                        switch (attributeValue.hashCode()) {
                            case -768416914:
                                if (!attributeValue.equals("x_left")) {
                                    break;
                                } else {
                                    i3 = 4;
                                    break;
                                }
                            case 3317767:
                                if (!attributeValue.equals(TtmlNode.LEFT)) {
                                    break;
                                } else {
                                    i3 = 2;
                                    break;
                                }
                            case 3387192:
                                if (attributeValue.equals("none")) {
                                    constraintSet.mRotate = 0;
                                    break;
                                } else {
                                    continue;
                                }
                            case 108511772:
                                if (!attributeValue.equals(TtmlNode.RIGHT)) {
                                    break;
                                }
                                break;
                            case 1954540437:
                                if (!attributeValue.equals("x_right")) {
                                    break;
                                } else {
                                    i3 = 3;
                                    break;
                                }
                        }
                        constraintSet.mRotate = i3;
                    }
                }
            } else if (attributeName.equals("deriveConstraintsFrom")) {
                id2 = getId(context, attributeValue);
            }
            i2++;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int parseInclude(Context context, int i2) throws XmlPullParserException, Resources.NotFoundException, IOException {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                String name = xml.getName();
                if (eventType == 2 && CONSTRAINTSET_TAG.equals(name)) {
                    return parseConstraintSet(context, xml);
                }
            }
            return -1;
        } catch (IOException e2) {
            Log.e("MotionScene", "Error parsing resource: " + i2, e2);
            return -1;
        } catch (XmlPullParserException e3) {
            Log.e("MotionScene", "Error parsing resource: " + i2, e3);
            return -1;
        }
    }

    private void parseMotionSceneTags(Context context, XmlPullParser xmlPullParser) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.MotionScene);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == androidx.constraintlayout.widget.R.styleable.MotionScene_defaultDuration) {
                int i3 = typedArrayObtainStyledAttributes.getInt(index, this.mDefaultDuration);
                this.mDefaultDuration = i3;
                if (i3 < 8) {
                    this.mDefaultDuration = 8;
                }
            } else if (index == 1) {
                this.mLayoutDuringTransition = typedArrayObtainStyledAttributes.getInteger(1, 0);
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void readConstraintChain(int i2, MotionLayout motionLayout) {
        ConstraintSet constraintSet = this.mConstraintSetMap.get(i2);
        constraintSet.derivedState = constraintSet.mIdString;
        int i3 = this.mDeriveMap.get(i2);
        if (i3 > 0) {
            readConstraintChain(i3, motionLayout);
            ConstraintSet constraintSet2 = this.mConstraintSetMap.get(i3);
            if (constraintSet2 == null) {
                Log.e("MotionScene", "ERROR! invalid deriveConstraintsFrom: @id/".concat(String.valueOf(Debug.getName(this.mMotionLayout.getContext(), i3))));
                return;
            }
            constraintSet.derivedState += DomExceptionUtils.SEPARATOR + constraintSet2.derivedState;
            constraintSet.readFallback(constraintSet2);
        } else {
            constraintSet.derivedState = String.valueOf(constraintSet.derivedState).concat("  layout");
            constraintSet.readFallback(motionLayout);
        }
        constraintSet.applyDeltaFrom(constraintSet);
    }

    public static String stripID(String str) {
        if (str == null) {
            return "";
        }
        int iIndexOf = str.indexOf(47);
        return iIndexOf < 0 ? str : str.substring(iIndexOf + 1);
    }

    public void addOnClickListeners(MotionLayout motionLayout, int i2) {
        ArrayList<Transition> arrayList = this.mTransitionList;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Transition transition = arrayList.get(i3);
            if (transition.mOnClicks.size() > 0) {
                ArrayList arrayList2 = transition.mOnClicks;
                int size2 = arrayList2.size();
                for (int i4 = 0; i4 < size2; i4++) {
                    ((Transition.TransitionOnClick) arrayList2.get(i4)).removeOnClickListeners(motionLayout);
                }
            }
        }
        ArrayList<Transition> arrayList3 = this.mAbstractTransitionList;
        int size3 = arrayList3.size();
        for (int i5 = 0; i5 < size3; i5++) {
            Transition transition2 = arrayList3.get(i5);
            if (transition2.mOnClicks.size() > 0) {
                ArrayList arrayList4 = transition2.mOnClicks;
                int size4 = arrayList4.size();
                for (int i6 = 0; i6 < size4; i6++) {
                    ((Transition.TransitionOnClick) arrayList4.get(i6)).removeOnClickListeners(motionLayout);
                }
            }
        }
        ArrayList<Transition> arrayList5 = this.mTransitionList;
        int size5 = arrayList5.size();
        for (int i7 = 0; i7 < size5; i7++) {
            Transition transition3 = arrayList5.get(i7);
            if (transition3.mOnClicks.size() > 0) {
                ArrayList arrayList6 = transition3.mOnClicks;
                int size6 = arrayList6.size();
                for (int i8 = 0; i8 < size6; i8++) {
                    ((Transition.TransitionOnClick) arrayList6.get(i8)).addOnClickListeners(motionLayout, i2, transition3);
                }
            }
        }
        ArrayList<Transition> arrayList7 = this.mAbstractTransitionList;
        int size7 = arrayList7.size();
        for (int i9 = 0; i9 < size7; i9++) {
            Transition transition4 = arrayList7.get(i9);
            if (transition4.mOnClicks.size() > 0) {
                ArrayList arrayList8 = transition4.mOnClicks;
                int size8 = arrayList8.size();
                for (int i10 = 0; i10 < size8; i10++) {
                    ((Transition.TransitionOnClick) arrayList8.get(i10)).addOnClickListeners(motionLayout, i2, transition4);
                }
            }
        }
    }

    public void addTransition(Transition transition) {
        int index = getIndex(transition);
        ArrayList<Transition> arrayList = this.mTransitionList;
        if (index == -1) {
            arrayList.add(transition);
        } else {
            arrayList.set(index, transition);
        }
    }

    public boolean applyViewTransition(int i2, MotionController motionController) {
        return this.mViewTransitionController.applyViewTransition(i2, motionController);
    }

    boolean autoTransition(MotionLayout motionLayout, int i2) {
        Transition transition;
        if (isProcessingTouch() || this.mDisableAutoTransition) {
            return false;
        }
        ArrayList<Transition> arrayList = this.mTransitionList;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            Transition transition2 = arrayList.get(i3);
            if (transition2.mAutoTransition != 0 && ((transition = this.mCurrentTransition) != transition2 || !transition.isTransitionFlag(2))) {
                if (i2 == transition2.mConstraintSetStart && (transition2.mAutoTransition == 4 || transition2.mAutoTransition == 2)) {
                    motionLayout.setState(MotionLayout.TransitionState.FINISHED);
                    motionLayout.setTransition(transition2);
                    if (transition2.mAutoTransition == 4) {
                        motionLayout.transitionToEnd();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(1.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(MotionLayout.TransitionState.FINISHED);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                }
                if (i2 == transition2.mConstraintSetEnd && (transition2.mAutoTransition == 3 || transition2.mAutoTransition == 1)) {
                    motionLayout.setState(MotionLayout.TransitionState.FINISHED);
                    motionLayout.setTransition(transition2);
                    if (transition2.mAutoTransition == 3) {
                        motionLayout.transitionToStart();
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                    } else {
                        motionLayout.setProgress(0.0f);
                        motionLayout.evaluate(true);
                        motionLayout.setState(MotionLayout.TransitionState.SETUP);
                        motionLayout.setState(MotionLayout.TransitionState.MOVING);
                        motionLayout.setState(MotionLayout.TransitionState.FINISHED);
                        motionLayout.onNewStateAttachHandlers();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public Transition bestTransitionFor(int i2, float f2, float f3, MotionEvent motionEvent) {
        RectF limitBoundsTo;
        float f4 = f2;
        float f5 = f3;
        if (i2 == -1) {
            return this.mCurrentTransition;
        }
        List<Transition> transitionsWithState = getTransitionsWithState(i2);
        RectF rectF = new RectF();
        Transition transition = null;
        float f6 = 0.0f;
        for (Transition transition2 : transitionsWithState) {
            if (!transition2.mDisable && transition2.mTouchResponse != null) {
                transition2.mTouchResponse.setRTL(this.mRtl);
                RectF touchRegion = transition2.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                if ((touchRegion == null || motionEvent == null || touchRegion.contains(motionEvent.getX(), motionEvent.getY())) && ((limitBoundsTo = transition2.mTouchResponse.getLimitBoundsTo(this.mMotionLayout, rectF)) == null || motionEvent == null || limitBoundsTo.contains(motionEvent.getX(), motionEvent.getY()))) {
                    float fDot = transition2.mTouchResponse.dot(f4, f5);
                    if (transition2.mTouchResponse.mIsRotateMode && motionEvent != null) {
                        fDot = ((float) (Math.atan2(f5 + r10, f4 + r9) - Math.atan2(motionEvent.getX() - transition2.mTouchResponse.mRotateCenterX, motionEvent.getY() - transition2.mTouchResponse.mRotateCenterY))) * 10.0f;
                    }
                    float f7 = transition2.mConstraintSetEnd == i2 ? -fDot : fDot * 1.1f;
                    if (f7 > f6) {
                        f5 = f3;
                        f6 = f7;
                        transition = transition2;
                        f4 = f2;
                    }
                }
            }
            f4 = f2;
            f5 = f3;
        }
        return transition;
    }

    public void disableAutoTransition(boolean z) {
        this.mDisableAutoTransition = z;
    }

    public void enableViewTransition(int i2, boolean z) {
        this.mViewTransitionController.enableViewTransition(i2, z);
    }

    public int gatPathMotionArc() {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mPathMotionArc;
        }
        return -1;
    }

    int getAutoCompleteMode() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0;
        }
        return this.mCurrentTransition.mTouchResponse.getAutoCompleteMode();
    }

    ConstraintSet getConstraintSet(int i2, int i3, int i4) {
        int iStateGetConstraintID;
        StateSet stateSet = this.mStateSet;
        if (stateSet != null && (iStateGetConstraintID = stateSet.stateGetConstraintID(i2, i3, i4)) != -1) {
            i2 = iStateGetConstraintID;
        }
        if (this.mConstraintSetMap.get(i2) != null) {
            return this.mConstraintSetMap.get(i2);
        }
        Log.e("MotionScene", "Warning could not find ConstraintSet id/" + Debug.getName(this.mMotionLayout.getContext(), i2) + " In MotionScene");
        SparseArray<ConstraintSet> sparseArray = this.mConstraintSetMap;
        return sparseArray.get(sparseArray.keyAt(0));
    }

    public int[] getConstraintSetIds() {
        int size = this.mConstraintSetMap.size();
        int[] iArr = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr[i2] = this.mConstraintSetMap.keyAt(i2);
        }
        return iArr;
    }

    public ArrayList<Transition> getDefinedTransitions() {
        return this.mTransitionList;
    }

    public int getDuration() {
        Transition transition = this.mCurrentTransition;
        return transition != null ? transition.mDuration : this.mDefaultDuration;
    }

    int getEndId() {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return -1;
        }
        return transition.mConstraintSetEnd;
    }

    public Interpolator getInterpolator() {
        int i2 = this.mCurrentTransition.mDefaultInterpolator;
        if (i2 == -2) {
            return AnimationUtils.loadInterpolator(this.mMotionLayout.getContext(), this.mCurrentTransition.mDefaultInterpolatorID);
        }
        if (i2 == -1) {
            final Easing interpolator = Easing.getInterpolator(this.mCurrentTransition.mDefaultInterpolatorString);
            return new Interpolator() { // from class: androidx.constraintlayout.motion.widget.MotionScene.1
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

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
    
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    androidx.constraintlayout.motion.widget.Key getKeyFrame(android.content.Context r11, int r12, int r13, int r14) {
        /*
            r10 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r10 = r10.mCurrentTransition
            r11 = 0
            if (r10 != 0) goto L6
            return r11
        L6:
            java.util.ArrayList r10 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1400(r10)
            int r0 = r10.size()
            r1 = 0
            r2 = r1
        L10:
            if (r2 >= r0) goto L58
            java.lang.Object r3 = r10.get(r2)
            androidx.constraintlayout.motion.widget.KeyFrames r3 = (androidx.constraintlayout.motion.widget.KeyFrames) r3
            java.util.Set r4 = r3.getKeys()
            java.util.Iterator r4 = r4.iterator()
        L20:
            boolean r5 = r4.hasNext()
            int r6 = r2 + 1
            if (r5 == 0) goto L56
            java.lang.Object r5 = r4.next()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r6 = r5.intValue()
            if (r13 != r6) goto L20
            int r5 = r5.intValue()
            java.util.ArrayList r5 = r3.getKeyFramesForView(r5)
            int r6 = r5.size()
            r7 = r1
        L41:
            if (r7 >= r6) goto L20
            java.lang.Object r8 = r5.get(r7)
            androidx.constraintlayout.motion.widget.Key r8 = (androidx.constraintlayout.motion.widget.Key) r8
            int r9 = r8.mFramePosition
            if (r9 != r14) goto L53
            int r9 = r8.mType
            if (r9 == r12) goto L52
            goto L53
        L52:
            return r8
        L53:
            int r7 = r7 + 1
            goto L41
        L56:
            r2 = r6
            goto L10
        L58:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionScene.getKeyFrame(android.content.Context, int, int, int):androidx.constraintlayout.motion.widget.Key");
    }

    public void getKeyFrames(MotionController motionController) {
        Transition transition = this.mCurrentTransition;
        int i2 = 0;
        if (transition != null) {
            ArrayList arrayList = transition.mKeyFramesList;
            int size = arrayList.size();
            while (i2 < size) {
                ((KeyFrames) arrayList.get(i2)).addFrames(motionController);
                i2++;
            }
            return;
        }
        Transition transition2 = this.mDefaultTransition;
        if (transition2 != null) {
            ArrayList arrayList2 = transition2.mKeyFramesList;
            int size2 = arrayList2.size();
            while (i2 < size2) {
                ((KeyFrames) arrayList2.get(i2)).addFrames(motionController);
                i2++;
            }
        }
    }

    public int[] getMatchingStateLabels(String... strArr) {
        int size = this.mConstraintSetMap.size();
        int[] iArr = new int[size];
        int i2 = 0;
        for (int i3 = 0; i3 < size; i3++) {
            ConstraintSet constraintSetValueAt = this.mConstraintSetMap.valueAt(i3);
            int iKeyAt = this.mConstraintSetMap.keyAt(i3);
            if (constraintSetValueAt.matchesLabels(strArr)) {
                constraintSetValueAt.getStateLabels();
                iArr[i2] = iKeyAt;
                i2++;
            }
        }
        return Arrays.copyOf(iArr, i2);
    }

    float getMaxAcceleration() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getMaxAcceleration();
    }

    float getMaxVelocity() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getMaxVelocity();
    }

    boolean getMoveWhenScrollAtTop() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return false;
        }
        return this.mCurrentTransition.mTouchResponse.getMoveWhenScrollAtTop();
    }

    public float getPathPercent(View view, int i2) {
        return 0.0f;
    }

    float getProgressDirection(float f2, float f3) {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getProgressDirection(f2, f3);
    }

    int getSpringBoundary() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringBoundary();
    }

    float getSpringDamping() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringDamping();
    }

    float getSpringMass() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringMass();
    }

    float getSpringStiffiness() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringStiffness();
    }

    float getSpringStopThreshold() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return 0.0f;
        }
        return this.mCurrentTransition.mTouchResponse.getSpringStopThreshold();
    }

    public float getStaggered() {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            return transition.mStagger;
        }
        return 0.0f;
    }

    int getStartId() {
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return -1;
        }
        return transition.mConstraintSetStart;
    }

    public Transition getTransitionById(int i2) {
        ArrayList<Transition> arrayList = this.mTransitionList;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            Transition transition = arrayList.get(i3);
            i3++;
            if (transition.mId == i2) {
                return transition;
            }
        }
        return null;
    }

    int getTransitionDirection(int i2) {
        ArrayList<Transition> arrayList = this.mTransitionList;
        int size = arrayList.size();
        int i3 = 0;
        while (i3 < size) {
            int i4 = arrayList.get(i3).mConstraintSetStart;
            i3++;
            if (i4 == i2) {
                return 0;
            }
        }
        return 1;
    }

    public List<Transition> getTransitionsWithState(int i2) {
        int realID = getRealID(i2);
        ArrayList arrayList = new ArrayList();
        ArrayList<Transition> arrayList2 = this.mTransitionList;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            Transition transition = arrayList2.get(i3);
            if (transition.mConstraintSetStart == realID || transition.mConstraintSetEnd == realID) {
                arrayList.add(transition);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r2 = r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    boolean hasKeyFramePosition(android.view.View r8, int r9) {
        /*
            r7 = this;
            androidx.constraintlayout.motion.widget.MotionScene$Transition r7 = r7.mCurrentTransition
            r0 = 0
            if (r7 != 0) goto L6
            return r0
        L6:
            java.util.ArrayList r7 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$1400(r7)
            int r1 = r7.size()
            r2 = r0
        Lf:
            if (r2 >= r1) goto L38
            java.lang.Object r3 = r7.get(r2)
            androidx.constraintlayout.motion.widget.KeyFrames r3 = (androidx.constraintlayout.motion.widget.KeyFrames) r3
            int r4 = r8.getId()
            java.util.ArrayList r3 = r3.getKeyFramesForView(r4)
            int r4 = r3.size()
            r5 = r0
        L24:
            int r6 = r2 + 1
            if (r5 >= r4) goto L36
            java.lang.Object r6 = r3.get(r5)
            androidx.constraintlayout.motion.widget.Key r6 = (androidx.constraintlayout.motion.widget.Key) r6
            int r6 = r6.mFramePosition
            int r5 = r5 + 1
            if (r6 != r9) goto L24
            r7 = 1
            return r7
        L36:
            r2 = r6
            goto Lf
        L38:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionScene.hasKeyFramePosition(android.view.View, int):boolean");
    }

    public boolean isViewTransitionEnabled(int i2) {
        return this.mViewTransitionController.isViewTransitionEnabled(i2);
    }

    public int lookUpConstraintId(String str) {
        Integer num = this.mConstraintSetIdMap.get(str);
        if (num == null) {
            return 0;
        }
        return num.intValue();
    }

    public String lookUpConstraintName(int i2) {
        for (Map.Entry<String, Integer> entry : this.mConstraintSetIdMap.entrySet()) {
            Integer value = entry.getValue();
            if (value != null && value.intValue() == i2) {
                return entry.getKey();
            }
        }
        return null;
    }

    protected void onLayout(boolean z, int i2, int i3, int i4, int i5) {
    }

    void processScrollMove(float f2, float f3) {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.scrollMove(f2, f3);
    }

    void processScrollUp(float f2, float f3) {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.scrollUp(f2, f3);
    }

    void processTouchEvent(MotionEvent motionEvent, int i2, MotionLayout motionLayout) {
        MotionLayout.MotionTracker motionTracker;
        MotionEvent motionEvent2;
        RectF rectF = new RectF();
        MotionLayout.MotionTracker motionTrackerObtainVelocityTracker = this.mVelocityTracker;
        if (motionTrackerObtainVelocityTracker == null) {
            motionTrackerObtainVelocityTracker = this.mMotionLayout.obtainVelocityTracker();
            this.mVelocityTracker = motionTrackerObtainVelocityTracker;
        }
        motionTrackerObtainVelocityTracker.addMovement(motionEvent);
        if (i2 != -1) {
            int action = motionEvent.getAction();
            boolean z = false;
            if (action == 0) {
                this.mLastTouchX = motionEvent.getRawX();
                this.mLastTouchY = motionEvent.getRawY();
                this.mLastTouchDown = motionEvent;
                this.mIgnoreTouch = false;
                if (this.mCurrentTransition.mTouchResponse != null) {
                    RectF limitBoundsTo = this.mCurrentTransition.mTouchResponse.getLimitBoundsTo(this.mMotionLayout, rectF);
                    if (limitBoundsTo != null && !limitBoundsTo.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                        this.mLastTouchDown = null;
                        this.mIgnoreTouch = true;
                        return;
                    }
                    RectF touchRegion = this.mCurrentTransition.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                    if (touchRegion == null || touchRegion.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                        this.mMotionOutsideRegion = false;
                    } else {
                        this.mMotionOutsideRegion = true;
                    }
                    this.mCurrentTransition.mTouchResponse.setDown(this.mLastTouchX, this.mLastTouchY);
                    return;
                }
                return;
            }
            if (action == 2 && !this.mIgnoreTouch) {
                float rawY = motionEvent.getRawY() - this.mLastTouchY;
                float rawX = motionEvent.getRawX() - this.mLastTouchX;
                if ((rawX == AudioStats.AUDIO_AMPLITUDE_NONE && rawY == AudioStats.AUDIO_AMPLITUDE_NONE) || (motionEvent2 = this.mLastTouchDown) == null) {
                    return;
                }
                Transition transitionBestTransitionFor = bestTransitionFor(i2, rawX, rawY, motionEvent2);
                if (transitionBestTransitionFor != null) {
                    motionLayout.setTransition(transitionBestTransitionFor);
                    RectF touchRegion2 = this.mCurrentTransition.mTouchResponse.getTouchRegion(this.mMotionLayout, rectF);
                    if (touchRegion2 != null && !touchRegion2.contains(this.mLastTouchDown.getX(), this.mLastTouchDown.getY())) {
                        z = true;
                    }
                    this.mMotionOutsideRegion = z;
                    this.mCurrentTransition.mTouchResponse.setUpTouchEvent(this.mLastTouchX, this.mLastTouchY);
                }
            }
        }
        if (this.mIgnoreTouch) {
            return;
        }
        Transition transition = this.mCurrentTransition;
        if (transition != null && transition.mTouchResponse != null && !this.mMotionOutsideRegion) {
            this.mCurrentTransition.mTouchResponse.processTouchEvent(motionEvent, this.mVelocityTracker, i2, this);
        }
        this.mLastTouchX = motionEvent.getRawX();
        this.mLastTouchY = motionEvent.getRawY();
        if (motionEvent.getAction() != 1 || (motionTracker = this.mVelocityTracker) == null) {
            return;
        }
        motionTracker.recycle();
        this.mVelocityTracker = null;
        int i3 = motionLayout.mCurrentState;
        if (i3 != -1) {
            autoTransition(motionLayout, i3);
        }
    }

    void readFallback(MotionLayout motionLayout) {
        for (int i2 = 0; i2 < this.mConstraintSetMap.size(); i2++) {
            int iKeyAt = this.mConstraintSetMap.keyAt(i2);
            if (hasCycleDependency(iKeyAt)) {
                Log.e("MotionScene", "Cannot be derived from yourself");
                return;
            }
            readConstraintChain(iKeyAt, motionLayout);
        }
    }

    public void removeTransition(Transition transition) {
        int index = getIndex(transition);
        if (index != -1) {
            this.mTransitionList.remove(index);
        }
    }

    public void setConstraintSet(int i2, ConstraintSet constraintSet) {
        this.mConstraintSetMap.put(i2, constraintSet);
    }

    public void setDuration(int i2) {
        Transition transition = this.mCurrentTransition;
        if (transition != null) {
            transition.setDuration(i2);
        } else {
            this.mDefaultDuration = i2;
        }
    }

    public void setKeyframe(View view, int i2, String str, Object obj) {
        int i3;
        Transition transition = this.mCurrentTransition;
        if (transition == null) {
            return;
        }
        ArrayList arrayList = transition.mKeyFramesList;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            ArrayList<Key> keyFramesForView = ((KeyFrames) arrayList.get(i4)).getKeyFramesForView(view.getId());
            int size2 = keyFramesForView.size();
            int i5 = 0;
            while (true) {
                i3 = i4 + 1;
                if (i5 < size2) {
                    if (keyFramesForView.get(i5).mFramePosition == i2 && obj != null) {
                        ((Float) obj).floatValue();
                    }
                    i5++;
                }
            }
            i4 = i3;
        }
    }

    public void setRtl(boolean z) {
        this.mRtl = z;
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    void setTransition(int r10, int r11) {
        /*
            r9 = this;
            androidx.constraintlayout.widget.StateSet r0 = r9.mStateSet
            r1 = -1
            if (r0 == 0) goto L15
            int r0 = r0.stateGetConstraintID(r10, r1, r1)
            if (r0 != r1) goto Lc
            r0 = r10
        Lc:
            androidx.constraintlayout.widget.StateSet r2 = r9.mStateSet
            int r2 = r2.stateGetConstraintID(r11, r1, r1)
            if (r2 != r1) goto L17
            goto L16
        L15:
            r0 = r10
        L16:
            r2 = r11
        L17:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r9.mCurrentTransition
            if (r3 == 0) goto L29
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r3)
            if (r3 != r11) goto L29
            androidx.constraintlayout.motion.widget.MotionScene$Transition r3 = r9.mCurrentTransition
            int r3 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r3)
            if (r3 == r10) goto L66
        L29:
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r3 = r9.mTransitionList
            int r4 = r3.size()
            r5 = 0
            r6 = r5
        L31:
            if (r6 >= r4) goto L6a
            java.lang.Object r7 = r3.get(r6)
            androidx.constraintlayout.motion.widget.MotionScene$Transition r7 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r7
            int r8 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r7)
            if (r8 != r2) goto L45
            int r8 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r7)
            if (r8 == r0) goto L51
        L45:
            int r8 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r7)
            if (r8 != r11) goto L67
            int r8 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$100(r7)
            if (r8 != r10) goto L67
        L51:
            r9.mCurrentTransition = r7
            if (r7 == 0) goto L66
            androidx.constraintlayout.motion.widget.TouchResponse r10 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r7)
            if (r10 == 0) goto L66
            androidx.constraintlayout.motion.widget.MotionScene$Transition r10 = r9.mCurrentTransition
            androidx.constraintlayout.motion.widget.TouchResponse r10 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$200(r10)
            boolean r9 = r9.mRtl
            r10.setRTL(r9)
        L66:
            return
        L67:
            int r6 = r6 + 1
            goto L31
        L6a:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r10 = r9.mDefaultTransition
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r3 = r9.mAbstractTransitionList
            int r4 = r3.size()
        L72:
            if (r5 >= r4) goto L84
            java.lang.Object r6 = r3.get(r5)
            androidx.constraintlayout.motion.widget.MotionScene$Transition r6 = (androidx.constraintlayout.motion.widget.MotionScene.Transition) r6
            int r7 = androidx.constraintlayout.motion.widget.MotionScene.Transition.access$000(r6)
            if (r7 != r11) goto L81
            r10 = r6
        L81:
            int r5 = r5 + 1
            goto L72
        L84:
            androidx.constraintlayout.motion.widget.MotionScene$Transition r11 = new androidx.constraintlayout.motion.widget.MotionScene$Transition
            r11.<init>(r9, r10)
            androidx.constraintlayout.motion.widget.MotionScene.Transition.access$102(r11, r0)
            androidx.constraintlayout.motion.widget.MotionScene.Transition.access$002(r11, r2)
            if (r0 == r1) goto L96
            java.util.ArrayList<androidx.constraintlayout.motion.widget.MotionScene$Transition> r10 = r9.mTransitionList
            r10.add(r11)
        L96:
            r9.mCurrentTransition = r11
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.motion.widget.MotionScene.setTransition(int, int):void");
    }

    void setupTouch() {
        Transition transition = this.mCurrentTransition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.setupTouch();
    }

    boolean supportTouch() {
        ArrayList<Transition> arrayList = this.mTransitionList;
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            TouchResponse touchResponse = arrayList.get(i2).mTouchResponse;
            i2++;
            if (touchResponse != null) {
                return true;
            }
        }
        Transition transition = this.mCurrentTransition;
        return (transition == null || transition.mTouchResponse == null) ? false : true;
    }

    public boolean validateLayout(MotionLayout motionLayout) {
        return motionLayout == this.mMotionLayout && motionLayout.mScene == this;
    }

    public void viewTransition(int i2, View... viewArr) {
        this.mViewTransitionController.viewTransition(i2, viewArr);
    }

    /* compiled from: WazeSource */
    public class Transition {
        public static final int AUTO_ANIMATE_TO_END = 4;
        public static final int AUTO_ANIMATE_TO_START = 3;
        public static final int AUTO_JUMP_TO_END = 2;
        public static final int AUTO_JUMP_TO_START = 1;
        public static final int AUTO_NONE = 0;
        public static final int INTERPOLATE_ANTICIPATE = 6;
        public static final int INTERPOLATE_BOUNCE = 4;
        public static final int INTERPOLATE_EASE_IN = 1;
        public static final int INTERPOLATE_EASE_IN_OUT = 0;
        public static final int INTERPOLATE_EASE_OUT = 2;
        public static final int INTERPOLATE_LINEAR = 3;
        public static final int INTERPOLATE_OVERSHOOT = 5;
        public static final int INTERPOLATE_REFERENCE_ID = -2;
        public static final int INTERPOLATE_SPLINE_STRING = -1;
        static final int TRANSITION_FLAG_FIRST_DRAW = 1;
        static final int TRANSITION_FLAG_INTERCEPT_TOUCH = 4;
        static final int TRANSITION_FLAG_INTRA_AUTO = 2;
        private int mAutoTransition;
        private int mConstraintSetEnd;
        private int mConstraintSetStart;
        private int mDefaultInterpolator;
        private int mDefaultInterpolatorID;
        private String mDefaultInterpolatorString;
        private boolean mDisable;
        private int mDuration;
        private int mId;
        private boolean mIsAbstract;
        private ArrayList<KeyFrames> mKeyFramesList;
        private int mLayoutDuringTransition;
        private final MotionScene mMotionScene;
        private ArrayList<TransitionOnClick> mOnClicks;
        private int mPathMotionArc;
        private float mStagger;
        private TouchResponse mTouchResponse;
        private int mTransitionFlags;

        Transition(MotionScene motionScene, Transition transition) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = DisplayStrings.DS_NIGHT;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mMotionScene = motionScene;
            this.mDuration = motionScene.mDefaultDuration;
            if (transition != null) {
                this.mPathMotionArc = transition.mPathMotionArc;
                this.mDefaultInterpolator = transition.mDefaultInterpolator;
                this.mDefaultInterpolatorString = transition.mDefaultInterpolatorString;
                this.mDefaultInterpolatorID = transition.mDefaultInterpolatorID;
                this.mDuration = transition.mDuration;
                this.mKeyFramesList = transition.mKeyFramesList;
                this.mStagger = transition.mStagger;
                this.mLayoutDuringTransition = transition.mLayoutDuringTransition;
            }
        }

        private void fill(MotionScene motionScene, Context context, TypedArray typedArray) throws Resources.NotFoundException {
            int indexCount = typedArray.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArray.getIndex(i2);
                int[] iArr = androidx.constraintlayout.widget.R.styleable.ActionBar;
                if (index == 2) {
                    this.mConstraintSetEnd = typedArray.getResourceId(2, -1);
                    String resourceTypeName = context.getResources().getResourceTypeName(this.mConstraintSetEnd);
                    if ("layout".equals(resourceTypeName)) {
                        ConstraintSet constraintSet = new ConstraintSet();
                        constraintSet.load(context, this.mConstraintSetEnd);
                        motionScene.mConstraintSetMap.append(this.mConstraintSetEnd, constraintSet);
                    } else if ("xml".equals(resourceTypeName)) {
                        this.mConstraintSetEnd = motionScene.parseInclude(context, this.mConstraintSetEnd);
                    }
                } else if (index == 3) {
                    this.mConstraintSetStart = typedArray.getResourceId(3, this.mConstraintSetStart);
                    String resourceTypeName2 = context.getResources().getResourceTypeName(this.mConstraintSetStart);
                    if ("layout".equals(resourceTypeName2)) {
                        ConstraintSet constraintSet2 = new ConstraintSet();
                        constraintSet2.load(context, this.mConstraintSetStart);
                        motionScene.mConstraintSetMap.append(this.mConstraintSetStart, constraintSet2);
                    } else if ("xml".equals(resourceTypeName2)) {
                        this.mConstraintSetStart = motionScene.parseInclude(context, this.mConstraintSetStart);
                    }
                } else if (index == 6) {
                    TypedValue typedValuePeekValue = typedArray.peekValue(6);
                    if (typedValuePeekValue.type == 1) {
                        int resourceId = typedArray.getResourceId(6, -1);
                        this.mDefaultInterpolatorID = resourceId;
                        if (resourceId != -1) {
                            this.mDefaultInterpolator = -2;
                        }
                    } else if (typedValuePeekValue.type == 3) {
                        String string = typedArray.getString(6);
                        this.mDefaultInterpolatorString = string;
                        if (string != null) {
                            if (string.indexOf(DomExceptionUtils.SEPARATOR) > 0) {
                                this.mDefaultInterpolatorID = typedArray.getResourceId(6, -1);
                                this.mDefaultInterpolator = -2;
                            } else {
                                this.mDefaultInterpolator = -1;
                            }
                        }
                    } else {
                        this.mDefaultInterpolator = typedArray.getInteger(6, this.mDefaultInterpolator);
                    }
                } else if (index == 4) {
                    int i3 = typedArray.getInt(4, this.mDuration);
                    this.mDuration = i3;
                    if (i3 < 8) {
                        this.mDuration = 8;
                    }
                } else if (index == 8) {
                    this.mStagger = typedArray.getFloat(8, this.mStagger);
                } else if (index == 1) {
                    this.mAutoTransition = typedArray.getInteger(1, this.mAutoTransition);
                } else if (index == androidx.constraintlayout.widget.R.styleable.Transition_android_id) {
                    this.mId = typedArray.getResourceId(index, this.mId);
                } else if (index == 9) {
                    this.mDisable = typedArray.getBoolean(9, this.mDisable);
                } else if (index == 7) {
                    this.mPathMotionArc = typedArray.getInteger(7, -1);
                } else if (index == 5) {
                    this.mLayoutDuringTransition = typedArray.getInteger(5, 0);
                } else if (index == 10) {
                    this.mTransitionFlags = typedArray.getInteger(10, 0);
                }
            }
            if (this.mConstraintSetStart == -1) {
                this.mIsAbstract = true;
            }
        }

        private void fillFromAttributeList(MotionScene motionScene, Context context, AttributeSet attributeSet) throws Resources.NotFoundException {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.constraintlayout.widget.R.styleable.Transition);
            fill(motionScene, context, typedArrayObtainStyledAttributes);
            typedArrayObtainStyledAttributes.recycle();
        }

        public void addKeyFrame(KeyFrames keyFrames) {
            this.mKeyFramesList.add(keyFrames);
        }

        public void addOnClick(int i2, int i3) {
            ArrayList<TransitionOnClick> arrayList = this.mOnClicks;
            int size = arrayList.size();
            int i4 = 0;
            while (i4 < size) {
                TransitionOnClick transitionOnClick = arrayList.get(i4);
                i4++;
                if (transitionOnClick.mTargetId == i2) {
                    transitionOnClick.mMode = i3;
                    return;
                }
            }
            this.mOnClicks.add(new TransitionOnClick(this, i2, i3));
        }

        public String debugString(Context context) {
            String resourceEntryName = this.mConstraintSetStart == -1 ? "null" : context.getResources().getResourceEntryName(this.mConstraintSetStart);
            if (this.mConstraintSetEnd == -1) {
                return String.valueOf(resourceEntryName).concat(" -> null");
            }
            return resourceEntryName + " -> " + context.getResources().getResourceEntryName(this.mConstraintSetEnd);
        }

        public int getAutoTransition() {
            return this.mAutoTransition;
        }

        public int getDuration() {
            return this.mDuration;
        }

        public int getEndConstraintSetId() {
            return this.mConstraintSetEnd;
        }

        public int getId() {
            return this.mId;
        }

        public List<KeyFrames> getKeyFrameList() {
            return this.mKeyFramesList;
        }

        public int getLayoutDuringTransition() {
            return this.mLayoutDuringTransition;
        }

        public List<TransitionOnClick> getOnClickList() {
            return this.mOnClicks;
        }

        public int getPathMotionArc() {
            return this.mPathMotionArc;
        }

        public float getStagger() {
            return this.mStagger;
        }

        public int getStartConstraintSetId() {
            return this.mConstraintSetStart;
        }

        public TouchResponse getTouchResponse() {
            return this.mTouchResponse;
        }

        public boolean isEnabled() {
            return !this.mDisable;
        }

        public boolean isTransitionFlag(int i2) {
            return (this.mTransitionFlags & i2) != 0;
        }

        public void removeOnClick(int i2) {
            TransitionOnClick transitionOnClick;
            ArrayList<TransitionOnClick> arrayList = this.mOnClicks;
            int size = arrayList.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    transitionOnClick = null;
                    break;
                }
                transitionOnClick = arrayList.get(i3);
                i3++;
                if (transitionOnClick.mTargetId == i2) {
                    break;
                }
            }
            if (transitionOnClick != null) {
                this.mOnClicks.remove(transitionOnClick);
            }
        }

        public void setAutoTransition(int i2) {
            this.mAutoTransition = i2;
        }

        public void setDuration(int i2) {
            this.mDuration = Math.max(i2, 8);
        }

        public void setEnabled(boolean z) {
            this.mDisable = !z;
        }

        public void setInterpolatorInfo(int i2, String str, int i3) {
            this.mDefaultInterpolator = i2;
            this.mDefaultInterpolatorString = str;
            this.mDefaultInterpolatorID = i3;
        }

        public void setLayoutDuringTransition(int i2) {
            this.mLayoutDuringTransition = i2;
        }

        public void setOnSwipe(OnSwipe onSwipe) {
            this.mTouchResponse = onSwipe == null ? null : new TouchResponse(this.mMotionScene.mMotionLayout, onSwipe);
        }

        public void setOnTouchUp(int i2) {
            TouchResponse touchResponse = getTouchResponse();
            if (touchResponse != null) {
                touchResponse.setTouchUpMode(i2);
            }
        }

        public void setPathMotionArc(int i2) {
            this.mPathMotionArc = i2;
        }

        public void setStagger(float f2) {
            this.mStagger = f2;
        }

        public void setTransitionFlag(int i2) {
            this.mTransitionFlags = i2;
        }

        public void addOnClick(Context context, XmlPullParser xmlPullParser) {
            this.mOnClicks.add(new TransitionOnClick(context, this, xmlPullParser));
        }

        /* compiled from: WazeSource */
        public class TransitionOnClick implements View.OnClickListener {
            public static final int ANIM_TOGGLE = 17;
            public static final int ANIM_TO_END = 1;
            public static final int ANIM_TO_START = 16;
            public static final int JUMP_TO_END = 256;
            public static final int JUMP_TO_START = 4096;
            int mMode;
            int mTargetId;
            private final Transition mTransition;

            public TransitionOnClick(Context context, Transition transition, XmlPullParser xmlPullParser) {
                this.mTargetId = -1;
                this.mMode = 17;
                this.mTransition = transition;
                TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.OnClick);
                int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
                for (int i2 = 0; i2 < indexCount; i2++) {
                    int index = typedArrayObtainStyledAttributes.getIndex(i2);
                    if (index == 1) {
                        this.mTargetId = typedArrayObtainStyledAttributes.getResourceId(1, this.mTargetId);
                    } else if (index == androidx.constraintlayout.widget.R.styleable.OnClick_clickAction) {
                        this.mMode = typedArrayObtainStyledAttributes.getInt(index, this.mMode);
                    }
                }
                typedArrayObtainStyledAttributes.recycle();
            }

            public void addOnClickListeners(MotionLayout motionLayout, int i2, Transition transition) {
                int i3 = this.mTargetId;
                View viewFindViewById = motionLayout;
                if (i3 != -1) {
                    viewFindViewById = motionLayout.findViewById(i3);
                }
                if (viewFindViewById == null) {
                    Log.e("MotionScene", "OnClick could not find id " + this.mTargetId);
                    return;
                }
                int i4 = transition.mConstraintSetStart;
                int i5 = transition.mConstraintSetEnd;
                if (i4 == -1) {
                    viewFindViewById.setOnClickListener(this);
                    return;
                }
                int i6 = this.mMode;
                int i7 = i6 & 1;
                if (((i7 != 0 && i2 == i4) | (i7 != 0 && i2 == i4) | ((i6 & 256) != 0 && i2 == i4) | ((i6 & 16) != 0 && i2 == i5)) || ((i6 & 4096) != 0 && i2 == i5)) {
                    viewFindViewById.setOnClickListener(this);
                }
            }

            boolean isTransitionViable(Transition transition, MotionLayout motionLayout) {
                Transition transition2 = this.mTransition;
                if (transition2 == transition) {
                    return true;
                }
                int i2 = transition2.mConstraintSetEnd;
                int i3 = transition2.mConstraintSetStart;
                if (i3 == -1) {
                    return motionLayout.mCurrentState != i2;
                }
                int i4 = motionLayout.mCurrentState;
                return i4 == i3 || i4 == i2;
            }

            @Override // android.view.View.OnClickListener
            public void onClick(View view) {
                MotionLayout motionLayout = this.mTransition.mMotionScene.mMotionLayout;
                if (motionLayout.isInteractionEnabled()) {
                    if (this.mTransition.mConstraintSetStart == -1) {
                        int currentState = motionLayout.getCurrentState();
                        Transition transition = this.mTransition;
                        if (currentState == -1) {
                            motionLayout.transitionToState(transition.mConstraintSetEnd);
                            return;
                        }
                        Transition transition2 = new Transition(transition.mMotionScene, transition);
                        transition2.mConstraintSetStart = currentState;
                        transition2.mConstraintSetEnd = this.mTransition.mConstraintSetEnd;
                        motionLayout.setTransition(transition2);
                        motionLayout.transitionToEnd();
                        return;
                    }
                    Transition transition3 = this.mTransition.mMotionScene.mCurrentTransition;
                    int i2 = this.mMode;
                    boolean z = false;
                    boolean z2 = ((i2 & 1) == 0 && (i2 & 256) == 0) ? false : true;
                    boolean z3 = ((i2 & 16) == 0 && (i2 & 4096) == 0) ? false : true;
                    if (z2 && z3) {
                        Transition transition4 = this.mTransition.mMotionScene.mCurrentTransition;
                        Transition transition5 = this.mTransition;
                        if (transition4 != transition5) {
                            motionLayout.setTransition(transition5);
                        }
                        if (motionLayout.getCurrentState() != motionLayout.getEndState() && motionLayout.getProgress() <= 0.5f) {
                            z3 = false;
                            z = z2;
                        }
                    } else {
                        z = z2;
                    }
                    if (isTransitionViable(transition3, motionLayout)) {
                        if (z && (this.mMode & 1) != 0) {
                            motionLayout.setTransition(this.mTransition);
                            motionLayout.transitionToEnd();
                            return;
                        }
                        if (z3 && (this.mMode & 16) != 0) {
                            motionLayout.setTransition(this.mTransition);
                            motionLayout.transitionToStart();
                        } else if (z && (this.mMode & 256) != 0) {
                            motionLayout.setTransition(this.mTransition);
                            motionLayout.setProgress(1.0f);
                        } else {
                            if (!z3 || (this.mMode & 4096) == 0) {
                                return;
                            }
                            motionLayout.setTransition(this.mTransition);
                            motionLayout.setProgress(0.0f);
                        }
                    }
                }
            }

            public void removeOnClickListeners(MotionLayout motionLayout) {
                int i2 = this.mTargetId;
                if (i2 == -1) {
                    return;
                }
                View viewFindViewById = motionLayout.findViewById(i2);
                if (viewFindViewById != null) {
                    viewFindViewById.setOnClickListener(null);
                    return;
                }
                Log.e("MotionScene", " (*)  could not find id " + this.mTargetId);
            }

            public TransitionOnClick(Transition transition, int i2, int i3) {
                this.mTransition = transition;
                this.mTargetId = i2;
                this.mMode = i3;
            }
        }

        Transition(MotionScene motionScene, Context context, XmlPullParser xmlPullParser) throws Resources.NotFoundException {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = DisplayStrings.DS_NIGHT;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mDuration = motionScene.mDefaultDuration;
            this.mLayoutDuringTransition = motionScene.mLayoutDuringTransition;
            this.mMotionScene = motionScene;
            fillFromAttributeList(motionScene, context, Xml.asAttributeSet(xmlPullParser));
        }

        public Transition(int i2, MotionScene motionScene, int i3, int i4) {
            this.mId = -1;
            this.mIsAbstract = false;
            this.mConstraintSetEnd = -1;
            this.mConstraintSetStart = -1;
            this.mDefaultInterpolator = 0;
            this.mDefaultInterpolatorString = null;
            this.mDefaultInterpolatorID = -1;
            this.mDuration = DisplayStrings.DS_NIGHT;
            this.mStagger = 0.0f;
            this.mKeyFramesList = new ArrayList<>();
            this.mTouchResponse = null;
            this.mOnClicks = new ArrayList<>();
            this.mAutoTransition = 0;
            this.mDisable = false;
            this.mPathMotionArc = -1;
            this.mLayoutDuringTransition = 0;
            this.mTransitionFlags = 0;
            this.mId = i2;
            this.mMotionScene = motionScene;
            this.mConstraintSetStart = i3;
            this.mConstraintSetEnd = i4;
            this.mDuration = motionScene.mDefaultDuration;
            this.mLayoutDuringTransition = motionScene.mLayoutDuringTransition;
        }
    }

    ConstraintSet getConstraintSet(int i2) {
        return getConstraintSet(i2, -1, -1);
    }

    public ConstraintSet getConstraintSet(Context context, String str) {
        for (int i2 = 0; i2 < this.mConstraintSetMap.size(); i2++) {
            int iKeyAt = this.mConstraintSetMap.keyAt(i2);
            if (str.equals(context.getResources().getResourceName(iKeyAt))) {
                return this.mConstraintSetMap.get(iKeyAt);
            }
        }
        return null;
    }

    private void parseInclude(Context context, XmlPullParser xmlPullParser) throws XmlPullParserException, Resources.NotFoundException, IOException {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlPullParser), androidx.constraintlayout.widget.R.styleable.include);
        int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArrayObtainStyledAttributes.getIndex(i2);
            if (index == androidx.constraintlayout.widget.R.styleable.include_constraintSet) {
                parseInclude(context, typedArrayObtainStyledAttributes.getResourceId(index, -1));
            }
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public MotionScene(MotionLayout motionLayout) {
        this.mMotionLayout = motionLayout;
        this.mViewTransitionController = new ViewTransitionController(motionLayout);
    }

    public void setTransition(Transition transition) {
        this.mCurrentTransition = transition;
        if (transition == null || transition.mTouchResponse == null) {
            return;
        }
        this.mCurrentTransition.mTouchResponse.setRTL(this.mRtl);
    }
}
