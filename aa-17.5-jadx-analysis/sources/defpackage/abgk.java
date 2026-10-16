package defpackage;

/* loaded from: classes3.dex */
public final class abgk extends abnv implements abox {
    public static final abgk a;
    public int b;
    public int c;
    public abgj d;
    public int e;
    public abga j;
    private byte l = 2;
    public abod f = abnw.a;
    public aboh g = abpf.b;
    public int h = -1;
    public int i = -1;
    public String k = "";

    static {
        abgk abgkVar = new abgk();
        a = abgkVar;
        abnv.P(abgk.class, abgkVar);
    }

    private abgk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.l);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0002\u0001᠌\u0000\u0002ᐉ\u0001\u0003င\u0002\u0004'\u0005Л\u0006င\u0003\u0007င\u0004\bဉ\u0005\tဈ\u0006", new Object[]{"b", "c", abce.r, "d", "e", "f", "g", abhc.class, "h", "i", "j", "k"});
        }
        if (i2 == 3) {
            return new abgk();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abgk.class);
        }
        this.l = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
