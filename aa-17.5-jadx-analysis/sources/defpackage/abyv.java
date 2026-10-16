package defpackage;

/* loaded from: classes3.dex */
public final class abyv extends abnv implements abox {
    public static final abyv a;
    public int b;
    public int c;
    public abod d = abnw.a;
    public String e = "";
    public String f = "";
    public aboh g = abpf.b;

    static {
        abyv abyvVar = new abyv();
        a = abyvVar;
        abnv.P(abyv.class, abyvVar);
    }

    private abyv() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0002\u0000\u0001\f\u0002\u000b\u0003+\u0004Ȉ\u0005Ȉ\u0006\u001b", new Object[]{"b", "c", "d", "e", "f", "g", abyu.class});
        }
        if (i2 == 3) {
            return new abyv();
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
        return abnv.L(abyv.class);
    }
}
