package defpackage;

/* loaded from: classes3.dex */
public final class szq extends abnv implements abox {
    public static final szq a;
    public int b;
    public int c;
    public aboh d;
    public aboh e;
    public String f;
    public String g;
    public orh h;
    public aboh i;
    public int j;

    static {
        szq szqVar = new szq();
        a = szqVar;
        abnv.P(szq.class, szqVar);
    }

    private szq() {
        abpf abpfVar = abpf.b;
        this.d = abpfVar;
        this.e = abpfVar;
        this.f = "";
        this.g = "";
        this.i = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\b\u0000\u0001\u0001\b\b\u0000\u0003\u0000\u0001င\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001\u0005ဈ\u0002\u0006ဉ\u0003\u0007\u001b\bင\u0004", new Object[]{"b", "c", "d", "e", "f", "g", "h", "i", tan.class, "j"});
        }
        if (i2 == 3) {
            return new szq();
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
        return abnv.L(szq.class);
    }
}
