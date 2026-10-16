package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahnk {
    private static final defpackage.ahlx IS_COMPILED_IN_COMPATIBILITY_MODE;
    private static final defpackage.ahlx IS_COMPILED_IN_JVM_DEFAULT_MODE;
    public static final defpackage.ahnk INSTANCE = new defpackage.ahnk();
    private static final defpackage.ahlx IS_MOVED_FROM_INTERFACE_COMPANION = defpackage.ahlz.booleanFirst();

    static {
        defpackage.ahlx ahlxVarBooleanFirst = defpackage.ahlz.booleanFirst();
        IS_COMPILED_IN_JVM_DEFAULT_MODE = ahlxVarBooleanFirst;
        IS_COMPILED_IN_COMPATIBILITY_MODE = defpackage.ahlz.booleanAfter(ahlxVarBooleanFirst);
    }

    private ahnk() {
    }

    public final defpackage.ahlx getIS_COMPILED_IN_COMPATIBILITY_MODE() {
        return IS_COMPILED_IN_COMPATIBILITY_MODE;
    }

    public final defpackage.ahlx getIS_COMPILED_IN_JVM_DEFAULT_MODE() {
        return IS_COMPILED_IN_JVM_DEFAULT_MODE;
    }

    public final defpackage.ahlx getIS_MOVED_FROM_INTERFACE_COMPANION() {
        return IS_MOVED_FROM_INTERFACE_COMPANION;
    }
}
