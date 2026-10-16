package defpackage;

/* loaded from: classes3.dex */
public final class ajgf extends abnv implements abox {
    public static final ajgf a;
    public int b;
    public int c;
    public int d;
    public abod e;
    public abod f;

    static {
        ajgf ajgfVar = new ajgf();
        a = ajgfVar;
        abnv.P(ajgf.class, ajgfVar);
    }

    private ajgf() {
        abnw abnwVar = abnw.a;
        this.e = abnwVar;
        this.f = abnwVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003'\u0004'", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new ajgf();
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
        return abnv.L(ajgf.class);
    }
}
