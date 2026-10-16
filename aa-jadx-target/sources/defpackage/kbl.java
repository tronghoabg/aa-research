package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class kbl implements defpackage.afer {
    private final /* synthetic */ int a;

    public /* synthetic */ kbl(int i) {
        this.a = i;
    }

    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        byte[] bArr = null;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return new jvm();
            case 1:
                return new hhv();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new kgw();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                int i = klg.a;
                return defpackage.yqm.c("Gh.CarControlCAS");
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                java.util.List listI = defpackage.kjx.a.a().i();
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj : listI) {
                    int i2 = ((kkf) obj).a.a;
                    if (defpackage.a.X(i2, 354419978) || defpackage.a.X(i2, 354419977) || defpackage.a.X(i2, 356517121) || defpackage.a.X(i2, 356517120) || defpackage.a.X(i2, 356517131) || defpackage.a.X(i2, 358614275) || defpackage.a.X(i2, 289408270) || defpackage.a.X(i2, 354419973) || defpackage.a.X(i2, 354419974) || defpackage.a.X(i2, 320865540) || defpackage.a.X(i2, 354419975) || defpackage.a.X(i2, 354419984) || defpackage.a.X(i2, 354419986) || defpackage.a.X(i2, 354419976) || defpackage.a.X(i2, 356517139) || defpackage.a.X(i2, 339739916) || defpackage.a.X(i2, 289408269)) {
                        arrayList.add(obj);
                    }
                }
                return arrayList;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return defpackage.kjx.a.a().i();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.kjx.a.a().a();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.kjx.a.a().j();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.mkp.a.g();
                return defpackage.oml.v(defpackage.kit.b().e(), com.google.android.gms.car.display.CarDisplayId.a).d();
            case 9:
                return java.lang.Boolean.valueOf(defpackage.nrr.a().f());
            case 10:
                int i3 = defpackage.kms.a;
                return java.lang.Boolean.valueOf(defpackage.nrr.a().d());
            case 11:
                defpackage.afar afarVar = defpackage.ktz.a;
                return new defpackage.kty(null);
            case 12:
                defpackage.afar afarVar2 = defpackage.ktz.a;
                return new defpackage.kty();
            case 13:
                defpackage.afar afarVar3 = defpackage.ktz.a;
                return new ktx();
            case 14:
                defpackage.abor aborVarN = otm.a.n();
                aborVarN.getClass();
                java.util.List listUnmodifiableList = j$.util.DesugarCollections.unmodifiableList(aborVarN.b.b);
                listUnmodifiableList.getClass();
                new abrl(listUnmodifiableList);
                java.util.List<com.google.android.gms.car.control.CarAction> listJ = defpackage.kjx.a.a().j();
                java.util.ArrayList arrayList2 = new java.util.ArrayList(defpackage.afga.aj(listJ, 10));
                for (com.google.android.gms.car.control.CarAction carAction : listJ) {
                    defpackage.abor aborVarN2 = otl.a.n();
                    aborVarN2.getClass();
                    int i4 = carAction.a;
                    aborVarN2.t();
                    otl otlVar = aborVarN2.b;
                    otlVar.b |= 1;
                    otlVar.c = i4;
                    otl otlVarQ = aborVarN2.q();
                    otlVarQ.getClass();
                    arrayList2.add(otlVarQ);
                }
                aborVarN.t();
                otm otmVar = aborVarN.b;
                defpackage.abpj abpjVar = otmVar.b;
                if (!abpjVar.c()) {
                    otmVar.b = defpackage.abox.I(abpjVar);
                }
                defpackage.abnf.i(arrayList2, otmVar.b);
                otm otmVarQ = aborVarN.q();
                otmVarQ.getClass();
                return otmVarQ;
            case 15:
                return new defpackage.lcp(bArr);
            case 16:
                return new defpackage.lcv(null);
            case 17:
                return new defpackage.ldd(bArr);
            case 18:
                return new defpackage.ldf(null);
            case 19:
                return new lhb();
            default:
                return new defpackage.ljd(bArr);
        }
    }
}
