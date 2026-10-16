package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class aimv {
    public static final aiyk a(aiyk aiykVar, afco afcoVar) {
        if (afcoVar.get(aivh.d) != null) {
            Objects.toString(afcoVar);
            throw new IllegalArgumentException("Flow context cannot contain job in it. Had ".concat(String.valueOf(afcoVar)));
        }
        if (affa.f(afcoVar, afcp.a)) {
            return aiykVar;
        }
        if (aiykVar instanceof ajay) {
            return aiqb.a((ajay) aiykVar, afcoVar, 0, 6);
        }
        return new ajan(aiykVar, afcoVar, 0, 12, null);
    }

    public static final aims<aigl> approximateCapturedTypes(aigl aiglVar) {
        Object objReplaceTypeArguments;
        aiglVar.getClass();
        if (aige.isFlexible(aiglVar)) {
            aims<aigl> aimsVarApproximateCapturedTypes = approximateCapturedTypes(aige.lowerIfFlexible(aiglVar));
            aims<aigl> aimsVarApproximateCapturedTypes2 = approximateCapturedTypes(aige.upperIfFlexible(aiglVar));
            return new aims<>(aije.inheritEnhancement(aigq.flexibleType(aige.lowerIfFlexible(aimsVarApproximateCapturedTypes.getLower()), aige.upperIfFlexible(aimsVarApproximateCapturedTypes2.getLower())), aiglVar), aije.inheritEnhancement(aigq.flexibleType(aige.lowerIfFlexible(aimsVarApproximateCapturedTypes.getUpper()), aige.upperIfFlexible(aimsVarApproximateCapturedTypes2.getUpper())), aiglVar));
        }
        aiid constructor = aiglVar.getConstructor();
        boolean z = true;
        if (ahua.isCaptured(aiglVar)) {
            constructor.getClass();
            aiin projection = ((ahtw) constructor).getProjection();
            aigl type = projection.getType();
            type.getClass();
            aigl aiglVarApproximateCapturedTypes$makeNullableIfNeeded = approximateCapturedTypes$makeNullableIfNeeded(type, aiglVar);
            aijg projectionKind = projection.getProjectionKind();
            aijg aijgVar = aijg.INVARIANT;
            int iOrdinal = projectionKind.ordinal();
            if (iOrdinal == 1) {
                return new aims<>(aiglVarApproximateCapturedTypes$makeNullableIfNeeded, aimr.getBuiltIns(aiglVar).getNullableAnyType());
            }
            if (iOrdinal != 2) {
                Objects.toString(projection);
                throw new AssertionError("Only nontrivial projections should have been captured, not: ".concat(String.valueOf(projection)));
            }
            aigw nothingType = aimr.getBuiltIns(aiglVar).getNothingType();
            nothingType.getClass();
            return new aims<>(approximateCapturedTypes$makeNullableIfNeeded(nothingType, aiglVar), aiglVarApproximateCapturedTypes$makeNullableIfNeeded);
        }
        if (aiglVar.getArguments().isEmpty() || aiglVar.getArguments().size() != constructor.getParameters().size()) {
            return new aims<>(aiglVar, aiglVar);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List<aiin> arguments = aiglVar.getArguments();
        List<agee> parameters = constructor.getParameters();
        parameters.getClass();
        for (aezu aezuVar : woy.ci(arguments, parameters)) {
            aiin aiinVar = (aiin) aezuVar.a;
            agee ageeVar = (agee) aezuVar.b;
            ageeVar.getClass();
            aimw typeArgument = toTypeArgument(aiinVar, ageeVar);
            if (aiinVar.isStarProjection()) {
                arrayList.add(typeArgument);
                arrayList2.add(typeArgument);
            } else {
                aims<aimw> aimsVarApproximateProjection = approximateProjection(typeArgument);
                aimw aimwVarComponent1 = aimsVarApproximateProjection.component1();
                aimw aimwVarComponent2 = aimsVarApproximateProjection.component2();
                arrayList.add(aimwVarComponent1);
                arrayList2.add(aimwVarComponent2);
            }
        }
        if (arrayList.isEmpty()) {
            z = false;
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (!((aimw) it.next()).isConsistent()) {
                    break;
                }
            }
            z = false;
        }
        if (z) {
            objReplaceTypeArguments = aimr.getBuiltIns(aiglVar).getNothingType();
            objReplaceTypeArguments.getClass();
        } else {
            objReplaceTypeArguments = replaceTypeArguments(aiglVar, arrayList);
        }
        return new aims<>(objReplaceTypeArguments, replaceTypeArguments(aiglVar, arrayList2));
    }

    private static final aigl approximateCapturedTypes$makeNullableIfNeeded(aigl aiglVar, aigl aiglVar2) {
        aigl aiglVarMakeNullableIfNeeded = aijc.makeNullableIfNeeded(aiglVar, aiglVar2.isMarkedNullable());
        aiglVarMakeNullableIfNeeded.getClass();
        return aiglVarMakeNullableIfNeeded;
    }

    public static final aiin approximateCapturedTypesIfNecessary(aiin aiinVar, boolean z) {
        if (aiinVar == null) {
            return null;
        }
        if (!aiinVar.isStarProjection()) {
            aigl type = aiinVar.getType();
            type.getClass();
            if (aijc.contains(type, aimt.INSTANCE)) {
                aijg projectionKind = aiinVar.getProjectionKind();
                projectionKind.getClass();
                return projectionKind == aijg.OUT_VARIANCE ? new aiip(projectionKind, approximateCapturedTypes(type).getUpper()) : z ? new aiip(projectionKind, approximateCapturedTypes(type).getLower()) : substituteCapturedTypesWithProjections(aiinVar);
            }
        }
        return aiinVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean approximateCapturedTypesIfNecessary$lambda$0(aijf aijfVar) {
        aijfVar.getClass();
        return Boolean.valueOf(ahua.isCaptured(aijfVar));
    }

    private static final aims<aimw> approximateProjection(aimw aimwVar) {
        aims<aigl> aimsVarApproximateCapturedTypes = approximateCapturedTypes(aimwVar.getInProjection());
        aigl aiglVarComponent1 = aimsVarApproximateCapturedTypes.component1();
        aigl aiglVarComponent2 = aimsVarApproximateCapturedTypes.component2();
        aims<aigl> aimsVarApproximateCapturedTypes2 = approximateCapturedTypes(aimwVar.getOutProjection());
        return new aims<>(new aimw(aimwVar.getTypeParameter(), aiglVarComponent2, aimsVarApproximateCapturedTypes2.component1()), new aimw(aimwVar.getTypeParameter(), aiglVarComponent1, aimsVarApproximateCapturedTypes2.component2()));
    }

    public static /* synthetic */ aiyk b(aiyk aiykVar, int i) {
        int i2 = i < 0 ? 2 : 1;
        if (aiykVar instanceof ajay) {
            return aiqb.a((ajay) aiykVar, null, i2, 1);
        }
        return new ajan(aiykVar, null, i2, 2, null);
    }

    private static final aigl replaceTypeArguments(aigl aiglVar, List<aimw> list) {
        aiglVar.getArguments().size();
        list.size();
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(toTypeProjection((aimw) it.next()));
        }
        return aiiu.replace$default(aiglVar, arrayList, null, null, 6, null);
    }

    private static final aiin substituteCapturedTypesWithProjections(aiin aiinVar) {
        return aiiy.create(new aimu()).substituteWithoutApproximation(aiinVar);
    }

    private static final aimw toTypeArgument(aiin aiinVar, agee ageeVar) {
        aijg aijgVarCombine = aiiy.combine(ageeVar.getVariance(), aiinVar);
        aijg aijgVar = aijg.INVARIANT;
        int iOrdinal = aijgVarCombine.ordinal();
        if (iOrdinal == 0) {
            aigl type = aiinVar.getType();
            type.getClass();
            aigl type2 = aiinVar.getType();
            type2.getClass();
            return new aimw(ageeVar, type, type2);
        }
        if (iOrdinal == 1) {
            aigl type3 = aiinVar.getType();
            type3.getClass();
            aigw nullableAnyType = ahvz.getBuiltIns(ageeVar).getNullableAnyType();
            nullableAnyType.getClass();
            return new aimw(ageeVar, type3, nullableAnyType);
        }
        if (iOrdinal != 2) {
            throw new aezs();
        }
        aigw nothingType = ahvz.getBuiltIns(ageeVar).getNothingType();
        nothingType.getClass();
        aigl type4 = aiinVar.getType();
        type4.getClass();
        return new aimw(ageeVar, nothingType, type4);
    }

    private static final aiin toTypeProjection(aimw aimwVar) {
        aimwVar.isConsistent();
        return (affa.f(aimwVar.getInProjection(), aimwVar.getOutProjection()) || aimwVar.getTypeParameter().getVariance() == aijg.IN_VARIANCE) ? new aiip(aimwVar.getInProjection()) : (!afye.isNothing(aimwVar.getInProjection()) || aimwVar.getTypeParameter().getVariance() == aijg.IN_VARIANCE) ? afye.isNullableAny(aimwVar.getOutProjection()) ? new aiip(toTypeProjection$removeProjectionIfRedundant(aimwVar, aijg.IN_VARIANCE), aimwVar.getInProjection()) : new aiip(toTypeProjection$removeProjectionIfRedundant(aimwVar, aijg.OUT_VARIANCE), aimwVar.getOutProjection()) : new aiip(toTypeProjection$removeProjectionIfRedundant(aimwVar, aijg.OUT_VARIANCE), aimwVar.getOutProjection());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak toTypeProjection$lambda$0$0(ahrt ahrtVar) {
        ahrtVar.getClass();
        ahrtVar.setClassifierNamePolicy(ahqm.INSTANCE);
        return afak.a;
    }

    private static final aijg toTypeProjection$removeProjectionIfRedundant(aimw aimwVar, aijg aijgVar) {
        return aijgVar == aimwVar.getTypeParameter().getVariance() ? aijg.INVARIANT : aijgVar;
    }
}
