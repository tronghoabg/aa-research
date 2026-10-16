package defpackage;

/* loaded from: classes2.dex */
public final class qno extends abnv implements abox {
    public static final qno a;

    static {
        qno qnoVar = new qno();
        a = qnoVar;
        abnv.P(qno.class, qnoVar);
    }

    private qno() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0000\u0000", null);
        }
        if (i2 == 3) {
            return new qno();
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
        return abnv.L(qno.class);
    }
}
