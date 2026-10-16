package defpackage;

/* loaded from: classes3.dex */
public final class zmr extends abnv implements abox {
    public static final zmr a;
    private byte b = 2;

    static {
        zmr zmrVar = new zmr();
        a = zmrVar;
        abnv.P(zmr.class, zmrVar);
    }

    private zmr() {
        Object[] objArr = abpf.a;
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
            return new zmr();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zmr.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
