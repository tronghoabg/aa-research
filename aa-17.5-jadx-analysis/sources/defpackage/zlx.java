package defpackage;

/* loaded from: classes3.dex */
public final class zlx extends abnv implements abox {
    public static final zlx a;
    private byte b = 2;

    static {
        zlx zlxVar = new zlx();
        a = zlxVar;
        abnv.P(zlx.class, zlxVar);
    }

    private zlx() {
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
            return new zlx();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zlx.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
