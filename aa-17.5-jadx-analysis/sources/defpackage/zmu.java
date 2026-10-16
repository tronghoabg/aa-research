package defpackage;

/* loaded from: classes3.dex */
public final class zmu extends abnv implements abox {
    public static final zmu a;
    private byte b = 2;

    static {
        zmu zmuVar = new zmu();
        a = zmuVar;
        abnv.P(zmu.class, zmuVar);
    }

    private zmu() {
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
            return new zmu();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zmu.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
