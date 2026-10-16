package defpackage;

/* loaded from: classes3.dex */
public final class zmw extends abnv implements abox {
    public static final zmw a;
    private byte b = 2;

    static {
        zmw zmwVar = new zmw();
        a = zmwVar;
        abnv.P(zmw.class, zmwVar);
    }

    private zmw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.b);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new zmw();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zmw.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
