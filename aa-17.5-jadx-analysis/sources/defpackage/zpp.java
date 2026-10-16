package defpackage;

/* loaded from: classes3.dex */
public final class zpp extends abnv implements abox {
    public static final zpp a;
    private abot b = abot.a;

    static {
        zpp zppVar = new zpp();
        a = zppVar;
        abnv.P(zpp.class, zppVar);
    }

    private zpp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", new lds(abqd.STRING, "", abqd.MESSAGE, zpm.a)});
        }
        if (i2 == 3) {
            return new zpp();
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
        return abnv.L(zpp.class);
    }
}
