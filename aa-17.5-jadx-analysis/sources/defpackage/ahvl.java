package defpackage;

/* loaded from: classes3.dex */
public final class ahvl extends ahvo {
    public ahvl(int i) {
        super(Integer.valueOf(i));
    }

    @Override // defpackage.ahuh
    public aigl getType(agcu agcuVar) {
        aigw defaultType;
        agcuVar.getClass();
        agba agbaVarFindClassAcrossModuleDependencies = agch.findClassAcrossModuleDependencies(agcuVar, afyn.uInt);
        return (agbaVarFindClassAcrossModuleDependencies == null || (defaultType = agbaVarFindClassAcrossModuleDependencies.getDefaultType()) == null) ? ailm.createErrorType(aill.NOT_FOUND_UNSIGNED_TYPE, "UInt") : defaultType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ahuh
    public String toString() {
        return ((Number) getValue()).intValue() + ".toUInt()";
    }
}
