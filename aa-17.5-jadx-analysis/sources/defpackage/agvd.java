package defpackage;

/* loaded from: classes3.dex */
enum agvd {
    NON_STABLE_DECLARED(false, false),
    STABLE_DECLARED(true, false),
    NON_STABLE_SYNTHESIZED(false, true),
    STABLE_SYNTHESIZED(true, true);

    public final boolean isStable;
    public final boolean isSynthesized;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
    }

    agvd(boolean z, boolean z2) {
        this.isStable = z;
        this.isSynthesized = z2;
    }

    public static agvd get(boolean z, boolean z2) {
        agvd agvdVar = z ? z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED : z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
        if (agvdVar == null) {
            $$$reportNull$$$0(0);
        }
        return agvdVar;
    }
}
