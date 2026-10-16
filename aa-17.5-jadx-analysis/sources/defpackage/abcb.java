package defpackage;

/* loaded from: classes3.dex */
public final class abcb extends abns implements abnt {
    public static final abcb a;
    private int b;
    private abdl c;
    private byte d = 2;

    static {
        abcb abcbVar = new abcb();
        a = abcbVar;
        abnv.P(abcb.class, abcbVar);
    }

    private abcb() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\b\b\u0001\u0000\u0000\u0001\bᐉ\u0005", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abcb();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abcb.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
