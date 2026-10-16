package defpackage;

/* loaded from: classes3.dex */
public final class acic extends abnv implements abox {
    public static final acic a;
    public int b;
    public float e;
    public String c = "";
    public String d = "";
    public String f = "";
    public String g = "";

    static {
        acic acicVar = new acic();
        a = acicVar;
        abnv.P(acic.class, acicVar);
    }

    private acic() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ခ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new acic();
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
        return abnv.L(acic.class);
    }
}
