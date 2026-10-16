package defpackage;

/* loaded from: classes3.dex */
public final class ahat extends aifq implements aifl {
    private final aigw delegate;

    public ahat(aigw aigwVar) {
        aigwVar.getClass();
        this.delegate = aigwVar;
    }

    private final aigw prepareReplacement(aigw aigwVar) {
        aigw aigwVarMakeNullableAsSpecified = aigwVar.makeNullableAsSpecified(false);
        return !aimr.isTypeParameter(aigwVar) ? aigwVarMakeNullableAsSpecified : new ahat(aigwVarMakeNullableAsSpecified);
    }

    @Override // defpackage.aifq
    protected aigw getDelegate() {
        return this.delegate;
    }

    @Override // defpackage.aifq, defpackage.aigl
    public boolean isMarkedNullable() {
        return false;
    }

    @Override // defpackage.aifl
    public boolean isTypeParameter() {
        return true;
    }

    @Override // defpackage.aijf
    public aigw makeNullableAsSpecified(boolean z) {
        return z ? getDelegate().makeNullableAsSpecified(true) : this;
    }

    @Override // defpackage.aijf
    public ahat replaceAttributes(aihr aihrVar) {
        aihrVar.getClass();
        return new ahat(getDelegate().replaceAttributes(aihrVar));
    }

    @Override // defpackage.aifq
    public ahat replaceDelegate(aigw aigwVar) {
        aigwVar.getClass();
        return new ahat(aigwVar);
    }

    @Override // defpackage.aifl
    public aigl substitutionResult(aigl aiglVar) {
        aiglVar.getClass();
        aijf aijfVarUnwrap = aiglVar.unwrap();
        if (!aimr.isTypeParameter(aijfVarUnwrap) && !aijc.isNullableType(aijfVarUnwrap)) {
            return aijfVarUnwrap;
        }
        if (aijfVarUnwrap instanceof aigw) {
            return prepareReplacement((aigw) aijfVarUnwrap);
        }
        if (!(aijfVarUnwrap instanceof aiga)) {
            throw new aezs();
        }
        aiga aigaVar = (aiga) aijfVarUnwrap;
        return aije.wrapEnhancement(aigq.flexibleType(prepareReplacement(aigaVar.getLowerBound()), prepareReplacement(aigaVar.getUpperBound())), aije.getEnhancement(aijfVarUnwrap));
    }
}
