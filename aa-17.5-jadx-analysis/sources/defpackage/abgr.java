package defpackage;

/* loaded from: classes3.dex */
public final class abgr extends abnv implements abox {
    public static final abgr a;
    public static final abnh b;
    private byte c = 2;

    static {
        abgr abgrVar = new abgr();
        a = abgrVar;
        abnv.P(abgr.class, abgrVar);
        b = abnv.W(abuf.a, abgrVar, abgrVar, null, 42398195, abqd.MESSAGE);
    }

    private abgr() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new abgr();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abgr.class);
        }
        this.c = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
