package defpackage;

/* loaded from: classes3.dex */
public final class abzr extends abnv implements abox {
    public static final abzr a;
    public String b = "";
    public aboh c = abpf.b;

    static {
        abzr abzrVar = new abzr();
        a = abzrVar;
        abnv.P(abzr.class, abzrVar);
    }

    private abzr() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0002\u0000\u0000\u0002\u0004\u0002\u0000\u0001\u0000\u0002Ȉ\u0004\u001b", new Object[]{"b", "c", abzp.class});
        }
        if (i2 == 3) {
            return new abzr();
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
        return abnv.L(abzr.class);
    }
}
