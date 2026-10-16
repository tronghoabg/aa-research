package defpackage;

/* loaded from: classes3.dex */
public final class zai extends abnv implements abox {
    public static final zai a;
    private int b;
    private zaj c;
    private zaj d;
    private zaj e;
    private zaj f;
    private zaj g;
    private byte h = 2;

    static {
        zai zaiVar = new zai();
        a = zaiVar;
        abnv.P(zai.class, zaiVar);
    }

    private zai() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0005\u0001ᐉ\u0000\u0002ᐉ\u0001\u0003ᐉ\u0002\u0004ᐉ\u0003\u0005ᐉ\u0004", new Object[]{"b", "c", "d", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new zai();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zai.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
