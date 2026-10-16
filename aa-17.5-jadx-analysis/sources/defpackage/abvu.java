package defpackage;

/* loaded from: classes3.dex */
public final class abvu extends abnv implements abox {
    public static final abvu a;
    public Object c;
    public int d;
    public int h;
    public boolean i;
    public int b = 0;
    public String e = "";
    public String f = "";
    public aboh g = abpf.b;

    static {
        abvu abvuVar = new abvu();
        a = abvuVar;
        abnv.P(abvu.class, abvuVar);
    }

    private abvu() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\n\u0001\u0000\u0001\n\n\u0000\u0001\u0000\u0001\u000b\u0002Ȉ\u0003\f\u0004<\u0000\u0005<\u0000\u0006<\u0000\u0007<\u0000\b\u0007\tȈ\n\u001b", new Object[]{"c", "b", "d", "e", "h", abwd.class, abvo.class, abvv.class, abvp.class, "i", "f", "g", abwj.class});
        }
        if (i2 == 3) {
            return new abvu();
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
        return abnv.L(abvu.class);
    }
}
