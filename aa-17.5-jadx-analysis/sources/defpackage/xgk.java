package defpackage;

/* loaded from: classes3.dex */
public final class xgk extends abnv implements abox {
    public static final xgk a;
    public int b;
    public int c;
    public int d;
    public int e;
    public aboh f;
    public int g;
    public abod h;
    public aboh i;

    static {
        xgk xgkVar = new xgk();
        a = xgkVar;
        abnv.P(xgk.class, xgkVar);
    }

    private xgk() {
        abpf abpfVar = abpf.b;
        this.f = abpfVar;
        this.h = abnw.a;
        this.i = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0003\u0000\u0001ဌ\u0000\u0002ဌ\u0001\u0003ဌ\u0002\u0004\u001b\u0005ဌ\u0003\u0006'\u0007\u001b", new Object[]{"b", "c", "d", "e", "f", xgj.class, "g", "h", "i", xfz.class});
        }
        if (i2 == 3) {
            return new xgk();
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
        return abnv.L(xgk.class);
    }

    public final void b() {
        aboh abohVar = this.i;
        if (abohVar.c()) {
            return;
        }
        this.i = abnv.I(abohVar);
    }
}
