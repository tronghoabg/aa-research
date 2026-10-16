package defpackage;

/* loaded from: classes3.dex */
public final class abwc extends abnv implements abox {
    public static final abwc a;
    public String b = "";
    public abms c = abms.d;

    static {
        abwc abwcVar = new abwc();
        a = abwcVar;
        abnv.P(abwc.class, abwcVar);
    }

    private abwc() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\n", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new abwc();
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
        return abnv.L(abwc.class);
    }
}
