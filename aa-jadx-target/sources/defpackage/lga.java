package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class lga implements defpackage.thn {
    private final /* synthetic */ int a;

    public /* synthetic */ lga(int i) {
        this.a = i;
    }

    @Override // defpackage.thn
    public final java.lang.Object a() {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return new defpackage.lgb();
            case 1:
                return new defpackage.kja();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.lgp();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                android.content.Context context = defpackage.mkp.a.c;
                return new defpackage.luv();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.mdk();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return new defpackage.mgr();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new defpackage.mib();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.mmi();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.mqc();
            case 9:
                return new defpackage.mqd();
            case 10:
                return new defpackage.nji();
            case 11:
                if (defpackage.jrj.a()) {
                    return new defpackage.npa();
                }
                return null;
            case 12:
                return new defpackage.nwy();
            case 13:
                return new defpackage.ocn();
            case 14:
                return new defpackage.ojm();
            case 15:
                int i = defpackage.qfn.g;
                return new nvy();
            default:
                int i2 = defpackage.qfn.g;
                return fxr.f(defpackage.actz.u());
        }
    }
}
