package defpackage;

/* loaded from: classes2.dex */
public final class ajgd extends abnv implements abox {
    public static final ajgd a;
    private int b;
    private zbw c;
    private byte d = 2;

    static {
        ajgd ajgdVar = new ajgd();
        a = ajgdVar;
        abnv.P(ajgd.class, ajgdVar);
    }

    private ajgd() {
        Object[] objArr = abpf.a;
        abor aborVar = abor.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0005\u0005\u0001\u0000\u0000\u0001\u0005ᐉ\u0003", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new ajgd();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ajgd.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
