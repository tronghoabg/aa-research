package defpackage;

/* loaded from: classes3.dex */
public final class abky extends abnv implements abox {
    public static final abky a;
    public abod b;
    public abod c;
    public boolean d;
    public aboh e;
    private int f;

    static {
        abky abkyVar = new abky();
        a = abkyVar;
        abnv.P(abky.class, abkyVar);
    }

    private abky() {
        abnw abnwVar = abnw.a;
        this.b = abnwVar;
        this.c = abnwVar;
        this.e = abpf.b;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0002\r\u0004\u0000\u0003\u0000\u0002ࠞ\u0003ࠞ\tဇ\u0005\r\u001b", new Object[]{"f", "b", abho.o, "c", abho.p, "d", "e", abks.class});
        }
        if (i2 == 3) {
            return new abky();
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
        return abnv.L(abky.class);
    }

    public final void b() {
        aboh abohVar = this.e;
        if (abohVar.c()) {
            return;
        }
        this.e = abnv.I(abohVar);
    }
}
