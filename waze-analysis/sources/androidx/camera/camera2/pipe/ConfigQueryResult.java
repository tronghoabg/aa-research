package androidx.camera.camera2.pipe;

import h.g.b.o;

/* compiled from: WazeSource */
@h.g.a
/* loaded from: classes2.dex */
public final class ConfigQueryResult {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int UNKNOWN = 0;
    private static final int SUPPORTED = 1;
    private static final int UNSUPPORTED = 2;

    private /* synthetic */ ConfigQueryResult(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ConfigQueryResult m596boximpl(int i2) {
        return new ConfigQueryResult(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m598equalsimpl(int i2, Object obj) {
        return (obj instanceof ConfigQueryResult) && i2 == ((ConfigQueryResult) obj).m602unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m599equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m601toStringimpl(int i2) {
        return m599equalsimpl0(i2, SUPPORTED) ? "SUPPORTED" : m599equalsimpl0(i2, UNSUPPORTED) ? "UNSUPPORTED" : "UNKNOWN";
    }

    public boolean equals(Object obj) {
        return m598equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m601toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m602unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getSUPPORTED-Xp6DSB4, reason: not valid java name */
        public final int m603getSUPPORTEDXp6DSB4() {
            return ConfigQueryResult.SUPPORTED;
        }

        /* renamed from: getUNKNOWN-Xp6DSB4, reason: not valid java name */
        public final int m604getUNKNOWNXp6DSB4() {
            return ConfigQueryResult.UNKNOWN;
        }

        /* renamed from: getUNSUPPORTED-Xp6DSB4, reason: not valid java name */
        public final int m605getUNSUPPORTEDXp6DSB4() {
            return ConfigQueryResult.UNSUPPORTED;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m597constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m600hashCodeimpl(int i2) {
        return i2;
    }
}
