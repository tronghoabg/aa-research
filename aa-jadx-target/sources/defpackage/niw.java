package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class niw implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ niw(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0210  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [bys, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v70, types: [java.lang.Object, kls] */
    /* JADX WARN: Type inference failed for: r6v76, types: [java.lang.Object, kls] */
    /* JADX WARN: Type inference failed for: r6v78, types: [java.lang.Object, kls] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() {
        kkf npgVar = null;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.yqm yqmVar = njd.a;
                return java.lang.Boolean.valueOf(((java.lang.Number) this.a.a()).intValue() == 2);
            case 1:
                java.lang.Object obj = this.a;
                defpackage.yqm yqmVar2 = njd.a;
                return defpackage.lvs.R((defpackage.byj) obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.nkq(((njv) this.a).a().l, 2);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.nkq(((njv) this.a).a().l, 2);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.nkg((defpackage.nkj) this.a);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.mkp.a.g();
                defpackage.qsh qshVarE = ((defpackage.nkp) this.a).b;
                if (qshVarE == null) {
                    qshVarE = defpackage.kit.b().e();
                    qshVarE.getClass();
                }
                return defpackage.oml.v(qshVarE, com.google.android.gms.car.display.CarDisplayId.a);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((defpackage.nkp) this.a).l();
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.kjx.a.a().l(((kjo) this.a).a.a);
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                int i = nky.a;
                java.lang.Object obj2 = this.a;
                if (obj2 != null) {
                    defpackage.kjx.a.a().l(((com.google.android.gms.car.control.CarAction) obj2).a);
                }
                return defpackage.afbk.a;
            case 9:
                defpackage.kjx.a.a().l(((com.google.android.gms.car.control.CarAction) this.a).a);
                return defpackage.afbk.a;
            case 10:
                defpackage.yqm yqmVar3 = nls.a;
                defpackage.kjx.a.a().l(((com.google.android.gms.car.control.CarAction) this.a).a);
                return defpackage.afbk.a;
            case 11:
                defpackage.kjx.a.a().l(((com.google.android.gms.car.control.CarAction) this.a).a);
                return defpackage.afbk.a;
            case 12:
                int i2 = defpackage.nob.a;
                ((defpackage.noc) this.a).b.invoke();
                return defpackage.afbk.a;
            case 13:
                ((defpackage.nxj) this.a).a();
                return defpackage.afbk.a;
            case 14:
                int i3 = noq.a;
                ((defpackage.nod) this.a).b.b.invoke();
                return defpackage.afbk.a;
            case 15:
                int i4 = noq.a;
                ((defpackage.noc) this.a).b.invoke();
                return defpackage.afbk.a;
            case 16:
                int i5 = noq.a;
                ((defpackage.nod) this.a).n.invoke();
                return defpackage.afbk.a;
            case 17:
                ?? r6 = this.a;
                kkf kkfVarC = defpackage.npu.c(289408269, r6);
                if (kkfVarC != null && juc.d(kkfVarC) > 0) {
                    return new npw(kkfVarC, new defpackage.afia(0, juc.d(kkfVarC)), new defpackage.npo(10), 8);
                }
                defpackage.npu.c.l().R("Requested Control for Steering Wheel Heat is null: Area=%s, propertyNull=%b, maxValue=%s", r6, java.lang.Boolean.valueOf(kkfVarC == null), kkfVarC != null ? java.lang.Integer.valueOf(juc.d(kkfVarC)) : null);
                return null;
            case 18:
                kls klsVar = ((klx) this.a).b;
                kkf kkfVarC2 = defpackage.npu.c(627081341, klsVar);
                kkf kkfVarC3 = defpackage.npu.c(627081339, klsVar);
                if (kkfVarC2 != null && kkfVarC3 != null) {
                    return new npp(kkfVarC2, kkfVarC3);
                }
                defpackage.npu.c.l().R("Requested Control for Hmg Temperature is null: Area=%s, celsiusNull=%b, fahrenheitNull=%b", klsVar, java.lang.Boolean.valueOf(kkfVarC2 == null), java.lang.Boolean.valueOf(kkfVarC3 == null));
                return null;
            case 19:
                ?? r7 = this.a;
                kkf kkfVarC4 = defpackage.npu.c(356517131, r7);
                if (kkfVarC4 != null && juc.d(kkfVarC4) > 0) {
                    return new npw(kkfVarC4, new defpackage.afia(0, juc.d(kkfVarC4)), new defpackage.npo(16), 8);
                }
                defpackage.npu.c.l().R("Requested Control for Seat Heater is null: Area=%s, propertyNull=%b, maxValue=%s", r7, java.lang.Boolean.valueOf(kkfVarC4 == null), kkfVarC4 != null ? java.lang.Integer.valueOf(juc.d(kkfVarC4)) : null);
                return null;
            default:
                ?? r8 = this.a;
                kkf kkfVarC5 = defpackage.npu.c(354419973, r8);
                kkf kkfVarC6 = defpackage.npu.c(354419974, r8);
                if (kkfVarC5 == null) {
                    if (kkfVarC6 != null) {
                    }
                    if (npgVar == null) {
                        defpackage.ypu ypuVarL = defpackage.npu.c.l();
                        java.lang.Boolean bool = java.lang.Boolean.TRUE;
                        ypuVarL.R("Requested Control for AC is null: Area=%s, acOnNull=%b, maxAcNull=%b", r8, bool, bool);
                    }
                    return npgVar;
                }
                npgVar = kkfVarC5;
                npgVar = new npg(npgVar, kkfVarC6);
                if (npgVar == null) {
                    defpackage.ypu ypuVarL2 = defpackage.npu.c.l();
                    java.lang.Boolean bool2 = java.lang.Boolean.TRUE;
                    ypuVarL2.R("Requested Control for AC is null: Area=%s, acOnNull=%b, maxAcNull=%b", r8, bool2, bool2);
                }
                return npgVar;
        }
    }
}
