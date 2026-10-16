package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class eid extends defpackage.ejq<defpackage.eid, defpackage.ejn> implements defpackage.ekn {
    public static final defpackage.eid DEFAULT_INSTANCE;
    private static volatile eks<defpackage.eid> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    public eju<java.lang.String> strings_ = ekv.a;

    static {
        defpackage.eid eidVar = new defpackage.eid();
        DEFAULT_INSTANCE = eidVar;
        defpackage.ejq.p(defpackage.eid.class, eidVar);
    }

    private eid() {
    }

    @Override // defpackage.ejq
    protected final java.lang.Object a(int i) {
        int i2 = i - 1;
        if (i2 == 0) {
            return (byte) 1;
        }
        if (i2 == 2) {
            return new ekw(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new java.lang.Object[]{"strings_"});
        }
        if (i2 == 3) {
            return new defpackage.eid();
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
