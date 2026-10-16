package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class ipa extends defpackage.riq {
    public final boolean a;
    final /* synthetic */ defpackage.iph b;

    public ipa(defpackage.iph iphVar, boolean z) {
        this.b = iphVar;
        this.a = z;
    }

    @Override // defpackage.riq
    public final void a(android.content.ComponentName componentName, android.os.IBinder iBinder) {
        defpackage.qyr qypVar;
        defpackage.yqm yqmVar = defpackage.iph.E;
        defpackage.ill.d();
        defpackage.yqj yqjVar = (defpackage.yqj) ((defpackage.yqj) defpackage.iph.E.f()).ai(969);
        defpackage.iph iphVar = this.b;
        yqjVar.y("component: %s; Connected", iphVar.i);
        defpackage.ipg ipgVar = iphVar.H;
        defpackage.rcm.d(ipgVar, iphVar.I);
        iphVar.J = 0;
        if (iBinder == null) {
            qypVar = null;
        } else {
            android.os.IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.car.ICarProjection");
            qypVar = iInterfaceQueryLocalInterface instanceof defpackage.qyr ? (defpackage.qyr) iInterfaceQueryLocalInterface : new defpackage.qyp(iBinder);
        }
        iphVar.O = qypVar;
        ipgVar.j(0, 47);
    }

    @Override // defpackage.riq
    public final void b(android.content.ComponentName componentName) {
        defpackage.ill.d();
        defpackage.iph iphVar = this.b;
        iphVar.H.h();
        iphVar.O = null;
        iphVar.S = false;
        iphVar.e = true;
        if (iphVar.F()) {
            return;
        }
        if (!iphVar.j && iphVar.f == null) {
            if (!iphVar.H()) {
                iphVar.b.av(iphVar, new zxm((java.lang.RuntimeException) null));
                return;
            }
            ((defpackage.yqj) ((defpackage.yqj) defpackage.inn.a.h()).ai((char) 622)).u("Binder died.");
            defpackage.ioh iohVar = iphVar.b;
            android.content.ComponentName componentName2 = iphVar.d;
            iohVar.e.i(defpackage.zaa.CAR_ACTIVITY_MANAGER_BINDER_DIED, defpackage.zab.CS_BINDER_DIED, componentName2.getPackageName());
            iphVar.m(componentName2.getPackageName().equals(defpackage.ill.c(iohVar.d)) ? new java.lang.RuntimeException(java.lang.String.valueOf(componentName2.flattenToShortString()).concat(" unexpectedly disconnected")) : null);
            return;
        }
        defpackage.rcm.d(iphVar.h, iphVar.g);
        if (iphVar.f != null) {
            if (defpackage.acps.q()) {
                defpackage.rqt rqtVarA = defpackage.rqt.a(iphVar.b.d);
                defpackage.rrv rrvVarH = defpackage.rrw.h(defpackage.yzd.CAR_SERVICE, defpackage.zbe.ACTIVITY_MANAGER, defpackage.zbd.tT);
                rrvVarH.p(iphVar.d);
                rrvVarH.o(iphVar.f);
                rqtVarA.c(rrvVarH.l());
            }
        } else if (iphVar.D.get() != null) {
            ((defpackage.yqj) ((defpackage.yqj) defpackage.inn.a.h()).ai((char) 617)).u("Client did not ANR, but ANR data has been unexpectedly set in handling client death.");
        }
        iphVar.i();
    }
}
