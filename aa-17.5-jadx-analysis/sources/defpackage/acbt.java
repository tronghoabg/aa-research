package defpackage;

/* loaded from: classes3.dex */
public final class acbt extends abnv implements abox {
    public static final acbt a;
    public int b;
    public acbs d;
    private aapc f;
    private abkz g;
    private byte h = 2;
    public aboh c = abpf.b;
    public abms e = abms.d;

    static {
        acbt acbtVar = new acbt();
        a = acbtVar;
        abnv.P(acbt.class, acbtVar);
    }

    private acbt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0002\u0001Л\u0002ဉ\u0000\u0003ဉ\u0001\u0004ည\u0002\u0005ᐉ\u0003", new Object[]{"b", "c", aceg.class, "d", "f", "e", "g"});
        }
        if (i2 == 3) {
            return new acbt();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acbt.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }

    public final void b() {
        aboh abohVar = this.c;
        if (abohVar.c()) {
            return;
        }
        this.c = abnv.I(abohVar);
    }
}
