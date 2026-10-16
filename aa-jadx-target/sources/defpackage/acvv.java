package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class acvv implements defpackage.wco {
    private final /* synthetic */ int a;

    public /* synthetic */ acvv(int i) {
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
                return defpackage.acmj.s(obj);
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return defpackage.acmj.s(obj);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return defpackage.acmj.s(obj);
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return defpackage.acmj.s(obj);
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                byte[] bArr = (byte[]) obj;
                defpackage.abox aboxVarD = defpackage.abox.D(defpackage.absc.a, bArr, 0, bArr.length, defpackage.abol.a);
                defpackage.abox.U(aboxVarD);
                return (defpackage.absc) aboxVarD;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.acmj.s(obj);
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.acmj.b(obj);
            case 9:
                return defpackage.acmj.s(obj);
            case 10:
                byte[] bArr2 = (byte[]) obj;
                defpackage.abox aboxVarD2 = defpackage.abox.D(defpackage.rsc.a, bArr2, 0, bArr2.length, defpackage.abol.a);
                defpackage.abox.U(aboxVarD2);
                return (defpackage.rsc) aboxVarD2;
            case 11:
                return defpackage.acmj.t(obj);
            default:
                return defpackage.acmj.t(obj);
        }
    }
}
