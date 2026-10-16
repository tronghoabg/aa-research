package androidx.camera.camera2.pipe;

import h.g.b.o;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class Converge3ABehavior {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int AFTER_CURRENT_SCAN = 1;
    private static final int AFTER_NEW_SCAN = 2;

    private /* synthetic */ Converge3ABehavior(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ Converge3ABehavior m620boximpl(int i2) {
        return new Converge3ABehavior(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m622equalsimpl(int i2, Object obj) {
        return (obj instanceof Converge3ABehavior) && i2 == ((Converge3ABehavior) obj).m626unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m623equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m625toStringimpl(int i2) {
        return a.a(i2, "Converge3ABehavior(value=", ")");
    }

    public boolean equals(Object obj) {
        return m622equalsimpl(this.value, obj);
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m625toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m626unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAFTER_CURRENT_SCAN-Dbbx7gI, reason: not valid java name */
        public final int m627getAFTER_CURRENT_SCANDbbx7gI() {
            return Converge3ABehavior.AFTER_CURRENT_SCAN;
        }

        /* renamed from: getAFTER_NEW_SCAN-Dbbx7gI, reason: not valid java name */
        public final int m628getAFTER_NEW_SCANDbbx7gI() {
            return Converge3ABehavior.AFTER_NEW_SCAN;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static int m621constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m624hashCodeimpl(int i2) {
        return i2;
    }
}
