package defpackage;

/* JADX INFO: loaded from: classes3.dex */
final class aiga implements defpackage.aijd {
    private final defpackage.aiku kotlinTypeRefiner;
    private final defpackage.afar refinedSupertypes$delegate;
    final /* synthetic */ defpackage.aigc this$0;

    public aiga(defpackage.aigc aigcVar, defpackage.aiku aikuVar) {
        aikuVar.getClass();
        this.this$0 = aigcVar;
        this.kotlinTypeRefiner = aikuVar;
        this.refinedSupertypes$delegate = defpackage.afga.cB(2, new defpackage.aifz(this, aigcVar));
    }

    private final java.util.List<defpackage.aihl> getRefinedSupertypes() {
        return (java.util.List) this.refinedSupertypes$delegate.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final java.util.List refinedSupertypes_delegate$lambda$0(defpackage.aiga aigaVar, defpackage.aigc aigcVar) {
        return defpackage.aikv.refineTypes(aigaVar.kotlinTypeRefiner, aigcVar.mo89getSupertypes());
    }

    public boolean equals(java.lang.Object obj) {
        return this.this$0.equals(obj);
    }

    @Override // defpackage.aijd
    public defpackage.afze getBuiltIns() {
        defpackage.afze builtIns = this.this$0.getBuiltIns();
        builtIns.getClass();
        return builtIns;
    }

    @Override // defpackage.aijd
    public defpackage.agcd getDeclarationDescriptor() {
        return this.this$0.getDeclarationDescriptor();
    }

    @Override // defpackage.aijd
    public java.util.List<defpackage.agfe> getParameters() {
        java.util.List<defpackage.agfe> parameters = this.this$0.getParameters();
        parameters.getClass();
        return parameters;
    }

    public int hashCode() {
        return this.this$0.hashCode();
    }

    @Override // defpackage.aijd
    public boolean isDenotable() {
        return this.this$0.isDenotable();
    }

    @Override // defpackage.aijd
    public defpackage.aijd refine(defpackage.aiku aikuVar) {
        aikuVar.getClass();
        return this.this$0.refine(aikuVar);
    }

    public java.lang.String toString() {
        return this.this$0.toString();
    }

    @Override // defpackage.aijd
    /* JADX INFO: renamed from: getSupertypes */
    public java.util.List<defpackage.aihl> mo89getSupertypes() {
        return getRefinedSupertypes();
    }
}
