package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
final class xlv implements defpackage.abpd {
    private final /* synthetic */ int v;
    static final defpackage.abpd u = new defpackage.xlv(20);
    static final defpackage.abpd t = new defpackage.xlv(19);
    static final defpackage.abpd s = new defpackage.xlv(18);
    static final defpackage.abpd r = new defpackage.xlv(17);
    static final defpackage.abpd q = new defpackage.xlv(16);
    static final defpackage.abpd p = new defpackage.xlv(15);
    static final defpackage.abpd o = new defpackage.xlv(14);
    static final defpackage.abpd n = new defpackage.xlv(13);
    static final defpackage.abpd m = new defpackage.xlv(12);
    static final defpackage.abpd l = new defpackage.xlv(11);
    static final defpackage.abpd k = new defpackage.xlv(10);
    static final defpackage.abpd j = new defpackage.xlv(9);
    static final defpackage.abpd i = new defpackage.xlv(8);
    static final defpackage.abpd h = new defpackage.xlv(7);
    static final defpackage.abpd g = new defpackage.xlv(6);
    static final defpackage.abpd f = new defpackage.xlv(5);
    static final defpackage.abpd e = new defpackage.xlv(4);
    static final defpackage.abpd d = new defpackage.xlv(3);
    static final defpackage.abpd c = new defpackage.xlv(2);
    static final defpackage.abpd b = new defpackage.xlv(1);
    static final defpackage.abpd a = new defpackage.xlv(0);

    private xlv(int i2) {
        this.v = i2;
    }

    @Override // defpackage.abpd
    public final boolean a(int i2) {
        switch (this.v) {
            case defpackage.abnt.b /* 0 */:
                return defpackage.a.aN(i2);
            case 1:
                return defpackage.a.aT(i2);
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return xlz.b(i2) != null;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return defpackage.a.aQ(i2);
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return defpackage.a.aD(i2) != 0;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return defpackage.wqn.y(i2) != 0;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.a.aQ(i2);
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.wqn.x(i2) != 0;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                return defpackage.a.aT(i2);
            case 9:
                return defpackage.a.aN(i2);
            case 10:
                return defpackage.xnd.b(i2) != null;
            case 11:
                return xnk.b(i2) != null;
            case 12:
                return defpackage.wqn.w(i2) != 0;
            case 13:
                return xnm.b(i2) != null;
            case 14:
                return xnv.b(i2) != null;
            case 15:
                return defpackage.wva.t(i2);
            case 16:
                return defpackage.wva.t(i2);
            case 17:
                return defpackage.a.az(i2) != 0;
            case 18:
                return xou.b(i2) != null;
            case 19:
                return defpackage.a.aT(i2);
            default:
                return defpackage.xpr.b(i2) != null;
        }
    }
}
