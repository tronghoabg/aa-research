package defpackage;

/* loaded from: classes2.dex */
public final class ajgr extends abnv implements abox {
    public static final ajgr a;
    public int b;
    public int c;
    private ajgq e;
    private byte f = 2;
    public int d = 1;

    static {
        ajgr ajgrVar = new ajgr();
        a = ajgrVar;
        abnv.P(ajgr.class, ajgrVar);
    }

    private ajgr() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.f);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0001\u0001᠌\u0000\u0002င\u0001\u0003ᐉ\u0002", new Object[]{"b", "c", xln.r, "d", "e"});
        }
        if (i2 == 3) {
            return new ajgr();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(ajgr.class);
        }
        this.f = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
