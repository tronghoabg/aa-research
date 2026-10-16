package defpackage;

/* loaded from: classes3.dex */
public final class aasx extends abnv implements abox {
    public static final aasx a;
    private int b;
    private aasw c;

    static {
        aasx aasxVar = new aasx();
        a = aasxVar;
        abnv.P(aasx.class, aasxVar);
    }

    private aasx() {
        abnw abnwVar = abnw.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0001\u0000\u000177\u0001\u0000\u0000\u00007ဉ\u0004", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new aasx();
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
        return abnv.L(aasx.class);
    }
}
