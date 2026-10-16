package defpackage;

/* loaded from: classes3.dex */
final class aiiv implements afec {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
    }

    @Override // defpackage.afec
    public Boolean invoke(ahnf ahnfVar) {
        if (ahnfVar == null) {
            $$$reportNull$$$0(0);
        }
        return Boolean.valueOf(!ahnfVar.equals(afyn.unsafeVariance));
    }
}
