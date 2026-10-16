package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nrv extends defpackage.mpb {
    public static final defpackage.nrv a = new defpackage.nrv();

    private nrv() {
        super("CompatActivity");
    }

    @Override // defpackage.mpb
    protected final boolean d(android.content.Intent intent, defpackage.qrh qrhVar) {
        defpackage.mqi mqiVarB = defpackage.mqi.b(intent);
        if (mqiVarB == null) {
            return false;
        }
        if ("com.google.android.projection.gearhead.pctsverifier".equals(mqiVarB.a.getPackageName())) {
            return true;
        }
        defpackage.mqj mqjVarA = defpackage.ler.a().a(defpackage.kit.b().e(), mqiVarB);
        return mqjVarA != null && mqjVarA.b == defpackage.mqg.OEM;
    }

    @Override // defpackage.mpb
    protected final void i(android.content.Intent intent, defpackage.qrh qrhVar) {
        com.google.android.gms.car.display.CarRegionId carRegionId = qrhVar.e;
        if (carRegionId == null || com.google.android.gms.car.display.CarDisplayId.b(carRegionId.h)) {
            qrhVar.e = defpackage.nte.c().b().r(defpackage.nta.u);
        }
    }
}
