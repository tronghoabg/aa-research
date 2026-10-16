package defpackage;

/* loaded from: classes3.dex */
public final class abkr extends abnv implements abox {
    public static final abkr a;
    private int b;
    private zkm c;
    private byte d = 2;

    static {
        abkr abkrVar = new abkr();
        a = abkrVar;
        abnv.P(abkr.class, abkrVar);
    }

    private abkr() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.d);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001\u0006\u0006\u0001\u0000\u0000\u0001\u0006ᐉ\t", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abkr();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abkr.class);
        }
        this.d = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
