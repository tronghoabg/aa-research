package defpackage;

/* loaded from: classes3.dex */
public final class abvv extends abnv implements abox {
    public static final abvv a;
    public int b;
    public int c;
    public abod d = abnw.a;
    public String e = "";
    public String f = "";

    static {
        abvv abvvVar = new abvv();
        a = abvvVar;
        abnv.P(abvv.class, abvvVar);
    }

    private abvv() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0001\u0000\u0001\f\u0002\u000b\u0003+\u0004Ȉ\u0005Ȉ", new Object[]{"b", "c", "d", "e", "f"});
        }
        if (i2 == 3) {
            return new abvv();
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
        return abnv.L(abvv.class);
    }
}
