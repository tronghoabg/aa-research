package defpackage;

/* loaded from: classes3.dex */
public final class abez extends abnv implements abox {
    public static final abez a;
    public int b;
    public int c;
    private int d;

    static {
        abez abezVar = new abez();
        a = abezVar;
        abnv.P(abez.class, abezVar);
    }

    private abez() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002᠌\u0001", new Object[]{"d", "b", abce.k, "c", abce.l});
        }
        if (i2 == 3) {
            return new abez();
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
        return abnv.L(abez.class);
    }
}
