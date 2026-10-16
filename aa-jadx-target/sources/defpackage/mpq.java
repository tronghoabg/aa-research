package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class mpq {
    public static final /* synthetic */ int a = 0;
    private static final defpackage.yqm b = defpackage.yqm.c("GH.StartCarActiHelper");
    private final com.google.android.gms.car.display.CarRegionId c;

    public mpq(com.google.android.gms.car.display.CarRegionId carRegionId) {
        this.c = carRegionId;
    }

    public final void a(android.content.Intent intent) {
        defpackage.qrh qrhVar = new defpackage.qrh();
        com.google.android.gms.car.display.CarRegionId carRegionId = this.c;
        qrhVar.e = carRegionId;
        ((defpackage.yqj) b.l().ai(5168)).M("Starting %s on %s", intent, carRegionId);
        defpackage.mpk.a().k(intent, qrhVar);
    }
}
