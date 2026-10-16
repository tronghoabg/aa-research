package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mga implements defpackage.eqe {
    final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public mga(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.eqe
    public final void a(defpackage.eqg eqgVar, defpackage.epw epwVar) {
        int i = this.b;
        if (i == 0) {
            defpackage.mgb mgbVar = (defpackage.mgb) this.a;
            android.os.Handler handler = mgbVar.a;
            handler.getClass();
            android.app.KeyguardManager keyguardManager = (android.app.KeyguardManager) defpackage.mkp.a.c.getSystemService("keyguard");
            keyguardManager.getClass();
            if (epwVar.a() == defpackage.epx.c && keyguardManager.isKeyguardLocked()) {
                handler.postDelayed(mgbVar.b, 250L);
                return;
            } else {
                if (epwVar.a() == defpackage.epx.a) {
                    handler.removeCallbacks(mgbVar.b);
                    return;
                }
                return;
            }
        }
        if (i == 1) {
            if (epwVar == defpackage.epw.ON_START) {
                defpackage.mfz mfzVar = (defpackage.mfz) this.a;
                if (mfzVar.b) {
                    return;
                }
                mfzVar.a(defpackage.zbd.f);
                mfzVar.b = true;
                return;
            }
            return;
        }
        if (i == 2) {
            ((defpackage.yqj) defpackage.mgm.a.l().ai((char) 4882)).y("onLifecycleEvent:%s", epwVar.name());
            defpackage.mft mftVarA = ((defpackage.mfu) defpackage.mkp.a.i(defpackage.mfu.class)).a();
            defpackage.epw epwVar2 = defpackage.epw.ON_CREATE;
            defpackage.mgv mgvVar = ((defpackage.mfx) mftVarA).b;
            if (epwVar == epwVar2) {
                mgvVar.b(((defpackage.mgm) this.a).c);
                return;
            } else {
                if (epwVar == defpackage.epw.ON_DESTROY) {
                    mgvVar.c(((defpackage.mgm) this.a).c);
                    return;
                }
                return;
            }
        }
        if (i != 3) {
            defpackage.qsk qskVar = (defpackage.qsk) this.a;
            qskVar.Q();
            qskVar.g.d(this);
        } else if (epwVar == defpackage.epw.ON_DESTROY) {
            java.lang.Object obj = this.a;
            defpackage.qsk qskVar2 = (defpackage.qsk) obj;
            qskVar2.f.b();
            if (!((defpackage.qrd) obj).N()) {
                qskVar2.getViewModelStore().a();
            }
            defpackage.qsj qsjVar = qskVar2.h;
            defpackage.qsk qskVar3 = qsjVar.d;
            qskVar3.C().getDecorView().removeCallbacks(qsjVar);
            qskVar3.C().getDecorView().getViewTreeObserver().removeOnDrawListener(qsjVar);
        }
    }
}
