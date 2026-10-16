package defpackage;

/* loaded from: classes.dex */
public final class abqw extends abnv implements abox {
    public static final abqw a;
    public int b;
    public aboh c = abpf.b;
    public abpt d;
    public abpt e;

    static {
        abqw abqwVar = new abqw();
        a = abqwVar;
        abnv.P(abqw.class, abqwVar);
    }

    private abqw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဉ\u0001", new Object[]{"b", "c", abqx.class, "d", "e"});
        }
        if (i2 == 3) {
            return new abqw();
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
        return abnv.L(abqw.class);
    }

    public final void b() {
        aboh abohVar = this.c;
        if (abohVar.c()) {
            return;
        }
        this.c = abnv.I(abohVar);
    }
}
