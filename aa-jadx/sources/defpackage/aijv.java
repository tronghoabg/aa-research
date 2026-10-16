package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aijv implements defpackage.affc {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
    }

    @Override // defpackage.affc
    public java.lang.Boolean invoke(defpackage.ahof ahofVar) {
        if (ahofVar == null) {
            $$$reportNull$$$0(0);
        }
        return java.lang.Boolean.valueOf(!ahofVar.equals(defpackage.afzn.unsafeVariance));
    }
}
