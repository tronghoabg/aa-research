package defpackage;

/* loaded from: classes3.dex */
public final class abdp extends abnv implements abox {
    public static final abdp a;
    public int b;
    public String c = "";
    public abdo d;

    static {
        abdp abdpVar = new abdp();
        a = abdpVar;
        abnv.P(abdp.class, abdpVar);
    }

    private abdp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abdp();
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
        return abnv.L(abdp.class);
    }
}
