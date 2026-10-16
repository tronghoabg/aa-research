package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class nyn implements defpackage.afer {
    private final /* synthetic */ int a;

    public /* synthetic */ nyn(int i) {
        this.a = i;
    }

    @Override // defpackage.afer
    public final java.lang.Object invoke() throws defpackage.qst {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                defpackage.mpk.a().i(new android.content.Intent().setComponent(defpackage.mkt.v));
                return defpackage.afbk.a;
            case 1:
                return defpackage.a.P();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                int i = defpackage.nzs.a;
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.yqm yqmVar = com.google.android.apps.auto.components.system.statusbar.RailStatusBarFragment.b;
                defpackage.yqm yqmVar2 = nkw.a;
                boolean z = false;
                com.google.android.gms.car.CarInfo carInfo = (com.google.android.gms.car.CarInfo) defpackage.khg.u(new defpackage.wde("GH.RailStatusBarFrag", defpackage.zbe.RAIL, defpackage.zbd.eO, "Unable to get CarInfo", new java.lang.Object[0]), new defpackage.nyn(4));
                carInfo.getClass();
                if (carInfo.g && (carInfo.o || carInfo.n)) {
                    ((defpackage.yqj) ((defpackage.yqj) nkw.a.f()).l(1, java.util.concurrent.TimeUnit.MINUTES)).u("Showing battery and phone signal so there's a status bar");
                }
                boolean z2 = carInfo.g;
                boolean z3 = carInfo.o && !z2;
                if (carInfo.n && !z2) {
                    z = true;
                }
                return new nkw(z2, z3, z);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.mkp.a.f();
                com.google.android.gms.car.CarInfo carInfoD = defpackage.ooa.d(defpackage.kit.b().e());
                carInfoD.getClass();
                return carInfoD;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.oba obaVar = defpackage.oba.a;
                defpackage.ngk.a.a().b();
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.oba obaVar2 = defpackage.oba.a;
                defpackage.ngk ngkVarA = defpackage.ngk.a.a();
                defpackage.qsh qshVarE = defpackage.kit.b().e();
                qshVarE.getClass();
                ngkVarA.f(qshVarE);
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.oba obaVar3 = defpackage.oba.a;
                defpackage.ngk ngkVarA2 = defpackage.ngk.a.a();
                defpackage.qsh qshVarE2 = defpackage.kit.b().e();
                qshVarE2.getClass();
                ngkVarA2.e(qshVarE2);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new ogp();
            case 9:
                return defpackage.ogt.a();
            case 10:
                return new defpackage.ojl(null);
            case 11:
                return new defpackage.oqk();
            case 12:
                return defpackage.afbk.a;
            case 13:
                return pac.c();
            case 14:
                return java.lang.Boolean.valueOf(defpackage.wfp.g());
            case 15:
                return defpackage.afbk.a;
            case 16:
                return new tiu(tkh.a);
            case 17:
                return new tiu(tkh.b);
            case 18:
                return new tiu(tkh.c);
            case 19:
                return new tiu(tkh.d);
            default:
                defpackage.bvm bvmVar = tjg.a;
                return defpackage.yqm.c("Gh.ComposeScreen");
        }
    }
}
