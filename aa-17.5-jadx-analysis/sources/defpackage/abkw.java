package defpackage;

/* loaded from: classes3.dex */
public final class abkw extends abns implements abnt {
    public static final abkw a;
    private int b;
    private ablg c;
    private abkz d;
    private ablf e;
    private byte f = 2;

    static {
        abkw abkwVar = new abkw();
        a = abkwVar;
        abnv.P(abkw.class, abkwVar);
    }

    private abkw() {
        Object[] objArr = abpf.a;
        abms abmsVar = abms.d;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u00061\u0003\u0000\u0000\u0001\u0006ဉ\u0004\u000fᐉ\u000e1ဉ\u001a", new Object[]{"b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new abkw();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abkw.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
