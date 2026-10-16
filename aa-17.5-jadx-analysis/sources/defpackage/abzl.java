package defpackage;

/* loaded from: classes3.dex */
public final class abzl extends abns implements abnt {
    public static final abzl a;
    private int b;
    private abzk c;
    private byte d = 2;

    static {
        abzl abzlVar = new abzl();
        a = abzlVar;
        abnv.P(abzl.class, abzlVar);
    }

    private abzl() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0001\u0002ᐉ\u0000", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abzl();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abzl.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
