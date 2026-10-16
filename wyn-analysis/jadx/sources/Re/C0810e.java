package Re;

import A7.AbstractC0279p0;
import Cd.s0;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: Re.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0810e extends AtomicInteger implements He.f, ug.b {

    /* renamed from: a, reason: collision with root package name */
    public ug.b f10718a;

    /* renamed from: b, reason: collision with root package name */
    public long f10719b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicReference f10720c = new AtomicReference();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicLong f10721d = new AtomicLong();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f10722e = new AtomicLong();

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f10723f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f10724g;

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC0807b f10725h;

    /* renamed from: i, reason: collision with root package name */
    public long f10726i;

    public C0810e(AbstractC0807b abstractC0807b) {
        this.f10725h = abstractC0807b;
    }

    public final void a() {
        if (getAndIncrement() != 0) {
            return;
        }
        c();
    }

    @Override // He.f
    public final void b(Object obj) {
        this.f10726i++;
        this.f10725h.c(obj);
    }

    public final void c() {
        int iAddAndGet = 1;
        long jH = 0;
        ug.b bVar = null;
        do {
            ug.b bVar2 = (ug.b) this.f10720c.get();
            if (bVar2 != null) {
                bVar2 = (ug.b) this.f10720c.getAndSet(null);
            }
            long andSet = this.f10721d.get();
            if (andSet != 0) {
                andSet = this.f10721d.getAndSet(0L);
            }
            long andSet2 = this.f10722e.get();
            if (andSet2 != 0) {
                andSet2 = this.f10722e.getAndSet(0L);
            }
            ug.b bVar3 = this.f10718a;
            if (this.f10723f) {
                if (bVar3 != null) {
                    bVar3.cancel();
                    this.f10718a = null;
                }
                if (bVar2 != null) {
                    bVar2.cancel();
                }
            } else {
                long jH2 = this.f10719b;
                if (jH2 != Long.MAX_VALUE) {
                    jH2 = Fe.e.h(jH2, andSet);
                    if (jH2 != Long.MAX_VALUE) {
                        jH2 -= andSet2;
                        if (jH2 < 0) {
                            S3.f.A(new s0(AbstractC0279p0.k(jH2, "More produced than requested: "), 6));
                            jH2 = 0;
                        }
                    }
                    this.f10719b = jH2;
                }
                if (bVar2 != null) {
                    if (bVar3 != null) {
                        bVar3.cancel();
                    }
                    this.f10718a = bVar2;
                    if (jH2 != 0) {
                        jH = Fe.e.h(jH, jH2);
                        bVar = bVar2;
                    }
                } else if (bVar3 != null && andSet != 0) {
                    jH = Fe.e.h(jH, andSet);
                    bVar = bVar3;
                }
            }
            iAddAndGet = addAndGet(-iAddAndGet);
        } while (iAddAndGet != 0);
        if (jH != 0) {
            bVar.request(jH);
        }
    }

    @Override // ug.b
    public final void cancel() {
        if (this.f10723f) {
            return;
        }
        this.f10723f = true;
        a();
    }

    @Override // He.f
    public final void e(ug.b bVar) {
        g(bVar);
    }

    public final void f(long j8) {
        if (this.f10724g) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            Fe.e.f(this.f10722e, j8);
            a();
            return;
        }
        long j10 = this.f10719b;
        if (j10 != Long.MAX_VALUE) {
            long j11 = j10 - j8;
            if (j11 < 0) {
                S3.f.A(new s0(AbstractC0279p0.k(j11, "More produced than requested: "), 6));
                j11 = 0;
            }
            this.f10719b = j11;
        }
        if (decrementAndGet() == 0) {
            return;
        }
        c();
    }

    public final void g(ug.b bVar) {
        if (this.f10723f) {
            bVar.cancel();
            return;
        }
        Ne.b.a(bVar, "s is null");
        if (get() != 0 || !compareAndSet(0, 1)) {
            ug.b bVar2 = (ug.b) this.f10720c.getAndSet(bVar);
            if (bVar2 != null) {
                bVar2.cancel();
            }
            a();
            return;
        }
        ug.b bVar3 = this.f10718a;
        if (bVar3 != null) {
            bVar3.cancel();
        }
        this.f10718a = bVar;
        long j8 = this.f10719b;
        if (decrementAndGet() != 0) {
            c();
        }
        if (j8 != 0) {
            bVar.request(j8);
        }
    }

    @Override // He.f
    public final void onComplete() {
        long j8 = this.f10726i;
        if (j8 != 0) {
            this.f10726i = 0L;
            f(j8);
        }
        AbstractC0807b abstractC0807b = this.f10725h;
        abstractC0807b.k = false;
        abstractC0807b.f();
    }

    @Override // He.f
    public final void onError(Throwable th) {
        long j8 = this.f10726i;
        if (j8 != 0) {
            this.f10726i = 0L;
            f(j8);
        }
        this.f10725h.a(th);
    }

    @Override // ug.b
    public final void request(long j8) {
        if (!Ye.f.c(j8) || this.f10724g) {
            return;
        }
        if (get() != 0 || !compareAndSet(0, 1)) {
            Fe.e.f(this.f10721d, j8);
            a();
            return;
        }
        long j10 = this.f10719b;
        if (j10 != Long.MAX_VALUE) {
            long jH = Fe.e.h(j10, j8);
            this.f10719b = jH;
            if (jH == Long.MAX_VALUE) {
                this.f10724g = true;
            }
        }
        ug.b bVar = this.f10718a;
        if (decrementAndGet() != 0) {
            c();
        }
        if (bVar != null) {
            bVar.request(j8);
        }
    }
}
