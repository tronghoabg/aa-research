package defpackage;

/* loaded from: classes3.dex */
public final class ablu extends abnv implements abox {
    public static final ablu a;
    public int b;
    private int c;
    private byte d = 2;

    static {
        ablu abluVar = new ablu();
        a = abluVar;
        abnv.P(ablu.class, abluVar);
    }

    private ablu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001င\u0000", new Object[]{"c", "b"});
        }
        if (i2 == 3) {
            return new ablu();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ablu.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
