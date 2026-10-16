package defpackage;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes3.dex */
public final class aiel {
    public static final aiel INSTANCE = new aiel();

    private aiel() {
    }

    private final boolean isApplicableAsEndNode(aiic aiicVar, ailx ailxVar, aimd aimdVar) {
        aimg typeSystemContext = aiicVar.getTypeSystemContext();
        if (typeSystemContext.isNothing(ailxVar)) {
            return true;
        }
        if (typeSystemContext.isMarkedNullable(ailxVar)) {
            return false;
        }
        if (aiicVar.isStubTypeEqualsToAnything() && typeSystemContext.isStubType(ailxVar)) {
            return true;
        }
        return typeSystemContext.areEqualTypeConstructors(typeSystemContext.typeConstructor(ailxVar), aimdVar);
    }

    private final boolean runIsPossibleSubtype(aiic aiicVar, ailx ailxVar, ailx ailxVar2) {
        aimg typeSystemContext = aiicVar.getTypeSystemContext();
        if (aier.RUN_SLOW_ASSERTIONS) {
            if (!typeSystemContext.isSingleClassifierType(ailxVar) && !typeSystemContext.isIntersection(typeSystemContext.typeConstructor(ailxVar))) {
                aiicVar.isAllowedTypeVariable(ailxVar);
            }
            if (!typeSystemContext.isSingleClassifierType(ailxVar2)) {
                aiicVar.isAllowedTypeVariable(ailxVar2);
            }
        }
        if (typeSystemContext.isMarkedNullable(ailxVar2) || typeSystemContext.isNotNullTypeParameter(ailxVar) || typeSystemContext.isDefinitelyNotNullType(ailxVar)) {
            return true;
        }
        if ((ailxVar instanceof ails) && typeSystemContext.isProjectionNotNull((ails) ailxVar)) {
            return true;
        }
        aiel aielVar = INSTANCE;
        if (aielVar.hasNotNullSupertype(aiicVar, ailxVar, aihy.INSTANCE)) {
            return true;
        }
        if (typeSystemContext.isDefinitelyNotNullType(ailxVar2) || aielVar.hasNotNullSupertype(aiicVar, ailxVar2, aiia.INSTANCE) || typeSystemContext.isClassType(ailxVar)) {
            return false;
        }
        return aielVar.hasPathByNotMarkedNullableNodes(aiicVar, ailxVar, typeSystemContext.typeConstructor(ailxVar2));
    }

    public final boolean hasNotNullSupertype(aiic aiicVar, ailx ailxVar, aiib aiibVar) {
        aiicVar.getClass();
        ailxVar.getClass();
        aiibVar.getClass();
        aimg typeSystemContext = aiicVar.getTypeSystemContext();
        if ((typeSystemContext.isClassType(ailxVar) && !typeSystemContext.isMarkedNullable(ailxVar)) || typeSystemContext.isDefinitelyNotNullType(ailxVar)) {
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
                aiib aiibVar2 = typeSystemContext.isMarkedNullable(ailxVarPop) ? aihz.INSTANCE : aiibVar;
                if (true == affa.f(aiibVar2, aihz.INSTANCE)) {
                    aiibVar2 = null;
                }
                if (aiibVar2 != null) {
                    aimg typeSystemContext2 = aiicVar.getTypeSystemContext();
                    Iterator<ailw> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(ailxVarPop)).iterator();
                    while (it.hasNext()) {
                        ailx ailxVarTransformType = aiibVar2.transformType(aiicVar, it.next());
                        if ((typeSystemContext.isClassType(ailxVarTransformType) && !typeSystemContext.isMarkedNullable(ailxVarTransformType)) || typeSystemContext.isDefinitelyNotNullType(ailxVarTransformType)) {
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

    public final boolean hasPathByNotMarkedNullableNodes(aiic aiicVar, ailx ailxVar, aimd aimdVar) {
        aiicVar.getClass();
        ailxVar.getClass();
        aimdVar.getClass();
        aimg typeSystemContext = aiicVar.getTypeSystemContext();
        if (INSTANCE.isApplicableAsEndNode(aiicVar, ailxVar, aimdVar)) {
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
                aiib aiibVar = typeSystemContext.isMarkedNullable(ailxVarPop) ? aihz.INSTANCE : aihy.INSTANCE;
                if (true == affa.f(aiibVar, aihz.INSTANCE)) {
                    aiibVar = null;
                }
                if (aiibVar != null) {
                    aimg typeSystemContext2 = aiicVar.getTypeSystemContext();
                    Iterator<ailw> it = typeSystemContext2.supertypes(typeSystemContext2.typeConstructor(ailxVarPop)).iterator();
                    while (it.hasNext()) {
                        ailx ailxVarTransformType = aiibVar.transformType(aiicVar, it.next());
                        if (INSTANCE.isApplicableAsEndNode(aiicVar, ailxVarTransformType, aimdVar)) {
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

    public final boolean isPossibleSubtype(aiic aiicVar, ailx ailxVar, ailx ailxVar2) {
        aiicVar.getClass();
        ailxVar.getClass();
        ailxVar2.getClass();
        return runIsPossibleSubtype(aiicVar, ailxVar, ailxVar2);
    }
}
