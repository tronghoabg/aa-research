package defpackage;

/* loaded from: classes3.dex */
public final class acga extends abns implements abnt {
    public static final acga a;
    private int b;
    private acgb c;
    private abkz d;
    private byte e = 2;

    static {
        acga acgaVar = new acga();
        a = acgaVar;
        abnv.P(acga.class, acgaVar);
    }

    private acga() {
        Object[] objArr = abpf.a;
        abms abmsVar = abms.d;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.e);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0006\u000f\u0002\u0000\u0000\u0001\u0006ဉ\u0002\u000fᐉ\t", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new acga();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(acga.class);
        }
        this.e = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
