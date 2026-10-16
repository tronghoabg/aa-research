package defpackage;

/* loaded from: classes3.dex */
public final class aasu extends abnv implements abox {
    public static final aasu a;
    private abot b;
    private abot c;

    static {
        aasu aasuVar = new aasu();
        a = aasuVar;
        abnv.P(aasu.class, aasuVar);
    }

    private aasu() {
        abot abotVar = abot.a;
        this.b = abotVar;
        this.c = abotVar;
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            abqd abqdVar = abqd.INT32;
            return new abpg(a, "\u0001\u0002\u0000\u0000\u0003\u0004\u0002\u0002\u0000\u0000\u00032\u00042", new Object[]{"b", new lds(abqdVar, 0, abqd.MESSAGE, aatd.a), "c", new lds(abqd.STRING, "", abqdVar, 0)});
        }
        if (i2 == 3) {
            return new aasu();
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
        return abnv.L(aasu.class);
    }
}
