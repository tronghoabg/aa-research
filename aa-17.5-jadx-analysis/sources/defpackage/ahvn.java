package defpackage;

/* loaded from: classes3.dex */
public final class ahvn extends ahvo {
    public ahvn(short s) {
        super(Short.valueOf(s));
    }

    @Override // defpackage.ahuh
    public aigl getType(agcu agcuVar) {
        aigw defaultType;
        agcuVar.getClass();
        agba agbaVarFindClassAcrossModuleDependencies = agch.findClassAcrossModuleDependencies(agcuVar, afyn.uShort);
        return (agbaVarFindClassAcrossModuleDependencies == null || (defaultType = agbaVarFindClassAcrossModuleDependencies.getDefaultType()) == null) ? ailm.createErrorType(aill.NOT_FOUND_UNSIGNED_TYPE, "UShort") : defaultType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ahuh
    public String toString() {
        return ((Number) getValue()).intValue() + ".toUShort()";
    }
}
