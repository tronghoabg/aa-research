package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ailb {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ ailb[] $VALUES;
    private final String debugText;
    public static final ailb ERROR_CLASS = new ailb("ERROR_CLASS", 0, "<Error class: %s>");
    public static final ailb ERROR_FUNCTION = new ailb("ERROR_FUNCTION", 1, "<Error function>");
    public static final ailb ERROR_SCOPE = new ailb("ERROR_SCOPE", 2, "<Error scope>");
    public static final ailb ERROR_MODULE = new ailb("ERROR_MODULE", 3, "<Error module>");
    public static final ailb ERROR_PROPERTY = new ailb("ERROR_PROPERTY", 4, "<Error property>");
    public static final ailb ERROR_TYPE = new ailb("ERROR_TYPE", 5, "[Error type: %s]");
    public static final ailb PARENT_OF_ERROR_SCOPE = new ailb("PARENT_OF_ERROR_SCOPE", 6, "<Fake parent for error lexical scope>");

    private static final /* synthetic */ ailb[] $values() {
        return new ailb[]{ERROR_CLASS, ERROR_FUNCTION, ERROR_SCOPE, ERROR_MODULE, ERROR_PROPERTY, ERROR_TYPE, PARENT_OF_ERROR_SCOPE};
    }

    static {
        ailb[] ailbVarArr$values = $values();
        $VALUES = ailbVarArr$values;
        $ENTRIES = affa.p(ailbVarArr$values);
    }

    private ailb(String str, int i, String str2) {
        this.debugText = str2;
    }

    public static ailb valueOf(String str) {
        return (ailb) Enum.valueOf(ailb.class, str);
    }

    public static ailb[] values() {
        return (ailb[]) $VALUES.clone();
    }

    public final String getDebugText() {
        return this.debugText;
    }
}
