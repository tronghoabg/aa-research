package defpackage;

/* loaded from: classes3.dex */
public final class accn extends abnv implements abox {
    public static final accn a;
    public int b;
    public int c = 2;
    public int d = 2;

    static {
        accn accnVar = new accn();
        a = accnVar;
        abnv.P(accn.class, accnVar);
    }

    private accn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new accn();
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
        return abnv.L(accn.class);
    }
}
