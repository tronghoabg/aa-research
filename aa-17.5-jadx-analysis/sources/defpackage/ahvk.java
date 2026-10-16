package defpackage;

/* loaded from: classes3.dex */
public final class ahvk extends ahvo {
    public ahvk(byte b) {
        super(Byte.valueOf(b));
    }

    @Override // defpackage.ahuh
    public aigl getType(agcu agcuVar) {
        aigw defaultType;
        agcuVar.getClass();
        agba agbaVarFindClassAcrossModuleDependencies = agch.findClassAcrossModuleDependencies(agcuVar, afyn.uByte);
        return (agbaVarFindClassAcrossModuleDependencies == null || (defaultType = agbaVarFindClassAcrossModuleDependencies.getDefaultType()) == null) ? ailm.createErrorType(aill.NOT_FOUND_UNSIGNED_TYPE, "UByte") : defaultType;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ahuh
    public String toString() {
        return ((Number) getValue()).intValue() + ".toUByte()";
    }
}
