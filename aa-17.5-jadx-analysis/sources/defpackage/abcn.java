package defpackage;

/* loaded from: classes3.dex */
public final class abcn extends abns implements abnt {
    public static final abcn a;
    public int b;
    public int f;
    public int g;
    public boolean h;
    private byte i = 2;
    public String c = "";
    public int d = -1;
    public long e = -1;

    static {
        abcn abcnVar = new abcn();
        a = abcnVar;
        abnv.P(abcn.class, abcnVar);
    }

    private abcn() {
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.i);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0006\u0000\u0001\u0001ߐ\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001\u0003ဇ\u0005\u0004ဂ\u0002\u0005င\u0004ߐင\u0003", new Object[]{"b", "c", "d", "h", "e", "g", "f"});
        }
        if (i2 == 3) {
            return new abcn();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abcn.class);
        }
        this.i = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
