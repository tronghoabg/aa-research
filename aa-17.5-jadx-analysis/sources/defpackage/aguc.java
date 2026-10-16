package defpackage;

/* loaded from: classes3.dex */
final class aguc implements afec {
    final /* synthetic */ agud this$0;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
    }

    public aguc(agud agudVar) {
        this.this$0 = agudVar;
    }

    @Override // defpackage.afec
    public afak invoke(agax agaxVar) {
        if (agaxVar == null) {
            $$$reportNull$$$0(0);
        }
        this.this$0.val$errorReporter.reportCannotInferVisibility(agaxVar);
        return afak.a;
    }
}
