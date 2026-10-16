package androidx.compose.ui.text.style;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class Hyphens {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = 1;
    private static final int Auto = 2;
    private static final int Unspecified = 0;

    private /* synthetic */ Hyphens(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Hyphens m10896boximpl(int i2) {
        return new Hyphens(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10898equalsimpl(int i2, Object obj) {
        return (obj instanceof Hyphens) && i2 == ((Hyphens) obj).m10902unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10899equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10901toStringimpl(int i2) {
        return m10899equalsimpl0(i2, None) ? "Hyphens.None" : m10899equalsimpl0(i2, Auto) ? "Hyphens.Auto" : m10899equalsimpl0(i2, Unspecified) ? "Hyphens.Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m10898equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m10901toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m10902unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAuto-vmbZdU8, reason: not valid java name */
        public final int m10903getAutovmbZdU8() {
            return Hyphens.Auto;
        }

        /* renamed from: getNone-vmbZdU8, reason: not valid java name */
        public final int m10904getNonevmbZdU8() {
            return Hyphens.None;
        }

        /* renamed from: getUnspecified-vmbZdU8, reason: not valid java name */
        public final int m10905getUnspecifiedvmbZdU8() {
            return Hyphens.Unspecified;
        }

        /* renamed from: valueOf-kPa1_AA, reason: not valid java name */
        public final int m10906valueOfkPa1_AA(int i2) {
            if (i2 >= 0 && i2 < 3) {
                return i2;
            }
            InlineClassHelperKt.throwIllegalArgumentException("The given value=" + i2 + " is not recognized by Hyphens.");
            return i2;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m10897constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10900hashCodeimpl(int i2) {
        return i2;
    }
}
