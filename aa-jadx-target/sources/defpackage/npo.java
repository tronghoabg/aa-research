package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class npo implements defpackage.affc {
    private final /* synthetic */ int a;

    public /* synthetic */ npo(int i) {
        this.a = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.affc
    public final java.lang.Object invoke(java.lang.Object obj) {
        boolean z = false;
        java.lang.Object[] objArr = 0;
        java.lang.Object[] objArr2 = 0;
        java.lang.Object[] objArr3 = 0;
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                uhj uhjVar = (uhj) obj;
                uhjVar.getClass();
                return uhjVar.b;
            case 1:
                return defpackage.lyd.v(((java.lang.Integer) obj).intValue());
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                uhj uhjVar2 = (uhj) obj;
                uhjVar2.getClass();
                return uhjVar2.j;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                uhj uhjVar3 = (uhj) obj;
                uhjVar3.getClass();
                return uhjVar3.h;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                uhj uhjVar4 = (uhj) obj;
                uhjVar4.getClass();
                return uhjVar4.a;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                kkf kkfVar = (kkf) obj;
                defpackage.npr nprVar = defpackage.npu.a;
                kkfVar.getClass();
                return new npw(kkfVar, (defpackage.afia) null, (defpackage.affc) null, 14);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                kkf kkfVar2 = (kkf) obj;
                defpackage.npr nprVar2 = defpackage.npu.a;
                kkfVar2.getClass();
                return new nqr(kkfVar2);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                kkf kkfVar3 = (kkf) obj;
                defpackage.npr nprVar3 = defpackage.npu.a;
                kkfVar3.getClass();
                return new nqr(kkfVar3);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                kkf kkfVar4 = (kkf) obj;
                defpackage.npr nprVar4 = defpackage.npu.a;
                kkfVar4.getClass();
                return new nqr(kkfVar4);
            case 9:
                kkf kkfVar5 = (kkf) obj;
                defpackage.npr nprVar5 = defpackage.npu.a;
                kkfVar5.getClass();
                return new nqr(kkfVar5);
            case 10:
                int iIntValue = ((java.lang.Integer) obj).intValue();
                defpackage.npr nprVar6 = defpackage.npu.a;
                return java.lang.Integer.valueOf(defpackage.afqt.e(iIntValue, 0));
            case 11:
                kkf kkfVar6 = (kkf) obj;
                defpackage.npr nprVar7 = defpackage.npu.a;
                kkfVar6.getClass();
                return new npw(kkfVar6, (defpackage.afia) null, (defpackage.affc) null, 14);
            case 12:
                int i = -((java.lang.Integer) obj).intValue();
                defpackage.npr nprVar8 = defpackage.npu.a;
                return java.lang.Integer.valueOf(defpackage.afqt.e(i, 0));
            case 13:
                int iIntValue2 = ((java.lang.Integer) obj).intValue();
                defpackage.npr nprVar9 = defpackage.npu.a;
                return java.lang.Integer.valueOf(-iIntValue2);
            case 14:
                kkf kkfVar7 = (kkf) obj;
                defpackage.npr nprVar10 = defpackage.npu.a;
                kkfVar7.getClass();
                return new nqr(kkfVar7);
            case 15:
                kkf kkfVar8 = (kkf) obj;
                defpackage.npr nprVar11 = defpackage.npu.a;
                kkfVar8.getClass();
                return new nqb(kkfVar8);
            case 16:
                int iIntValue3 = ((java.lang.Integer) obj).intValue();
                defpackage.npr nprVar12 = defpackage.npu.a;
                return java.lang.Integer.valueOf(defpackage.afqt.e(iIntValue3, 0));
            case 17:
                java.lang.Integer num = (java.lang.Integer) obj;
                num.intValue();
                return num;
            case 18:
                java.lang.Integer num2 = (java.lang.Integer) obj;
                num2.intValue();
                return num2;
            case 19:
                return defpackage.lyd.v(((java.lang.Integer) obj).intValue());
            default:
                defpackage.mqj mqjVar = (defpackage.mqj) obj;
                defpackage.nqs nqsVar = defpackage.nqw.a;
                int i2 = 6;
                if (mqjVar == null) {
                    return new defpackage.nqt(z, (int) (objArr3 == true ? 1 : 0), i2);
                }
                return mqjVar.b == defpackage.mqg.NAVIGATION ? new defpackage.nqt((boolean) (objArr2 == true ? 1 : 0), (int) (objArr == true ? 1 : 0), i2) : new defpackage.nqt(true, 3, mqjVar.a());
        }
    }
}
