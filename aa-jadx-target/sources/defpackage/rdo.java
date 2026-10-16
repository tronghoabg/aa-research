package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rdo implements defpackage.rzz {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rdo(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v54, types: [java.lang.Object, rli] */
    /* JADX WARN: Type inference failed for: r3v57, types: [java.lang.Object, rlf] */
    @Override // defpackage.rzz, java.util.concurrent.Callable
    public final java.lang.Object call() throws android.os.RemoteException {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.qvl qvlVarC = ((defpackage.ref) this.a).C();
                int i = defpackage.ygw.d;
                return defpackage.yhx.n(qvlVarC.ad("car_module_feature_set", defpackage.ymx.a));
            case 1:
                return ((defpackage.ref) this.a).C().aa();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                final defpackage.ref refVar = (defpackage.ref) this.a;
                final int i2 = 1;
                return (defpackage.rkp) refVar.g.b(defpackage.rkp.class, new defpackage.rej() { // from class: rdm
                    @Override // defpackage.rej
                    public final java.lang.Object a() throws android.os.RemoteException {
                        int i3 = i2;
                        if (i3 == 0) {
                            defpackage.ref refVar2 = refVar;
                            defpackage.qzd qzdVarJ = refVar2.C().J();
                            qzdVarJ.getClass();
                            return new defpackage.rpe(qzdVarJ, refVar2.c);
                        }
                        defpackage.ref refVar3 = refVar;
                        if (i3 != 1) {
                            if (i3 == 2) {
                                return new defpackage.rjf(refVar3.C().O());
                            }
                            defpackage.rli rliVarT = refVar3.C().T();
                            rliVarT.getClass();
                            return new defpackage.rkq(rliVarT);
                        }
                        if (!refVar3.p(defpackage.rbf.t)) {
                            return new rlm(refVar3.C().L(), refVar3.d);
                        }
                        if (defpackage.omv.c("CAR.CLIENT", 3)) {
                            boolean z = defpackage.rrx.a;
                            defpackage.rrx.d(3, "CAR.CLIENT", null, "Multi-display client enabled. Get ICarDisplayManager", new java.lang.Object[0]);
                        }
                        defpackage.rlf rlfVarS = refVar3.C().S();
                        rlfVarS.getClass();
                        return new defpackage.rln(rlfVarS);
                    }
                });
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                final defpackage.ref refVar2 = (defpackage.ref) this.a;
                if (!refVar2.p(defpackage.rbf.U)) {
                    throw new java.lang.IllegalStateException("This API can only be used if the hero theming feature is enabled");
                }
                final int i3 = 3;
                return (defpackage.rkq) refVar2.g.b(defpackage.rkq.class, new defpackage.rej() { // from class: rdm
                    @Override // defpackage.rej
                    public final java.lang.Object a() throws android.os.RemoteException {
                        int i4 = i3;
                        if (i4 == 0) {
                            defpackage.ref refVar3 = refVar2;
                            defpackage.qzd qzdVarJ = refVar3.C().J();
                            qzdVarJ.getClass();
                            return new defpackage.rpe(qzdVarJ, refVar3.c);
                        }
                        defpackage.ref refVar4 = refVar2;
                        if (i4 != 1) {
                            if (i4 == 2) {
                                return new defpackage.rjf(refVar4.C().O());
                            }
                            defpackage.rli rliVarT = refVar4.C().T();
                            rliVarT.getClass();
                            return new defpackage.rkq(rliVarT);
                        }
                        if (!refVar4.p(defpackage.rbf.t)) {
                            return new rlm(refVar4.C().L(), refVar4.d);
                        }
                        if (defpackage.omv.c("CAR.CLIENT", 3)) {
                            boolean z = defpackage.rrx.a;
                            defpackage.rrx.d(3, "CAR.CLIENT", null, "Multi-display client enabled. Get ICarDisplayManager", new java.lang.Object[0]);
                        }
                        defpackage.rlf rlfVarS = refVar4.C().S();
                        rlfVarS.getClass();
                        return new defpackage.rln(rlfVarS);
                    }
                });
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                final defpackage.ref refVar3 = (defpackage.ref) this.a;
                final int i4 = 0;
                return (defpackage.rpe) refVar3.g.b(defpackage.rpe.class, new defpackage.rej() { // from class: rdm
                    @Override // defpackage.rej
                    public final java.lang.Object a() throws android.os.RemoteException {
                        int i5 = i4;
                        if (i5 == 0) {
                            defpackage.ref refVar4 = refVar3;
                            defpackage.qzd qzdVarJ = refVar4.C().J();
                            qzdVarJ.getClass();
                            return new defpackage.rpe(qzdVarJ, refVar4.c);
                        }
                        defpackage.ref refVar5 = refVar3;
                        if (i5 != 1) {
                            if (i5 == 2) {
                                return new defpackage.rjf(refVar5.C().O());
                            }
                            defpackage.rli rliVarT = refVar5.C().T();
                            rliVarT.getClass();
                            return new defpackage.rkq(rliVarT);
                        }
                        if (!refVar5.p(defpackage.rbf.t)) {
                            return new rlm(refVar5.C().L(), refVar5.d);
                        }
                        if (defpackage.omv.c("CAR.CLIENT", 3)) {
                            boolean z = defpackage.rrx.a;
                            defpackage.rrx.d(3, "CAR.CLIENT", null, "Multi-display client enabled. Get ICarDisplayManager", new java.lang.Object[0]);
                        }
                        defpackage.rlf rlfVarS = refVar5.C().S();
                        rlfVarS.getClass();
                        return new defpackage.rln(rlfVarS);
                    }
                });
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return ((defpackage.ref) this.a).C().s();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                final defpackage.ref refVar4 = (defpackage.ref) this.a;
                if (!refVar4.p(defpackage.rbf.Q)) {
                    throw new java.lang.IllegalStateException("This API can only be used if the hero car controls feature is enabled");
                }
                final int i5 = 2;
                return (defpackage.rjf) refVar4.g.b(defpackage.rjf.class, new defpackage.rej() { // from class: rdm
                    @Override // defpackage.rej
                    public final java.lang.Object a() throws android.os.RemoteException {
                        int i6 = i5;
                        if (i6 == 0) {
                            defpackage.ref refVar5 = refVar4;
                            defpackage.qzd qzdVarJ = refVar5.C().J();
                            qzdVarJ.getClass();
                            return new defpackage.rpe(qzdVarJ, refVar5.c);
                        }
                        defpackage.ref refVar6 = refVar4;
                        if (i6 != 1) {
                            if (i6 == 2) {
                                return new defpackage.rjf(refVar6.C().O());
                            }
                            defpackage.rli rliVarT = refVar6.C().T();
                            rliVarT.getClass();
                            return new defpackage.rkq(rliVarT);
                        }
                        if (!refVar6.p(defpackage.rbf.t)) {
                            return new rlm(refVar6.C().L(), refVar6.d);
                        }
                        if (defpackage.omv.c("CAR.CLIENT", 3)) {
                            boolean z = defpackage.rrx.a;
                            defpackage.rrx.d(3, "CAR.CLIENT", null, "Multi-display client enabled. Get ICarDisplayManager", new java.lang.Object[0]);
                        }
                        defpackage.rlf rlfVarS = refVar6.C().S();
                        rlfVarS.getClass();
                        return new defpackage.rln(rlfVarS);
                    }
                });
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return ((defpackage.shg) ((defpackage.ret) this.a).e).b().a();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return ((defpackage.shg) ((defpackage.ret) this.a).e).b().c();
            case 9:
                return ((defpackage.shg) ((defpackage.ret) this.a).e).b().g();
            case 10:
                return java.lang.Integer.valueOf(this.a.a());
            default:
                return this.a.f();
        }
    }
}
