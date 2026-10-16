package defpackage;

/* loaded from: classes3.dex */
public final class aazx extends abnv implements abox {
    public static final aazx a;
    private byte b = 2;

    static {
        aazx aazxVar = new aazx();
        a = aazxVar;
        abnv.P(aazx.class, aazxVar);
    }

    private aazx() {
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
            return new aazx();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aazx.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
