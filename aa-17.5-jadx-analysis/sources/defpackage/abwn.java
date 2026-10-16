package defpackage;

/* loaded from: classes3.dex */
public final class abwn extends abnv implements abox {
    public static final abwn a;
    public int b;
    public String c = "";
    public abuq d;
    public abvf e;
    public abwm f;
    public abvn g;

    static {
        abwn abwnVar = new abwn();
        a = abwnVar;
        abnv.P(abwn.class, abwnVar);
    }

    private abwn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new abwn();
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
        return abnv.L(abwn.class);
    }
}
