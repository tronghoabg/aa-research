package defpackage;

/* loaded from: classes.dex */
public final class ehw extends eji<ehw, ejf> implements ekf {
    public static final ehw DEFAULT_INSTANCE;
    private static volatile ekk<ehw> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    public ejm<String> strings_ = ekn.a;

    static {
        ehw ehwVar = new ehw();
        DEFAULT_INSTANCE = ehwVar;
        eji.p(ehw.class, ehwVar);
    }

    private ehw() {
    }

    @Override // defpackage.eji
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new eko(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
        }
        if (i2 == 3) {
            return new ehw();
        }
        if (i2 == 4) {
            return new ejf(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }
}
