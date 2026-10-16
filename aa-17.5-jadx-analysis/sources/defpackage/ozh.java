package defpackage;

/* loaded from: classes2.dex */
public final class ozh extends abnv implements abox {
    public static final ozh a;
    public int b;
    public int g;
    public int i;
    public String c = "";
    public String d = "";
    public String e = "";
    public String f = "";
    public String h = "";

    static {
        ozh ozhVar = new ozh();
        a = ozhVar;
        abnv.P(ozh.class, ozhVar);
    }

    private ozh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဈ\u0005\u0007᠌\u0006", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", xou.k});
        }
        if (i2 == 3) {
            return new ozh();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(ozh.class);
    }
}
