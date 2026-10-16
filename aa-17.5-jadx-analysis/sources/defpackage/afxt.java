package defpackage;

import java.util.Set;

/* loaded from: classes3.dex */
public final class afxt {
    public static final boolean isMappedIntrinsicCompanionObject(afxs afxsVar, agba agbaVar) {
        afxsVar.getClass();
        agbaVar.getClass();
        if (!ahst.isCompanionObject(agbaVar)) {
            return false;
        }
        Set<ahnd> classIds = afxsVar.getClassIds();
        ahnd classId = ahvz.getClassId(agbaVar);
        return woy.cn(classIds, classId != null ? classId.getOuterClassId() : null);
    }
}
