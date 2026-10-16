package defpackage;

/* loaded from: classes3.dex */
final class agdw implements agdx {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/descriptors/SourceElement$1", "getContainingFile"));
    }

    @Override // defpackage.agdx
    public agdz getContainingFile() {
        agdz agdzVar = agdz.NO_SOURCE_FILE;
        if (agdzVar == null) {
            $$$reportNull$$$0(0);
        }
        return agdzVar;
    }

    public String toString() {
        return "NO_SOURCE";
    }
}
