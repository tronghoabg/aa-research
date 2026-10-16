package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class afyl {
    private afyl() {
    }

    public final aigl createKPropertyStarType(agcu agcuVar) {
        agcuVar.getClass();
        agba agbaVarFindClassAcrossModuleDependencies = agch.findClassAcrossModuleDependencies(agcuVar, afyn.kProperty);
        if (agbaVarFindClassAcrossModuleDependencies == null) {
            return null;
        }
        aihr empty = aihr.Companion.getEmpty();
        List<agee> parameters = agbaVarFindClassAcrossModuleDependencies.getTypeConstructor().getParameters();
        parameters.getClass();
        Object objBN = woy.bN(parameters);
        objBN.getClass();
        return aigq.simpleNotNullType(empty, agbaVarFindClassAcrossModuleDependencies, woy.bg(new aihd((agee) objBN)));
    }

    public /* synthetic */ afyl(afeu afeuVar) {
        this();
    }
}
