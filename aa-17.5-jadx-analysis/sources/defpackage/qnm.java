package defpackage;

/* loaded from: classes2.dex */
public final class qnm extends abnv implements abox {
    public static final qnm a;
    public String b = "";
    public int c;

    static {
        qnm qnmVar = new qnm();
        a = qnmVar;
        abnv.P(qnm.class, qnmVar);
    }

    private qnm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\f", new Object[]{"b", "c"});
        }
        if (i2 == 3) {
            return new qnm();
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
        return abnv.L(qnm.class);
    }
}
