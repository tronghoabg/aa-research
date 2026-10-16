package defpackage;

/* loaded from: classes3.dex */
public final class abco extends abns implements abnt {
    public static final abco a;
    public int b;
    private byte g = 2;
    public aboh c = abpf.b;
    public int d = -1;
    public long e = -1;
    public int f = 1;

    static {
        abco abcoVar = new abco();
        a = abcoVar;
        abnv.P(abco.class, abcoVar);
    }

    private abco() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.g);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0001\u0001Л\u0002င\u0000\u0003ဂ\u0001\u0004᠌\u0002", new Object[]{"b", "c", abcn.class, "d", "e", "f", abce.c});
        }
        if (i2 == 3) {
            return new abco();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abco.class);
        }
        this.g = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
