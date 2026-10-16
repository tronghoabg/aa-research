package defpackage;

/* loaded from: classes3.dex */
public final class zjy extends abnv implements abox {
    public static final zjy a;
    private abot b = abot.a;
    private byte c = 2;

    static {
        zjy zjyVar = new zjy();
        a = zjyVar;
        abnv.P(zjy.class, zjyVar);
    }

    private zjy() {
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
            return new zjy();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 == 6) {
            return abnv.L(zjy.class);
        }
        this.c = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
