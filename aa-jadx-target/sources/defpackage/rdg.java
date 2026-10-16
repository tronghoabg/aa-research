package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rdg implements defpackage.rzz {
    public final /* synthetic */ java.lang.Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ rdg(java.lang.Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v43, types: [java.lang.Object, qvl] */
    @Override // defpackage.rzz, java.util.concurrent.Callable
    public final java.lang.Object call() throws android.os.RemoteException {
        int i = 1;
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.ref refVar = (defpackage.ref) this.a;
                return (rfz) refVar.g.b(rfz.class, new defpackage.rdu(refVar, 7));
            case 1:
                return ((defpackage.imi) this.a).y().z();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.ref refVar2 = (defpackage.ref) this.a;
                return (qsv) refVar2.g.b(qsv.class, new defpackage.rdu(refVar2, 8));
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                defpackage.zif zifVar = new defpackage.zif();
                ((defpackage.ref) this.a).C().aq(new red(zifVar));
                return zifVar;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return java.lang.Integer.valueOf(((defpackage.ref) this.a).C().h());
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return java.lang.Boolean.valueOf(((defpackage.ref) this.a).C().bo());
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.ref refVar3 = (defpackage.ref) this.a;
                return (defpackage.rpb) refVar3.g.b(defpackage.rpb.class, new defpackage.rdu(refVar3, i));
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                defpackage.ref refVar4 = (defpackage.ref) this.a;
                return (defpackage.rpb) refVar4.g.b(defpackage.rpb.class, new defpackage.rdu(refVar4, i));
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.ref refVar5 = (defpackage.ref) this.a;
                return (defpackage.roz) refVar5.g.b(defpackage.roz.class, new defpackage.rdu(refVar5, 2));
            case 9:
                return java.lang.Boolean.valueOf(this.a.bs());
            case 10:
                defpackage.ref refVar6 = (defpackage.ref) this.a;
                return (defpackage.qsr) refVar6.g.b(defpackage.qsr.class, new defpackage.rdu(refVar6, 6));
            case 11:
                return ((defpackage.ref) this.a).C().G();
            case 12:
                return ((defpackage.ref) this.a).C().bC();
            case 13:
                return ((defpackage.ref) this.a).C().r();
            case 14:
                return new defpackage.erh(((defpackage.ref) this.a).C().M());
            case 15:
                defpackage.ref refVar7 = (defpackage.ref) this.a;
                if (refVar7.p(defpackage.rbf.R)) {
                    return (rif) refVar7.g.b(rif.class, new defpackage.rdu(refVar7, 3));
                }
                throw new java.lang.IllegalStateException("This API can only be used if the hero car media feature is enabled");
            case 16:
                defpackage.ref refVar8 = (defpackage.ref) this.a;
                return (defpackage.rov) refVar8.g.b(defpackage.rov.class, new defpackage.rdu(refVar8, 5));
            case 17:
                defpackage.ref refVar9 = (defpackage.ref) this.a;
                return (defpackage.qsb) refVar9.g.b(defpackage.qsb.class, new defpackage.rdu(refVar9, 4));
            case 18:
                return java.lang.Integer.valueOf(((defpackage.ref) this.a).C().fo());
            case 19:
                defpackage.ref refVar10 = (defpackage.ref) this.a;
                return (defpackage.rkc) refVar10.g.b(defpackage.rkc.class, new defpackage.rdu(refVar10, 0));
            default:
                defpackage.ref refVar11 = (defpackage.ref) this.a;
                return (defpackage.ros) refVar11.g.b(defpackage.ros.class, new defpackage.rdu(refVar11, 9));
        }
    }
}
