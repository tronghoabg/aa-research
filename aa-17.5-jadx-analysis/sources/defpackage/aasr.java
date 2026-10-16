package defpackage;

/* loaded from: classes3.dex */
public final class aasr extends abnv implements abox {
    public static final aasr a;
    public int b;
    public int c;
    public boolean d = true;
    public boolean e = true;
    public boolean f = true;
    public boolean g = true;
    public boolean h = true;
    public boolean i = true;
    public boolean j = true;
    public int k = 360;
    public boolean l;
    public boolean m;
    public boolean n;
    private int o;
    private int p;
    private int q;

    static {
        aasr aasrVar = new aasr();
        a = aasrVar;
        abnv.P(aasr.class, aasrVar);
    }

    private aasr() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u000b\u0000\u0005\u0001Ƴ\u000b\u0000\u0000\u0000\u0001ဇ\u0000\tဇ\u0007\u0012ဇ\u0011\u0016ဇ\u0016\u0017ဇ\u0012\u0018ဇ\u0017\u0019ဇ\bæင!ĠဇCƞဇaƳဇ\u0082", new Object[]{"b", "o", "p", "q", "c", "d", "e", "g", "i", "h", "j", "f", "k", "l", "m", "n"});
        }
        if (i2 == 3) {
            return new aasr();
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
        return abnv.L(aasr.class);
    }
}
