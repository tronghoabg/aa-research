package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class rdu implements defpackage.rej {
    public final /* synthetic */ defpackage.ref a;
    private final /* synthetic */ int b;

    public /* synthetic */ rdu(defpackage.ref refVar, int i) {
        this.b = i;
        this.a = refVar;
    }

    @Override // defpackage.rej
    public final java.lang.Object a() throws android.os.RemoteException {
        switch (this.b) {
            case defpackage.abnt.b /* 0 */:
                defpackage.ref refVar = this.a;
                return new defpackage.rkc(refVar.C().P(), refVar.c);
            case 1:
                defpackage.ref refVar2 = this.a;
                return new defpackage.rpb(refVar2.C().F(), refVar2.c);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.ref refVar3 = this.a;
                defpackage.roz rozVar = new defpackage.roz(refVar3.C().E(), refVar3.c);
                rozVar.a.c(rozVar.d);
                return rozVar;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new rif(this.a.C().N());
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                defpackage.ref refVar4 = this.a;
                return new defpackage.qsb(refVar4.C().B(), (defpackage.qyl) defpackage.rps.f(new defpackage.rdg(refVar4, 11)));
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                defpackage.ref refVar5 = this.a;
                defpackage.qwn qwnVarA = refVar5.C().A();
                qwnVarA.getClass();
                return new defpackage.rov(qwnVarA, refVar5.c);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                defpackage.ref refVar6 = this.a;
                return new defpackage.qsr((qxm) defpackage.rps.f(new defpackage.rdg(refVar6, 12)), refVar6.C().D(), refVar6.c);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new rfz(this.a.C().z());
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                defpackage.ref refVar7 = this.a;
                return new qsv(refVar7.C().I(), refVar7.c);
            case 9:
                return new defpackage.ros(this.a.C().z());
            default:
                defpackage.rkw rkwVarR = this.a.C().R();
                rkwVarR.getClass();
                return new rko(rkwVarR);
        }
    }
}
