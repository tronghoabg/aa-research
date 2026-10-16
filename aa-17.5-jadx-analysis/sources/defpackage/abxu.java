package defpackage;

/* loaded from: classes3.dex */
public final class abxu extends abnv implements abox {
    public static final aboe a = new wbk(14);
    public static final abxu b;
    public String c = "";
    public String d = "";
    public String e = "";
    public abod f = abnw.a;

    static {
        abxu abxuVar = new abxu();
        b = abxuVar;
        abnv.P(abxu.class, abxuVar);
    }

    private abxu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(b, "\u0004\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004,", new Object[]{"c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new abxu();
        }
        if (i2 == 4) {
            return new abnp(b);
        }
        if (i2 == 5) {
            return b;
        }
        if (i2 != 6) {
            return null;
        }
        return abnv.L(abxu.class);
    }
}
