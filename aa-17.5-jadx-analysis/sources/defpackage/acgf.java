package defpackage;

/* loaded from: classes3.dex */
public final class acgf extends abnv implements abox {
    public static final acgf a;
    private int b;
    private int c;
    private abkz d;
    private acgc e;
    private aapc f;
    private byte g = 2;

    static {
        acgf acgfVar = new acgf();
        a = acgfVar;
        abnv.P(acgf.class, acgfVar);
    }

    private acgf() {
        abms abmsVar = abms.d;
        abnw abnwVar = abnw.a;
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0002\u00136\u0003\u0000\u0000\u0002\u0013ᐉ\u0018&ᐉ(6ဉ2", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new acgf();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acgf.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
