package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class xmo implements defpackage.abpd {
    private final /* synthetic */ int s;
    public static final defpackage.abpd r = new defpackage.xmo(17);
    public static final defpackage.abpd q = new defpackage.xmo(16);
    public static final defpackage.abpd p = new defpackage.xmo(15);
    public static final defpackage.abpd o = new defpackage.xmo(14);
    public static final defpackage.abpd n = new defpackage.xmo(13);
    public static final defpackage.abpd m = new defpackage.xmo(12);
    public static final defpackage.abpd l = new defpackage.xmo(11);
    public static final defpackage.abpd k = new defpackage.xmo(10);
    public static final defpackage.abpd j = new defpackage.xmo(9);
    public static final defpackage.abpd i = new defpackage.xmo(8);
    static final defpackage.abpd h = new defpackage.xmo(7);
    static final defpackage.abpd g = new defpackage.xmo(6);
    static final defpackage.abpd f = new defpackage.xmo(5);
    static final defpackage.abpd e = new defpackage.xmo(4);
    static final defpackage.abpd d = new defpackage.xmo(3);
    static final defpackage.abpd c = new defpackage.xmo(2);
    static final defpackage.abpd b = new defpackage.xmo(1);
    static final defpackage.abpd a = new defpackage.xmo(0);

    private xmo(int i2) {
        this.s = i2;
    }

    @Override // defpackage.abpd
    public final boolean a(int i2) {
        defpackage.yyo yyoVar;
        switch (this.s) {
            case defpackage.abnt.b /* 0 */:
                return defpackage.wva.s(i2) != 0;
            case 1:
                return defpackage.xls.b(i2) != null;
            case defpackage.eie.FLOAT_FIELD_NUMBER /* 2 */:
                return defpackage.xoz.b(i2) != null;
            case defpackage.eie.INTEGER_FIELD_NUMBER /* 3 */:
                return defpackage.a.aq(i2) != 0;
            case defpackage.eie.LONG_FIELD_NUMBER /* 4 */:
                return defpackage.sqs.aZ(i2) != 0;
            case defpackage.eie.STRING_FIELD_NUMBER /* 5 */:
                return defpackage.xqd.b(i2) != null;
            case defpackage.eie.STRING_SET_FIELD_NUMBER /* 6 */:
                return defpackage.xqf.b(i2) != null;
            case defpackage.eie.DOUBLE_FIELD_NUMBER /* 7 */:
                return defpackage.wva.s(i2) != 0;
            case defpackage.eie.BYTES_FIELD_NUMBER /* 8 */:
                if (i2 == 0) {
                    yyoVar = defpackage.yyo.CONNECTION_RESET_ORIGIN_UNSPECIFIED;
                } else if (i2 == 1) {
                    yyoVar = defpackage.yyo.CONNECTION_RESET_ORIGIN_DEATH_RECIPIENT;
                } else if (i2 == 2) {
                    yyoVar = defpackage.yyo.CONNECTION_RESET_ORIGIN_CRASH_HANDLER;
                } else if (i2 != 3) {
                    yyoVar = i2 != 4 ? null : defpackage.yyo.CONNECTION_RESET_ORIGIN_PRE_SETUP;
                } else {
                    yyoVar = defpackage.yyo.CONNECTION_RESET_ORIGIN_USB_MONITOR;
                }
                return yyoVar != null;
            case 9:
                return defpackage.a.aK(i2);
            case 10:
                return defpackage.zir.b(i2) != null;
            case 11:
                return defpackage.a.aD(i2) != 0;
            case 12:
                return afzh.S(i2) != 0;
            case 13:
                return defpackage.a.aQ(i2);
            case 14:
                return defpackage.a.aN(i2);
            case 15:
                return defpackage.a.aL(i2);
            case 16:
                return defpackage.a.aM(i2);
            default:
                return defpackage.a.aK(i2);
        }
    }
}
