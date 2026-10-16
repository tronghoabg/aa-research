package defpackage;

/* loaded from: classes3.dex */
public final class ahtz extends aifp {
    final /* synthetic */ boolean $needApproximation;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahtz(aiit aiitVar, boolean z) {
        super(aiitVar);
        this.$needApproximation = z;
    }

    @Override // defpackage.aifp, defpackage.aiit
    public boolean approximateContravariantCapturedTypes() {
        return this.$needApproximation;
    }

    @Override // defpackage.aifp, defpackage.aiit
    public aiin get(aigl aiglVar) {
        aiglVar.getClass();
        aiin aiinVar = super.get(aiglVar);
        if (aiinVar == null) {
            return null;
        }
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        return ahua.createCapturedIfNeeded(aiinVar, declarationDescriptor instanceof agee ? (agee) declarationDescriptor : null);
    }
}
