package Re;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes5.dex */
public final class y extends AtomicReference implements He.f, Je.b {

    /* renamed from: a, reason: collision with root package name */
    public final long f10770a;

    /* renamed from: b, reason: collision with root package name */
    public final z f10771b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10772c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10773d;

    /* renamed from: e, reason: collision with root package name */
    public volatile boolean f10774e;

    /* renamed from: f, reason: collision with root package name */
    public volatile Oe.h f10775f;

    /* renamed from: g, reason: collision with root package name */
    public long f10776g;

    /* renamed from: h, reason: collision with root package name */
    public int f10777h;

    public y(z zVar, long j8) {
        this.f10770a = j8;
        this.f10771b = zVar;
        int i5 = zVar.f10783d;
        this.f10773d = i5;
        this.f10772c = i5 >> 2;
    }

    public final void a(long j8) {
        if (this.f10777h != 1) {
            long j10 = this.f10776g + j8;
            if (j10 < this.f10772c) {
                this.f10776g = j10;
            } else {
                this.f10776g = 0L;
                ((ug.b) get()).request(j10);
            }
        }
    }

    @Override // He.f
    public final void b(Object obj) {
        if (this.f10777h == 2) {
            this.f10771b.c();
            return;
        }
        z zVar = this.f10771b;
        if (zVar.get() == 0 && zVar.compareAndSet(0, 1)) {
            long j8 = zVar.f10789j.get();
            Oe.h aVar = this.f10775f;
            if (j8 == 0 || !(aVar == null || aVar.isEmpty())) {
                if (aVar == null && (aVar = this.f10775f) == null) {
                    aVar = new Ve.a(zVar.f10783d);
                    this.f10775f = aVar;
                }
                if (!aVar.offer(obj)) {
                    zVar.onError(new Ke.c("Inner queue full?!"));
                    return;
                }
            } else {
                zVar.f10780a.b(obj);
                if (j8 != Long.MAX_VALUE) {
                    zVar.f10789j.decrementAndGet();
                }
                a(1L);
            }
            if (zVar.decrementAndGet() == 0) {
                return;
            }
        } else {
            Oe.h aVar2 = this.f10775f;
            if (aVar2 == null) {
                aVar2 = new Ve.a(zVar.f10783d);
                this.f10775f = aVar2;
            }
            if (!aVar2.offer(obj)) {
                zVar.onError(new Ke.c("Inner queue full?!"));
                return;
            } else if (zVar.getAndIncrement() != 0) {
                return;
            }
        }
        zVar.f();
    }

    @Override // Je.b
    public final void dispose() {
        Ye.f.a(this);
    }

    @Override // He.f
    public final void e(ug.b bVar) {
        if (Ye.f.b(this, bVar)) {
            if (bVar instanceof Oe.e) {
                Oe.e eVar = (Oe.e) bVar;
                int iC = eVar.c(7);
                if (iC == 1) {
                    this.f10777h = iC;
                    this.f10775f = eVar;
                    this.f10774e = true;
                    this.f10771b.c();
                    return;
                }
                if (iC == 2) {
                    this.f10777h = iC;
                    this.f10775f = eVar;
                }
            }
            bVar.request(this.f10773d);
        }
    }

    @Override // He.f
    public final void onComplete() {
        this.f10774e = true;
        this.f10771b.c();
    }

    @Override // He.f
    public final void onError(Throwable th) {
        lazySet(Ye.f.f16797a);
        z zVar = this.f10771b;
        Ze.b bVar = zVar.f10786g;
        bVar.getClass();
        if (!Ze.d.a(bVar, th)) {
            S3.f.A(th);
            return;
        }
        this.f10774e = true;
        zVar.k.cancel();
        for (y yVar : (y[]) zVar.f10788i.getAndSet(z.f10779r)) {
            yVar.getClass();
            Ye.f.a(yVar);
        }
        zVar.c();
    }
}
