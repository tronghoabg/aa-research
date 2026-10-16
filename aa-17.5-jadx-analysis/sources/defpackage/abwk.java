package defpackage;

/* loaded from: classes3.dex */
public final class abwk extends abnv implements abox {
    public static final abwk a;
    public String b = "";
    public aboh c = abpf.b;
    public boolean d;

    static {
        abwk abwkVar = new abwk();
        a = abwkVar;
        abnv.P(abwk.class, abwkVar);
    }

    private abwk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0001\u0000\u0001Ȉ\u0002Ț\u0003\u0007", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abwk();
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
        return abnv.L(abwk.class);
    }
}
