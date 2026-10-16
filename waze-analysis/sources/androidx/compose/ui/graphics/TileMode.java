package androidx.compose.ui.graphics;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class TileMode {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Clamp = 0;
    private static final int Repeated = 1;
    private static final int Mirror = 2;
    private static final int Decal = 3;

    private /* synthetic */ TileMode(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ TileMode m8646boximpl(int i2) {
        return new TileMode(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8648equalsimpl(int i2, Object obj) {
        return (obj instanceof TileMode) && i2 == ((TileMode) obj).m8652unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8649equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8651toStringimpl(int i2) {
        return m8649equalsimpl0(i2, Clamp) ? "Clamp" : m8649equalsimpl0(i2, Repeated) ? "Repeated" : m8649equalsimpl0(i2, Mirror) ? "Mirror" : m8649equalsimpl0(i2, Decal) ? "Decal" : "Unknown";
    }

    public boolean equals(Object obj) {
        return m8648equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m8651toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8652unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getClamp-3opZhB0, reason: not valid java name */
        public final int m8653getClamp3opZhB0() {
            return TileMode.Clamp;
        }

        /* renamed from: getDecal-3opZhB0, reason: not valid java name */
        public final int m8654getDecal3opZhB0() {
            return TileMode.Decal;
        }

        /* renamed from: getMirror-3opZhB0, reason: not valid java name */
        public final int m8655getMirror3opZhB0() {
            return TileMode.Mirror;
        }

        /* renamed from: getRepeated-3opZhB0, reason: not valid java name */
        public final int m8656getRepeated3opZhB0() {
            return TileMode.Repeated;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8647constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8650hashCodeimpl(int i2) {
        return i2;
    }
}
