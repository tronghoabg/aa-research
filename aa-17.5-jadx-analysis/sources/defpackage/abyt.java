package defpackage;

/* loaded from: classes3.dex */
public final class abyt extends abnv implements abox {
    public static final abyt a;
    public int b;
    public Object d;
    public int e;
    public int i;
    public boolean j;
    public abys k;
    public int c = 0;
    public String f = "";
    public String g = "";
    public aboh h = abpf.b;

    static {
        abyt abytVar = new abyt();
        a = abytVar;
        abnv.P(abyt.class, abytVar);
    }

    private abyt() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u000b\u0001\u0001\u0001\u000b\u000b\u0000\u0001\u0000\u0001\u000b\u0002Ȉ\u0003\f\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0007\tȈ\n\u001b\u000bဉ\u0000", new Object[]{"d", "c", "b", "e", "f", "i", abzd.class, abyl.class, abyv.class, abym.class, "j", "g", "h", abzf.class, "k"});
        }
        if (i2 == 3) {
            return new abyt();
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
        return abnv.L(abyt.class);
    }
}
