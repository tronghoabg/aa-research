package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iel implements defpackage.iep, defpackage.ien {
    public volatile defpackage.ien a;
    public volatile defpackage.ien b;
    private final java.lang.Object c;
    private final defpackage.iep d;
    private defpackage.ieo e;
    private defpackage.ieo f;

    public iel(java.lang.Object obj, defpackage.iep iepVar) {
        defpackage.ieo ieoVar = defpackage.ieo.CLEARED;
        this.e = ieoVar;
        this.f = ieoVar;
        this.c = obj;
        this.d = iepVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [iep] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.iep
    public final defpackage.iep a() {
        ?? A;
        synchronized (this.c) {
            defpackage.iep iepVar = this.d;
            this = this;
            if (iepVar != null) {
                A = iepVar.a();
            }
        }
        return A;
    }

    @Override // defpackage.ien
    public final void b() {
        synchronized (this.c) {
            defpackage.ieo ieoVar = this.e;
            defpackage.ieo ieoVar2 = defpackage.ieo.RUNNING;
            if (ieoVar != ieoVar2) {
                this.e = ieoVar2;
                this.a.b();
            }
        }
    }

    @Override // defpackage.ien
    public final void c() {
        synchronized (this.c) {
            defpackage.ieo ieoVar = defpackage.ieo.CLEARED;
            this.e = ieoVar;
            this.a.c();
            if (this.f != ieoVar) {
                this.f = ieoVar;
                this.b.c();
            }
        }
    }

    @Override // defpackage.iep
    public final void d(defpackage.ien ienVar) {
        synchronized (this.c) {
            if (ienVar.equals(this.b)) {
                this.f = defpackage.ieo.FAILED;
                defpackage.iep iepVar = this.d;
                if (iepVar != null) {
                    iepVar.d(this);
                }
                return;
            }
            this.e = defpackage.ieo.FAILED;
            defpackage.ieo ieoVar = this.f;
            defpackage.ieo ieoVar2 = defpackage.ieo.RUNNING;
            if (ieoVar != ieoVar2) {
                this.f = ieoVar2;
                this.b.b();
            }
        }
    }

    @Override // defpackage.iep
    public final void e(defpackage.ien ienVar) {
        synchronized (this.c) {
            if (ienVar.equals(this.a)) {
                this.e = defpackage.ieo.SUCCESS;
            } else if (ienVar.equals(this.b)) {
                this.f = defpackage.ieo.SUCCESS;
            }
            defpackage.iep iepVar = this.d;
            if (iepVar != null) {
                iepVar.e(this);
            }
        }
    }

    @Override // defpackage.ien
    public final void f() {
        synchronized (this.c) {
            defpackage.ieo ieoVar = this.e;
            defpackage.ieo ieoVar2 = defpackage.ieo.RUNNING;
            if (ieoVar == ieoVar2) {
                this.e = defpackage.ieo.PAUSED;
                this.a.f();
            }
            if (this.f == ieoVar2) {
                this.f = defpackage.ieo.PAUSED;
                this.b.f();
            }
        }
    }

    @Override // defpackage.iep
    public final boolean g(defpackage.ien ienVar) {
        boolean z;
        synchronized (this.c) {
            defpackage.iep iepVar = this.d;
            z = false;
            if ((iepVar == null || iepVar.g(this)) && ienVar.equals(this.a)) {
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x002f  */
    @Override // defpackage.iep
    public final boolean h(defpackage.ien ienVar) {
        boolean z;
        boolean zEquals;
        synchronized (this.c) {
            defpackage.iep iepVar = this.d;
            z = false;
            if (iepVar == null || iepVar.h(this)) {
                defpackage.ieo ieoVar = this.e;
                defpackage.ieo ieoVar2 = defpackage.ieo.FAILED;
                if (ieoVar != ieoVar2) {
                    zEquals = ienVar.equals(this.a);
                } else {
                    if (ienVar.equals(this.b)) {
                        defpackage.ieo ieoVar3 = this.f;
                        if (ieoVar3 == defpackage.ieo.SUCCESS) {
                            zEquals = true;
                        } else if (ieoVar3 != ieoVar2) {
                            zEquals = false;
                        }
                    } else {
                        zEquals = false;
                    }
                    z = true;
                }
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.iep
    public final boolean i(defpackage.ien ienVar) {
        boolean z;
        synchronized (this.c) {
            defpackage.iep iepVar = this.d;
            z = true;
            if (iepVar != null && !iepVar.i(this)) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.iep, defpackage.ien
    public final boolean j() {
        boolean z;
        synchronized (this.c) {
            z = true;
            if (!this.a.j() && !this.b.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.ien
    public final boolean k() {
        boolean z;
        synchronized (this.c) {
            defpackage.ieo ieoVar = this.e;
            defpackage.ieo ieoVar2 = defpackage.ieo.CLEARED;
            z = false;
            if (ieoVar == ieoVar2 && this.f == ieoVar2) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ien
    public final boolean l() {
        boolean z;
        synchronized (this.c) {
            defpackage.ieo ieoVar = this.e;
            defpackage.ieo ieoVar2 = defpackage.ieo.SUCCESS;
            z = true;
            if (ieoVar != ieoVar2 && this.f != ieoVar2) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.ien
    public final boolean m(defpackage.ien ienVar) {
        if (ienVar instanceof defpackage.iel) {
            defpackage.iel ielVar = (defpackage.iel) ienVar;
            if (this.a.m(ielVar.a) && this.b.m(ielVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ien
    public final boolean n() {
        boolean z;
        synchronized (this.c) {
            defpackage.ieo ieoVar = this.e;
            defpackage.ieo ieoVar2 = defpackage.ieo.RUNNING;
            z = true;
            if (ieoVar != ieoVar2 && this.f != ieoVar2) {
                z = false;
            }
        }
        return z;
    }
}
