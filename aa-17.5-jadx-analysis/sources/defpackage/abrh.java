package defpackage;

/* loaded from: classes.dex */
public final class abrh extends abnv implements abox {
    public static final abrh a;
    public int b;
    public int c;
    public aboh d = abpf.b;
    public String e = "";

    static {
        abrh abrhVar = new abrh();
        a = abrhVar;
        abnv.P(abrh.class, abrhVar);
    }

    private abrh() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001᠌\u0000\u0002\u001a\u0003ဈ\u0001", new Object[]{"b", "c", abho.s, "d", "e"});
        }
        if (i2 == 3) {
            return new abrh();
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
        return abnv.L(abrh.class);
    }
}
