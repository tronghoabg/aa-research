package defpackage;

/* loaded from: classes2.dex */
public final class pjx extends abnv implements abox {
    public static final pjx a;
    public int b;
    public pjw c;
    public String d = "";
    public long e;
    public long f;
    public int g;

    static {
        pjx pjxVar = new pjx();
        a = pjxVar;
        abnv.P(pjx.class, pjxVar);
    }

    private pjx() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004ဂ\u0003\u0005ဂ\u0004\u0006ဌ\u0005", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new pjx();
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
        return abnv.L(pjx.class);
    }
}
