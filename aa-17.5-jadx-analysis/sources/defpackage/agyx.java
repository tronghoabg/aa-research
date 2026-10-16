package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class agyx extends aifx {
    @Override // defpackage.aifx
    public aiin computeProjection(agee ageeVar, aify aifyVar, aiim aiimVar, aigl aiglVar) {
        ageeVar.getClass();
        aifyVar.getClass();
        aiimVar.getClass();
        aiglVar.getClass();
        if (!(aifyVar instanceof agyr)) {
            return super.computeProjection(ageeVar, aifyVar, aiimVar, aiglVar);
        }
        agyr agyrVarWithFlexibility = (agyr) aifyVar;
        if (!agyrVarWithFlexibility.isRaw()) {
            agyrVarWithFlexibility = agyrVarWithFlexibility.withFlexibility(agyt.INFLEXIBLE);
        }
        agyt flexibility = agyrVarWithFlexibility.getFlexibility();
        agyt agytVar = agyt.INFLEXIBLE;
        int iOrdinal = flexibility.ordinal();
        if (iOrdinal != 0 && iOrdinal != 1) {
            if (iOrdinal == 2) {
                return new aiip(aijg.INVARIANT, aiglVar);
            }
            throw new aezs();
        }
        if (!ageeVar.getVariance().getAllowsOutPosition()) {
            return new aiip(aijg.INVARIANT, ahvz.getBuiltIns(ageeVar).getNothingType());
        }
        List<agee> parameters = aiglVar.getConstructor().getParameters();
        parameters.getClass();
        return !parameters.isEmpty() ? new aiip(aijg.OUT_VARIANCE, aiglVar) : aijc.makeStarProjection(ageeVar, agyrVarWithFlexibility);
    }
}
