package defpackage;

/* loaded from: classes2.dex */
public final class ajgm extends abnv implements abox {
    public static final ajgm a;
    public int b;
    public int c;
    public abpt d;
    public String e = "";
    public String f = "";
    public int g;
    public long h;

    static {
        ajgm ajgmVar = new ajgm();
        a = ajgmVar;
        abnv.P(ajgm.class, ajgmVar);
    }

    private ajgm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005င\u0004\u0006ဂ\u0005", new Object[]{"b", "c", "d", "e", "f", "g", "h"});
        }
        if (i2 == 3) {
            return new ajgm();
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
        return abnv.L(ajgm.class);
    }
}
