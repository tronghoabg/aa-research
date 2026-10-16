package defpackage;

/* loaded from: classes3.dex */
public final class zls extends abnv implements abox {
    public static final zls a;
    private byte b = 2;

    static {
        zls zlsVar = new zls();
        a = zlsVar;
        abnv.P(zls.class, zlsVar);
    }

    private zls() {
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
            return new zls();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zls.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
