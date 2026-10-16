package defpackage;

/* loaded from: classes2.dex */
public final class ied implements ieh, ief {
    public volatile ief a;
    public volatile ief b;
    private final Object c;
    private final ieh d;
    private ieg e;
    private ieg f;

    public ied(Object obj, ieh iehVar) {
        ieg iegVar = ieg.CLEARED;
        this.e = iegVar;
        this.f = iegVar;
        this.c = obj;
        this.d = iehVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [ieh] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.ieh
    public final ieh a() {
        ?? A;
        synchronized (this.c) {
            ieh iehVar = this.d;
            this = this;
            if (iehVar != null) {
                A = iehVar.a();
            }
        }
        return A;
    }

    @Override // defpackage.ief
    public final void b() {
        synchronized (this.c) {
            ieg iegVar = this.e;
            ieg iegVar2 = ieg.RUNNING;
            if (iegVar != iegVar2) {
                this.e = iegVar2;
                this.a.b();
            }
        }
    }

    @Override // defpackage.ief
    public final void c() {
        synchronized (this.c) {
            ieg iegVar = ieg.CLEARED;
            this.e = iegVar;
            this.a.c();
            if (this.f != iegVar) {
                this.f = iegVar;
                this.b.c();
            }
        }
    }

    @Override // defpackage.ieh
    public final void d(ief iefVar) {
        synchronized (this.c) {
            if (iefVar.equals(this.b)) {
                this.f = ieg.FAILED;
                ieh iehVar = this.d;
                if (iehVar != null) {
                    iehVar.d(this);
                }
                return;
            }
            this.e = ieg.FAILED;
            ieg iegVar = this.f;
            ieg iegVar2 = ieg.RUNNING;
            if (iegVar != iegVar2) {
                this.f = iegVar2;
                this.b.b();
            }
        }
    }

    @Override // defpackage.ieh
    public final void e(ief iefVar) {
        synchronized (this.c) {
            if (iefVar.equals(this.a)) {
                this.e = ieg.SUCCESS;
            } else if (iefVar.equals(this.b)) {
                this.f = ieg.SUCCESS;
            }
            ieh iehVar = this.d;
            if (iehVar != null) {
                iehVar.e(this);
            }
        }
    }

    @Override // defpackage.ief
    public final void f() {
        synchronized (this.c) {
            ieg iegVar = this.e;
            ieg iegVar2 = ieg.RUNNING;
            if (iegVar == iegVar2) {
                this.e = ieg.PAUSED;
                this.a.f();
            }
            if (this.f == iegVar2) {
                this.f = ieg.PAUSED;
                this.b.f();
            }
        }
    }

    @Override // defpackage.ieh
    public final boolean g(ief iefVar) {
        boolean z;
        synchronized (this.c) {
            ieh iehVar = this.d;
            z = false;
            if ((iehVar == null || iehVar.g(this)) && iefVar.equals(this.a)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ieh
    public final boolean h(ief iefVar) {
        boolean z;
        boolean zEquals;
        synchronized (this.c) {
            ieh iehVar = this.d;
            z = false;
            if (iehVar == null || iehVar.h(this)) {
                ieg iegVar = this.e;
                ieg iegVar2 = ieg.FAILED;
                if (iegVar == iegVar2) {
                    if (iefVar.equals(this.b)) {
                        ieg iegVar3 = this.f;
                        if (iegVar3 != ieg.SUCCESS) {
                            if (iegVar3 == iegVar2) {
                                z = true;
                            }
                            zEquals = false;
                        } else {
                            zEquals = true;
                        }
                    } else {
                        zEquals = false;
                    }
                }
                zEquals = iefVar.equals(this.a);
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // defpackage.ieh
    public final boolean i(ief iefVar) {
        boolean z;
        synchronized (this.c) {
            ieh iehVar = this.d;
            z = true;
            if (iehVar != null && !iehVar.i(this)) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.ieh, defpackage.ief
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

    @Override // defpackage.ief
    public final boolean k() {
        boolean z;
        synchronized (this.c) {
            ieg iegVar = this.e;
            ieg iegVar2 = ieg.CLEARED;
            z = false;
            if (iegVar == iegVar2 && this.f == iegVar2) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ief
    public final boolean l() {
        boolean z;
        synchronized (this.c) {
            ieg iegVar = this.e;
            ieg iegVar2 = ieg.SUCCESS;
            z = true;
            if (iegVar != iegVar2 && this.f != iegVar2) {
                z = false;
            }
        }
        return z;
    }

    @Override // defpackage.ief
    public final boolean m(ief iefVar) {
        if (iefVar instanceof ied) {
            ied iedVar = (ied) iefVar;
            if (this.a.m(iedVar.a) && this.b.m(iedVar.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.ief
    public final boolean n() {
        boolean z;
        synchronized (this.c) {
            ieg iegVar = this.e;
            ieg iegVar2 = ieg.RUNNING;
            z = true;
            if (iegVar != iegVar2 && this.f != iegVar2) {
                z = false;
            }
        }
        return z;
    }
}
