package defpackage;

/* loaded from: classes3.dex */
public final class acfc extends abnv implements abox {
    public static final acfc a;
    public int b;
    public achr c;
    public achs d;
    private aapc f;
    private byte g = 2;
    public boolean e = true;

    static {
        acfc acfcVar = new acfc();
        a = acfcVar;
        abnv.P(acfc.class, acfcVar);
    }

    private acfc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0000\u0002\u0001ᔉ\u0000\u0003ᐉ\u0002\u0004ဇ\u0003\u0006ဉ\u0004", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new acfc();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acfc.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
