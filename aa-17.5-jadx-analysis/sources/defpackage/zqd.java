package defpackage;

/* loaded from: classes3.dex */
public final class zqd extends abnv implements abox {
    public static final zqd a;
    private int b;
    private zqb c;
    private zkl d;
    private abgg e;
    private zqc f;
    private ablv g;
    private ablv h;
    private byte i = 2;

    static {
        zqd zqdVar = new zqd();
        a = zqdVar;
        abnv.P(zqd.class, zqdVar);
    }

    private zqd() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u0001\u0004\u0014\u0006\u0000\u0000\u0006\u0004ᐉ\u0007\u0005ᐉ\b\u000bᐉ\u0003\fᐉ\u0004\u000eᐉ\u0006\u0014ᐉ\u0000", new Object[]{"b", "g", "h", "d", "e", "f", "c"});
        }
        if (i2 == 3) {
            return new zqd();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zqd.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
