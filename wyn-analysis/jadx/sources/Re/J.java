package Re;

import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class J extends I {

    /* renamed from: m, reason: collision with root package name */
    public final Oe.a f10665m;

    /* renamed from: n, reason: collision with root package name */
    public long f10666n;

    public J(Oe.a aVar, He.l lVar, int i5) {
        super(lVar, i5);
        this.f10665m = aVar;
    }

    @Override // He.f
    public final void e(ug.b bVar) {
        if (Ye.f.d(this.f10658e, bVar)) {
            this.f10658e = bVar;
            if (bVar instanceof Oe.e) {
                Oe.e eVar = (Oe.e) bVar;
                int iC = eVar.c(7);
                if (iC == 1) {
                    this.f10663j = 1;
                    this.f10659f = eVar;
                    this.f10661h = true;
                    this.f10665m.e(this);
                    return;
                }
                if (iC == 2) {
                    this.f10663j = 2;
                    this.f10659f = eVar;
                    this.f10665m.e(this);
                    bVar.request(this.f10655b);
                    return;
                }
            }
            this.f10659f = new Ve.a(this.f10655b);
            this.f10665m.e(this);
            bVar.request(this.f10655b);
        }
    }

    @Override // Re.I
    public final void g() {
        Oe.a aVar = this.f10665m;
        Oe.h hVar = this.f10659f;
        long j8 = this.k;
        long j10 = this.f10666n;
        int iAddAndGet = 1;
        while (true) {
            long j11 = this.f10657d.get();
            while (j8 != j11) {
                boolean z2 = this.f10661h;
                try {
                    Object objPoll = hVar.poll();
                    boolean z10 = objPoll == null;
                    if (f(z2, z10, aVar)) {
                        return;
                    }
                    if (z10) {
                        break;
                    }
                    if (aVar.d(objPoll)) {
                        j8++;
                    }
                    j10++;
                    if (j10 == this.f10656c) {
                        this.f10658e.request(j10);
                        j10 = 0;
                    }
                } catch (Throwable th) {
                    AbstractC3772b.U(th);
                    this.f10658e.cancel();
                    hVar.clear();
                    aVar.onError(th);
                    this.f10654a.dispose();
                    return;
                }
            }
            if (j8 == j11 && f(this.f10661h, hVar.isEmpty(), aVar)) {
                return;
            }
            int i5 = get();
            if (iAddAndGet == i5) {
                this.k = j8;
                this.f10666n = j10;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i5;
            }
        }
    }

    @Override // Re.I
    public final void h() {
        int iAddAndGet = 1;
        while (!this.f10660g) {
            boolean z2 = this.f10661h;
            this.f10665m.b(null);
            if (z2) {
                Throwable th = this.f10662i;
                if (th != null) {
                    this.f10665m.onError(th);
                } else {
                    this.f10665m.onComplete();
                }
                this.f10654a.dispose();
                return;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // Re.I
    public final void i() {
        Oe.a aVar = this.f10665m;
        Oe.h hVar = this.f10659f;
        long j8 = this.k;
        int iAddAndGet = 1;
        while (true) {
            long j10 = this.f10657d.get();
            while (j8 != j10) {
                try {
                    Object objPoll = hVar.poll();
                    if (this.f10660g) {
                        return;
                    }
                    if (objPoll == null) {
                        aVar.onComplete();
                        this.f10654a.dispose();
                        return;
                    } else if (aVar.d(objPoll)) {
                        j8++;
                    }
                } catch (Throwable th) {
                    AbstractC3772b.U(th);
                    this.f10658e.cancel();
                    aVar.onError(th);
                    this.f10654a.dispose();
                    return;
                }
            }
            if (this.f10660g) {
                return;
            }
            if (hVar.isEmpty()) {
                aVar.onComplete();
                this.f10654a.dispose();
                return;
            }
            int i5 = get();
            if (iAddAndGet == i5) {
                this.k = j8;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i5;
            }
        }
    }

    @Override // Oe.h
    public final Object poll() {
        Object objPoll = this.f10659f.poll();
        if (objPoll != null && this.f10663j != 1) {
            long j8 = this.f10666n + 1;
            if (j8 == this.f10656c) {
                this.f10666n = 0L;
                this.f10658e.request(j8);
                return objPoll;
            }
            this.f10666n = j8;
        }
        return objPoll;
    }
}
