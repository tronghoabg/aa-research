package defpackage;

/* loaded from: classes3.dex */
public final class achz extends abnv implements abox {
    public static final achz a;
    public int b;
    private byte f = 2;
    public int c = 450000;
    public int d = 500000;
    public aboh e = abpf.b;

    static {
        achz achzVar = new achz();
        a = achzVar;
        abnv.P(achz.class, achzVar);
    }

    private achz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u000124\u0003\u0000\u0001\u00012င\u00003င\u00014б", new Object[]{"b", "c", "d", "e", achy.class});
        }
        if (i2 == 3) {
            return new achz();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(achz.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
