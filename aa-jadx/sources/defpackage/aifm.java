package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class aifm {
    public static final defpackage.aifm INSTANCE = new defpackage.aifm();

    private aifm() {
    }

    private final boolean strictEqualRigidTypes(defpackage.aing aingVar, defpackage.aimx aimxVar, defpackage.aimx aimxVar2) {
        if (aingVar.argumentsCount(aimxVar) != aingVar.argumentsCount(aimxVar2) || aingVar.isMarkedNullable(aimxVar) != aingVar.isMarkedNullable(aimxVar2) || aingVar.isDefinitelyNotNullType(aimxVar) != aingVar.isDefinitelyNotNullType(aimxVar2) || !aingVar.areEqualTypeConstructors(aingVar.typeConstructor(aimxVar), aingVar.typeConstructor(aimxVar2))) {
            return false;
        }
        if (aingVar.identicalArguments(aimxVar, aimxVar2)) {
            return true;
        }
        int iArgumentsCount = aingVar.argumentsCount(aimxVar);
        for (int i = 0; i < iArgumentsCount; i++) {
            defpackage.aina argument = aingVar.getArgument(aimxVar, i);
            defpackage.aina argument2 = aingVar.getArgument(aimxVar2, i);
            if (aingVar.isStarProjection(argument) != aingVar.isStarProjection(argument2)) {
                return false;
            }
            if (!aingVar.isStarProjection(argument)) {
                if (aingVar.getVariance(argument) != aingVar.getVariance(argument2)) {
                    return false;
                }
                defpackage.aimw type = aingVar.getType(argument);
                type.getClass();
                defpackage.aimw type2 = aingVar.getType(argument2);
                type2.getClass();
                if (!strictEqualTypesInternal(aingVar, type, type2)) {
                    return false;
                }
            }
        }
        return true;
    }

    private final boolean strictEqualTypesInternal(defpackage.aing aingVar, defpackage.aimw aimwVar, defpackage.aimw aimwVar2) {
        if (aimwVar == aimwVar2) {
            return true;
        }
        defpackage.aimx aimxVarAsRigidType = aingVar.asRigidType(aimwVar);
        defpackage.aimx aimxVarAsRigidType2 = aingVar.asRigidType(aimwVar2);
        if (aimxVarAsRigidType != null && aimxVarAsRigidType2 != null) {
            return strictEqualRigidTypes(aingVar, aimxVarAsRigidType, aimxVarAsRigidType2);
        }
        defpackage.aimv aimvVarAsFlexibleType = aingVar.asFlexibleType(aimwVar);
        defpackage.aimv aimvVarAsFlexibleType2 = aingVar.asFlexibleType(aimwVar2);
        return aimvVarAsFlexibleType != null && aimvVarAsFlexibleType2 != null && strictEqualRigidTypes(aingVar, aingVar.lowerBound(aimvVarAsFlexibleType), aingVar.lowerBound(aimvVarAsFlexibleType2)) && strictEqualRigidTypes(aingVar, aingVar.upperBound(aimvVarAsFlexibleType), aingVar.upperBound(aimvVarAsFlexibleType2));
    }

    public final boolean strictEqualTypes(defpackage.aing aingVar, defpackage.aimw aimwVar, defpackage.aimw aimwVar2) {
        aingVar.getClass();
        aimwVar.getClass();
        aimwVar2.getClass();
        return strictEqualTypesInternal(aingVar, aimwVar, aimwVar2);
    }
}
