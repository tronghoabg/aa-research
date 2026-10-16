package defpackage;

/* loaded from: classes.dex */
public final class absp extends abnv implements abox {
    public static final absp a;
    public int b;
    public int c;
    public int d;
    public long e;
    public int f;
    public aboh g;
    public aboh h;
    public String i;
    public absm j;
    public aboh k;

    static {
        absp abspVar = new absp();
        a = abspVar;
        abnv.P(absp.class, abspVar);
    }

    private absp() {
        abpf abpfVar = abpf.b;
        this.g = abpfVar;
        this.h = abpfVar;
        this.i = "";
        this.k = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\t\u0000\u0001\u0001\f\t\u0000\u0003\u0000\u0001င\u0000\u0002င\u0001\u0003ဃ\u0002\u0004᠌\u0003\u0005\u001b\u0006\u001b\nဈ\u0006\u000bဉ\u0007\f\u001b", new Object[]{"b", "c", "d", "e", "f", absk.d, "g", abso.class, "h", absn.class, "i", "j", "k", absl.class});
        }
        if (i2 == 3) {
            return new absp();
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
        return abnv.L(absp.class);
    }
}
