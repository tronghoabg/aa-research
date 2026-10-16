package androidx.compose.ui.text;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class PlaceholderVerticalAlign {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int AboveBaseline = 1;
    private static final int Top = 2;
    private static final int Bottom = 3;
    private static final int Center = 4;
    private static final int TextTop = 5;
    private static final int TextBottom = 6;
    private static final int TextCenter = 7;

    private /* synthetic */ PlaceholderVerticalAlign(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ PlaceholderVerticalAlign m10460boximpl(int i2) {
        return new PlaceholderVerticalAlign(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m10462equalsimpl(int i2, Object obj) {
        return (obj instanceof PlaceholderVerticalAlign) && i2 == ((PlaceholderVerticalAlign) obj).m10466unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m10463equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m10465toStringimpl(int i2) {
        return m10463equalsimpl0(i2, AboveBaseline) ? "AboveBaseline" : m10463equalsimpl0(i2, Top) ? "Top" : m10463equalsimpl0(i2, Bottom) ? "Bottom" : m10463equalsimpl0(i2, Center) ? "Center" : m10463equalsimpl0(i2, TextTop) ? "TextTop" : m10463equalsimpl0(i2, TextBottom) ? "TextBottom" : m10463equalsimpl0(i2, TextCenter) ? "TextCenter" : "Invalid";
    }

    public boolean equals(Object obj) {
        return m10462equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m10465toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m10466unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAboveBaseline-J6kI3mc, reason: not valid java name */
        public final int m10467getAboveBaselineJ6kI3mc() {
            return PlaceholderVerticalAlign.AboveBaseline;
        }

        /* renamed from: getBottom-J6kI3mc, reason: not valid java name */
        public final int m10468getBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.Bottom;
        }

        /* renamed from: getCenter-J6kI3mc, reason: not valid java name */
        public final int m10469getCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.Center;
        }

        /* renamed from: getTextBottom-J6kI3mc, reason: not valid java name */
        public final int m10470getTextBottomJ6kI3mc() {
            return PlaceholderVerticalAlign.TextBottom;
        }

        /* renamed from: getTextCenter-J6kI3mc, reason: not valid java name */
        public final int m10471getTextCenterJ6kI3mc() {
            return PlaceholderVerticalAlign.TextCenter;
        }

        /* renamed from: getTextTop-J6kI3mc, reason: not valid java name */
        public final int m10472getTextTopJ6kI3mc() {
            return PlaceholderVerticalAlign.TextTop;
        }

        /* renamed from: getTop-J6kI3mc, reason: not valid java name */
        public final int m10473getTopJ6kI3mc() {
            return PlaceholderVerticalAlign.Top;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m10461constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m10464hashCodeimpl(int i2) {
        return i2;
    }
}
