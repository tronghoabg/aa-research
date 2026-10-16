package defpackage;

/* loaded from: classes2.dex */
public final class otg extends abnv implements abox {
    public static final otg a;
    public static final abnh d;
    public aboh b;
    public aboh c;

    static {
        otg otgVar = new otg();
        a = otgVar;
        abnv.P(otg.class, otgVar);
        d = abnv.W(osn.a, otgVar, otgVar, null, 104, abqd.MESSAGE);
    }

    private otg() {
        abpf abpfVar = abpf.b;
        this.b = abpfVar;
        this.c = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0002\u0000\u0001\u001a\u0002\u001b", new Object[]{"b", "c", orz.class});
        }
        if (i2 == 3) {
            return new otg();
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
        return abnv.L(otg.class);
    }
}
