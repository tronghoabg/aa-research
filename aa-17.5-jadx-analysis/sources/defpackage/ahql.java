package defpackage;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes3.dex */
public final class ahql {
    private static final /* synthetic */ afdf $ENTRIES;
    private static final /* synthetic */ ahql[] $VALUES;
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;
    public static final ahql NO_ARGUMENTS = new ahql("NO_ARGUMENTS", 0, false, false, 3, null);
    public static final ahql UNLESS_EMPTY = new ahql("UNLESS_EMPTY", 1, true, false, 2, null);
    public static final ahql ALWAYS_PARENTHESIZED = new ahql("ALWAYS_PARENTHESIZED", 2, true, true);

    private static final /* synthetic */ ahql[] $values() {
        return new ahql[]{NO_ARGUMENTS, UNLESS_EMPTY, ALWAYS_PARENTHESIZED};
    }

    static {
        ahql[] ahqlVarArr$values = $values();
        $VALUES = ahqlVarArr$values;
        $ENTRIES = affa.p(ahqlVarArr$values);
    }

    public /* synthetic */ ahql(String str, int i, boolean z, boolean z2, int i2, afeu afeuVar) {
        this(str, i, 1 == ((z ? 1 : 0) & ((i2 & 1) ^ 1)), z2 & ((i2 & 2) == 0));
    }

    public static ahql valueOf(String str) {
        return (ahql) Enum.valueOf(ahql.class, str);
    }

    public static ahql[] values() {
        return (ahql[]) $VALUES.clone();
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.includeAnnotationArguments;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.includeEmptyAnnotationArguments;
    }

    private ahql(String str, int i, boolean z, boolean z2) {
        this.includeAnnotationArguments = z;
        this.includeEmptyAnnotationArguments = z2;
    }
}
