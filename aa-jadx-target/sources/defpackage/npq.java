package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class npq implements defpackage.afer {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ npq(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, kls] */
    /* JADX WARN: Type inference failed for: r14v3, types: [java.lang.Object, kls] */
    @Override // defpackage.afer
    public final java.lang.Object invoke() throws defpackage.qst {
        npm npmVar = null;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                ?? r14 = this.a;
                kkf kkfVarC = defpackage.npu.c(356517131, r14);
                if (kkfVarC != null && juc.e(kkfVarC) < 0) {
                    return new npw(kkfVarC, new defpackage.afia(0, -juc.e(kkfVarC)), new defpackage.npo(12), new defpackage.npo(13));
                }
                defpackage.npu.c.l().R("Requested Control for Seat Cooler is null: Area=%s, propertyNull=%b, minValue=%s", r14, java.lang.Boolean.valueOf(kkfVarC == null), kkfVarC != null ? java.lang.Integer.valueOf(juc.e(kkfVarC)) : null);
                return null;
            case 1:
                ?? r15 = this.a;
                kkf kkfVarC2 = defpackage.npu.c(356517121, r15);
                kkf kkfVarC3 = defpackage.npu.c(356582673, r15);
                if (kkfVarC2 != null && kkfVarC3 != null) {
                    npmVar = new npm(kkfVarC2, kkfVarC3);
                }
                if (npmVar == null) {
                    defpackage.npu.c.l().R("Requested Control for Fan Direction is null: Area=%s, fanDirectionNull=%b, fanDirectionAvailableNull=%b", r15, java.lang.Boolean.valueOf(kkfVarC2 == null), java.lang.Boolean.valueOf(kkfVarC3 == null));
                }
                return npmVar;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.nqu((defpackage.nqw) this.a);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.lang.Object obj = this.a;
                defpackage.nqs nqsVar = defpackage.nqw.a;
                return defpackage.tna.aw((com.google.android.gms.car.animation.ProjectionWindowAnimationChoreography) obj);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.nqs nqsVar2 = defpackage.nqw.a;
                defpackage.mkp.a.g();
                defpackage.oml.E(defpackage.kit.b().e(), (com.google.android.gms.car.display.CarRegionId) this.a);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                ((oxg) this.a).c();
                defpackage.ngy.g().h(nrf.a);
                return defpackage.afbk.a;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                ((oxg) this.a).c();
                return defpackage.afbk.a;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                ((nri) this.a).b.invoke();
                return defpackage.afbk.a;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.noz nozVar = ((nro) this.a).c;
                if (nozVar != null) {
                    nozVar.e(false);
                }
                return defpackage.afbk.a;
            case 9:
                defpackage.noz nozVar2 = ((nro) this.a).d;
                if (nozVar2 != null) {
                    nozVar2.e(false);
                }
                return defpackage.afbk.a;
            case 10:
                defpackage.nrc.a.a().b();
                ((nrp) this.a).i(defpackage.zbd.LM);
                return defpackage.afbk.a;
            case 11:
                defpackage.nrc.a.a().b();
                android.view.KeyEvent keyEvent = new android.view.KeyEvent(0L, android.os.SystemClock.uptimeMillis(), 0, 4, 0, 0, 0, 0, 4);
                android.view.KeyEvent keyEvent2 = new android.view.KeyEvent(0L, android.os.SystemClock.uptimeMillis(), 1, 4, 0, 0, 0, 0, 4);
                com.google.android.gms.car.display.CarRegionId carRegionIdR = defpackage.nte.c().b().r(defpackage.nta.d);
                nrp nrpVar = (nrp) this.a;
                nrpVar.h().g(carRegionIdR, keyEvent);
                nrpVar.h().g(carRegionIdR, keyEvent2);
                nrpVar.i(defpackage.zbd.LJ);
                return defpackage.afbk.a;
            case 12:
                defpackage.nse.b().a().eN();
                ((nrp) this.a).i(defpackage.zbd.LK);
                return defpackage.afbk.a;
            case 13:
                defpackage.mkp.a.g();
                return defpackage.oml.o((defpackage.qsh) this.a, com.google.android.gms.car.display.CarDisplayId.a).d();
            case 14:
                float f = nwl.a;
                ((defpackage.kmm) this.a).requestFocus();
                return defpackage.afbk.a;
            case 15:
                java.lang.Runnable runnable = (java.lang.Runnable) ((nwl) this.a).h.a();
                if (runnable != null) {
                    runnable.run();
                }
                return defpackage.afbk.a;
            case 16:
                defpackage.nxh nxhVar = (defpackage.nxh) this.a;
                int i = nxhVar.u;
                if (i == 0) {
                    throw null;
                }
                defpackage.mcl.C(nxhVar, defpackage.mcl.E(i, 0));
                return defpackage.afbk.a;
            case 17:
                defpackage.nxh nxhVar2 = (defpackage.nxh) this.a;
                int i2 = nxhVar2.u;
                if (i2 == 0) {
                    throw null;
                }
                defpackage.mcl.C(nxhVar2, defpackage.mcl.E(i2, 1));
                return defpackage.afbk.a;
            case 18:
                defpackage.nxh nxhVar3 = (defpackage.nxh) this.a;
                int i3 = nxhVar3.u;
                if (i3 == 0) {
                    throw null;
                }
                defpackage.mcl.C(nxhVar3, defpackage.mcl.E(i3, 2));
                return defpackage.afbk.a;
            case 19:
                defpackage.nxh nxhVar4 = (defpackage.nxh) this.a;
                defpackage.mcl.H(nxhVar4.m);
                defpackage.mcl.C(nxhVar4, defpackage.zbd.nX);
                nxhVar4.g.run();
                return defpackage.afbk.a;
            default:
                defpackage.nxh nxhVar5 = (defpackage.nxh) this.a;
                nxhVar5.g.run();
                defpackage.mcl.C(nxhVar5, defpackage.zbd.oa);
                return defpackage.afbk.a;
        }
    }
}
