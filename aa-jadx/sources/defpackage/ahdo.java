package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ahdo {
    private final java.lang.String errorsSinceLanguageVersion;
    private final java.util.List<defpackage.aheb> parametersInfo;
    private final defpackage.aheb returnTypeInfo;
    private final defpackage.ahuq returnValueStatus;
    private final defpackage.ahdo warningModeClone;

    public ahdo(defpackage.aheb ahebVar, java.util.List<defpackage.aheb> list, java.lang.String str, defpackage.ahuq ahuqVar) {
        list.getClass();
        this.returnTypeInfo = ahebVar;
        this.parametersInfo = list;
        this.errorsSinceLanguageVersion = str;
        this.returnValueStatus = ahuqVar;
        defpackage.ahdo ahdoVar = null;
        if (str != null) {
            defpackage.aheb ahebVarCopyForWarnings = ahebVar != null ? ahebVar.copyForWarnings() : null;
            java.util.ArrayList arrayList = new java.util.ArrayList(defpackage.afga.aj(list, 10));
            for (defpackage.aheb ahebVar2 : list) {
                arrayList.add(ahebVar2 != null ? ahebVar2.copyForWarnings() : null);
            }
            ahdoVar = new defpackage.ahdo(ahebVarCopyForWarnings, arrayList, null, null, 8, null);
        }
        this.warningModeClone = ahdoVar;
    }

    public final java.lang.String getErrorsSinceLanguageVersion() {
        return this.errorsSinceLanguageVersion;
    }

    public final java.util.List<defpackage.aheb> getParametersInfo() {
        return this.parametersInfo;
    }

    public final defpackage.aheb getReturnTypeInfo() {
        return this.returnTypeInfo;
    }

    public final defpackage.ahdo getWarningModeClone() {
        return this.warningModeClone;
    }

    public ahdo() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ ahdo(defpackage.aheb ahebVar, java.util.List list, java.lang.String str, defpackage.ahuq ahuqVar, int i, defpackage.affu affuVar) {
        this(1 == (i & 1) ? null : ahebVar, (i & 2) != 0 ? defpackage.afce.a : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : ahuqVar);
    }
}
