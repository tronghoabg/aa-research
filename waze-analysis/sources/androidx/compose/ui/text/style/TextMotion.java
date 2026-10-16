package androidx.compose.ui.text.style;

import h.g.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes.dex */
public final class TextMotion {
    public static final int $stable = 0;
    private static final TextMotion Animated;
    public static final Companion Companion;
    private static final TextMotion Static;
    private final int linearity;
    private final boolean subpixelTextPositioning;

    static {
        o oVar = null;
        Companion = new Companion(oVar);
        Static = new TextMotion(Linearity.Companion.m11053getFontHinting4e0Vf04(), false, oVar);
        Animated = new TextMotion(Linearity.Companion.m11054getLinear4e0Vf04(), true, oVar);
    }

    private TextMotion(int i2, boolean z) {
        this.linearity = i2;
        this.subpixelTextPositioning = z;
    }

    /* renamed from: copy-JdDtMQo$ui_text$default, reason: not valid java name */
    public static /* synthetic */ TextMotion m11043copyJdDtMQo$ui_text$default(TextMotion textMotion, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i2 = textMotion.linearity;
        }
        if ((i3 & 2) != 0) {
            z = textMotion.subpixelTextPositioning;
        }
        return textMotion.m11044copyJdDtMQo$ui_text(i2, z);
    }

    /* renamed from: copy-JdDtMQo$ui_text, reason: not valid java name */
    public final TextMotion m11044copyJdDtMQo$ui_text(int i2, boolean z) {
        return new TextMotion(i2, z, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextMotion)) {
            return false;
        }
        TextMotion textMotion = (TextMotion) obj;
        return Linearity.m11049equalsimpl0(this.linearity, textMotion.linearity) && this.subpixelTextPositioning == textMotion.subpixelTextPositioning;
    }

    /* renamed from: getLinearity-4e0Vf04$ui_text, reason: not valid java name */
    public final int m11045getLinearity4e0Vf04$ui_text() {
        return this.linearity;
    }

    public final boolean getSubpixelTextPositioning$ui_text() {
        return this.subpixelTextPositioning;
    }

    public int hashCode() {
        return (this.linearity * 31) + TextMotion$$ExternalSyntheticBackport0.m(this.subpixelTextPositioning);
    }

    public String toString() {
        return x.n(this, Static) ? "TextMotion.Static" : x.n(this, Animated) ? "TextMotion.Animated" : "Invalid";
    }

    /* compiled from: WazeSource */
    @a
    public final class Linearity {
        private final int value;
        public static final Companion Companion = new Companion(null);
        private static final int Linear = 1;
        private static final int FontHinting = 2;
        private static final int None = 3;

        private /* synthetic */ Linearity(int i2) {
            this.value = i2;
        }

        /* renamed from: box-impl, reason: not valid java name */
        public static final /* synthetic */ Linearity m11046boximpl(int i2) {
            return new Linearity(i2);
        }

        /* renamed from: equals-impl, reason: not valid java name */
        public static boolean m11048equalsimpl(int i2, Object obj) {
            return (obj instanceof Linearity) && i2 == ((Linearity) obj).m11052unboximpl();
        }

        /* renamed from: equals-impl0, reason: not valid java name */
        public static final boolean m11049equalsimpl0(int i2, int i3) {
            return i2 == i3;
        }

        /* renamed from: toString-impl, reason: not valid java name */
        public static String m11051toStringimpl(int i2) {
            return m11049equalsimpl0(i2, Linear) ? "Linearity.Linear" : m11049equalsimpl0(i2, FontHinting) ? "Linearity.FontHinting" : m11049equalsimpl0(i2, None) ? "Linearity.None" : "Invalid";
        }

        public boolean equals(Object obj) {
            return m11048equalsimpl(this.value, obj);
        }

        public int hashCode() {
            return this.value;
        }

        public String toString() {
            return m11051toStringimpl(this.value);
        }

        /* renamed from: unbox-impl, reason: not valid java name */
        public final /* synthetic */ int m11052unboximpl() {
            return this.value;
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            /* renamed from: getFontHinting-4e0Vf04, reason: not valid java name */
            public final int m11053getFontHinting4e0Vf04() {
                return Linearity.FontHinting;
            }

            /* renamed from: getLinear-4e0Vf04, reason: not valid java name */
            public final int m11054getLinear4e0Vf04() {
                return Linearity.Linear;
            }

            /* renamed from: getNone-4e0Vf04, reason: not valid java name */
            public final int m11055getNone4e0Vf04() {
                return Linearity.None;
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        /* renamed from: constructor-impl, reason: not valid java name */
        public static int m11047constructorimpl(int i2) {
            return i2;
        }

        /* renamed from: hashCode-impl, reason: not valid java name */
        public static int m11050hashCodeimpl(int i2) {
            return i2;
        }
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public final TextMotion getAnimated() {
            return TextMotion.Animated;
        }

        public final TextMotion getStatic() {
            return TextMotion.Static;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    public /* synthetic */ TextMotion(int i2, boolean z, o oVar) {
        this(i2, z);
    }
}
