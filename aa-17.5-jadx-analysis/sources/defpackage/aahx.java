package defpackage;

/* loaded from: classes3.dex */
public final class aahx extends abnv implements abox {
    public static final aahx a;
    public String b = "";

    static {
        aahx aahxVar = new aahx();
        a = aahxVar;
        abnv.P(aahx.class, aahxVar);
    }

    private aahx() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new aahx();
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
        return abnv.L(aahx.class);
    }
}
