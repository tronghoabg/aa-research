package defpackage;

/* loaded from: classes3.dex */
public final class abkk extends abnv implements abox {
    public static final abkk a;
    public int b;
    public abkk c;
    private abkr d;
    private abkw e;
    private byte f = 2;

    static {
        abkk abkkVar = new abkk();
        a = abkkVar;
        abnv.P(abkk.class, abkkVar);
    }

    private abkk() {
        abnw abnwVar = abnw.a;
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\f\u0003\u0000\u0000\u0003\u0001ᐉ\u000e\bᐉ\u0004\fᐉ\u0003", new Object[]{"b", "c", "e", "d"});
        }
        if (i2 == 3) {
            return new abkk();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abkk.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
