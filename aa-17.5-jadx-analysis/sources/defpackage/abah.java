package defpackage;

/* loaded from: classes3.dex */
public final class abah extends abnv implements abox {
    public static final abah a;
    public int b;
    private abbl d;
    private abbl e;
    private byte f = 2;
    public abms c = abms.d;

    static {
        abah abahVar = new abah();
        a = abahVar;
        abnv.P(abah.class, abahVar);
    }

    private abah() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001ϩ\u0003\u0000\u0000\u0002\u0001ည\u0000Ϩᐉ\u0002ϩᐉ\u0003", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new abah();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abah.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
