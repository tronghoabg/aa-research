package defpackage;

/* loaded from: classes3.dex */
public final class abtr extends abns implements abnt {
    public static final abtr a;
    private int b;
    private abtn c;
    private abua d;
    private abtw e;
    private abtv f;
    private byte g = 2;

    static {
        abtr abtrVar = new abtr();
        a = abtrVar;
        abnv.P(abtr.class, abtrVar);
    }

    private abtr() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0012ϫ\u0004\u0000\u0000\u0004\u0012ᐉ\u0000\u001bᐉ\u00066ᐉ\rϫᐉ\u000e", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new abtr();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abtr.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
