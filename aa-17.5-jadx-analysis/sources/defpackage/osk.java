package defpackage;

/* loaded from: classes2.dex */
public final class osk extends abnv implements abox {
    public static final osk a;
    public aboh b;
    public aboh c;
    public boolean d;
    private int e;

    static {
        osk oskVar = new osk();
        a = oskVar;
        abnv.P(osk.class, oskVar);
    }

    private osk() {
        abpf abpfVar = abpf.b;
        this.b = abpfVar;
        this.c = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001a\u0002\u001b\u0003ဇ\u0000", new Object[]{"e", "b", "c", osd.class, "d"});
        }
        if (i2 == 3) {
            return new osk();
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
        return abnv.L(osk.class);
    }
}
