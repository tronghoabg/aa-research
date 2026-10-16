package Te;

import J9.U;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class j extends Pe.a implements He.j {

    /* renamed from: a, reason: collision with root package name */
    public final He.j f11872a;

    /* renamed from: c, reason: collision with root package name */
    public final U f11874c;

    /* renamed from: e, reason: collision with root package name */
    public Je.b f11876e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f11877f;

    /* renamed from: b, reason: collision with root package name */
    public final Ze.b f11873b = new Ze.b();

    /* renamed from: d, reason: collision with root package name */
    public final Je.a f11875d = new Je.a(0);

    public j(He.j jVar, U u10) {
        this.f11872a = jVar;
        this.f11874c = u10;
        lazySet(1);
    }

    @Override // He.j
    public final void a(Je.b bVar) {
        if (Me.a.f(this.f11876e, bVar)) {
            this.f11876e = bVar;
            this.f11872a.a(this);
        }
    }

    @Override // He.j
    public final void b(Object obj) {
        try {
            He.a aVar = (He.a) this.f11874c.apply(obj);
            getAndIncrement();
            Se.c cVar = new Se.c(this, 2);
            if (this.f11877f || !this.f11875d.a(cVar)) {
                return;
            }
            aVar.d(cVar);
        } catch (Throwable th) {
            AbstractC3772b.U(th);
            this.f11876e.dispose();
            onError(th);
        }
    }

    @Override // Oe.d
    public final int c(int i5) {
        return 2;
    }

    @Override // Je.b
    public final void dispose() {
        this.f11877f = true;
        this.f11876e.dispose();
        this.f11875d.dispose();
    }

    @Override // Oe.h
    public final boolean isEmpty() {
        return true;
    }

    @Override // He.j
    public final void onComplete() {
        if (decrementAndGet() == 0) {
            Ze.b bVar = this.f11873b;
            bVar.getClass();
            Throwable thB = Ze.d.b(bVar);
            He.j jVar = this.f11872a;
            if (thB != null) {
                jVar.onError(thB);
            } else {
                jVar.onComplete();
            }
        }
    }

    @Override // He.j
    public final void onError(Throwable th) {
        Ze.b bVar = this.f11873b;
        bVar.getClass();
        if (!Ze.d.a(bVar, th)) {
            S3.f.A(th);
            return;
        }
        dispose();
        if (getAndSet(0) > 0) {
            this.f11872a.onError(Ze.d.b(bVar));
        }
    }

    @Override // Oe.h
    public final Object poll() {
        return null;
    }

    @Override // Oe.h
    public final void clear() {
    }
}
