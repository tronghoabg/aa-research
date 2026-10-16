package defpackage;

/* loaded from: classes3.dex */
public final class zjq extends abnv implements abox {
    public static final zjq a;
    public int b;
    public String c;
    public int d;

    static {
        zjq zjqVar = new zjq();
        a = zjqVar;
        abnv.P(zjq.class, zjqVar);
    }

    private zjq() {
        Object[] objArr = abpf.a;
        this.c = "";
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0002\u0003\u0002\u0000\u0000\u0000\u0002ဈ\u0000\u0003င\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new zjq();
        }
        if (i2 == 4) {
            return new abnp(a);
        }
        if (i2 == 5) {
            return a;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(zjq.class);
    }
}
