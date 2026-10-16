package androidx.compose.foundation;

import h.g.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class GestureState {
    private final String status;
    public static final Companion Companion = new Companion(null);
    private static final String Idle = "idle";
    private static final String Waiting = "waiting";
    private static final String Recognized = "recognized";

    private /* synthetic */ GestureState(String str) {
        this.status = str;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ GestureState m2026boximpl(String str) {
        return new GestureState(str);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m2028equalsimpl(String str, Object obj) {
        return (obj instanceof GestureState) && x.n(str, ((GestureState) obj).m2032unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m2029equalsimpl0(String str, String str2) {
        return x.n(str, str2);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m2030hashCodeimpl(String str) {
        return str.hashCode();
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m2031toStringimpl(String str) {
        return "GestureState(status=" + str + ')';
    }

    public boolean equals(Object obj) {
        return m2028equalsimpl(this.status, obj);
    }

    public int hashCode() {
        return m2030hashCodeimpl(this.status);
    }

    public String toString() {
        return m2031toStringimpl(this.status);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ String m2032unboximpl() {
        return this.status;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getIdle-7meUWtM, reason: not valid java name */
        public final String m2033getIdle7meUWtM() {
            return GestureState.Idle;
        }

        /* renamed from: getRecognized-7meUWtM, reason: not valid java name */
        public final String m2034getRecognized7meUWtM() {
            return GestureState.Recognized;
        }

        /* renamed from: getWaiting-7meUWtM, reason: not valid java name */
        public final String m2035getWaiting7meUWtM() {
            return GestureState.Waiting;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static String m2027constructorimpl(String str) {
        return str;
    }
}
