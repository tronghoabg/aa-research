package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class nrx extends defpackage.mpb {
    public static final defpackage.nrx a = new defpackage.nrx();

    private nrx() {
        super("Navigation");
    }

    private static final boolean b(android.content.Intent intent) {
        defpackage.mqj mqjVarA;
        defpackage.mqi mqiVarB = defpackage.mqi.b(intent);
        return (mqiVarB == null || (mqjVarA = defpackage.ler.a().a(defpackage.kit.b().e(), mqiVarB)) == null || mqjVarA.b != defpackage.mqg.NAVIGATION) ? false : true;
    }

    private static final boolean c(android.content.Intent intent) {
        return intent.getComponent() == null && ((((defpackage.ysr.bv(intent.getDataString()).startsWith("geo:") | defpackage.ysr.bv(intent.getDataString()).startsWith("google.navigation:")) | defpackage.ysr.bv(intent.getDataString()).startsWith("google.maps:")) | defpackage.ysr.bv(intent.getDataString()).startsWith("http://maps.google.com")) || defpackage.ysr.bv(intent.getDataString()).startsWith("https://maps.google.com"));
    }

    @Override // defpackage.mpb
    protected final boolean d(android.content.Intent intent, defpackage.qrh qrhVar) {
        return c(intent) || b(intent);
    }

    @Override // defpackage.mpb
    protected final void i(android.content.Intent intent, defpackage.qrh qrhVar) {
        android.content.ComponentName componentNameA;
        if (c(intent) && (componentNameA = defpackage.lhc.a().a(defpackage.mqg.NAVIGATION)) != null) {
            defpackage.mpr.b(componentNameA).d(intent);
        }
        com.google.android.gms.car.display.CarRegionId carRegionId = qrhVar.e;
        if (b(intent)) {
            if (carRegionId == null || com.google.android.gms.car.display.CarDisplayId.b(carRegionId.h)) {
                defpackage.mqi mqiVarB = defpackage.mqi.b(intent);
                mqiVarB.getClass();
                qrhVar.e = defpackage.ler.a().i(mqiVarB) ? defpackage.nte.c().b().r(defpackage.nta.s) : defpackage.nte.c().b().r(defpackage.nta.t);
            }
        }
    }
}
