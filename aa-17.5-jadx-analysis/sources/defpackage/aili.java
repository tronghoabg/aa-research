package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class aili {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ aili[] $VALUES;
    private final String debugMessage;
    public static final aili CAPTURED_TYPE_SCOPE = new aili("CAPTURED_TYPE_SCOPE", 0, "No member resolution should be done on captured type, it used only during constraint system resolution");
    public static final aili INTEGER_LITERAL_TYPE_SCOPE = new aili("INTEGER_LITERAL_TYPE_SCOPE", 1, "Scope for integer literal type (%s)");
    public static final aili ERASED_RECEIVER_TYPE_SCOPE = new aili("ERASED_RECEIVER_TYPE_SCOPE", 2, "Error scope for erased receiver type");
    public static final aili SCOPE_FOR_ABBREVIATION_TYPE = new aili("SCOPE_FOR_ABBREVIATION_TYPE", 3, "Scope for abbreviation %s");
    public static final aili STUB_TYPE_SCOPE = new aili("STUB_TYPE_SCOPE", 4, "Scope for stub type %s");
    public static final aili NON_CLASSIFIER_SUPER_TYPE_SCOPE = new aili("NON_CLASSIFIER_SUPER_TYPE_SCOPE", 5, "A scope for common supertype which is not a normal classifier");
    public static final aili ERROR_TYPE_SCOPE = new aili("ERROR_TYPE_SCOPE", 6, "Scope for error type %s");
    public static final aili UNSUPPORTED_TYPE_SCOPE = new aili("UNSUPPORTED_TYPE_SCOPE", 7, "Scope for unsupported type %s");
    public static final aili SCOPE_FOR_ERROR_CLASS = new aili("SCOPE_FOR_ERROR_CLASS", 8, "Error scope for class %s with arguments: %s");
    public static final aili SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE = new aili("SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE", 9, "Error resolution candidate for call %s");

    private static final /* synthetic */ aili[] $values() {
        return new aili[]{CAPTURED_TYPE_SCOPE, INTEGER_LITERAL_TYPE_SCOPE, ERASED_RECEIVER_TYPE_SCOPE, SCOPE_FOR_ABBREVIATION_TYPE, STUB_TYPE_SCOPE, NON_CLASSIFIER_SUPER_TYPE_SCOPE, ERROR_TYPE_SCOPE, UNSUPPORTED_TYPE_SCOPE, SCOPE_FOR_ERROR_CLASS, SCOPE_FOR_ERROR_RESOLUTION_CANDIDATE};
    }

    static {
        aili[] ailiVarArr$values = $values();
        $VALUES = ailiVarArr$values;
        $ENTRIES = affa.p(ailiVarArr$values);
    }

    private aili(String str, int i, String str2) {
        this.debugMessage = str2;
    }

    public static aili valueOf(String str) {
        return (aili) Enum.valueOf(aili.class, str);
    }

    public static aili[] values() {
        return (aili[]) $VALUES.clone();
    }

    public final String getDebugMessage() {
        return this.debugMessage;
    }
}
