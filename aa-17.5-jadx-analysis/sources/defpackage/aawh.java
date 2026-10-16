package defpackage;

/* loaded from: classes3.dex */
public final class aawh extends abnv implements abox {
    public static final aawh a;

    static {
        aawh aawhVar = new aawh();
        a = aawhVar;
        abnv.P(aawh.class, aawhVar);
    }

    private aawh() {
        abnw abnwVar = abnw.a;
        Object[] objArr = abpf.a;
    }

    @Override // defpackage.abnv
    protected final Object a(int i, Object obj) {
        int i2 = i - 1;
        if (i2 == 2) {
            return new abpg(a, "\u0004\u0000", null);
        }
        if (i2 == 3) {
            return new aawh();
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
        return abnv.L(aawh.class);
    }
}
