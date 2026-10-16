package defpackage;

/* loaded from: classes3.dex */
public final class zjl extends abnv implements abox {
    public static final zjl a;
    private int b;
    private zjk c;
    private byte d = 2;

    static {
        zjl zjlVar = new zjl();
        a = zjlVar;
        abnv.P(zjl.class, zjlVar);
    }

    private zjl() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0001\u0001ᐉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new zjl();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zjl.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
