package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class xgb implements defpackage.kjd {
    public final /* synthetic */ java.lang.Object a;
    public final /* synthetic */ java.lang.Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ xgb(com.google.android.projection.gearhead.system.GhLifecycleService ghLifecycleService, com.google.android.gms.car.display.CarDisplayId carDisplayId, int i) {
        this.c = i;
        this.a = ghLifecycleService;
        this.b = carDisplayId;
    }

    @Override // defpackage.kjd
    public final java.lang.Object a() {
        if (this.c != 0) {
            defpackage.mkp.a.g();
            return ((defpackage.rbu) this.a).a.t((com.google.android.gms.car.display.CarDisplayId) ((defpackage.nrr) this.b).b).d();
        }
        defpackage.kwv kwvVar = ((defpackage.rbw) this.a).f;
        kwvVar.getClass();
        return kwvVar.d(((com.google.android.gms.car.display.CarDisplayId) this.b).b).d();
    }

    public /* synthetic */ xgb(defpackage.nrr nrrVar, defpackage.qsh qshVar, int i) {
        this.c = i;
        this.b = nrrVar;
        this.a = qshVar;
    }
}
