package defpackage;

/* loaded from: classes3.dex */
public final class abzc extends abnv implements abox {
    public static final abzc a;
    public String b = "";
    public abms c = abms.d;

    static {
        abzc abzcVar = new abzc();
        a = abzcVar;
        abnv.P(abzc.class, abzcVar);
    }

    private abzc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abzc();
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
        return abnv.L(abzc.class);
    }
}
