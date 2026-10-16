package defpackage;

/* loaded from: classes3.dex */
public final class zbm extends abnv implements abox {
    public static final zbm a;
    private int b;
    private zbn c;
    private ywb d;
    private byte e = 2;

    static {
        zbm zbmVar = new zbm();
        a = zbmVar;
        abnv.P(zbm.class, zbmVar);
    }

    private zbm() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0004\u0010\u0002\u0000\u0000\u0002\u0004ᐉ\u0005\u0010ᐉ\t", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new zbm();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zbm.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
