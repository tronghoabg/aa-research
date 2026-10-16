package e.a.d;

import java.util.concurrent.Future;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ii {

    /* renamed from: a, reason: collision with root package name */
    final Object f47152a;

    /* renamed from: b, reason: collision with root package name */
    Future f47153b;

    /* renamed from: c, reason: collision with root package name */
    boolean f47154c;

    ii(Object obj) {
        this.f47152a = obj;
    }

    final Future a() {
        this.f47154c = true;
        return this.f47153b;
    }

    final void b(Future future) {
        boolean z;
        synchronized (this.f47152a) {
            z = this.f47154c;
            if (!z) {
                this.f47153b = future;
            }
        }
        if (z) {
            future.cancel(false);
        }
    }
}
