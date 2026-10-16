package defpackage;

/* loaded from: classes3.dex */
public final class aijk extends aihx {
    final /* synthetic */ aiiy $substitutor;
    final /* synthetic */ aijl this$0;

    public aijk(aijl aijlVar, aiiy aiiyVar) {
        this.this$0 = aijlVar;
        this.$substitutor = aiiyVar;
    }

    @Override // defpackage.aiib
    public aily transformType(aiic aiicVar, ailw ailwVar) {
        aiicVar.getClass();
        ailwVar.getClass();
        Object objLowerBoundIfFlexible = this.this$0.lowerBoundIfFlexible(ailwVar);
        objLowerBoundIfFlexible.getClass();
        aigl aiglVarSafeSubstitute = this.$substitutor.safeSubstitute((aigl) objLowerBoundIfFlexible, aijg.INVARIANT);
        aiglVarSafeSubstitute.getClass();
        aily ailyVarAsRigidType = this.this$0.asRigidType((ailw) aiglVarSafeSubstitute);
        ailyVarAsRigidType.getClass();
        return ailyVarAsRigidType;
    }
}
