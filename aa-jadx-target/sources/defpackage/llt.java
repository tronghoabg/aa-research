package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class llt implements defpackage.afer {
    private final /* synthetic */ int a;

    public /* synthetic */ llt(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        com.google.android.gms.car.display.CarDisplay carDisplayD;
        com.google.android.gms.car.display.CarDisplayBlendedUiConfig carDisplayBlendedUiConfig;
        int i = 11;
        boolean z = true;
        ?? r2 = 0;
        r2 = 0;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return defpackage.afbk.a;
            case 1:
                return new llp();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.lol lolVar = defpackage.lom.a;
                defpackage.eqp eqpVarB = defpackage.lpx.i().b();
                eqpVarB.getClass();
                return defpackage.tcu.B(eqpVarB, new defpackage.lnc(3));
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.lov();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.lua();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new lwv();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new lyr();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new lyt();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new mai();
            case 9:
                mcm mcmVar = mcm.a;
                return defpackage.afga.ac(mcm.a, mcm.b);
            case 10:
                return defpackage.afbk.a;
            case 11:
                return defpackage.afbk.a;
            case 12:
                return new defpackage.mdi(r2);
            case 13:
                mer.a();
                return defpackage.afbk.a;
            case 14:
                mer.a();
                return defpackage.afbk.a;
            case 15:
                try {
                    defpackage.mkp.a.g();
                    defpackage.sax saxVarV = defpackage.oml.v(defpackage.kit.b().e(), com.google.android.gms.car.display.CarDisplayId.a);
                    if (saxVarV != null && (carDisplayD = saxVarV.d()) != null) {
                        carDisplayBlendedUiConfig = carDisplayD.i;
                    }
                    if (r2 == 0) {
                        r2 = carDisplayBlendedUiConfig;
                        z = false;
                    }
                    break;
                } catch (java.lang.Exception e) {
                    ((defpackage.yqj) ((defpackage.yqj) com.google.android.apps.auto.components.settings.ui.CarSettingsService.c.h()).p(e)).u("Failed to query CarWindowManager for blended UI config");
                }
                r2 = carDisplayBlendedUiConfig;
                return java.lang.Boolean.valueOf(z);
            case 16:
                int i2 = mqo.f;
                defpackage.mdk.a();
                int i3 = 5;
                int i4 = 6;
                java.lang.Object objCollect = j$.util.Collection.-EL.stream(defpackage.mdk.d(defpackage.kit.b().e())).map(new defpackage.mjc(mqn.a, i3)).filter(new defpackage.lyk(14)).map(new defpackage.mjc(new defpackage.mcz(i), i4)).sorted(new defpackage.dab(new defpackage.mjm(i3), i4)).collect(j$.util.stream.Collectors.toList());
                objCollect.getClass();
                defpackage.afdo afdoVar = defpackage.tcu.a;
                return new defpackage.eqs((java.util.List) objCollect);
            case 17:
                return new defpackage.muf(i);
            case 18:
                return new defpackage.mtv();
            case 19:
                return new mty();
            default:
                mtw mtwVar = mty.a;
                return defpackage.a.P();
        }
    }
}
