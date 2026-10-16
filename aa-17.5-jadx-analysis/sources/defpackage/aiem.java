package defpackage;

/* loaded from: classes3.dex */
public final class aiem {
    public static final aiem INSTANCE = new aiem();

    private aiem() {
    }

    private final boolean strictEqualRigidTypes(aimg aimgVar, ailx ailxVar, ailx ailxVar2) {
        if (aimgVar.argumentsCount(ailxVar) != aimgVar.argumentsCount(ailxVar2) || aimgVar.isMarkedNullable(ailxVar) != aimgVar.isMarkedNullable(ailxVar2) || aimgVar.isDefinitelyNotNullType(ailxVar) != aimgVar.isDefinitelyNotNullType(ailxVar2) || !aimgVar.areEqualTypeConstructors(aimgVar.typeConstructor(ailxVar), aimgVar.typeConstructor(ailxVar2))) {
            return false;
        }
        if (aimgVar.identicalArguments(ailxVar, ailxVar2)) {
            return true;
        }
        int iArgumentsCount = aimgVar.argumentsCount(ailxVar);
        for (int i = 0; i < iArgumentsCount; i++) {
            aima argument = aimgVar.getArgument(ailxVar, i);
            aima argument2 = aimgVar.getArgument(ailxVar2, i);
            if (aimgVar.isStarProjection(argument) != aimgVar.isStarProjection(argument2)) {
                return false;
            }
            if (!aimgVar.isStarProjection(argument)) {
                if (aimgVar.getVariance(argument) != aimgVar.getVariance(argument2)) {
                    return false;
                }
                ailw type = aimgVar.getType(argument);
                type.getClass();
                ailw type2 = aimgVar.getType(argument2);
                type2.getClass();
                if (!strictEqualTypesInternal(aimgVar, type, type2)) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean strictEqualTypesInternal(aimg aimgVar, ailw ailwVar, ailw ailwVar2) {
        if (ailwVar == ailwVar2) {
            return true;
        }
        ailx ailxVarAsRigidType = aimgVar.asRigidType(ailwVar);
        ailx ailxVarAsRigidType2 = aimgVar.asRigidType(ailwVar2);
        if (ailxVarAsRigidType != null && ailxVarAsRigidType2 != null) {
            return strictEqualRigidTypes(aimgVar, ailxVarAsRigidType, ailxVarAsRigidType2);
        }
        ailv ailvVarAsFlexibleType = aimgVar.asFlexibleType(ailwVar);
        ailv ailvVarAsFlexibleType2 = aimgVar.asFlexibleType(ailwVar2);
        return ailvVarAsFlexibleType != null && ailvVarAsFlexibleType2 != null && strictEqualRigidTypes(aimgVar, aimgVar.lowerBound(ailvVarAsFlexibleType), aimgVar.lowerBound(ailvVarAsFlexibleType2)) && strictEqualRigidTypes(aimgVar, aimgVar.upperBound(ailvVarAsFlexibleType), aimgVar.upperBound(ailvVarAsFlexibleType2));
    }

    public final boolean strictEqualTypes(aimg aimgVar, ailw ailwVar, ailw ailwVar2) {
        aimgVar.getClass();
        ailwVar.getClass();
        ailwVar2.getClass();
        return strictEqualTypesInternal(aimgVar, ailwVar, ailwVar2);
    }
}
