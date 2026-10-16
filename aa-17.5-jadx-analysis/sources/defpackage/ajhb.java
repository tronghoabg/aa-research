package defpackage;

/* loaded from: classes2.dex */
public final class ajhb extends abnv implements abox {
    public static final ajhb a;
    public long b;
    public abpt d;
    private int e;
    private byte f = 2;
    public aboh c = abpf.b;

    static {
        ajhb ajhbVar = new ajhb();
        a = ajhbVar;
        abnv.P(ajhb.class, ajhbVar);
    }

    private ajhb() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001စ\u0000\u0003Л\u0004ဉ\u0001", new Object[]{"e", "b", "c", ajha.class, "d"});
        }
        if (i2 == 3) {
            return new ajhb();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ajhb.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
