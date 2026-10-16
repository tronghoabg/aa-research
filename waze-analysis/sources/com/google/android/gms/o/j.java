package com.google.android.gms.o;

import java.util.concurrent.Executor;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class j implements u {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f5763a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f5764b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ int f5765c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f5766d;

    public j(Executor executor, Object obj, int i2) {
        this.f5765c = i2;
        this.f5763a = executor;
        this.f5766d = obj;
    }

    @Override // com.google.android.gms.o.u
    public final void c(t tVar) {
        int i2 = this.f5765c;
        if (i2 == 0) {
            synchronized (this.f5764b) {
            }
            this.f5763a.execute(new i(this, tVar));
            return;
        }
        if (i2 == 1) {
            if (tVar.i()) {
                synchronized (this.f5764b) {
                }
                this.f5763a.execute(new g(this));
                return;
            }
            return;
        }
        if (i2 != 2) {
            if (tVar.k()) {
                synchronized (this.f5764b) {
                }
                this.f5763a.execute(new n(this, tVar));
                return;
            }
            return;
        }
        if (tVar.k() || tVar.i()) {
            return;
        }
        synchronized (this.f5764b) {
        }
        this.f5763a.execute(new l(this, tVar));
    }
}
