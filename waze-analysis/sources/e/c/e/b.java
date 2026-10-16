package e.c.e;

import java.util.concurrent.Callable;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class b implements Callable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ int f47915a;

    b(int i2) {
        this.f47915a = i2;
    }

    @Override // java.util.concurrent.Callable
    public final /* synthetic */ Object call() {
        int i2 = this.f47915a;
        return i2 != 0 ? i2 != 1 ? i2 != 2 ? e.f47918a : d.f47917a : a.f47914a : c.f47916a;
    }
}
