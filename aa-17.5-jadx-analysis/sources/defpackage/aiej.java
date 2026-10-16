package defpackage;

/* loaded from: classes3.dex */
public final class aiej extends aifq {
    private final aigw abbreviation;
    private final aigw delegate;

    public aiej(aigw aigwVar, aigw aigwVar2) {
        aigwVar.getClass();
        aigwVar2.getClass();
        this.delegate = aigwVar;
        this.abbreviation = aigwVar2;
    }

    public final aigw getAbbreviation() {
        return this.abbreviation;
    }

    @Override // defpackage.aifq
    protected aigw getDelegate() {
        return this.delegate;
    }

    public final aigw getExpandedType() {
        return getDelegate();
    }

    @Override // defpackage.aijf
    public aiej makeNullableAsSpecified(boolean z) {
        return new aiej(getDelegate().makeNullableAsSpecified(z), this.abbreviation.makeNullableAsSpecified(z));
    }

    @Override // defpackage.aifq, defpackage.aijf, defpackage.aigl
    public aiej refine(aiju aijuVar) {
        aijuVar.getClass();
        aigl aiglVarRefineType = aijuVar.refineType((ailw) getDelegate());
        aiglVarRefineType.getClass();
        aigl aiglVarRefineType2 = aijuVar.refineType((ailw) this.abbreviation);
        aiglVarRefineType2.getClass();
        return new aiej((aigw) aiglVarRefineType, (aigw) aiglVarRefineType2);
    }

    @Override // defpackage.aijf
    public aigw replaceAttributes(aihr aihrVar) {
        aihrVar.getClass();
        return new aiej(getDelegate().replaceAttributes(aihrVar), this.abbreviation);
    }

    @Override // defpackage.aifq
    public aiej replaceDelegate(aigw aigwVar) {
        aigwVar.getClass();
        return new aiej(aigwVar, this.abbreviation);
    }
}
