package defpackage;

/* loaded from: classes.dex */
public final class oup extends abnv implements abox {
    public static final oup a;
    public int b;
    public String c = "";
    public abpt d;
    public int e;
    public oun f;
    public oum g;
    public ouk h;

    static {
        oup oupVar = new oup();
        a = oupVar;
        abnv.P(oup.class, oupVar);
    }

    private oup() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u0001\u0001\f\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003᠌\u0002\nဉ\u0003\u000bဉ\u0004\fဉ\u0005", new Object[]{"b", "c", "d", "e", otu.g, "f", "g", "h"});
        }
        if (i2 == 3) {
            return new oup();
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
        return abnv.L(oup.class);
    }
}
