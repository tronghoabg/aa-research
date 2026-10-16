package defpackage;

/* loaded from: classes3.dex */
public final class zps extends abnv implements abox {
    public static final zps a;
    private abot b = abot.a;
    private byte c = 2;

    static {
        zps zpsVar = new zps();
        a = zpsVar;
        abnv.P(zps.class, zpsVar);
    }

    private zps() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001в", new Object[]{"b", new lds(abqd.STRING, "", abqd.MESSAGE, zpt.a)});
        }
        if (i2 == 3) {
            return new zps();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zps.class);
        }
        this.c = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
