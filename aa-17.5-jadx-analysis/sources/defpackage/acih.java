package defpackage;

/* loaded from: classes3.dex */
public final class acih extends abnv implements abox {
    public static final acih a;
    public int b;
    public acia c;
    public acie d;
    public achz e;
    public acid g;
    private byte h = 2;
    public aboh f = abpf.b;

    static {
        acih acihVar = new acih();
        a = acihVar;
        abnv.P(acih.class, acihVar);
    }

    private acih() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0001\u0001?\u0005\u0000\u0001\u0003\u0001ᔑ\u0000!ᔑ\u00011ᔑ\u0002:ထ\u0003?\u001b", new Object[]{"b", "c", "d", "e", "g", "f", acic.class});
        }
        if (i2 == 3) {
            return new acih();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acih.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
