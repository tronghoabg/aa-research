package androidx.compose.foundation.layout;

import h.g.b.o;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes.dex */
public final class WindowInsetsSides {
    private static final int Horizontal;
    private static final int Left;
    private static final int Right;
    private static final int Vertical;
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int AllowLeftInLtr = 8;
    private static final int AllowRightInLtr = 4;
    private static final int AllowLeftInRtl = 2;
    private static final int AllowRightInRtl = 1;
    private static final int Start = m2860plusgK_yJZ4(8, 1);
    private static final int End = m2860plusgK_yJZ4(4, 2);
    private static final int Top = 16;
    private static final int Bottom = 32;

    static {
        int iM2860plusgK_yJZ4 = m2860plusgK_yJZ4(8, 2);
        Left = iM2860plusgK_yJZ4;
        int iM2860plusgK_yJZ42 = m2860plusgK_yJZ4(4, 1);
        Right = iM2860plusgK_yJZ42;
        Horizontal = m2860plusgK_yJZ4(iM2860plusgK_yJZ4, iM2860plusgK_yJZ42);
        Vertical = m2860plusgK_yJZ4(16, 32);
    }

    private /* synthetic */ WindowInsetsSides(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ WindowInsetsSides m2854boximpl(int i2) {
        return new WindowInsetsSides(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2856equalsimpl(int i2, Object obj) {
        return (obj instanceof WindowInsetsSides) && i2 == ((WindowInsetsSides) obj).m2863unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2857equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: hasAny-bkgdKaI$foundation_layout, reason: not valid java name */
    public static final boolean m2858hasAnybkgdKaI$foundation_layout(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    /* renamed from: plus-gK_yJZ4, reason: not valid java name */
    public static final int m2860plusgK_yJZ4(int i2, int i3) {
        return i2 | i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2861toStringimpl(int i2) {
        return "WindowInsetsSides(" + m2862valueToStringimpl(i2) + ')';
    }

    /* renamed from: valueToString-impl, reason: not valid java name */
    private static final String m2862valueToStringimpl(int i2) {
        StringBuilder sb = new StringBuilder();
        int i3 = Start;
        if ((i2 & i3) == i3) {
            valueToString_impl$lambda$0$appendPlus(sb, "Start");
        }
        int i4 = Left;
        if ((i2 & i4) == i4) {
            valueToString_impl$lambda$0$appendPlus(sb, "Left");
        }
        int i5 = Top;
        if ((i2 & i5) == i5) {
            valueToString_impl$lambda$0$appendPlus(sb, "Top");
        }
        int i6 = End;
        if ((i2 & i6) == i6) {
            valueToString_impl$lambda$0$appendPlus(sb, "End");
        }
        int i7 = Right;
        if ((i2 & i7) == i7) {
            valueToString_impl$lambda$0$appendPlus(sb, "Right");
        }
        int i8 = Bottom;
        if ((i2 & i8) == i8) {
            valueToString_impl$lambda$0$appendPlus(sb, "Bottom");
        }
        return sb.toString();
    }

    private static final void valueToString_impl$lambda$0$appendPlus(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public boolean equals(Object obj) {
        return m2856equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m2861toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m2863unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAllowLeftInLtr-JoeWqyM$foundation_layout, reason: not valid java name */
        public final int m2864getAllowLeftInLtrJoeWqyM$foundation_layout() {
            return WindowInsetsSides.AllowLeftInLtr;
        }

        /* renamed from: getAllowLeftInRtl-JoeWqyM$foundation_layout, reason: not valid java name */
        public final int m2865getAllowLeftInRtlJoeWqyM$foundation_layout() {
            return WindowInsetsSides.AllowLeftInRtl;
        }

        /* renamed from: getAllowRightInLtr-JoeWqyM$foundation_layout, reason: not valid java name */
        public final int m2866getAllowRightInLtrJoeWqyM$foundation_layout() {
            return WindowInsetsSides.AllowRightInLtr;
        }

        /* renamed from: getAllowRightInRtl-JoeWqyM$foundation_layout, reason: not valid java name */
        public final int m2867getAllowRightInRtlJoeWqyM$foundation_layout() {
            return WindowInsetsSides.AllowRightInRtl;
        }

        /* renamed from: getBottom-JoeWqyM, reason: not valid java name */
        public final int m2868getBottomJoeWqyM() {
            return WindowInsetsSides.Bottom;
        }

        /* renamed from: getEnd-JoeWqyM, reason: not valid java name */
        public final int m2869getEndJoeWqyM() {
            return WindowInsetsSides.End;
        }

        /* renamed from: getHorizontal-JoeWqyM, reason: not valid java name */
        public final int m2870getHorizontalJoeWqyM() {
            return WindowInsetsSides.Horizontal;
        }

        /* renamed from: getLeft-JoeWqyM, reason: not valid java name */
        public final int m2871getLeftJoeWqyM() {
            return WindowInsetsSides.Left;
        }

        /* renamed from: getRight-JoeWqyM, reason: not valid java name */
        public final int m2872getRightJoeWqyM() {
            return WindowInsetsSides.Right;
        }

        /* renamed from: getStart-JoeWqyM, reason: not valid java name */
        public final int m2873getStartJoeWqyM() {
            return WindowInsetsSides.Start;
        }

        /* renamed from: getTop-JoeWqyM, reason: not valid java name */
        public final int m2874getTopJoeWqyM() {
            return WindowInsetsSides.Top;
        }

        /* renamed from: getVertical-JoeWqyM, reason: not valid java name */
        public final int m2875getVerticalJoeWqyM() {
            return WindowInsetsSides.Vertical;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m2855constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2859hashCodeimpl(int i2) {
        return i2;
    }
}
