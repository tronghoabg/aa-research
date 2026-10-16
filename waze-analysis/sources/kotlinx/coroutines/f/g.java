package kotlinx.coroutines.f;

import java.util.concurrent.Executor;
import kotlinx.coroutines.bh;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public class g extends bh {

    /* renamed from: b, reason: collision with root package name */
    private final String f51962b;

    /* renamed from: c, reason: collision with root package name */
    private final c f51963c;

    public g(int i2, int i3, long j2, String str) {
        this.f51962b = str;
        this.f51963c = new c(i2, i3, j2, str);
    }

    @Override // kotlinx.coroutines.bh
    public final Executor a() {
        return this.f51963c;
    }

    public final void b(Runnable runnable, boolean z) {
        this.f51963c.b(runnable, true, z);
    }

    public void close() {
        this.f51963c.close();
    }

    @Override // kotlinx.coroutines.ab
    public final void dispatch(h.c.j jVar, Runnable runnable) {
        c.f(this.f51963c, runnable, false, 6);
    }

    @Override // kotlinx.coroutines.ab
    public final void dispatchYield(h.c.j jVar, Runnable runnable) {
        c.f(this.f51963c, runnable, true, 2);
    }
}
