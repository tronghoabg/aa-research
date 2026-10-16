package defpackage;

/* loaded from: classes3.dex */
public final class ahmk {
    private static final ahkx IS_COMPILED_IN_COMPATIBILITY_MODE;
    private static final ahkx IS_COMPILED_IN_JVM_DEFAULT_MODE;
    public static final ahmk INSTANCE = new ahmk();
    private static final ahkx IS_MOVED_FROM_INTERFACE_COMPANION = ahkz.booleanFirst();

    static {
        ahkx ahkxVarBooleanFirst = ahkz.booleanFirst();
        IS_COMPILED_IN_JVM_DEFAULT_MODE = ahkxVarBooleanFirst;
        IS_COMPILED_IN_COMPATIBILITY_MODE = ahkz.booleanAfter(ahkxVarBooleanFirst);
    }

    private ahmk() {
    }

    public final ahkx getIS_COMPILED_IN_COMPATIBILITY_MODE() {
        return IS_COMPILED_IN_COMPATIBILITY_MODE;
    }

    public final ahkx getIS_COMPILED_IN_JVM_DEFAULT_MODE() {
        return IS_COMPILED_IN_JVM_DEFAULT_MODE;
    }

    public final ahkx getIS_MOVED_FROM_INTERFACE_COMPANION() {
        return IS_MOVED_FROM_INTERFACE_COMPANION;
    }
}
