package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class acnn implements defpackage.wco {
    private final /* synthetic */ int a;

    public /* synthetic */ acnn(int i) {
        this.a = i;
    }

    @Override // defpackage.wco
    public final java.lang.Object a(java.lang.Object obj) throws defpackage.abpp {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return defpackage.acmj.s(obj);
            case 1:
                return defpackage.acmj.s(obj);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return defpackage.acmj.t(obj);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return defpackage.acmj.b(obj);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return defpackage.acmj.s(obj);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return defpackage.acmj.b(obj);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.acmj.b(obj);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.acmj.b(obj);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.acmj.s(obj);
            case 9:
                return defpackage.acmj.s(obj);
            case 10:
                return defpackage.acmj.b(obj);
            case 11:
                byte[] bArr = (byte[]) obj;
                defpackage.abox aboxVarD = defpackage.abox.D(defpackage.absi.a, bArr, 0, bArr.length, defpackage.abol.a);
                defpackage.abox.U(aboxVarD);
                return (defpackage.absi) aboxVarD;
            case 12:
                return defpackage.acmj.s(obj);
            case 13:
                return defpackage.acmj.s(obj);
            case 14:
                return defpackage.acmj.s(obj);
            case 15:
                byte[] bArr2 = (byte[]) obj;
                defpackage.abox aboxVarD2 = defpackage.abox.D(defpackage.absc.a, bArr2, 0, bArr2.length, defpackage.abol.a);
                defpackage.abox.U(aboxVarD2);
                return (defpackage.absc) aboxVarD2;
            case 16:
                byte[] bArr3 = (byte[]) obj;
                defpackage.abox aboxVarD3 = defpackage.abox.D(defpackage.absn.a, bArr3, 0, bArr3.length, defpackage.abol.a);
                defpackage.abox.U(aboxVarD3);
                return (defpackage.absn) aboxVarD3;
            case 17:
                return defpackage.acmj.s(obj);
            case 18:
                byte[] bArr4 = (byte[]) obj;
                defpackage.abox aboxVarD4 = defpackage.abox.D(defpackage.addg.a, bArr4, 0, bArr4.length, defpackage.abol.a);
                defpackage.abox.U(aboxVarD4);
                return (defpackage.addg) aboxVarD4;
            case 19:
                return defpackage.acmj.t(obj);
            default:
                return defpackage.acmj.a(obj);
        }
    }
}
