package defpackage;

/* loaded from: classes3.dex */
public final class achq extends abnv implements abox {
    public static final achq a;
    private int b;
    private int c;
    private int d;
    private byte e = 2;

    static {
        achq achqVar = new achq();
        a = achqVar;
        abnv.P(achq.class, achqVar);
    }

    private achq() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔏ\u0000\u0002ᔏ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new achq();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(achq.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
