package androidx.constraintlayout.core.motion.utils;

import com.waze.strings.DisplayStrings;

/* compiled from: WazeSource */
/* loaded from: classes3.dex */
public interface TypedValues {
    public static final int BOOLEAN_MASK = 1;
    public static final int FLOAT_MASK = 4;
    public static final int INT_MASK = 2;
    public static final int STRING_MASK = 8;
    public static final String S_CUSTOM = "CUSTOM";
    public static final int TYPE_FRAME_POSITION = 100;
    public static final int TYPE_TARGET = 101;

    /* compiled from: WazeSource */
    public interface AttributesType {
        public static final String NAME = "KeyAttributes";
        public static final String S_ALPHA = "alpha";
        public static final String S_CURVE_FIT = "curveFit";
        public static final String S_CUSTOM = "CUSTOM";
        public static final String S_EASING = "easing";
        public static final String S_ELEVATION = "elevation";
        public static final String S_PATH_ROTATE = "pathRotate";
        public static final String S_PIVOT_X = "pivotX";
        public static final String S_PIVOT_Y = "pivotY";
        public static final String S_PROGRESS = "progress";
        public static final String S_ROTATION_X = "rotationX";
        public static final String S_ROTATION_Y = "rotationY";
        public static final String S_ROTATION_Z = "rotationZ";
        public static final String S_SCALE_X = "scaleX";
        public static final String S_SCALE_Y = "scaleY";
        public static final String S_TRANSLATION_X = "translationX";
        public static final String S_TRANSLATION_Y = "translationY";
        public static final String S_TRANSLATION_Z = "translationZ";
        public static final String S_VISIBILITY = "visibility";
        public static final int TYPE_ALPHA = 303;
        public static final int TYPE_CURVE_FIT = 301;
        public static final int TYPE_EASING = 317;
        public static final int TYPE_ELEVATION = 307;
        public static final int TYPE_PATH_ROTATE = 316;
        public static final int TYPE_PIVOT_TARGET = 318;
        public static final int TYPE_PIVOT_X = 313;
        public static final int TYPE_PIVOT_Y = 314;
        public static final int TYPE_PROGRESS = 315;
        public static final int TYPE_ROTATION_X = 308;
        public static final int TYPE_ROTATION_Y = 309;
        public static final int TYPE_ROTATION_Z = 310;
        public static final int TYPE_SCALE_X = 311;
        public static final int TYPE_SCALE_Y = 312;
        public static final int TYPE_TRANSLATION_X = 304;
        public static final int TYPE_TRANSLATION_Y = 305;
        public static final int TYPE_TRANSLATION_Z = 306;
        public static final int TYPE_VISIBILITY = 302;
        public static final String S_FRAME = "frame";
        public static final String S_TARGET = "target";
        public static final String S_PIVOT_TARGET = "pivotTarget";
        public static final String[] KEY_WORDS = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "CUSTOM", S_FRAME, S_TARGET, S_PIVOT_TARGET};

        /* compiled from: WazeSource */
        /* renamed from: androidx.constraintlayout.core.motion.utils.TypedValues$AttributesType$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            static {
                String str = AttributesType.NAME;
            }

            public static int getId(String str) {
                switch (str.hashCode()) {
                    case -1310311125:
                        return str.equals("easing") ? 317 : -1;
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
                    case -1001078227:
                        return str.equals("progress") ? 315 : -1;
                    case -987906986:
                        return str.equals("pivotX") ? 313 : -1;
                    case -987906985:
                        return str.equals("pivotY") ? 314 : -1;
                    case -908189618:
                        return str.equals("scaleX") ? 311 : -1;
                    case -908189617:
                        return str.equals("scaleY") ? 312 : -1;
                    case -880905839:
                        return str.equals(AttributesType.S_TARGET) ? 101 : -1;
                    case -4379043:
                        return str.equals("elevation") ? 307 : -1;
                    case 92909918:
                        return str.equals("alpha") ? 303 : -1;
                    case 97692013:
                        return str.equals(AttributesType.S_FRAME) ? 100 : -1;
                    case 579057826:
                        return str.equals("curveFit") ? 301 : -1;
                    case 803192288:
                        return str.equals("pathRotate") ? 316 : -1;
                    case 1167159411:
                        return str.equals(AttributesType.S_PIVOT_TARGET) ? 318 : -1;
                    case 1941332754:
                        return str.equals("visibility") ? 302 : -1;
                    default:
                        return -1;
                }
            }

            public static int getType(int i2) {
                if (i2 == 100) {
                    return 2;
                }
                if (i2 == 101) {
                    return 8;
                }
                switch (i2) {
                    case 301:
                    case 302:
                        return 2;
                    case 303:
                    case 304:
                    case 305:
                    case 306:
                    case 307:
                    case 308:
                    case 309:
                    case 310:
                    case 311:
                    case 312:
                    case 313:
                    case 314:
                    case 315:
                    case 316:
                        return 4;
                    case 317:
                    case 318:
                        return 8;
                    default:
                        return -1;
                }
            }
        }
    }

    /* compiled from: WazeSource */
    public interface Custom {
        public static final String NAME = "Custom";
        public static final String S_COLOR = "color";
        public static final String S_INT = "integer";
        public static final int TYPE_BOOLEAN = 904;
        public static final int TYPE_COLOR = 902;
        public static final int TYPE_DIMENSION = 905;
        public static final int TYPE_FLOAT = 901;
        public static final int TYPE_INT = 900;
        public static final int TYPE_REFERENCE = 906;
        public static final int TYPE_STRING = 903;
        public static final String S_FLOAT = "float";
        public static final String S_STRING = "string";
        public static final String S_BOOLEAN = "boolean";
        public static final String S_DIMENSION = "dimension";
        public static final String S_REFERENCE = "reference";
        public static final String[] KEY_WORDS = {S_FLOAT, "color", S_STRING, S_BOOLEAN, S_DIMENSION, S_REFERENCE};

        /* compiled from: WazeSource */
        /* renamed from: androidx.constraintlayout.core.motion.utils.TypedValues$Custom$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            static {
                String str = Custom.NAME;
            }

            public static int getId(String str) {
                switch (str.hashCode()) {
                    case -1095013018:
                        return str.equals(Custom.S_DIMENSION) ? 905 : -1;
                    case -925155509:
                        return str.equals(Custom.S_REFERENCE) ? 906 : -1;
                    case -891985903:
                        return str.equals(Custom.S_STRING) ? 903 : -1;
                    case 64711720:
                        return str.equals(Custom.S_BOOLEAN) ? 904 : -1;
                    case 94842723:
                        return str.equals("color") ? 902 : -1;
                    case 97526364:
                        return str.equals(Custom.S_FLOAT) ? 901 : -1;
                    case 1958052158:
                        return str.equals(Custom.S_INT) ? 900 : -1;
                    default:
                        return -1;
                }
            }
        }
    }

    /* compiled from: WazeSource */
    public interface CycleType {
        public static final String NAME = "KeyCycle";
        public static final String S_ALPHA = "alpha";
        public static final String S_CURVE_FIT = "curveFit";
        public static final String S_EASING = "easing";
        public static final String S_ELEVATION = "elevation";
        public static final String S_PATH_ROTATE = "pathRotate";
        public static final String S_PIVOT_X = "pivotX";
        public static final String S_PIVOT_Y = "pivotY";
        public static final String S_PROGRESS = "progress";
        public static final String S_ROTATION_X = "rotationX";
        public static final String S_ROTATION_Y = "rotationY";
        public static final String S_ROTATION_Z = "rotationZ";
        public static final String S_SCALE_X = "scaleX";
        public static final String S_SCALE_Y = "scaleY";
        public static final String S_TRANSLATION_X = "translationX";
        public static final String S_TRANSLATION_Y = "translationY";
        public static final String S_TRANSLATION_Z = "translationZ";
        public static final String S_VISIBILITY = "visibility";
        public static final String S_WAVE_SHAPE = "waveShape";
        public static final int TYPE_ALPHA = 403;
        public static final int TYPE_CURVE_FIT = 401;
        public static final int TYPE_CUSTOM_WAVE_SHAPE = 422;
        public static final int TYPE_EASING = 420;
        public static final int TYPE_ELEVATION = 307;
        public static final int TYPE_PATH_ROTATE = 416;
        public static final int TYPE_PIVOT_X = 313;
        public static final int TYPE_PIVOT_Y = 314;
        public static final int TYPE_PROGRESS = 315;
        public static final int TYPE_ROTATION_X = 308;
        public static final int TYPE_ROTATION_Y = 309;
        public static final int TYPE_ROTATION_Z = 310;
        public static final int TYPE_SCALE_X = 311;
        public static final int TYPE_SCALE_Y = 312;
        public static final int TYPE_TRANSLATION_X = 304;
        public static final int TYPE_TRANSLATION_Y = 305;
        public static final int TYPE_TRANSLATION_Z = 306;
        public static final int TYPE_VISIBILITY = 402;
        public static final int TYPE_WAVE_OFFSET = 424;
        public static final int TYPE_WAVE_PERIOD = 423;
        public static final int TYPE_WAVE_PHASE = 425;
        public static final int TYPE_WAVE_SHAPE = 421;
        public static final String S_CUSTOM_WAVE_SHAPE = "customWave";
        public static final String S_WAVE_PERIOD = "period";
        public static final String S_WAVE_OFFSET = "offset";
        public static final String S_WAVE_PHASE = "phase";
        public static final String[] KEY_WORDS = {"curveFit", "visibility", "alpha", "translationX", "translationY", "translationZ", "elevation", "rotationX", "rotationY", "rotationZ", "scaleX", "scaleY", "pivotX", "pivotY", "progress", "pathRotate", "easing", "waveShape", S_CUSTOM_WAVE_SHAPE, S_WAVE_PERIOD, S_WAVE_OFFSET, S_WAVE_PHASE};

        /* compiled from: WazeSource */
        /* renamed from: androidx.constraintlayout.core.motion.utils.TypedValues$CycleType$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            static {
                String str = CycleType.NAME;
            }

            public static int getId(String str) {
                switch (str.hashCode()) {
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
                    case -1001078227:
                        return str.equals("progress") ? 315 : -1;
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
                    case 579057826:
                        return str.equals("curveFit") ? 401 : -1;
                    case 803192288:
                        return str.equals("pathRotate") ? 416 : -1;
                    case 1941332754:
                        return str.equals("visibility") ? 402 : -1;
                    default:
                        return -1;
                }
            }

            public static int getType(int i2) {
                if (i2 == 100) {
                    return 2;
                }
                if (i2 == 101) {
                    return 8;
                }
                if (i2 == 416) {
                    return 4;
                }
                if (i2 == 420 || i2 == 421) {
                    return 8;
                }
                switch (i2) {
                    case 304:
                    case 305:
                    case 306:
                    case 307:
                    case 308:
                    case 309:
                    case 310:
                    case 311:
                    case 312:
                    case 313:
                    case 314:
                    case 315:
                        return 4;
                    default:
                        switch (i2) {
                            case 401:
                            case 402:
                                return 2;
                            case 403:
                                return 4;
                            default:
                                switch (i2) {
                                    case 423:
                                    case 424:
                                    case 425:
                                        return 4;
                                    default:
                                        return -1;
                                }
                        }
                }
            }
        }
    }

    /* compiled from: WazeSource */
    public interface MotionScene {
        public static final String NAME = "MotionScene";
        public static final int TYPE_DEFAULT_DURATION = 600;
        public static final int TYPE_LAYOUT_DURING_TRANSITION = 601;
        public static final String S_DEFAULT_DURATION = "defaultDuration";
        public static final String S_LAYOUT_DURING_TRANSITION = "layoutDuringTransition";
        public static final String[] KEY_WORDS = {S_DEFAULT_DURATION, S_LAYOUT_DURING_TRANSITION};

        /* compiled from: WazeSource */
        /* renamed from: androidx.constraintlayout.core.motion.utils.TypedValues$MotionScene$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            static {
                String str = MotionScene.NAME;
            }

            public static int getId(String str) {
                int iHashCode = str.hashCode();
                return iHashCode != 6076149 ? (iHashCode == 1028758976 && str.equals(MotionScene.S_LAYOUT_DURING_TRANSITION)) ? 601 : -1 : str.equals(MotionScene.S_DEFAULT_DURATION) ? 600 : -1;
            }

            public static int getType(int i2) {
                if (i2 != 600) {
                    return i2 != 601 ? -1 : 1;
                }
                return 2;
            }
        }
    }

    /* compiled from: WazeSource */
    public interface MotionType {
        public static final String NAME = "Motion";
        public static final int TYPE_ANIMATE_CIRCLEANGLE_TO = 606;
        public static final int TYPE_ANIMATE_RELATIVE_TO = 605;
        public static final int TYPE_DRAW_PATH = 608;
        public static final int TYPE_EASING = 603;
        public static final int TYPE_PATHMOTION_ARC = 607;
        public static final int TYPE_PATH_ROTATE = 601;
        public static final int TYPE_POLAR_RELATIVETO = 609;
        public static final int TYPE_QUANTIZE_INTERPOLATOR = 604;
        public static final int TYPE_QUANTIZE_INTERPOLATOR_ID = 612;
        public static final int TYPE_QUANTIZE_INTERPOLATOR_TYPE = 611;
        public static final int TYPE_QUANTIZE_MOTIONSTEPS = 610;
        public static final int TYPE_QUANTIZE_MOTION_PHASE = 602;
        public static final int TYPE_STAGGER = 600;
        public static final String S_STAGGER = "Stagger";
        public static final String S_PATH_ROTATE = "PathRotate";
        public static final String S_QUANTIZE_MOTION_PHASE = "QuantizeMotionPhase";
        public static final String S_EASING = "TransitionEasing";
        public static final String S_QUANTIZE_INTERPOLATOR = "QuantizeInterpolator";
        public static final String S_ANIMATE_RELATIVE_TO = "AnimateRelativeTo";
        public static final String S_ANIMATE_CIRCLEANGLE_TO = "AnimateCircleAngleTo";
        public static final String S_PATHMOTION_ARC = "PathMotionArc";
        public static final String S_DRAW_PATH = "DrawPath";
        public static final String S_POLAR_RELATIVETO = "PolarRelativeTo";
        public static final String S_QUANTIZE_MOTIONSTEPS = "QuantizeMotionSteps";
        public static final String S_QUANTIZE_INTERPOLATOR_TYPE = "QuantizeInterpolatorType";
        public static final String S_QUANTIZE_INTERPOLATOR_ID = "QuantizeInterpolatorID";
        public static final String[] KEY_WORDS = {S_STAGGER, S_PATH_ROTATE, S_QUANTIZE_MOTION_PHASE, S_EASING, S_QUANTIZE_INTERPOLATOR, S_ANIMATE_RELATIVE_TO, S_ANIMATE_CIRCLEANGLE_TO, S_PATHMOTION_ARC, S_DRAW_PATH, S_POLAR_RELATIVETO, S_QUANTIZE_MOTIONSTEPS, S_QUANTIZE_INTERPOLATOR_TYPE, S_QUANTIZE_INTERPOLATOR_ID};

        /* compiled from: WazeSource */
        /* renamed from: androidx.constraintlayout.core.motion.utils.TypedValues$MotionType$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            static {
                String str = MotionType.NAME;
            }

            public static int getId(String str) {
                switch (str.hashCode()) {
                    case -2033446275:
                        return str.equals(MotionType.S_ANIMATE_CIRCLEANGLE_TO) ? 606 : -1;
                    case -1532277420:
                        return str.equals(MotionType.S_QUANTIZE_MOTION_PHASE) ? 602 : -1;
                    case -1529145600:
                        return str.equals(MotionType.S_QUANTIZE_MOTIONSTEPS) ? 610 : -1;
                    case -1498310144:
                        return str.equals(MotionType.S_PATH_ROTATE) ? 601 : -1;
                    case -1030753096:
                        return str.equals(MotionType.S_QUANTIZE_INTERPOLATOR) ? 604 : -1;
                    case -762370135:
                        return str.equals(MotionType.S_DRAW_PATH) ? 608 : -1;
                    case -232872051:
                        return str.equals(MotionType.S_STAGGER) ? 600 : -1;
                    case 1138491429:
                        return str.equals(MotionType.S_POLAR_RELATIVETO) ? 609 : -1;
                    case 1539234834:
                        return str.equals(MotionType.S_QUANTIZE_INTERPOLATOR_TYPE) ? 611 : -1;
                    case 1583722451:
                        return str.equals(MotionType.S_QUANTIZE_INTERPOLATOR_ID) ? 612 : -1;
                    case 1639368448:
                        return str.equals(MotionType.S_EASING) ? 603 : -1;
                    case 1900899336:
                        return str.equals(MotionType.S_ANIMATE_RELATIVE_TO) ? 605 : -1;
                    case 2109694967:
                        return str.equals(MotionType.S_PATHMOTION_ARC) ? 607 : -1;
                    default:
                        return -1;
                }
            }
        }
    }

    /* compiled from: WazeSource */
    public interface OnSwipe {
        public static final String AUTOCOMPLETE_MODE = "autocompletemode";
        public static final String DRAG_DIRECTION = "dragdirection";
        public static final String DRAG_SCALE = "dragscale";
        public static final String DRAG_THRESHOLD = "dragthreshold";
        public static final String LIMIT_BOUNDS_TO = "limitboundsto";
        public static final String MAX_ACCELERATION = "maxacceleration";
        public static final String MAX_VELOCITY = "maxvelocity";
        public static final String MOVE_WHEN_SCROLLAT_TOP = "movewhenscrollattop";
        public static final String NESTED_SCROLL_FLAGS = "nestedscrollflags";
        public static final String ON_TOUCH_UP = "ontouchup";
        public static final String ROTATION_CENTER_ID = "rotationcenterid";
        public static final String SPRINGS_TOP_THRESHOLD = "springstopthreshold";
        public static final String SPRING_BOUNDARY = "springboundary";
        public static final String SPRING_DAMPING = "springdamping";
        public static final String SPRING_MASS = "springmass";
        public static final String SPRING_STIFFNESS = "springstiffness";
        public static final String TOUCH_ANCHOR_ID = "touchanchorid";
        public static final String TOUCH_ANCHOR_SIDE = "touchanchorside";
        public static final String TOUCH_REGION_ID = "touchregionid";
        public static final String[] ON_TOUCH_UP_ENUM = {"autoComplete", "autoCompleteToStart", "autoCompleteToEnd", "stop", "decelerate", "decelerateAndComplete", "neverCompleteToStart", "neverCompleteToEnd"};
        public static final String[] SPRING_BOUNDARY_ENUM = {"overshoot", "bounceStart", "bounceEnd", "bounceBoth"};
        public static final String[] AUTOCOMPLETE_MODE_ENUM = {"continuousVelocity", "spring"};
        public static final String[] NESTED_SCROLL_FLAGS_ENUM = {"none", "disablePostScroll", "disableScroll", "supportScrollUp"};
    }

    /* compiled from: WazeSource */
    public interface PositionType {
        public static final String[] KEY_WORDS = {"transitionEasing", "drawPath", "percentWidth", "percentHeight", "sizePercent", "percentX", "percentY"};
        public static final String NAME = "KeyPosition";
        public static final String S_DRAWPATH = "drawPath";
        public static final String S_PERCENT_HEIGHT = "percentHeight";
        public static final String S_PERCENT_WIDTH = "percentWidth";
        public static final String S_PERCENT_X = "percentX";
        public static final String S_PERCENT_Y = "percentY";
        public static final String S_SIZE_PERCENT = "sizePercent";
        public static final String S_TRANSITION_EASING = "transitionEasing";
        public static final int TYPE_CURVE_FIT = 508;
        public static final int TYPE_DRAWPATH = 502;
        public static final int TYPE_PATH_MOTION_ARC = 509;
        public static final int TYPE_PERCENT_HEIGHT = 504;
        public static final int TYPE_PERCENT_WIDTH = 503;
        public static final int TYPE_PERCENT_X = 506;
        public static final int TYPE_PERCENT_Y = 507;
        public static final int TYPE_POSITION_TYPE = 510;
        public static final int TYPE_SIZE_PERCENT = 505;
        public static final int TYPE_TRANSITION_EASING = 501;

        /* compiled from: WazeSource */
        /* renamed from: androidx.constraintlayout.core.motion.utils.TypedValues$PositionType$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            static {
                String str = PositionType.NAME;
            }

            public static int getId(String str) {
                switch (str.hashCode()) {
                    case -1812823328:
                        return str.equals("transitionEasing") ? 501 : -1;
                    case -1127236479:
                        return str.equals("percentWidth") ? 503 : -1;
                    case -1017587252:
                        return str.equals("percentHeight") ? 504 : -1;
                    case -827014263:
                        return str.equals("drawPath") ? 502 : -1;
                    case -200259324:
                        return str.equals("sizePercent") ? 505 : -1;
                    case 428090547:
                        return str.equals("percentX") ? 506 : -1;
                    case 428090548:
                        return str.equals("percentY") ? 507 : -1;
                    default:
                        return -1;
                }
            }

            public static int getType(int i2) {
                if (i2 == 100) {
                    return 2;
                }
                if (i2 == 101) {
                    return 8;
                }
                switch (i2) {
                    case 501:
                    case 502:
                        return 8;
                    case 503:
                    case 504:
                    case 505:
                    case 506:
                    case 507:
                        return 4;
                    case 508:
                        return 2;
                    default:
                        return -1;
                }
            }
        }
    }

    /* compiled from: WazeSource */
    public interface TransitionType {
        public static final String NAME = "Transitions";
        public static final int TYPE_AUTO_TRANSITION = 704;
        public static final int TYPE_DURATION = 700;
        public static final int TYPE_FROM = 701;
        public static final int TYPE_INTERPOLATOR = 705;
        public static final int TYPE_PATH_MOTION_ARC = 509;
        public static final int TYPE_STAGGERED = 706;
        public static final int TYPE_TO = 702;
        public static final int TYPE_TRANSITION_FLAGS = 707;
        public static final String S_DURATION = "duration";
        public static final String S_FROM = "from";
        public static final String S_TO = "to";
        public static final String S_PATH_MOTION_ARC = "pathMotionArc";
        public static final String S_AUTO_TRANSITION = "autoTransition";
        public static final String S_INTERPOLATOR = "motionInterpolator";
        public static final String S_STAGGERED = "staggered";
        public static final String S_TRANSITION_FLAGS = "transitionFlags";
        public static final String[] KEY_WORDS = {S_DURATION, S_FROM, S_TO, S_PATH_MOTION_ARC, S_AUTO_TRANSITION, S_INTERPOLATOR, S_STAGGERED, S_FROM, S_TRANSITION_FLAGS};

        /* compiled from: WazeSource */
        /* renamed from: androidx.constraintlayout.core.motion.utils.TypedValues$TransitionType$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            static {
                String str = TransitionType.NAME;
            }

            public static int getId(String str) {
                switch (str.hashCode()) {
                    case -1996906958:
                        return str.equals(TransitionType.S_TRANSITION_FLAGS) ? 707 : -1;
                    case -1992012396:
                        return str.equals(TransitionType.S_DURATION) ? 700 : -1;
                    case -1357874275:
                        return str.equals(TransitionType.S_INTERPOLATOR) ? 705 : -1;
                    case -1298065308:
                        return str.equals(TransitionType.S_AUTO_TRANSITION) ? 704 : -1;
                    case DisplayStrings.DS_PERSONALIZED_NAVIGATION_PETA_DESCRIPTION /* 3707 */:
                        return str.equals(TransitionType.S_TO) ? 702 : -1;
                    case 3151786:
                        return str.equals(TransitionType.S_FROM) ? 701 : -1;
                    case 1310733335:
                        return str.equals(TransitionType.S_PATH_MOTION_ARC) ? 509 : -1;
                    case 1839260940:
                        return str.equals(TransitionType.S_STAGGERED) ? 706 : -1;
                    default:
                        return -1;
                }
            }

            public static int getType(int i2) {
                if (i2 == 509) {
                    return 2;
                }
                switch (i2) {
                    case 700:
                        return 2;
                    case 701:
                    case 702:
                        return 8;
                    default:
                        switch (i2) {
                            case 705:
                            case 707:
                                return 8;
                            case 706:
                                return 4;
                            default:
                                return -1;
                        }
                }
            }
        }
    }

    /* compiled from: WazeSource */
    public interface TriggerType {
        public static final String CROSS = "CROSS";
        public static final String[] KEY_WORDS = {"viewTransitionOnCross", "viewTransitionOnPositiveCross", "viewTransitionOnNegativeCross", "postLayout", "triggerSlack", "triggerCollisionView", "triggerCollisionId", "triggerID", "positiveCross", "negativeCross", "triggerReceiver", "CROSS"};
        public static final String NAME = "KeyTrigger";
        public static final String NEGATIVE_CROSS = "negativeCross";
        public static final String POSITIVE_CROSS = "positiveCross";
        public static final String POST_LAYOUT = "postLayout";
        public static final String TRIGGER_COLLISION_ID = "triggerCollisionId";
        public static final String TRIGGER_COLLISION_VIEW = "triggerCollisionView";
        public static final String TRIGGER_ID = "triggerID";
        public static final String TRIGGER_RECEIVER = "triggerReceiver";
        public static final String TRIGGER_SLACK = "triggerSlack";
        public static final int TYPE_CROSS = 312;
        public static final int TYPE_NEGATIVE_CROSS = 310;
        public static final int TYPE_POSITIVE_CROSS = 309;
        public static final int TYPE_POST_LAYOUT = 304;
        public static final int TYPE_TRIGGER_COLLISION_ID = 307;
        public static final int TYPE_TRIGGER_COLLISION_VIEW = 306;
        public static final int TYPE_TRIGGER_ID = 308;
        public static final int TYPE_TRIGGER_RECEIVER = 311;
        public static final int TYPE_TRIGGER_SLACK = 305;
        public static final int TYPE_VIEW_TRANSITION_ON_CROSS = 301;
        public static final int TYPE_VIEW_TRANSITION_ON_NEGATIVE_CROSS = 303;
        public static final int TYPE_VIEW_TRANSITION_ON_POSITIVE_CROSS = 302;
        public static final String VIEW_TRANSITION_ON_CROSS = "viewTransitionOnCross";
        public static final String VIEW_TRANSITION_ON_NEGATIVE_CROSS = "viewTransitionOnNegativeCross";
        public static final String VIEW_TRANSITION_ON_POSITIVE_CROSS = "viewTransitionOnPositiveCross";

        /* compiled from: WazeSource */
        /* renamed from: androidx.constraintlayout.core.motion.utils.TypedValues$TriggerType$-CC, reason: invalid class name */
        public final /* synthetic */ class CC {
            static {
                String str = TriggerType.NAME;
            }

            public static int getId(String str) {
                switch (str.hashCode()) {
                    case -1594793529:
                        return str.equals("positiveCross") ? 309 : -1;
                    case -966421266:
                        return str.equals("viewTransitionOnPositiveCross") ? 302 : -1;
                    case -786670827:
                        return str.equals("triggerCollisionId") ? 307 : -1;
                    case -648752941:
                        return str.equals("triggerID") ? 308 : -1;
                    case -638126837:
                        return str.equals("negativeCross") ? 310 : -1;
                    case -76025313:
                        return str.equals("triggerCollisionView") ? 306 : -1;
                    case -9754574:
                        return str.equals("viewTransitionOnNegativeCross") ? 303 : -1;
                    case 64397344:
                        return str.equals("CROSS") ? 312 : -1;
                    case 364489912:
                        return str.equals("triggerSlack") ? 305 : -1;
                    case 1301930599:
                        return str.equals("viewTransitionOnCross") ? 301 : -1;
                    case 1401391082:
                        return str.equals("postLayout") ? 304 : -1;
                    case 1535404999:
                        return str.equals("triggerReceiver") ? 311 : -1;
                    default:
                        return -1;
                }
            }
        }
    }

    int getId(String str);

    boolean setValue(int i2, float f2);

    boolean setValue(int i2, int i3);

    boolean setValue(int i2, String str);

    boolean setValue(int i2, boolean z);
}
