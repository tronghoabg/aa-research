package Re;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import p7.AbstractC3772b;
import za.C4658a;

/* loaded from: classes5.dex */
public final class C extends Ye.a implements He.f {

    /* renamed from: a, reason: collision with root package name */
    public final He.f f10627a;

    /* renamed from: b, reason: collision with root package name */
    public final C4658a f10628b;

    /* renamed from: c, reason: collision with root package name */
    public final int f10629c;

    /* renamed from: d, reason: collision with root package name */
    public final int f10630d;

    /* renamed from: f, reason: collision with root package name */
    public ug.b f10632f;

    /* renamed from: g, reason: collision with root package name */
    public Oe.h f10633g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f10634h;

    /* renamed from: i, reason: collision with root package name */
    public volatile boolean f10635i;
    public Iterator k;

    /* renamed from: l, reason: collision with root package name */
    public int f10637l;

    /* renamed from: m, reason: collision with root package name */
    public int f10638m;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicReference f10636j = new AtomicReference();

    /* renamed from: e, reason: collision with root package name */
    public final AtomicLong f10631e = new AtomicLong();

    public C(He.f fVar, C4658a c4658a, int i5) {
        this.f10627a = fVar;
        this.f10628b = c4658a;
        this.f10629c = i5;
        this.f10630d = i5 - (i5 >> 2);
    }

    @Override // He.f
    public final void b(Object obj) {
        if (this.f10634h) {
            return;
        }
        if (this.f10638m != 0 || this.f10633g.offer(obj)) {
            g();
        } else {
            onError(new Ke.c("Queue is full?!"));
        }
    }

    @Override // Oe.d
    public final int c(int i5) {
        return this.f10638m == 1 ? 1 : 0;
    }

    @Override // ug.b
    public final void cancel() {
        if (this.f10635i) {
            return;
        }
        this.f10635i = true;
        this.f10632f.cancel();
        if (getAndIncrement() == 0) {
            this.f10633g.clear();
        }
    }

    @Override // Oe.h
    public final void clear() {
        this.k = null;
        this.f10633g.clear();
    }

    @Override // He.f
    public final void e(ug.b bVar) {
        if (Ye.f.d(this.f10632f, bVar)) {
            this.f10632f = bVar;
            if (bVar instanceof Oe.e) {
                Oe.e eVar = (Oe.e) bVar;
                int iC = eVar.c(3);
                if (iC == 1) {
                    this.f10638m = iC;
                    this.f10633g = eVar;
                    this.f10634h = true;
                    this.f10627a.e(this);
                    return;
                }
                if (iC == 2) {
                    this.f10638m = iC;
                    this.f10633g = eVar;
                    this.f10627a.e(this);
                    bVar.request(this.f10629c);
                    return;
                }
            }
            this.f10633g = new Ve.a(this.f10629c);
            this.f10627a.e(this);
            bVar.request(this.f10629c);
        }
    }

    public final boolean f(boolean z2, boolean z10, He.f fVar, Oe.h hVar) {
        if (this.f10635i) {
            this.k = null;
            hVar.clear();
            return true;
        }
        if (!z2) {
            return false;
        }
        if (((Throwable) this.f10636j.get()) == null) {
            if (!z10) {
                return false;
            }
            fVar.onComplete();
            return true;
        }
        Throwable thB = Ze.d.b(this.f10636j);
        this.k = null;
        hVar.clear();
        fVar.onError(thB);
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void g() {
        boolean z2;
        long j8;
        if (getAndIncrement() != 0) {
            return;
        }
        He.f fVar = this.f10627a;
        Oe.h hVar = this.f10633g;
        boolean z10 = true;
        Object[] objArr = this.f10638m != 1;
        Iterator it = this.k;
        int iAddAndGet = 1;
        while (true) {
            if (it == null) {
                boolean z11 = this.f10634h;
                try {
                    Object objPoll = hVar.poll();
                    if (f(z11, objPoll == null ? z10 ? 1 : 0 : false, fVar, hVar)) {
                        return;
                    }
                    if (objPoll != null) {
                        try {
                            this.f10628b.getClass();
                            it = ((Iterable) objPoll).iterator();
                            if (it.hasNext()) {
                                this.k = it;
                            } else {
                                if (objArr != false) {
                                    int i5 = this.f10637l + (z10 ? 1 : 0);
                                    if (i5 == this.f10630d) {
                                        this.f10637l = 0;
                                        this.f10632f.request(i5);
                                    } else {
                                        this.f10637l = i5;
                                    }
                                }
                                it = null;
                            }
                        } catch (Throwable th) {
                            AbstractC3772b.U(th);
                            this.f10632f.cancel();
                            Ze.d.a(this.f10636j, th);
                            fVar.onError(Ze.d.b(this.f10636j));
                            return;
                        }
                    }
                } catch (Throwable th2) {
                    AbstractC3772b.U(th2);
                    this.f10632f.cancel();
                    Ze.d.a(this.f10636j, th2);
                    Throwable thB = Ze.d.b(this.f10636j);
                    this.k = null;
                    hVar.clear();
                    fVar.onError(thB);
                    return;
                }
            }
            if (it != null) {
                long j10 = this.f10631e.get();
                long j11 = 0;
                while (true) {
                    if (j11 == j10) {
                        z2 = z10;
                        j8 = 0;
                        break;
                    }
                    if (f(this.f10634h, false, fVar, hVar)) {
                        return;
                    }
                    try {
                        Object next = it.next();
                        z2 = z10;
                        Ne.b.a(next, "The iterator returned a null value");
                        fVar.b(next);
                        if (f(this.f10634h, false, fVar, hVar)) {
                            return;
                        }
                        j11++;
                        try {
                            if (it.hasNext()) {
                                z10 = z2;
                            } else {
                                if (objArr == true) {
                                    int i10 = this.f10637l + 1;
                                    if (i10 == this.f10630d) {
                                        this.f10637l = 0;
                                        j8 = 0;
                                        this.f10632f.request(i10);
                                    } else {
                                        j8 = 0;
                                        this.f10637l = i10;
                                    }
                                } else {
                                    j8 = 0;
                                }
                                this.k = null;
                                it = null;
                            }
                        } catch (Throwable th3) {
                            AbstractC3772b.U(th3);
                            this.k = null;
                            this.f10632f.cancel();
                            Ze.d.a(this.f10636j, th3);
                            fVar.onError(Ze.d.b(this.f10636j));
                            return;
                        }
                    } catch (Throwable th4) {
                        AbstractC3772b.U(th4);
                        this.k = null;
                        this.f10632f.cancel();
                        Ze.d.a(this.f10636j, th4);
                        fVar.onError(Ze.d.b(this.f10636j));
                        return;
                    }
                }
                if (j11 == j10) {
                    if (f(this.f10634h, (hVar.isEmpty() && it == null) ? z2 : false, fVar, hVar)) {
                        return;
                    }
                }
                if (j11 != j8 && j10 != Long.MAX_VALUE) {
                    this.f10631e.addAndGet(-j11);
                }
                if (it != null) {
                }
                z10 = z2;
            } else {
                z2 = z10 ? 1 : 0;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
            z10 = z2;
        }
    }

    @Override // Oe.h
    public final boolean isEmpty() {
        return this.k == null && this.f10633g.isEmpty();
    }

    @Override // He.f
    public final void onComplete() {
        if (this.f10634h) {
            return;
        }
        this.f10634h = true;
        g();
    }

    @Override // He.f
    public final void onError(Throwable th) {
        if (this.f10634h || !Ze.d.a(this.f10636j, th)) {
            S3.f.A(th);
        } else {
            this.f10634h = true;
            g();
        }
    }

    @Override // Oe.h
    public final Object poll() {
        Iterator it = this.k;
        while (true) {
            if (it == null) {
                Object objPoll = this.f10633g.poll();
                if (objPoll != null) {
                    this.f10628b.getClass();
                    it = ((Iterable) objPoll).iterator();
                    if (it.hasNext()) {
                        this.k = it;
                        break;
                    }
                    it = null;
                } else {
                    return null;
                }
            } else {
                break;
            }
        }
        Object next = it.next();
        Ne.b.a(next, "The iterator returned a null value");
        if (!it.hasNext()) {
            this.k = null;
        }
        return next;
    }

    @Override // ug.b
    public final void request(long j8) {
        if (Ye.f.c(j8)) {
            Fe.e.f(this.f10631e, j8);
            g();
        }
    }
}
