package defpackage;

/* loaded from: classes3.dex */
public final class abiz extends abnv implements abox {
    public static final abiz a;
    public int b;
    public abod c;
    public abod d;
    public abht e;

    static {
        abiz abizVar = new abiz();
        a = abizVar;
        abnv.P(abiz.class, abizVar);
    }

    private abiz() {
        abnw abnwVar = abnw.a;
        this.c = abnwVar;
        this.d = abnwVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001'\u0002'\u0003ဉ\u0000", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new abiz();
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
        return abnv.L(abiz.class);
    }
}
