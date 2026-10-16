package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahco {
    private final String errorsSinceLanguageVersion;
    private final List<ahdb> parametersInfo;
    private final ahdb returnTypeInfo;
    private final ahtq returnValueStatus;
    private final ahco warningModeClone;

    public ahco(ahdb ahdbVar, List<ahdb> list, String str, ahtq ahtqVar) {
        list.getClass();
        this.returnTypeInfo = ahdbVar;
        this.parametersInfo = list;
        this.errorsSinceLanguageVersion = str;
        this.returnValueStatus = ahtqVar;
        ahco ahcoVar = null;
        if (str != null) {
            ahdb ahdbVarCopyForWarnings = ahdbVar != null ? ahdbVar.copyForWarnings() : null;
            ArrayList arrayList = new ArrayList(woy.bp(list, 10));
            for (ahdb ahdbVar2 : list) {
                arrayList.add(ahdbVar2 != null ? ahdbVar2.copyForWarnings() : null);
            }
            ahcoVar = new ahco(ahdbVarCopyForWarnings, arrayList, null, null, 8, null);
        }
        this.warningModeClone = ahcoVar;
    }

    public final String getErrorsSinceLanguageVersion() {
        return this.errorsSinceLanguageVersion;
    }

    public final List<ahdb> getParametersInfo() {
        return this.parametersInfo;
    }

    public final ahdb getReturnTypeInfo() {
        return this.returnTypeInfo;
    }

    public final ahco getWarningModeClone() {
        return this.warningModeClone;
    }

    public ahco() {
        this(null, null, null, null, 15, null);
    }

    public /* synthetic */ ahco(ahdb ahdbVar, List list, String str, ahtq ahtqVar, int i, afeu afeuVar) {
        this(1 == (i & 1) ? null : ahdbVar, (i & 2) != 0 ? afbe.a : list, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : ahtqVar);
    }
}
