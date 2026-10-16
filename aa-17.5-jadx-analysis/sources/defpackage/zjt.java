package defpackage;

/* loaded from: classes3.dex */
public final class zjt extends abnv implements abox {
    public static final zjt a;
    private int b;
    private zjr c;
    private byte d = 2;

    static {
        zjt zjtVar = new zjt();
        a = zjtVar;
        abnv.P(zjt.class, zjtVar);
    }

    private zjt() {
        Object[] objArr = abpf.a;
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0001\u0004ᐉ\u000f", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new zjt();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zjt.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
