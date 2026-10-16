package defpackage;

/* JADX INFO: loaded from: classes2.dex */
public final class iev implements defpackage.iep, defpackage.ien {
    public volatile defpackage.ien a;
    public volatile defpackage.ien b;
    private final defpackage.iep c;
    private final java.lang.Object d;
    private defpackage.ieo e;
    private defpackage.ieo f;
    private boolean g;

    public iev(java.lang.Object obj, defpackage.iep iepVar) {
        defpackage.ieo ieoVar = defpackage.ieo.CLEARED;
        this.e = ieoVar;
        this.f = ieoVar;
        this.d = obj;
        this.c = iepVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [iep] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.iep
    public final defpackage.iep a() {
        ?? A;
        synchronized (this.d) {
            defpackage.iep iepVar = this.c;
            this = this;
            if (iepVar != null) {
                A = iepVar.a();
            }
        }
        return A;
    }

    @Override // defpackage.ien
    public final void b() {
        synchronized (this.d) {
            this.g = true;
            try {
                if (this.e != defpackage.ieo.SUCCESS) {
                    defpackage.ieo ieoVar = this.f;
                    defpackage.ieo ieoVar2 = defpackage.ieo.RUNNING;
                    if (ieoVar != ieoVar2) {
                        this.f = ieoVar2;
                        this.b.b();
                    }
                }
                if (this.g) {
                    defpackage.ieo ieoVar3 = this.e;
                    defpackage.ieo ieoVar4 = defpackage.ieo.RUNNING;
                    if (ieoVar3 != ieoVar4) {
                        this.e = ieoVar4;
                        this.a.b();
                    }
                }
                this.g = false;
            } catch (java.lang.Throwable th) {
                this.g = false;
                throw th;
            }
        }
    }

    @Override // defpackage.ien
    public final void c() {
        synchronized (this.d) {
            this.g = false;
            defpackage.ieo ieoVar = defpackage.ieo.CLEARED;
            this.e = ieoVar;
            this.f = ieoVar;
            this.b.c();
            this.a.c();
        }
    }

    @Override // defpackage.iep
    public final void d(defpackage.ien ienVar) {
        synchronized (this.d) {
            if (!ienVar.equals(this.a)) {
                this.f = defpackage.ieo.FAILED;
                return;
            }
            this.e = defpackage.ieo.FAILED;
            defpackage.iep iepVar = this.c;
            if (iepVar != null) {
                iepVar.d(this);
            }
        }
    }

    @Override // defpackage.iep
    public final void e(defpackage.ien ienVar) {
        synchronized (this.d) {
            if (ienVar.equals(this.b)) {
                this.f = defpackage.ieo.SUCCESS;
                return;
            }
            this.e = defpackage.ieo.SUCCESS;
            defpackage.iep iepVar = this.c;
            if (iepVar != null) {
                iepVar.e(this);
            }
            if (!this.f.f) {
                this.b.c();
            }
        }
    }

    @Override // defpackage.ien
    public final void f() {
        synchronized (this.d) {
            if (!this.f.f) {
                this.f = defpackage.ieo.PAUSED;
                this.b.f();
            }
            if (!this.e.f) {
                this.e = defpackage.ieo.PAUSED;
                this.a.f();
            }
        }
    }

    @Override // defpackage.iep
    public final boolean g(defpackage.ien ienVar) {
        boolean z;
        synchronized (this.d) {
            defpackage.iep iepVar = this.c;
            z = false;
            if ((iepVar == null || iepVar.g(this)) && ienVar.equals(this.a) && this.e != defpackage.ieo.PAUSED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.iep
    public final boolean h(defpackage.ien ienVar) {
        boolean z;
        synchronized (this.d) {
            defpackage.iep iepVar = this.c;
            z = false;
            if ((iepVar == null || iepVar.h(this)) && ienVar.equals(this.a) && !j()) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.iep
    public final boolean i(defpackage.ien ienVar) {
        boolean z;
        synchronized (this.d) {
            defpackage.iep iepVar = this.c;
            z = false;
            if ((iepVar == null || iepVar.i(this)) && (ienVar.equals(this.a) || this.e != defpackage.ieo.SUCCESS)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.iep, defpackage.ien
    public final boolean j() {
        boolean z;
        synchronized (this.d) {
            z = true;
            if (!this.b.j() && !this.a.j()) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.ien
    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.e == defpackage.ieo.CLEARED;
        }
        return z;
    }

    @Override // defpackage.ien
    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = this.e == defpackage.ieo.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.ien
    public final boolean m(defpackage.ien ienVar) {
        if (ienVar instanceof defpackage.iev) {
            defpackage.iev ievVar = (defpackage.iev) ienVar;
            if (this.a != null ? this.a.m(ievVar.a) : ievVar.a == null) {
                if (this.b == null) {
                    if (ievVar.b == null) {
                        return true;
                    }
                } else if (this.b.m(ievVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ien
    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            z = this.e == defpackage.ieo.RUNNING;
        }
        return z;
    }
}
