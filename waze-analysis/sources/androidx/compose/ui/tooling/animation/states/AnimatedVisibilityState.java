package androidx.compose.ui.tooling.animation.states;

import h.g.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
@a
/* loaded from: classes3.dex */
public final class AnimatedVisibilityState implements ComposeAnimationState {
    public static final Companion Companion = new Companion(null);
    private static final String Enter = "Enter";
    private static final String Exit = "Exit";
    private final String value;

    private /* synthetic */ AnimatedVisibilityState(String str) {
        this.value = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AnimatedVisibilityState m11085boximpl(String str) {
        return new AnimatedVisibilityState(str);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static String m11086constructorimpl(String str) {
        return str;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m11087equalsimpl(String str, Object obj) {
        return (obj instanceof AnimatedVisibilityState) && x.n(str, ((AnimatedVisibilityState) obj).m11091unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m11088equalsimpl0(String str, String str2) {
        return x.n(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m11089hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m11090toStringimpl(String str) {
        return str;
    }

    public boolean equals(Object obj) {
        return m11087equalsimpl(this.value, obj);
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        return m11089hashCodeimpl(this.value);
    }

    public String toString() {
        return this.value;
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m11091unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getEnter-jXw82LU, reason: not valid java name */
        public final String m11092getEnterjXw82LU() {
            return AnimatedVisibilityState.Enter;
        }

        /* renamed from: getExit-jXw82LU, reason: not valid java name */
        public final String m11093getExitjXw82LU() {
            return AnimatedVisibilityState.Exit;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }
}
