package defpackage;

/* loaded from: classes3.dex */
public final class abvm extends abnv implements abox {
    public static final abvm a;
    public String b = "";
    public boolean c;
    public boolean d;

    static {
        abvm abvmVar = new abvm();
        a = abvmVar;
        abnv.P(abvm.class, abvmVar);
    }

    private abvm() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0000\u0001\u0004\u0003\u0000\u0000\u0000\u0001Ȉ\u0003\u0007\u0004\u0007", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abvm();
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
        return abnv.L(abvm.class);
    }
}
