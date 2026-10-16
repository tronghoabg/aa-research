package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class agvc implements defpackage.affc {
    final /* synthetic */ defpackage.agvd this$0;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        throw new java.lang.IllegalArgumentException(java.lang.String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "descriptor", "kotlin/reflect/jvm/internal/impl/load/java/components/DescriptorResolverUtils$1$1", "invoke"));
    }

    public agvc(defpackage.agvd agvdVar) {
        this.this$0 = agvdVar;
    }

    @Override // defpackage.affc
    public defpackage.afbk invoke(defpackage.agbx agbxVar) {
        if (agbxVar == null) {
            $$$reportNull$$$0(0);
        }
        this.this$0.val$errorReporter.reportCannotInferVisibility(agbxVar);
        return defpackage.afbk.a;
    }
}
