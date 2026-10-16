package defpackage;

/* loaded from: classes3.dex */
public final class zmx extends abnv implements abox {
    public static final zmx a;
    private byte b = 2;

    static {
        zmx zmxVar = new zmx();
        a = zmxVar;
        abnv.P(zmx.class, zmxVar);
    }

    private zmx() {
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
            return new zmx();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zmx.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
