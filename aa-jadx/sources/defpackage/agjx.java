package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class agjx extends defpackage.agjy {
    private final defpackage.afar destructuringVariables$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agjx(defpackage.agbv agbvVar, defpackage.agfl agflVar, int i, defpackage.aggk aggkVar, defpackage.ahoj ahojVar, defpackage.aihl aihlVar, boolean z, boolean z2, boolean z3, defpackage.aihl aihlVar2, defpackage.agex agexVar, defpackage.afer<? extends java.util.List<? extends defpackage.agfm>> aferVar) {
        super(agbvVar, agflVar, i, aggkVar, ahojVar, aihlVar, z, z2, z3, aihlVar2, agexVar);
        agbvVar.getClass();
        aggkVar.getClass();
        ahojVar.getClass();
        aihlVar.getClass();
        agexVar.getClass();
        aferVar.getClass();
        this.destructuringVariables$delegate = defpackage.afga.cA(aferVar);
    }

    @Override // defpackage.agjy, defpackage.agfl
    public defpackage.agfl copy(defpackage.agbv agbvVar, defpackage.ahoj ahojVar, int i) {
        agbvVar.getClass();
        ahojVar.getClass();
        defpackage.aggk annotations = getAnnotations();
        annotations.getClass();
        defpackage.aihl type = getType();
        type.getClass();
        boolean zDeclaresDefaultValue = declaresDefaultValue();
        boolean zIsCrossinline = isCrossinline();
        boolean zIsNoinline = isNoinline();
        defpackage.aihl varargElementType = getVarargElementType();
        defpackage.agex agexVar = defpackage.agex.NO_SOURCE;
        agexVar.getClass();
        return new defpackage.agjx(agbvVar, null, i, annotations, ahojVar, type, zDeclaresDefaultValue, zIsCrossinline, zIsNoinline, varargElementType, agexVar, new defpackage.agjw(this));
    }

    public final java.util.List<defpackage.agfm> getDestructuringVariables() {
        return (java.util.List) this.destructuringVariables$delegate.a();
    }
}
