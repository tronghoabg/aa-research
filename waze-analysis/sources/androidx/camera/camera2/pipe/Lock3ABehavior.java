package androidx.camera.camera2.pipe;

import h.g.b.o;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class Lock3ABehavior {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int IMMEDIATE = 1;
    private static final int AFTER_CURRENT_SCAN = 2;
    private static final int AFTER_NEW_SCAN = 3;

    private /* synthetic */ Lock3ABehavior(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Lock3ABehavior m720boximpl(int i2) {
        return new Lock3ABehavior(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m722equalsimpl(int i2, Object obj) {
        return (obj instanceof Lock3ABehavior) && i2 == ((Lock3ABehavior) obj).m726unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m723equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m725toStringimpl(int i2) {
        return a.a(i2, "Lock3ABehavior(value=", ")");
    }

    public boolean equals(Object obj) {
        return m722equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m725toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m726unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAFTER_CURRENT_SCAN-hRqSH3k, reason: not valid java name */
        public final int m727getAFTER_CURRENT_SCANhRqSH3k() {
            return Lock3ABehavior.AFTER_CURRENT_SCAN;
        }

        /* renamed from: getAFTER_NEW_SCAN-hRqSH3k, reason: not valid java name */
        public final int m728getAFTER_NEW_SCANhRqSH3k() {
            return Lock3ABehavior.AFTER_NEW_SCAN;
        }

        /* renamed from: getIMMEDIATE-hRqSH3k, reason: not valid java name */
        public final int m729getIMMEDIATEhRqSH3k() {
            return Lock3ABehavior.IMMEDIATE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m721constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m724hashCodeimpl(int i2) {
        return i2;
    }
}
