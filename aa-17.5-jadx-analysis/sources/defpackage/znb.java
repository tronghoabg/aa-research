package defpackage;

/* loaded from: classes3.dex */
public final class znb extends abnv implements abox {
    public static final znb a;
    private byte b = 2;

    static {
        znb znbVar = new znb();
        a = znbVar;
        abnv.P(znb.class, znbVar);
    }

    private znb() {
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
            return new znb();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(znb.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
