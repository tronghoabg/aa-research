package defpackage;

/* loaded from: classes3.dex */
public final class aatn extends abnv implements abox {
    public static final aatn a;
    private int b;
    private aatm c;

    static {
        aatn aatnVar = new aatn();
        a = aatnVar;
        abnv.P(aatn.class, aatnVar);
    }

    private aatn() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u0001  \u0001\u0000\u0000\u0000 ဉ\u001b", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new aatn();
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
        return abnv.L(aatn.class);
    }
}
