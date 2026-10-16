package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class aiim {
    public static final aiik Companion = new aiik(null);
    private final aezr erroneousErasedBound$delegate;
    private final aiea<aiil, aigl> getErasedUpperBound;
    private final aiih options;
    private final aifx projectionComputer;
    private final aidz storage;

    public aiim(aifx aifxVar, aiih aiihVar) {
        aifxVar.getClass();
        aiihVar.getClass();
        this.projectionComputer = aifxVar;
        this.options = aiihVar;
        aidz aidzVar = new aidz("Type parameter upper bound erasure results");
        this.storage = aidzVar;
        this.erroneousErasedBound$delegate = woy.dG(new aiii(this));
        aiea<aiil, aigl> aieaVarCreateMemoizedFunction = aidzVar.createMemoizedFunction(new aiij(this));
        aieaVarCreateMemoizedFunction.getClass();
        this.getErasedUpperBound = aieaVarCreateMemoizedFunction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ailj erroneousErasedBound_delegate$lambda$0(aiim aiimVar) {
        return ailm.createErrorType(aill.CANNOT_COMPUTE_ERASED_BOUND, aiimVar.toString());
    }

    private final aigl getDefaultType(aify aifyVar) {
        aigw defaultType = aifyVar.getDefaultType();
        return defaultType != null ? aimr.replaceArgumentsWithStarProjections(defaultType) : getErroneousErasedBound();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aigl getErasedUpperBound$lambda$0(aiim aiimVar, aiil aiilVar) {
        return aiimVar.getErasedUpperBoundInternal(aiilVar.getTypeParameter(), aiilVar.getTypeAttr());
    }

    private final aigl getErasedUpperBoundInternal(agee ageeVar, aify aifyVar) {
        Set<agee> visitedTypeParameters = aifyVar.getVisitedTypeParameters();
        if (visitedTypeParameters != null && visitedTypeParameters.contains(ageeVar.getOriginal())) {
            return getDefaultType(aifyVar);
        }
        aigw defaultType = ageeVar.getDefaultType();
        defaultType.getClass();
        Set<agee> setExtractTypeParametersFromUpperBounds = aimr.extractTypeParametersFromUpperBounds(defaultType, visitedTypeParameters);
        LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(woy.bp(setExtractTypeParametersFromUpperBounds, 10)), 16));
        for (agee ageeVar2 : setExtractTypeParametersFromUpperBounds) {
            aezu aezuVar = new aezu(ageeVar2.getTypeConstructor(), (visitedTypeParameters == null || !visitedTypeParameters.contains(ageeVar2)) ? this.projectionComputer.computeProjection(ageeVar2, aifyVar, this, getErasedUpperBound(ageeVar2, aifyVar.withNewVisitedTypeParameter(ageeVar))) : aijc.makeStarProjection(ageeVar2, aifyVar));
            linkedHashMap.put(aezuVar.a, aezuVar.b);
        }
        aiiy aiiyVarCreate = aiiy.create(aiif.createByConstructorsMap$default(aiig.Companion, linkedHashMap, false, 2, null));
        List<aigl> upperBounds = ageeVar.getUpperBounds();
        upperBounds.getClass();
        Set<aigl> setSubstituteErasedUpperBounds = substituteErasedUpperBounds(aiiyVarCreate, upperBounds, aifyVar);
        if (setSubstituteErasedUpperBounds.isEmpty()) {
            return getDefaultType(aifyVar);
        }
        if (!this.options.getIntersectUpperBounds()) {
            if (setSubstituteErasedUpperBounds.size() == 1) {
                return (aigl) woy.bM(setSubstituteErasedUpperBounds);
            }
            throw new IllegalArgumentException("Should only be one computed upper bound if no need to intersect all bounds");
        }
        List listCf = woy.cf(setSubstituteErasedUpperBounds);
        ArrayList arrayList = new ArrayList(woy.bp(listCf, 10));
        Iterator it = listCf.iterator();
        while (it.hasNext()) {
            arrayList.add(((aigl) it.next()).unwrap());
        }
        return aijn.intersectTypes(arrayList);
    }

    private final ailj getErroneousErasedBound() {
        return (ailj) this.erroneousErasedBound$delegate.a();
    }

    private final Set<aigl> substituteErasedUpperBounds(aiiy aiiyVar, List<? extends aigl> list, aify aifyVar) {
        afce afceVar = new afce();
        for (aigl aiglVar : list) {
            agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
            if (declarationDescriptor instanceof agba) {
                afceVar.add(Companion.replaceArgumentsOfUpperBound(aiglVar, aiiyVar, aifyVar.getVisitedTypeParameters(), this.options.getLeaveNonTypeParameterTypes()));
            } else if (declarationDescriptor instanceof agee) {
                Set<agee> visitedTypeParameters = aifyVar.getVisitedTypeParameters();
                if (visitedTypeParameters == null || !visitedTypeParameters.contains(declarationDescriptor)) {
                    List<aigl> upperBounds = ((agee) declarationDescriptor).getUpperBounds();
                    upperBounds.getClass();
                    afceVar.addAll(substituteErasedUpperBounds(aiiyVar, upperBounds, aifyVar));
                } else {
                    afceVar.add(getDefaultType(aifyVar));
                }
            }
            if (!this.options.getIntersectUpperBounds()) {
                break;
            }
        }
        return woy.aN(afceVar);
    }

    public final aigl getErasedUpperBound(agee ageeVar, aify aifyVar) {
        ageeVar.getClass();
        aifyVar.getClass();
        aigl aiglVarInvoke = this.getErasedUpperBound.invoke(new aiil(ageeVar, aifyVar));
        aiglVarInvoke.getClass();
        return aiglVarInvoke;
    }

    public /* synthetic */ aiim(aifx aifxVar, aiih aiihVar, int i, afeu afeuVar) {
        this(aifxVar, (i & 2) != 0 ? new aiih(false, false) : aiihVar);
    }
}
