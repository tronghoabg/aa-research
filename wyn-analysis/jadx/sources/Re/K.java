package Re;

import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class K extends I {

    /* renamed from: m, reason: collision with root package name */
    public final He.f f10667m;

    public K(He.f fVar, He.l lVar, int i5) {
        super(lVar, i5);
        this.f10667m = fVar;
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
                    this.f10667m.e(this);
                    return;
                }
                if (iC == 2) {
                    this.f10663j = 2;
                    this.f10659f = eVar;
                    this.f10667m.e(this);
                    bVar.request(this.f10655b);
                    return;
                }
            }
            this.f10659f = new Ve.a(this.f10655b);
            this.f10667m.e(this);
            bVar.request(this.f10655b);
        }
    }

    @Override // Re.I
    public final void g() {
        He.f fVar = this.f10667m;
        Oe.h hVar = this.f10659f;
        long j8 = this.k;
        int iAddAndGet = 1;
        while (true) {
            long jAddAndGet = this.f10657d.get();
            while (j8 != jAddAndGet) {
                boolean z2 = this.f10661h;
                try {
                    Object objPoll = hVar.poll();
                    boolean z10 = objPoll == null;
                    if (f(z2, z10, fVar)) {
                        return;
                    }
                    if (z10) {
                        break;
                    }
                    fVar.b(objPoll);
                    j8++;
                    if (j8 == this.f10656c) {
                        if (jAddAndGet != Long.MAX_VALUE) {
                            jAddAndGet = this.f10657d.addAndGet(-j8);
                        }
                        this.f10658e.request(j8);
                        j8 = 0;
                    }
                } catch (Throwable th) {
                    AbstractC3772b.U(th);
                    this.f10658e.cancel();
                    hVar.clear();
                    fVar.onError(th);
                    this.f10654a.dispose();
                    return;
                }
            }
            if (j8 == jAddAndGet && f(this.f10661h, hVar.isEmpty(), fVar)) {
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

    @Override // Re.I
    public final void h() {
        int iAddAndGet = 1;
        while (!this.f10660g) {
            boolean z2 = this.f10661h;
            this.f10667m.b(null);
            if (z2) {
                Throwable th = this.f10662i;
                if (th != null) {
                    this.f10667m.onError(th);
                } else {
                    this.f10667m.onComplete();
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
        He.f fVar = this.f10667m;
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
                        fVar.onComplete();
                        this.f10654a.dispose();
                        return;
                    } else {
                        fVar.b(objPoll);
                        j8++;
                    }
                } catch (Throwable th) {
                    AbstractC3772b.U(th);
                    this.f10658e.cancel();
                    fVar.onError(th);
                    this.f10654a.dispose();
                    return;
                }
            }
            if (this.f10660g) {
                return;
            }
            if (hVar.isEmpty()) {
                fVar.onComplete();
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
            long j8 = this.k + 1;
            if (j8 == this.f10656c) {
                this.k = 0L;
                this.f10658e.request(j8);
                return objPoll;
            }
            this.k = j8;
        }
        return objPoll;
    }
}
