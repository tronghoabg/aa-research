package defpackage;

/* loaded from: classes3.dex */
public final class zqe extends abnv implements abox {
    public static final zqe a;
    private int b;
    private ably c;
    private ablv d;
    private abot e = abot.a;
    private byte f = 2;

    static {
        zqe zqeVar = new zqe();
        a = zqeVar;
        abnv.P(zqe.class, zqeVar);
    }

    private zqe() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0007\u0003\u0001\u0000\u0002\u0001ᐉ\u0000\u00032\u0007ᐉ\u0001", new Object[]{"b", "c", "e", new lds(abqd.INT32, 0, abqd.MESSAGE, zqf.a), "d"});
        }
        if (i2 == 3) {
            return new zqe();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zqe.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
