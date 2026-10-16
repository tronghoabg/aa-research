package defpackage;

/* loaded from: classes3.dex */
public final class abbk extends abnv implements abox {
    public static final abbk a;
    public int b;
    public long c;
    public aboh d = abpf.b;
    public int e;

    static {
        abbk abbkVar = new abbk();
        a = abbkVar;
        abnv.P(abbk.class, abbkVar);
    }

    private abbk() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဂ\u0000\u0002\u001b\u0003င\u0001", new Object[]{"b", "c", "d", abbj.class, "e"});
        }
        if (i2 == 3) {
            return new abbk();
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
        return abnv.L(abbk.class);
    }
}
