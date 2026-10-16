package Te;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class g extends AtomicReference implements He.j {

    /* renamed from: a, reason: collision with root package name */
    public final long f11850a;

    /* renamed from: b, reason: collision with root package name */
    public final h f11851b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f11852c;

    /* renamed from: d, reason: collision with root package name */
    public volatile Oe.h f11853d;

    /* renamed from: e, reason: collision with root package name */
    public int f11854e;

    public g(h hVar, long j8) {
        this.f11850a = j8;
        this.f11851b = hVar;
    }

    @Override // He.j
    public final void a(Je.b bVar) {
        if (Me.a.e(this, bVar) && (bVar instanceof Oe.c)) {
            Oe.c cVar = (Oe.c) bVar;
            int iC = cVar.c(7);
            if (iC == 1) {
                this.f11854e = iC;
                this.f11853d = cVar;
                this.f11852c = true;
                this.f11851b.e();
                return;
            }
            if (iC == 2) {
                this.f11854e = iC;
                this.f11853d = cVar;
            }
        }
    }

    @Override // He.j
    public final void b(Object obj) {
        if (this.f11854e != 0) {
            this.f11851b.e();
            return;
        }
        h hVar = this.f11851b;
        if (hVar.get() == 0 && hVar.compareAndSet(0, 1)) {
            hVar.f11857a.b(obj);
            if (hVar.decrementAndGet() == 0) {
                return;
            }
        } else {
            Oe.h bVar = this.f11853d;
            if (bVar == null) {
                bVar = new Ve.b(hVar.f11860d);
                this.f11853d = bVar;
            }
            bVar.offer(obj);
            if (hVar.getAndIncrement() != 0) {
                return;
            }
        }
        hVar.f();
    }

    @Override // He.j
    public final void onComplete() {
        this.f11852c = true;
        this.f11851b.e();
    }

    @Override // He.j
    public final void onError(Throwable th) {
        Ze.b bVar = this.f11851b.f11863g;
        bVar.getClass();
        if (!Ze.d.a(bVar, th)) {
            S3.f.A(th);
            return;
        }
        h hVar = this.f11851b;
        hVar.getClass();
        hVar.d();
        this.f11852c = true;
        this.f11851b.e();
    }
}
