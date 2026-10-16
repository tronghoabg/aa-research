package defpackage;

/* loaded from: classes3.dex */
public final class aaid extends abnv implements abox {
    public static final aaid a;
    public static final abnh c;
    private byte d = 2;
    public aboh b = abpf.b;

    static {
        aaid aaidVar = new aaid();
        a = aaidVar;
        abnv.P(aaid.class, aaidVar);
        c = abnv.W(abab.a, aaidVar, aaidVar, null, 512761271, abqd.MESSAGE);
    }

    private aaid() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"b", zkk.class});
        }
        if (i2 == 3) {
            return new aaid();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(aaid.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
