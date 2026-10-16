package defpackage;

/* loaded from: classes3.dex */
public final class acee extends abnv implements abox {
    public static final acee a;
    private int b;
    private abgi c;
    private byte d = 2;

    static {
        acee aceeVar = new acee();
        a = aceeVar;
        abnv.P(acee.class, aceeVar);
    }

    private acee() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new acee();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acee.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
