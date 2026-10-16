package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class afwm {
    private static final defpackage.afjb UNIT_RETURN_TYPE;
    public static final defpackage.afwm INSTANCE = new defpackage.afwm();
    private static final defpackage.afjb ANY = defpackage.afgw.f(java.lang.Object.class);
    private static final defpackage.afjb NULLABLE_ANY = defpackage.afgw.e(java.lang.Object.class);
    private static final defpackage.afjb CLONEABLE = defpackage.afgw.f(java.lang.Cloneable.class);
    private static final defpackage.afjb SERIALIZABLE = defpackage.afgw.f(java.io.Serializable.class);

    static {
        defpackage.afie afieVarB = defpackage.afgw.b(defpackage.afbk.class);
        defpackage.afce afceVar = defpackage.afce.a;
        UNIT_RETURN_TYPE = new defpackage.aise(afieVarB, afceVar, false, afceVar, null, false, false, false, null, defpackage.afwl.INSTANCE);
    }

    private afwm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.lang.reflect.Type UNIT_RETURN_TYPE$lambda$0() {
        java.lang.Class cls = java.lang.Void.TYPE;
        cls.getClass();
        return cls;
    }

    public final defpackage.afjb getANY() {
        return ANY;
    }

    public final defpackage.afjb getCLONEABLE() {
        return CLONEABLE;
    }

    public final defpackage.afjb getNULLABLE_ANY() {
        return NULLABLE_ANY;
    }

    public final defpackage.afjb getSERIALIZABLE() {
        return SERIALIZABLE;
    }

    public final defpackage.afjb getUNIT_RETURN_TYPE() {
        return UNIT_RETURN_TYPE;
    }
}
