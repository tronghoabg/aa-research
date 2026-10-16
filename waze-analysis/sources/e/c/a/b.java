package e.c.a;

import e.a.e.f;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class b implements c {

    /* renamed from: a, reason: collision with root package name */
    volatile boolean f47869a;

    public final void a() {
        if (this.f47869a) {
            return;
        }
        synchronized (this) {
            if (this.f47869a) {
                return;
            }
            this.f47869a = true;
        }
    }

    public final void b(c cVar) {
        f.c(cVar, "disposables is null");
        if (this.f47869a) {
            return;
        }
        synchronized (this) {
            if (this.f47869a) {
            }
        }
    }
}
