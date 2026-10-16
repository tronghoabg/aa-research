package androidx.compose.runtime.snapshots;

import h.g.a;
import h.g.b.o;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class ReaderKind {
    public static final Companion Companion = new Companion(null);
    private final int mask;

    private /* synthetic */ ReaderKind(int i2) {
        this.mask = i2;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ ReaderKind m7623boximpl(int i2) {
        return new ReaderKind(i2);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ int m7625constructorimpl$default(int i2, int i3, o oVar) {
        if (1 != (i3 & 1)) {
            return i2;
        }
        return 0;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7626equalsimpl(int i2, Object obj) {
        return (obj instanceof ReaderKind) && i2 == ((ReaderKind) obj).m7632unboximpl();
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7627equalsimpl0(int i2, int i3) {
        return i2 == i3;
    }

    /* renamed from: isReadIn-h_f27i8, reason: not valid java name */
    public static final boolean m7629isReadInh_f27i8(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7630toStringimpl(int i2) {
        return "ReaderKind(mask=" + i2 + ')';
    }

    /* renamed from: withReadIn-3QSx2Dw, reason: not valid java name */
    public static final int m7631withReadIn3QSx2Dw(int i2, int i3) {
        return i2 | i3;
    }

    public boolean equals(Object obj) {
        return m7626equalsimpl(this.mask, obj);
    }

    public final int getMask() {
        return this.mask;
    }

    public int hashCode() {
        return this.mask;
    }

    public String toString() {
        return m7630toStringimpl(this.mask);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ int m7632unboximpl() {
        return this.mask;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        /* renamed from: getComposition-6f8NoZ8, reason: not valid java name */
        public final int m7633getComposition6f8NoZ8() {
            return 1;
        }

        /* renamed from: getSnapshotStateObserver-6f8NoZ8, reason: not valid java name */
        public final int m7634getSnapshotStateObserver6f8NoZ8() {
            return 2;
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static int m7624constructorimpl(int i2) {
        return i2;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7628hashCodeimpl(int i2) {
        return i2;
    }
}
