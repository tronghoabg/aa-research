package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aiiy implements aimf {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final aiiy EMPTY = create(aiit.EMPTY);
    private final aiit substitution;

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003b A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00b8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void $$$reportNull$$$0(int r13) {
        /*
            Method dump skipped, instructions count: 660
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aiiy.$$$reportNull$$$0(int):void");
    }

    protected aiiy(aiit aiitVar) {
        if (aiitVar == null) {
            $$$reportNull$$$0(7);
        }
        this.substitution = aiitVar;
    }

    private static void assertRecursionDepth(int i, aiin aiinVar, aiit aiitVar) {
        if (i <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + safeToString(aiinVar) + "; substitution: " + safeToString(aiitVar));
    }

    public static aijg combine(aijg aijgVar, aijg aijgVar2) {
        if (aijgVar == null) {
            $$$reportNull$$$0(38);
        }
        if (aijgVar2 == null) {
            $$$reportNull$$$0(39);
        }
        aijg aijgVar3 = aijg.INVARIANT;
        if (aijgVar == aijgVar3) {
            if (aijgVar2 == null) {
                $$$reportNull$$$0(40);
                return aijgVar2;
            }
        } else {
            if (aijgVar2 == aijgVar3) {
                if (aijgVar == null) {
                    $$$reportNull$$$0(41);
                }
                return aijgVar;
            }
            if (aijgVar != aijgVar2) {
                throw new AssertionError(a.bw(aijgVar2, aijgVar, "Variance conflict: type parameter variance '", "' and projection kind '", "' cannot be combined"));
            }
            if (aijgVar2 == null) {
                $$$reportNull$$$0(42);
            }
        }
        return aijgVar2;
    }

    private static aiix conflictType(aijg aijgVar, aijg aijgVar2) {
        aijg aijgVar3 = aijg.IN_VARIANCE;
        return (aijgVar == aijgVar3 && aijgVar2 == aijg.OUT_VARIANCE) ? aiix.OUT_IN_IN_POSITION : (aijgVar == aijg.OUT_VARIANCE && aijgVar2 == aijgVar3) ? aiix.IN_IN_OUT_POSITION : aiix.NO_CONFLICT;
    }

    public static aiiy create(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(6);
        }
        return create(aiig.create(aiglVar.getConstructor(), aiglVar.getArguments()));
    }

    public static aiiy createChainedSubstitutor(aiit aiitVar, aiit aiitVar2) {
        if (aiitVar == null) {
            $$$reportNull$$$0(3);
        }
        if (aiitVar2 == null) {
            $$$reportNull$$$0(4);
        }
        return create(aifu.create(aiitVar, aiitVar2));
    }

    private static agfk filterOutUnsafeVariance(agfk agfkVar) {
        if (agfkVar == null) {
            $$$reportNull$$$0(33);
        }
        if (agfkVar.hasAnnotation(afyn.unsafeVariance)) {
            return new agfs(agfkVar, new aiiv());
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(34);
        }
        return agfkVar;
    }

    private static aiin projectedTypeForConflictedTypeWithUnsafeVariance(aigl aiglVar, aiin aiinVar, agee ageeVar, aiin aiinVar2) {
        if (aiglVar == null) {
            $$$reportNull$$$0(26);
        }
        if (aiinVar == null) {
            $$$reportNull$$$0(27);
        }
        if (aiinVar2 == null) {
            $$$reportNull$$$0(28);
        }
        if (aiglVar.getAnnotations().hasAnnotation(afyn.unsafeVariance)) {
            aiid constructor = aiinVar.getType().getConstructor();
            if (constructor instanceof aikb) {
                aiin projection = ((aikb) constructor).getProjection();
                aijg projectionKind = projection.getProjectionKind();
                if (conflictType(aiinVar2.getProjectionKind(), projectionKind) == aiix.OUT_IN_IN_POSITION) {
                    return new aiip(projection.getType());
                }
                if (ageeVar == null) {
                    if (aiinVar == null) {
                        $$$reportNull$$$0(31);
                        return aiinVar;
                    }
                } else {
                    if (conflictType(ageeVar.getVariance(), projectionKind) == aiix.OUT_IN_IN_POSITION) {
                        return new aiip(projection.getType());
                    }
                    if (aiinVar == null) {
                        $$$reportNull$$$0(32);
                    }
                }
            } else if (aiinVar == null) {
                $$$reportNull$$$0(30);
                return aiinVar;
            }
        } else if (aiinVar == null) {
            $$$reportNull$$$0(29);
            return aiinVar;
        }
        return aiinVar;
    }

    private static String safeToString(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th) {
            if (aipe.isProcessCanceledException(th)) {
                throw th;
            }
            return a.bm(th, "[Exception while computing toString(): ", "]");
        }
    }

    private aiin substituteCompoundType(aiin aiinVar, int i) throws aiiw {
        aigl type = aiinVar.getType();
        aijg projectionKind = aiinVar.getProjectionKind();
        if (type.getConstructor().getDeclarationDescriptor() instanceof agee) {
            return aiinVar;
        }
        aigw abbreviation = aiha.getAbbreviation(type);
        aigl aiglVarSubstitute = abbreviation != null ? replaceWithNonApproximatingSubstitution().substitute(abbreviation, aijg.INVARIANT) : null;
        aigl aiglVarReplace = aiiu.replace(type, substituteTypeArguments(type.getConstructor().getParameters(), type.getArguments(), i), this.substitution.filterAnnotations(type.getAnnotations()));
        if ((aiglVarReplace instanceof aigw) && (aiglVarSubstitute instanceof aigw)) {
            aiglVarReplace = aiha.withAbbreviation((aigw) aiglVarReplace, (aigw) aiglVarSubstitute);
        }
        return new aiip(projectionKind, aiglVarReplace);
    }

    private List<aiin> substituteTypeArguments(List<agee> list, List<aiin> list2, int i) throws aiiw {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z = false;
        for (int i2 = 0; i2 < list.size(); i2++) {
            agee ageeVar = list.get(i2);
            aiin aiinVar = list2.get(i2);
            aiin aiinVarUnsafeSubstitute = unsafeSubstitute(aiinVar, ageeVar, i + 1);
            int iOrdinal = conflictType(ageeVar.getVariance(), aiinVarUnsafeSubstitute.getProjectionKind()).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal == 1 || iOrdinal == 2) {
                    aiinVarUnsafeSubstitute = aijc.makeStarProjection(ageeVar);
                }
            } else if (ageeVar.getVariance() != aijg.INVARIANT && !aiinVarUnsafeSubstitute.isStarProjection()) {
                aiinVarUnsafeSubstitute = new aiip(aijg.INVARIANT, aiinVarUnsafeSubstitute.getType());
            }
            z |= !(aiinVarUnsafeSubstitute == aiinVar);
            arrayList.add(aiinVarUnsafeSubstitute);
        }
        return !z ? list2 : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private aiin unsafeSubstitute(aiin aiinVar, agee ageeVar, int i) throws aiiw {
        if (aiinVar == null) {
            $$$reportNull$$$0(18);
        }
        assertRecursionDepth(i, aiinVar, this.substitution);
        if (!aiinVar.isStarProjection()) {
            aigl type = aiinVar.getType();
            if (type instanceof aijd) {
                aijd aijdVar = (aijd) type;
                aijf origin = aijdVar.getOrigin();
                aigl enhancement = aijdVar.getEnhancement();
                aiin aiinVarUnsafeSubstitute = unsafeSubstitute(new aiip(aiinVar.getProjectionKind(), origin), ageeVar, i + 1);
                if (!aiinVarUnsafeSubstitute.isStarProjection()) {
                    return new aiip(aiinVarUnsafeSubstitute.getProjectionKind(), aije.wrapEnhancement(aiinVarUnsafeSubstitute.getType().unwrap(), substitute(enhancement, aiinVar.getProjectionKind())));
                }
                if (aiinVarUnsafeSubstitute == null) {
                    $$$reportNull$$$0(20);
                }
                return aiinVarUnsafeSubstitute;
            }
            if (!aifw.isDynamic(type) && !(type.unwrap() instanceof agzc)) {
                aiin aiinVar2 = this.substitution.get(type);
                aiin aiinVarProjectedTypeForConflictedTypeWithUnsafeVariance = aiinVar2 != null ? projectedTypeForConflictedTypeWithUnsafeVariance(type, aiinVar2, ageeVar, aiinVar) : null;
                aijg projectionKind = aiinVar.getProjectionKind();
                if (aiinVarProjectedTypeForConflictedTypeWithUnsafeVariance == null && aige.isFlexible(type) && !aiht.isCustomTypeParameter(type)) {
                    int i2 = i + 1;
                    aiga aigaVarAsFlexibleType = aige.asFlexibleType(type);
                    aiin aiinVarUnsafeSubstitute2 = unsafeSubstitute(new aiip(projectionKind, aigaVarAsFlexibleType.getLowerBound()), ageeVar, i2);
                    aiin aiinVarUnsafeSubstitute3 = unsafeSubstitute(new aiip(projectionKind, aigaVarAsFlexibleType.getUpperBound()), ageeVar, i2);
                    aijg projectionKind2 = aiinVarUnsafeSubstitute2.getProjectionKind();
                    if (aiinVarUnsafeSubstitute2.getType() != aigaVarAsFlexibleType.getLowerBound() || aiinVarUnsafeSubstitute3.getType() != aigaVarAsFlexibleType.getUpperBound()) {
                        return new aiip(projectionKind2, aigq.flexibleType(aiiu.asSimpleType(aiinVarUnsafeSubstitute2.getType()), aiiu.asSimpleType(aiinVarUnsafeSubstitute3.getType())));
                    }
                    if (aiinVar == null) {
                        $$$reportNull$$$0(22);
                        return aiinVar;
                    }
                } else {
                    if (!afye.isNothing(type) && !aigr.isError(type)) {
                        if (aiinVarProjectedTypeForConflictedTypeWithUnsafeVariance == null) {
                            aiin aiinVarSubstituteCompoundType = substituteCompoundType(aiinVar, i);
                            if (aiinVarSubstituteCompoundType == null) {
                                $$$reportNull$$$0(25);
                            }
                            return aiinVarSubstituteCompoundType;
                        }
                        aiix aiixVarConflictType = conflictType(projectionKind, aiinVarProjectedTypeForConflictedTypeWithUnsafeVariance.getProjectionKind());
                        if (!ahua.isCaptured(type)) {
                            int iOrdinal = aiixVarConflictType.ordinal();
                            if (iOrdinal == 1) {
                                return new aiip(aijg.OUT_VARIANCE, type.getConstructor().getBuiltIns().getNullableAnyType());
                            }
                            if (iOrdinal == 2) {
                                throw new aiiw("Out-projection in in-position");
                            }
                        }
                        aifl customTypeParameter = aiht.getCustomTypeParameter(type);
                        if (aiinVarProjectedTypeForConflictedTypeWithUnsafeVariance.isStarProjection()) {
                            return aiinVarProjectedTypeForConflictedTypeWithUnsafeVariance;
                        }
                        aigl aiglVarSubstitutionResult = customTypeParameter != null ? customTypeParameter.substitutionResult(aiinVarProjectedTypeForConflictedTypeWithUnsafeVariance.getType()) : aijc.makeNullableIfNeeded(aiinVarProjectedTypeForConflictedTypeWithUnsafeVariance.getType(), type.isMarkedNullable());
                        if (!type.getAnnotations().isEmpty()) {
                            aiglVarSubstitutionResult = aimr.replaceAnnotations(aiglVarSubstitutionResult, new agfr(aiglVarSubstitutionResult.getAnnotations(), filterOutUnsafeVariance(this.substitution.filterAnnotations(type.getAnnotations()))));
                        }
                        if (aiixVarConflictType == aiix.NO_CONFLICT) {
                            projectionKind = combine(projectionKind, aiinVarProjectedTypeForConflictedTypeWithUnsafeVariance.getProjectionKind());
                        }
                        return new aiip(projectionKind, aiglVarSubstitutionResult);
                    }
                    if (aiinVar == null) {
                        $$$reportNull$$$0(23);
                        return aiinVar;
                    }
                }
            } else if (aiinVar == null) {
                $$$reportNull$$$0(21);
            }
        } else if (aiinVar == null) {
            $$$reportNull$$$0(19);
            return aiinVar;
        }
        return aiinVar;
    }

    public aiit getSubstitution() {
        aiit aiitVar = this.substitution;
        if (aiitVar == null) {
            $$$reportNull$$$0(8);
        }
        return aiitVar;
    }

    public boolean isEmpty() {
        return this.substitution.isEmpty();
    }

    public aiiy replaceWithNonApproximatingSubstitution() {
        aiit aiitVar = this.substitution;
        return ((aiitVar instanceof aigf) && aiitVar.approximateContravariantCapturedTypes()) ? new aiiy(new aigf(((aigf) this.substitution).getParameters(), ((aigf) this.substitution).getArguments(), false)) : this;
    }

    public aigl safeSubstitute(aigl aiglVar, aijg aijgVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(9);
        }
        if (aijgVar == null) {
            $$$reportNull$$$0(10);
        }
        if (isEmpty()) {
            if (aiglVar == null) {
                $$$reportNull$$$0(11);
            }
            return aiglVar;
        }
        try {
            aigl type = unsafeSubstitute(new aiip(aijgVar, aiglVar), null, 0).getType();
            if (type == null) {
                $$$reportNull$$$0(12);
            }
            return type;
        } catch (aiiw e) {
            return ailm.createErrorType(aill.UNABLE_TO_SUBSTITUTE_TYPE, e.getMessage());
        }
    }

    public aigl substitute(aigl aiglVar, aijg aijgVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(14);
        }
        if (aijgVar == null) {
            $$$reportNull$$$0(15);
        }
        aiin aiinVarSubstitute = substitute(new aiip(aijgVar, getSubstitution().prepareTopLevelType(aiglVar, aijgVar)));
        if (aiinVarSubstitute == null) {
            return null;
        }
        return aiinVarSubstitute.getType();
    }

    public aiin substituteWithoutApproximation(aiin aiinVar) {
        if (aiinVar == null) {
            $$$reportNull$$$0(17);
        }
        if (isEmpty()) {
            return aiinVar;
        }
        try {
            return unsafeSubstitute(aiinVar, null, 0);
        } catch (aiiw unused) {
            return null;
        }
    }

    public static aiiy create(Map<aiid, aiin> map) {
        if (map == null) {
            $$$reportNull$$$0(5);
        }
        return create(aiig.createByConstructorsMap(map));
    }

    public static aiiy create(aiit aiitVar) {
        if (aiitVar == null) {
            $$$reportNull$$$0(0);
        }
        return new aiiy(aiitVar);
    }

    public aiin substitute(aiin aiinVar) {
        if (aiinVar == null) {
            $$$reportNull$$$0(16);
        }
        aiin aiinVarSubstituteWithoutApproximation = substituteWithoutApproximation(aiinVar);
        return (this.substitution.approximateCapturedTypes() || this.substitution.approximateContravariantCapturedTypes()) ? aimv.approximateCapturedTypesIfNecessary(aiinVarSubstituteWithoutApproximation, this.substitution.approximateContravariantCapturedTypes()) : aiinVarSubstituteWithoutApproximation;
    }

    public static aijg combine(aijg aijgVar, aiin aiinVar) {
        if (aijgVar == null) {
            $$$reportNull$$$0(35);
        }
        if (aiinVar == null) {
            $$$reportNull$$$0(36);
        }
        if (!aiinVar.isStarProjection()) {
            return combine(aijgVar, aiinVar.getProjectionKind());
        }
        aijg aijgVar2 = aijg.OUT_VARIANCE;
        if (aijgVar2 == null) {
            $$$reportNull$$$0(37);
        }
        return aijgVar2;
    }
}
