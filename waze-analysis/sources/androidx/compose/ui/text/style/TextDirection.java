package androidx.compose.ui.text.style;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class TextDirection {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Ltr = 1;
    private static final int Rtl = 2;
    private static final int Content = 3;
    private static final int ContentOrLtr = 4;
    private static final int ContentOrRtl = 5;
    private static final int Unspecified = 0;

    private /* synthetic */ TextDirection(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextDirection m11021boximpl(int i2) {
        return new TextDirection(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11023equalsimpl(int i2, Object obj) {
        return (obj instanceof TextDirection) && i2 == ((TextDirection) obj).m11027unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11024equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11026toStringimpl(int i2) {
        return m11024equalsimpl0(i2, Ltr) ? "Ltr" : m11024equalsimpl0(i2, Rtl) ? "Rtl" : m11024equalsimpl0(i2, Content) ? "Content" : m11024equalsimpl0(i2, ContentOrLtr) ? "ContentOrLtr" : m11024equalsimpl0(i2, ContentOrRtl) ? "ContentOrRtl" : m11024equalsimpl0(i2, Unspecified) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m11023equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m11026toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m11027unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getContent-s_7X-co, reason: not valid java name */
        public final int m11028getContents_7Xco() {
            return TextDirection.Content;
        }

        /* renamed from: getContentOrLtr-s_7X-co, reason: not valid java name */
        public final int m11029getContentOrLtrs_7Xco() {
            return TextDirection.ContentOrLtr;
        }

        /* renamed from: getContentOrRtl-s_7X-co, reason: not valid java name */
        public final int m11030getContentOrRtls_7Xco() {
            return TextDirection.ContentOrRtl;
        }

        /* renamed from: getLtr-s_7X-co, reason: not valid java name */
        public final int m11031getLtrs_7Xco() {
            return TextDirection.Ltr;
        }

        /* renamed from: getRtl-s_7X-co, reason: not valid java name */
        public final int m11032getRtls_7Xco() {
            return TextDirection.Rtl;
        }

        /* renamed from: getUnspecified-s_7X-co, reason: not valid java name */
        public final int m11033getUnspecifieds_7Xco() {
            return TextDirection.Unspecified;
        }

        /* renamed from: valueOf-E8nx0Ws, reason: not valid java name */
        public final int m11034valueOfE8nx0Ws(int i2) {
            if (i2 >= 0 && i2 < 6) {
                return i2;
            }
            InlineClassHelperKt.throwIllegalArgumentException("The given value=" + i2 + " is not recognized by TextDirection.");
            return i2;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m11022constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11025hashCodeimpl(int i2) {
        return i2;
    }
}
