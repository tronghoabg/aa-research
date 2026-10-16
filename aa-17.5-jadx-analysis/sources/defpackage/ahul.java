package defpackage;

/* loaded from: classes3.dex */
public final class ahul extends ahuh {
    private final ahnd enumClassId;
    private final ahnj enumEntryName;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahul(ahnd ahndVar, ahnj ahnjVar) {
        super(new aezu(ahndVar, ahnjVar));
        ahndVar.getClass();
        ahnjVar.getClass();
        this.enumClassId = ahndVar;
        this.enumEntryName = ahnjVar;
    }

    public final ahnj getEnumEntryName() {
        return this.enumEntryName;
    }

    @Override // defpackage.ahuh
    public aigl getType(agcu agcuVar) {
        aigw defaultType;
        agcuVar.getClass();
        agba agbaVarFindClassAcrossModuleDependencies = agch.findClassAcrossModuleDependencies(agcuVar, this.enumClassId);
        if (agbaVarFindClassAcrossModuleDependencies != null) {
            if (true != ahst.isEnumClass(agbaVarFindClassAcrossModuleDependencies)) {
                agbaVarFindClassAcrossModuleDependencies = null;
            }
            if (agbaVarFindClassAcrossModuleDependencies != null && (defaultType = agbaVarFindClassAcrossModuleDependencies.getDefaultType()) != null) {
                return defaultType;
            }
        }
        ahnd ahndVar = this.enumClassId;
        aill aillVar = aill.ERROR_ENUM_TYPE;
        String string = ahndVar.toString();
        String string2 = this.enumEntryName.toString();
        string2.getClass();
        return ailm.createErrorType(aillVar, string, string2);
    }

    @Override // defpackage.ahuh
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.enumClassId.getShortClassName());
        sb.append('.');
        sb.append(this.enumEntryName);
        return sb.toString();
    }
}
