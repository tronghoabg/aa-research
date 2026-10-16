package Te;

import J9.U;
import java.util.concurrent.atomic.AtomicInteger;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class k extends AtomicInteger implements Je.b, He.j {

    /* renamed from: a, reason: collision with root package name */
    public final He.b f11878a;

    /* renamed from: c, reason: collision with root package name */
    public final U f11880c;

    /* renamed from: e, reason: collision with root package name */
    public Je.b f11882e;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f11883f;

    /* renamed from: b, reason: collision with root package name */
    public final Ze.b f11879b = new Ze.b();

    /* renamed from: d, reason: collision with root package name */
    public final Je.a f11881d = new Je.a(0);

    public k(He.b bVar, U u10) {
        this.f11878a = bVar;
        this.f11880c = u10;
        lazySet(1);
    }

    @Override // He.j
    public final void a(Je.b bVar) {
        if (Me.a.f(this.f11882e, bVar)) {
            this.f11882e = bVar;
            this.f11878a.a(this);
        }
    }

    @Override // He.j
    public final void b(Object obj) {
        try {
            He.a aVar = (He.a) this.f11880c.apply(obj);
            getAndIncrement();
            Se.c cVar = new Se.c(this, 3);
            if (this.f11883f || !this.f11881d.a(cVar)) {
                return;
            }
            aVar.d(cVar);
        } catch (Throwable th) {
            AbstractC3772b.U(th);
            this.f11882e.dispose();
            onError(th);
        }
    }

    @Override // Je.b
    public final void dispose() {
        this.f11883f = true;
        this.f11882e.dispose();
        this.f11881d.dispose();
    }

    @Override // He.j
    public final void onComplete() {
        if (decrementAndGet() == 0) {
            Ze.b bVar = this.f11879b;
            bVar.getClass();
            Throwable thB = Ze.d.b(bVar);
            He.b bVar2 = this.f11878a;
            if (thB != null) {
                bVar2.onError(thB);
            } else {
                bVar2.onComplete();
            }
        }
    }

    @Override // He.j
    public final void onError(Throwable th) {
        Ze.b bVar = this.f11879b;
        bVar.getClass();
        if (!Ze.d.a(bVar, th)) {
            S3.f.A(th);
            return;
        }
        dispose();
        if (getAndSet(0) > 0) {
            this.f11878a.onError(Ze.d.b(bVar));
        }
    }
}
