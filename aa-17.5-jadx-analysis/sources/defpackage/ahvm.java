package defpackage;

/* loaded from: classes3.dex */
public final class ahvm extends ahvo {
    public ahvm(long j) {
        super(Long.valueOf(j));
    }

    @Override // defpackage.ahuh
    public aigl getType(agcu agcuVar) {
        aigw defaultType;
        agcuVar.getClass();
        agba agbaVarFindClassAcrossModuleDependencies = agch.findClassAcrossModuleDependencies(agcuVar, afyn.uLong);
        return (agbaVarFindClassAcrossModuleDependencies == null || (defaultType = agbaVarFindClassAcrossModuleDependencies.getDefaultType()) == null) ? ailm.createErrorType(aill.NOT_FOUND_UNSIGNED_TYPE, "ULong") : defaultType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ahuh
    public String toString() {
        return ((Number) getValue()).longValue() + ".toULong()";
    }
}
