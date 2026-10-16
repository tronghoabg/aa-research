package defpackage;

/* loaded from: classes3.dex */
public final class abff extends abns implements abnt {
    public static final abff a;
    public int b;
    public aber d;
    public int e;
    public int f;
    public abdl i;
    private byte j = 2;
    public aboh c = abpf.b;
    public int g = -1;
    public long h = -1;

    static {
        abff abffVar = new abff();
        a = abffVar;
        abnv.P(abff.class, abffVar);
    }

    private abff() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.j);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0007\u0000\u0001\u0001o\u0007\u0000\u0001\u0003\u0001Л\u0002ᐉ\u0000\u0003င\u0004\bဂ\u0005\tင\u0002\nင\u0003oᐉ\t", new Object[]{"b", "c", abbs.class, "d", "g", "h", "e", "f", "i"});
        }
        if (i2 == 3) {
            return new abff();
        }
        if (i2 == 4) {
            return new abnr(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abff.class);
        }
        this.j = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
