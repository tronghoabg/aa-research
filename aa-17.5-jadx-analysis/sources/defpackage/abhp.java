package defpackage;

/* loaded from: classes3.dex */
public final class abhp extends abnv implements abox {
    public static final abhp a;
    public int b;
    public int c;
    public int d;
    public double e;
    public double f;
    public double g;
    public double h;
    public double i;
    public double j;
    public abny k;
    public abny l;
    public float m;
    public int n;
    public int o;

    static {
        abhp abhpVar = new abhp();
        a = abhpVar;
        abnv.P(abhp.class, abhpVar);
    }

    private abhp() {
        abne abneVar = abne.a;
        this.k = abneVar;
        this.l = abneVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0002\u0000\u0001င\u0000\u0002င\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004\u0006က\u0005\u0007က\u0006\bက\u0007\t#\n#\u000b᠌\u000f\fခ\u000e\rဌ\u0010", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "n", abho.a, "m", "o"});
        }
        if (i2 == 3) {
            return new abhp();
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
        return abnv.L(abhp.class);
    }
}
