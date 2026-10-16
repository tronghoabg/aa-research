package defpackage;

/* loaded from: classes2.dex */
public final class paz extends abnv implements abox {
    public static final paz a;
    public aboh b = abpf.b;

    static {
        paz pazVar = new paz();
        a = pazVar;
        abnv.P(paz.class, pazVar);
    }

    private paz() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"b", pay.class});
        }
        if (i2 == 3) {
            return new paz();
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
        return abnv.L(paz.class);
    }
}
