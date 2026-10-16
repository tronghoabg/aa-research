package defpackage;

/* loaded from: classes3.dex */
public final class abld extends abnv implements abox {
    public static final abld a;
    private abot b = abot.a;
    private byte c = 2;

    static {
        abld abldVar = new abld();
        a = abldVar;
        abnv.P(abld.class, abldVar);
    }

    private abld() {
        Object[] objArr = abpf.a;
        abms abmsVar = abms.d;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 0) {
            return Byte.valueOf(this.c);
        }
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0001\u0001в", new Object[]{"b", new lds(abqd.UINT32, 0, abqd.MESSAGE, zjw.a)});
        }
        if (i2 == 3) {
            return new abld();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(abld.class);
        }
        this.c = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
