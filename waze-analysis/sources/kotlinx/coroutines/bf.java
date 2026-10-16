package kotlinx.coroutines;

/* compiled from: WazeSource */
/* loaded from: classes2.dex */
public abstract class bf extends ba implements ao {

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.a.d f51752b = h.e.b.h(null);

    /* renamed from: c, reason: collision with root package name */
    private final kotlinx.a.d f51753c = h.e.b.h(null);

    /* renamed from: d, reason: collision with root package name */
    private final kotlinx.a.a f51754d = h.e.b.e(false);

    private final void w() {
        kotlinx.coroutines.e.at atVarD;
        be beVar = (be) this.f51753c.b();
        if (beVar == null || beVar.f()) {
            return;
        }
        long jNanoTime = System.nanoTime();
        do {
            be beVar2 = beVar;
            synchronized (beVar2) {
                kotlinx.coroutines.e.at atVarB = beVar2.b();
                atVarD = null;
                if (atVarB != null) {
                    bd bdVar = (bd) atVarB;
                    if (jNanoTime - bdVar.f51750b >= 0 && x(bdVar)) {
                        atVarD = beVar2.d(0);
                    }
                }
            }
        } while (((bd) atVarD) != null);
    }

    private final boolean x(Runnable runnable) {
        while (true) {
            kotlinx.a.d dVar = this.f51752b;
            Object objB = dVar.b();
            if (y()) {
                return false;
            }
            if (objB == null) {
                if (dVar.e(null, runnable)) {
                    return true;
                }
            } else if (objB instanceof kotlinx.coroutines.e.ab) {
                kotlinx.coroutines.e.ab abVar = (kotlinx.coroutines.e.ab) objB;
                int iA = abVar.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA != 1) {
                    return false;
                }
                dVar.e(objB, abVar.d());
            } else {
                if (objB == bg.f51756b) {
                    return false;
                }
                kotlinx.coroutines.e.ab abVar2 = new kotlinx.coroutines.e.ab(8, true);
                abVar2.a((Runnable) objB);
                abVar2.a(runnable);
                if (dVar.e(objB, abVar2)) {
                    return true;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean y() {
        return this.f51754d.c();
    }

    public /* bridge */ ax b(long j2, Runnable runnable, h.c.j jVar) {
        return al.a().b(j2, runnable, jVar);
    }

    public void c(Runnable runnable) {
        w();
        if (x(runnable)) {
            o();
        } else {
            ak.f51351b.c(runnable);
        }
    }

    @Override // kotlinx.coroutines.ab
    public final void dispatch(h.c.j jVar, Runnable runnable) {
        c(runnable);
    }

    @Override // kotlinx.coroutines.ba
    public void e() {
        kotlinx.coroutines.e.at atVarD;
        int i2 = dd.f51833a;
        dd.c();
        this.f51754d.a(true);
        int i3 = ai.f51347a;
        while (true) {
            kotlinx.a.d dVar = this.f51752b;
            Object objB = dVar.b();
            if (objB == null) {
                if (dVar.e(null, bg.f51756b)) {
                    break;
                }
            } else if (objB instanceof kotlinx.coroutines.e.ab) {
                ((kotlinx.coroutines.e.ab) objB).e();
                break;
            } else {
                if (objB == bg.f51756b) {
                    break;
                }
                kotlinx.coroutines.e.ab abVar = new kotlinx.coroutines.e.ab(8, true);
                abVar.a((Runnable) objB);
                if (dVar.e(objB, abVar)) {
                    break;
                }
            }
        }
        while (h() <= 0) {
        }
        long jNanoTime = System.nanoTime();
        while (true) {
            be beVar = (be) this.f51753c.b();
            if (beVar == null) {
                return;
            }
            synchronized (beVar) {
                atVarD = beVar.a() > 0 ? beVar.d(0) : null;
            }
            bd bdVar = (bd) atVarD;
            if (bdVar == null) {
                return;
            } else {
                d(jNanoTime, bdVar);
            }
        }
    }

    @Override // kotlinx.coroutines.ao
    public final void f(long j2, k kVar) {
        long jA = bg.a(j2);
        if (jA < 4611686018427387903L) {
            long jNanoTime = System.nanoTime();
            bb bbVar = new bb(this, jA + jNanoTime, kVar);
            t(jNanoTime, bbVar);
            bo.m(kVar, new i(bbVar, 2));
        }
    }

    @Override // kotlinx.coroutines.ba
    public final long h() {
        Runnable runnable;
        if (n()) {
            return 0L;
        }
        w();
        kotlinx.a.d dVar = this.f51752b;
        while (true) {
            Object objB = dVar.b();
            runnable = null;
            if (objB == null) {
                break;
            }
            if (!(objB instanceof kotlinx.coroutines.e.ab)) {
                if (objB == bg.f51756b) {
                    break;
                }
                if (dVar.e(objB, null)) {
                    runnable = (Runnable) objB;
                    break;
                }
            } else {
                kotlinx.coroutines.e.ab abVar = (kotlinx.coroutines.e.ab) objB;
                Object objC = abVar.c();
                if (objC != kotlinx.coroutines.e.ab.f51853a) {
                    runnable = (Runnable) objC;
                    break;
                }
                dVar.e(objB, abVar.d());
            }
        }
        if (runnable != null) {
            runnable.run();
            return 0L;
        }
        if (super.g() == 0) {
            return 0L;
        }
        Object objB2 = dVar.b();
        long jNanoTime = Long.MAX_VALUE;
        if (objB2 != null) {
            if (!(objB2 instanceof kotlinx.coroutines.e.ab)) {
                return objB2 == bg.f51756b ? Long.MAX_VALUE : 0L;
            }
            if (!((kotlinx.coroutines.e.ab) objB2).f()) {
                return 0L;
            }
        }
        be beVar = (be) this.f51753c.b();
        if (beVar != null) {
            bd bdVar = (bd) beVar.c();
            if (bdVar == null) {
                return Long.MAX_VALUE;
            }
            jNanoTime = bdVar.f51750b - System.nanoTime();
            if (jNanoTime < 0) {
                return 0L;
            }
        }
        return jNanoTime;
    }

    protected final ax r(long j2, Runnable runnable) {
        long jA = bg.a(j2);
        if (jA >= 4611686018427387903L) {
            return cm.f51811a;
        }
        long jNanoTime = System.nanoTime();
        bc bcVar = new bc(jA + jNanoTime, runnable);
        t(jNanoTime, bcVar);
        return bcVar;
    }

    protected final void s() {
        this.f51752b.d(null);
        this.f51753c.d(null);
    }

    public final void t(long j2, bd bdVar) {
        if (!y()) {
            kotlinx.a.d dVar = this.f51753c;
            be beVar = (be) dVar.b();
            if (beVar == null) {
                kotlinx.a.d dVar2 = this.f51753c;
                dVar2.e(null, new be(j2));
                Object objB = dVar2.b();
                if (objB == null) {
                    h.g.b.x.g();
                }
                beVar = (be) objB;
            }
            int iB = bdVar.b(j2, beVar, this);
            if (iB == 0) {
                be beVar2 = (be) dVar.b();
                if ((beVar2 != null ? (bd) beVar2.c() : null) == bdVar) {
                    o();
                    return;
                }
                return;
            }
            if (iB != 1) {
                return;
            }
        }
        d(j2, bdVar);
    }

    protected final boolean v() {
        if (!m()) {
            return false;
        }
        be beVar = (be) this.f51753c.b();
        if (beVar != null && !beVar.f()) {
            return false;
        }
        Object objB = this.f51752b.b();
        if (objB == null) {
            return true;
        }
        return objB instanceof kotlinx.coroutines.e.ab ? ((kotlinx.coroutines.e.ab) objB).f() : objB == bg.f51756b;
    }
}
