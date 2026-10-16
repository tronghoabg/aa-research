package defpackage;

/* loaded from: classes2.dex */
public final class pas extends abnv implements abox {
    public static final pas a;
    public aboh b = abpf.b;
    public boolean c;
    private int d;

    static {
        pas pasVar = new pas();
        a = pasVar;
        abnv.P(pas.class, pasVar);
    }

    private pas() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001b\u0002ဇ\u0000", new Object[]{"d", "b", abnf.class, "c"});
        }
        if (i2 == 3) {
            return new pas();
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
        return abnv.L(pas.class);
    }
}
