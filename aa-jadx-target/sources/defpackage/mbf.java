package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final /* synthetic */ class mbf implements defpackage.thn {
    private final /* synthetic */ int a;

    public /* synthetic */ mbf(int i) {
        this.a = i;
    }

    @Override // defpackage.thn
    public final java.lang.Object a() {
        switch (this.a) {
            case defpackage.abnt.b /* 0 */:
                return new defpackage.mbg(defpackage.mkp.a.c);
            case 1:
                return new java.util.Random();
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return new defpackage.mcj();
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return new defpackage.mcl();
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return new defpackage.mjk();
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                android.content.Context context = defpackage.mkp.a.c;
                return new mjy();
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return new defpackage.mkc();
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return new defpackage.mlv();
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return new defpackage.mmk();
            case 9:
                return new defpackage.moj();
            case 10:
                return new defpackage.moy();
            case 11:
                return new defpackage.mpf();
            case 12:
                return new mpv();
            case 13:
                return new nrq();
            case 14:
                return new nrw();
            case 15:
                defpackage.nse nseVar = new defpackage.nse(defpackage.ler.c());
                nseVar.b.eM(nseVar.a, new defpackage.mmz(nseVar, 18));
                return nseVar;
            case 16:
                return new nsl();
            case 17:
                return new defpackage.nuc(defpackage.mkp.a.c);
            case 18:
                return new defpackage.nux();
            case 19:
                return new defpackage.nwd(defpackage.mkp.a.c);
            default:
                return new nwf();
        }
    }
}
