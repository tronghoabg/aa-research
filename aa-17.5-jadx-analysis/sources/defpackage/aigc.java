package defpackage;

/* loaded from: classes3.dex */
public final class aigc extends aiga implements aifl {
    public static final aigb Companion = new aigb(null);
    public static boolean RUN_SLOW_ASSERTIONS;
    private boolean assertionsDone;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aigc(aigw aigwVar, aigw aigwVar2) {
        super(aigwVar, aigwVar2);
        aigwVar.getClass();
        aigwVar2.getClass();
    }

    private final void runAssertions() {
        if (!RUN_SLOW_ASSERTIONS || this.assertionsDone) {
            return;
        }
        this.assertionsDone = true;
        aige.isFlexible(getLowerBound());
        aige.isFlexible(getUpperBound());
        affa.f(getLowerBound(), getUpperBound());
        aijp.DEFAULT.isSubtypeOf(getLowerBound(), getUpperBound());
    }

    @Override // defpackage.aiga
    public aigw getDelegate() {
        runAssertions();
        return getLowerBound();
    }

    @Override // defpackage.aifl
    public boolean isTypeParameter() {
        return (getLowerBound().getConstructor().getDeclarationDescriptor() instanceof agee) && affa.f(getLowerBound().getConstructor(), getUpperBound().getConstructor());
    }

    @Override // defpackage.aijf
    public aijf makeNullableAsSpecified(boolean z) {
        return aigq.flexibleType(getLowerBound().makeNullableAsSpecified(z), getUpperBound().makeNullableAsSpecified(z));
    }

    @Override // defpackage.aijf, defpackage.aigl
    public aiga refine(aiju aijuVar) {
        aijuVar.getClass();
        aigl aiglVarRefineType = aijuVar.refineType((ailw) getLowerBound());
        aiglVarRefineType.getClass();
        aigl aiglVarRefineType2 = aijuVar.refineType((ailw) getUpperBound());
        aiglVarRefineType2.getClass();
        return new aigc((aigw) aiglVarRefineType, (aigw) aiglVarRefineType2);
    }

    @Override // defpackage.aiga
    public String render(ahre ahreVar, ahrt ahrtVar) {
        ahreVar.getClass();
        ahrtVar.getClass();
        if (!ahrtVar.getDebugMode()) {
            return ahreVar.renderFlexibleType(ahreVar.renderType(getLowerBound()), ahreVar.renderType(getUpperBound()), aimr.getBuiltIns(this));
        }
        return "(" + ahreVar.renderType(getLowerBound()) + ".." + ahreVar.renderType(getUpperBound()) + ')';
    }

    @Override // defpackage.aijf
    public aijf replaceAttributes(aihr aihrVar) {
        aihrVar.getClass();
        return aigq.flexibleType(getLowerBound().replaceAttributes(aihrVar), getUpperBound().replaceAttributes(aihrVar));
    }

    @Override // defpackage.aifl
    public aigl substitutionResult(aigl aiglVar) {
        aijf aijfVarFlexibleType;
        aiglVar.getClass();
        aijf aijfVarUnwrap = aiglVar.unwrap();
        if (aijfVarUnwrap instanceof aiga) {
            aijfVarFlexibleType = aijfVarUnwrap;
        } else {
            if (!(aijfVarUnwrap instanceof aigw)) {
                throw new aezs();
            }
            aigw aigwVar = (aigw) aijfVarUnwrap;
            aijfVarFlexibleType = aigq.flexibleType(aigwVar, aigwVar.makeNullableAsSpecified(true));
        }
        return aije.inheritEnhancement(aijfVarFlexibleType, aijfVarUnwrap);
    }

    @Override // defpackage.aiga
    public String toString() {
        return "(" + getLowerBound() + ".." + getUpperBound() + ')';
    }
}
