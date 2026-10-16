package defpackage;

/* loaded from: classes3.dex */
public final class acbh extends abnv implements abox {
    public static final acbh a;
    public int b;
    public int c;
    public String d = "";
    public String e = "";
    private aapd f;

    static {
        acbh acbhVar = new acbh();
        a = acbhVar;
        abnv.P(acbh.class, acbhVar);
    }

    private acbh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"b", "c", absk.i, "f", "d", "e"});
        }
        if (i2 == 3) {
            return new acbh();
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
        return abnv.L(acbh.class);
    }
}
