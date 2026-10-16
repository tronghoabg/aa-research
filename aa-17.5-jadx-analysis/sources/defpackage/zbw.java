package defpackage;

/* loaded from: classes3.dex */
public final class zbw extends abnv implements abox {
    public static final zbw a;
    public int b;
    public zbq c;
    public int e;
    public zcb f;
    private byte g = 2;
    public String d = "";

    static {
        zbw zbwVar = new zbw();
        a = zbwVar;
        abnv.P(zbw.class, zbwVar);
    }

    private zbw() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\b\u0004\u0000\u0000\u0004\u0001ᔉ\u0000\u0002ᔈ\u0001\u0003ᔄ\u0002\bᐉ\n", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new zbw();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zbw.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
