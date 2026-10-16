package defpackage;

import java.io.Serializable;
import java.lang.reflect.Type;

/* loaded from: classes3.dex */
public final class afvm {
    private static final afib UNIT_RETURN_TYPE;
    public static final afvm INSTANCE = new afvm();
    private static final afib ANY = affw.f(Object.class);
    private static final afib NULLABLE_ANY = affw.e(Object.class);
    private static final afib CLONEABLE = affw.f(Cloneable.class);
    private static final afib SERIALIZABLE = affw.f(Serializable.class);

    static {
        afhe afheVarB = affw.b(afak.class);
        afbe afbeVar = afbe.a;
        UNIT_RETURN_TYPE = new aire(afheVarB, afbeVar, false, afbeVar, null, false, false, false, null, afvl.INSTANCE);
    }

    private afvm() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type UNIT_RETURN_TYPE$lambda$0() {
        Class cls = Void.TYPE;
        cls.getClass();
        return cls;
    }

    public final afib getANY() {
        return ANY;
    }

    public final afib getCLONEABLE() {
        return CLONEABLE;
    }

    public final afib getNULLABLE_ANY() {
        return NULLABLE_ANY;
    }

    public final afib getSERIALIZABLE() {
        return SERIALIZABLE;
    }

    public final afib getUNIT_RETURN_TYPE() {
        return UNIT_RETURN_TYPE;
    }
}
