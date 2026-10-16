package defpackage;

/* loaded from: classes3.dex */
public final class aigd extends aiga implements aijd {
    private final aigl enhancement;
    private final aiga origin;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aigd(aiga aigaVar, aigl aiglVar) {
        super(aigaVar.getLowerBound(), aigaVar.getUpperBound());
        aigaVar.getClass();
        aiglVar.getClass();
        this.origin = aigaVar;
        this.enhancement = aiglVar;
    }

    @Override // defpackage.aiga
    public aigw getDelegate() {
        return getOrigin().getDelegate();
    }

    @Override // defpackage.aijd
    public aigl getEnhancement() {
        return this.enhancement;
    }

    @Override // defpackage.aijf
    public aijf makeNullableAsSpecified(boolean z) {
        return aije.wrapEnhancement(getOrigin().makeNullableAsSpecified(z), getEnhancement().unwrap().makeNullableAsSpecified(z));
    }

    @Override // defpackage.aijf, defpackage.aigl
    public aigd refine(aiju aijuVar) {
        aijuVar.getClass();
        aigl aiglVarRefineType = aijuVar.refineType((ailw) getOrigin());
        aiglVarRefineType.getClass();
        return new aigd((aiga) aiglVarRefineType, aijuVar.refineType((ailw) getEnhancement()));
    }

    @Override // defpackage.aiga
    public String render(ahre ahreVar, ahrt ahrtVar) {
        ahreVar.getClass();
        ahrtVar.getClass();
        return ahrtVar.getEnhancedTypes() ? ahreVar.renderType(getEnhancement()) : getOrigin().render(ahreVar, ahrtVar);
    }

    @Override // defpackage.aijf
    public aijf replaceAttributes(aihr aihrVar) {
        aihrVar.getClass();
        return aije.wrapEnhancement(getOrigin().replaceAttributes(aihrVar), getEnhancement());
    }

    @Override // defpackage.aiga
    public String toString() {
        return "[@EnhancedForWarnings(" + getEnhancement() + ")] " + getOrigin();
    }

    @Override // defpackage.aijd
    public aiga getOrigin() {
        return this.origin;
    }
}
