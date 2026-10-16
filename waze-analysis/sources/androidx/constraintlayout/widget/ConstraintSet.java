package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.video.AudioStats;
import androidx.constraintlayout.core.motion.utils.Easing;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.core.widgets.HelperWidget;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.MotionScene;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Constraints;
import androidx.constraintlayout.widget.R;
import androidx.core.os.EnvironmentCompat;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.exifinterface.media.ExifInterface;
import androidx.media3.extractor.text.ttml.TtmlNode;
import java.io.IOException;
import java.io.Writer;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public class ConstraintSet {
    private static final int ALPHA = 43;
    private static final int ANIMATE_CIRCLE_ANGLE_TO = 82;
    private static final int ANIMATE_RELATIVE_TO = 64;
    private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
    private static final int BARRIER_DIRECTION = 72;
    private static final int BARRIER_MARGIN = 73;
    private static final int BARRIER_TYPE = 1;
    public static final int BASELINE = 5;
    private static final int BASELINE_MARGIN = 93;
    private static final int BASELINE_TO_BASELINE = 1;
    private static final int BASELINE_TO_BOTTOM = 92;
    private static final int BASELINE_TO_TOP = 91;
    public static final int BOTTOM = 4;
    private static final int BOTTOM_MARGIN = 2;
    private static final int BOTTOM_TO_BOTTOM = 3;
    private static final int BOTTOM_TO_TOP = 4;
    public static final int CHAIN_PACKED = 2;
    public static final int CHAIN_SPREAD = 0;
    public static final int CHAIN_SPREAD_INSIDE = 1;
    private static final int CHAIN_USE_RTL = 71;
    private static final int CIRCLE = 61;
    private static final int CIRCLE_ANGLE = 63;
    private static final int CIRCLE_RADIUS = 62;
    public static final int CIRCLE_REFERENCE = 8;
    private static final int CONSTRAINED_HEIGHT = 81;
    private static final int CONSTRAINED_WIDTH = 80;
    private static final int CONSTRAINT_REFERENCED_IDS = 74;
    private static final int CONSTRAINT_TAG = 77;
    private static final boolean DEBUG = false;
    private static final int DIMENSION_RATIO = 5;
    private static final int DRAW_PATH = 66;
    private static final int EDITOR_ABSOLUTE_X = 6;
    private static final int EDITOR_ABSOLUTE_Y = 7;
    private static final int ELEVATION = 44;
    public static final int END = 7;
    private static final int END_MARGIN = 8;
    private static final int END_TO_END = 9;
    private static final int END_TO_START = 10;
    private static final String ERROR_MESSAGE = "XML parser error must be within a Constraint ";
    public static final int GONE = 8;
    private static final int GONE_BASELINE_MARGIN = 94;
    private static final int GONE_BOTTOM_MARGIN = 11;
    private static final int GONE_END_MARGIN = 12;
    private static final int GONE_LEFT_MARGIN = 13;
    private static final int GONE_RIGHT_MARGIN = 14;
    private static final int GONE_START_MARGIN = 15;
    private static final int GONE_TOP_MARGIN = 16;
    private static final int GUIDELINE_USE_RTL = 99;
    private static final int GUIDE_BEGIN = 17;
    private static final int GUIDE_END = 18;
    private static final int GUIDE_PERCENT = 19;
    private static final int HEIGHT_DEFAULT = 55;
    private static final int HEIGHT_MAX = 57;
    private static final int HEIGHT_MIN = 59;
    private static final int HEIGHT_PERCENT = 70;
    public static final int HORIZONTAL = 0;
    private static final int HORIZONTAL_BIAS = 20;
    public static final int HORIZONTAL_GUIDELINE = 0;
    private static final int HORIZONTAL_STYLE = 41;
    private static final int HORIZONTAL_WEIGHT = 39;
    private static final int INTERNAL_MATCH_CONSTRAINT = -3;
    private static final int INTERNAL_MATCH_PARENT = -1;
    private static final int INTERNAL_WRAP_CONTENT = -2;
    private static final int INTERNAL_WRAP_CONTENT_CONSTRAINED = -4;
    public static final int INVISIBLE = 4;
    private static final String KEY_PERCENT_PARENT = "parent";
    private static final String KEY_RATIO = "ratio";
    private static final String KEY_WEIGHT = "weight";
    private static final int LAYOUT_CONSTRAINT_HEIGHT = 96;
    private static final int LAYOUT_CONSTRAINT_WIDTH = 95;
    private static final int LAYOUT_HEIGHT = 21;
    private static final int LAYOUT_VISIBILITY = 22;
    private static final int LAYOUT_WIDTH = 23;
    private static final int LAYOUT_WRAP_BEHAVIOR = 97;
    public static final int LEFT = 1;
    private static final int LEFT_MARGIN = 24;
    private static final int LEFT_TO_LEFT = 25;
    private static final int LEFT_TO_RIGHT = 26;
    public static final int MATCH_CONSTRAINT = 0;
    public static final int MATCH_CONSTRAINT_PERCENT = 2;
    public static final int MATCH_CONSTRAINT_SPREAD = 0;
    public static final int MATCH_CONSTRAINT_WRAP = 1;
    private static final int MOTION_STAGGER = 79;
    private static final int MOTION_TARGET = 98;
    private static final int ORIENTATION = 27;
    public static final int PARENT_ID = 0;
    private static final int PATH_MOTION_ARC = 76;
    private static final int PROGRESS = 68;
    private static final int QUANTIZE_MOTION_INTERPOLATOR = 86;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_ID = 89;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_STR = 90;
    private static final int QUANTIZE_MOTION_INTERPOLATOR_TYPE = 88;
    private static final int QUANTIZE_MOTION_PHASE = 85;
    private static final int QUANTIZE_MOTION_STEPS = 84;
    public static final int RIGHT = 2;
    private static final int RIGHT_MARGIN = 28;
    private static final int RIGHT_TO_LEFT = 29;
    private static final int RIGHT_TO_RIGHT = 30;
    public static final int ROTATE_LEFT_OF_PORTRATE = 4;
    public static final int ROTATE_NONE = 0;
    public static final int ROTATE_PORTRATE_OF_LEFT = 2;
    public static final int ROTATE_PORTRATE_OF_RIGHT = 1;
    public static final int ROTATE_RIGHT_OF_PORTRATE = 3;
    private static final int ROTATION = 60;
    private static final int ROTATION_X = 45;
    private static final int ROTATION_Y = 46;
    private static final int SCALE_X = 47;
    private static final int SCALE_Y = 48;
    public static final int START = 6;
    private static final int START_MARGIN = 31;
    private static final int START_TO_END = 32;
    private static final int START_TO_START = 33;
    private static final String TAG = "ConstraintSet";
    public static final int TOP = 3;
    private static final int TOP_MARGIN = 34;
    private static final int TOP_TO_BOTTOM = 35;
    private static final int TOP_TO_TOP = 36;
    private static final int TRANSFORM_PIVOT_TARGET = 83;
    private static final int TRANSFORM_PIVOT_X = 49;
    private static final int TRANSFORM_PIVOT_Y = 50;
    private static final int TRANSITION_EASING = 65;
    private static final int TRANSITION_PATH_ROTATE = 67;
    private static final int TRANSLATION_X = 51;
    private static final int TRANSLATION_Y = 52;
    private static final int TRANSLATION_Z = 53;
    public static final int UNSET = -1;
    private static final int UNUSED = 87;
    public static final int VERTICAL = 1;
    private static final int VERTICAL_BIAS = 37;
    public static final int VERTICAL_GUIDELINE = 1;
    private static final int VERTICAL_STYLE = 42;
    private static final int VERTICAL_WEIGHT = 40;
    private static final int VIEW_ID = 38;
    private static final int VISIBILITY_MODE = 78;
    public static final int VISIBILITY_MODE_IGNORE = 1;
    public static final int VISIBILITY_MODE_NORMAL = 0;
    public static final int VISIBLE = 0;
    private static final int WIDTH_DEFAULT = 54;
    private static final int WIDTH_MAX = 56;
    private static final int WIDTH_MIN = 58;
    private static final int WIDTH_PERCENT = 69;
    public static final int WRAP_CONTENT = -2;
    public String mIdString;
    private boolean mValidate;
    private static final int[] VISIBILITY_FLAGS = {0, 4, 8};
    private static SparseIntArray sMapToConstant = new SparseIntArray();
    private static SparseIntArray sOverrideMapToConstant = new SparseIntArray();
    public String derivedState = "";
    private String[] mMatchLabels = new String[0];
    public int mRotate = 0;
    private HashMap<String, ConstraintAttribute> mSavedAttributes = new HashMap<>();
    private boolean mForceId = true;
    private HashMap<Integer, Constraint> mConstraints = new HashMap<>();

    /* compiled from: WazeSource */
    public class Layout {
        private static final int BARRIER_ALLOWS_GONE_WIDGETS = 75;
        private static final int BARRIER_DIRECTION = 72;
        private static final int BARRIER_MARGIN = 73;
        private static final int BASELINE_MARGIN = 80;
        private static final int BASELINE_TO_BASELINE = 1;
        private static final int BASELINE_TO_BOTTOM = 78;
        private static final int BASELINE_TO_TOP = 77;
        private static final int BOTTOM_MARGIN = 2;
        private static final int BOTTOM_TO_BOTTOM = 3;
        private static final int BOTTOM_TO_TOP = 4;
        private static final int CHAIN_USE_RTL = 71;
        private static final int CIRCLE = 61;
        private static final int CIRCLE_ANGLE = 63;
        private static final int CIRCLE_RADIUS = 62;
        private static final int CONSTRAINED_HEIGHT = 88;
        private static final int CONSTRAINED_WIDTH = 87;
        private static final int CONSTRAINT_REFERENCED_IDS = 74;
        private static final int CONSTRAINT_TAG = 89;
        private static final int DIMENSION_RATIO = 5;
        private static final int EDITOR_ABSOLUTE_X = 6;
        private static final int EDITOR_ABSOLUTE_Y = 7;
        private static final int END_MARGIN = 8;
        private static final int END_TO_END = 9;
        private static final int END_TO_START = 10;
        private static final int GONE_BASELINE_MARGIN = 79;
        private static final int GONE_BOTTOM_MARGIN = 11;
        private static final int GONE_END_MARGIN = 12;
        private static final int GONE_LEFT_MARGIN = 13;
        private static final int GONE_RIGHT_MARGIN = 14;
        private static final int GONE_START_MARGIN = 15;
        private static final int GONE_TOP_MARGIN = 16;
        private static final int GUIDE_BEGIN = 17;
        private static final int GUIDE_END = 18;
        private static final int GUIDE_PERCENT = 19;
        private static final int GUIDE_USE_RTL = 90;
        private static final int HEIGHT_DEFAULT = 82;
        private static final int HEIGHT_MAX = 83;
        private static final int HEIGHT_MIN = 85;
        private static final int HEIGHT_PERCENT = 70;
        private static final int HORIZONTAL_BIAS = 20;
        private static final int HORIZONTAL_STYLE = 39;
        private static final int HORIZONTAL_WEIGHT = 37;
        private static final int LAYOUT_CONSTRAINT_HEIGHT = 42;
        private static final int LAYOUT_CONSTRAINT_WIDTH = 41;
        private static final int LAYOUT_HEIGHT = 21;
        private static final int LAYOUT_WIDTH = 22;
        private static final int LAYOUT_WRAP_BEHAVIOR = 76;
        private static final int LEFT_MARGIN = 23;
        private static final int LEFT_TO_LEFT = 24;
        private static final int LEFT_TO_RIGHT = 25;
        private static final int ORIENTATION = 26;
        private static final int RIGHT_MARGIN = 27;
        private static final int RIGHT_TO_LEFT = 28;
        private static final int RIGHT_TO_RIGHT = 29;
        private static final int START_MARGIN = 30;
        private static final int START_TO_END = 31;
        private static final int START_TO_START = 32;
        private static final int TOP_MARGIN = 33;
        private static final int TOP_TO_BOTTOM = 34;
        private static final int TOP_TO_TOP = 35;
        public static final int UNSET = -1;
        public static final int UNSET_GONE_MARGIN = Integer.MIN_VALUE;
        private static final int UNUSED = 91;
        private static final int VERTICAL_BIAS = 36;
        private static final int VERTICAL_STYLE = 40;
        private static final int VERTICAL_WEIGHT = 38;
        private static final int WIDTH_DEFAULT = 81;
        private static final int WIDTH_MAX = 84;
        private static final int WIDTH_MIN = 86;
        private static final int WIDTH_PERCENT = 69;
        private static SparseIntArray sMapToConstant = new SparseIntArray();
        public String mConstraintTag;
        public int mHeight;
        public String mReferenceIdString;
        public int[] mReferenceIds;
        public int mWidth;
        public boolean mIsGuideline = false;
        public boolean mApply = false;
        public boolean mOverride = false;
        public int guideBegin = -1;
        public int guideEnd = -1;
        public float guidePercent = -1.0f;
        public boolean guidelineUseRtl = true;
        public int leftToLeft = -1;
        public int leftToRight = -1;
        public int rightToLeft = -1;
        public int rightToRight = -1;
        public int topToTop = -1;
        public int topToBottom = -1;
        public int bottomToTop = -1;
        public int bottomToBottom = -1;
        public int baselineToBaseline = -1;
        public int baselineToTop = -1;
        public int baselineToBottom = -1;
        public int startToEnd = -1;
        public int startToStart = -1;
        public int endToStart = -1;
        public int endToEnd = -1;
        public float horizontalBias = 0.5f;
        public float verticalBias = 0.5f;
        public String dimensionRatio = null;
        public int circleConstraint = -1;
        public int circleRadius = 0;
        public float circleAngle = 0.0f;
        public int editorAbsoluteX = -1;
        public int editorAbsoluteY = -1;
        public int orientation = -1;
        public int leftMargin = 0;
        public int rightMargin = 0;
        public int topMargin = 0;
        public int bottomMargin = 0;
        public int endMargin = 0;
        public int startMargin = 0;
        public int baselineMargin = 0;
        public int goneLeftMargin = Integer.MIN_VALUE;
        public int goneTopMargin = Integer.MIN_VALUE;
        public int goneRightMargin = Integer.MIN_VALUE;
        public int goneBottomMargin = Integer.MIN_VALUE;
        public int goneEndMargin = Integer.MIN_VALUE;
        public int goneStartMargin = Integer.MIN_VALUE;
        public int goneBaselineMargin = Integer.MIN_VALUE;
        public float verticalWeight = -1.0f;
        public float horizontalWeight = -1.0f;
        public int horizontalChainStyle = 0;
        public int verticalChainStyle = 0;
        public int widthDefault = 0;
        public int heightDefault = 0;
        public int widthMax = 0;
        public int heightMax = 0;
        public int widthMin = 0;
        public int heightMin = 0;
        public float widthPercent = 1.0f;
        public float heightPercent = 1.0f;
        public int mBarrierDirection = -1;
        public int mBarrierMargin = 0;
        public int mHelperType = -1;
        public boolean constrainedWidth = false;
        public boolean constrainedHeight = false;
        public boolean mBarrierAllowsGoneWidgets = true;
        public int mWrapBehavior = 0;

        static {
            int[] iArr = R.styleable.ActionBar;
            sMapToConstant.append(43, 24);
            sMapToConstant.append(44, 25);
            sMapToConstant.append(46, 28);
            sMapToConstant.append(47, 29);
            sMapToConstant.append(52, 35);
            sMapToConstant.append(51, 34);
            sMapToConstant.append(24, 4);
            sMapToConstant.append(23, 3);
            sMapToConstant.append(19, 1);
            sMapToConstant.append(61, 6);
            sMapToConstant.append(62, 7);
            sMapToConstant.append(31, 17);
            sMapToConstant.append(32, 18);
            sMapToConstant.append(33, 19);
            sMapToConstant.append(15, 90);
            sMapToConstant.append(R.styleable.Layout_android_orientation, 26);
            sMapToConstant.append(48, 31);
            sMapToConstant.append(49, 32);
            sMapToConstant.append(30, 10);
            sMapToConstant.append(29, 9);
            sMapToConstant.append(66, 13);
            sMapToConstant.append(69, 16);
            sMapToConstant.append(67, 14);
            sMapToConstant.append(64, 11);
            sMapToConstant.append(68, 15);
            sMapToConstant.append(65, 12);
            sMapToConstant.append(55, 38);
            sMapToConstant.append(41, 37);
            sMapToConstant.append(40, 39);
            sMapToConstant.append(54, 40);
            sMapToConstant.append(39, 20);
            sMapToConstant.append(53, 36);
            sMapToConstant.append(28, 5);
            sMapToConstant.append(42, 91);
            sMapToConstant.append(50, 91);
            sMapToConstant.append(45, 91);
            sMapToConstant.append(22, 91);
            sMapToConstant.append(18, 91);
            sMapToConstant.append(3, 23);
            sMapToConstant.append(5, 27);
            sMapToConstant.append(7, 30);
            sMapToConstant.append(8, 8);
            sMapToConstant.append(4, 33);
            sMapToConstant.append(6, 2);
            sMapToConstant.append(1, 22);
            sMapToConstant.append(2, 21);
            sMapToConstant.append(56, 41);
            sMapToConstant.append(34, 42);
            sMapToConstant.append(17, 87);
            sMapToConstant.append(16, 88);
            sMapToConstant.append(71, 76);
            sMapToConstant.append(25, 61);
            sMapToConstant.append(27, 62);
            sMapToConstant.append(26, 63);
            sMapToConstant.append(60, 69);
            sMapToConstant.append(38, 70);
            sMapToConstant.append(12, 71);
            sMapToConstant.append(10, 72);
            sMapToConstant.append(11, 73);
            sMapToConstant.append(13, 74);
            sMapToConstant.append(9, 75);
            sMapToConstant.append(58, 84);
            sMapToConstant.append(59, 86);
            sMapToConstant.append(58, 83);
            sMapToConstant.append(37, 85);
            sMapToConstant.append(56, 87);
            sMapToConstant.append(34, 88);
            sMapToConstant.append(91, 89);
            sMapToConstant.append(15, 90);
        }

        public void copyFrom(Layout layout) {
            this.mIsGuideline = layout.mIsGuideline;
            this.mWidth = layout.mWidth;
            this.mApply = layout.mApply;
            this.mHeight = layout.mHeight;
            this.guideBegin = layout.guideBegin;
            this.guideEnd = layout.guideEnd;
            this.guidePercent = layout.guidePercent;
            this.guidelineUseRtl = layout.guidelineUseRtl;
            this.leftToLeft = layout.leftToLeft;
            this.leftToRight = layout.leftToRight;
            this.rightToLeft = layout.rightToLeft;
            this.rightToRight = layout.rightToRight;
            this.topToTop = layout.topToTop;
            this.topToBottom = layout.topToBottom;
            this.bottomToTop = layout.bottomToTop;
            this.bottomToBottom = layout.bottomToBottom;
            this.baselineToBaseline = layout.baselineToBaseline;
            this.baselineToTop = layout.baselineToTop;
            this.baselineToBottom = layout.baselineToBottom;
            this.startToEnd = layout.startToEnd;
            this.startToStart = layout.startToStart;
            this.endToStart = layout.endToStart;
            this.endToEnd = layout.endToEnd;
            this.horizontalBias = layout.horizontalBias;
            this.verticalBias = layout.verticalBias;
            this.dimensionRatio = layout.dimensionRatio;
            this.circleConstraint = layout.circleConstraint;
            this.circleRadius = layout.circleRadius;
            this.circleAngle = layout.circleAngle;
            this.editorAbsoluteX = layout.editorAbsoluteX;
            this.editorAbsoluteY = layout.editorAbsoluteY;
            this.orientation = layout.orientation;
            this.leftMargin = layout.leftMargin;
            this.rightMargin = layout.rightMargin;
            this.topMargin = layout.topMargin;
            this.bottomMargin = layout.bottomMargin;
            this.endMargin = layout.endMargin;
            this.startMargin = layout.startMargin;
            this.baselineMargin = layout.baselineMargin;
            this.goneLeftMargin = layout.goneLeftMargin;
            this.goneTopMargin = layout.goneTopMargin;
            this.goneRightMargin = layout.goneRightMargin;
            this.goneBottomMargin = layout.goneBottomMargin;
            this.goneEndMargin = layout.goneEndMargin;
            this.goneStartMargin = layout.goneStartMargin;
            this.goneBaselineMargin = layout.goneBaselineMargin;
            this.verticalWeight = layout.verticalWeight;
            this.horizontalWeight = layout.horizontalWeight;
            this.horizontalChainStyle = layout.horizontalChainStyle;
            this.verticalChainStyle = layout.verticalChainStyle;
            this.widthDefault = layout.widthDefault;
            this.heightDefault = layout.heightDefault;
            this.widthMax = layout.widthMax;
            this.heightMax = layout.heightMax;
            this.widthMin = layout.widthMin;
            this.heightMin = layout.heightMin;
            this.widthPercent = layout.widthPercent;
            this.heightPercent = layout.heightPercent;
            this.mBarrierDirection = layout.mBarrierDirection;
            this.mBarrierMargin = layout.mBarrierMargin;
            this.mHelperType = layout.mHelperType;
            this.mConstraintTag = layout.mConstraintTag;
            int[] iArr = layout.mReferenceIds;
            if (iArr == null || layout.mReferenceIdString != null) {
                this.mReferenceIds = null;
            } else {
                this.mReferenceIds = Arrays.copyOf(iArr, iArr.length);
            }
            this.mReferenceIdString = layout.mReferenceIdString;
            this.constrainedWidth = layout.constrainedWidth;
            this.constrainedHeight = layout.constrainedHeight;
            this.mBarrierAllowsGoneWidgets = layout.mBarrierAllowsGoneWidgets;
            this.mWrapBehavior = layout.mWrapBehavior;
        }

        public void dump(MotionScene motionScene, StringBuilder sb) throws IllegalAccessException, IllegalArgumentException {
            Field[] declaredFields = getClass().getDeclaredFields();
            sb.append("\n");
            for (Field field : declaredFields) {
                String name = field.getName();
                if (!Modifier.isStatic(field.getModifiers())) {
                    try {
                        Object obj = field.get(this);
                        Class<?> type = field.getType();
                        if (type == Integer.TYPE) {
                            Integer num = (Integer) obj;
                            if (num.intValue() != -1) {
                                Object objLookUpConstraintName = motionScene.lookUpConstraintName(num.intValue());
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                Object obj2 = num;
                                if (objLookUpConstraintName != null) {
                                    obj2 = objLookUpConstraintName;
                                }
                                sb.append(obj2);
                                sb.append("\"\n");
                            }
                        } else if (type == Float.TYPE) {
                            Float f2 = (Float) obj;
                            if (f2.floatValue() != -1.0f) {
                                sb.append("    ");
                                sb.append(name);
                                sb.append(" = \"");
                                sb.append(f2);
                                sb.append("\"\n");
                            }
                        }
                    } catch (IllegalAccessException e2) {
                        Log.e(ConstraintSet.TAG, "Error accessing ConstraintSet field", e2);
                    }
                }
            }
        }

        void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Layout);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                int i3 = sMapToConstant.get(index);
                switch (i3) {
                    case 1:
                        this.baselineToBaseline = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.baselineToBaseline);
                        break;
                    case 2:
                        this.bottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.bottomMargin);
                        break;
                    case 3:
                        this.bottomToBottom = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.bottomToBottom);
                        break;
                    case 4:
                        this.bottomToTop = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.bottomToTop);
                        break;
                    case 5:
                        this.dimensionRatio = typedArrayObtainStyledAttributes.getString(index);
                        break;
                    case 6:
                        this.editorAbsoluteX = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteX);
                        break;
                    case 7:
                        this.editorAbsoluteY = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.editorAbsoluteY);
                        break;
                    case 8:
                        this.endMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.endMargin);
                        break;
                    case 9:
                        this.endToEnd = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.endToEnd);
                        break;
                    case 10:
                        this.endToStart = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.endToStart);
                        break;
                    case 11:
                        this.goneBottomMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneBottomMargin);
                        break;
                    case 12:
                        this.goneEndMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneEndMargin);
                        break;
                    case 13:
                        this.goneLeftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneLeftMargin);
                        break;
                    case 14:
                        this.goneRightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneRightMargin);
                        break;
                    case 15:
                        this.goneStartMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneStartMargin);
                        break;
                    case 16:
                        this.goneTopMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneTopMargin);
                        break;
                    case 17:
                        this.guideBegin = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideBegin);
                        break;
                    case 18:
                        this.guideEnd = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.guideEnd);
                        break;
                    case 19:
                        this.guidePercent = typedArrayObtainStyledAttributes.getFloat(index, this.guidePercent);
                        break;
                    case 20:
                        this.horizontalBias = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalBias);
                        break;
                    case 21:
                        this.mHeight = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.mHeight);
                        break;
                    case 22:
                        this.mWidth = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.mWidth);
                        break;
                    case 23:
                        this.leftMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.leftMargin);
                        break;
                    case 24:
                        this.leftToLeft = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.leftToLeft);
                        break;
                    case 25:
                        this.leftToRight = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.leftToRight);
                        break;
                    case 26:
                        this.orientation = typedArrayObtainStyledAttributes.getInt(index, this.orientation);
                        break;
                    case 27:
                        this.rightMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.rightMargin);
                        break;
                    case 28:
                        this.rightToLeft = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.rightToLeft);
                        break;
                    case 29:
                        this.rightToRight = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.rightToRight);
                        break;
                    case 30:
                        this.startMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.startMargin);
                        break;
                    case 31:
                        this.startToEnd = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.startToEnd);
                        break;
                    case 32:
                        this.startToStart = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.startToStart);
                        break;
                    case 33:
                        this.topMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.topMargin);
                        break;
                    case 34:
                        this.topToBottom = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.topToBottom);
                        break;
                    case 35:
                        this.topToTop = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.topToTop);
                        break;
                    case 36:
                        this.verticalBias = typedArrayObtainStyledAttributes.getFloat(index, this.verticalBias);
                        break;
                    case 37:
                        this.horizontalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.horizontalWeight);
                        break;
                    case 38:
                        this.verticalWeight = typedArrayObtainStyledAttributes.getFloat(index, this.verticalWeight);
                        break;
                    case 39:
                        this.horizontalChainStyle = typedArrayObtainStyledAttributes.getInt(index, this.horizontalChainStyle);
                        break;
                    case 40:
                        this.verticalChainStyle = typedArrayObtainStyledAttributes.getInt(index, this.verticalChainStyle);
                        break;
                    case 41:
                        ConstraintSet.parseDimensionConstraints(this, typedArrayObtainStyledAttributes, index, 0);
                        break;
                    case 42:
                        ConstraintSet.parseDimensionConstraints(this, typedArrayObtainStyledAttributes, index, 1);
                        break;
                    default:
                        switch (i3) {
                            case 61:
                                this.circleConstraint = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.circleConstraint);
                                break;
                            case 62:
                                this.circleRadius = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.circleRadius);
                                break;
                            case 63:
                                this.circleAngle = typedArrayObtainStyledAttributes.getFloat(index, this.circleAngle);
                                break;
                            default:
                                switch (i3) {
                                    case 69:
                                        this.widthPercent = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 70:
                                        this.heightPercent = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                        break;
                                    case 71:
                                        Log.e(ConstraintSet.TAG, "CURRENTLY UNSUPPORTED");
                                        break;
                                    case 72:
                                        this.mBarrierDirection = typedArrayObtainStyledAttributes.getInt(index, this.mBarrierDirection);
                                        break;
                                    case 73:
                                        this.mBarrierMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.mBarrierMargin);
                                        break;
                                    case 74:
                                        this.mReferenceIdString = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 75:
                                        this.mBarrierAllowsGoneWidgets = typedArrayObtainStyledAttributes.getBoolean(index, this.mBarrierAllowsGoneWidgets);
                                        break;
                                    case 76:
                                        this.mWrapBehavior = typedArrayObtainStyledAttributes.getInt(index, this.mWrapBehavior);
                                        break;
                                    case 77:
                                        this.baselineToTop = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.baselineToTop);
                                        break;
                                    case 78:
                                        this.baselineToBottom = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.baselineToBottom);
                                        break;
                                    case 79:
                                        this.goneBaselineMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.goneBaselineMargin);
                                        break;
                                    case 80:
                                        this.baselineMargin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.baselineMargin);
                                        break;
                                    case 81:
                                        this.widthDefault = typedArrayObtainStyledAttributes.getInt(index, this.widthDefault);
                                        break;
                                    case 82:
                                        this.heightDefault = typedArrayObtainStyledAttributes.getInt(index, this.heightDefault);
                                        break;
                                    case 83:
                                        this.heightMax = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.heightMax);
                                        break;
                                    case 84:
                                        this.widthMax = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.widthMax);
                                        break;
                                    case 85:
                                        this.heightMin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.heightMin);
                                        break;
                                    case 86:
                                        this.widthMin = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.widthMin);
                                        break;
                                    case 87:
                                        this.constrainedWidth = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedWidth);
                                        break;
                                    case 88:
                                        this.constrainedHeight = typedArrayObtainStyledAttributes.getBoolean(index, this.constrainedHeight);
                                        break;
                                    case 89:
                                        this.mConstraintTag = typedArrayObtainStyledAttributes.getString(index);
                                        break;
                                    case 90:
                                        this.guidelineUseRtl = typedArrayObtainStyledAttributes.getBoolean(index, this.guidelineUseRtl);
                                        break;
                                    case 91:
                                        Log.w(ConstraintSet.TAG, b.a(index, "unused attribute 0x", sMapToConstant));
                                        break;
                                    default:
                                        Log.w(ConstraintSet.TAG, b.a(index, "Unknown attribute 0x", sMapToConstant));
                                        break;
                                }
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: WazeSource */
    public class Motion {
        private static final int ANIMATE_CIRCLE_ANGLE_TO = 6;
        private static final int ANIMATE_RELATIVE_TO = 5;
        private static final int INTERPOLATOR_REFERENCE_ID = -2;
        private static final int INTERPOLATOR_UNDEFINED = -3;
        private static final int MOTION_DRAW_PATH = 4;
        private static final int MOTION_STAGGER = 7;
        private static final int PATH_MOTION_ARC = 2;
        private static final int QUANTIZE_MOTION_INTERPOLATOR = 10;
        private static final int QUANTIZE_MOTION_PHASE = 9;
        private static final int QUANTIZE_MOTION_STEPS = 8;
        private static final int SPLINE_STRING = -1;
        private static final int TRANSITION_EASING = 3;
        private static final int TRANSITION_PATH_ROTATE = 1;
        private static SparseIntArray sMapToConstant = new SparseIntArray();
        public boolean mApply = false;
        public int mAnimateRelativeTo = -1;
        public int mAnimateCircleAngleTo = 0;
        public String mTransitionEasing = null;
        public int mPathMotionArc = -1;
        public int mDrawPath = 0;
        public float mMotionStagger = Float.NaN;
        public int mPolarRelativeTo = -1;
        public float mPathRotate = Float.NaN;
        public float mQuantizeMotionPhase = Float.NaN;
        public int mQuantizeMotionSteps = -1;
        public String mQuantizeInterpolatorString = null;
        public int mQuantizeInterpolatorType = -3;
        public int mQuantizeInterpolatorID = -1;

        static {
            int[] iArr = R.styleable.ActionBar;
            sMapToConstant.append(3, 1);
            sMapToConstant.append(5, 2);
            sMapToConstant.append(9, 3);
            sMapToConstant.append(2, 4);
            sMapToConstant.append(1, 5);
            sMapToConstant.append(R.styleable.Motion_animateCircleAngleTo, 6);
            sMapToConstant.append(4, 7);
            sMapToConstant.append(8, 8);
            sMapToConstant.append(7, 9);
            sMapToConstant.append(6, 10);
        }

        public void copyFrom(Motion motion) {
            this.mApply = motion.mApply;
            this.mAnimateRelativeTo = motion.mAnimateRelativeTo;
            this.mTransitionEasing = motion.mTransitionEasing;
            this.mPathMotionArc = motion.mPathMotionArc;
            this.mDrawPath = motion.mDrawPath;
            this.mPathRotate = motion.mPathRotate;
            this.mMotionStagger = motion.mMotionStagger;
            this.mPolarRelativeTo = motion.mPolarRelativeTo;
        }

        void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Motion);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                switch (sMapToConstant.get(index)) {
                    case 1:
                        this.mPathRotate = typedArrayObtainStyledAttributes.getFloat(index, this.mPathRotate);
                        break;
                    case 2:
                        this.mPathMotionArc = typedArrayObtainStyledAttributes.getInt(index, this.mPathMotionArc);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.mTransitionEasing = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        } else {
                            this.mTransitionEasing = Easing.NAMED_EASING[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                            break;
                        }
                    case 4:
                        this.mDrawPath = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.mAnimateRelativeTo = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.mAnimateRelativeTo);
                        break;
                    case 6:
                        this.mAnimateCircleAngleTo = typedArrayObtainStyledAttributes.getInteger(index, this.mAnimateCircleAngleTo);
                        break;
                    case 7:
                        this.mMotionStagger = typedArrayObtainStyledAttributes.getFloat(index, this.mMotionStagger);
                        break;
                    case 8:
                        this.mQuantizeMotionSteps = typedArrayObtainStyledAttributes.getInteger(index, this.mQuantizeMotionSteps);
                        break;
                    case 9:
                        this.mQuantizeMotionPhase = typedArrayObtainStyledAttributes.getFloat(index, this.mQuantizeMotionPhase);
                        break;
                    case 10:
                        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(index);
                        if (typedValuePeekValue.type == 1) {
                            int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                            this.mQuantizeInterpolatorID = resourceId;
                            if (resourceId != -1) {
                                this.mQuantizeInterpolatorType = -2;
                                break;
                            } else {
                                break;
                            }
                        } else if (typedValuePeekValue.type == 3) {
                            String string = typedArrayObtainStyledAttributes.getString(index);
                            this.mQuantizeInterpolatorString = string;
                            if (string.indexOf(DomExceptionUtils.SEPARATOR) > 0) {
                                this.mQuantizeInterpolatorID = typedArrayObtainStyledAttributes.getResourceId(index, -1);
                                this.mQuantizeInterpolatorType = -2;
                                break;
                            } else {
                                this.mQuantizeInterpolatorType = -1;
                                break;
                            }
                        } else {
                            this.mQuantizeInterpolatorType = typedArrayObtainStyledAttributes.getInteger(index, this.mQuantizeInterpolatorID);
                            break;
                        }
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: WazeSource */
    public class PropertySet {
        public boolean mApply = false;
        public int visibility = 0;
        public int mVisibilityMode = 0;
        public float alpha = 1.0f;
        public float mProgress = Float.NaN;

        public void copyFrom(PropertySet propertySet) {
            this.mApply = propertySet.mApply;
            this.visibility = propertySet.visibility;
            this.alpha = propertySet.alpha;
            this.mProgress = propertySet.mProgress;
            this.mVisibilityMode = propertySet.mVisibilityMode;
        }

        void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PropertySet);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                if (index == 1) {
                    this.alpha = typedArrayObtainStyledAttributes.getFloat(1, this.alpha);
                } else if (index == R.styleable.PropertySet_android_visibility) {
                    this.visibility = typedArrayObtainStyledAttributes.getInt(index, this.visibility);
                    this.visibility = ConstraintSet.VISIBILITY_FLAGS[this.visibility];
                } else if (index == 4) {
                    this.mVisibilityMode = typedArrayObtainStyledAttributes.getInt(4, this.mVisibilityMode);
                } else if (index == 3) {
                    this.mProgress = typedArrayObtainStyledAttributes.getFloat(3, this.mProgress);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* compiled from: WazeSource */
    public class Transform {
        private static final int ELEVATION = 11;
        private static final int ROTATION = 1;
        private static final int ROTATION_X = 2;
        private static final int ROTATION_Y = 3;
        private static final int SCALE_X = 4;
        private static final int SCALE_Y = 5;
        private static final int TRANSFORM_PIVOT_TARGET = 12;
        private static final int TRANSFORM_PIVOT_X = 6;
        private static final int TRANSFORM_PIVOT_Y = 7;
        private static final int TRANSLATION_X = 8;
        private static final int TRANSLATION_Y = 9;
        private static final int TRANSLATION_Z = 10;
        private static SparseIntArray sMapToConstant = new SparseIntArray();
        public boolean mApply = false;
        public float rotation = 0.0f;
        public float rotationX = 0.0f;
        public float rotationY = 0.0f;
        public float scaleX = 1.0f;
        public float scaleY = 1.0f;
        public float transformPivotX = Float.NaN;
        public float transformPivotY = Float.NaN;
        public int transformPivotTarget = -1;
        public float translationX = 0.0f;
        public float translationY = 0.0f;
        public float translationZ = 0.0f;
        public boolean applyElevation = false;
        public float elevation = 0.0f;

        static {
            int[] iArr = R.styleable.ActionBar;
            sMapToConstant.append(6, 1);
            sMapToConstant.append(7, 2);
            sMapToConstant.append(8, 3);
            sMapToConstant.append(4, 4);
            sMapToConstant.append(5, 5);
            sMapToConstant.append(R.styleable.Transform_android_transformPivotX, 6);
            sMapToConstant.append(1, 7);
            sMapToConstant.append(2, 8);
            sMapToConstant.append(3, 9);
            sMapToConstant.append(9, 10);
            sMapToConstant.append(10, 11);
            sMapToConstant.append(11, 12);
        }

        public void copyFrom(Transform transform) {
            this.mApply = transform.mApply;
            this.rotation = transform.rotation;
            this.rotationX = transform.rotationX;
            this.rotationY = transform.rotationY;
            this.scaleX = transform.scaleX;
            this.scaleY = transform.scaleY;
            this.transformPivotX = transform.transformPivotX;
            this.transformPivotY = transform.transformPivotY;
            this.transformPivotTarget = transform.transformPivotTarget;
            this.translationX = transform.translationX;
            this.translationY = transform.translationY;
            this.translationZ = transform.translationZ;
            this.applyElevation = transform.applyElevation;
            this.elevation = transform.elevation;
        }

        void fillFromAttributeList(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.Transform);
            this.mApply = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i2);
                switch (sMapToConstant.get(index)) {
                    case 1:
                        this.rotation = typedArrayObtainStyledAttributes.getFloat(index, this.rotation);
                        break;
                    case 2:
                        this.rotationX = typedArrayObtainStyledAttributes.getFloat(index, this.rotationX);
                        break;
                    case 3:
                        this.rotationY = typedArrayObtainStyledAttributes.getFloat(index, this.rotationY);
                        break;
                    case 4:
                        this.scaleX = typedArrayObtainStyledAttributes.getFloat(index, this.scaleX);
                        break;
                    case 5:
                        this.scaleY = typedArrayObtainStyledAttributes.getFloat(index, this.scaleY);
                        break;
                    case 6:
                        this.transformPivotX = typedArrayObtainStyledAttributes.getDimension(index, this.transformPivotX);
                        break;
                    case 7:
                        this.transformPivotY = typedArrayObtainStyledAttributes.getDimension(index, this.transformPivotY);
                        break;
                    case 8:
                        this.translationX = typedArrayObtainStyledAttributes.getDimension(index, this.translationX);
                        break;
                    case 9:
                        this.translationY = typedArrayObtainStyledAttributes.getDimension(index, this.translationY);
                        break;
                    case 10:
                        this.translationZ = typedArrayObtainStyledAttributes.getDimension(index, this.translationZ);
                        break;
                    case 11:
                        this.applyElevation = true;
                        this.elevation = typedArrayObtainStyledAttributes.getDimension(index, this.elevation);
                        break;
                    case 12:
                        this.transformPivotTarget = ConstraintSet.lookupID(typedArrayObtainStyledAttributes, index, this.transformPivotTarget);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        int[] iArr = R.styleable.ActionBar;
        sMapToConstant.append(82, 25);
        sMapToConstant.append(83, 26);
        sMapToConstant.append(85, 29);
        sMapToConstant.append(86, 30);
        sMapToConstant.append(92, 36);
        sMapToConstant.append(91, 35);
        sMapToConstant.append(63, 4);
        sMapToConstant.append(62, 3);
        sMapToConstant.append(58, 1);
        sMapToConstant.append(60, 91);
        sMapToConstant.append(59, 92);
        sMapToConstant.append(101, 6);
        sMapToConstant.append(102, 7);
        sMapToConstant.append(70, 17);
        sMapToConstant.append(71, 18);
        sMapToConstant.append(72, 19);
        sMapToConstant.append(54, 99);
        sMapToConstant.append(R.styleable.Constraint_android_orientation, 27);
        sMapToConstant.append(87, 32);
        sMapToConstant.append(88, 33);
        sMapToConstant.append(69, 10);
        sMapToConstant.append(68, 9);
        sMapToConstant.append(106, 13);
        sMapToConstant.append(109, 16);
        sMapToConstant.append(107, 14);
        sMapToConstant.append(104, 11);
        sMapToConstant.append(108, 15);
        sMapToConstant.append(105, 12);
        sMapToConstant.append(95, 40);
        sMapToConstant.append(80, 39);
        sMapToConstant.append(79, 41);
        sMapToConstant.append(94, 42);
        sMapToConstant.append(78, 20);
        sMapToConstant.append(93, 37);
        sMapToConstant.append(67, 5);
        sMapToConstant.append(81, 87);
        sMapToConstant.append(90, 87);
        sMapToConstant.append(84, 87);
        sMapToConstant.append(61, 87);
        sMapToConstant.append(57, 87);
        sMapToConstant.append(5, 24);
        sMapToConstant.append(7, 28);
        sMapToConstant.append(23, 31);
        sMapToConstant.append(24, 8);
        sMapToConstant.append(6, 34);
        sMapToConstant.append(8, 2);
        sMapToConstant.append(3, 23);
        sMapToConstant.append(4, 21);
        sMapToConstant.append(96, 95);
        sMapToConstant.append(73, 96);
        sMapToConstant.append(2, 22);
        sMapToConstant.append(13, 43);
        sMapToConstant.append(26, 44);
        sMapToConstant.append(21, 45);
        sMapToConstant.append(22, 46);
        sMapToConstant.append(20, 60);
        sMapToConstant.append(18, 47);
        sMapToConstant.append(19, 48);
        sMapToConstant.append(14, 49);
        sMapToConstant.append(15, 50);
        sMapToConstant.append(16, 51);
        sMapToConstant.append(17, 52);
        sMapToConstant.append(25, 53);
        sMapToConstant.append(97, 54);
        sMapToConstant.append(74, 55);
        sMapToConstant.append(98, 56);
        sMapToConstant.append(75, 57);
        sMapToConstant.append(99, 58);
        sMapToConstant.append(76, 59);
        sMapToConstant.append(64, 61);
        sMapToConstant.append(66, 62);
        sMapToConstant.append(65, 63);
        sMapToConstant.append(28, 64);
        sMapToConstant.append(121, 65);
        sMapToConstant.append(35, 66);
        sMapToConstant.append(122, 67);
        sMapToConstant.append(113, 79);
        sMapToConstant.append(1, 38);
        sMapToConstant.append(112, 68);
        sMapToConstant.append(100, 69);
        sMapToConstant.append(77, 70);
        sMapToConstant.append(111, 97);
        sMapToConstant.append(32, 71);
        sMapToConstant.append(30, 72);
        sMapToConstant.append(31, 73);
        sMapToConstant.append(33, 74);
        sMapToConstant.append(29, 75);
        sMapToConstant.append(114, 76);
        sMapToConstant.append(89, 77);
        sMapToConstant.append(123, 78);
        sMapToConstant.append(56, 80);
        sMapToConstant.append(55, 81);
        sMapToConstant.append(116, 82);
        sMapToConstant.append(120, 83);
        sMapToConstant.append(119, 84);
        sMapToConstant.append(118, 85);
        sMapToConstant.append(117, 86);
        sOverrideMapToConstant.append(85, 6);
        sOverrideMapToConstant.append(85, 7);
        sOverrideMapToConstant.append(R.styleable.ConstraintOverride_android_orientation, 27);
        sOverrideMapToConstant.append(89, 13);
        sOverrideMapToConstant.append(92, 16);
        sOverrideMapToConstant.append(90, 14);
        sOverrideMapToConstant.append(87, 11);
        sOverrideMapToConstant.append(91, 15);
        sOverrideMapToConstant.append(88, 12);
        sOverrideMapToConstant.append(78, 40);
        sOverrideMapToConstant.append(71, 39);
        sOverrideMapToConstant.append(70, 41);
        sOverrideMapToConstant.append(77, 42);
        sOverrideMapToConstant.append(69, 20);
        sOverrideMapToConstant.append(76, 37);
        sOverrideMapToConstant.append(60, 5);
        sOverrideMapToConstant.append(72, 87);
        sOverrideMapToConstant.append(75, 87);
        sOverrideMapToConstant.append(73, 87);
        sOverrideMapToConstant.append(57, 87);
        sOverrideMapToConstant.append(56, 87);
        sOverrideMapToConstant.append(5, 24);
        sOverrideMapToConstant.append(7, 28);
        sOverrideMapToConstant.append(23, 31);
        sOverrideMapToConstant.append(24, 8);
        sOverrideMapToConstant.append(6, 34);
        sOverrideMapToConstant.append(8, 2);
        sOverrideMapToConstant.append(3, 23);
        sOverrideMapToConstant.append(4, 21);
        sOverrideMapToConstant.append(79, 95);
        sOverrideMapToConstant.append(64, 96);
        sOverrideMapToConstant.append(2, 22);
        sOverrideMapToConstant.append(13, 43);
        sOverrideMapToConstant.append(26, 44);
        sOverrideMapToConstant.append(21, 45);
        sOverrideMapToConstant.append(22, 46);
        sOverrideMapToConstant.append(20, 60);
        sOverrideMapToConstant.append(18, 47);
        sOverrideMapToConstant.append(19, 48);
        sOverrideMapToConstant.append(14, 49);
        sOverrideMapToConstant.append(15, 50);
        sOverrideMapToConstant.append(16, 51);
        sOverrideMapToConstant.append(17, 52);
        sOverrideMapToConstant.append(25, 53);
        sOverrideMapToConstant.append(80, 54);
        sOverrideMapToConstant.append(65, 55);
        sOverrideMapToConstant.append(81, 56);
        sOverrideMapToConstant.append(66, 57);
        sOverrideMapToConstant.append(82, 58);
        sOverrideMapToConstant.append(67, 59);
        sOverrideMapToConstant.append(59, 62);
        sOverrideMapToConstant.append(58, 63);
        sOverrideMapToConstant.append(28, 64);
        sOverrideMapToConstant.append(105, 65);
        sOverrideMapToConstant.append(34, 66);
        sOverrideMapToConstant.append(106, 67);
        sOverrideMapToConstant.append(96, 79);
        sOverrideMapToConstant.append(1, 38);
        sOverrideMapToConstant.append(97, 98);
        sOverrideMapToConstant.append(95, 68);
        sOverrideMapToConstant.append(83, 69);
        sOverrideMapToConstant.append(68, 70);
        sOverrideMapToConstant.append(32, 71);
        sOverrideMapToConstant.append(30, 72);
        sOverrideMapToConstant.append(31, 73);
        sOverrideMapToConstant.append(33, 74);
        sOverrideMapToConstant.append(29, 75);
        sOverrideMapToConstant.append(98, 76);
        sOverrideMapToConstant.append(74, 77);
        sOverrideMapToConstant.append(107, 78);
        sOverrideMapToConstant.append(55, 80);
        sOverrideMapToConstant.append(54, 81);
        sOverrideMapToConstant.append(100, 82);
        sOverrideMapToConstant.append(104, 83);
        sOverrideMapToConstant.append(103, 84);
        sOverrideMapToConstant.append(102, 85);
        sOverrideMapToConstant.append(101, 86);
        sOverrideMapToConstant.append(94, 97);
    }

    private void addAttributes(ConstraintAttribute.AttributeType attributeType, String... strArr) {
        for (int i2 = 0; i2 < strArr.length; i2++) {
            if (this.mSavedAttributes.containsKey(strArr[i2])) {
                ConstraintAttribute constraintAttribute = this.mSavedAttributes.get(strArr[i2]);
                if (constraintAttribute != null && constraintAttribute.getType() != attributeType) {
                    throw new IllegalArgumentException("ConstraintAttribute is already a ".concat(String.valueOf(constraintAttribute.getType().name())));
                }
            } else {
                String str = strArr[i2];
                this.mSavedAttributes.put(str, new ConstraintAttribute(str, attributeType));
            }
        }
    }

    public static Constraint buildDelta(Context context, XmlPullParser xmlPullParser) {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        Constraint constraint = new Constraint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSetAsAttributeSet, R.styleable.ConstraintOverride);
        populateOverride(constraint, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return constraint;
    }

    private int[] convertReferenceString(View view, String str) throws IllegalAccessException, IllegalArgumentException {
        int length;
        int iIntValue;
        Object designInformation;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i2 = 0;
        int i3 = 0;
        while (true) {
            length = strArrSplit.length;
            if (i2 >= length) {
                break;
            }
            String strTrim = strArrSplit[i2].trim();
            try {
                iIntValue = R.id.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, TtmlNode.ATTR_ID, context.getPackageName());
            }
            if (iIntValue == 0) {
                iIntValue = (view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (designInformation = ((ConstraintLayout) view.getParent()).getDesignInformation(0, strTrim)) != null && (designInformation instanceof Integer)) ? ((Integer) designInformation).intValue() : 0;
            }
            iArr[i3] = iIntValue;
            i2++;
            i3++;
        }
        return i3 != length ? Arrays.copyOf(iArr, i3) : iArr;
    }

    private void createHorizontalChain(int i2, int i3, int i4, int i5, int[] iArr, float[] fArr, int i6, int i7, int i8) {
        int length = iArr.length;
        if (length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            get(iArr[0]).layout.horizontalWeight = fArr[0];
        }
        get(iArr[0]).layout.horizontalChainStyle = i6;
        connect(iArr[0], i7, i2, i3, -1);
        int i9 = 1;
        while (true) {
            int length2 = iArr.length;
            if (i9 >= length2) {
                connect(iArr[length2 - 1], i8, i4, i5, -1);
                return;
            }
            int i10 = i9 - 1;
            connect(iArr[i9], i7, iArr[i10], i8, -1);
            connect(iArr[i10], i8, iArr[i9], i7, -1);
            if (fArr != null) {
                get(iArr[i9]).layout.horizontalWeight = fArr[i9];
            }
            i9++;
        }
    }

    private Constraint fillFromAttributeList(Context context, AttributeSet attributeSet, boolean z) {
        Constraint constraint = new Constraint();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, z ? R.styleable.ConstraintOverride : R.styleable.Constraint);
        populateConstraint(constraint, typedArrayObtainStyledAttributes, z);
        typedArrayObtainStyledAttributes.recycle();
        return constraint;
    }

    private Constraint get(int i2) {
        HashMap<Integer, Constraint> map = this.mConstraints;
        Integer numValueOf = Integer.valueOf(i2);
        if (!map.containsKey(numValueOf)) {
            this.mConstraints.put(numValueOf, new Constraint());
        }
        return this.mConstraints.get(numValueOf);
    }

    static String getDebugName(int i2) {
        for (Field field : ConstraintSet.class.getDeclaredFields()) {
            if (field.getName().contains("_") && field.getType() == Integer.TYPE && Modifier.isStatic(field.getModifiers()) && Modifier.isFinal(field.getModifiers())) {
                try {
                    if (field.getInt(null) == i2) {
                        return field.getName();
                    }
                    continue;
                } catch (IllegalAccessException e2) {
                    Log.e(TAG, "Error accessing ConstraintSet field", e2);
                }
            }
        }
        return "UNKNOWN";
    }

    static String getLine(Context context, int i2, XmlPullParser xmlPullParser) {
        return ".(" + Debug.getName(context, i2) + ".xml:" + xmlPullParser.getLineNumber() + ") \"" + xmlPullParser.getName() + "\"";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int lookupID(TypedArray typedArray, int i2, int i3) {
        int resourceId = typedArray.getResourceId(i2, i3);
        return resourceId == -1 ? typedArray.getInt(i2, -1) : resourceId;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0040  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void parseDimensionConstraints(java.lang.Object r4, android.content.res.TypedArray r5, int r6, int r7) {
        /*
            if (r4 != 0) goto L4
            goto L6f
        L4:
            android.util.TypedValue r0 = r5.peekValue(r6)
            int r0 = r0.type
            r1 = 3
            if (r0 == r1) goto L70
            r1 = 5
            r2 = 0
            if (r0 == r1) goto L27
            int r5 = r5.getInt(r6, r2)
            r6 = -4
            r0 = -2
            if (r5 == r6) goto L23
            r6 = -3
            if (r5 == r6) goto L21
            if (r5 == r0) goto L2b
            r6 = -1
            if (r5 == r6) goto L2b
        L21:
            r5 = r2
            goto L2e
        L23:
            r2 = 1
            r5 = r2
            r2 = r0
            goto L2e
        L27:
            int r5 = r5.getDimensionPixelSize(r6, r2)
        L2b:
            r3 = r2
            r2 = r5
            r5 = r3
        L2e:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintLayout.LayoutParams
            if (r6 == 0) goto L40
            androidx.constraintlayout.widget.ConstraintLayout$LayoutParams r4 = (androidx.constraintlayout.widget.ConstraintLayout.LayoutParams) r4
            if (r7 != 0) goto L3b
            r4.width = r2
            r4.constrainedWidth = r5
            return
        L3b:
            r4.height = r2
            r4.constrainedHeight = r5
            return
        L40:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintSet.Layout
            if (r6 == 0) goto L52
            androidx.constraintlayout.widget.ConstraintSet$Layout r4 = (androidx.constraintlayout.widget.ConstraintSet.Layout) r4
            if (r7 != 0) goto L4d
            r4.mWidth = r2
            r4.constrainedWidth = r5
            return
        L4d:
            r4.mHeight = r2
            r4.constrainedHeight = r5
            return
        L52:
            boolean r6 = r4 instanceof androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta
            if (r6 == 0) goto L6f
            androidx.constraintlayout.widget.ConstraintSet$Constraint$Delta r4 = (androidx.constraintlayout.widget.ConstraintSet.Constraint.Delta) r4
            if (r7 != 0) goto L65
            r6 = 23
            r4.add(r6, r2)
            r6 = 80
            r4.add(r6, r5)
            return
        L65:
            r6 = 21
            r4.add(r6, r2)
            r6 = 81
            r4.add(r6, r5)
        L6f:
            return
        L70:
            java.lang.String r5 = r5.getString(r6)
            parseDimensionConstraintsString(r4, r5, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.parseDimensionConstraints(java.lang.Object, android.content.res.TypedArray, int, int):void");
    }

    static void parseDimensionConstraintsString(Object obj, String str, int i2) throws NumberFormatException {
        int iIndexOf;
        if (str != null && (iIndexOf = str.indexOf(61)) > 0 && iIndexOf < str.length() - 1) {
            String strSubstring = str.substring(0, iIndexOf);
            String strSubstring2 = str.substring(iIndexOf + 1);
            if (strSubstring2.length() > 0) {
                String strTrim = strSubstring.trim();
                String strTrim2 = strSubstring2.trim();
                if (KEY_RATIO.equalsIgnoreCase(strTrim)) {
                    if (obj instanceof ConstraintLayout.LayoutParams) {
                        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) obj;
                        if (i2 == 0) {
                            layoutParams.width = 0;
                        } else {
                            layoutParams.height = 0;
                        }
                        parseDimensionRatioString(layoutParams, strTrim2);
                        return;
                    }
                    if (obj instanceof Layout) {
                        ((Layout) obj).dimensionRatio = strTrim2;
                        return;
                    } else {
                        if (obj instanceof Constraint.Delta) {
                            ((Constraint.Delta) obj).add(5, strTrim2);
                            return;
                        }
                        return;
                    }
                }
                try {
                    if (KEY_WEIGHT.equalsIgnoreCase(strTrim)) {
                        float f2 = Float.parseFloat(strTrim2);
                        if (obj instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) obj;
                            if (i2 == 0) {
                                layoutParams2.width = 0;
                                layoutParams2.horizontalWeight = f2;
                                return;
                            } else {
                                layoutParams2.height = 0;
                                layoutParams2.verticalWeight = f2;
                                return;
                            }
                        }
                        if (obj instanceof Layout) {
                            Layout layout = (Layout) obj;
                            if (i2 == 0) {
                                layout.mWidth = 0;
                                layout.horizontalWeight = f2;
                                return;
                            } else {
                                layout.mHeight = 0;
                                layout.verticalWeight = f2;
                                return;
                            }
                        }
                        if (obj instanceof Constraint.Delta) {
                            Constraint.Delta delta = (Constraint.Delta) obj;
                            if (i2 == 0) {
                                delta.add(23, 0);
                                delta.add(39, f2);
                                return;
                            } else {
                                delta.add(21, 0);
                                delta.add(40, f2);
                                return;
                            }
                        }
                        return;
                    }
                    if (KEY_PERCENT_PARENT.equalsIgnoreCase(strTrim)) {
                        float fMax = Math.max(0.0f, Math.min(1.0f, Float.parseFloat(strTrim2)));
                        if (obj instanceof ConstraintLayout.LayoutParams) {
                            ConstraintLayout.LayoutParams layoutParams3 = (ConstraintLayout.LayoutParams) obj;
                            if (i2 == 0) {
                                layoutParams3.width = 0;
                                layoutParams3.matchConstraintPercentWidth = fMax;
                                layoutParams3.matchConstraintDefaultWidth = 2;
                                return;
                            } else {
                                layoutParams3.height = 0;
                                layoutParams3.matchConstraintPercentHeight = fMax;
                                layoutParams3.matchConstraintDefaultHeight = 2;
                                return;
                            }
                        }
                        if (obj instanceof Layout) {
                            Layout layout2 = (Layout) obj;
                            if (i2 == 0) {
                                layout2.mWidth = 0;
                                layout2.widthPercent = fMax;
                                layout2.widthDefault = 2;
                                return;
                            } else {
                                layout2.mHeight = 0;
                                layout2.heightPercent = fMax;
                                layout2.heightDefault = 2;
                                return;
                            }
                        }
                        if (obj instanceof Constraint.Delta) {
                            Constraint.Delta delta2 = (Constraint.Delta) obj;
                            if (i2 == 0) {
                                delta2.add(23, 0);
                                delta2.add(54, 2);
                            } else {
                                delta2.add(21, 0);
                                delta2.add(55, 2);
                            }
                        }
                    }
                } catch (NumberFormatException unused) {
                }
            }
        }
    }

    static void parseDimensionRatioString(ConstraintLayout.LayoutParams layoutParams, String str) {
        int i2;
        int i3 = -1;
        float fAbs = Float.NaN;
        if (str != null) {
            int iIndexOf = str.indexOf(44);
            int length = str.length();
            if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                i2 = -1;
            } else {
                String strSubstring = str.substring(0, iIndexOf);
                i = iIndexOf + 1;
                i2 = strSubstring.equalsIgnoreCase(ExifInterface.LONGITUDE_WEST) ? 0 : strSubstring.equalsIgnoreCase("H") ? 1 : -1;
            }
            int iIndexOf2 = str.indexOf(58);
            if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                String strSubstring2 = str.substring(i);
                if (strSubstring2.length() > 0) {
                    fAbs = Float.parseFloat(strSubstring2);
                }
                i3 = i2;
            } else {
                String strSubstring3 = str.substring(i, iIndexOf2);
                String strSubstring4 = str.substring(iIndexOf2 + 1);
                if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                    float f2 = Float.parseFloat(strSubstring3);
                    float f3 = Float.parseFloat(strSubstring4);
                    if (f2 > 0.0f && f3 > 0.0f) {
                        fAbs = i2 == 1 ? Math.abs(f3 / f2) : Math.abs(f2 / f3);
                    }
                }
                i3 = i2;
            }
        }
        layoutParams.dimensionRatio = str;
        layoutParams.mDimensionRatioValue = fAbs;
        layoutParams.mDimensionRatioSide = i3;
    }

    private void populateConstraint(Constraint constraint, TypedArray typedArray, boolean z) {
        if (z) {
            populateOverride(constraint, typedArray);
            return;
        }
        int indexCount = typedArray.getIndexCount();
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            int[] iArr = R.styleable.ActionBar;
            if (index != 1 && index != 23 && index != 24) {
                constraint.motion.mApply = true;
                constraint.layout.mApply = true;
                constraint.propertySet.mApply = true;
                constraint.transform.mApply = true;
            }
            switch (sMapToConstant.get(index)) {
                case 1:
                    Layout layout = constraint.layout;
                    layout.baselineToBaseline = lookupID(typedArray, index, layout.baselineToBaseline);
                    break;
                case 2:
                    Layout layout2 = constraint.layout;
                    layout2.bottomMargin = typedArray.getDimensionPixelSize(index, layout2.bottomMargin);
                    break;
                case 3:
                    Layout layout3 = constraint.layout;
                    layout3.bottomToBottom = lookupID(typedArray, index, layout3.bottomToBottom);
                    break;
                case 4:
                    Layout layout4 = constraint.layout;
                    layout4.bottomToTop = lookupID(typedArray, index, layout4.bottomToTop);
                    break;
                case 5:
                    constraint.layout.dimensionRatio = typedArray.getString(index);
                    break;
                case 6:
                    Layout layout5 = constraint.layout;
                    layout5.editorAbsoluteX = typedArray.getDimensionPixelOffset(index, layout5.editorAbsoluteX);
                    break;
                case 7:
                    Layout layout6 = constraint.layout;
                    layout6.editorAbsoluteY = typedArray.getDimensionPixelOffset(index, layout6.editorAbsoluteY);
                    break;
                case 8:
                    Layout layout7 = constraint.layout;
                    layout7.endMargin = typedArray.getDimensionPixelSize(index, layout7.endMargin);
                    break;
                case 9:
                    Layout layout8 = constraint.layout;
                    layout8.endToEnd = lookupID(typedArray, index, layout8.endToEnd);
                    break;
                case 10:
                    Layout layout9 = constraint.layout;
                    layout9.endToStart = lookupID(typedArray, index, layout9.endToStart);
                    break;
                case 11:
                    Layout layout10 = constraint.layout;
                    layout10.goneBottomMargin = typedArray.getDimensionPixelSize(index, layout10.goneBottomMargin);
                    break;
                case 12:
                    Layout layout11 = constraint.layout;
                    layout11.goneEndMargin = typedArray.getDimensionPixelSize(index, layout11.goneEndMargin);
                    break;
                case 13:
                    Layout layout12 = constraint.layout;
                    layout12.goneLeftMargin = typedArray.getDimensionPixelSize(index, layout12.goneLeftMargin);
                    break;
                case 14:
                    Layout layout13 = constraint.layout;
                    layout13.goneRightMargin = typedArray.getDimensionPixelSize(index, layout13.goneRightMargin);
                    break;
                case 15:
                    Layout layout14 = constraint.layout;
                    layout14.goneStartMargin = typedArray.getDimensionPixelSize(index, layout14.goneStartMargin);
                    break;
                case 16:
                    Layout layout15 = constraint.layout;
                    layout15.goneTopMargin = typedArray.getDimensionPixelSize(index, layout15.goneTopMargin);
                    break;
                case 17:
                    Layout layout16 = constraint.layout;
                    layout16.guideBegin = typedArray.getDimensionPixelOffset(index, layout16.guideBegin);
                    break;
                case 18:
                    Layout layout17 = constraint.layout;
                    layout17.guideEnd = typedArray.getDimensionPixelOffset(index, layout17.guideEnd);
                    break;
                case 19:
                    Layout layout18 = constraint.layout;
                    layout18.guidePercent = typedArray.getFloat(index, layout18.guidePercent);
                    break;
                case 20:
                    Layout layout19 = constraint.layout;
                    layout19.horizontalBias = typedArray.getFloat(index, layout19.horizontalBias);
                    break;
                case 21:
                    Layout layout20 = constraint.layout;
                    layout20.mHeight = typedArray.getLayoutDimension(index, layout20.mHeight);
                    break;
                case 22:
                    PropertySet propertySet = constraint.propertySet;
                    propertySet.visibility = typedArray.getInt(index, propertySet.visibility);
                    PropertySet propertySet2 = constraint.propertySet;
                    propertySet2.visibility = VISIBILITY_FLAGS[propertySet2.visibility];
                    break;
                case 23:
                    Layout layout21 = constraint.layout;
                    layout21.mWidth = typedArray.getLayoutDimension(index, layout21.mWidth);
                    break;
                case 24:
                    Layout layout22 = constraint.layout;
                    layout22.leftMargin = typedArray.getDimensionPixelSize(index, layout22.leftMargin);
                    break;
                case 25:
                    Layout layout23 = constraint.layout;
                    layout23.leftToLeft = lookupID(typedArray, index, layout23.leftToLeft);
                    break;
                case 26:
                    Layout layout24 = constraint.layout;
                    layout24.leftToRight = lookupID(typedArray, index, layout24.leftToRight);
                    break;
                case 27:
                    Layout layout25 = constraint.layout;
                    layout25.orientation = typedArray.getInt(index, layout25.orientation);
                    break;
                case 28:
                    Layout layout26 = constraint.layout;
                    layout26.rightMargin = typedArray.getDimensionPixelSize(index, layout26.rightMargin);
                    break;
                case 29:
                    Layout layout27 = constraint.layout;
                    layout27.rightToLeft = lookupID(typedArray, index, layout27.rightToLeft);
                    break;
                case 30:
                    Layout layout28 = constraint.layout;
                    layout28.rightToRight = lookupID(typedArray, index, layout28.rightToRight);
                    break;
                case 31:
                    Layout layout29 = constraint.layout;
                    layout29.startMargin = typedArray.getDimensionPixelSize(index, layout29.startMargin);
                    break;
                case 32:
                    Layout layout30 = constraint.layout;
                    layout30.startToEnd = lookupID(typedArray, index, layout30.startToEnd);
                    break;
                case 33:
                    Layout layout31 = constraint.layout;
                    layout31.startToStart = lookupID(typedArray, index, layout31.startToStart);
                    break;
                case 34:
                    Layout layout32 = constraint.layout;
                    layout32.topMargin = typedArray.getDimensionPixelSize(index, layout32.topMargin);
                    break;
                case 35:
                    Layout layout33 = constraint.layout;
                    layout33.topToBottom = lookupID(typedArray, index, layout33.topToBottom);
                    break;
                case 36:
                    Layout layout34 = constraint.layout;
                    layout34.topToTop = lookupID(typedArray, index, layout34.topToTop);
                    break;
                case 37:
                    Layout layout35 = constraint.layout;
                    layout35.verticalBias = typedArray.getFloat(index, layout35.verticalBias);
                    break;
                case 38:
                    constraint.mViewId = typedArray.getResourceId(index, constraint.mViewId);
                    break;
                case 39:
                    Layout layout36 = constraint.layout;
                    layout36.horizontalWeight = typedArray.getFloat(index, layout36.horizontalWeight);
                    break;
                case 40:
                    Layout layout37 = constraint.layout;
                    layout37.verticalWeight = typedArray.getFloat(index, layout37.verticalWeight);
                    break;
                case 41:
                    Layout layout38 = constraint.layout;
                    layout38.horizontalChainStyle = typedArray.getInt(index, layout38.horizontalChainStyle);
                    break;
                case 42:
                    Layout layout39 = constraint.layout;
                    layout39.verticalChainStyle = typedArray.getInt(index, layout39.verticalChainStyle);
                    break;
                case 43:
                    PropertySet propertySet3 = constraint.propertySet;
                    propertySet3.alpha = typedArray.getFloat(index, propertySet3.alpha);
                    break;
                case 44:
                    Transform transform = constraint.transform;
                    transform.applyElevation = true;
                    transform.elevation = typedArray.getDimension(index, transform.elevation);
                    break;
                case 45:
                    Transform transform2 = constraint.transform;
                    transform2.rotationX = typedArray.getFloat(index, transform2.rotationX);
                    break;
                case 46:
                    Transform transform3 = constraint.transform;
                    transform3.rotationY = typedArray.getFloat(index, transform3.rotationY);
                    break;
                case 47:
                    Transform transform4 = constraint.transform;
                    transform4.scaleX = typedArray.getFloat(index, transform4.scaleX);
                    break;
                case 48:
                    Transform transform5 = constraint.transform;
                    transform5.scaleY = typedArray.getFloat(index, transform5.scaleY);
                    break;
                case 49:
                    Transform transform6 = constraint.transform;
                    transform6.transformPivotX = typedArray.getDimension(index, transform6.transformPivotX);
                    break;
                case 50:
                    Transform transform7 = constraint.transform;
                    transform7.transformPivotY = typedArray.getDimension(index, transform7.transformPivotY);
                    break;
                case 51:
                    Transform transform8 = constraint.transform;
                    transform8.translationX = typedArray.getDimension(index, transform8.translationX);
                    break;
                case 52:
                    Transform transform9 = constraint.transform;
                    transform9.translationY = typedArray.getDimension(index, transform9.translationY);
                    break;
                case 53:
                    Transform transform10 = constraint.transform;
                    transform10.translationZ = typedArray.getDimension(index, transform10.translationZ);
                    break;
                case 54:
                    Layout layout40 = constraint.layout;
                    layout40.widthDefault = typedArray.getInt(index, layout40.widthDefault);
                    break;
                case 55:
                    Layout layout41 = constraint.layout;
                    layout41.heightDefault = typedArray.getInt(index, layout41.heightDefault);
                    break;
                case 56:
                    Layout layout42 = constraint.layout;
                    layout42.widthMax = typedArray.getDimensionPixelSize(index, layout42.widthMax);
                    break;
                case 57:
                    Layout layout43 = constraint.layout;
                    layout43.heightMax = typedArray.getDimensionPixelSize(index, layout43.heightMax);
                    break;
                case 58:
                    Layout layout44 = constraint.layout;
                    layout44.widthMin = typedArray.getDimensionPixelSize(index, layout44.widthMin);
                    break;
                case 59:
                    Layout layout45 = constraint.layout;
                    layout45.heightMin = typedArray.getDimensionPixelSize(index, layout45.heightMin);
                    break;
                case 60:
                    Transform transform11 = constraint.transform;
                    transform11.rotation = typedArray.getFloat(index, transform11.rotation);
                    break;
                case 61:
                    Layout layout46 = constraint.layout;
                    layout46.circleConstraint = lookupID(typedArray, index, layout46.circleConstraint);
                    break;
                case 62:
                    Layout layout47 = constraint.layout;
                    layout47.circleRadius = typedArray.getDimensionPixelSize(index, layout47.circleRadius);
                    break;
                case 63:
                    Layout layout48 = constraint.layout;
                    layout48.circleAngle = typedArray.getFloat(index, layout48.circleAngle);
                    break;
                case 64:
                    Motion motion = constraint.motion;
                    motion.mAnimateRelativeTo = lookupID(typedArray, index, motion.mAnimateRelativeTo);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        constraint.motion.mTransitionEasing = typedArray.getString(index);
                        break;
                    } else {
                        constraint.motion.mTransitionEasing = Easing.NAMED_EASING[typedArray.getInteger(index, 0)];
                        break;
                    }
                case 66:
                    constraint.motion.mDrawPath = typedArray.getInt(index, 0);
                    break;
                case 67:
                    Motion motion2 = constraint.motion;
                    motion2.mPathRotate = typedArray.getFloat(index, motion2.mPathRotate);
                    break;
                case 68:
                    PropertySet propertySet4 = constraint.propertySet;
                    propertySet4.mProgress = typedArray.getFloat(index, propertySet4.mProgress);
                    break;
                case 69:
                    constraint.layout.widthPercent = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    constraint.layout.heightPercent = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e(TAG, "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    Layout layout49 = constraint.layout;
                    layout49.mBarrierDirection = typedArray.getInt(index, layout49.mBarrierDirection);
                    break;
                case 73:
                    Layout layout50 = constraint.layout;
                    layout50.mBarrierMargin = typedArray.getDimensionPixelSize(index, layout50.mBarrierMargin);
                    break;
                case 74:
                    constraint.layout.mReferenceIdString = typedArray.getString(index);
                    break;
                case 75:
                    Layout layout51 = constraint.layout;
                    layout51.mBarrierAllowsGoneWidgets = typedArray.getBoolean(index, layout51.mBarrierAllowsGoneWidgets);
                    break;
                case 76:
                    Motion motion3 = constraint.motion;
                    motion3.mPathMotionArc = typedArray.getInt(index, motion3.mPathMotionArc);
                    break;
                case 77:
                    constraint.layout.mConstraintTag = typedArray.getString(index);
                    break;
                case 78:
                    PropertySet propertySet5 = constraint.propertySet;
                    propertySet5.mVisibilityMode = typedArray.getInt(index, propertySet5.mVisibilityMode);
                    break;
                case 79:
                    Motion motion4 = constraint.motion;
                    motion4.mMotionStagger = typedArray.getFloat(index, motion4.mMotionStagger);
                    break;
                case 80:
                    Layout layout52 = constraint.layout;
                    layout52.constrainedWidth = typedArray.getBoolean(index, layout52.constrainedWidth);
                    break;
                case 81:
                    Layout layout53 = constraint.layout;
                    layout53.constrainedHeight = typedArray.getBoolean(index, layout53.constrainedHeight);
                    break;
                case 82:
                    Motion motion5 = constraint.motion;
                    motion5.mAnimateCircleAngleTo = typedArray.getInteger(index, motion5.mAnimateCircleAngleTo);
                    break;
                case 83:
                    Transform transform12 = constraint.transform;
                    transform12.transformPivotTarget = lookupID(typedArray, index, transform12.transformPivotTarget);
                    break;
                case 84:
                    Motion motion6 = constraint.motion;
                    motion6.mQuantizeMotionSteps = typedArray.getInteger(index, motion6.mQuantizeMotionSteps);
                    break;
                case 85:
                    Motion motion7 = constraint.motion;
                    motion7.mQuantizeMotionPhase = typedArray.getFloat(index, motion7.mQuantizeMotionPhase);
                    break;
                case 86:
                    TypedValue typedValuePeekValue = typedArray.peekValue(index);
                    if (typedValuePeekValue.type == 1) {
                        constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                        Motion motion8 = constraint.motion;
                        if (motion8.mQuantizeInterpolatorID != -1) {
                            motion8.mQuantizeInterpolatorType = -2;
                            break;
                        } else {
                            break;
                        }
                    } else if (typedValuePeekValue.type == 3) {
                        constraint.motion.mQuantizeInterpolatorString = typedArray.getString(index);
                        if (constraint.motion.mQuantizeInterpolatorString.indexOf(DomExceptionUtils.SEPARATOR) > 0) {
                            constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                            constraint.motion.mQuantizeInterpolatorType = -2;
                            break;
                        } else {
                            constraint.motion.mQuantizeInterpolatorType = -1;
                            break;
                        }
                    } else {
                        Motion motion9 = constraint.motion;
                        motion9.mQuantizeInterpolatorType = typedArray.getInteger(index, motion9.mQuantizeInterpolatorID);
                        break;
                    }
                case 87:
                    Log.w(TAG, b.a(index, "unused attribute 0x", sMapToConstant));
                    break;
                case 88:
                case 89:
                case 90:
                default:
                    Log.w(TAG, b.a(index, "Unknown attribute 0x", sMapToConstant));
                    break;
                case 91:
                    Layout layout54 = constraint.layout;
                    layout54.baselineToTop = lookupID(typedArray, index, layout54.baselineToTop);
                    break;
                case 92:
                    Layout layout55 = constraint.layout;
                    layout55.baselineToBottom = lookupID(typedArray, index, layout55.baselineToBottom);
                    break;
                case 93:
                    Layout layout56 = constraint.layout;
                    layout56.baselineMargin = typedArray.getDimensionPixelSize(index, layout56.baselineMargin);
                    break;
                case 94:
                    Layout layout57 = constraint.layout;
                    layout57.goneBaselineMargin = typedArray.getDimensionPixelSize(index, layout57.goneBaselineMargin);
                    break;
                case 95:
                    parseDimensionConstraints(constraint.layout, typedArray, index, 0);
                    break;
                case 96:
                    parseDimensionConstraints(constraint.layout, typedArray, index, 1);
                    break;
                case 97:
                    Layout layout58 = constraint.layout;
                    layout58.mWrapBehavior = typedArray.getInt(index, layout58.mWrapBehavior);
                    break;
            }
        }
        Layout layout59 = constraint.layout;
        if (layout59.mReferenceIdString != null) {
            layout59.mReferenceIds = null;
        }
    }

    private static void populateOverride(Constraint constraint, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        Constraint.Delta delta = new Constraint.Delta();
        constraint.mDelta = delta;
        constraint.motion.mApply = false;
        constraint.layout.mApply = false;
        constraint.propertySet.mApply = false;
        constraint.transform.mApply = false;
        for (int i2 = 0; i2 < indexCount; i2++) {
            int index = typedArray.getIndex(i2);
            switch (sOverrideMapToConstant.get(index)) {
                case 2:
                    delta.add(2, typedArray.getDimensionPixelSize(index, constraint.layout.bottomMargin));
                    break;
                case 3:
                case 4:
                case 9:
                case 10:
                case 25:
                case 26:
                case 29:
                case 30:
                case 32:
                case 33:
                case 35:
                case 36:
                case 61:
                case 88:
                case 89:
                case 90:
                case 91:
                case 92:
                default:
                    Log.w(TAG, b.a(index, "Unknown attribute 0x", sMapToConstant));
                    break;
                case 5:
                    delta.add(5, typedArray.getString(index));
                    break;
                case 6:
                    delta.add(6, typedArray.getDimensionPixelOffset(index, constraint.layout.editorAbsoluteX));
                    break;
                case 7:
                    delta.add(7, typedArray.getDimensionPixelOffset(index, constraint.layout.editorAbsoluteY));
                    break;
                case 8:
                    delta.add(8, typedArray.getDimensionPixelSize(index, constraint.layout.endMargin));
                    break;
                case 11:
                    delta.add(11, typedArray.getDimensionPixelSize(index, constraint.layout.goneBottomMargin));
                    break;
                case 12:
                    delta.add(12, typedArray.getDimensionPixelSize(index, constraint.layout.goneEndMargin));
                    break;
                case 13:
                    delta.add(13, typedArray.getDimensionPixelSize(index, constraint.layout.goneLeftMargin));
                    break;
                case 14:
                    delta.add(14, typedArray.getDimensionPixelSize(index, constraint.layout.goneRightMargin));
                    break;
                case 15:
                    delta.add(15, typedArray.getDimensionPixelSize(index, constraint.layout.goneStartMargin));
                    break;
                case 16:
                    delta.add(16, typedArray.getDimensionPixelSize(index, constraint.layout.goneTopMargin));
                    break;
                case 17:
                    delta.add(17, typedArray.getDimensionPixelOffset(index, constraint.layout.guideBegin));
                    break;
                case 18:
                    delta.add(18, typedArray.getDimensionPixelOffset(index, constraint.layout.guideEnd));
                    break;
                case 19:
                    delta.add(19, typedArray.getFloat(index, constraint.layout.guidePercent));
                    break;
                case 20:
                    delta.add(20, typedArray.getFloat(index, constraint.layout.horizontalBias));
                    break;
                case 21:
                    delta.add(21, typedArray.getLayoutDimension(index, constraint.layout.mHeight));
                    break;
                case 22:
                    delta.add(22, VISIBILITY_FLAGS[typedArray.getInt(index, constraint.propertySet.visibility)]);
                    break;
                case 23:
                    delta.add(23, typedArray.getLayoutDimension(index, constraint.layout.mWidth));
                    break;
                case 24:
                    delta.add(24, typedArray.getDimensionPixelSize(index, constraint.layout.leftMargin));
                    break;
                case 27:
                    delta.add(27, typedArray.getInt(index, constraint.layout.orientation));
                    break;
                case 28:
                    delta.add(28, typedArray.getDimensionPixelSize(index, constraint.layout.rightMargin));
                    break;
                case 31:
                    delta.add(31, typedArray.getDimensionPixelSize(index, constraint.layout.startMargin));
                    break;
                case 34:
                    delta.add(34, typedArray.getDimensionPixelSize(index, constraint.layout.topMargin));
                    break;
                case 37:
                    delta.add(37, typedArray.getFloat(index, constraint.layout.verticalBias));
                    break;
                case 38:
                    int resourceId = typedArray.getResourceId(index, constraint.mViewId);
                    constraint.mViewId = resourceId;
                    delta.add(38, resourceId);
                    break;
                case 39:
                    delta.add(39, typedArray.getFloat(index, constraint.layout.horizontalWeight));
                    break;
                case 40:
                    delta.add(40, typedArray.getFloat(index, constraint.layout.verticalWeight));
                    break;
                case 41:
                    delta.add(41, typedArray.getInt(index, constraint.layout.horizontalChainStyle));
                    break;
                case 42:
                    delta.add(42, typedArray.getInt(index, constraint.layout.verticalChainStyle));
                    break;
                case 43:
                    delta.add(43, typedArray.getFloat(index, constraint.propertySet.alpha));
                    break;
                case 44:
                    delta.add(44, true);
                    delta.add(44, typedArray.getDimension(index, constraint.transform.elevation));
                    break;
                case 45:
                    delta.add(45, typedArray.getFloat(index, constraint.transform.rotationX));
                    break;
                case 46:
                    delta.add(46, typedArray.getFloat(index, constraint.transform.rotationY));
                    break;
                case 47:
                    delta.add(47, typedArray.getFloat(index, constraint.transform.scaleX));
                    break;
                case 48:
                    delta.add(48, typedArray.getFloat(index, constraint.transform.scaleY));
                    break;
                case 49:
                    delta.add(49, typedArray.getDimension(index, constraint.transform.transformPivotX));
                    break;
                case 50:
                    delta.add(50, typedArray.getDimension(index, constraint.transform.transformPivotY));
                    break;
                case 51:
                    delta.add(51, typedArray.getDimension(index, constraint.transform.translationX));
                    break;
                case 52:
                    delta.add(52, typedArray.getDimension(index, constraint.transform.translationY));
                    break;
                case 53:
                    delta.add(53, typedArray.getDimension(index, constraint.transform.translationZ));
                    break;
                case 54:
                    delta.add(54, typedArray.getInt(index, constraint.layout.widthDefault));
                    break;
                case 55:
                    delta.add(55, typedArray.getInt(index, constraint.layout.heightDefault));
                    break;
                case 56:
                    delta.add(56, typedArray.getDimensionPixelSize(index, constraint.layout.widthMax));
                    break;
                case 57:
                    delta.add(57, typedArray.getDimensionPixelSize(index, constraint.layout.heightMax));
                    break;
                case 58:
                    delta.add(58, typedArray.getDimensionPixelSize(index, constraint.layout.widthMin));
                    break;
                case 59:
                    delta.add(59, typedArray.getDimensionPixelSize(index, constraint.layout.heightMin));
                    break;
                case 60:
                    delta.add(60, typedArray.getFloat(index, constraint.transform.rotation));
                    break;
                case 62:
                    delta.add(62, typedArray.getDimensionPixelSize(index, constraint.layout.circleRadius));
                    break;
                case 63:
                    delta.add(63, typedArray.getFloat(index, constraint.layout.circleAngle));
                    break;
                case 64:
                    delta.add(64, lookupID(typedArray, index, constraint.motion.mAnimateRelativeTo));
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        delta.add(65, typedArray.getString(index));
                        break;
                    } else {
                        delta.add(65, Easing.NAMED_EASING[typedArray.getInteger(index, 0)]);
                        break;
                    }
                case 66:
                    delta.add(66, typedArray.getInt(index, 0));
                    break;
                case 67:
                    delta.add(67, typedArray.getFloat(index, constraint.motion.mPathRotate));
                    break;
                case 68:
                    delta.add(68, typedArray.getFloat(index, constraint.propertySet.mProgress));
                    break;
                case 69:
                    delta.add(69, typedArray.getFloat(index, 1.0f));
                    break;
                case 70:
                    delta.add(70, typedArray.getFloat(index, 1.0f));
                    break;
                case 71:
                    Log.e(TAG, "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    delta.add(72, typedArray.getInt(index, constraint.layout.mBarrierDirection));
                    break;
                case 73:
                    delta.add(73, typedArray.getDimensionPixelSize(index, constraint.layout.mBarrierMargin));
                    break;
                case 74:
                    delta.add(74, typedArray.getString(index));
                    break;
                case 75:
                    delta.add(75, typedArray.getBoolean(index, constraint.layout.mBarrierAllowsGoneWidgets));
                    break;
                case 76:
                    delta.add(76, typedArray.getInt(index, constraint.motion.mPathMotionArc));
                    break;
                case 77:
                    delta.add(77, typedArray.getString(index));
                    break;
                case 78:
                    delta.add(78, typedArray.getInt(index, constraint.propertySet.mVisibilityMode));
                    break;
                case 79:
                    delta.add(79, typedArray.getFloat(index, constraint.motion.mMotionStagger));
                    break;
                case 80:
                    delta.add(80, typedArray.getBoolean(index, constraint.layout.constrainedWidth));
                    break;
                case 81:
                    delta.add(81, typedArray.getBoolean(index, constraint.layout.constrainedHeight));
                    break;
                case 82:
                    delta.add(82, typedArray.getInteger(index, constraint.motion.mAnimateCircleAngleTo));
                    break;
                case 83:
                    delta.add(83, lookupID(typedArray, index, constraint.transform.transformPivotTarget));
                    break;
                case 84:
                    delta.add(84, typedArray.getInteger(index, constraint.motion.mQuantizeMotionSteps));
                    break;
                case 85:
                    delta.add(85, typedArray.getFloat(index, constraint.motion.mQuantizeMotionPhase));
                    break;
                case 86:
                    TypedValue typedValuePeekValue = typedArray.peekValue(index);
                    if (typedValuePeekValue.type == 1) {
                        constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                        delta.add(89, constraint.motion.mQuantizeInterpolatorID);
                        Motion motion = constraint.motion;
                        if (motion.mQuantizeInterpolatorID != -1) {
                            motion.mQuantizeInterpolatorType = -2;
                            delta.add(88, -2);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedValuePeekValue.type == 3) {
                        constraint.motion.mQuantizeInterpolatorString = typedArray.getString(index);
                        delta.add(90, constraint.motion.mQuantizeInterpolatorString);
                        if (constraint.motion.mQuantizeInterpolatorString.indexOf(DomExceptionUtils.SEPARATOR) > 0) {
                            constraint.motion.mQuantizeInterpolatorID = typedArray.getResourceId(index, -1);
                            delta.add(89, constraint.motion.mQuantizeInterpolatorID);
                            constraint.motion.mQuantizeInterpolatorType = -2;
                            delta.add(88, -2);
                            break;
                        } else {
                            constraint.motion.mQuantizeInterpolatorType = -1;
                            delta.add(88, -1);
                            break;
                        }
                    } else {
                        Motion motion2 = constraint.motion;
                        motion2.mQuantizeInterpolatorType = typedArray.getInteger(index, motion2.mQuantizeInterpolatorID);
                        delta.add(88, constraint.motion.mQuantizeInterpolatorType);
                        break;
                    }
                case 87:
                    Log.w(TAG, b.a(index, "unused attribute 0x", sMapToConstant));
                    break;
                case 93:
                    delta.add(93, typedArray.getDimensionPixelSize(index, constraint.layout.baselineMargin));
                    break;
                case 94:
                    delta.add(94, typedArray.getDimensionPixelSize(index, constraint.layout.goneBaselineMargin));
                    break;
                case 95:
                    parseDimensionConstraints(delta, typedArray, index, 0);
                    break;
                case 96:
                    parseDimensionConstraints(delta, typedArray, index, 1);
                    break;
                case 97:
                    delta.add(97, typedArray.getInt(index, constraint.layout.mWrapBehavior));
                    break;
                case 98:
                    if (MotionLayout.IS_IN_EDIT_MODE) {
                        int resourceId2 = typedArray.getResourceId(index, constraint.mViewId);
                        constraint.mViewId = resourceId2;
                        if (resourceId2 == -1) {
                            constraint.mTargetString = typedArray.getString(index);
                            break;
                        } else {
                            break;
                        }
                    } else if (typedArray.peekValue(index).type == 3) {
                        constraint.mTargetString = typedArray.getString(index);
                        break;
                    } else {
                        constraint.mViewId = typedArray.getResourceId(index, constraint.mViewId);
                        break;
                    }
                case 99:
                    delta.add(99, typedArray.getBoolean(index, constraint.layout.guidelineUseRtl));
                    break;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setDeltaValue(Constraint constraint, int i2, int i3) {
        if (i2 == 6) {
            constraint.layout.editorAbsoluteX = i3;
            return;
        }
        if (i2 == 7) {
            constraint.layout.editorAbsoluteY = i3;
            return;
        }
        if (i2 == 8) {
            constraint.layout.endMargin = i3;
            return;
        }
        if (i2 == 27) {
            constraint.layout.orientation = i3;
            return;
        }
        if (i2 == 28) {
            constraint.layout.rightMargin = i3;
            return;
        }
        if (i2 == 41) {
            constraint.layout.horizontalChainStyle = i3;
            return;
        }
        if (i2 == 42) {
            constraint.layout.verticalChainStyle = i3;
            return;
        }
        if (i2 == 61) {
            constraint.layout.circleConstraint = i3;
            return;
        }
        if (i2 == 62) {
            constraint.layout.circleRadius = i3;
            return;
        }
        if (i2 == 72) {
            constraint.layout.mBarrierDirection = i3;
            return;
        }
        if (i2 == 73) {
            constraint.layout.mBarrierMargin = i3;
            return;
        }
        switch (i2) {
            case 2:
                constraint.layout.bottomMargin = i3;
                break;
            case 11:
                constraint.layout.goneBottomMargin = i3;
                break;
            case 12:
                constraint.layout.goneEndMargin = i3;
                break;
            case 13:
                constraint.layout.goneLeftMargin = i3;
                break;
            case 14:
                constraint.layout.goneRightMargin = i3;
                break;
            case 15:
                constraint.layout.goneStartMargin = i3;
                break;
            case 16:
                constraint.layout.goneTopMargin = i3;
                break;
            case 17:
                constraint.layout.guideBegin = i3;
                break;
            case 18:
                constraint.layout.guideEnd = i3;
                break;
            case 31:
                constraint.layout.startMargin = i3;
                break;
            case 34:
                constraint.layout.topMargin = i3;
                break;
            case 38:
                constraint.mViewId = i3;
                break;
            case 64:
                constraint.motion.mAnimateRelativeTo = i3;
                break;
            case 66:
                constraint.motion.mDrawPath = i3;
                break;
            case 76:
                constraint.motion.mPathMotionArc = i3;
                break;
            case 78:
                constraint.propertySet.mVisibilityMode = i3;
                break;
            case 93:
                constraint.layout.baselineMargin = i3;
                break;
            case 94:
                constraint.layout.goneBaselineMargin = i3;
                break;
            case 97:
                constraint.layout.mWrapBehavior = i3;
                break;
            default:
                switch (i2) {
                    case 21:
                        constraint.layout.mHeight = i3;
                        break;
                    case 22:
                        constraint.propertySet.visibility = i3;
                        break;
                    case 23:
                        constraint.layout.mWidth = i3;
                        break;
                    case 24:
                        constraint.layout.leftMargin = i3;
                        break;
                    default:
                        switch (i2) {
                            case 54:
                                constraint.layout.widthDefault = i3;
                                break;
                            case 55:
                                constraint.layout.heightDefault = i3;
                                break;
                            case 56:
                                constraint.layout.widthMax = i3;
                                break;
                            case 57:
                                constraint.layout.heightMax = i3;
                                break;
                            case 58:
                                constraint.layout.widthMin = i3;
                                break;
                            case 59:
                                constraint.layout.heightMin = i3;
                                break;
                            default:
                                switch (i2) {
                                    case 82:
                                        constraint.motion.mAnimateCircleAngleTo = i3;
                                        break;
                                    case 83:
                                        constraint.transform.transformPivotTarget = i3;
                                        break;
                                    case 84:
                                        constraint.motion.mQuantizeMotionSteps = i3;
                                        break;
                                    default:
                                        switch (i2) {
                                            case 87:
                                                break;
                                            case 88:
                                                constraint.motion.mQuantizeInterpolatorType = i3;
                                                break;
                                            case 89:
                                                constraint.motion.mQuantizeInterpolatorID = i3;
                                                break;
                                            default:
                                                Log.w(TAG, "Unknown attribute 0x");
                                                break;
                                        }
                                }
                        }
                }
        }
    }

    private String sideToString(int i2) {
        switch (i2) {
            case 1:
                return TtmlNode.LEFT;
            case 2:
                return TtmlNode.RIGHT;
            case 3:
                return "top";
            case 4:
                return "bottom";
            case 5:
                return "baseline";
            case 6:
                return TtmlNode.START;
            case 7:
                return TtmlNode.END;
            default:
                return "undefined";
        }
    }

    private static String[] splitString(String str) {
        char[] charArray = str.toCharArray();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        while (true) {
            int length = charArray.length;
            if (i2 >= length) {
                arrayList.add(new String(charArray, i3, length - i3));
                return (String[]) arrayList.toArray(new String[arrayList.size()]);
            }
            int i4 = i2 + 1;
            char c2 = charArray[i2];
            if (c2 == ',') {
                if (!z) {
                    arrayList.add(new String(charArray, i3, i2 - i3));
                    i3 = i4;
                }
            } else if (c2 == '\"') {
                z = !z;
            }
            i2 = i4;
        }
    }

    public void addColorAttributes(String... strArr) {
        addAttributes(ConstraintAttribute.AttributeType.COLOR_TYPE, strArr);
    }

    public void addFloatAttributes(String... strArr) {
        addAttributes(ConstraintAttribute.AttributeType.FLOAT_TYPE, strArr);
    }

    public void addIntAttributes(String... strArr) {
        addAttributes(ConstraintAttribute.AttributeType.INT_TYPE, strArr);
    }

    public void addStringAttributes(String... strArr) {
        addAttributes(ConstraintAttribute.AttributeType.STRING_TYPE, strArr);
    }

    public void addToHorizontalChain(int i2, int i3, int i4) {
        connect(i2, 1, i3, i3 == 0 ? 1 : 2, 0);
        connect(i2, 2, i4, i4 == 0 ? 2 : 1, 0);
        if (i3 != 0) {
            connect(i3, 2, i2, 1, 0);
        }
        if (i4 != 0) {
            connect(i4, 1, i2, 2, 0);
        }
    }

    public void addToHorizontalChainRTL(int i2, int i3, int i4) {
        connect(i2, 6, i3, i3 == 0 ? 6 : 7, 0);
        connect(i2, 7, i4, i4 == 0 ? 7 : 6, 0);
        if (i3 != 0) {
            connect(i3, 7, i2, 6, 0);
        }
        if (i4 != 0) {
            connect(i4, 6, i2, 7, 0);
        }
    }

    public void addToVerticalChain(int i2, int i3, int i4) {
        connect(i2, 3, i3, i3 == 0 ? 3 : 4, 0);
        connect(i2, 4, i4, i4 == 0 ? 4 : 3, 0);
        if (i3 != 0) {
            connect(i3, 4, i2, 3, 0);
        }
        if (i4 != 0) {
            connect(i4, 3, i2, 4, 0);
        }
    }

    public void applyCustomAttributes(ConstraintLayout constraintLayout) {
        Constraint constraint;
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            HashMap<Integer, Constraint> map = this.mConstraints;
            Integer numValueOf = Integer.valueOf(id);
            if (!map.containsKey(numValueOf)) {
                Log.w(TAG, "id unknown ".concat(String.valueOf(Debug.getName(childAt))));
            } else {
                if (this.mForceId && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (this.mConstraints.containsKey(numValueOf) && (constraint = this.mConstraints.get(numValueOf)) != null) {
                    ConstraintAttribute.setAttributes(childAt, constraint.mCustomConstraints);
                }
            }
        }
    }

    public void applyDeltaFrom(ConstraintSet constraintSet) {
        for (Constraint constraint : constraintSet.mConstraints.values()) {
            if (constraint.mDelta != null) {
                if (constraint.mTargetString == null) {
                    constraint.mDelta.applyDelta(getConstraint(constraint.mViewId));
                } else {
                    Iterator<Integer> it = this.mConstraints.keySet().iterator();
                    while (it.hasNext()) {
                        Constraint constraint2 = getConstraint(it.next().intValue());
                        String str = constraint2.layout.mConstraintTag;
                        if (str != null && constraint.mTargetString.matches(str)) {
                            constraint.mDelta.applyDelta(constraint2);
                            constraint2.mCustomConstraints.putAll((HashMap) constraint.mCustomConstraints.clone());
                        }
                    }
                }
            }
        }
    }

    public void applyTo(ConstraintLayout constraintLayout) {
        applyToInternal(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    public void applyToHelper(ConstraintHelper constraintHelper, ConstraintWidget constraintWidget, ConstraintLayout.LayoutParams layoutParams, SparseArray<ConstraintWidget> sparseArray) {
        Constraint constraint;
        int id = constraintHelper.getId();
        HashMap<Integer, Constraint> map = this.mConstraints;
        Integer numValueOf = Integer.valueOf(id);
        if (map.containsKey(numValueOf) && (constraint = this.mConstraints.get(numValueOf)) != null && (constraintWidget instanceof HelperWidget)) {
            constraintHelper.loadParameters(constraint, (HelperWidget) constraintWidget, layoutParams, sparseArray);
        }
    }

    void applyToInternal(ConstraintLayout constraintLayout, boolean z) {
        int childCount = constraintLayout.getChildCount();
        HashSet hashSet = new HashSet(this.mConstraints.keySet());
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            int id = childAt.getId();
            HashMap<Integer, Constraint> map = this.mConstraints;
            Integer numValueOf = Integer.valueOf(id);
            if (!map.containsKey(numValueOf)) {
                Log.w(TAG, "id unknown ".concat(String.valueOf(Debug.getName(childAt))));
            } else {
                if (this.mForceId && id == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id != -1) {
                    if (this.mConstraints.containsKey(numValueOf)) {
                        hashSet.remove(numValueOf);
                        Constraint constraint = this.mConstraints.get(numValueOf);
                        if (constraint != null) {
                            if (childAt instanceof Barrier) {
                                constraint.layout.mHelperType = 1;
                                Barrier barrier = (Barrier) childAt;
                                barrier.setId(id);
                                barrier.setType(constraint.layout.mBarrierDirection);
                                barrier.setMargin(constraint.layout.mBarrierMargin);
                                barrier.setAllowsGoneWidget(constraint.layout.mBarrierAllowsGoneWidgets);
                                Layout layout = constraint.layout;
                                int[] iArr = layout.mReferenceIds;
                                if (iArr != null) {
                                    barrier.setReferencedIds(iArr);
                                } else {
                                    String str = layout.mReferenceIdString;
                                    if (str != null) {
                                        layout.mReferenceIds = convertReferenceString(barrier, str);
                                        barrier.setReferencedIds(constraint.layout.mReferenceIds);
                                    }
                                }
                            }
                            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
                            layoutParams.validate();
                            constraint.applyTo(layoutParams);
                            if (z) {
                                ConstraintAttribute.setAttributes(childAt, constraint.mCustomConstraints);
                            }
                            childAt.setLayoutParams(layoutParams);
                            PropertySet propertySet = constraint.propertySet;
                            if (propertySet.mVisibilityMode == 0) {
                                childAt.setVisibility(propertySet.visibility);
                            }
                            childAt.setAlpha(constraint.propertySet.alpha);
                            childAt.setRotation(constraint.transform.rotation);
                            childAt.setRotationX(constraint.transform.rotationX);
                            childAt.setRotationY(constraint.transform.rotationY);
                            childAt.setScaleX(constraint.transform.scaleX);
                            childAt.setScaleY(constraint.transform.scaleY);
                            Transform transform = constraint.transform;
                            if (transform.transformPivotTarget != -1) {
                                View viewFindViewById = ((View) childAt.getParent()).findViewById(constraint.transform.transformPivotTarget);
                                if (viewFindViewById != null) {
                                    int top = viewFindViewById.getTop() + viewFindViewById.getBottom();
                                    int left = viewFindViewById.getLeft() + viewFindViewById.getRight();
                                    if (childAt.getRight() - childAt.getLeft() > 0 && childAt.getBottom() - childAt.getTop() > 0) {
                                        float f2 = left;
                                        float left2 = childAt.getLeft();
                                        float top2 = childAt.getTop();
                                        childAt.setPivotX((f2 / 2.0f) - left2);
                                        childAt.setPivotY((top / 2.0f) - top2);
                                    }
                                }
                            } else {
                                if (!Float.isNaN(transform.transformPivotX)) {
                                    childAt.setPivotX(constraint.transform.transformPivotX);
                                }
                                if (!Float.isNaN(constraint.transform.transformPivotY)) {
                                    childAt.setPivotY(constraint.transform.transformPivotY);
                                }
                            }
                            childAt.setTranslationX(constraint.transform.translationX);
                            childAt.setTranslationY(constraint.transform.translationY);
                            childAt.setTranslationZ(constraint.transform.translationZ);
                            Transform transform2 = constraint.transform;
                            if (transform2.applyElevation) {
                                childAt.setElevation(transform2.elevation);
                            }
                        }
                    } else {
                        Log.v(TAG, "WARNING NO CONSTRAINTS for view " + id);
                    }
                }
            }
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            Constraint constraint2 = this.mConstraints.get(num);
            if (constraint2 != null) {
                if (constraint2.layout.mHelperType == 1) {
                    Barrier barrier2 = new Barrier(constraintLayout.getContext());
                    barrier2.setId(num.intValue());
                    Layout layout2 = constraint2.layout;
                    int[] iArr2 = layout2.mReferenceIds;
                    if (iArr2 != null) {
                        barrier2.setReferencedIds(iArr2);
                    } else {
                        String str2 = layout2.mReferenceIdString;
                        if (str2 != null) {
                            layout2.mReferenceIds = convertReferenceString(barrier2, str2);
                            barrier2.setReferencedIds(constraint2.layout.mReferenceIds);
                        }
                    }
                    barrier2.setType(constraint2.layout.mBarrierDirection);
                    barrier2.setMargin(constraint2.layout.mBarrierMargin);
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                    barrier2.validateParams();
                    constraint2.applyTo(layoutParamsGenerateDefaultLayoutParams);
                    constraintLayout.addView(barrier2, layoutParamsGenerateDefaultLayoutParams);
                }
                if (constraint2.layout.mIsGuideline) {
                    Guideline guideline = new Guideline(constraintLayout.getContext());
                    guideline.setId(num.intValue());
                    ConstraintLayout.LayoutParams layoutParamsGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                    constraint2.applyTo(layoutParamsGenerateDefaultLayoutParams2);
                    constraintLayout.addView(guideline, layoutParamsGenerateDefaultLayoutParams2);
                }
            }
        }
        for (int i3 = 0; i3 < childCount; i3++) {
            View childAt2 = constraintLayout.getChildAt(i3);
            if (childAt2 instanceof ConstraintHelper) {
                ((ConstraintHelper) childAt2).applyLayoutFeaturesInConstraintSet(constraintLayout);
            }
        }
    }

    public void applyToLayoutParams(int i2, ConstraintLayout.LayoutParams layoutParams) {
        Constraint constraint;
        HashMap<Integer, Constraint> map = this.mConstraints;
        Integer numValueOf = Integer.valueOf(i2);
        if (!map.containsKey(numValueOf) || (constraint = this.mConstraints.get(numValueOf)) == null) {
            return;
        }
        constraint.applyTo(layoutParams);
    }

    public void applyToWithoutCustom(ConstraintLayout constraintLayout) {
        applyToInternal(constraintLayout, false);
        constraintLayout.setConstraintSet(null);
    }

    public void center(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f2) {
        if (i5 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (i8 < 0) {
            throw new IllegalArgumentException("margin must be > 0");
        }
        if (f2 <= 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("bias must be between 0 and 1 inclusive");
        }
        if (i4 == 1 || i4 == 2) {
            connect(i2, 1, i3, i4, i5);
            connect(i2, 2, i6, i7, i8);
            Constraint constraint = this.mConstraints.get(Integer.valueOf(i2));
            if (constraint != null) {
                constraint.layout.horizontalBias = f2;
                return;
            }
            return;
        }
        if (i4 == 6 || i4 == 7) {
            connect(i2, 6, i3, i4, i5);
            connect(i2, 7, i6, i7, i8);
            Constraint constraint2 = this.mConstraints.get(Integer.valueOf(i2));
            if (constraint2 != null) {
                constraint2.layout.horizontalBias = f2;
                return;
            }
            return;
        }
        connect(i2, 3, i3, i4, i5);
        connect(i2, 4, i6, i7, i8);
        Constraint constraint3 = this.mConstraints.get(Integer.valueOf(i2));
        if (constraint3 != null) {
            constraint3.layout.verticalBias = f2;
        }
    }

    public void centerHorizontally(int i2, int i3) {
        if (i3 == 0) {
            center(i2, 0, 1, 0, 0, 2, 0, 0.5f);
        } else {
            center(i2, i3, 2, 0, i3, 1, 0, 0.5f);
        }
    }

    public void centerHorizontallyRtl(int i2, int i3) {
        if (i3 == 0) {
            center(i2, 0, 6, 0, 0, 7, 0, 0.5f);
        } else {
            center(i2, i3, 7, 0, i3, 6, 0, 0.5f);
        }
    }

    public void centerVertically(int i2, int i3) {
        if (i3 == 0) {
            center(i2, 0, 3, 0, 0, 4, 0, 0.5f);
        } else {
            center(i2, i3, 4, 0, i3, 3, 0, 0.5f);
        }
    }

    public void clear(int i2, int i3) {
        Constraint constraint;
        HashMap<Integer, Constraint> map = this.mConstraints;
        Integer numValueOf = Integer.valueOf(i2);
        if (!map.containsKey(numValueOf) || (constraint = this.mConstraints.get(numValueOf)) == null) {
            return;
        }
        switch (i3) {
            case 1:
                Layout layout = constraint.layout;
                layout.leftToRight = -1;
                layout.leftToLeft = -1;
                layout.leftMargin = -1;
                layout.goneLeftMargin = Integer.MIN_VALUE;
                return;
            case 2:
                Layout layout2 = constraint.layout;
                layout2.rightToRight = -1;
                layout2.rightToLeft = -1;
                layout2.rightMargin = -1;
                layout2.goneRightMargin = Integer.MIN_VALUE;
                return;
            case 3:
                Layout layout3 = constraint.layout;
                layout3.topToBottom = -1;
                layout3.topToTop = -1;
                layout3.topMargin = 0;
                layout3.goneTopMargin = Integer.MIN_VALUE;
                return;
            case 4:
                Layout layout4 = constraint.layout;
                layout4.bottomToTop = -1;
                layout4.bottomToBottom = -1;
                layout4.bottomMargin = 0;
                layout4.goneBottomMargin = Integer.MIN_VALUE;
                return;
            case 5:
                Layout layout5 = constraint.layout;
                layout5.baselineToBaseline = -1;
                layout5.baselineToTop = -1;
                layout5.baselineToBottom = -1;
                layout5.baselineMargin = 0;
                layout5.goneBaselineMargin = Integer.MIN_VALUE;
                return;
            case 6:
                Layout layout6 = constraint.layout;
                layout6.startToEnd = -1;
                layout6.startToStart = -1;
                layout6.startMargin = 0;
                layout6.goneStartMargin = Integer.MIN_VALUE;
                return;
            case 7:
                Layout layout7 = constraint.layout;
                layout7.endToStart = -1;
                layout7.endToEnd = -1;
                layout7.endMargin = 0;
                layout7.goneEndMargin = Integer.MIN_VALUE;
                return;
            case 8:
                Layout layout8 = constraint.layout;
                layout8.circleAngle = -1.0f;
                layout8.circleRadius = -1;
                layout8.circleConstraint = -1;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void clone(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.mConstraints.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.mForceId && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            HashMap<Integer, Constraint> map = this.mConstraints;
            Integer numValueOf = Integer.valueOf(id);
            if (!map.containsKey(numValueOf)) {
                this.mConstraints.put(numValueOf, new Constraint());
            }
            Constraint constraint = this.mConstraints.get(numValueOf);
            if (constraint != null) {
                constraint.mCustomConstraints = ConstraintAttribute.extractAttributes(this.mSavedAttributes, childAt);
                constraint.fillFrom(id, layoutParams);
                constraint.propertySet.visibility = childAt.getVisibility();
                constraint.propertySet.alpha = childAt.getAlpha();
                constraint.transform.rotation = childAt.getRotation();
                constraint.transform.rotationX = childAt.getRotationX();
                constraint.transform.rotationY = childAt.getRotationY();
                constraint.transform.scaleX = childAt.getScaleX();
                constraint.transform.scaleY = childAt.getScaleY();
                float pivotX = childAt.getPivotX();
                float pivotY = childAt.getPivotY();
                if (pivotX != AudioStats.AUDIO_AMPLITUDE_NONE || pivotY != AudioStats.AUDIO_AMPLITUDE_NONE) {
                    Transform transform = constraint.transform;
                    transform.transformPivotX = pivotX;
                    transform.transformPivotY = pivotY;
                }
                constraint.transform.translationX = childAt.getTranslationX();
                constraint.transform.translationY = childAt.getTranslationY();
                constraint.transform.translationZ = childAt.getTranslationZ();
                Transform transform2 = constraint.transform;
                if (transform2.applyElevation) {
                    transform2.elevation = childAt.getElevation();
                }
                if (childAt instanceof Barrier) {
                    Barrier barrier = (Barrier) childAt;
                    constraint.layout.mBarrierAllowsGoneWidgets = barrier.getAllowsGoneWidget();
                    constraint.layout.mReferenceIds = barrier.getReferencedIds();
                    constraint.layout.mBarrierDirection = barrier.getType();
                    constraint.layout.mBarrierMargin = barrier.getMargin();
                }
            }
        }
    }

    public void connect(int i2, int i3, int i4, int i5, int i6) {
        HashMap<Integer, Constraint> map = this.mConstraints;
        Integer numValueOf = Integer.valueOf(i2);
        if (!map.containsKey(numValueOf)) {
            this.mConstraints.put(numValueOf, new Constraint());
        }
        Constraint constraint = this.mConstraints.get(numValueOf);
        if (constraint == null) {
            return;
        }
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    Layout layout = constraint.layout;
                    layout.leftToLeft = i4;
                    layout.leftToRight = -1;
                } else {
                    if (i5 != 2) {
                        throw new IllegalArgumentException("Left to " + sideToString(i5) + " undefined");
                    }
                    Layout layout2 = constraint.layout;
                    layout2.leftToRight = i4;
                    layout2.leftToLeft = -1;
                }
                constraint.layout.leftMargin = i6;
                return;
            case 2:
                if (i5 == 1) {
                    Layout layout3 = constraint.layout;
                    layout3.rightToLeft = i4;
                    layout3.rightToRight = -1;
                } else {
                    if (i5 != 2) {
                        throw new IllegalArgumentException("right to " + sideToString(i5) + " undefined");
                    }
                    Layout layout4 = constraint.layout;
                    layout4.rightToRight = i4;
                    layout4.rightToLeft = -1;
                }
                constraint.layout.rightMargin = i6;
                return;
            case 3:
                if (i5 == 3) {
                    Layout layout5 = constraint.layout;
                    layout5.topToTop = i4;
                    layout5.topToBottom = -1;
                    layout5.baselineToBaseline = -1;
                    layout5.baselineToTop = -1;
                    layout5.baselineToBottom = -1;
                } else {
                    if (i5 != 4) {
                        throw new IllegalArgumentException("right to " + sideToString(i5) + " undefined");
                    }
                    Layout layout6 = constraint.layout;
                    layout6.topToBottom = i4;
                    layout6.topToTop = -1;
                    layout6.baselineToBaseline = -1;
                    layout6.baselineToTop = -1;
                    layout6.baselineToBottom = -1;
                }
                constraint.layout.topMargin = i6;
                return;
            case 4:
                if (i5 == 4) {
                    Layout layout7 = constraint.layout;
                    layout7.bottomToBottom = i4;
                    layout7.bottomToTop = -1;
                    layout7.baselineToBaseline = -1;
                    layout7.baselineToTop = -1;
                    layout7.baselineToBottom = -1;
                } else {
                    if (i5 != 3) {
                        throw new IllegalArgumentException("right to " + sideToString(i5) + " undefined");
                    }
                    Layout layout8 = constraint.layout;
                    layout8.bottomToTop = i4;
                    layout8.bottomToBottom = -1;
                    layout8.baselineToBaseline = -1;
                    layout8.baselineToTop = -1;
                    layout8.baselineToBottom = -1;
                }
                constraint.layout.bottomMargin = i6;
                return;
            case 5:
                if (i5 == 5) {
                    Layout layout9 = constraint.layout;
                    layout9.baselineToBaseline = i4;
                    layout9.bottomToBottom = -1;
                    layout9.bottomToTop = -1;
                    layout9.topToTop = -1;
                    layout9.topToBottom = -1;
                    return;
                }
                if (i5 == 3) {
                    Layout layout10 = constraint.layout;
                    layout10.baselineToTop = i4;
                    layout10.bottomToBottom = -1;
                    layout10.bottomToTop = -1;
                    layout10.topToTop = -1;
                    layout10.topToBottom = -1;
                    return;
                }
                if (i5 != 4) {
                    throw new IllegalArgumentException("right to " + sideToString(i5) + " undefined");
                }
                Layout layout11 = constraint.layout;
                layout11.baselineToBottom = i4;
                layout11.bottomToBottom = -1;
                layout11.bottomToTop = -1;
                layout11.topToTop = -1;
                layout11.topToBottom = -1;
                return;
            case 6:
                if (i5 == 6) {
                    Layout layout12 = constraint.layout;
                    layout12.startToStart = i4;
                    layout12.startToEnd = -1;
                } else {
                    if (i5 != 7) {
                        throw new IllegalArgumentException("right to " + sideToString(i5) + " undefined");
                    }
                    Layout layout13 = constraint.layout;
                    layout13.startToEnd = i4;
                    layout13.startToStart = -1;
                }
                constraint.layout.startMargin = i6;
                return;
            case 7:
                if (i5 == 7) {
                    Layout layout14 = constraint.layout;
                    layout14.endToEnd = i4;
                    layout14.endToStart = -1;
                } else {
                    if (i5 != 6) {
                        throw new IllegalArgumentException("right to " + sideToString(i5) + " undefined");
                    }
                    Layout layout15 = constraint.layout;
                    layout15.endToStart = i4;
                    layout15.endToEnd = -1;
                }
                constraint.layout.endMargin = i6;
                return;
            default:
                throw new IllegalArgumentException(sideToString(i3) + " to " + sideToString(i5) + " unknown");
        }
    }

    public void constrainCircle(int i2, int i3, int i4, float f2) {
        Layout layout = get(i2).layout;
        layout.circleConstraint = i3;
        layout.circleRadius = i4;
        layout.circleAngle = f2;
    }

    public void constrainDefaultHeight(int i2, int i3) {
        get(i2).layout.heightDefault = i3;
    }

    public void constrainDefaultWidth(int i2, int i3) {
        get(i2).layout.widthDefault = i3;
    }

    public void constrainHeight(int i2, int i3) {
        get(i2).layout.mHeight = i3;
    }

    public void constrainMaxHeight(int i2, int i3) {
        get(i2).layout.heightMax = i3;
    }

    public void constrainMaxWidth(int i2, int i3) {
        get(i2).layout.widthMax = i3;
    }

    public void constrainMinHeight(int i2, int i3) {
        get(i2).layout.heightMin = i3;
    }

    public void constrainMinWidth(int i2, int i3) {
        get(i2).layout.widthMin = i3;
    }

    public void constrainPercentHeight(int i2, float f2) {
        get(i2).layout.heightPercent = f2;
    }

    public void constrainPercentWidth(int i2, float f2) {
        get(i2).layout.widthPercent = f2;
    }

    public void constrainWidth(int i2, int i3) {
        get(i2).layout.mWidth = i3;
    }

    public void constrainedHeight(int i2, boolean z) {
        get(i2).layout.constrainedHeight = z;
    }

    public void constrainedWidth(int i2, boolean z) {
        get(i2).layout.constrainedWidth = z;
    }

    public void create(int i2, int i3) {
        Layout layout = get(i2).layout;
        layout.mIsGuideline = true;
        layout.orientation = i3;
    }

    public void createBarrier(int i2, int i3, int i4, int... iArr) {
        Layout layout = get(i2).layout;
        layout.mHelperType = 1;
        layout.mBarrierDirection = i3;
        layout.mBarrierMargin = i4;
        layout.mIsGuideline = false;
        layout.mReferenceIds = iArr;
    }

    public void createHorizontalChainRtl(int i2, int i3, int i4, int i5, int[] iArr, float[] fArr, int i6) {
        createHorizontalChain(i2, i3, i4, i5, iArr, fArr, i6, 6, 7);
    }

    public void createVerticalChain(int i2, int i3, int i4, int i5, int[] iArr, float[] fArr, int i6) {
        int length = iArr.length;
        if (length < 2) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null && fArr.length != length) {
            throw new IllegalArgumentException("must have 2 or more widgets in a chain");
        }
        if (fArr != null) {
            get(iArr[0]).layout.verticalWeight = fArr[0];
        }
        get(iArr[0]).layout.verticalChainStyle = i6;
        connect(iArr[0], 3, i2, i3, 0);
        int i7 = 1;
        while (true) {
            int length2 = iArr.length;
            if (i7 >= length2) {
                connect(iArr[length2 - 1], 4, i4, i5, 0);
                return;
            }
            int i8 = i7 - 1;
            connect(iArr[i7], 3, iArr[i8], 4, 0);
            connect(iArr[i8], 4, iArr[i7], 3, 0);
            if (fArr != null) {
                get(iArr[i7]).layout.verticalWeight = fArr[i7];
            }
            i7++;
        }
    }

    public void dump(MotionScene motionScene, int... iArr) throws IllegalAccessException, IllegalArgumentException {
        HashSet hashSet;
        Set<Integer> setKeySet = this.mConstraints.keySet();
        if (iArr.length != 0) {
            hashSet = new HashSet();
            for (int i2 : iArr) {
                hashSet.add(Integer.valueOf(i2));
            }
        } else {
            hashSet = new HashSet(setKeySet);
        }
        System.out.println(hashSet.size() + " constraints");
        StringBuilder sb = new StringBuilder();
        for (Integer num : (Integer[]) hashSet.toArray(new Integer[0])) {
            Constraint constraint = this.mConstraints.get(num);
            if (constraint != null) {
                sb.append("<Constraint id=");
                sb.append(num);
                sb.append(" \n");
                constraint.layout.dump(motionScene, sb);
                sb.append("/>\n");
            }
        }
        System.out.println(sb.toString());
    }

    public boolean getApplyElevation(int i2) {
        return get(i2).transform.applyElevation;
    }

    public Constraint getConstraint(int i2) {
        HashMap<Integer, Constraint> map = this.mConstraints;
        Integer numValueOf = Integer.valueOf(i2);
        if (map.containsKey(numValueOf)) {
            return this.mConstraints.get(numValueOf);
        }
        return null;
    }

    public HashMap<String, ConstraintAttribute> getCustomAttributeSet() {
        return this.mSavedAttributes;
    }

    public int getHeight(int i2) {
        return get(i2).layout.mHeight;
    }

    public int[] getKnownIds() {
        Integer[] numArr = (Integer[]) this.mConstraints.keySet().toArray(new Integer[0]);
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i2 = 0; i2 < length; i2++) {
            iArr[i2] = numArr[i2].intValue();
        }
        return iArr;
    }

    public Constraint getParameters(int i2) {
        return get(i2);
    }

    public int[] getReferencedIds(int i2) {
        int[] iArr = get(i2).layout.mReferenceIds;
        return iArr == null ? new int[0] : Arrays.copyOf(iArr, iArr.length);
    }

    public String[] getStateLabels() {
        String[] strArr = this.mMatchLabels;
        return (String[]) Arrays.copyOf(strArr, strArr.length);
    }

    public int getVisibility(int i2) {
        return get(i2).propertySet.visibility;
    }

    public int getVisibilityMode(int i2) {
        return get(i2).propertySet.mVisibilityMode;
    }

    public int getWidth(int i2) {
        return get(i2).layout.mWidth;
    }

    public boolean isForceId() {
        return this.mForceId;
    }

    public boolean isValidateOnParse() {
        return this.mValidate;
    }

    /* JADX WARN: Code restructure failed: missing block: B:120:0x01a8, code lost:
    
        continue;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01a8, code lost:
    
        continue;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void load(android.content.Context r10, org.xmlpull.v1.XmlPullParser r11) {
        /*
            Method dump skipped, instructions count: 502
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.load(android.content.Context, org.xmlpull.v1.XmlPullParser):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        r2 = r2 + 1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean matchesLabels(java.lang.String... r9) {
        /*
            r8 = this;
            int r0 = r9.length
            r1 = 0
            r2 = r1
        L3:
            if (r2 >= r0) goto L1c
            r3 = r9[r2]
            java.lang.String[] r4 = r8.mMatchLabels
            int r5 = r4.length
            r6 = r1
        Lb:
            if (r6 >= r5) goto L1b
            r7 = r4[r6]
            boolean r7 = r7.equals(r3)
            if (r7 == 0) goto L18
            int r2 = r2 + 1
            goto L3
        L18:
            int r6 = r6 + 1
            goto Lb
        L1b:
            return r1
        L1c:
            r8 = 1
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.matchesLabels(java.lang.String[]):boolean");
    }

    public void parseColorAttributes(Constraint constraint, String str) {
        String[] strArrSplit = str.split(",");
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            String[] strArrSplit2 = strArrSplit[i2].split("=");
            if (strArrSplit2.length != 2) {
                Log.w(TAG, " Unable to parse ".concat(String.valueOf(strArrSplit[i2])));
            } else {
                constraint.setColorValue(strArrSplit2[0], Color.parseColor(strArrSplit2[1]));
            }
        }
    }

    public void parseFloatAttributes(Constraint constraint, String str) {
        String[] strArrSplit = str.split(",");
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            String[] strArrSplit2 = strArrSplit[i2].split("=");
            if (strArrSplit2.length != 2) {
                Log.w(TAG, " Unable to parse ".concat(String.valueOf(strArrSplit[i2])));
            } else {
                constraint.setFloatValue(strArrSplit2[0], Float.parseFloat(strArrSplit2[1]));
            }
        }
    }

    public void parseIntAttributes(Constraint constraint, String str) {
        String[] strArrSplit = str.split(",");
        for (int i2 = 0; i2 < strArrSplit.length; i2++) {
            String[] strArrSplit2 = strArrSplit[i2].split("=");
            if (strArrSplit2.length != 2) {
                Log.w(TAG, " Unable to parse ".concat(String.valueOf(strArrSplit[i2])));
            } else {
                constraint.setFloatValue(strArrSplit2[0], Integer.decode(strArrSplit2[1]).intValue());
            }
        }
    }

    public void parseStringAttributes(Constraint constraint, String str) {
        String[] strArrSplitString = splitString(str);
        for (int i2 = 0; i2 < strArrSplitString.length; i2++) {
            String[] strArrSplit = strArrSplitString[i2].split("=");
            Log.w(TAG, " Unable to parse ".concat(String.valueOf(strArrSplitString[i2])));
            constraint.setStringValue(strArrSplit[0], strArrSplit[1]);
        }
    }

    public void readFallback(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraintLayout.getChildAt(i2);
            ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.mForceId && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            HashMap<Integer, Constraint> map = this.mConstraints;
            Integer numValueOf = Integer.valueOf(id);
            if (!map.containsKey(numValueOf)) {
                this.mConstraints.put(numValueOf, new Constraint());
            }
            Constraint constraint = this.mConstraints.get(numValueOf);
            if (constraint != null) {
                if (!constraint.layout.mApply) {
                    constraint.fillFrom(id, layoutParams);
                    if (childAt instanceof ConstraintHelper) {
                        constraint.layout.mReferenceIds = ((ConstraintHelper) childAt).getReferencedIds();
                        if (childAt instanceof Barrier) {
                            Barrier barrier = (Barrier) childAt;
                            constraint.layout.mBarrierAllowsGoneWidgets = barrier.getAllowsGoneWidget();
                            constraint.layout.mBarrierDirection = barrier.getType();
                            constraint.layout.mBarrierMargin = barrier.getMargin();
                        }
                    }
                    constraint.layout.mApply = true;
                }
                PropertySet propertySet = constraint.propertySet;
                if (!propertySet.mApply) {
                    propertySet.visibility = childAt.getVisibility();
                    constraint.propertySet.alpha = childAt.getAlpha();
                    constraint.propertySet.mApply = true;
                }
                Transform transform = constraint.transform;
                if (!transform.mApply) {
                    transform.mApply = true;
                    transform.rotation = childAt.getRotation();
                    constraint.transform.rotationX = childAt.getRotationX();
                    constraint.transform.rotationY = childAt.getRotationY();
                    constraint.transform.scaleX = childAt.getScaleX();
                    constraint.transform.scaleY = childAt.getScaleY();
                    float pivotX = childAt.getPivotX();
                    float pivotY = childAt.getPivotY();
                    if (pivotX != AudioStats.AUDIO_AMPLITUDE_NONE || pivotY != AudioStats.AUDIO_AMPLITUDE_NONE) {
                        Transform transform2 = constraint.transform;
                        transform2.transformPivotX = pivotX;
                        transform2.transformPivotY = pivotY;
                    }
                    constraint.transform.translationX = childAt.getTranslationX();
                    constraint.transform.translationY = childAt.getTranslationY();
                    constraint.transform.translationZ = childAt.getTranslationZ();
                    Transform transform3 = constraint.transform;
                    if (transform3.applyElevation) {
                        transform3.elevation = childAt.getElevation();
                    }
                }
            }
        }
    }

    public void removeAttribute(String str) {
        this.mSavedAttributes.remove(str);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void removeFromHorizontalChain(int r8) {
        /*
            r7 = this;
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r1 = r7.mConstraints
            java.lang.Integer r2 = java.lang.Integer.valueOf(r8)
            boolean r1 = r1.containsKey(r2)
            if (r1 == 0) goto L9e
            java.util.HashMap<java.lang.Integer, androidx.constraintlayout.widget.ConstraintSet$Constraint> r1 = r7.mConstraints
            java.lang.Object r1 = r1.get(r2)
            androidx.constraintlayout.widget.ConstraintSet$Constraint r1 = (androidx.constraintlayout.widget.ConstraintSet.Constraint) r1
            if (r1 != 0) goto L18
            goto L9e
        L18:
            androidx.constraintlayout.widget.ConstraintSet$Layout r1 = r1.layout
            int r2 = r1.leftToRight
            int r3 = r1.rightToLeft
            r4 = -1
            if (r2 != r4) goto L67
            if (r3 == r4) goto L25
            r2 = r4
            goto L67
        L25:
            int r2 = r1.startToEnd
            int r3 = r1.endToStart
            if (r2 != r4) goto L2e
            if (r3 == r4) goto L5e
            r2 = r4
        L2e:
            if (r2 == r4) goto L42
            if (r3 == r4) goto L42
            r4 = 6
            r5 = 0
            r1 = r2
            r2 = 7
            r0 = r7
            r0.connect(r1, r2, r3, r4, r5)
            r1 = r3
            r4 = 7
            r2 = 6
            r3 = -1
            r0.connect(r1, r2, r3, r4, r5)
            goto L5e
        L42:
            if (r3 == r4) goto L5e
            r0 = r3
            int r3 = r1.rightToRight
            if (r3 == r4) goto L52
            r2 = 7
            r5 = 0
            r1 = -1
            r4 = r2
            r0 = r7
            r0.connect(r1, r2, r3, r4, r5)
            goto L5e
        L52:
            int r3 = r1.leftToLeft
            if (r3 == r4) goto L5e
            r2 = 6
            r5 = 0
            r4 = r2
            r1 = r0
            r0 = r7
            r0.connect(r1, r2, r3, r4, r5)
        L5e:
            r1 = 6
            r7.clear(r8, r1)
            r1 = 7
            r7.clear(r8, r1)
            return
        L67:
            if (r2 == r4) goto L7c
            if (r3 == r4) goto L7c
            r4 = 1
            r5 = 0
            r1 = r2
            r2 = 2
            r0 = r7
            r0.connect(r1, r2, r3, r4, r5)
            r6 = r3
            r3 = r1
            r1 = r6
            r4 = 2
            r2 = 1
            r0.connect(r1, r2, r3, r4, r5)
            goto L96
        L7c:
            r0 = r3
            int r3 = r1.rightToRight
            if (r3 == r4) goto L8a
            r4 = 2
            r5 = 0
            r1 = r2
            r2 = 2
            r0 = r7
            r0.connect(r1, r2, r3, r4, r5)
            goto L96
        L8a:
            int r3 = r1.leftToLeft
            if (r3 == r4) goto L96
            r4 = 1
            r5 = 0
            r2 = 1
            r1 = r0
            r0 = r7
            r0.connect(r1, r2, r3, r4, r5)
        L96:
            r1 = 1
            r7.clear(r8, r1)
            r1 = 2
            r7.clear(r8, r1)
        L9e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintSet.removeFromHorizontalChain(int):void");
    }

    public void removeFromVerticalChain(int i2) {
        ConstraintSet constraintSet;
        int i3;
        HashMap<Integer, Constraint> map = this.mConstraints;
        Integer numValueOf = Integer.valueOf(i2);
        if (map.containsKey(numValueOf)) {
            Constraint constraint = this.mConstraints.get(numValueOf);
            if (constraint == null) {
                return;
            }
            Layout layout = constraint.layout;
            int i4 = layout.topToBottom;
            int i5 = layout.bottomToTop;
            if (i4 == -1) {
                if (i5 != -1) {
                    i3 = -1;
                }
                constraintSet = this;
            } else {
                i3 = i4;
            }
            if (i3 == -1 || i5 == -1) {
                int i6 = layout.bottomToBottom;
                if (i6 != -1) {
                    connect(i3, 4, i6, 4, 0);
                } else {
                    int i7 = layout.topToTop;
                    if (i7 != -1) {
                        constraintSet = this;
                        constraintSet.connect(i5, 3, i7, 3, 0);
                    }
                }
                constraintSet = this;
            } else {
                int i8 = i3;
                constraintSet = this;
                constraintSet.connect(i8, 4, i5, 3, 0);
                constraintSet.connect(i5, 3, i8, 4, 0);
            }
        } else {
            constraintSet = this;
        }
        constraintSet.clear(i2, 3);
        constraintSet.clear(i2, 4);
    }

    public void setAlpha(int i2, float f2) {
        get(i2).propertySet.alpha = f2;
    }

    public void setApplyElevation(int i2, boolean z) {
        get(i2).transform.applyElevation = z;
    }

    public void setBarrierType(int i2, int i3) {
        get(i2).layout.mHelperType = i3;
    }

    public void setColorValue(int i2, String str, int i3) {
        get(i2).setColorValue(str, i3);
    }

    public void setDimensionRatio(int i2, String str) {
        get(i2).layout.dimensionRatio = str;
    }

    public void setEditorAbsoluteX(int i2, int i3) {
        get(i2).layout.editorAbsoluteX = i3;
    }

    public void setEditorAbsoluteY(int i2, int i3) {
        get(i2).layout.editorAbsoluteY = i3;
    }

    public void setElevation(int i2, float f2) {
        get(i2).transform.elevation = f2;
        get(i2).transform.applyElevation = true;
    }

    public void setFloatValue(int i2, String str, float f2) {
        get(i2).setFloatValue(str, f2);
    }

    public void setForceId(boolean z) {
        this.mForceId = z;
    }

    public void setGoneMargin(int i2, int i3, int i4) {
        Constraint constraint = get(i2);
        switch (i3) {
            case 1:
                constraint.layout.goneLeftMargin = i4;
                return;
            case 2:
                constraint.layout.goneRightMargin = i4;
                return;
            case 3:
                constraint.layout.goneTopMargin = i4;
                return;
            case 4:
                constraint.layout.goneBottomMargin = i4;
                return;
            case 5:
                constraint.layout.goneBaselineMargin = i4;
                return;
            case 6:
                constraint.layout.goneStartMargin = i4;
                return;
            case 7:
                constraint.layout.goneEndMargin = i4;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setGuidelineBegin(int i2, int i3) {
        get(i2).layout.guideBegin = i3;
        get(i2).layout.guideEnd = -1;
        get(i2).layout.guidePercent = -1.0f;
    }

    public void setGuidelineEnd(int i2, int i3) {
        get(i2).layout.guideEnd = i3;
        get(i2).layout.guideBegin = -1;
        get(i2).layout.guidePercent = -1.0f;
    }

    public void setGuidelinePercent(int i2, float f2) {
        get(i2).layout.guidePercent = f2;
        get(i2).layout.guideEnd = -1;
        get(i2).layout.guideBegin = -1;
    }

    public void setHorizontalBias(int i2, float f2) {
        get(i2).layout.horizontalBias = f2;
    }

    public void setHorizontalChainStyle(int i2, int i3) {
        get(i2).layout.horizontalChainStyle = i3;
    }

    public void setHorizontalWeight(int i2, float f2) {
        get(i2).layout.horizontalWeight = f2;
    }

    public void setIntValue(int i2, String str, int i3) {
        get(i2).setIntValue(str, i3);
    }

    public void setLayoutWrapBehavior(int i2, int i3) {
        if (i3 < 0 || i3 > 3) {
            return;
        }
        get(i2).layout.mWrapBehavior = i3;
    }

    public void setMargin(int i2, int i3, int i4) {
        Constraint constraint = get(i2);
        switch (i3) {
            case 1:
                constraint.layout.leftMargin = i4;
                return;
            case 2:
                constraint.layout.rightMargin = i4;
                return;
            case 3:
                constraint.layout.topMargin = i4;
                return;
            case 4:
                constraint.layout.bottomMargin = i4;
                return;
            case 5:
                constraint.layout.baselineMargin = i4;
                return;
            case 6:
                constraint.layout.startMargin = i4;
                return;
            case 7:
                constraint.layout.endMargin = i4;
                return;
            default:
                throw new IllegalArgumentException("unknown constraint");
        }
    }

    public void setReferencedIds(int i2, int... iArr) {
        get(i2).layout.mReferenceIds = iArr;
    }

    public void setRotation(int i2, float f2) {
        get(i2).transform.rotation = f2;
    }

    public void setRotationX(int i2, float f2) {
        get(i2).transform.rotationX = f2;
    }

    public void setRotationY(int i2, float f2) {
        get(i2).transform.rotationY = f2;
    }

    public void setScaleX(int i2, float f2) {
        get(i2).transform.scaleX = f2;
    }

    public void setScaleY(int i2, float f2) {
        get(i2).transform.scaleY = f2;
    }

    public void setStateLabels(String str) {
        this.mMatchLabels = str.split(",");
        int i2 = 0;
        while (true) {
            String[] strArr = this.mMatchLabels;
            if (i2 >= strArr.length) {
                return;
            }
            strArr[i2] = strArr[i2].trim();
            i2++;
        }
    }

    public void setStateLabelsList(String... strArr) {
        this.mMatchLabels = strArr;
        int i2 = 0;
        while (true) {
            String[] strArr2 = this.mMatchLabels;
            if (i2 >= strArr2.length) {
                return;
            }
            strArr2[i2] = strArr2[i2].trim();
            i2++;
        }
    }

    public void setStringValue(int i2, String str, String str2) {
        get(i2).setStringValue(str, str2);
    }

    public void setTransformPivot(int i2, float f2, float f3) {
        Transform transform = get(i2).transform;
        transform.transformPivotY = f3;
        transform.transformPivotX = f2;
    }

    public void setTransformPivotX(int i2, float f2) {
        get(i2).transform.transformPivotX = f2;
    }

    public void setTransformPivotY(int i2, float f2) {
        get(i2).transform.transformPivotY = f2;
    }

    public void setTranslation(int i2, float f2, float f3) {
        Transform transform = get(i2).transform;
        transform.translationX = f2;
        transform.translationY = f3;
    }

    public void setTranslationX(int i2, float f2) {
        get(i2).transform.translationX = f2;
    }

    public void setTranslationY(int i2, float f2) {
        get(i2).transform.translationY = f2;
    }

    public void setTranslationZ(int i2, float f2) {
        get(i2).transform.translationZ = f2;
    }

    public void setValidateOnParse(boolean z) {
        this.mValidate = z;
    }

    public void setVerticalBias(int i2, float f2) {
        get(i2).layout.verticalBias = f2;
    }

    public void setVerticalChainStyle(int i2, int i3) {
        get(i2).layout.verticalChainStyle = i3;
    }

    public void setVerticalWeight(int i2, float f2) {
        get(i2).layout.verticalWeight = f2;
    }

    public void setVisibility(int i2, int i3) {
        get(i2).propertySet.visibility = i3;
    }

    public void setVisibilityMode(int i2, int i3) {
        get(i2).propertySet.mVisibilityMode = i3;
    }

    public void writeState(Writer writer, ConstraintLayout constraintLayout, int i2) throws IOException {
        writer.write("\n---------------------------------------------\n");
        if ((i2 & 1) == 1) {
            new WriteXmlEngine(writer, constraintLayout, i2).writeLayout();
        } else {
            new WriteJsonEngine(writer, constraintLayout, i2).writeLayout();
        }
        writer.write("\n---------------------------------------------\n");
    }

    public void centerHorizontally(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f2) {
        connect(i2, 1, i3, i4, i5);
        connect(i2, 2, i6, i7, i8);
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i2));
        if (constraint != null) {
            constraint.layout.horizontalBias = f2;
        }
    }

    public void centerHorizontallyRtl(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f2) {
        connect(i2, 6, i3, i4, i5);
        connect(i2, 7, i6, i7, i8);
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i2));
        if (constraint != null) {
            constraint.layout.horizontalBias = f2;
        }
    }

    public void centerVertically(int i2, int i3, int i4, int i5, int i6, int i7, int i8, float f2) {
        connect(i2, 3, i3, i4, i5);
        connect(i2, 4, i6, i7, i8);
        Constraint constraint = this.mConstraints.get(Integer.valueOf(i2));
        if (constraint != null) {
            constraint.layout.verticalBias = f2;
        }
    }

    /* compiled from: WazeSource */
    public class Constraint {
        Delta mDelta;
        String mTargetString;
        int mViewId;
        public final PropertySet propertySet = new PropertySet();
        public final Motion motion = new Motion();
        public final Layout layout = new Layout();
        public final Transform transform = new Transform();
        public HashMap<String, ConstraintAttribute> mCustomConstraints = new HashMap<>();

        /* JADX INFO: Access modifiers changed from: private */
        public void fillFrom(int i2, ConstraintLayout.LayoutParams layoutParams) {
            this.mViewId = i2;
            Layout layout = this.layout;
            layout.leftToLeft = layoutParams.leftToLeft;
            layout.leftToRight = layoutParams.leftToRight;
            layout.rightToLeft = layoutParams.rightToLeft;
            layout.rightToRight = layoutParams.rightToRight;
            layout.topToTop = layoutParams.topToTop;
            layout.topToBottom = layoutParams.topToBottom;
            layout.bottomToTop = layoutParams.bottomToTop;
            layout.bottomToBottom = layoutParams.bottomToBottom;
            layout.baselineToBaseline = layoutParams.baselineToBaseline;
            layout.baselineToTop = layoutParams.baselineToTop;
            layout.baselineToBottom = layoutParams.baselineToBottom;
            layout.startToEnd = layoutParams.startToEnd;
            layout.startToStart = layoutParams.startToStart;
            layout.endToStart = layoutParams.endToStart;
            layout.endToEnd = layoutParams.endToEnd;
            layout.horizontalBias = layoutParams.horizontalBias;
            layout.verticalBias = layoutParams.verticalBias;
            layout.dimensionRatio = layoutParams.dimensionRatio;
            layout.circleConstraint = layoutParams.circleConstraint;
            layout.circleRadius = layoutParams.circleRadius;
            layout.circleAngle = layoutParams.circleAngle;
            layout.editorAbsoluteX = layoutParams.editorAbsoluteX;
            layout.editorAbsoluteY = layoutParams.editorAbsoluteY;
            layout.orientation = layoutParams.orientation;
            layout.guidePercent = layoutParams.guidePercent;
            layout.guideBegin = layoutParams.guideBegin;
            layout.guideEnd = layoutParams.guideEnd;
            layout.mWidth = layoutParams.width;
            this.layout.mHeight = layoutParams.height;
            this.layout.leftMargin = layoutParams.leftMargin;
            this.layout.rightMargin = layoutParams.rightMargin;
            this.layout.topMargin = layoutParams.topMargin;
            Layout layout2 = this.layout;
            layout2.bottomMargin = layoutParams.bottomMargin;
            layout2.baselineMargin = layoutParams.baselineMargin;
            layout2.verticalWeight = layoutParams.verticalWeight;
            layout2.horizontalWeight = layoutParams.horizontalWeight;
            layout2.verticalChainStyle = layoutParams.verticalChainStyle;
            layout2.horizontalChainStyle = layoutParams.horizontalChainStyle;
            layout2.constrainedWidth = layoutParams.constrainedWidth;
            layout2.constrainedHeight = layoutParams.constrainedHeight;
            layout2.widthDefault = layoutParams.matchConstraintDefaultWidth;
            layout2.heightDefault = layoutParams.matchConstraintDefaultHeight;
            layout2.widthMax = layoutParams.matchConstraintMaxWidth;
            layout2.heightMax = layoutParams.matchConstraintMaxHeight;
            layout2.widthMin = layoutParams.matchConstraintMinWidth;
            layout2.heightMin = layoutParams.matchConstraintMinHeight;
            layout2.widthPercent = layoutParams.matchConstraintPercentWidth;
            layout2.heightPercent = layoutParams.matchConstraintPercentHeight;
            layout2.mConstraintTag = layoutParams.constraintTag;
            layout2.goneTopMargin = layoutParams.goneTopMargin;
            layout2.goneBottomMargin = layoutParams.goneBottomMargin;
            layout2.goneLeftMargin = layoutParams.goneLeftMargin;
            layout2.goneRightMargin = layoutParams.goneRightMargin;
            layout2.goneStartMargin = layoutParams.goneStartMargin;
            layout2.goneEndMargin = layoutParams.goneEndMargin;
            layout2.goneBaselineMargin = layoutParams.goneBaselineMargin;
            layout2.mWrapBehavior = layoutParams.wrapBehaviorInParent;
            layout2.endMargin = layoutParams.getMarginEnd();
            this.layout.startMargin = layoutParams.getMarginStart();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillFromConstraints(int i2, Constraints.LayoutParams layoutParams) {
            fillFrom(i2, layoutParams);
            this.propertySet.alpha = layoutParams.alpha;
            Transform transform = this.transform;
            transform.rotation = layoutParams.rotation;
            transform.rotationX = layoutParams.rotationX;
            transform.rotationY = layoutParams.rotationY;
            transform.scaleX = layoutParams.scaleX;
            transform.scaleY = layoutParams.scaleY;
            transform.transformPivotX = layoutParams.transformPivotX;
            transform.transformPivotY = layoutParams.transformPivotY;
            transform.translationX = layoutParams.translationX;
            transform.translationY = layoutParams.translationY;
            transform.translationZ = layoutParams.translationZ;
            transform.elevation = layoutParams.elevation;
            transform.applyElevation = layoutParams.applyElevation;
        }

        private ConstraintAttribute get(String str, ConstraintAttribute.AttributeType attributeType) {
            if (!this.mCustomConstraints.containsKey(str)) {
                ConstraintAttribute constraintAttribute = new ConstraintAttribute(str, attributeType);
                this.mCustomConstraints.put(str, constraintAttribute);
                return constraintAttribute;
            }
            ConstraintAttribute constraintAttribute2 = this.mCustomConstraints.get(str);
            if (constraintAttribute2.getType() == attributeType) {
                return constraintAttribute2;
            }
            throw new IllegalArgumentException("ConstraintAttribute is already a ".concat(String.valueOf(constraintAttribute2.getType().name())));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setColorValue(String str, int i2) {
            get(str, ConstraintAttribute.AttributeType.COLOR_TYPE).setColorValue(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setFloatValue(String str, float f2) {
            get(str, ConstraintAttribute.AttributeType.FLOAT_TYPE).setFloatValue(f2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setIntValue(String str, int i2) {
            get(str, ConstraintAttribute.AttributeType.INT_TYPE).setIntValue(i2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void setStringValue(String str, String str2) {
            get(str, ConstraintAttribute.AttributeType.STRING_TYPE).setStringValue(str2);
        }

        public void applyDelta(Constraint constraint) {
            Delta delta = this.mDelta;
            if (delta != null) {
                delta.applyDelta(constraint);
            }
        }

        public void applyTo(ConstraintLayout.LayoutParams layoutParams) {
            Layout layout = this.layout;
            layoutParams.leftToLeft = layout.leftToLeft;
            layoutParams.leftToRight = layout.leftToRight;
            layoutParams.rightToLeft = layout.rightToLeft;
            layoutParams.rightToRight = layout.rightToRight;
            layoutParams.topToTop = layout.topToTop;
            layoutParams.topToBottom = layout.topToBottom;
            layoutParams.bottomToTop = layout.bottomToTop;
            layoutParams.bottomToBottom = layout.bottomToBottom;
            layoutParams.baselineToBaseline = layout.baselineToBaseline;
            layoutParams.baselineToTop = layout.baselineToTop;
            layoutParams.baselineToBottom = layout.baselineToBottom;
            layoutParams.startToEnd = layout.startToEnd;
            layoutParams.startToStart = layout.startToStart;
            layoutParams.endToStart = layout.endToStart;
            layoutParams.endToEnd = layout.endToEnd;
            layoutParams.leftMargin = layout.leftMargin;
            layoutParams.rightMargin = this.layout.rightMargin;
            layoutParams.topMargin = this.layout.topMargin;
            layoutParams.bottomMargin = this.layout.bottomMargin;
            Layout layout2 = this.layout;
            layoutParams.goneStartMargin = layout2.goneStartMargin;
            layoutParams.goneEndMargin = layout2.goneEndMargin;
            layoutParams.goneTopMargin = layout2.goneTopMargin;
            layoutParams.goneBottomMargin = layout2.goneBottomMargin;
            layoutParams.horizontalBias = layout2.horizontalBias;
            layoutParams.verticalBias = layout2.verticalBias;
            layoutParams.circleConstraint = layout2.circleConstraint;
            layoutParams.circleRadius = layout2.circleRadius;
            layoutParams.circleAngle = layout2.circleAngle;
            layoutParams.dimensionRatio = layout2.dimensionRatio;
            layoutParams.editorAbsoluteX = layout2.editorAbsoluteX;
            layoutParams.editorAbsoluteY = layout2.editorAbsoluteY;
            layoutParams.verticalWeight = layout2.verticalWeight;
            layoutParams.horizontalWeight = layout2.horizontalWeight;
            layoutParams.verticalChainStyle = layout2.verticalChainStyle;
            layoutParams.horizontalChainStyle = layout2.horizontalChainStyle;
            layoutParams.constrainedWidth = layout2.constrainedWidth;
            layoutParams.constrainedHeight = layout2.constrainedHeight;
            layoutParams.matchConstraintDefaultWidth = layout2.widthDefault;
            layoutParams.matchConstraintDefaultHeight = layout2.heightDefault;
            layoutParams.matchConstraintMaxWidth = layout2.widthMax;
            layoutParams.matchConstraintMaxHeight = layout2.heightMax;
            layoutParams.matchConstraintMinWidth = layout2.widthMin;
            layoutParams.matchConstraintMinHeight = layout2.heightMin;
            layoutParams.matchConstraintPercentWidth = layout2.widthPercent;
            layoutParams.matchConstraintPercentHeight = layout2.heightPercent;
            layoutParams.orientation = layout2.orientation;
            layoutParams.guidePercent = layout2.guidePercent;
            layoutParams.guideBegin = layout2.guideBegin;
            layoutParams.guideEnd = layout2.guideEnd;
            layoutParams.width = layout2.mWidth;
            layoutParams.height = this.layout.mHeight;
            Layout layout3 = this.layout;
            String str = layout3.mConstraintTag;
            if (str != null) {
                layoutParams.constraintTag = str;
            }
            layoutParams.wrapBehaviorInParent = layout3.mWrapBehavior;
            layoutParams.setMarginStart(layout3.startMargin);
            layoutParams.setMarginEnd(this.layout.endMargin);
            layoutParams.validate();
        }

        /* renamed from: clone, reason: merged with bridge method [inline-methods] */
        public Constraint m11652clone() {
            Constraint constraint = new Constraint();
            constraint.layout.copyFrom(this.layout);
            constraint.motion.copyFrom(this.motion);
            constraint.propertySet.copyFrom(this.propertySet);
            constraint.transform.copyFrom(this.transform);
            constraint.mViewId = this.mViewId;
            constraint.mDelta = this.mDelta;
            return constraint;
        }

        public void printDelta(String str) {
            Delta delta = this.mDelta;
            if (delta != null) {
                delta.printDelta(str);
            } else {
                Log.v(str, "DELTA IS NULL");
            }
        }

        /* compiled from: WazeSource */
        class Delta {
            private static final int INITIAL_BOOLEAN = 4;
            private static final int INITIAL_FLOAT = 10;
            private static final int INITIAL_INT = 10;
            private static final int INITIAL_STRING = 5;
            int[] mTypeInt = new int[10];
            int[] mValueInt = new int[10];
            int mCountInt = 0;
            int[] mTypeFloat = new int[10];
            float[] mValueFloat = new float[10];
            int mCountFloat = 0;
            int[] mTypeString = new int[5];
            String[] mValueString = new String[5];
            int mCountString = 0;
            int[] mTypeBoolean = new int[4];
            boolean[] mValueBoolean = new boolean[4];
            int mCountBoolean = 0;

            Delta() {
            }

            void add(int i2, String str) {
                int i3 = this.mCountString;
                int[] iArr = this.mTypeString;
                int length = iArr.length;
                if (i3 >= length) {
                    this.mTypeString = Arrays.copyOf(iArr, length + length);
                    String[] strArr = this.mValueString;
                    int length2 = strArr.length;
                    this.mValueString = (String[]) Arrays.copyOf(strArr, length2 + length2);
                }
                int[] iArr2 = this.mTypeString;
                int i4 = this.mCountString;
                iArr2[i4] = i2;
                String[] strArr2 = this.mValueString;
                this.mCountString = i4 + 1;
                strArr2[i4] = str;
            }

            void applyDelta(Constraint constraint) {
                for (int i2 = 0; i2 < this.mCountInt; i2++) {
                    ConstraintSet.setDeltaValue(constraint, this.mTypeInt[i2], this.mValueInt[i2]);
                }
                for (int i3 = 0; i3 < this.mCountFloat; i3++) {
                    ConstraintSet.setDeltaValue(constraint, this.mTypeFloat[i3], this.mValueFloat[i3]);
                }
                for (int i4 = 0; i4 < this.mCountString; i4++) {
                    ConstraintSet.setDeltaValue(constraint, this.mTypeString[i4], this.mValueString[i4]);
                }
                for (int i5 = 0; i5 < this.mCountBoolean; i5++) {
                    ConstraintSet.setDeltaValue(constraint, this.mTypeBoolean[i5], this.mValueBoolean[i5]);
                }
            }

            void printDelta(String str) {
                Log.v(str, "int");
                for (int i2 = 0; i2 < this.mCountInt; i2++) {
                    Log.v(str, this.mTypeInt[i2] + " = " + this.mValueInt[i2]);
                }
                Log.v(str, TypedValues.Custom.S_FLOAT);
                for (int i3 = 0; i3 < this.mCountFloat; i3++) {
                    Log.v(str, this.mTypeFloat[i3] + " = " + this.mValueFloat[i3]);
                }
                Log.v(str, "strings");
                for (int i4 = 0; i4 < this.mCountString; i4++) {
                    Log.v(str, this.mTypeString[i4] + " = " + this.mValueString[i4]);
                }
                Log.v(str, TypedValues.Custom.S_BOOLEAN);
                for (int i5 = 0; i5 < this.mCountBoolean; i5++) {
                    Log.v(str, this.mTypeBoolean[i5] + " = " + this.mValueBoolean[i5]);
                }
            }

            void add(int i2, int i3) {
                int i4 = this.mCountInt;
                int[] iArr = this.mTypeInt;
                int length = iArr.length;
                if (i4 >= length) {
                    this.mTypeInt = Arrays.copyOf(iArr, length + length);
                    int[] iArr2 = this.mValueInt;
                    int length2 = iArr2.length;
                    this.mValueInt = Arrays.copyOf(iArr2, length2 + length2);
                }
                int[] iArr3 = this.mTypeInt;
                int i5 = this.mCountInt;
                iArr3[i5] = i2;
                int[] iArr4 = this.mValueInt;
                this.mCountInt = i5 + 1;
                iArr4[i5] = i3;
            }

            void add(int i2, float f2) {
                int i3 = this.mCountFloat;
                int[] iArr = this.mTypeFloat;
                int length = iArr.length;
                if (i3 >= length) {
                    this.mTypeFloat = Arrays.copyOf(iArr, length + length);
                    float[] fArr = this.mValueFloat;
                    int length2 = fArr.length;
                    this.mValueFloat = Arrays.copyOf(fArr, length2 + length2);
                }
                int[] iArr2 = this.mTypeFloat;
                int i4 = this.mCountFloat;
                iArr2[i4] = i2;
                float[] fArr2 = this.mValueFloat;
                this.mCountFloat = i4 + 1;
                fArr2[i4] = f2;
            }

            void add(int i2, boolean z) {
                int i3 = this.mCountBoolean;
                int[] iArr = this.mTypeBoolean;
                int length = iArr.length;
                if (i3 >= length) {
                    this.mTypeBoolean = Arrays.copyOf(iArr, length + length);
                    boolean[] zArr = this.mValueBoolean;
                    int length2 = zArr.length;
                    this.mValueBoolean = Arrays.copyOf(zArr, length2 + length2);
                }
                int[] iArr2 = this.mTypeBoolean;
                int i4 = this.mCountBoolean;
                iArr2[i4] = i2;
                boolean[] zArr2 = this.mValueBoolean;
                this.mCountBoolean = i4 + 1;
                zArr2[i4] = z;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void fillFromConstraints(ConstraintHelper constraintHelper, int i2, Constraints.LayoutParams layoutParams) {
            fillFromConstraints(i2, layoutParams);
            if (constraintHelper instanceof Barrier) {
                Layout layout = this.layout;
                layout.mHelperType = 1;
                Barrier barrier = (Barrier) constraintHelper;
                layout.mBarrierDirection = barrier.getType();
                this.layout.mReferenceIds = barrier.getReferencedIds();
                this.layout.mBarrierMargin = barrier.getMargin();
            }
        }
    }

    /* compiled from: WazeSource */
    class WriteJsonEngine {
        private static final String SPACE = "       ";
        Context mContext;
        int mFlags;
        ConstraintLayout mLayout;
        Writer mWriter;
        int mUnknownCount = 0;
        final String mLEFT = "'left'";
        final String mRIGHT = "'right'";
        final String mBASELINE = "'baseline'";
        final String mBOTTOM = "'bottom'";
        final String mTOP = "'top'";
        final String mSTART = "'start'";
        final String mEND = "'end'";
        HashMap<Integer, String> mIdMap = new HashMap<>();

        WriteJsonEngine(Writer writer, ConstraintLayout constraintLayout, int i2) {
            this.mWriter = writer;
            this.mLayout = constraintLayout;
            this.mContext = constraintLayout.getContext();
            this.mFlags = i2;
        }

        private void writeDimension(String str, int i2, int i3, float f2, int i4, int i5, boolean z) throws IOException {
            if (i2 != 0) {
                if (i2 == -2) {
                    this.mWriter.write(SPACE + str + ": 'wrap'\n");
                    return;
                }
                Writer writer = this.mWriter;
                if (i2 == -1) {
                    writer.write(SPACE + str + ": 'parent'\n");
                    return;
                }
                writer.write(SPACE + str + ": " + i2 + ",\n");
                return;
            }
            if (i5 == -1) {
                if (i4 == -1) {
                    if (i3 == 1) {
                        this.mWriter.write(SPACE + str + ": '???????????',\n");
                        return;
                    }
                    if (i3 != 2) {
                        return;
                    }
                    this.mWriter.write(SPACE + str + ": '" + f2 + "%',\n");
                    return;
                }
                i5 = -1;
            }
            if (i3 == 0) {
                this.mWriter.write(SPACE + str + ": {'spread' ," + i4 + ", " + i5 + "}\n");
                return;
            }
            if (i3 == 1) {
                this.mWriter.write(SPACE + str + ": {'wrap' ," + i4 + ", " + i5 + "}\n");
                return;
            }
            if (i3 != 2) {
                return;
            }
            this.mWriter.write(SPACE + str + ": {'" + f2 + "'% ," + i4 + ", " + i5 + "}\n");
        }

        private void writeGuideline(int i2, int i3, int i4, float f2) throws IOException {
            writeVariable("'orientation'", i2);
            writeVariable("'guideBegin'", i3);
            writeVariable("'guideEnd'", i4);
            writeVariable("'guidePercent'", f2);
        }

        String getName(int i2) {
            HashMap<Integer, String> map = this.mIdMap;
            Integer numValueOf = Integer.valueOf(i2);
            if (map.containsKey(numValueOf)) {
                return "'" + this.mIdMap.get(numValueOf) + "'";
            }
            if (i2 == 0) {
                return "'parent'";
            }
            String strLookup = lookup(i2);
            this.mIdMap.put(numValueOf, strLookup);
            return "'" + strLookup + "'";
        }

        String lookup(int i2) {
            try {
                if (i2 != -1) {
                    return this.mContext.getResources().getResourceEntryName(i2);
                }
                StringBuilder sb = new StringBuilder(EnvironmentCompat.MEDIA_UNKNOWN);
                int i3 = this.mUnknownCount + 1;
                this.mUnknownCount = i3;
                sb.append(i3);
                return sb.toString();
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder(EnvironmentCompat.MEDIA_UNKNOWN);
                int i4 = this.mUnknownCount + 1;
                this.mUnknownCount = i4;
                sb2.append(i4);
                return sb2.toString();
            }
        }

        void writeCircle(int i2, float f2, int i3) throws IOException {
            if (i2 == -1) {
                return;
            }
            this.mWriter.write("       circle");
            this.mWriter.write(":[");
            this.mWriter.write(getName(i2));
            this.mWriter.write(", " + f2);
            this.mWriter.write(i3 + "]");
        }

        void writeConstraint(String str, int i2, String str2, int i3, int i4) throws IOException {
            if (i2 == -1) {
                return;
            }
            this.mWriter.write(SPACE.concat(String.valueOf(str)));
            this.mWriter.write(":[");
            this.mWriter.write(getName(i2));
            this.mWriter.write(" , ");
            this.mWriter.write(str2);
            if (i3 != 0) {
                this.mWriter.write(" , " + i3);
            }
            this.mWriter.write("],\n");
        }

        void writeLayout() throws IOException {
            this.mWriter.write("\n'ConstraintSet':{\n");
            for (Integer num : ConstraintSet.this.mConstraints.keySet()) {
                Constraint constraint = (Constraint) ConstraintSet.this.mConstraints.get(num);
                this.mWriter.write(String.valueOf(getName(num.intValue())).concat(":{\n"));
                Layout layout = constraint.layout;
                writeDimension("height", layout.mHeight, layout.heightDefault, layout.heightPercent, layout.heightMin, layout.heightMax, layout.constrainedHeight);
                writeDimension("width", layout.mWidth, layout.widthDefault, layout.widthPercent, layout.widthMin, layout.widthMax, layout.constrainedWidth);
                writeConstraint("'left'", layout.leftToLeft, "'left'", layout.leftMargin, layout.goneLeftMargin);
                writeConstraint("'left'", layout.leftToRight, "'right'", layout.leftMargin, layout.goneLeftMargin);
                writeConstraint("'right'", layout.rightToLeft, "'left'", layout.rightMargin, layout.goneRightMargin);
                writeConstraint("'right'", layout.rightToRight, "'right'", layout.rightMargin, layout.goneRightMargin);
                writeConstraint("'baseline'", layout.baselineToBaseline, "'baseline'", -1, layout.goneBaselineMargin);
                writeConstraint("'baseline'", layout.baselineToTop, "'top'", -1, layout.goneBaselineMargin);
                writeConstraint("'baseline'", layout.baselineToBottom, "'bottom'", -1, layout.goneBaselineMargin);
                writeConstraint("'top'", layout.topToBottom, "'bottom'", layout.topMargin, layout.goneTopMargin);
                writeConstraint("'top'", layout.topToTop, "'top'", layout.topMargin, layout.goneTopMargin);
                writeConstraint("'bottom'", layout.bottomToBottom, "'bottom'", layout.bottomMargin, layout.goneBottomMargin);
                writeConstraint("'bottom'", layout.bottomToTop, "'top'", layout.bottomMargin, layout.goneBottomMargin);
                writeConstraint("'start'", layout.startToStart, "'start'", layout.startMargin, layout.goneStartMargin);
                writeConstraint("'start'", layout.startToEnd, "'end'", layout.startMargin, layout.goneStartMargin);
                writeConstraint("'end'", layout.endToStart, "'start'", layout.endMargin, layout.goneEndMargin);
                writeConstraint("'end'", layout.endToEnd, "'end'", layout.endMargin, layout.goneEndMargin);
                writeVariable("'horizontalBias'", layout.horizontalBias, 0.5f);
                writeVariable("'verticalBias'", layout.verticalBias, 0.5f);
                writeCircle(layout.circleConstraint, layout.circleAngle, layout.circleRadius);
                writeGuideline(layout.orientation, layout.guideBegin, layout.guideEnd, layout.guidePercent);
                writeVariable("'dimensionRatio'", layout.dimensionRatio);
                writeVariable("'barrierMargin'", layout.mBarrierMargin);
                writeVariable("'type'", layout.mHelperType);
                writeVariable("'ReferenceId'", layout.mReferenceIdString);
                writeVariable("'mBarrierAllowsGoneWidgets'", layout.mBarrierAllowsGoneWidgets, true);
                writeVariable("'WrapBehavior'", layout.mWrapBehavior);
                writeVariable("'verticalWeight'", layout.verticalWeight);
                writeVariable("'horizontalWeight'", layout.horizontalWeight);
                writeVariable("'horizontalChainStyle'", layout.horizontalChainStyle);
                writeVariable("'verticalChainStyle'", layout.verticalChainStyle);
                writeVariable("'barrierDirection'", layout.mBarrierDirection);
                int[] iArr = layout.mReferenceIds;
                if (iArr != null) {
                    writeVariable("'ReferenceIds'", iArr);
                }
                this.mWriter.write("}\n");
            }
            this.mWriter.write("}\n");
        }

        void writeVariable(String str, int[] iArr) throws IOException {
            if (iArr == null) {
                return;
            }
            this.mWriter.write(SPACE.concat(String.valueOf(str)));
            this.mWriter.write(": ");
            int i2 = 0;
            while (true) {
                int length = iArr.length;
                Writer writer = this.mWriter;
                if (i2 >= length) {
                    writer.write("],\n");
                    return;
                } else {
                    writer.write((i2 == 0 ? "[" : ", ").concat(String.valueOf(getName(iArr[i2]))));
                    i2++;
                }
            }
        }

        void writeVariable(String str, float f2, float f3) throws IOException {
            if (f2 == f3) {
                return;
            }
            this.mWriter.write(SPACE.concat(String.valueOf(str)));
            this.mWriter.write(": " + f2);
            this.mWriter.write(",\n");
        }

        void writeVariable(String str, int i2) throws IOException {
            if (i2 == 0 || i2 == -1) {
                return;
            }
            this.mWriter.write(SPACE.concat(String.valueOf(str)));
            this.mWriter.write(":");
            this.mWriter.write(", " + i2);
            this.mWriter.write("\n");
        }

        void writeVariable(String str, String str2) throws IOException {
            if (str2 == null) {
                return;
            }
            this.mWriter.write(SPACE.concat(String.valueOf(str)));
            this.mWriter.write(":");
            this.mWriter.write(", ".concat(str2));
            this.mWriter.write("\n");
        }

        void writeVariable(String str, boolean z) throws IOException {
            if (z) {
                this.mWriter.write(SPACE.concat(String.valueOf(str)));
                this.mWriter.write(": true");
                this.mWriter.write(",\n");
            }
        }

        void writeVariable(String str, boolean z, boolean z2) throws IOException {
            if (z == z2) {
                return;
            }
            this.mWriter.write(SPACE.concat(String.valueOf(str)));
            this.mWriter.write(": " + z);
            this.mWriter.write(",\n");
        }

        void writeVariable(String str, float f2) throws IOException {
            if (f2 == -1.0f) {
                return;
            }
            this.mWriter.write(SPACE.concat(String.valueOf(str)));
            this.mWriter.write(": " + f2);
            this.mWriter.write(",\n");
        }
    }

    /* compiled from: WazeSource */
    class WriteXmlEngine {
        private static final String SPACE = "\n       ";
        Context mContext;
        int mFlags;
        ConstraintLayout mLayout;
        Writer mWriter;
        int mUnknownCount = 0;
        final String mLEFT = "'left'";
        final String mRIGHT = "'right'";
        final String mBASELINE = "'baseline'";
        final String mBOTTOM = "'bottom'";
        final String mTOP = "'top'";
        final String mSTART = "'start'";
        final String mEND = "'end'";
        HashMap<Integer, String> mIdMap = new HashMap<>();

        WriteXmlEngine(Writer writer, ConstraintLayout constraintLayout, int i2) {
            this.mWriter = writer;
            this.mLayout = constraintLayout;
            this.mContext = constraintLayout.getContext();
            this.mFlags = i2;
        }

        private void writeBaseDimension(String str, int i2, int i3) throws IOException {
            if (i2 != i3) {
                if (i2 == -2) {
                    this.mWriter.write(SPACE + str + "=\"wrap_content\"");
                    return;
                }
                Writer writer = this.mWriter;
                if (i2 == -1) {
                    writer.write(SPACE + str + "=\"match_parent\"");
                    return;
                }
                writer.write(SPACE + str + "=\"" + i2 + "dp\"");
            }
        }

        private void writeBoolen(String str, boolean z, boolean z2) throws IOException {
            if (z != z2) {
                this.mWriter.write(SPACE + str + "=\"" + z + "dp\"");
            }
        }

        private void writeDimension(String str, int i2, int i3) throws IOException {
            if (i2 != i3) {
                this.mWriter.write(SPACE + str + "=\"" + i2 + "dp\"");
            }
        }

        private void writeEnum(String str, int i2, String[] strArr, int i3) throws IOException {
            if (i2 != i3) {
                this.mWriter.write(SPACE + str + "=\"" + strArr[i2] + "\"");
            }
        }

        String getName(int i2) {
            HashMap<Integer, String> map = this.mIdMap;
            Integer numValueOf = Integer.valueOf(i2);
            if (map.containsKey(numValueOf)) {
                return "@+id/" + this.mIdMap.get(numValueOf) + "";
            }
            if (i2 == 0) {
                return ConstraintSet.KEY_PERCENT_PARENT;
            }
            String strLookup = lookup(i2);
            this.mIdMap.put(numValueOf, strLookup);
            return "@+id/" + strLookup + "";
        }

        String lookup(int i2) {
            try {
                if (i2 != -1) {
                    return this.mContext.getResources().getResourceEntryName(i2);
                }
                StringBuilder sb = new StringBuilder(EnvironmentCompat.MEDIA_UNKNOWN);
                int i3 = this.mUnknownCount + 1;
                this.mUnknownCount = i3;
                sb.append(i3);
                return sb.toString();
            } catch (Exception unused) {
                StringBuilder sb2 = new StringBuilder(EnvironmentCompat.MEDIA_UNKNOWN);
                int i4 = this.mUnknownCount + 1;
                this.mUnknownCount = i4;
                sb2.append(i4);
                return sb2.toString();
            }
        }

        void writeCircle(int i2, float f2, int i3) throws IOException {
            if (i2 == -1) {
                return;
            }
            this.mWriter.write(TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE);
            this.mWriter.write(":[");
            this.mWriter.write(getName(i2));
            this.mWriter.write(", " + f2);
            this.mWriter.write(i3 + "]");
        }

        void writeConstraint(String str, int i2, String str2, int i3, int i4) throws IOException {
            if (i2 == -1) {
                return;
            }
            this.mWriter.write(SPACE.concat(String.valueOf(str)));
            this.mWriter.write(":[");
            this.mWriter.write(getName(i2));
            this.mWriter.write(" , ");
            this.mWriter.write(str2);
            if (i3 != 0) {
                this.mWriter.write(" , " + i3);
            }
            this.mWriter.write("],\n");
        }

        void writeLayout() throws IOException {
            this.mWriter.write("\n<ConstraintSet>\n");
            for (Integer num : ConstraintSet.this.mConstraints.keySet()) {
                Constraint constraint = (Constraint) ConstraintSet.this.mConstraints.get(num);
                String name = getName(num.intValue());
                this.mWriter.write("  <Constraint");
                this.mWriter.write("\n       android:id=\"" + name + "\"");
                Layout layout = constraint.layout;
                writeBaseDimension("android:layout_width", layout.mWidth, -5);
                writeBaseDimension("android:layout_height", layout.mHeight, -5);
                writeVariable("app:layout_constraintGuide_begin", layout.guideBegin, -1.0f);
                writeVariable("app:layout_constraintGuide_end", layout.guideEnd, -1.0f);
                writeVariable("app:layout_constraintGuide_percent", layout.guidePercent, -1.0f);
                writeVariable("app:layout_constraintHorizontal_bias", layout.horizontalBias, 0.5f);
                writeVariable("app:layout_constraintVertical_bias", layout.verticalBias, 0.5f);
                writeVariable("app:layout_constraintDimensionRatio", layout.dimensionRatio, (String) null);
                writeXmlConstraint("app:layout_constraintCircle", layout.circleConstraint);
                writeVariable("app:layout_constraintCircleRadius", layout.circleRadius, 0.0f);
                writeVariable("app:layout_constraintCircleAngle", layout.circleAngle, 0.0f);
                writeVariable("android:orientation", layout.orientation, -1.0f);
                writeVariable("app:layout_constraintVertical_weight", layout.verticalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_weight", layout.horizontalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_chainStyle", layout.horizontalChainStyle, 0.0f);
                writeVariable("app:layout_constraintVertical_chainStyle", layout.verticalChainStyle, 0.0f);
                writeVariable("app:barrierDirection", layout.mBarrierDirection, -1.0f);
                writeVariable("app:barrierMargin", layout.mBarrierMargin, 0.0f);
                writeDimension("app:layout_marginLeft", layout.leftMargin, 0);
                writeDimension("app:layout_goneMarginLeft", layout.goneLeftMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginRight", layout.rightMargin, 0);
                writeDimension("app:layout_goneMarginRight", layout.goneRightMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginStart", layout.startMargin, 0);
                writeDimension("app:layout_goneMarginStart", layout.goneStartMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginEnd", layout.endMargin, 0);
                writeDimension("app:layout_goneMarginEnd", layout.goneEndMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginTop", layout.topMargin, 0);
                writeDimension("app:layout_goneMarginTop", layout.goneTopMargin, Integer.MIN_VALUE);
                writeDimension("app:layout_marginBottom", layout.bottomMargin, 0);
                writeDimension("app:layout_goneMarginBottom", layout.goneBottomMargin, Integer.MIN_VALUE);
                writeDimension("app:goneBaselineMargin", layout.goneBaselineMargin, Integer.MIN_VALUE);
                writeDimension("app:baselineMargin", layout.baselineMargin, 0);
                writeBoolen("app:layout_constrainedWidth", layout.constrainedWidth, false);
                writeBoolen("app:layout_constrainedHeight", layout.constrainedHeight, false);
                writeBoolen("app:barrierAllowsGoneWidgets", layout.mBarrierAllowsGoneWidgets, true);
                writeVariable("app:layout_wrapBehaviorInParent", layout.mWrapBehavior, 0.0f);
                writeXmlConstraint("app:baselineToBaseline", layout.baselineToBaseline);
                writeXmlConstraint("app:baselineToBottom", layout.baselineToBottom);
                writeXmlConstraint("app:baselineToTop", layout.baselineToTop);
                writeXmlConstraint("app:layout_constraintBottom_toBottomOf", layout.bottomToBottom);
                writeXmlConstraint("app:layout_constraintBottom_toTopOf", layout.bottomToTop);
                writeXmlConstraint("app:layout_constraintEnd_toEndOf", layout.endToEnd);
                writeXmlConstraint("app:layout_constraintEnd_toStartOf", layout.endToStart);
                writeXmlConstraint("app:layout_constraintLeft_toLeftOf", layout.leftToLeft);
                writeXmlConstraint("app:layout_constraintLeft_toRightOf", layout.leftToRight);
                writeXmlConstraint("app:layout_constraintRight_toLeftOf", layout.rightToLeft);
                writeXmlConstraint("app:layout_constraintRight_toRightOf", layout.rightToRight);
                writeXmlConstraint("app:layout_constraintStart_toEndOf", layout.startToEnd);
                writeXmlConstraint("app:layout_constraintStart_toStartOf", layout.startToStart);
                writeXmlConstraint("app:layout_constraintTop_toBottomOf", layout.topToBottom);
                writeXmlConstraint("app:layout_constraintTop_toTopOf", layout.topToTop);
                String[] strArr = {"spread", "wrap", "percent"};
                writeEnum("app:layout_constraintHeight_default", layout.heightDefault, strArr, 0);
                writeVariable("app:layout_constraintHeight_percent", layout.heightPercent, 1.0f);
                writeDimension("app:layout_constraintHeight_min", layout.heightMin, 0);
                writeDimension("app:layout_constraintHeight_max", layout.heightMax, 0);
                writeBoolen("android:layout_constrainedHeight", layout.constrainedHeight, false);
                writeEnum("app:layout_constraintWidth_default", layout.widthDefault, strArr, 0);
                writeVariable("app:layout_constraintWidth_percent", layout.widthPercent, 1.0f);
                writeDimension("app:layout_constraintWidth_min", layout.widthMin, 0);
                writeDimension("app:layout_constraintWidth_max", layout.widthMax, 0);
                writeBoolen("android:layout_constrainedWidth", layout.constrainedWidth, false);
                writeVariable("app:layout_constraintVertical_weight", layout.verticalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_weight", layout.horizontalWeight, -1.0f);
                writeVariable("app:layout_constraintHorizontal_chainStyle", layout.horizontalChainStyle);
                writeVariable("app:layout_constraintVertical_chainStyle", layout.verticalChainStyle);
                writeEnum("app:barrierDirection", layout.mBarrierDirection, new String[]{TtmlNode.LEFT, TtmlNode.RIGHT, "top", "bottom", TtmlNode.START, TtmlNode.END}, -1);
                writeVariable("app:layout_constraintTag", layout.mConstraintTag, (String) null);
                int[] iArr = layout.mReferenceIds;
                if (iArr != null) {
                    writeVariable("'ReferenceIds'", iArr);
                }
                this.mWriter.write(" />\n");
            }
            this.mWriter.write("</ConstraintSet>\n");
        }

        void writeVariable(String str, int[] iArr) throws IOException {
            if (iArr == null) {
                return;
            }
            this.mWriter.write(SPACE.concat(String.valueOf(str)));
            this.mWriter.write(":");
            int i2 = 0;
            while (true) {
                int length = iArr.length;
                Writer writer = this.mWriter;
                if (i2 >= length) {
                    writer.write("],\n");
                    return;
                } else {
                    writer.write((i2 == 0 ? "[" : ", ").concat(String.valueOf(getName(iArr[i2]))));
                    i2++;
                }
            }
        }

        void writeXmlConstraint(String str, int i2) throws IOException {
            if (i2 == -1) {
                return;
            }
            this.mWriter.write(SPACE.concat(String.valueOf(str)));
            this.mWriter.write("=\"" + getName(i2) + "\"");
        }

        void writeVariable(String str, int i2) throws IOException {
            if (i2 == 0 || i2 == -1) {
                return;
            }
            this.mWriter.write(SPACE + str + "=\"" + i2 + "\"\n");
        }

        void writeVariable(String str, String str2) throws IOException {
            if (str2 == null) {
                return;
            }
            this.mWriter.write(str);
            this.mWriter.write(":");
            this.mWriter.write(", ".concat(str2));
            this.mWriter.write("\n");
        }

        void writeVariable(String str, String str2, String str3) throws IOException {
            if (str2 == null || str2.equals(str3)) {
                return;
            }
            this.mWriter.write(SPACE.concat(String.valueOf(str)));
            this.mWriter.write("=\"" + str2 + "\"");
        }

        void writeVariable(String str, float f2, float f3) throws IOException {
            if (f2 == f3) {
                return;
            }
            this.mWriter.write(SPACE.concat(String.valueOf(str)));
            this.mWriter.write("=\"" + f2 + "\"");
        }
    }

    public void createHorizontalChain(int i2, int i3, int i4, int i5, int[] iArr, float[] fArr, int i6) {
        createHorizontalChain(i2, i3, i4, i5, iArr, fArr, i6, 1, 2);
    }

    public void clear(int i2) {
        this.mConstraints.remove(Integer.valueOf(i2));
    }

    public void clone(Context context, int i2) {
        clone((ConstraintLayout) LayoutInflater.from(context).inflate(i2, (ViewGroup) null));
    }

    public void clone(ConstraintSet constraintSet) {
        this.mConstraints.clear();
        for (Integer num : constraintSet.mConstraints.keySet()) {
            Constraint constraint = constraintSet.mConstraints.get(num);
            if (constraint != null) {
                this.mConstraints.put(num, constraint.m11652clone());
            }
        }
    }

    public void clone(Constraints constraints) {
        int childCount = constraints.getChildCount();
        this.mConstraints.clear();
        for (int i2 = 0; i2 < childCount; i2++) {
            View childAt = constraints.getChildAt(i2);
            Constraints.LayoutParams layoutParams = (Constraints.LayoutParams) childAt.getLayoutParams();
            int id = childAt.getId();
            if (this.mForceId && id == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            HashMap<Integer, Constraint> map = this.mConstraints;
            Integer numValueOf = Integer.valueOf(id);
            if (!map.containsKey(numValueOf)) {
                this.mConstraints.put(numValueOf, new Constraint());
            }
            Constraint constraint = this.mConstraints.get(numValueOf);
            if (constraint != null) {
                if (childAt instanceof ConstraintHelper) {
                    constraint.fillFromConstraints((ConstraintHelper) childAt, id, layoutParams);
                }
                constraint.fillFromConstraints(id, layoutParams);
            }
        }
    }

    public void readFallback(ConstraintSet constraintSet) {
        for (Integer num : constraintSet.mConstraints.keySet()) {
            num.intValue();
            Constraint constraint = constraintSet.mConstraints.get(num);
            if (!this.mConstraints.containsKey(num)) {
                this.mConstraints.put(num, new Constraint());
            }
            Constraint constraint2 = this.mConstraints.get(num);
            if (constraint2 != null) {
                Layout layout = constraint2.layout;
                if (!layout.mApply) {
                    layout.copyFrom(constraint.layout);
                }
                PropertySet propertySet = constraint2.propertySet;
                if (!propertySet.mApply) {
                    propertySet.copyFrom(constraint.propertySet);
                }
                Transform transform = constraint2.transform;
                if (!transform.mApply) {
                    transform.copyFrom(constraint.transform);
                }
                Motion motion = constraint2.motion;
                if (!motion.mApply) {
                    motion.copyFrom(constraint.motion);
                }
                for (String str : constraint.mCustomConstraints.keySet()) {
                    if (!constraint2.mCustomConstraints.containsKey(str)) {
                        constraint2.mCustomConstraints.put(str, constraint.mCustomConstraints.get(str));
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setDeltaValue(Constraint constraint, int i2, float f2) {
        if (i2 == 19) {
            constraint.layout.guidePercent = f2;
            return;
        }
        if (i2 == 20) {
            constraint.layout.horizontalBias = f2;
            return;
        }
        if (i2 == 37) {
            constraint.layout.verticalBias = f2;
            return;
        }
        if (i2 == 60) {
            constraint.transform.rotation = f2;
            return;
        }
        if (i2 == 63) {
            constraint.layout.circleAngle = f2;
            return;
        }
        if (i2 == 79) {
            constraint.motion.mMotionStagger = f2;
            return;
        }
        if (i2 == 85) {
            constraint.motion.mQuantizeMotionPhase = f2;
            return;
        }
        if (i2 != 87) {
            if (i2 == 39) {
                constraint.layout.horizontalWeight = f2;
                return;
            }
            if (i2 != 40) {
                switch (i2) {
                    case 43:
                        constraint.propertySet.alpha = f2;
                        break;
                    case 44:
                        Transform transform = constraint.transform;
                        transform.elevation = f2;
                        transform.applyElevation = true;
                        break;
                    case 45:
                        constraint.transform.rotationX = f2;
                        break;
                    case 46:
                        constraint.transform.rotationY = f2;
                        break;
                    case 47:
                        constraint.transform.scaleX = f2;
                        break;
                    case 48:
                        constraint.transform.scaleY = f2;
                        break;
                    case 49:
                        constraint.transform.transformPivotX = f2;
                        break;
                    case 50:
                        constraint.transform.transformPivotY = f2;
                        break;
                    case 51:
                        constraint.transform.translationX = f2;
                        break;
                    case 52:
                        constraint.transform.translationY = f2;
                        break;
                    case 53:
                        constraint.transform.translationZ = f2;
                        break;
                    default:
                        switch (i2) {
                            case 67:
                                constraint.motion.mPathRotate = f2;
                                break;
                            case 68:
                                constraint.propertySet.mProgress = f2;
                                break;
                            case 69:
                                constraint.layout.widthPercent = f2;
                                break;
                            case 70:
                                constraint.layout.heightPercent = f2;
                                break;
                            default:
                                Log.w(TAG, "Unknown attribute 0x");
                                break;
                        }
                }
                return;
            }
            constraint.layout.verticalWeight = f2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setDeltaValue(Constraint constraint, int i2, String str) {
        if (i2 == 5) {
            constraint.layout.dimensionRatio = str;
            return;
        }
        if (i2 == 65) {
            constraint.motion.mTransitionEasing = str;
            return;
        }
        if (i2 == 74) {
            Layout layout = constraint.layout;
            layout.mReferenceIdString = str;
            layout.mReferenceIds = null;
        } else if (i2 == 77) {
            constraint.layout.mConstraintTag = str;
        } else if (i2 != 87) {
            if (i2 != 90) {
                Log.w(TAG, "Unknown attribute 0x");
            } else {
                constraint.motion.mQuantizeInterpolatorString = str;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void setDeltaValue(Constraint constraint, int i2, boolean z) {
        if (i2 == 44) {
            constraint.transform.applyElevation = z;
            return;
        }
        if (i2 == 75) {
            constraint.layout.mBarrierAllowsGoneWidgets = z;
            return;
        }
        if (i2 != 87) {
            if (i2 == 80) {
                constraint.layout.constrainedWidth = z;
            } else if (i2 != 81) {
                Log.w(TAG, "Unknown attribute 0x");
            } else {
                constraint.layout.constrainedHeight = z;
            }
        }
    }

    public void load(Context context, int i2) {
        XmlResourceParser xml = context.getResources().getXml(i2);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 2) {
                    String name = xml.getName();
                    Constraint constraintFillFromAttributeList = fillFromAttributeList(context, Xml.asAttributeSet(xml), false);
                    if (name.equalsIgnoreCase("Guideline")) {
                        constraintFillFromAttributeList.layout.mIsGuideline = true;
                    }
                    this.mConstraints.put(Integer.valueOf(constraintFillFromAttributeList.mViewId), constraintFillFromAttributeList);
                }
            }
        } catch (IOException e2) {
            Log.e(TAG, "Error parsing resource: " + i2, e2);
        } catch (XmlPullParserException e3) {
            Log.e(TAG, "Error parsing resource: " + i2, e3);
        }
    }

    public void connect(int i2, int i3, int i4, int i5) {
        HashMap<Integer, Constraint> map = this.mConstraints;
        Integer numValueOf = Integer.valueOf(i2);
        if (!map.containsKey(numValueOf)) {
            this.mConstraints.put(numValueOf, new Constraint());
        }
        Constraint constraint = this.mConstraints.get(numValueOf);
        if (constraint == null) {
            return;
        }
        switch (i3) {
            case 1:
                if (i5 == 1) {
                    Layout layout = constraint.layout;
                    layout.leftToLeft = i4;
                    layout.leftToRight = -1;
                    return;
                } else if (i5 == 2) {
                    Layout layout2 = constraint.layout;
                    layout2.leftToRight = i4;
                    layout2.leftToLeft = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("left to " + sideToString(i5) + " undefined");
                }
            case 2:
                if (i5 == 1) {
                    Layout layout3 = constraint.layout;
                    layout3.rightToLeft = i4;
                    layout3.rightToRight = -1;
                    return;
                } else if (i5 == 2) {
                    Layout layout4 = constraint.layout;
                    layout4.rightToRight = i4;
                    layout4.rightToLeft = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + sideToString(i5) + " undefined");
                }
            case 3:
                if (i5 == 3) {
                    Layout layout5 = constraint.layout;
                    layout5.topToTop = i4;
                    layout5.topToBottom = -1;
                    layout5.baselineToBaseline = -1;
                    layout5.baselineToTop = -1;
                    layout5.baselineToBottom = -1;
                    return;
                }
                if (i5 == 4) {
                    Layout layout6 = constraint.layout;
                    layout6.topToBottom = i4;
                    layout6.topToTop = -1;
                    layout6.baselineToBaseline = -1;
                    layout6.baselineToTop = -1;
                    layout6.baselineToBottom = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + sideToString(i5) + " undefined");
            case 4:
                if (i5 == 4) {
                    Layout layout7 = constraint.layout;
                    layout7.bottomToBottom = i4;
                    layout7.bottomToTop = -1;
                    layout7.baselineToBaseline = -1;
                    layout7.baselineToTop = -1;
                    layout7.baselineToBottom = -1;
                    return;
                }
                if (i5 == 3) {
                    Layout layout8 = constraint.layout;
                    layout8.bottomToTop = i4;
                    layout8.bottomToBottom = -1;
                    layout8.baselineToBaseline = -1;
                    layout8.baselineToTop = -1;
                    layout8.baselineToBottom = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + sideToString(i5) + " undefined");
            case 5:
                if (i5 == 5) {
                    Layout layout9 = constraint.layout;
                    layout9.baselineToBaseline = i4;
                    layout9.bottomToBottom = -1;
                    layout9.bottomToTop = -1;
                    layout9.topToTop = -1;
                    layout9.topToBottom = -1;
                    return;
                }
                if (i5 == 3) {
                    Layout layout10 = constraint.layout;
                    layout10.baselineToTop = i4;
                    layout10.bottomToBottom = -1;
                    layout10.bottomToTop = -1;
                    layout10.topToTop = -1;
                    layout10.topToBottom = -1;
                    return;
                }
                if (i5 == 4) {
                    Layout layout11 = constraint.layout;
                    layout11.baselineToBottom = i4;
                    layout11.bottomToBottom = -1;
                    layout11.bottomToTop = -1;
                    layout11.topToTop = -1;
                    layout11.topToBottom = -1;
                    return;
                }
                throw new IllegalArgumentException("right to " + sideToString(i5) + " undefined");
            case 6:
                if (i5 == 6) {
                    Layout layout12 = constraint.layout;
                    layout12.startToStart = i4;
                    layout12.startToEnd = -1;
                    return;
                } else if (i5 == 7) {
                    Layout layout13 = constraint.layout;
                    layout13.startToEnd = i4;
                    layout13.startToStart = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + sideToString(i5) + " undefined");
                }
            case 7:
                if (i5 == 7) {
                    Layout layout14 = constraint.layout;
                    layout14.endToEnd = i4;
                    layout14.endToStart = -1;
                    return;
                } else if (i5 == 6) {
                    Layout layout15 = constraint.layout;
                    layout15.endToStart = i4;
                    layout15.endToEnd = -1;
                    return;
                } else {
                    throw new IllegalArgumentException("right to " + sideToString(i5) + " undefined");
                }
            default:
                throw new IllegalArgumentException(sideToString(i3) + " to " + sideToString(i5) + " unknown");
        }
    }
}
