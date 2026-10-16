package defpackage;

/* loaded from: classes2.dex */
public final class otp extends abnv implements abox {
    public static final otp a;
    public int b;
    public orz c;
    public ory d;
    public int e;

    static {
        otp otpVar = new otp();
        a = otpVar;
        abnv.P(otp.class, otpVar);
    }

    private otp() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003င\u0002", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new otp();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(otp.class);
    }
}
