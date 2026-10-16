package defpackage;

/* loaded from: classes2.dex */
public final class ien implements ieh, ief {
    public volatile ief a;
    public volatile ief b;
    private final ieh c;
    private final Object d;
    private ieg e;
    private ieg f;
    private boolean g;

    public ien(Object obj, ieh iehVar) {
        ieg iegVar = ieg.CLEARED;
        this.e = iegVar;
        this.f = iegVar;
        this.d = obj;
        this.c = iehVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [ieh] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // defpackage.ieh
    public final ieh a() {
        ?? A;
        synchronized (this.d) {
            ieh iehVar = this.c;
            this = this;
            if (iehVar != null) {
                A = iehVar.a();
            }
        }
        return A;
    }

    @Override // defpackage.ief
    public final void b() {
        synchronized (this.d) {
            this.g = true;
            try {
                if (this.e != ieg.SUCCESS) {
                    ieg iegVar = this.f;
                    ieg iegVar2 = ieg.RUNNING;
                    if (iegVar != iegVar2) {
                        this.f = iegVar2;
                        this.b.b();
                    }
                }
                if (this.g) {
                    ieg iegVar3 = this.e;
                    ieg iegVar4 = ieg.RUNNING;
                    if (iegVar3 != iegVar4) {
                        this.e = iegVar4;
                        this.a.b();
                    }
                }
            } finally {
                this.g = false;
            }
        }
    }

    @Override // defpackage.ief
    public final void c() {
        synchronized (this.d) {
            this.g = false;
            ieg iegVar = ieg.CLEARED;
            this.e = iegVar;
            this.f = iegVar;
            this.b.c();
            this.a.c();
        }
    }

    @Override // defpackage.ieh
    public final void d(ief iefVar) {
        synchronized (this.d) {
            if (!iefVar.equals(this.a)) {
                this.f = ieg.FAILED;
                return;
            }
            this.e = ieg.FAILED;
            ieh iehVar = this.c;
            if (iehVar != null) {
                iehVar.d(this);
            }
        }
    }

    @Override // defpackage.ieh
    public final void e(ief iefVar) {
        synchronized (this.d) {
            if (iefVar.equals(this.b)) {
                this.f = ieg.SUCCESS;
                return;
            }
            this.e = ieg.SUCCESS;
            ieh iehVar = this.c;
            if (iehVar != null) {
                iehVar.e(this);
            }
            if (!this.f.f) {
                this.b.c();
            }
        }
    }

    @Override // defpackage.ief
    public final void f() {
        synchronized (this.d) {
            if (!this.f.f) {
                this.f = ieg.PAUSED;
                this.b.f();
            }
            if (!this.e.f) {
                this.e = ieg.PAUSED;
                this.a.f();
            }
        }
    }

    @Override // defpackage.ieh
    public final boolean g(ief iefVar) {
        boolean z;
        synchronized (this.d) {
            ieh iehVar = this.c;
            z = false;
            if ((iehVar == null || iehVar.g(this)) && iefVar.equals(this.a) && this.e != ieg.PAUSED) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ieh
    public final boolean h(ief iefVar) {
        boolean z;
        synchronized (this.d) {
            ieh iehVar = this.c;
            z = false;
            if ((iehVar == null || iehVar.h(this)) && iefVar.equals(this.a) && !j()) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ieh
    public final boolean i(ief iefVar) {
        boolean z;
        synchronized (this.d) {
            ieh iehVar = this.c;
            z = false;
            if ((iehVar == null || iehVar.i(this)) && (iefVar.equals(this.a) || this.e != ieg.SUCCESS)) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.ieh, defpackage.ief
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

    @Override // defpackage.ief
    public final boolean k() {
        boolean z;
        synchronized (this.d) {
            z = this.e == ieg.CLEARED;
        }
        return z;
    }

    @Override // defpackage.ief
    public final boolean l() {
        boolean z;
        synchronized (this.d) {
            z = this.e == ieg.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.ief
    public final boolean m(ief iefVar) {
        if (iefVar instanceof ien) {
            ien ienVar = (ien) iefVar;
            if (this.a != null ? this.a.m(ienVar.a) : ienVar.a == null) {
                if (this.b == null) {
                    if (ienVar.b == null) {
                        return true;
                    }
                } else if (this.b.m(ienVar.b)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.ief
    public final boolean n() {
        boolean z;
        synchronized (this.d) {
            z = this.e == ieg.RUNNING;
        }
        return z;
    }
}
