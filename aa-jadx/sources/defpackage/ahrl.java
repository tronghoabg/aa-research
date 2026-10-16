package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public enum ahrl {
    NO_ARGUMENTS(false, false, 3, null),
    UNLESS_EMPTY(true, false, 2, null),
    ALWAYS_PARENTHESIZED(true, true);

    private static final /* synthetic */ defpackage.afef $ENTRIES = defpackage.afga.p(values());
    private final boolean includeAnnotationArguments;
    private final boolean includeEmptyAnnotationArguments;

    /* synthetic */ ahrl(boolean z, boolean z2, int i, defpackage.affu affuVar) {
        this(1 == ((z ? 1 : 0) & ((i & 1) ^ 1)), z2 & ((i & 2) == 0));
    }

    public final boolean getIncludeAnnotationArguments() {
        return this.includeAnnotationArguments;
    }

    public final boolean getIncludeEmptyAnnotationArguments() {
        return this.includeEmptyAnnotationArguments;
    }

    ahrl(boolean z, boolean z2) {
        this.includeAnnotationArguments = z;
        this.includeEmptyAnnotationArguments = z2;
    }
}
