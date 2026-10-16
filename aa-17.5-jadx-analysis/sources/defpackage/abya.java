package defpackage;

/* loaded from: classes3.dex */
public final class abya extends abnv implements abox {
    public static final abya a;
    public String b = "";

    static {
        abya abyaVar = new abya();
        a = abyaVar;
        abnv.P(abya.class, abyaVar);
    }

    private abya() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", new Object[]{"b"});
        }
        if (i2 == 3) {
            return new abya();
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
        return abnv.L(abya.class);
    }
}
