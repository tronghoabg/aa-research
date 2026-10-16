package defpackage;

/* loaded from: classes3.dex */
public final class acfd extends abnv implements abox {
    public static final acfd a;
    public int b;
    private int d;
    private aapd e;
    private byte f = 2;
    public aboh c = abpf.b;

    static {
        acfd acfdVar = new acfd();
        a = acfdVar;
        abnv.P(acfd.class, acfdVar);
    }

    private acfd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0002\u0001ᴌ\u0000\u0002Л\u0004ဉ\u0002", new Object[]{"d", "b", absk.u, "c", acfe.class, "e"});
        }
        if (i2 == 3) {
            return new acfd();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acfd.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
