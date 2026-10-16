package defpackage;

/* loaded from: classes.dex */
public final class ehv extends eji<ehv, ejf> implements ekf {
    public static final ehv DEFAULT_INSTANCE;
    private static volatile ekk<ehv> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    public ejz<String, ehx> preferences_ = ejz.a;

    static {
        ehv ehvVar = new ehv();
        DEFAULT_INSTANCE = ehvVar;
        eji.p(ehv.class, ehvVar);
    }

    private ehv() {
    }

    @Override // defpackage.eji
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new eko(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", ehu.a});
        }
        if (i2 == 3) {
            return new ehv();
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
