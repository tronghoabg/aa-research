package defpackage;

/* loaded from: classes2.dex */
public final class qnw extends abnv implements abox {
    public static final qnw a;
    public boolean b;
    public String c = "";
    public aboh d;
    public aboh e;
    private int f;

    static {
        qnw qnwVar = new qnw();
        a = qnwVar;
        abnv.P(qnw.class, qnwVar);
    }

    private qnw() {
        abpf abpfVar = abpf.b;
        this.d = abpfVar;
        this.e = abpfVar;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001ဇ\u0000\u0002Ȉ\u0003Ț\u0004Ț", new Object[]{"f", "b", "c", "d", "e"});
        }
        if (i2 == 3) {
            return new qnw();
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
        return abnv.L(qnw.class);
    }
}
