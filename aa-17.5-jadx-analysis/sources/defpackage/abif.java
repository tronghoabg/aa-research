package defpackage;

/* loaded from: classes3.dex */
public final class abif extends abnv implements abox {
    public static final abif a;
    public int b;
    public aboh c = abpf.b;
    public boolean d;

    static {
        abif abifVar = new abif();
        a = abifVar;
        abnv.P(abif.class, abifVar);
    }

    private abif() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0002\u0000\u0001\u0004\u0005\u0002\u0000\u0001\u0000\u0004Ț\u0005ဇ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new abif();
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
        return abnv.L(abif.class);
    }
}
