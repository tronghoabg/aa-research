package androidx.compose.ui.text.style;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class BaselineShift {
    private final float multiplier;
    public static final Companion Companion = new Companion(null);
    private static final float Superscript = 0.5f;
    private static final float Subscript = -0.5f;
    private static final float None = 0.0f;
    private static final float Unspecified = Float.NaN;

    private /* synthetic */ BaselineShift(float f2) {
        this.multiplier = f2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ BaselineShift m10873boximpl(float f2) {
        return new BaselineShift(f2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10875equalsimpl(float f2, Object obj) {
        return (obj instanceof BaselineShift) && Float.compare(f2, ((BaselineShift) obj).m10879unboximpl()) == 0;
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10876equalsimpl0(float f2, float f3) {
        return Float.compare(f2, f3) == 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10877hashCodeimpl(float f2) {
        return Float.floatToIntBits(f2);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10878toStringimpl(float f2) {
        return "BaselineShift(multiplier=" + f2 + ')';
    }

    public boolean equals(Object obj) {
        return m10875equalsimpl(this.multiplier, obj);
    }

    public final float getMultiplier() {
        return this.multiplier;
    }

    public int hashCode() {
        return m10877hashCodeimpl(this.multiplier);
    }

    public String toString() {
        return m10878toStringimpl(this.multiplier);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ float m10879unboximpl() {
        return this.multiplier;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getNone-y9eOQZs, reason: not valid java name */
        public final float m10884getNoney9eOQZs() {
            return BaselineShift.None;
        }

        /* renamed from: getSubscript-y9eOQZs, reason: not valid java name */
        public final float m10885getSubscripty9eOQZs() {
            return BaselineShift.Subscript;
        }

        /* renamed from: getSuperscript-y9eOQZs, reason: not valid java name */
        public final float m10886getSuperscripty9eOQZs() {
            return BaselineShift.Superscript;
        }

        /* renamed from: getUnspecified-y9eOQZs, reason: not valid java name */
        public final float m10887getUnspecifiedy9eOQZs() {
            return BaselineShift.Unspecified;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: getNone-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m10880getNoney9eOQZs$annotations() {
        }

        /* renamed from: getSubscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m10881getSubscripty9eOQZs$annotations() {
        }

        /* renamed from: getSuperscript-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m10882getSuperscripty9eOQZs$annotations() {
        }

        /* renamed from: getUnspecified-y9eOQZs$annotations, reason: not valid java name */
        public static /* synthetic */ void m10883getUnspecifiedy9eOQZs$annotations() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static float m10874constructorimpl(float f2) {
        return f2;
    }
}
