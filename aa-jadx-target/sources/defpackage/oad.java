package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class oad implements defpackage.thn {
    private final /* synthetic */ int a;

    @Override // defpackage.thn
    public final java.lang.Object a() {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return new oae();
            case 1:
                return new defpackage.nzg();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                defpackage.yqm yqmVar = defpackage.ntb.a;
                return new odn();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new oea();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                int i = defpackage.qfn.g;
                return new lxp();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                int i2 = defpackage.qfn.g;
                return new lxt();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                int i3 = defpackage.qfn.g;
                return new lxo();
            default:
                int i4 = defpackage.qfn.g;
                return new lxs();
        }
    }
}
