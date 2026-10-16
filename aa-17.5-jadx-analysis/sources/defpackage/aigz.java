package defpackage;

/* loaded from: classes3.dex */
public final class aigz extends aifq implements aijd {
    private final aigw delegate;
    private final aigl enhancement;

    public aigz(aigw aigwVar, aigl aiglVar) {
        aigwVar.getClass();
        aiglVar.getClass();
        this.delegate = aigwVar;
        this.enhancement = aiglVar;
    }

    @Override // defpackage.aifq
    protected aigw getDelegate() {
        return this.delegate;
    }

    @Override // defpackage.aijd
    public aigl getEnhancement() {
        return this.enhancement;
    }

    @Override // defpackage.aijd
    public aigw getOrigin() {
        return getDelegate();
    }

    @Override // defpackage.aijf
    public aigw makeNullableAsSpecified(boolean z) {
        return (aigw) aije.wrapEnhancement(getOrigin().makeNullableAsSpecified(z), getEnhancement().unwrap().makeNullableAsSpecified(z));
    }

    @Override // defpackage.aifq, defpackage.aijf, defpackage.aigl
    public aigz refine(aiju aijuVar) {
        aijuVar.getClass();
        aigl aiglVarRefineType = aijuVar.refineType((ailw) getDelegate());
        aiglVarRefineType.getClass();
        return new aigz((aigw) aiglVarRefineType, aijuVar.refineType((ailw) getEnhancement()));
    }

    @Override // defpackage.aijf
    public aigw replaceAttributes(aihr aihrVar) {
        aihrVar.getClass();
        return (aigw) aije.wrapEnhancement(getOrigin().replaceAttributes(aihrVar), getEnhancement());
    }

    @Override // defpackage.aifq
    public aigz replaceDelegate(aigw aigwVar) {
        aigwVar.getClass();
        return new aigz(aigwVar, getEnhancement());
    }

    @Override // defpackage.aigw
    public String toString() {
        return "[@EnhancedForWarnings(" + getEnhancement() + ")] " + getOrigin();
    }
}
