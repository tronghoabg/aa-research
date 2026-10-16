package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class vrj extends defpackage.vrk {
    final /* synthetic */ defpackage.vrl a;

    public vrj(defpackage.vrl vrlVar) {
        this.a = vrlVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: xzp */
    @Override // defpackage.vrk, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(android.app.Activity activity) throws xzp {
        defpackage.vrl vrlVar = this.a;
        int i = vrlVar.b - 1;
        vrlVar.b = i;
        if (i == 0) {
            vrlVar.h = defpackage.vlu.c(null, activity.getClass());
            android.os.Handler handler = vrlVar.e;
            defpackage.ysr.aP(handler, new java.lang.Object[0]);
            java.lang.Runnable runnable = vrlVar.f;
            defpackage.ysr.aP(runnable, new java.lang.Object[0]);
            handler.postDelayed(runnable, 700L);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: xzp */
    @Override // defpackage.vrk, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(android.app.Activity activity) throws xzp {
        defpackage.vrl vrlVar = this.a;
        int i = vrlVar.b + 1;
        vrlVar.b = i;
        if (i == 1) {
            if (vrlVar.c) {
                java.util.Iterator it = vrlVar.g.iterator();
                while (it.hasNext()) {
                    ((defpackage.vqu) it.next()).l(defpackage.vlu.c(null, activity.getClass()));
                }
                vrlVar.c = false;
                return;
            }
            android.os.Handler handler = vrlVar.e;
            defpackage.ysr.aP(handler, new java.lang.Object[0]);
            java.lang.Runnable runnable = vrlVar.f;
            defpackage.ysr.aP(runnable, new java.lang.Object[0]);
            handler.removeCallbacks(runnable);
        }
    }

    @Override // defpackage.vrk, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(android.app.Activity activity) {
        defpackage.vrl vrlVar = this.a;
        int i = vrlVar.a + 1;
        vrlVar.a = i;
        if (i == 1 && vrlVar.d) {
            for (defpackage.vqu vquVar : vrlVar.g) {
                defpackage.vlu.c(null, activity.getClass());
            }
            vrlVar.d = false;
        }
    }

    @Override // defpackage.vrk, android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(android.app.Activity activity) {
        defpackage.vrl vrlVar = this.a;
        vrlVar.a--;
        defpackage.vlu.c(null, activity.getClass());
        vrlVar.a();
    }
}
