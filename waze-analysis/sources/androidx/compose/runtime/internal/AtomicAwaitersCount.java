package androidx.compose.runtime.internal;

import h.ab;
import h.g.a;
import h.g.a.l;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
final class AtomicAwaitersCount {
    private static final int COUNT_BITS = 27;
    public static final Companion Companion = new Companion(null);
    private static final int VERSION_BITS = 4;
    private final AtomicInt value;

    private /* synthetic */ AtomicAwaitersCount(AtomicInt atomicInt) {
        this.value = atomicInt;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AtomicAwaitersCount m7562boximpl(AtomicInt atomicInt) {
        return new AtomicAwaitersCount(atomicInt);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static AtomicInt m7563constructorimpl() {
        return new AtomicInt(0);
    }

    /* renamed from: decrementCount-impl, reason: not valid java name */
    public static final void m7565decrementCountimpl(AtomicInt atomicInt, int i2) {
        int i3;
        do {
            i3 = atomicInt.get();
        } while (!atomicInt.compareAndSet(i3, ((i3 >>> 27) & 15) == i2 ? i3 - 1 : i3));
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7566equalsimpl(AtomicInt atomicInt, Object obj) {
        return (obj instanceof AtomicAwaitersCount) && x.n(atomicInt, ((AtomicAwaitersCount) obj).m7577unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7567equalsimpl0(AtomicInt atomicInt, AtomicInt atomicInt2) {
        return x.n(atomicInt, atomicInt2);
    }

    /* renamed from: getCount-impl, reason: not valid java name */
    private static final int m7568getCountimpl(AtomicInt atomicInt, int i2) {
        return 134217727 & i2;
    }

    /* renamed from: getVersion-impl, reason: not valid java name */
    private static final int m7569getVersionimpl(AtomicInt atomicInt, int i2) {
        return (i2 >>> 27) & 15;
    }

    /* renamed from: hasAwaiters-impl, reason: not valid java name */
    public static final boolean m7570hasAwaitersimpl(AtomicInt atomicInt) {
        return (atomicInt.get() & 134217727) > 0;
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7571hashCodeimpl(AtomicInt atomicInt) {
        return atomicInt.hashCode();
    }

    /* renamed from: incrementCountAndGetVersion-impl, reason: not valid java name */
    public static final int m7572incrementCountAndGetVersionimpl(AtomicInt atomicInt, h.g.a.a<ab> aVar) {
        int i2;
        int i3;
        do {
            i2 = atomicInt.get();
            i3 = i2 + 1;
        } while (!atomicInt.compareAndSet(i2, i3));
        if ((134217727 & i3) == 1) {
            aVar.invoke();
        }
        return (i3 >>> 27) & 15;
    }

    /* renamed from: incrementVersionAndResetCount-impl, reason: not valid java name */
    public static final void m7573incrementVersionAndResetCountimpl(AtomicInt atomicInt) {
        int i2;
        do {
            i2 = atomicInt.get();
        } while (!atomicInt.compareAndSet(i2, m7574packimpl(atomicInt, ((i2 >>> 27) & 15) + 1, 0)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: pack-impl, reason: not valid java name */
    public static final int m7574packimpl(AtomicInt atomicInt, int i2, int i3) {
        return ((i2 & 15) << 27) | (134217727 & i3);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7575toStringimpl(AtomicInt atomicInt) {
        int i2 = atomicInt.get();
        return "AtomicAwaitersCount(version = " + ((i2 >>> 27) & 15) + ", count = " + (i2 & 134217727) + ')';
    }

    /* renamed from: update-impl, reason: not valid java name */
    private static final int m7576updateimpl(AtomicInt atomicInt, l<? super Integer, Integer> lVar) {
        int i2;
        int iIntValue;
        do {
            i2 = atomicInt.get();
            iIntValue = lVar.invoke(Integer.valueOf(i2)).intValue();
        } while (!atomicInt.compareAndSet(i2, iIntValue));
        return iIntValue;
    }

    public boolean equals(Object obj) {
        return m7566equalsimpl(this.value, obj);
    }

    public int hashCode() {
        return m7571hashCodeimpl(this.value);
    }

    public String toString() {
        return m7575toStringimpl(this.value);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ AtomicInt m7577unboximpl() {
        return this.value;
    }

    /* compiled from: WazeSource */
    public final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(o oVar) {
            this();
        }
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    private static AtomicInt m7564constructorimpl(AtomicInt atomicInt) {
        return atomicInt;
    }
}
