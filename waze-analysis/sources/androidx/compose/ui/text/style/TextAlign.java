package androidx.compose.ui.text.style;

import androidx.compose.ui.text.internal.InlineClassHelperKt;
import h.a.i;
import h.g.a;
import h.g.b.o;
import java.util.List;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class TextAlign {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Left = 1;
    private static final int Right = 2;
    private static final int Center = 3;
    private static final int Justify = 4;
    private static final int Start = 5;
    private static final int End = 6;
    private static final int Unspecified = 0;

    private /* synthetic */ TextAlign(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TextAlign m11004boximpl(int i2) {
        return new TextAlign(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11006equalsimpl(int i2, Object obj) {
        return (obj instanceof TextAlign) && i2 == ((TextAlign) obj).m11010unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11007equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11009toStringimpl(int i2) {
        return m11007equalsimpl0(i2, Left) ? "Left" : m11007equalsimpl0(i2, Right) ? "Right" : m11007equalsimpl0(i2, Center) ? "Center" : m11007equalsimpl0(i2, Justify) ? "Justify" : m11007equalsimpl0(i2, Start) ? "Start" : m11007equalsimpl0(i2, End) ? "End" : m11007equalsimpl0(i2, Unspecified) ? "Unspecified" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m11006equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m11009toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m11010unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getCenter-e0LSkKk, reason: not valid java name */
        public final int m11011getCentere0LSkKk() {
            return TextAlign.Center;
        }

        /* renamed from: getEnd-e0LSkKk, reason: not valid java name */
        public final int m11012getEnde0LSkKk() {
            return TextAlign.End;
        }

        /* renamed from: getJustify-e0LSkKk, reason: not valid java name */
        public final int m11013getJustifye0LSkKk() {
            return TextAlign.Justify;
        }

        /* renamed from: getLeft-e0LSkKk, reason: not valid java name */
        public final int m11014getLefte0LSkKk() {
            return TextAlign.Left;
        }

        /* renamed from: getRight-e0LSkKk, reason: not valid java name */
        public final int m11015getRighte0LSkKk() {
            return TextAlign.Right;
        }

        /* renamed from: getStart-e0LSkKk, reason: not valid java name */
        public final int m11016getStarte0LSkKk() {
            return TextAlign.Start;
        }

        /* renamed from: getUnspecified-e0LSkKk, reason: not valid java name */
        public final int m11017getUnspecifiede0LSkKk() {
            return TextAlign.Unspecified;
        }

        /* renamed from: valueOf-IgVj0fw, reason: not valid java name */
        public final int m11018valueOfIgVj0fw(int i2) {
            if (i2 >= 0 && i2 < 7) {
                return i2;
            }
            InlineClassHelperKt.throwIllegalArgumentException("The given value=" + i2 + " is not recognized by TextAlign.");
            return i2;
        }

        public final List<TextAlign> values() {
            return i.i(TextAlign.m11004boximpl(m11014getLefte0LSkKk()), TextAlign.m11004boximpl(m11015getRighte0LSkKk()), TextAlign.m11004boximpl(m11011getCentere0LSkKk()), TextAlign.m11004boximpl(m11013getJustifye0LSkKk()), TextAlign.m11004boximpl(m11016getStarte0LSkKk()), TextAlign.m11004boximpl(m11012getEnde0LSkKk()));
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m11005constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11008hashCodeimpl(int i2) {
        return i2;
    }
}
