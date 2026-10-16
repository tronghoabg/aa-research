package defpackage;

/* loaded from: classes3.dex */
public final class zpw extends abnv implements abox {
    public static final zpw a;
    private abot b = abot.a;
    private byte c = 2;

    static {
        zpw zpwVar = new zpw();
        a = zpwVar;
        abnv.P(zpw.class, zpwVar);
    }

    private zpw() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0002\u0002\u0001\u0001\u0000\u0000\u00022", new Object[]{"b", new lds(abqd.STRING, "", abqd.MESSAGE, zpv.a)});
        }
        if (i2 == 3) {
            return new zpw();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zpw.class);
        }
        this.c = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
