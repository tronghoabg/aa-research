package androidx.compose.material3;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes2.dex */
public final class NavigationItemIconPosition {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Top = 0;
    private static final int Start = 1;

    private /* synthetic */ NavigationItemIconPosition(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ NavigationItemIconPosition m5296boximpl(int i2) {
        return new NavigationItemIconPosition(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m5298equalsimpl(int i2, Object obj) {
        return (obj instanceof NavigationItemIconPosition) && i2 == ((NavigationItemIconPosition) obj).m5302unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m5299equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m5301toStringimpl(int i2) {
        return m5299equalsimpl0(i2, Top) ? "Top" : m5299equalsimpl0(i2, Start) ? "Start" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m5298equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m5301toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m5302unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getStart--xw1Ddg, reason: not valid java name */
        public final int m5303getStartxw1Ddg() {
            return NavigationItemIconPosition.Start;
        }

        /* renamed from: getTop--xw1Ddg, reason: not valid java name */
        public final int m5304getTopxw1Ddg() {
            return NavigationItemIconPosition.Top;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m5297constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m5300hashCodeimpl(int i2) {
        return i2;
    }
}
