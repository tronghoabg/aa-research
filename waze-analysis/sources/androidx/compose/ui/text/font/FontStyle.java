package androidx.compose.ui.text.font;

import h.a.i;
import h.g.a;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class FontStyle {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Normal = 0;
    private static final int Italic = 1;

    private /* synthetic */ FontStyle(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ FontStyle m10658boximpl(int i2) {
        return new FontStyle(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10660equalsimpl(int i2, Object obj) {
        return (obj instanceof FontStyle) && i2 == ((FontStyle) obj).m10664unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10661equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10663toStringimpl(int i2) {
        return m10661equalsimpl0(i2, Normal) ? "Normal" : m10661equalsimpl0(i2, Italic) ? "Italic" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m10660equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m10663toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m10664unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getItalic-_-LCdwA, reason: not valid java name */
        public final int m10667getItalic_LCdwA() {
            return FontStyle.Italic;
        }

        /* renamed from: getNormal-_-LCdwA, reason: not valid java name */
        public final int m10668getNormal_LCdwA() {
            return FontStyle.Normal;
        }

        public final List<FontStyle> values() {
            return i.i(FontStyle.m10658boximpl(m10668getNormal_LCdwA()), FontStyle.m10658boximpl(m10667getItalic_LCdwA()));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }

        /* renamed from: getItalic-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m10665getItalic_LCdwA$annotations() {
        }

        /* renamed from: getNormal-_-LCdwA$annotations, reason: not valid java name */
        public static /* synthetic */ void m10666getNormal_LCdwA$annotations() {
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m10659constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10662hashCodeimpl(int i2) {
        return i2;
    }
}
