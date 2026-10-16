package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class xgc implements defpackage.rzx {
    public final /* synthetic */ com.google.android.projection.gearhead.system.GhLifecycleService a;
    private final /* synthetic */ int b;

    public /* synthetic */ xgc(com.google.android.projection.gearhead.system.GhLifecycleService ghLifecycleService, int i) {
        this.b = i;
        this.a = ghLifecycleService;
    }

    @Override // defpackage.rzx
    public final java.lang.Object a(com.google.android.gms.car.display.CarDisplayId carDisplayId) {
        if (this.b != 0) {
            return this.a.k(carDisplayId);
        }
        throw null;
    }
}
