package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class vly implements defpackage.vlx {
    private final defpackage.afak a;
    private final defpackage.vmh b;
    private final defpackage.afak c;
    private final defpackage.afak d;
    private final defpackage.afak e;
    private final defpackage.afak f;
    private final defpackage.afak g;
    private final defpackage.afak h;
    private final defpackage.afak i;
    private final defpackage.abpu j;

    public vly(defpackage.afak afakVar, defpackage.vmh vmhVar, defpackage.afak afakVar2, defpackage.afak afakVar3, defpackage.afak afakVar4, defpackage.afak afakVar5, defpackage.afak afakVar6, defpackage.afak afakVar7, defpackage.afak afakVar8, defpackage.xyn xynVar, defpackage.abpu abpuVar) {
        this.a = afakVar;
        this.b = vmhVar;
        this.c = afakVar2;
        this.d = afakVar3;
        this.e = afakVar4;
        this.f = afakVar5;
        this.g = afakVar6;
        this.h = afakVar7;
        this.i = afakVar8;
        this.j = abpuVar;
        if (((java.lang.Boolean) xynVar.d(java.lang.Boolean.FALSE)).booleanValue()) {
            return;
        }
        ((defpackage.ype) ((defpackage.ype) vmf.a.e()).ai((char) 9779)).u("Primes instant initialization");
        try {
            java.util.concurrent.atomic.AtomicReference atomicReference = defpackage.xuy.a;
            java.util.Iterator it = ((defpackage.aclx) afakVar2).a().iterator();
            while (it.hasNext()) {
                ((defpackage.vsw) it.next()).k();
            }
        } catch (java.lang.RuntimeException e) {
            defpackage.ypg ypgVar = vmf.a;
            ((defpackage.ype) ((defpackage.ype) ((defpackage.ype) ypgVar.h()).p(e)).ai((char) 9780)).u("Primes failed to initialize");
            defpackage.vmh vmhVar2 = this.b;
            if (vmhVar2.a) {
                return;
            }
            vmhVar2.a = true;
            ((defpackage.ype) ((defpackage.ype) ypgVar.e()).ai((char) 9787)).u("Shutdown ...");
        }
    }

    @Override // defpackage.vlx
    public final defpackage.vxw a() {
        return ((defpackage.vxr) this.h).a().b();
    }

    @Override // defpackage.vlx
    public final defpackage.xzi b() {
        return new defpackage.upb(this.a, 11);
    }

    @Override // defpackage.vlx
    public final java.lang.Thread.UncaughtExceptionHandler c(java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        return ((defpackage.vtw) this.e.a()).l(uncaughtExceptionHandler);
    }

    @Override // defpackage.vlx
    public final void d() {
        defpackage.abpu abpuVar = this.j;
        if (((java.util.concurrent.atomic.AtomicBoolean) abpuVar.b).getAndSet(true)) {
            return;
        }
        if (!((defpackage.xyn) abpuVar.a).f()) {
            defpackage.xyn xynVar = (defpackage.xyn) abpuVar.c;
            if (xynVar.f()) {
                ((defpackage.vtw) ((defpackage.afak) xynVar.b()).a()).m();
            }
        }
        defpackage.xyn xynVar2 = (defpackage.xyn) abpuVar.d;
        if (xynVar2.f()) {
            ((defpackage.vwa) ((defpackage.afak) xynVar2.b()).a()).a();
        }
    }

    @Override // defpackage.vlx
    public final void e(defpackage.vwp vwpVar) {
        ((defpackage.vwx) this.g).a().a(vwpVar);
    }

    @Override // defpackage.vlx
    public final void f() {
        ((defpackage.vtw) this.e.a()).n();
    }

    @Override // defpackage.vlx
    public final void g(defpackage.vlu vluVar) {
        ((defpackage.vxr) this.h).a().c(vluVar);
    }

    @Override // defpackage.vlx
    public final void h() {
        ((defpackage.vwa) this.f.a()).a();
    }

    @Override // defpackage.vlx
    public final boolean i() {
        return ((defpackage.vlq) this.d).a().c();
    }

    @Override // defpackage.vlx
    public final void j(defpackage.vlu vluVar, long j, long j2) {
        ((defpackage.vxs) this.i).a().a(vluVar, j, j2);
    }

    @Override // defpackage.vlx
    public final void k(defpackage.vlu vluVar, defpackage.vlu vluVar2, int i) {
        ((defpackage.vxr) this.h).a().d(vluVar, vluVar2, i);
    }

    @Override // defpackage.vlx
    public final void l(defpackage.vxw vxwVar, defpackage.vlu vluVar) {
        ((defpackage.vxr) this.h).a().e(vxwVar, vluVar);
    }
}
