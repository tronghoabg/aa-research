package androidx.compose.runtime.internal;

import h.g.a;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
@a
/* loaded from: classes.dex */
public final class AtomicBoolean {
    private final AtomicInt wrapped;

    private /* synthetic */ AtomicBoolean(AtomicInt atomicInt) {
        this.wrapped = atomicInt;
    }

    /* renamed from: box-impl, reason: not valid java name */
    public static final /* synthetic */ AtomicBoolean m7578boximpl(AtomicInt atomicInt) {
        return new AtomicBoolean(atomicInt);
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static AtomicInt m7580constructorimpl(boolean z) {
        return new AtomicInt(z ? 1 : 0);
    }

    /* renamed from: constructor-impl$default, reason: not valid java name */
    public static /* synthetic */ AtomicInt m7581constructorimpl$default(AtomicInt atomicInt, int i2, o oVar) {
        return (i2 & 1) != 0 ? new AtomicInt(0) : atomicInt;
    }

    /* renamed from: equals-impl, reason: not valid java name */
    public static boolean m7582equalsimpl(AtomicInt atomicInt, Object obj) {
        return (obj instanceof AtomicBoolean) && x.n(atomicInt, ((AtomicBoolean) obj).m7589unboximpl());
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m7583equalsimpl0(AtomicInt atomicInt, AtomicInt atomicInt2) {
        return x.n(atomicInt, atomicInt2);
    }

    /* renamed from: get-impl, reason: not valid java name */
    public static final boolean m7584getimpl(AtomicInt atomicInt) {
        return atomicInt.get() != 0;
    }

    /* renamed from: getAndSet-impl, reason: not valid java name */
    public static final boolean m7585getAndSetimpl(AtomicInt atomicInt, boolean z) {
        return atomicInt.compareAndSet(1, z ? 1 : 0);
    }

    /* renamed from: hashCode-impl, reason: not valid java name */
    public static int m7586hashCodeimpl(AtomicInt atomicInt) {
        return atomicInt.hashCode();
    }

    /* renamed from: set-impl, reason: not valid java name */
    public static final void m7587setimpl(AtomicInt atomicInt, boolean z) {
        atomicInt.set(z ? 1 : 0);
    }

    /* renamed from: toString-impl, reason: not valid java name */
    public static String m7588toStringimpl(AtomicInt atomicInt) {
        return "AtomicBoolean(wrapped=" + atomicInt + ')';
    }

    public boolean equals(Object obj) {
        return m7582equalsimpl(this.wrapped, obj);
    }

    public int hashCode() {
        return m7586hashCodeimpl(this.wrapped);
    }

    public String toString() {
        return m7588toStringimpl(this.wrapped);
    }

    /* renamed from: unbox-impl, reason: not valid java name */
    public final /* synthetic */ AtomicInt m7589unboximpl() {
        return this.wrapped;
    }

    /* renamed from: constructor-impl, reason: not valid java name */
    public static AtomicInt m7579constructorimpl(AtomicInt atomicInt) {
        return atomicInt;
    }
}
