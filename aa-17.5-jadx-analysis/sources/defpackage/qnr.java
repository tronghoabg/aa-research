package defpackage;

/* loaded from: classes2.dex */
public final class qnr extends abnv implements abox {
    public static final qnr a;
    public Object c;
    public int e;
    public abod g;
    public abod h;
    public abod i;
    public abog j;
    public aboc k;
    public abny l;
    public abnx m;
    public int b = 0;
    public String d = "";
    public aboh f = abpf.b;

    static {
        qnr qnrVar = new qnr();
        a = qnrVar;
        abnv.P(qnr.class, qnrVar);
    }

    private qnr() {
        abnw abnwVar = abnw.a;
        this.g = abnwVar;
        this.h = abnwVar;
        this.i = abnwVar;
        this.j = abor.a;
        this.k = abnn.a;
        this.l = abne.a;
        this.m = abmj.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0012\u0001\u0000\u0001\u0012\u0012\u0000\b\u0000\u0001Ȉ\u0002\f\u0003Ȼ\u0000\u00047\u0000\u00057\u0000\u00067\u0000\u00075\u0000\b4\u0000\t3\u0000\n:\u0000\u000bȚ\f'\r'\u000e'\u000f%\u0010$\u0011#\u0012*", new Object[]{"c", "b", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m"});
        }
        if (i2 == 3) {
            return new qnr();
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
        return abnv.L(qnr.class);
    }
}
