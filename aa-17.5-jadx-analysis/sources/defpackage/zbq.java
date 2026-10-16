package defpackage;

/* loaded from: classes3.dex */
public final class zbq extends abnv implements abox {
    public static final zbq a;
    public int b;
    public long c;
    public int d;
    public int e;
    private byte f = 2;

    static {
        zbq zbqVar = new zbq();
        a = zbqVar;
        abnv.P(zbq.class, zbqVar);
    }

    private zbq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0003\u0001ᔂ\u0000\u0002ᔆ\u0001\u0003ᔆ\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new zbq();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zbq.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
