package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class pyw {
    public static final pyw a;
    public static final pyw b;
    public static final pyw c;

    @Deprecated
    public static final pyw d;
    private static final /* synthetic */ pyw[] e;

    static {
        pyw pywVar = new pyw("ON_CLIENT_PARAMETERS_LOADED", 0);
        a = pywVar;
        pyw pywVar2 = new pyw("ON_FIRST_TRANSITION_COMPLETE", 1);
        b = pywVar2;
        pyw pywVar3 = new pyw("ON_STARTUP_FULLY_COMPLETE", 2);
        c = pywVar3;
        pyw pywVar4 = new pyw("ON_MAP_STABLE", 3);
        d = pywVar4;
        e = new pyw[]{pywVar, pywVar2, pywVar3, pywVar4};
    }

    public static pyw valueOf(String str) {
        return (pyw) Enum.valueOf(pyw.class, str);
    }

    public static pyw[] values() {
        return (pyw[]) e.clone();
    }
}
