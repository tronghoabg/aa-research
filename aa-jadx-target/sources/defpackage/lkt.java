package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lkt implements defpackage.eqt {
    private final /* synthetic */ int a;

    public /* synthetic */ lkt(int i) {
        this.a = i;
    }

    @Override // defpackage.eqt
    public final void ea(java.lang.Object obj) {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                break;
            case 1:
                if (((java.lang.Boolean) obj).booleanValue()) {
                    defpackage.ngr.a().c(ngu.i);
                }
                break;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                los losVar = (los) obj;
                losVar.d();
                losVar.e();
                break;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                break;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.yqm yqmVar = defpackage.lni.a;
                break;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.yqm yqmVar2 = defpackage.lni.a;
                break;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                break;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                break;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.yqm yqmVar3 = defpackage.lsj.a;
                break;
            case 9:
                defpackage.yqm yqmVar4 = defpackage.lsj.a;
                ((java.lang.Boolean) obj).booleanValue();
                break;
            case 10:
                ((defpackage.yqj) defpackage.lsj.a.l().ai((char) 4257)).u("Expiring observer keeping target app connection active");
                break;
            case 11:
                defpackage.yqm yqmVar5 = lwc.a;
                lwc.l(new defpackage.ixc(12));
                break;
            case 12:
                java.util.Map map = (java.util.Map) obj;
                defpackage.yqm yqmVar6 = defpackage.oyp.a;
                if (defpackage.lzm.c()) {
                    for (defpackage.mqj mqjVar : map.values()) {
                        if (mqjVar.d) {
                            int i = defpackage.nqx.a;
                            int i2 = defpackage.nqz.a;
                            defpackage.nqy.a.b(defpackage.kit.b().e(), mqjVar.a());
                            break;
                        }
                    }
                    int i3 = defpackage.nqx.a;
                    int i4 = defpackage.nqz.a;
                    defpackage.nqy.a.e(defpackage.kit.b().e());
                    break;
                }
                break;
            case 13:
                defpackage.yqm yqmVar7 = defpackage.oyp.a;
                if (((java.lang.Boolean) obj).booleanValue()) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.oyp.a.f()).ai((char) 6123)).u("Stopping immersives due to dashboard becoming visible");
                    defpackage.nqw.a().h();
                }
                break;
            case 14:
                defpackage.yqm yqmVar8 = defpackage.oyp.a;
                if (j$.util.Objects.equals((java.lang.Integer) obj, 2)) {
                    ((defpackage.yqj) ((defpackage.yqj) defpackage.oyp.a.f()).ai((char) 6124)).u("Stopping immersives due to demand space becoming open");
                    defpackage.nqw.a().h();
                }
                break;
            case 15:
                java.lang.Boolean bool = (java.lang.Boolean) obj;
                boolean zBooleanValue = bool.booleanValue();
                defpackage.yqm yqmVar9 = defpackage.oyp.a;
                ((defpackage.yqj) defpackage.oyp.a.l().ai((char) 6121)).y("Handling assistant scrim change: %b", bool);
                if (zBooleanValue) {
                    defpackage.kzs kzsVarB = defpackage.kzs.b();
                    if (kzsVarB.b != null) {
                        ((defpackage.yqj) defpackage.kzs.a.l().ai((char) 3666)).u("Already shown");
                    } else {
                        ((defpackage.yqj) defpackage.kzs.a.l().ai((char) 3665)).u("Showing");
                        defpackage.ntb ntbVarB = defpackage.nte.c().b();
                        defpackage.qts qtsVarN = ntbVarB.n(defpackage.nta.b);
                        qtsVarN.getClass();
                        com.google.android.gms.car.CarWindowLayoutParams carWindowLayoutParamsA = qtsVarN.a();
                        defpackage.qts qtsVarN2 = ntbVarB.n(defpackage.nta.o);
                        qtsVarN2.getClass();
                        int i5 = 1;
                        qtsVarN2.l = true;
                        qtsVarN2.g = carWindowLayoutParamsA.i - 1;
                        qtsVarN2.q = null;
                        qtsVarN2.m = 2065;
                        qtsVarN2.n = true != defpackage.lem.a().b() ? 2132149922 : 2132149926;
                        kzsVarB.b = (defpackage.noz) defpackage.kgu.c(new defpackage.mmj(kzsVarB, qtsVarN2.a(), i5), "GH.AssistantScrimMan", defpackage.zbe.ASSISTANT_SCRIM, defpackage.zbd.Lk, true, "Unable to show scrim for assistant", new java.lang.Object[0]);
                    }
                } else {
                    defpackage.kzs.b().d();
                }
                break;
            default:
                defpackage.yqm yqmVar10 = defpackage.qjm.a;
                defpackage.qjm.l(new defpackage.qhx(2));
                break;
        }
    }
}
