package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class bsf {
    public static final /* synthetic */ int a = 0;

    static {
        new defpackage.byu(new defpackage.bli(13));
    }

    public static final defpackage.dgd a(int i, defpackage.bve bveVar) {
        defpackage.bse bseVarP = defpackage.bxi.p(bveVar);
        if (i == 0) {
            throw null;
        }
        switch (i - 1) {
            case defpackage.abnt.b /* 0 */:
                return bseVarP.j;
            case 1:
                return bseVarP.k;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return bseVarP.l;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return bseVarP.a;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return bseVarP.b;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return bseVarP.c;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return bseVarP.d;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return bseVarP.e;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return bseVarP.f;
            case 9:
                return bseVarP.m;
            case 10:
                return bseVarP.n;
            case 11:
            default:
                return bseVarP.o;
            case 12:
                return bseVarP.g;
            case 13:
                return bseVarP.h;
            case 14:
                return bseVarP.i;
        }
    }
}
