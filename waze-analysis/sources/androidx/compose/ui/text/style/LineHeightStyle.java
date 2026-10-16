package androidx.compose.ui.text.style;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class LineHeightStyle {
    public static final int $stable = 0;
    public static final Companion Companion;
    private static final LineHeightStyle Default;
    private final float alignment;
    private final int mode;
    private final int trim;

    static {
        o oVar = null;
        Companion = new Companion(oVar);
        Default = new LineHeightStyle(Alignment.Companion.m10979getProportionalPIaL0Z0(), Trim.Companion.m11000getBothEVpEnUU(), Mode.Companion.m10988getFixedlzQqcRY(), oVar);
    }

    private LineHeightStyle(float f2, int i2) {
        this(f2, i2, Mode.Companion.m10988getFixedlzQqcRY(), null);
    }

    /* renamed from: copy-38bxuX8$default, reason: not valid java name */
    public static /* synthetic */ LineHeightStyle m10965copy38bxuX8$default(LineHeightStyle lineHeightStyle, float f2, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            f2 = lineHeightStyle.alignment;
        }
        if ((i4 & 2) != 0) {
            i2 = lineHeightStyle.trim;
        }
        if ((i4 & 4) != 0) {
            i3 = lineHeightStyle.mode;
        }
        return lineHeightStyle.m10966copy38bxuX8(f2, i2, i3);
    }

    /* renamed from: copy-38bxuX8, reason: not valid java name */
    public final LineHeightStyle m10966copy38bxuX8(float f2, int i2, int i3) {
        return new LineHeightStyle(f2, i2, i3, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LineHeightStyle)) {
            return false;
        }
        LineHeightStyle lineHeightStyle = (LineHeightStyle) obj;
        return Alignment.m10973equalsimpl0(this.alignment, lineHeightStyle.alignment) && Trim.m10994equalsimpl0(this.trim, lineHeightStyle.trim) && Mode.m10984equalsimpl0(this.mode, lineHeightStyle.mode);
    }

    /* renamed from: getAlignment-PIaL0Z0, reason: not valid java name */
    public final float m10967getAlignmentPIaL0Z0() {
        return this.alignment;
    }

    /* renamed from: getMode-lzQqcRY, reason: not valid java name */
    public final int m10968getModelzQqcRY() {
        return this.mode;
    }

    /* renamed from: getTrim-EVpEnUU, reason: not valid java name */
    public final int m10969getTrimEVpEnUU() {
        return this.trim;
    }

    public int hashCode() {
        return (((Alignment.m10974hashCodeimpl(this.alignment) * 31) + this.trim) * 31) + this.mode;
    }

    public String toString() {
        return "LineHeightStyle(alignment=" + ((Object) Alignment.m10975toStringimpl(this.alignment)) + ", trim=" + ((Object) Trim.m10998toStringimpl(this.trim)) + ",mode=" + ((Object) Mode.m10986toStringimpl(this.mode)) + ')';
    }

    /* compiled from: WazeSource */
    @a
    public final class Alignment {
        private static final float Bottom;
        private static final float Center;
        public static final Companion Companion = new Companion(null);
        private static final float Proportional;
        private static final float Top;
        private final float topRatio;

        static {
            m10971constructorimpl(0.0f);
            Top = 0.0f;
            m10971constructorimpl(0.5f);
            Center = 0.5f;
            m10971constructorimpl(-1.0f);
            Proportional = -1.0f;
            m10971constructorimpl(1.0f);
            Bottom = 1.0f;
        }

        private /* synthetic */ Alignment(float f2) {
            this.topRatio = f2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Alignment m10970boximpl(float f2) {
            return new Alignment(f2);
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static float m10971constructorimpl(float f2) {
            if ((f2 < 0.0f || f2 > 1.0f) && f2 != -1.0f) {
                InlineClassHelperKt.throwIllegalStateException("topRatio should be in [0..1] range or -1");
            }
            return f2;
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m10972equalsimpl(float f2, Object obj) {
            return (obj instanceof Alignment) && Float.compare(f2, ((Alignment) obj).m10976unboximpl()) == 0;
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m10973equalsimpl0(float f2, float f3) {
            return Float.compare(f2, f3) == 0;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m10974hashCodeimpl(float f2) {
            return Float.floatToIntBits(f2);
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m10975toStringimpl(float f2) {
            if (f2 == Top) {
                return "LineHeightStyle.Alignment.Top";
            }
            if (f2 == Center) {
                return "LineHeightStyle.Alignment.Center";
            }
            if (f2 == Proportional) {
                return "LineHeightStyle.Alignment.Proportional";
            }
            if (f2 == Bottom) {
                return "LineHeightStyle.Alignment.Bottom";
            }
            return "LineHeightStyle.Alignment(topPercentage = " + f2 + ')';
        }

        public boolean equals(Object obj) {
            return m10972equalsimpl(this.topRatio, obj);
        }

        public int hashCode() {
            return m10974hashCodeimpl(this.topRatio);
        }

        public String toString() {
            return m10975toStringimpl(this.topRatio);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ float m10976unboximpl() {
            return this.topRatio;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getBottom-PIaL0Z0, reason: not valid java name */
            public final float m10977getBottomPIaL0Z0() {
                return Alignment.Bottom;
            }

            /* renamed from: getCenter-PIaL0Z0, reason: not valid java name */
            public final float m10978getCenterPIaL0Z0() {
                return Alignment.Center;
            }

            /* renamed from: getProportional-PIaL0Z0, reason: not valid java name */
            public final float m10979getProportionalPIaL0Z0() {
                return Alignment.Proportional;
            }

            /* renamed from: getTop-PIaL0Z0, reason: not valid java name */
            public final float m10980getTopPIaL0Z0() {
                return Alignment.Top;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }
    }

    /* compiled from: WazeSource */
    @a
    public final class Mode {
        public static final Companion Companion = new Companion(null);
        private static final int Fixed = 0;
        private static final int Minimum = 1;
        private static final int Tight = 2;
        private final int value;

        private /* synthetic */ Mode(int i2) {
            this.value = i2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Mode m10981boximpl(int i2) {
            return new Mode(i2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m10983equalsimpl(int i2, Object obj) {
            return (obj instanceof Mode) && i2 == ((Mode) obj).m10987unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m10984equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m10986toStringimpl(int i2) {
            return m10984equalsimpl0(i2, Fixed) ? "LineHeightStyle.Mode.Fixed" : m10984equalsimpl0(i2, Minimum) ? "LineHeightStyle.Mode.Minimum" : m10984equalsimpl0(i2, Tight) ? "LineHeightStyle.Mode.Tight" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m10983equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return m10986toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m10987unboximpl() {
            return this.value;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getFixed-lzQqcRY, reason: not valid java name */
            public final int m10988getFixedlzQqcRY() {
                return Mode.Fixed;
            }

            /* renamed from: getMinimum-lzQqcRY, reason: not valid java name */
            public final int m10989getMinimumlzQqcRY() {
                return Mode.Minimum;
            }

            /* renamed from: getTight-lzQqcRY, reason: not valid java name */
            public final int m10990getTightlzQqcRY() {
                return Mode.Tight;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m10982constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m10985hashCodeimpl(int i2) {
            return i2;
        }
    }

    /* compiled from: WazeSource */
    @a
    public final class Trim {
        private static final int FlagTrimBottom = 16;
        private static final int FlagTrimTop = 1;
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int FirstLineTop = 1;
        private static final int LastLineBottom = 16;
        private static final int Both = 17;
        private static final int None = 0;

        private /* synthetic */ Trim(int i2) {
            this.value = i2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Trim m10991boximpl(int i2) {
            return new Trim(i2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m10993equalsimpl(int i2, Object obj) {
            return (obj instanceof Trim) && i2 == ((Trim) obj).m10999unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m10994equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* renamed from: isTrimFirstLineTop-impl$ui_text, reason: not valid java name */
        public static final boolean m10996isTrimFirstLineTopimpl$ui_text(int i2) {
            return (i2 & 1) > 0;
        }

        /* renamed from: isTrimLastLineBottom-impl$ui_text, reason: not valid java name */
        public static final boolean m10997isTrimLastLineBottomimpl$ui_text(int i2) {
            return (i2 & 16) > 0;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m10998toStringimpl(int i2) {
            return i2 == FirstLineTop ? "LineHeightStyle.Trim.FirstLineTop" : i2 == LastLineBottom ? "LineHeightStyle.Trim.LastLineBottom" : i2 == Both ? "LineHeightStyle.Trim.Both" : i2 == None ? "LineHeightStyle.Trim.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m10993equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return m10998toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m10999unboximpl() {
            return this.value;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getBoth-EVpEnUU, reason: not valid java name */
            public final int m11000getBothEVpEnUU() {
                return Trim.Both;
            }

            /* renamed from: getFirstLineTop-EVpEnUU, reason: not valid java name */
            public final int m11001getFirstLineTopEVpEnUU() {
                return Trim.FirstLineTop;
            }

            /* renamed from: getLastLineBottom-EVpEnUU, reason: not valid java name */
            public final int m11002getLastLineBottomEVpEnUU() {
                return Trim.LastLineBottom;
            }

            /* renamed from: getNone-EVpEnUU, reason: not valid java name */
            public final int m11003getNoneEVpEnUU() {
                return Trim.None;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m10992constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m10995hashCodeimpl(int i2) {
            return i2;
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final LineHeightStyle getDefault() {
            return LineHeightStyle.Default;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ LineHeightStyle(float f2, int i2, int i3, o oVar) {
        this(f2, i2, i3);
    }

    public /* synthetic */ LineHeightStyle(float f2, int i2, o oVar) {
        this(f2, i2);
    }

    private LineHeightStyle(float f2, int i2, int i3) {
        this.alignment = f2;
        this.trim = i2;
        this.mode = i3;
    }
}
