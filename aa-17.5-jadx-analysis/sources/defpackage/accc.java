package defpackage;

/* loaded from: classes3.dex */
public final class accc extends abnv implements abox {
    public static final accc a;
    private byte b = 2;

    static {
        accc acccVar = new accc();
        a = acccVar;
        abnv.P(accc.class, acccVar);
    }

    private accc() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.b);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0000", null);
        }
        if (i2 == 3) {
            return new accc();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(accc.class);
        }
        this.b = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
