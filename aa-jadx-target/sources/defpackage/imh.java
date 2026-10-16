package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class imh extends defpackage.ilp {
    final /* synthetic */ defpackage.imi c;

    public imh(defpackage.imi imiVar) {
        this.c = imiVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.ilp, java.lang.Thread.UncaughtExceptionHandler
    public final void uncaughtException(java.lang.Thread thread, java.lang.Throwable th) throws wfo {
        defpackage.yqm yqmVar = defpackage.imi.b;
        ((defpackage.yqj) ((defpackage.yqj) yqmVar.l().p(th)).ai(296)).u("Uncaught exception");
        try {
            defpackage.imi imiVar = this.c;
            ((defpackage.yqj) yqmVar.l().ai(298)).u("Resetting system state on crash");
            defpackage.ioh iohVar = (defpackage.ioh) imiVar.A.get();
            if (iohVar != null) {
                defpackage.ill.d();
                synchronized (iohVar) {
                    iohVar.o = false;
                    ((defpackage.yqj) defpackage.ioh.b.l().ai(800)).u("Disconnecting due to crash");
                    java.util.Map map = iohVar.u;
                    java.util.Iterator it = map.values().iterator();
                    while (it.hasNext()) {
                        defpackage.yjm yjmVar = ((defpackage.inu) it.next()).f;
                        java.util.ArrayList arrayList = new java.util.ArrayList(yjmVar.v());
                        int size = arrayList.size();
                        for (int i = 0; i < size; i++) {
                            defpackage.inn innVar = (defpackage.inn) arrayList.get(i);
                            innVar.y(null);
                            innVar.l();
                        }
                        yjmVar.q();
                    }
                    map.clear();
                    iohVar.t.clear();
                }
                defpackage.ioj iojVar = iohVar.p;
                if (iojVar != null) {
                    iojVar.b();
                }
                defpackage.ygw ygwVarV = iohVar.k.V();
                int i2 = ((defpackage.ymx) ygwVarV).c;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((defpackage.jkr) ygwVarV.get(i3)).Y();
                }
            }
            imiVar.bc();
            j$.util.Optional optionalX = imiVar.X();
            optionalX.isPresent();
            defpackage.jfn jfnVar = ((defpackage.iuk) optionalX.get()).v;
            if (jfnVar != null) {
                jfnVar.c();
            }
            if (android.os.Build.VERSION.SDK_INT >= 30) {
                defpackage.jey jeyVarA = imiVar.e.a();
                if (!defpackage.imi.d.contains(jeyVarA)) {
                    ((defpackage.yqj) yqmVar.l().ai(302)).y("Currently in state %s, so not issuing a connection reset", jeyVarA.name());
                } else if (imiVar.U != null) {
                    ((defpackage.yqj) yqmVar.l().ai(301)).u("recoveryLifecycleServiceConnection is set, so let it handle connection reset");
                } else {
                    ((defpackage.yqj) ((defpackage.yqj) yqmVar.f()).ai((char) 299)).u("Requesting a connection reset");
                    imiVar.o.removeCallbacks(imiVar.Z);
                    if (imiVar.aa.compareAndSet(false, true)) {
                        j$.util.Optional optionalX2 = imiVar.X();
                        android.content.Intent intent = new android.content.Intent("com.google.android.projection.gearhead.RECOVERY_RESET");
                        android.content.Context context = imiVar.k;
                        android.content.Intent component = intent.setComponent(new android.content.ComponentName(context, (java.lang.Class<?>) com.google.android.apps.auto.components.connectivity.reset.ConnectionResetReceiver.class));
                        optionalX2.isPresent();
                        context.sendBroadcast(component.putExtra("EXTRA_CONNECTION_TYPE", ((defpackage.iuk) optionalX2.get()).p).putExtra("EXTRA_ORIGIN", defpackage.rox.g(3)).addFlags(268435456));
                    } else {
                        ((defpackage.yqj) yqmVar.l().ai(300)).u("Connection reset request already requested for a crash");
                    }
                }
            }
        } catch (java.lang.Exception e) {
            ((defpackage.yqj) ((defpackage.yqj) ((defpackage.yqj) defpackage.imi.b.g()).p(e)).ai((char) 297)).u("Error cleaning up on crash");
        }
        java.lang.Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.a;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
