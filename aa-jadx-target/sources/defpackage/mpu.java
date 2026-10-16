package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mpu implements defpackage.mqf {
    public static final /* synthetic */ int a = 0;
    private final defpackage.nst b = new defpackage.mpt();
    private final java.util.Map c = new android.util.ArrayMap();

    static {
        defpackage.yqm.c("GH.ALCUpdater");
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mqf
    public final void a() throws wfo {
        defpackage.wfp.c();
        defpackage.yqm yqmVar = defpackage.nte.a;
        defpackage.ygw ygwVarE = ((defpackage.nte) defpackage.mkp.a.i(defpackage.nte.class)).e();
        int size = ygwVarE.size();
        for (int i = 0; i < size; i++) {
            defpackage.ntb ntbVar = (defpackage.ntb) ygwVarE.get(i);
            ntbVar.w(this.b);
            defpackage.now nowVar = new defpackage.now(ntbVar, 1);
            this.c.put(ntbVar, nowVar);
            ntbVar.x(defpackage.nta.a, nowVar);
            if (com.google.android.gms.car.display.CarDisplayId.a.equals(ntbVar.o)) {
                ntbVar.x(defpackage.nta.s, nowVar);
                ntbVar.x(defpackage.nta.t, nowVar);
            }
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mqf, defpackage.lhn
    public final void d() throws wfo {
        defpackage.wfp.c();
        defpackage.ygw ygwVarE = defpackage.nte.c().e();
        int size = ygwVarE.size();
        for (int i = 0; i < size; i++) {
            defpackage.ntb ntbVar = (defpackage.ntb) ygwVarE.get(i);
            ntbVar.A(this.b);
            defpackage.nsx nsxVar = (defpackage.nsx) this.c.remove(ntbVar);
            nsxVar.getClass();
            ntbVar.B(defpackage.nta.a, nsxVar);
            ntbVar.B(defpackage.nta.s, nsxVar);
            ntbVar.B(defpackage.nta.t, nsxVar);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: wfo */
    @Override // defpackage.lhn
    @java.lang.Deprecated
    public final void eQ() throws wfo {
        defpackage.kit.b().e();
        a();
    }
}
