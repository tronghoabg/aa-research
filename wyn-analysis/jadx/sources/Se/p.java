package Se;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class p extends AtomicReference implements He.h, Je.b, Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final He.h f11093a;

    /* renamed from: b, reason: collision with root package name */
    public final He.m f11094b;

    /* renamed from: c, reason: collision with root package name */
    public Object f11095c;

    /* renamed from: d, reason: collision with root package name */
    public Throwable f11096d;

    public p(He.h hVar, He.m mVar) {
        this.f11093a = hVar;
        this.f11094b = mVar;
    }

    @Override // He.h
    public final void a(Je.b bVar) {
        if (Me.a.e(this, bVar)) {
            this.f11093a.a(this);
        }
    }

    @Override // Je.b
    public final void dispose() {
        Me.a.a(this);
    }

    @Override // He.h
    public final void onComplete() {
        Me.a.c(this, this.f11094b.b(this));
    }

    @Override // He.h
    public final void onError(Throwable th) {
        this.f11096d = th;
        Me.a.c(this, this.f11094b.b(this));
    }

    @Override // He.h
    public final void onSuccess(Object obj) {
        this.f11095c = obj;
        Me.a.c(this, this.f11094b.b(this));
    }

    @Override // java.lang.Runnable
    public final void run() {
        Throwable th = this.f11096d;
        He.h hVar = this.f11093a;
        if (th != null) {
            this.f11096d = null;
            hVar.onError(th);
            return;
        }
        Object obj = this.f11095c;
        if (obj == null) {
            hVar.onComplete();
        } else {
            this.f11095c = null;
            hVar.onSuccess(obj);
        }
    }
}
