package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class jph implements defpackage.jpw {
    public final /* synthetic */ defpackage.jpy a;
    private final /* synthetic */ int b;

    public /* synthetic */ jph(defpackage.jpy jpyVar, int i) {
        this.b = i;
        this.a = jpyVar;
    }

    @Override // defpackage.jpw, java.util.concurrent.Callable
    public final java.lang.Object call() throws android.os.RemoteException {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.qxq qxqVarD = this.a.m().D();
                qxqVarD.getClass();
                return qxqVarD;
            case 1:
                return java.lang.Boolean.valueOf(this.a.m().bx());
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return this.a.m().r();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                java.util.List listAc = this.a.m().ac();
                listAc.getClass();
                return listAc;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                com.google.android.gms.car.CarInfo carInfoS = this.a.m().s();
                carInfoS.getClass();
                return carInfoS;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.rkw rkwVarR = this.a.m().R();
                rkwVarR.getClass();
                return rkwVarR;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                qxm qxmVarBC = this.a.m().bC();
                qxmVarBC.getClass();
                return qxmVarBC;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return java.lang.Integer.valueOf(this.a.m().h());
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                qxh qxhVarC = this.a.m().C();
                qxhVarC.getClass();
                return qxhVarC;
            case 9:
                defpackage.rlf rlfVarS = this.a.m().S();
                rlfVarS.getClass();
                return rlfVarS;
            case 10:
                defpackage.qvx qvxVarZ = this.a.m().z();
                qvxVarZ.getClass();
                return qvxVarZ;
            case 11:
                return this.a.m().G();
            case 12:
                return this.a.m().bB();
            case 13:
                defpackage.rji rjiVarO = this.a.m().O();
                rjiVarO.getClass();
                return rjiVarO;
            case 14:
                defpackage.qxw qxwVarE = this.a.m().E();
                qxwVarE.getClass();
                return qxwVarE;
            case 15:
                defpackage.qzd qzdVarJ = this.a.m().J();
                qzdVarJ.getClass();
                return qzdVarJ;
            case 16:
                defpackage.qyl qylVarH = this.a.m().H();
                qylVarH.getClass();
                return qylVarH;
            case 17:
                return java.lang.Boolean.valueOf(this.a.m().bs());
            case 18:
                defpackage.rli rliVarT = this.a.m().T();
                rliVarT.getClass();
                return rliVarT;
            case 19:
                com.google.android.gms.car.CarUiInfo carUiInfoU = this.a.m().u();
                carUiInfoU.getClass();
                return carUiInfoU;
            default:
                defpackage.qyx qyxVarI = this.a.m().I();
                qyxVarI.getClass();
                return qyxVarI;
        }
    }
}
