package defpackage;

/* loaded from: classes3.dex */
public final class abgj extends abns implements abnt {
    public static final abgj a;
    public int b;
    public aboh c;
    public aboh d;
    public abgm e;
    public int f;
    public abfw g;
    public abhb h;
    public abod i;
    public abab j;
    private byte k = 2;

    static {
        abgj abgjVar = new abgj();
        a = abgjVar;
        abnv.P(abgj.class, abgjVar);
    }

    private abgj() {
        abpf abpfVar = abpf.b;
        this.c = abpfVar;
        this.d = abpfVar;
        abms abmsVar = abms.d;
        this.i = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.k);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\b\u0000\u0001\u0001\u001b\b\u0000\u0003\u0004\u0001Л\u0002Л\u0003ᐉ\u0001\u0004᠌\u0003\u0005ဉ\u0004\u0006ဉ\u0005\u0017'\u001bᐉ\u0015", new Object[]{"b", "c", abgt.class, "d", abgd.class, "e", "f", abce.q, "g", "h", "i", "j"});
        }
        if (i2 == 3) {
            return new abgj();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abgj.class);
        }
        this.k = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final void b() {
        aboh abohVar = this.d;
        if (abohVar.c()) {
            return;
        }
        this.d = abnv.I(abohVar);
    }
}
