package androidx.compose.ui.text.font;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class FontSynthesis {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int None = 0;
    private static final int Weight = 1;
    private static final int Style = 2;
    private static final int All = 65535;

    private /* synthetic */ FontSynthesis(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontSynthesis m10669boximpl(int i2) {
        return new FontSynthesis(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10671equalsimpl(int i2, Object obj) {
        return (obj instanceof FontSynthesis) && i2 == ((FontSynthesis) obj).m10677unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10672equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: isStyleOn-impl$ui_text, reason: not valid java name */
    public static final boolean m10674isStyleOnimpl$ui_text(int i2) {
        return (i2 & 2) != 0;
    }

    /* renamed from: isWeightOn-impl$ui_text, reason: not valid java name */
    public static final boolean m10675isWeightOnimpl$ui_text(int i2) {
        return (i2 & 1) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10676toStringimpl(int i2) {
        return m10672equalsimpl0(i2, None) ? "None" : m10672equalsimpl0(i2, Weight) ? "Weight" : m10672equalsimpl0(i2, Style) ? "Style" : m10672equalsimpl0(i2, All) ? "All" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m10671equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m10676toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m10677unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAll-GVVA2EU, reason: not valid java name */
        public final int m10678getAllGVVA2EU() {
            return FontSynthesis.All;
        }

        /* renamed from: getNone-GVVA2EU, reason: not valid java name */
        public final int m10679getNoneGVVA2EU() {
            return FontSynthesis.None;
        }

        /* renamed from: getStyle-GVVA2EU, reason: not valid java name */
        public final int m10680getStyleGVVA2EU() {
            return FontSynthesis.Style;
        }

        /* renamed from: getWeight-GVVA2EU, reason: not valid java name */
        public final int m10681getWeightGVVA2EU() {
            return FontSynthesis.Weight;
        }

        /* renamed from: valueOf-9CiegCU, reason: not valid java name */
        public final int m10682valueOf9CiegCU(int i2) {
            if (i2 != 0 && i2 != 1 && i2 != 2 && i2 != 65535) {
                InlineClassHelperKt.throwIllegalArgumentException("The given value=" + i2 + " is not recognized by FontSynthesis.");
            }
            return i2;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m10670constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10673hashCodeimpl(int i2) {
        return i2;
    }
}
