package X;

import N.C0720e;

/* loaded from: classes.dex */
public abstract class z implements y {

    /* renamed from: a, reason: collision with root package name */
    public final C0720e f15775a = new C0720e(0);

    @Override // X.y
    public /* synthetic */ A f(A a5, A a10, A a11) {
        return null;
    }

    public final boolean g(int i5) {
        return (i5 & this.f15775a.get()) != 0;
    }

    public final void h(int i5) {
        C0720e c0720e;
        int i10;
        do {
            c0720e = this.f15775a;
            i10 = c0720e.get();
            if ((i10 & i5) != 0) {
                return;
            }
        } while (!c0720e.compareAndSet(i10, i10 | i5));
    }
}
