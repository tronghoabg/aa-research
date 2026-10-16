package defpackage;

/* loaded from: classes3.dex */
public final class zla extends abnv implements abox {
    public static final zla a;
    private byte b = 2;

    static {
        zla zlaVar = new zla();
        a = zlaVar;
        abnv.P(zla.class, zlaVar);
    }

    private zla() {
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
            return new zla();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zla.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
