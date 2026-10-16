package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class nas implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ nas(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: rlo */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Object, lqa] */
    /* JADX WARN: Type inference failed for: r5v4, types: [afer, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v59, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v62, types: [bys, java.lang.Object] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() throws defpackage.qsu, defpackage.qst, rlo {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                return com.google.android.apps.auto.components.graphics.icon.GhIcon.j(this.a.a());
            case 1:
                this.a.invoke();
                return defpackage.afbk.a;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.mwr.a(defpackage.zbd.Hp, null);
                ((defpackage.nbg) this.a).f();
                return defpackage.afbk.a;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new zpv((nbp) this.a);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return ((android.support.v4.app.Fragment) this.a).requireView().findViewById(2131428846);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.afar afarVar = ndz.a;
                return new neg((java.lang.String) this.a);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.neb nebVar = defpackage.ned.a;
                return java.lang.Boolean.valueOf(((defpackage.mku) this.a).n());
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                int i = ((com.google.android.apps.auto.components.telecom.PhoneCall) this.a).a;
                defpackage.yqm yqmVar = nes.a;
                defpackage.mwr.c(defpackage.zbd.E, java.lang.Integer.valueOf(i));
                defpackage.omf.w().m(i);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                nes.a((com.google.android.apps.auto.components.telecom.PhoneCall) this.a, true);
                return defpackage.afbk.a;
            case 9:
                defpackage.yqm yqmVar2 = nes.a;
                java.lang.Object obj = this.a;
                com.google.android.apps.auto.components.telecom.PhoneCall phoneCall = (com.google.android.apps.auto.components.telecom.PhoneCall) obj;
                defpackage.zbd zbdVar = phoneCall.c() ? defpackage.zbd.G : defpackage.zbd.I;
                int i2 = phoneCall.a;
                defpackage.mwr.c(zbdVar, java.lang.Integer.valueOf(i2));
                if (!defpackage.omf.w().y(i2)) {
                    ((defpackage.yqj) nes.a.h()).y("Call could not be ended. %s", obj);
                }
                return defpackage.afbk.a;
            case 10:
                nes.a((com.google.android.apps.auto.components.telecom.PhoneCall) this.a, false);
                return defpackage.afbk.a;
            case 11:
                java.lang.Object obj2 = this.a;
                defpackage.nfq nfqVar = (defpackage.nfq) obj2;
                defpackage.qsh qshVarE = nfqVar.h;
                if (qshVarE == null) {
                    qshVarE = defpackage.kit.b().e();
                    qshVarE.getClass();
                }
                defpackage.mkp.a.f();
                defpackage.rpe rpeVarF = defpackage.ooa.f(qshVarE);
                nfqVar.j = rpeVarF;
                rpeVarF.f(nfqVar.i, 22, 3);
                defpackage.qsz qszVarA = rpeVarF.a(22);
                if (qszVarA != null) {
                    float[] fArr = qszVarA.c;
                    fArr.getClass();
                    byte[] bArr = qszVarA.d;
                    bArr.getClass();
                    ((defpackage.eqp) obj2).j(java.lang.Boolean.valueOf(defpackage.mvm.r(qszVarA.a, qszVarA.b, fArr, bArr).i().a));
                }
                return defpackage.afbk.a;
            case 12:
                defpackage.mkp.a.g();
                defpackage.oml.B(defpackage.kit.b().e(), com.google.android.gms.car.display.CarDisplayId.a, ((defpackage.ngk) this.a).a());
                return defpackage.afbk.a;
            case 13:
                defpackage.mkp.a.g();
                defpackage.oml.F(defpackage.kit.b().e(), com.google.android.gms.car.display.CarDisplayId.a, ((defpackage.ngk) this.a).a());
                return defpackage.afbk.a;
            case 14:
                defpackage.mkp.a.g();
                com.google.android.gms.car.display.CarDisplayUiFeatures carDisplayUiFeaturesW = defpackage.oml.w(defpackage.kit.b().e(), com.google.android.gms.car.display.CarDisplayId.a);
                carDisplayUiFeaturesW.getClass();
                ((defpackage.ngk) this.a).g(carDisplayUiFeaturesW, "initialization");
                return defpackage.afbk.a;
            case 15:
                defpackage.ngj ngjVar = defpackage.ngk.a;
                defpackage.mkp.a.g();
                rko rkoVarN = defpackage.oml.n((defpackage.qsh) this.a);
                ((defpackage.rps) rkoVarN.b).g(new defpackage.rdp(rkoVarN, com.google.android.gms.car.display.CarDisplayId.a, 13));
                return defpackage.afbk.a;
            case 16:
                defpackage.ngj ngjVar2 = defpackage.ngk.a;
                defpackage.mkp.a.g();
                rko rkoVarN2 = defpackage.oml.n((defpackage.qsh) this.a);
                ((defpackage.rps) rkoVarN2.b).g(new defpackage.rdp(rkoVarN2, com.google.android.gms.car.display.CarDisplayId.a, 14));
                return defpackage.afbk.a;
            case 17:
                java.lang.Object obj3 = this.a;
                defpackage.yqm yqmVar3 = njd.a;
                return defpackage.lvs.R((defpackage.byj) obj3);
            case 18:
                defpackage.nyi nyiVarB = njd.b((defpackage.bys) this.a);
                return java.lang.Integer.valueOf(nyiVarB != null ? nyiVarB.b : 0);
            case 19:
                defpackage.nyi nyiVarB2 = njd.b((defpackage.bys) this.a);
                return java.lang.Boolean.valueOf(nyiVarB2 != null ? nyiVarB2.a : false);
            default:
                java.lang.Object obj4 = this.a;
                defpackage.yqm yqmVar4 = njd.a;
                return defpackage.lvs.R((defpackage.byj) obj4);
        }
    }
}
