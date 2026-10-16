package defpackage;

/* loaded from: classes2.dex */
public final class osa extends abnv implements abox {
    public static final osa a;
    public int b;
    public int c;
    public int e;
    public String d = "";
    public aboh f = abpf.b;

    static {
        osa osaVar = new osa();
        a = osaVar;
        abnv.P(osa.class, osaVar);
    }

    private osa() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004\u001a", new Object[]{"b", "c", orj.f, "d", "e", orj.i, "f"});
        }
        if (i2 == 3) {
            return new osa();
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
        return abnv.L(osa.class);
    }
}
