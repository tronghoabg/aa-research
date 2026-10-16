package defpackage;

/* loaded from: classes3.dex */
public final class znd extends abnv implements abox {
    public static final znd a;
    private byte b = 2;

    static {
        znd zndVar = new znd();
        a = zndVar;
        abnv.P(znd.class, zndVar);
    }

    private znd() {
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
            return new znd();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(znd.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
