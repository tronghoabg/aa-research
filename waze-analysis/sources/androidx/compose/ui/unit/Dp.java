package androidx.compose.ui.unit;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class Dp implements Comparable<Dp> {
    public static final Companion Companion = new Companion(null);
    private static final float Hairline = 0.0f;
    private static final float Infinity = Float.POSITIVE_INFINITY;
    private static final float Unspecified = Float.NaN;
    private final float value;

    private /* synthetic */ Dp(float f2) {
        this.value = f2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Dp m11162boximpl(float f2) {
        return new Dp(f2);
    }

    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public static int m11163compareTo0680j_4(float f2, float f3) {
        if (Float.isNaN(f2) || Float.isNaN(f3)) {
            return 0;
        }
        return Float.compare(f2, f3);
    }

    /* renamed from: div-0680j_4, reason: not valid java name */
    public static final float m11165div0680j_4(float f2, float f3) {
        return f2 / f3;
    }

    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m11167divu2uoSUM(float f2, int i2) {
        return f2 / i2;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11168equalsimpl(float f2, Object obj) {
        return (obj instanceof Dp) && Float.compare(f2, ((Dp) obj).m11178unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11169equalsimpl0(float f2, float f3) {
        return Float.compare(f2, f3) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11170hashCodeimpl(float f2) {
        return Float.floatToIntBits(f2);
    }

    /* renamed from: minus-5rwHm24, reason: not valid java name */
    public static final float m11171minus5rwHm24(float f2, float f3) {
        return f2 - f3;
    }

    /* renamed from: plus-5rwHm24, reason: not valid java name */
    public static final float m11172plus5rwHm24(float f2, float f3) {
        return f2 + f3;
    }

    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m11174timesu2uoSUM(float f2, int i2) {
        return f2 * i2;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11175toStringimpl(float f2) {
        if (Float.isNaN(f2)) {
            return "Dp.Unspecified";
        }
        return f2 + ".dp";
    }

    /* renamed from: unaryMinus-D9Ej5fM, reason: not valid java name */
    public static final float m11176unaryMinusD9Ej5fM(float f2) {
        return -f2;
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(Dp dp) {
        return m11177compareTo0680j_4(dp.m11178unboximpl());
    }

    public boolean equals(Object obj) {
        return m11168equalsimpl(this.value, obj);
    }

    public final float getValue() {
        return this.value;
    }

    public int hashCode() {
        return m11170hashCodeimpl(this.value);
    }

    public String toString() {
        return m11175toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m11178unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getHairline-D9Ej5fM, reason: not valid java name */
        public final float m11182getHairlineD9Ej5fM() {
            return Dp.Hairline;
        }

        /* renamed from: getInfinity-D9Ej5fM, reason: not valid java name */
        public final float m11183getInfinityD9Ej5fM() {
            return Dp.Infinity;
        }

        /* renamed from: getUnspecified-D9Ej5fM, reason: not valid java name */
        public final float m11184getUnspecifiedD9Ej5fM() {
            return Dp.Unspecified;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: getHairline-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m11179getHairlineD9Ej5fM$annotations() {
        }

        /* renamed from: getInfinity-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m11180getInfinityD9Ej5fM$annotations() {
        }

        /* renamed from: getUnspecified-D9Ej5fM$annotations, reason: not valid java name */
        public static /* synthetic */ void m11181getUnspecifiedD9Ej5fM$annotations() {
        }
    }

    /* renamed from: div-u2uoSUM, reason: not valid java name */
    public static final float m11166divu2uoSUM(float f2, float f3) {
        return f2 / f3;
    }

    /* renamed from: times-u2uoSUM, reason: not valid java name */
    public static final float m11173timesu2uoSUM(float f2, float f3) {
        return f2 * f3;
    }

    /* renamed from: compareTo-0680j_4, reason: not valid java name */
    public int m11177compareTo0680j_4(float f2) {
        return m11163compareTo0680j_4(this.value, f2);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m11164constructorimpl(float f2) {
        return f2;
    }
}
