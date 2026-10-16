package defpackage;

/* JADX INFO: loaded from: classes3.dex */
enum agwd {
    NON_STABLE_DECLARED(false, false),
    STABLE_DECLARED(true, false),
    NON_STABLE_SYNTHESIZED(false, true),
    STABLE_SYNTHESIZED(true, true);

    public final boolean isStable;
    public final boolean isSynthesized;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new java.lang.IllegalStateException(java.lang.String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
    }

    agwd(boolean z, boolean z2) {
        this.isStable = z;
        this.isSynthesized = z2;
    }

    public static defpackage.agwd get(boolean z, boolean z2) {
        defpackage.agwd agwdVar;
        if (z) {
            agwdVar = z2 ? STABLE_SYNTHESIZED : STABLE_DECLARED;
        } else {
            agwdVar = z2 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
        }
        if (agwdVar == null) {
            $$$reportNull$$$0(0);
        }
        return agwdVar;
    }
}
