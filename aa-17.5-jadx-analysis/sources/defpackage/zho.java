package defpackage;

/* loaded from: classes3.dex */
public final class zho extends abnv implements abox {
    public static final zho a;
    public int b;
    public abms c = abms.d;
    public aboh d = abpf.b;
    public boolean e;

    static {
        zho zhoVar = new zho();
        a = zhoVar;
        abnv.P(zho.class, zhoVar);
    }

    private zho() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ည\u0000\u0002\u001c\u0003ဇ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new zho();
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
        return abnv.L(zho.class);
    }

    public final void b() {
        aboh abohVar = this.d;
        if (abohVar.c()) {
            return;
        }
        this.d = abnv.I(abohVar);
    }
}
