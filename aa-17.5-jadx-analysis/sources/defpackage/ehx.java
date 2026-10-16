package defpackage;

/* loaded from: classes.dex */
public final class ehx extends eji<ehx, ejf> implements ekf {
    public static final int BOOLEAN_FIELD_NUMBER = 1;
    public static final int BYTES_FIELD_NUMBER = 8;
    public static final ehx DEFAULT_INSTANCE;
    public static final int DOUBLE_FIELD_NUMBER = 7;
    public static final int FLOAT_FIELD_NUMBER = 2;
    public static final int INTEGER_FIELD_NUMBER = 3;
    public static final int LONG_FIELD_NUMBER = 4;
    private static volatile ekk<ehx> PARSER = null;
    public static final int STRING_FIELD_NUMBER = 5;
    public static final int STRING_SET_FIELD_NUMBER = 6;
    public int valueCase_ = 0;
    public Object value_;

    static {
        ehx ehxVar = new ehx();
        DEFAULT_INSTANCE = ehxVar;
        eji.p(ehx.class, ehxVar);
    }

    private ehx() {
    }

    public static ejf b() {
        return DEFAULT_INSTANCE.i();
    }

    @Override // defpackage.eji
    protected final Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new eko(DEFAULT_INSTANCE, "\u0001\b\u0001\u0000\u0001\b\b\u0000\u0000\u0000\u0001:\u0000\u00024\u0000\u00037\u0000\u00045\u0000\u0005;\u0000\u0006<\u0000\u00073\u0000\b=\u0000", new Object[]{"value_", "valueCase_", ehw.class});
        }
        if (i2 == 3) {
            return new ehx();
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
