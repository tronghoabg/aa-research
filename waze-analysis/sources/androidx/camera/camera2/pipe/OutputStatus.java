package androidx.camera.camera2.pipe;

import h.g.b.o;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class OutputStatus {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int PENDING = 0;
    private static final int AVAILABLE = 1;
    private static final int UNAVAILABLE = 2;
    private static final int ERROR_OUTPUT_FAILED = 10;
    private static final int ERROR_OUTPUT_ABORTED = 11;
    private static final int ERROR_OUTPUT_MISSING = 12;
    private static final int ERROR_OUTPUT_DROPPED = 13;

    private /* synthetic */ OutputStatus(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ OutputStatus m741boximpl(int i2) {
        return new OutputStatus(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m743equalsimpl(int i2, Object obj) {
        return (obj instanceof OutputStatus) && i2 == ((OutputStatus) obj).m747unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m744equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m746toStringimpl(int i2) {
        if (i2 == 0) {
            return "PENDING";
        }
        if (i2 == 1) {
            return "AVAILABLE";
        }
        if (i2 == 2) {
            return "UNAVAILABLE";
        }
        switch (i2) {
            case 10:
                return "ERROR_OUTPUT_FAILED";
            case 11:
                return "ERROR_OUTPUT_ABORTED";
            case 12:
                return "ERROR_OUTPUT_MISSING";
            case 13:
                return "ERROR_OUTPUT_DROPPED";
            default:
                return a.a(i2, "OutputStatus(value=", ")");
        }
    }

    public boolean equals(Object obj) {
        return m743equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m746toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m747unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAVAILABLE-U7r42EA, reason: not valid java name */
        public final int m748getAVAILABLEU7r42EA() {
            return OutputStatus.AVAILABLE;
        }

        /* renamed from: getERROR_OUTPUT_ABORTED-U7r42EA, reason: not valid java name */
        public final int m749getERROR_OUTPUT_ABORTEDU7r42EA() {
            return OutputStatus.ERROR_OUTPUT_ABORTED;
        }

        /* renamed from: getERROR_OUTPUT_DROPPED-U7r42EA, reason: not valid java name */
        public final int m750getERROR_OUTPUT_DROPPEDU7r42EA() {
            return OutputStatus.ERROR_OUTPUT_DROPPED;
        }

        /* renamed from: getERROR_OUTPUT_FAILED-U7r42EA, reason: not valid java name */
        public final int m751getERROR_OUTPUT_FAILEDU7r42EA() {
            return OutputStatus.ERROR_OUTPUT_FAILED;
        }

        /* renamed from: getERROR_OUTPUT_MISSING-U7r42EA, reason: not valid java name */
        public final int m752getERROR_OUTPUT_MISSINGU7r42EA() {
            return OutputStatus.ERROR_OUTPUT_MISSING;
        }

        /* renamed from: getPENDING-U7r42EA, reason: not valid java name */
        public final int m753getPENDINGU7r42EA() {
            return OutputStatus.PENDING;
        }

        /* renamed from: getUNAVAILABLE-U7r42EA, reason: not valid java name */
        public final int m754getUNAVAILABLEU7r42EA() {
            return OutputStatus.UNAVAILABLE;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m742constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m745hashCodeimpl(int i2) {
        return i2;
    }
}
