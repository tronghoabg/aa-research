package j$.util;

import java.util.RandomAccess;

/* renamed from: j$.util.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2914i extends C2912g implements RandomAccess {
    private static final long serialVersionUID = 1530674583602358482L;

    @Override // j$.util.C2912g, java.util.List
    public final java.util.List subList(int i5, int i10) {
        C2914i c2914i;
        synchronized (this.f37873b) {
            c2914i = new C2914i(this.f37898c.subList(i5, i10), this.f37873b);
        }
        return c2914i;
    }

    private Object writeReplace() {
        return new C2912g(this.f37898c);
    }
}
