package defpackage;

/* loaded from: classes2.dex */
public final class rrj extends abnv implements abox {
    public static final rrj a;
    public int b;
    public String c = "";
    public rrk d;
    public aboh e;
    public int f;
    public int g;
    public int h;
    public int i;
    public aboh j;
    public boolean k;
    public String l;

    static {
        rrj rrjVar = new rrj();
        a = rrjVar;
        abnv.P(rrj.class, rrjVar);
    }

    private rrj() {
        abpf abpfVar = abpf.b;
        this.e = abpfVar;
        this.j = abpfVar;
        this.l = "";
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            abob abobVar = ywl.d;
            return new abpg(a, "\u0004\n\u0000\u0001\u0001\n\n\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဉ\u0001\u0003\u001b\u0004င\u0002\u0005᠌\u0003\u0006᠌\u0004\u0007᠌\u0005\b\u001b\tဇ\u0006\nဈ\u0007", new Object[]{"b", "c", "d", "e", rrk.class, "f", "g", orj.t, "h", abobVar, "i", abobVar, "j", rrh.class, "k", "l"});
        }
        if (i2 == 3) {
            return new rrj();
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
        return abnv.L(rrj.class);
    }
}
