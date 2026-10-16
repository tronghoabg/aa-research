package defpackage;

/* loaded from: classes3.dex */
public final class abfz extends abnv implements abox {
    public static final abfz a;
    public int b;
    public int c;
    public abgs d;
    public zkl e;
    private zkl f;
    private zkl g;
    private byte h = 2;

    static {
        abfz abfzVar = new abfz();
        a = abfzVar;
        abnv.P(abfz.class, abfzVar);
    }

    private abfz() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.h);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0004\u0001ᐉ\u0003\u0002ဋ\u0000\u0003ᐉ\u0004\u0005ᐉ\u0005\u0006ᐉ\u0006", new Object[]{"b", "d", "c", "e", "f", "g"});
        }
        if (i2 == 3) {
            return new abfz();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abfz.class);
        }
        this.h = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
