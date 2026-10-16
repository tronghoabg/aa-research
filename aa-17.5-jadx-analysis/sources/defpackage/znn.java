package defpackage;

/* loaded from: classes3.dex */
public final class znn extends abnv implements abox {
    public static final znn a;
    public znp b;
    public abpt d;
    public boolean e;
    private int f;
    private zno g;
    private byte h = 2;
    public aboh c = abpf.b;

    static {
        znn znnVar = new znn();
        a = znnVar;
        abnv.P(znn.class, znnVar);
    }

    private znn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u000b\u0005\u0000\u0001\u0001\u0001ᐉ\u0000\u0002ဉ\u0001\u0004\u001b\bဉ\u0005\u000bဇ\b", new Object[]{"f", "g", "b", "c", zll.class, "d", "e"});
        }
        if (i2 == 3) {
            return new znn();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(znn.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
