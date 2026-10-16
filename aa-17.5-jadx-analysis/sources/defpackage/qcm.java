package defpackage;

/* loaded from: classes2.dex */
public final class qcm extends abnv implements abox {
    public static final qcm a;
    public String b = "";
    public int c;
    private int d;

    static {
        qcm qcmVar = new qcm();
        a = qcmVar;
        abnv.P(qcm.class, qcmVar);
    }

    private qcm() {
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002င\u0001", new Object[]{"d", "b", "c"});
        }
        if (i2 == 3) {
            return new qcm();
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
        return abnv.L(qcm.class);
    }
}
