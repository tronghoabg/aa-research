package defpackage;

/* loaded from: classes3.dex */
public final class zna extends abnv implements abox {
    public static final zna a;
    private int b;
    private zmz c;
    private byte d = 2;

    static {
        zna znaVar = new zna();
        a = znaVar;
        abnv.P(zna.class, znaVar);
    }

    private zna() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u000b\u000b\u0001\u0000\u0000\u0001\u000bᐉ\u0005", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new zna();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zna.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
