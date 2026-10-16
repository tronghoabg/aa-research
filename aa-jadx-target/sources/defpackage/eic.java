package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eic extends defpackage.ejq<defpackage.eic, defpackage.ejn> implements defpackage.ekn {
    public static final defpackage.eic DEFAULT_INSTANCE;
    private static volatile eks<defpackage.eic> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    public ekh<java.lang.String, defpackage.eie> preferences_ = ekh.a;

    static {
        defpackage.eic eicVar = new defpackage.eic();
        DEFAULT_INSTANCE = eicVar;
        defpackage.ejq.p(defpackage.eic.class, eicVar);
    }

    private eic() {
    }

    @Override // defpackage.ejq
    protected final java.lang.Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ekw(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new java.lang.Object[]{"preferences_", defpackage.eib.a});
        }
        if (i2 == 3) {
            return new defpackage.eic();
        }
        if (i2 == 4) {
            return new defpackage.ejn(DEFAULT_INSTANCE);
        }
        if (i2 == 5) {
            return DEFAULT_INSTANCE;
        }
        throw null;
    }
}
