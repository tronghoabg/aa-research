package defpackage;

/* loaded from: classes3.dex */
public final class acao extends abnv implements abox {
    public static final acao a;
    public int b;
    public long c;
    public long d;

    static {
        acao acaoVar = new acao();
        a = acaoVar;
        abnv.P(acao.class, acaoVar);
    }

    private acao() {
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001", new Object[]{"b", "c", "d"});
        }
        if (i2 == 3) {
            return new acao();
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
        return abnv.L(acao.class);
    }
}
