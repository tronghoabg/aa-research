package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class agew implements defpackage.agex {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new java.lang.IllegalStateException(java.lang.String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
    }

    @Override // defpackage.agex
    public defpackage.agez getContainingFile() {
        defpackage.agez agezVar = defpackage.agez.NO_SOURCE_FILE;
        if (agezVar == null) {
            $$$reportNull$$$0(0);
        }
        return agezVar;
    }

    public java.lang.String toString() {
        return "NO_SOURCE";
    }
}
