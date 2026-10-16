package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class aier {
    public static final aier INSTANCE = new aier();
    public static boolean RUN_SLOW_ASSERTIONS;

    private aier() {
    }

    private final Boolean checkSubtypeForIntegerLiteralType(aiic aiicVar, aimg aimgVar, ailx ailxVar, ailx ailxVar2) {
        if (!aimh.isIntegerLiteralType(aimgVar, ailxVar) && !aimh.isIntegerLiteralType(aimgVar, ailxVar2)) {
            return null;
        }
        if (checkSubtypeForIntegerLiteralType$isIntegerLiteralTypeOrCapturedOne(aimgVar, ailxVar) && checkSubtypeForIntegerLiteralType$isIntegerLiteralTypeOrCapturedOne(aimgVar, ailxVar2)) {
            return true;
        }
        if (aimh.isIntegerLiteralType(aimgVar, ailxVar)) {
            return checkSubtypeForIntegerLiteralType$isTypeInIntegerLiteralType(aimgVar, aiicVar, ailxVar, ailxVar2, false) ? true : null;
        }
        if (aimh.isIntegerLiteralType(aimgVar, ailxVar2)) {
            return (checkSubtypeForIntegerLiteralType$isIntegerLiteralTypeInIntersectionComponents(aimgVar, ailxVar) || checkSubtypeForIntegerLiteralType$isTypeInIntegerLiteralType(aimgVar, aiicVar, ailxVar2, ailxVar, true)) ? true : null;
        }
        return null;
    }

    private static final boolean checkSubtypeForIntegerLiteralType$isCapturedIntegerLiteralType(aimg aimgVar, ailx ailxVar) {
        ailw type;
        ailx ailxVarUpperBoundIfFlexible;
        return (ailxVar instanceof ails) && (type = aimh.getType(aimgVar, aimh.projection(aimgVar, aimh.typeConstructor(aimgVar, (ails) ailxVar)))) != null && (ailxVarUpperBoundIfFlexible = aimh.upperBoundIfFlexible(aimgVar, type)) != null && aimh.isIntegerLiteralType(aimgVar, ailxVarUpperBoundIfFlexible);
    }

    private static final boolean checkSubtypeForIntegerLiteralType$isIntegerLiteralTypeInIntersectionComponents(aimg aimgVar, ailx ailxVar) {
        aimd aimdVarTypeConstructor = aimh.typeConstructor(aimgVar, ailxVar);
        if (aimdVarTypeConstructor instanceof aigk) {
            Collection<ailw> collectionSupertypes = aimh.supertypes(aimgVar, aimdVarTypeConstructor);
            if ((collectionSupertypes instanceof Collection) && collectionSupertypes.isEmpty()) {
                return false;
            }
            Iterator<T> it = collectionSupertypes.iterator();
            while (it.hasNext()) {
                ailx ailxVarAsRigidType = aimh.asRigidType(aimgVar, (ailw) it.next());
                if (ailxVarAsRigidType != null && aimh.isIntegerLiteralType(aimgVar, ailxVarAsRigidType)) {
                    return true;
                }
            }
        }
        return false;
    }

    private static final boolean checkSubtypeForIntegerLiteralType$isIntegerLiteralTypeOrCapturedOne(aimg aimgVar, ailx ailxVar) {
        return aimh.isIntegerLiteralType(aimgVar, ailxVar) || checkSubtypeForIntegerLiteralType$isCapturedIntegerLiteralType(aimgVar, ailxVar);
    }

    private static final boolean checkSubtypeForIntegerLiteralType$isTypeInIntegerLiteralType(aimg aimgVar, aiic aiicVar, ailx ailxVar, ailx ailxVar2, boolean z) {
        aiic aiicVar2;
        ailx ailxVar3;
        Collection<ailw> collectionPossibleIntegerTypes = aimh.possibleIntegerTypes(aimgVar, ailxVar);
        if ((collectionPossibleIntegerTypes instanceof Collection) && collectionPossibleIntegerTypes.isEmpty()) {
            return false;
        }
        for (ailw ailwVar : collectionPossibleIntegerTypes) {
            if (affa.f(aimh.typeConstructor(aimgVar, ailwVar), aimh.typeConstructor(aimgVar, ailxVar2))) {
                return true;
            }
            if (z) {
                aiicVar2 = aiicVar;
                ailxVar3 = ailxVar2;
                if (isSubtypeOf$default(INSTANCE, aiicVar2, ailxVar3, ailwVar, false, 8, null)) {
                    return true;
                }
            } else {
                aiicVar2 = aiicVar;
                ailxVar3 = ailxVar2;
            }
            aiicVar = aiicVar2;
            ailxVar2 = ailxVar3;
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final java.lang.Boolean checkSubtypeForSpecialCases(defpackage.aiic r13, defpackage.aimg r14, defpackage.ailx r15, defpackage.ailx r16) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aier.checkSubtypeForSpecialCases(aiic, aimg, ailx, ailx):java.lang.Boolean");
    }

    private final List<ailx> collectAllSupertypesWithGivenTypeConstructor(aiic aiicVar, aimg aimgVar, ailx ailxVar, aimd aimdVar) {
        aiib aiibVarSubstitutionSupertypePolicy;
        List<aily> listFastCorrespondingSupertypes = aimh.fastCorrespondingSupertypes(aimgVar, ailxVar, aimdVar);
        if (listFastCorrespondingSupertypes != null) {
            return listFastCorrespondingSupertypes;
        }
        if (!aimh.isClassTypeConstructor(aimgVar, aimdVar) && aimh.isClassType(aimgVar, ailxVar)) {
            return afbe.a;
        }
        if (aimh.isCommonFinalClassConstructor(aimgVar, aimdVar)) {
            if (!aimgVar.areEqualTypeConstructors(aimh.typeConstructor(aimgVar, ailxVar), aimdVar)) {
                return afbe.a;
            }
            ailx ailxVarCaptureFromArguments = aimgVar.captureFromArguments(ailxVar, ailq.FOR_SUBTYPING);
            if (ailxVarCaptureFromArguments != null) {
                ailxVar = ailxVarCaptureFromArguments;
            }
            return woy.bg(ailxVar);
        }
        aipr aiprVar = new aipr();
        aiicVar.initialize();
        ArrayDeque<ailx> supertypesDeque = aiicVar.getSupertypesDeque();
        supertypesDeque.getClass();
        Set<ailx> supertypesSet = aiicVar.getSupertypesSet();
        supertypesSet.getClass();
        supertypesDeque.push(ailxVar);
        while (!supertypesDeque.isEmpty()) {
            ailx ailxVarPop = supertypesDeque.pop();
            ailxVarPop.getClass();
            if (supertypesSet.add(ailxVarPop)) {
                ailx ailxVarCaptureFromArguments2 = aimgVar.captureFromArguments(ailxVarPop, ailq.FOR_SUBTYPING);
                if (ailxVarCaptureFromArguments2 == null) {
                    ailxVarCaptureFromArguments2 = ailxVarPop;
                }
                if (aimgVar.areEqualTypeConstructors(aimh.typeConstructor(aimgVar, ailxVarCaptureFromArguments2), aimdVar)) {
                    aiprVar.add(ailxVarCaptureFromArguments2);
                    aiibVarSubstitutionSupertypePolicy = aihz.INSTANCE;
                } else {
                    aiibVarSubstitutionSupertypePolicy = aimh.argumentsCount(aimgVar, ailxVarCaptureFromArguments2) == 0 ? aihy.INSTANCE : aiicVar.getTypeSystemContext().substitutionSupertypePolicy(ailxVarCaptureFromArguments2);
                }
                if (true == affa.f(aiibVarSubstitutionSupertypePolicy, aihz.INSTANCE)) {
                    aiibVarSubstitutionSupertypePolicy = null;
                }
                if (aiibVarSubstitutionSupertypePolicy != null) {
                    aimg typeSystemContext = aiicVar.getTypeSystemContext();
                    Iterator<ailw> it = typeSystemContext.supertypes(typeSystemContext.typeConstructor(ailxVarPop)).iterator();
                    while (it.hasNext()) {
                        supertypesDeque.add(aiibVarSubstitutionSupertypePolicy.transformType(aiicVar, it.next()));
                    }
                }
            }
        }
        aiicVar.clear();
        return aiprVar;
    }

    private final List<ailx> collectAndFilter(aiic aiicVar, aimg aimgVar, ailx ailxVar, aimd aimdVar) {
        return selectOnlyPureKotlinSupertypes(aimgVar, collectAllSupertypesWithGivenTypeConstructor(aiicVar, aimgVar, ailxVar, aimdVar));
    }

    private final boolean completeIsSubTypeOf(aiic aiicVar, aimg aimgVar, ailw ailwVar, ailw ailwVar2, boolean z) {
        ailw ailwVarPrepareType = aiicVar.prepareType(aiicVar.refineType(ailwVar));
        ailw ailwVarPrepareType2 = aiicVar.prepareType(aiicVar.refineType(ailwVar2));
        if (aiicVar.isDnnTypesEqualToFlexible() && aimh.isFlexible(aimgVar, ailwVarPrepareType) && aimh.isDefinitelyNotNullType(aimgVar, ailwVarPrepareType2)) {
            ailv ailvVarAsFlexibleType = aimh.asFlexibleType(aimgVar, ailwVarPrepareType);
            ailvVarAsFlexibleType.getClass();
            ailx ailxVarLowerBound = aimh.lowerBound(aimgVar, ailvVarAsFlexibleType);
            ailx ailxVarAsRigidType = aimh.asRigidType(aimgVar, ailwVarPrepareType2);
            ailxVarAsRigidType.getClass();
            return completeIsSubTypeOf(aiicVar, aimgVar, ailxVarLowerBound, aimh.originalIfDefinitelyNotNullable(aimgVar, ailxVarAsRigidType), z);
        }
        Boolean boolCheckSubtypeForSpecialCases = checkSubtypeForSpecialCases(aiicVar, aimgVar, aimh.lowerBoundIfFlexible(aimgVar, ailwVarPrepareType), aimh.upperBoundIfFlexible(aimgVar, ailwVarPrepareType2));
        if (boolCheckSubtypeForSpecialCases == null) {
            aiicVar.addSubtypeConstraint(ailwVarPrepareType, ailwVarPrepareType2, z);
            return isSubtypeOfForSingleClassifierType(aiicVar, aimgVar, aimh.lowerBoundIfFlexible(aimgVar, ailwVarPrepareType), aimh.upperBoundIfFlexible(aimgVar, ailwVarPrepareType2));
        }
        boolean zBooleanValue = boolCheckSubtypeForSpecialCases.booleanValue();
        aiicVar.addSubtypeConstraint(ailwVarPrepareType, ailwVarPrepareType2, z);
        return zBooleanValue;
    }

    private final Collection<ailx> filterOutEquivalentSupertypesWithSameConstructor(aiic aiicVar, aimg aimgVar, List<? extends ailx> list) {
        if (list.size() > 1) {
            aimg typeSystemContext = aiicVar.getTypeSystemContext();
            aimj aimjVar = typeSystemContext instanceof aimj ? (aimj) typeSystemContext : null;
            if (aimjVar != null && aimjVar.isK2()) {
                LinkedHashSet<ailx> linkedHashSet = new LinkedHashSet();
                for (ailx ailxVar : list) {
                    ailx ailxVarAsRigidType = aimh.asRigidType(aimgVar, aiicVar.prepareType(ailxVar));
                    if (ailxVarAsRigidType != null) {
                        ailxVar = ailxVarAsRigidType;
                    }
                    linkedHashSet.add(ailxVar);
                }
                if (linkedHashSet.size() == 1) {
                    return linkedHashSet;
                }
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                for (ailx ailxVar2 : linkedHashSet) {
                    if (linkedHashSet3.add(aiicVar.getKotlinTypePreparator().clearTypeFromUnnecessaryAttributes(ailxVar2))) {
                        linkedHashSet2.add(ailxVar2);
                    }
                }
                return linkedHashSet2;
            }
        }
        ArrayList arrayList = new ArrayList(woy.bp(list, 10));
        for (ailx ailxVar3 : list) {
            ailx ailxVarAsRigidType2 = aimh.asRigidType(aimgVar, aiicVar.prepareType(ailxVar3));
            if (ailxVarAsRigidType2 != null) {
                ailxVar3 = ailxVarAsRigidType2;
            }
            arrayList.add(ailxVar3);
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        return defpackage.aimh.getParameter(r8, defpackage.aimh.typeConstructor(r8, r9), r2);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.aime getTypeParameterForArgumentInBaseIfItEqualToTarget(defpackage.aimg r8, defpackage.ailw r9, defpackage.ailw r10) {
        /*
            r7 = this;
            int r0 = defpackage.aimh.argumentsCount(r8, r9)
            r1 = 0
            r2 = r1
        L6:
            r3 = 0
            if (r2 >= r0) goto L5f
            aima r4 = defpackage.aimh.getArgument(r8, r9, r2)
            boolean r5 = defpackage.aimh.isStarProjection(r8, r4)
            r6 = 1
            if (r6 != r5) goto L15
            goto L16
        L15:
            r3 = r4
        L16:
            if (r3 == 0) goto L5c
            ailw r3 = defpackage.aimh.getType(r8, r3)
            if (r3 == 0) goto L5c
            ailx r4 = defpackage.aimh.lowerBoundIfFlexible(r8, r3)
            boolean r4 = defpackage.aimh.isCapturedType(r8, r4)
            if (r4 == 0) goto L33
            ailx r4 = defpackage.aimh.lowerBoundIfFlexible(r8, r10)
            boolean r4 = defpackage.aimh.isCapturedType(r8, r4)
            if (r4 == 0) goto L33
            goto L34
        L33:
            r6 = r1
        L34:
            boolean r4 = defpackage.affa.f(r3, r10)
            if (r4 != 0) goto L53
            if (r6 == 0) goto L4b
            aimd r4 = defpackage.aimh.typeConstructor(r8, r3)
            aimd r5 = defpackage.aimh.typeConstructor(r8, r10)
            boolean r4 = defpackage.affa.f(r4, r5)
            if (r4 == 0) goto L4b
            goto L53
        L4b:
            aime r3 = r7.getTypeParameterForArgumentInBaseIfItEqualToTarget(r8, r3, r10)
            if (r3 != 0) goto L52
            goto L5c
        L52:
            return r3
        L53:
            aimd r7 = defpackage.aimh.typeConstructor(r8, r9)
            aime r7 = defpackage.aimh.getParameter(r8, r7, r2)
            return r7
        L5c:
            int r2 = r2 + 1
            goto L6
        L5f:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aier.getTypeParameterForArgumentInBaseIfItEqualToTarget(aimg, ailw, ailw):aime");
    }

    private final boolean hasNothingSupertype(aiic aiicVar, aimg aimgVar, ailx ailxVar) {
        aimd aimdVarTypeConstructor = aimh.typeConstructor(aimgVar, ailxVar);
        if (aimh.isClassTypeConstructor(aimgVar, aimdVarTypeConstructor)) {
            return aimh.isNothingConstructor(aimgVar, aimdVarTypeConstructor);
        }
        if (aimh.isNothingConstructor(aimgVar, aimh.typeConstructor(aimgVar, ailxVar))) {
            return true;
        }
        aiicVar.initialize();
        ArrayDeque<ailx> supertypesDeque = aiicVar.getSupertypesDeque();
        supertypesDeque.getClass();
        Set<ailx> supertypesSet = aiicVar.getSupertypesSet();
        supertypesSet.getClass();
        supertypesDeque.push(ailxVar);
        while (!supertypesDeque.isEmpty()) {
            ailx ailxVarPop = supertypesDeque.pop();
            ailxVarPop.getClass();
            if (supertypesSet.add(ailxVarPop)) {
                aiib aiibVar = aimh.isClassType(aimgVar, ailxVarPop) ? aihz.INSTANCE : aihy.INSTANCE;
                if (true == affa.f(aiibVar, aihz.INSTANCE)) {
                    aiibVar = null;
                }
                if (aiibVar != null) {
                    aimg typeSystemContext = aiicVar.getTypeSystemContext();
                    Iterator<ailw> it = typeSystemContext.supertypes(typeSystemContext.typeConstructor(ailxVarPop)).iterator();
                    while (it.hasNext()) {
                        ailx ailxVarTransformType = aiibVar.transformType(aiicVar, it.next());
                        if (aimh.isNothingConstructor(aimgVar, aimh.typeConstructor(aimgVar, ailxVarTransformType))) {
                            aiicVar.clear();
                            return true;
                        }
                        supertypesDeque.add(ailxVarTransformType);
                    }
                } else {
                    continue;
                }
            }
        }
        aiicVar.clear();
        return false;
    }

    private final boolean isCommonDenotableType(aimg aimgVar, ailw ailwVar) {
        return (!aimh.isDenotable(aimgVar, aimh.typeConstructor(aimgVar, ailwVar)) || aimh.isDynamic(aimgVar, ailwVar) || aimh.isDefinitelyNotNullType(aimgVar, ailwVar) || aimh.isNotNullTypeParameter(aimgVar, ailwVar) || aimh.isFlexibleWithDifferentTypeConstructors(aimgVar, ailwVar)) ? false : true;
    }

    private final boolean isStubTypeSubtypeOfAnother(aimg aimgVar, ailx ailxVar, ailx ailxVar2) {
        if (aimh.typeConstructor(aimgVar, ailxVar) != aimh.typeConstructor(aimgVar, ailxVar2)) {
            return false;
        }
        if (aimh.isDefinitelyNotNullType(aimgVar, ailxVar) || !aimh.isDefinitelyNotNullType(aimgVar, ailxVar2)) {
            return !aimh.isMarkedNullable(aimgVar, ailxVar) || aimh.isMarkedNullable(aimgVar, ailxVar2);
        }
        return false;
    }

    private final boolean isSubtypeForSameConstructorWithIntersectedTypeArguments(aimg aimgVar, aiic aiicVar, ailx ailxVar, ailx ailxVar2, aimd aimdVar, Collection<? extends ailx> collection) {
        ailw type;
        ailp ailpVar = new ailp(aimh.parametersCount(aimgVar, aimdVar));
        int iParametersCount = aimh.parametersCount(aimgVar, aimdVar);
        for (int i = 0; i < iParametersCount; i++) {
            if (aimh.getVariance(aimgVar, aimh.getParameter(aimgVar, aimdVar, i)) != aimm.OUT) {
                return false;
            }
            ArrayList arrayList = new ArrayList(woy.bp(collection, 10));
            for (ailx ailxVar3 : collection) {
                aima argumentOrNull = aimh.getArgumentOrNull(aimgVar, ailxVar3, i);
                if (argumentOrNull != null) {
                    if (aimh.getVariance(aimgVar, argumentOrNull) != aimm.INV) {
                        argumentOrNull = null;
                    }
                    if (argumentOrNull != null && (type = aimh.getType(aimgVar, argumentOrNull)) != null) {
                        arrayList.add(type);
                    }
                }
                throw new IllegalStateException("Incorrect type: " + ailxVar3 + ", subType: " + ailxVar + ", superType: " + ailxVar2);
            }
            ailpVar.add(aimh.asTypeArgument(aimgVar, aimgVar.intersectTypes(arrayList)));
        }
        return isSubtypeForSameConstructor(aiicVar, aimgVar, ailpVar, ailxVar2);
    }

    public static /* synthetic */ boolean isSubtypeOf$default(aier aierVar, aiic aiicVar, ailw ailwVar, ailw ailwVar2, boolean z, int i, Object obj) {
        return aierVar.isSubtypeOf(aiicVar, ailwVar, ailwVar2, z & ((i & 8) == 0));
    }

    private final boolean isSubtypeOfForSingleClassifierType(aiic aiicVar, aimg aimgVar, ailx ailxVar, ailx ailxVar2) {
        if (RUN_SLOW_ASSERTIONS) {
            if (!aimh.isSingleClassifierType(aimgVar, ailxVar) && !aimh.isIntersection(aimgVar, aimh.typeConstructor(aimgVar, ailxVar))) {
                aiicVar.isAllowedTypeVariable(ailxVar);
            }
            if (!aimh.isSingleClassifierType(aimgVar, ailxVar2)) {
                aiicVar.isAllowedTypeVariable(ailxVar2);
            }
        }
        if (!aiel.INSTANCE.isPossibleSubtype(aiicVar, ailxVar, ailxVar2)) {
            return false;
        }
        Boolean boolCheckSubtypeForIntegerLiteralType = checkSubtypeForIntegerLiteralType(aiicVar, aimgVar, ailxVar, ailxVar2);
        if (boolCheckSubtypeForIntegerLiteralType != null) {
            boolCheckSubtypeForIntegerLiteralType.booleanValue();
            aiic.addSubtypeConstraint$default(aiicVar, ailxVar, ailxVar2, false, 4, null);
            return true;
        }
        aimd aimdVarTypeConstructor = aimh.typeConstructor(aimgVar, ailxVar2);
        if ((aimgVar.areEqualTypeConstructors(aimh.typeConstructor(aimgVar, ailxVar), aimdVarTypeConstructor) && aimh.parametersCount(aimgVar, aimdVarTypeConstructor) == 0) || aimh.isAnyConstructor(aimgVar, aimh.typeConstructor(aimgVar, ailxVar2))) {
            return true;
        }
        Collection<ailx> collectionFilterOutEquivalentSupertypesWithSameConstructor = filterOutEquivalentSupertypesWithSameConstructor(aiicVar, aimgVar, findCorrespondingSupertypes(aiicVar, ailxVar, aimdVarTypeConstructor));
        int size = collectionFilterOutEquivalentSupertypesWithSameConstructor.size();
        if (size == 0) {
            return hasNothingSupertype(aiicVar, aimgVar, ailxVar);
        }
        if (size == 1) {
            return isSubtypeForSameConstructor(aiicVar, aimgVar, aimh.asArgumentList(aimgVar, (ailx) woy.bE(collectionFilterOutEquivalentSupertypesWithSameConstructor)), ailxVar2);
        }
        if (isSubtypeForSameConstructorWithIntersectedTypeArguments(aimgVar, aiicVar, ailxVar, ailxVar2, aimdVarTypeConstructor, collectionFilterOutEquivalentSupertypesWithSameConstructor)) {
            return true;
        }
        return aiicVar.runForkingPoint(new aiep(collectionFilterOutEquivalentSupertypesWithSameConstructor, aiicVar, aimgVar, ailxVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afak isSubtypeOfForSingleClassifierType$lambda$3(Collection collection, aiic aiicVar, aimg aimgVar, ailx ailxVar, aihv aihvVar) {
        aihvVar.getClass();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            aihvVar.fork(new aieq(aiicVar, aimgVar, (ailx) it.next(), ailxVar));
        }
        return afak.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isSubtypeOfForSingleClassifierType$lambda$3$0(aiic aiicVar, aimg aimgVar, ailx ailxVar, ailx ailxVar2) {
        return INSTANCE.isSubtypeForSameConstructor(aiicVar, aimgVar, aimh.asArgumentList(aimgVar, ailxVar), ailxVar2);
    }

    private final boolean isTypeVariableAgainstStarProjectionForSelfType(aimg aimgVar, ailw ailwVar, ailw ailwVar2, aimd aimdVar) {
        aime typeParameter;
        ailx ailxVarAsRigidType = aimh.asRigidType(aimgVar, ailwVar);
        if (ailxVarAsRigidType instanceof ails) {
            ails ailsVar = (ails) ailxVarAsRigidType;
            if (aimh.isOldCapturedType(aimgVar, ailsVar) || !aimh.isStarProjection(aimgVar, aimh.projection(aimgVar, aimh.typeConstructor(aimgVar, ailsVar))) || aimh.captureStatus(aimgVar, ailsVar) != ailq.FOR_SUBTYPING) {
                return false;
            }
            aimd aimdVarTypeConstructor = aimh.typeConstructor(aimgVar, ailwVar2);
            aiml aimlVar = aimdVarTypeConstructor instanceof aiml ? (aiml) aimdVarTypeConstructor : null;
            if (aimlVar != null && (typeParameter = aimh.getTypeParameter(aimgVar, aimlVar)) != null && aimh.hasRecursiveBounds(aimgVar, typeParameter, aimdVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<ailx> selectOnlyPureKotlinSupertypes(aimg aimgVar, List<? extends ailx> list) {
        int i;
        if (list.size() >= 2) {
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                ailz ailzVarAsArgumentList = aimh.asArgumentList(aimgVar, (ailx) obj);
                int size = aimgVar.size(ailzVarAsArgumentList);
                while (true) {
                    if (i >= size) {
                        arrayList.add(obj);
                        break;
                    }
                    ailw type = aimh.getType(aimgVar, aimgVar.get(ailzVarAsArgumentList, i));
                    i = (type != null ? aimh.asFlexibleType(aimgVar, type) : null) == null ? i + 1 : 0;
                }
            }
            if (!arrayList.isEmpty()) {
                return arrayList;
            }
        }
        return list;
    }

    public final aimm effectiveVariance(aimm aimmVar, aimm aimmVar2) {
        aimmVar.getClass();
        aimmVar2.getClass();
        aimm aimmVar3 = aimm.INV;
        if (aimmVar == aimmVar3) {
            return aimmVar2;
        }
        if (aimmVar2 == aimmVar3 || aimmVar == aimmVar2) {
            return aimmVar;
        }
        return null;
    }

    public final boolean equalTypes(aiic aiicVar, ailw ailwVar, ailw ailwVar2) {
        aiicVar.getClass();
        ailwVar.getClass();
        ailwVar2.getClass();
        aimg typeSystemContext = aiicVar.getTypeSystemContext();
        if (ailwVar == ailwVar2) {
            return true;
        }
        aier aierVar = INSTANCE;
        if (aierVar.isCommonDenotableType(typeSystemContext, ailwVar) && aierVar.isCommonDenotableType(typeSystemContext, ailwVar2)) {
            ailw ailwVarPrepareType = aiicVar.prepareType(aiicVar.refineType(ailwVar));
            ailw ailwVarPrepareType2 = aiicVar.prepareType(aiicVar.refineType(ailwVar2));
            ailx ailxVarLowerBoundIfFlexible = typeSystemContext.lowerBoundIfFlexible(ailwVarPrepareType);
            if (!typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(ailwVarPrepareType), typeSystemContext.typeConstructor(ailwVarPrepareType2))) {
                return false;
            }
            if (typeSystemContext.argumentsCount(ailxVarLowerBoundIfFlexible) == 0) {
                return typeSystemContext.hasFlexibleNullability(ailwVarPrepareType) || typeSystemContext.hasFlexibleNullability(ailwVarPrepareType2) || typeSystemContext.isMarkedNullable(ailxVarLowerBoundIfFlexible) == typeSystemContext.isMarkedNullable(typeSystemContext.lowerBoundIfFlexible(ailwVarPrepareType2));
            }
        }
        return isSubtypeOf$default(aierVar, aiicVar, ailwVar, ailwVar2, false, 8, null) && isSubtypeOf$default(aierVar, aiicVar, ailwVar2, ailwVar, false, 8, null);
    }

    public final List<ailx> findCorrespondingSupertypes(aiic aiicVar, aimg aimgVar, ailx ailxVar, aimd aimdVar) {
        aiib aiibVar;
        aiicVar.getClass();
        aimgVar.getClass();
        ailxVar.getClass();
        aimdVar.getClass();
        if (aimh.isClassType(aimgVar, ailxVar)) {
            return collectAndFilter(aiicVar, aimgVar, ailxVar, aimdVar);
        }
        if (!aimh.isClassTypeConstructor(aimgVar, aimdVar) && !aimh.isIntegerLiteralTypeConstructor(aimgVar, aimdVar)) {
            return collectAllSupertypesWithGivenTypeConstructor(aiicVar, aimgVar, ailxVar, aimdVar);
        }
        aipr<ailx> aiprVar = new aipr();
        aiicVar.initialize();
        ArrayDeque<ailx> supertypesDeque = aiicVar.getSupertypesDeque();
        supertypesDeque.getClass();
        Set<ailx> supertypesSet = aiicVar.getSupertypesSet();
        supertypesSet.getClass();
        supertypesDeque.push(ailxVar);
        while (!supertypesDeque.isEmpty()) {
            ailx ailxVarPop = supertypesDeque.pop();
            ailxVarPop.getClass();
            if (supertypesSet.add(ailxVarPop)) {
                if (aimh.isClassType(aimgVar, ailxVarPop)) {
                    aiprVar.add(ailxVarPop);
                    aiibVar = aihz.INSTANCE;
                } else {
                    aiibVar = aihy.INSTANCE;
                }
                if (true == affa.f(aiibVar, aihz.INSTANCE)) {
                    aiibVar = null;
                }
                if (aiibVar != null) {
                    aimg typeSystemContext = aiicVar.getTypeSystemContext();
                    Iterator<ailw> it = typeSystemContext.supertypes(typeSystemContext.typeConstructor(ailxVarPop)).iterator();
                    while (it.hasNext()) {
                        supertypesDeque.add(aiibVar.transformType(aiicVar, it.next()));
                    }
                }
            }
        }
        aiicVar.clear();
        ArrayList arrayList = new ArrayList();
        for (ailx ailxVar2 : aiprVar) {
            aier aierVar = INSTANCE;
            ailxVar2.getClass();
            woy.cq(arrayList, aierVar.collectAndFilter(aiicVar, aimgVar, ailxVar2, aimdVar));
        }
        return arrayList;
    }

    public final boolean isSubtypeForSameConstructor(aiic aiicVar, aimg aimgVar, ailz ailzVar, ailx ailxVar) {
        boolean zIsSubtypeOf$default;
        aiicVar.getClass();
        aimgVar.getClass();
        ailzVar.getClass();
        ailxVar.getClass();
        aimd aimdVarTypeConstructor = aimh.typeConstructor(aimgVar, ailxVar);
        int size = aimh.size(aimgVar, ailzVar);
        int iParametersCount = aimh.parametersCount(aimgVar, aimdVarTypeConstructor);
        if (size != iParametersCount || size != aimh.argumentsCount(aimgVar, ailxVar)) {
            return false;
        }
        for (int i = 0; i < iParametersCount; i++) {
            aima argument = aimh.getArgument(aimgVar, ailxVar, i);
            ailw type = aimh.getType(aimgVar, argument);
            if (type != null) {
                aima aimaVar = aimh.get(aimgVar, ailzVar, i);
                aimh.getVariance(aimgVar, aimaVar);
                aimm aimmVar = aimm.IN;
                ailw type2 = aimh.getType(aimgVar, aimaVar);
                type2.getClass();
                aimm aimmVarEffectiveVariance = effectiveVariance(aimh.getVariance(aimgVar, aimh.getParameter(aimgVar, aimdVarTypeConstructor, i)), aimh.getVariance(aimgVar, argument));
                if (aimmVarEffectiveVariance == null) {
                    return aiicVar.isErrorTypeEqualsToAnything();
                }
                if (aimmVarEffectiveVariance != aimm.INV || (!isTypeVariableAgainstStarProjectionForSelfType(aimgVar, type2, type, aimdVarTypeConstructor) && !isTypeVariableAgainstStarProjectionForSelfType(aimgVar, type, type2, aimdVarTypeConstructor))) {
                    if (aiicVar.argumentsDepth > 100) {
                        Objects.toString(type2);
                        throw new IllegalStateException("Arguments depth is too high. Some related argument: ".concat(type2.toString()));
                    }
                    aiicVar.argumentsDepth++;
                    aihw aihwVar = aihw.CHECK_ONLY_LOWER;
                    int iOrdinal = aimmVarEffectiveVariance.ordinal();
                    if (iOrdinal == 0) {
                        zIsSubtypeOf$default = isSubtypeOf$default(INSTANCE, aiicVar, type, type2, false, 8, null);
                    } else if (iOrdinal == 1) {
                        zIsSubtypeOf$default = isSubtypeOf$default(INSTANCE, aiicVar, type2, type, false, 8, null);
                    } else {
                        if (iOrdinal != 2) {
                            throw new aezs();
                        }
                        zIsSubtypeOf$default = INSTANCE.equalTypes(aiicVar, type2, type);
                    }
                    aiicVar.argumentsDepth--;
                    if (!zIsSubtypeOf$default) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public final boolean isSubtypeOf(aiic aiicVar, ailw ailwVar, ailw ailwVar2, boolean z) {
        aiicVar.getClass();
        ailwVar.getClass();
        ailwVar2.getClass();
        if (ailwVar == ailwVar2) {
            return true;
        }
        Boolean boolCustomIsSubtypeOf = aiicVar.customIsSubtypeOf(ailwVar, ailwVar2);
        if (boolCustomIsSubtypeOf != null) {
            return boolCustomIsSubtypeOf.booleanValue();
        }
        return INSTANCE.completeIsSubTypeOf(aiicVar, aiicVar.getTypeSystemContext(), ailwVar, ailwVar2, z);
    }

    public final boolean isSubtypeOf(aiic aiicVar, ailw ailwVar, ailw ailwVar2) {
        aiicVar.getClass();
        ailwVar.getClass();
        ailwVar2.getClass();
        return isSubtypeOf$default(this, aiicVar, ailwVar, ailwVar2, false, 8, null);
    }

    public final List<ailx> findCorrespondingSupertypes(aiic aiicVar, ailx ailxVar, aimd aimdVar) {
        aiicVar.getClass();
        ailxVar.getClass();
        aimdVar.getClass();
        return INSTANCE.findCorrespondingSupertypes(aiicVar, aiicVar.getTypeSystemContext(), ailxVar, aimdVar);
    }
}
