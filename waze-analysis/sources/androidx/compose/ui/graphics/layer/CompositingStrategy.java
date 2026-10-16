package androidx.compose.ui.graphics.layer;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class CompositingStrategy {
    private final int value;
    public static final Companion Companion = new Companion(null);
    private static final int Auto = 0;
    private static final int Offscreen = 1;
    private static final int ModulateAlpha = 2;

    private /* synthetic */ CompositingStrategy(int i2) {
        this.value = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ CompositingStrategy m8912boximpl(int i2) {
        return new CompositingStrategy(i2);
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m8914equalsimpl(int i2, Object obj) {
        return (obj instanceof CompositingStrategy) && i2 == ((CompositingStrategy) obj).m8918unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m8915equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m8917toStringimpl(int i2) {
        return "CompositingStrategy(value=" + i2 + ')';
    }

    public boolean equals(Object obj) {
        return m8914equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return this.value;
    }

    public String toString() {
        return m8917toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m8918unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getAuto-ke2Ky5w, reason: not valid java name */
        public final int m8919getAutoke2Ky5w() {
            return CompositingStrategy.Auto;
        }

        /* renamed from: getModulateAlpha-ke2Ky5w, reason: not valid java name */
        public final int m8920getModulateAlphake2Ky5w() {
            return CompositingStrategy.ModulateAlpha;
        }

        /* renamed from: getOffscreen-ke2Ky5w, reason: not valid java name */
        public final int m8921getOffscreenke2Ky5w() {
            return CompositingStrategy.Offscreen;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m8913constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m8916hashCodeimpl(int i2) {
        return i2;
    }
}
