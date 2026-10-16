package defpackage;

/* loaded from: classes3.dex */
public final class acbg extends abnv implements abox {
    public static final acbg a;
    public int b;
    public aboh c = abpf.b;
    public String d = "";
    public abms e = abms.d;
    private aapc f;

    static {
        acbg acbgVar = new acbg();
        a = acbgVar;
        abnv.P(acbg.class, acbgVar);
    }

    private acbg() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001b\u0002ဉ\u0000\u0003ဈ\u0001\u0004ည\u0002", new Object[]{"b", "c", acbf.class, "f", "d", "e"});
        }
        if (i2 == 3) {
            return new acbg();
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
        return abnv.L(acbg.class);
    }

    public final void b() {
        aboh abohVar = this.c;
        if (abohVar.c()) {
            return;
        }
        this.c = abnv.I(abohVar);
    }
}
