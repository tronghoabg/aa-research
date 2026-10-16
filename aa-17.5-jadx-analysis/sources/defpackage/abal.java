package defpackage;

/* loaded from: classes3.dex */
public final class abal extends abnv implements abox {
    public static final abal a;
    public int b;
    public abbw c;
    public abev d;
    public int e;

    static {
        abal abalVar = new abal();
        a = abalVar;
        abnv.P(abal.class, abalVar);
    }

    private abal() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0002\u0003ဉ\u0001", new Object[]{"b", "c", "e", "d"});
        }
        if (i2 == 3) {
            return new abal();
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
        return abnv.L(abal.class);
    }
}
