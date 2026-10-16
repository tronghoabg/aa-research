package defpackage;

import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aikj implements aijl {
    public static final aikj INSTANCE = new aikj();

    private aikj() {
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean areEqualTypeConstructors(aimd aimdVar, aimd aimdVar2) {
        return aijj.areEqualTypeConstructors(this, aimdVar, aimdVar2);
    }

    @Override // defpackage.aimg
    public /* bridge */ int argumentsCount(ailw ailwVar) {
        return aijj.argumentsCount(this, ailwVar);
    }

    @Override // defpackage.aiiz
    public /* bridge */ aily arrayType(ailw ailwVar) {
        return aijj.arrayType(this, ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ ailz asArgumentList(ailx ailxVar) {
        return aijj.asArgumentList(this, ailxVar);
    }

    @Override // defpackage.aijl, defpackage.aimg
    public /* bridge */ ails asCapturedType(aily ailyVar) {
        return aijj.asCapturedType(this, ailyVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ ails asCapturedTypeUnwrappingDnn(ailx ailxVar) {
        return default$asCapturedTypeUnwrappingDnn(ailxVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ ailt asDefinitelyNotNullType(ailx ailxVar) {
        return aijj.asDefinitelyNotNullType(this, ailxVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ ailu asDynamicType(ailv ailvVar) {
        return aijj.asDynamicType(this, ailvVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ ailv asFlexibleType(ailw ailwVar) {
        return aijj.asFlexibleType(this, ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ aima asTypeArgument(ailw ailwVar) {
        return aijj.asTypeArgument(this, ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ aigw captureFromArguments(ailx ailxVar, ailq ailqVar) {
        return aijj.captureFromArguments(this, ailxVar, ailqVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ ailq captureStatus(ails ailsVar) {
        return aijj.captureStatus(this, ailsVar);
    }

    @Override // defpackage.aijl
    public /* bridge */ ailw createFlexibleType(ailx ailxVar, ailx ailxVar2) {
        return aijj.createFlexibleType(this, ailxVar, ailxVar2);
    }

    public ails default$asCapturedTypeUnwrappingDnn(ailx ailxVar) {
        ailxVar.getClass();
        return asCapturedType(originalIfDefinitelyNotNullable(ailxVar));
    }

    public List<aily> default$fastCorrespondingSupertypes(ailx ailxVar, aimd aimdVar) {
        ailxVar.getClass();
        aimdVar.getClass();
        return null;
    }

    public aima default$get(ailz ailzVar, int i) {
        ailzVar.getClass();
        if (ailzVar instanceof aily) {
            return getArgument((ailw) ailzVar, i);
        }
        if (ailzVar instanceof ailp) {
            Object obj = ((ailp) ailzVar).get(i);
            obj.getClass();
            return (aima) obj;
        }
        throw new IllegalStateException("unknown type argument list type: " + ailzVar + ", " + affw.b(ailzVar.getClass()));
    }

    public aima default$getArgumentOrNull(ailx ailxVar, int i) {
        ailxVar.getClass();
        if (i < 0 || i >= argumentsCount(ailxVar)) {
            return null;
        }
        return getArgument(ailxVar, i);
    }

    public afeg<ailw, ailw, Boolean> default$getCustomSubtypingCallback() {
        return null;
    }

    public boolean default$hasFlexibleNullability(ailw ailwVar) {
        ailwVar.getClass();
        return isMarkedNullable(lowerBoundIfFlexible(ailwVar)) != isMarkedNullable(upperBoundIfFlexible(ailwVar));
    }

    public boolean default$isCapturedType(ailw ailwVar) {
        ailwVar.getClass();
        ailx ailxVarAsRigidType = asRigidType(ailwVar);
        return (ailxVarAsRigidType != null ? asCapturedTypeUnwrappingDnn(ailxVarAsRigidType) : null) != null;
    }

    public boolean default$isClassType(ailx ailxVar) {
        ailxVar.getClass();
        return isClassTypeConstructor(typeConstructor(ailxVar));
    }

    public boolean default$isDefinitelyNotNullType(ailw ailwVar) {
        ailwVar.getClass();
        ailx ailxVarAsRigidType = asRigidType(ailwVar);
        return (ailxVarAsRigidType != null ? asDefinitelyNotNullType(ailxVarAsRigidType) : null) != null;
    }

    public boolean default$isDynamic(ailw ailwVar) {
        ailwVar.getClass();
        ailv ailvVarAsFlexibleType = asFlexibleType(ailwVar);
        return (ailvVarAsFlexibleType != null ? asDynamicType(ailvVarAsFlexibleType) : null) != null;
    }

    public boolean default$isFlexible(ailw ailwVar) {
        ailwVar.getClass();
        return asFlexibleType(ailwVar) != null;
    }

    public boolean default$isFlexibleWithDifferentTypeConstructors(ailw ailwVar) {
        ailwVar.getClass();
        return !affa.f(typeConstructor(lowerBoundIfFlexible(ailwVar)), typeConstructor(upperBoundIfFlexible(ailwVar)));
    }

    public boolean default$isIntegerLiteralType(ailx ailxVar) {
        ailxVar.getClass();
        return isIntegerLiteralTypeConstructor(typeConstructor(ailxVar));
    }

    public boolean default$isNothing(ailw ailwVar) {
        ailwVar.getClass();
        return isNothingConstructor(typeConstructor(ailwVar)) && !isNullableType(ailwVar);
    }

    public ailx default$lowerBoundIfFlexible(ailw ailwVar) {
        ailx ailxVarLowerBound;
        ailwVar.getClass();
        ailv ailvVarAsFlexibleType = asFlexibleType(ailwVar);
        if (ailvVarAsFlexibleType != null && (ailxVarLowerBound = lowerBound(ailvVarAsFlexibleType)) != null) {
            return ailxVarLowerBound;
        }
        ailx ailxVarAsRigidType = asRigidType(ailwVar);
        ailxVarAsRigidType.getClass();
        return ailxVarAsRigidType;
    }

    public ailw default$makeDefinitelyNotNullOrNotNull(ailw ailwVar) {
        ailwVar.getClass();
        return makeDefinitelyNotNullOrNotNull(ailwVar, false);
    }

    public ailw default$makeNullable(ailw ailwVar) {
        ailx ailxVarWithNullability;
        ailwVar.getClass();
        ailx ailxVarAsRigidType = asRigidType(ailwVar);
        return (ailxVarAsRigidType == null || (ailxVarWithNullability = withNullability(ailxVarAsRigidType, true)) == null) ? ailwVar : ailxVarWithNullability;
    }

    public aiic default$newTypeCheckerState(boolean z, boolean z2, boolean z3) {
        return newTypeCheckerState(this, z, z2, z3);
    }

    public aily default$originalIfDefinitelyNotNullable(ailx ailxVar) {
        aily ailyVarOriginal;
        ailxVar.getClass();
        ailt ailtVarAsDefinitelyNotNullType = asDefinitelyNotNullType(ailxVar);
        return (ailtVarAsDefinitelyNotNullType == null || (ailyVarOriginal = original(ailtVarAsDefinitelyNotNullType)) == null) ? (aily) ailxVar : ailyVarOriginal;
    }

    public int default$size(ailz ailzVar) {
        ailzVar.getClass();
        if (ailzVar instanceof ailx) {
            return argumentsCount((ailw) ailzVar);
        }
        if (ailzVar instanceof ailp) {
            return ((ailp) ailzVar).size();
        }
        throw new IllegalStateException("unknown type argument list type: " + ailzVar + ", " + affw.b(ailzVar.getClass()));
    }

    public aimd default$typeConstructor(ailw ailwVar) {
        ailwVar.getClass();
        ailx ailxVarAsRigidType = asRigidType(ailwVar);
        if (ailxVarAsRigidType == null) {
            ailxVarAsRigidType = lowerBoundIfFlexible(ailwVar);
        }
        return typeConstructor(ailxVarAsRigidType);
    }

    public ailx default$upperBoundIfFlexible(ailw ailwVar) {
        ailx ailxVarUpperBound;
        ailwVar.getClass();
        ailv ailvVarAsFlexibleType = asFlexibleType(ailwVar);
        if (ailvVarAsFlexibleType != null && (ailxVarUpperBound = upperBound(ailvVarAsFlexibleType)) != null) {
            return ailxVarUpperBound;
        }
        ailx ailxVarAsRigidType = asRigidType(ailwVar);
        ailxVarAsRigidType.getClass();
        return ailxVarAsRigidType;
    }

    @Override // defpackage.aimg
    public /* bridge */ List<aily> fastCorrespondingSupertypes(ailx ailxVar, aimd aimdVar) {
        default$fastCorrespondingSupertypes(ailxVar, aimdVar);
        return null;
    }

    @Override // defpackage.aimg
    public /* bridge */ aima get(ailz ailzVar, int i) {
        return default$get(ailzVar, i);
    }

    @Override // defpackage.aimg
    public /* bridge */ aima getArgument(ailw ailwVar, int i) {
        return aijj.getArgument(this, ailwVar, i);
    }

    @Override // defpackage.aimg
    public /* bridge */ aima getArgumentOrNull(ailx ailxVar, int i) {
        return default$getArgumentOrNull(ailxVar, i);
    }

    @Override // defpackage.aimg
    public /* bridge */ List<aima> getArguments(ailw ailwVar) {
        return aijj.getArguments(this, ailwVar);
    }

    @Override // defpackage.aijl
    public /* bridge */ afye getBuiltIns() {
        return aijj.getBuiltIns(this);
    }

    @Override // defpackage.aiiz
    public /* bridge */ ahnh getClassFqNameUnsafe(aimd aimdVar) {
        return aijj.getClassFqNameUnsafe(this, aimdVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ afeg<ailw, ailw, Boolean> getCustomSubtypingCallback() {
        return null;
    }

    @Override // defpackage.aimg
    public /* bridge */ aime getParameter(aimd aimdVar, int i) {
        return aijj.getParameter(this, aimdVar, i);
    }

    @Override // defpackage.aimg
    public /* bridge */ List<aime> getParameters(aimd aimdVar) {
        return aijj.getParameters(this, aimdVar);
    }

    @Override // defpackage.aiiz
    public /* bridge */ afyi getPrimitiveArrayType(aimd aimdVar) {
        return aijj.getPrimitiveArrayType(this, aimdVar);
    }

    @Override // defpackage.aiiz
    public /* bridge */ afyi getPrimitiveType(aimd aimdVar) {
        return aijj.getPrimitiveType(this, aimdVar);
    }

    @Override // defpackage.aiiz
    public /* bridge */ ailw getRepresentativeUpperBound(aime aimeVar) {
        return aijj.getRepresentativeUpperBound(this, aimeVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ ailw getType(aima aimaVar) {
        return aijj.getType(this, aimaVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ aimd getTypeConstructor(aime aimeVar) {
        return aijj.getTypeConstructor(this, aimeVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ aime getTypeParameter(aiml aimlVar) {
        return aijj.getTypeParameter(this, aimlVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ aime getTypeParameterClassifier(aimd aimdVar) {
        return aijj.getTypeParameterClassifier(this, aimdVar);
    }

    @Override // defpackage.aiiz
    public /* bridge */ ailw getUnsubstitutedUnderlyingType(ailw ailwVar) {
        return aijj.getUnsubstitutedUnderlyingType(this, ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ List<ailw> getUpperBounds(aime aimeVar) {
        return aijj.getUpperBounds(this, aimeVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ aimm getVariance(aima aimaVar) {
        return aijj.getVariance(this, aimaVar);
    }

    @Override // defpackage.aiiz
    public /* bridge */ boolean hasAnnotation(ailw ailwVar, ahnf ahnfVar) {
        return aijj.hasAnnotation(this, ailwVar, ahnfVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean hasFlexibleNullability(ailw ailwVar) {
        return default$hasFlexibleNullability(ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean hasRecursiveBounds(aime aimeVar, aimd aimdVar) {
        return aijj.hasRecursiveBounds(this, aimeVar, aimdVar);
    }

    @Override // defpackage.aimk
    public /* bridge */ boolean identicalArguments(ailx ailxVar, ailx ailxVar2) {
        return aijj.identicalArguments(this, ailxVar, ailxVar2);
    }

    @Override // defpackage.aimg
    public /* bridge */ ailw intersectTypes(Collection<? extends ailw> collection) {
        return aijj.intersectTypes(this, collection);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isAnyConstructor(aimd aimdVar) {
        return aijj.isAnyConstructor(this, aimdVar);
    }

    @Override // defpackage.aiiz
    public /* bridge */ boolean isArrayOrNullableArray(ailw ailwVar) {
        return aijj.isArrayOrNullableArray(this, ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isCapturedType(ailw ailwVar) {
        return default$isCapturedType(ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isClassType(ailx ailxVar) {
        return default$isClassType(ailxVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isClassTypeConstructor(aimd aimdVar) {
        return aijj.isClassTypeConstructor(this, aimdVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isCommonFinalClassConstructor(aimd aimdVar) {
        return aijj.isCommonFinalClassConstructor(this, aimdVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isDefinitelyNotNullType(ailw ailwVar) {
        return default$isDefinitelyNotNullType(ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isDenotable(aimd aimdVar) {
        return aijj.isDenotable(this, aimdVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isDynamic(ailw ailwVar) {
        return default$isDynamic(ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isError(ailw ailwVar) {
        return aijj.isError(this, ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isFlexible(ailw ailwVar) {
        return default$isFlexible(ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isFlexibleWithDifferentTypeConstructors(ailw ailwVar) {
        return default$isFlexibleWithDifferentTypeConstructors(ailwVar);
    }

    @Override // defpackage.aiiz
    public /* bridge */ boolean isInlineClass(aimd aimdVar) {
        return aijj.isInlineClass(this, aimdVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isIntegerLiteralType(ailx ailxVar) {
        return default$isIntegerLiteralType(ailxVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isIntegerLiteralTypeConstructor(aimd aimdVar) {
        return aijj.isIntegerLiteralTypeConstructor(this, aimdVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isIntersection(aimd aimdVar) {
        return aijj.isIntersection(this, aimdVar);
    }

    @Override // defpackage.aimj
    public /* bridge */ boolean isK2() {
        return false;
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isMarkedNullable(ailw ailwVar) {
        return aijj.isMarkedNullable(this, ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isNotNullTypeParameter(ailw ailwVar) {
        return aijj.isNotNullTypeParameter(this, ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isNothing(ailw ailwVar) {
        return default$isNothing(ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isNothingConstructor(aimd aimdVar) {
        return aijj.isNothingConstructor(this, aimdVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isNullableType(ailw ailwVar) {
        return aijj.isNullableType(this, ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isOldCapturedType(ails ailsVar) {
        return aijj.isOldCapturedType(this, ailsVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isPrimitiveType(aily ailyVar) {
        return aijj.isPrimitiveType(this, ailyVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isProjectionNotNull(ails ailsVar) {
        return aijj.isProjectionNotNull(this, ailsVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isRawType(ailw ailwVar) {
        return aijj.isRawType(this, ailwVar);
    }

    @Override // defpackage.aijl, defpackage.aimg
    public /* bridge */ boolean isSingleClassifierType(ailx ailxVar) {
        return aijj.isSingleClassifierType(this, ailxVar);
    }

    @Override // defpackage.aijl, defpackage.aimg
    public /* bridge */ boolean isStarProjection(aima aimaVar) {
        return aijj.isStarProjection(this, aimaVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isStubType(ailx ailxVar) {
        return aijj.isStubType(this, ailxVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isStubTypeForBuilderInference(ailx ailxVar) {
        return aijj.isStubTypeForBuilderInference(this, ailxVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isTypeVariableType(ailw ailwVar) {
        return aijj.isTypeVariableType(this, ailwVar);
    }

    @Override // defpackage.aiiz
    public /* bridge */ boolean isUnderKotlinPackage(aimd aimdVar) {
        return aijj.isUnderKotlinPackage(this, aimdVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ ailx lowerBoundIfFlexible(ailw ailwVar) {
        return default$lowerBoundIfFlexible(ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ ailw lowerType(ails ailsVar) {
        return aijj.lowerType(this, ailsVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ ailw makeDefinitelyNotNullOrNotNull(ailw ailwVar) {
        return default$makeDefinitelyNotNullOrNotNull(ailwVar);
    }

    @Override // defpackage.aiiz
    public /* bridge */ ailw makeNullable(ailw ailwVar) {
        return default$makeNullable(ailwVar);
    }

    @Override // defpackage.aimc
    public /* bridge */ aiic newTypeCheckerState(aimg aimgVar, boolean z, boolean z2, boolean z3) {
        return aijj.newTypeCheckerState(this, aimgVar, z, z2, z3);
    }

    @Override // defpackage.aiiz
    public /* bridge */ aily nullableAnyType() {
        return aijj.nullableAnyType(this);
    }

    @Override // defpackage.aimg
    public /* bridge */ aily original(ailt ailtVar) {
        return aijj.original(this, ailtVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ aily originalIfDefinitelyNotNullable(ailx ailxVar) {
        return default$originalIfDefinitelyNotNullable(ailxVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ int parametersCount(aimd aimdVar) {
        return aijj.parametersCount(this, aimdVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ Collection<ailw> possibleIntegerTypes(ailx ailxVar) {
        return aijj.possibleIntegerTypes(this, ailxVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ aima projection(ailr ailrVar) {
        return aijj.projection(this, ailrVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ ailw safeSubstitute(aimf aimfVar, ailw ailwVar) {
        return aijj.safeSubstitute(this, aimfVar, ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ int size(ailz ailzVar) {
        return default$size(ailzVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ aiib substitutionSupertypePolicy(ailx ailxVar) {
        return aijj.substitutionSupertypePolicy(this, ailxVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ Collection<ailw> supertypes(aimd aimdVar) {
        return aijj.supertypes(this, aimdVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ ailr typeConstructor(ails ailsVar) {
        return aijj.typeConstructor((aijl) this, ailsVar);
    }

    @Override // defpackage.aiiz
    public /* bridge */ aimf typeSubstitutorForUnderlyingType(Map<aimd, ? extends ailw> map) {
        return aijj.typeSubstitutorForUnderlyingType(this, map);
    }

    @Override // defpackage.aimg
    public /* bridge */ ailx upperBoundIfFlexible(ailw ailwVar) {
        return default$upperBoundIfFlexible(ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ ailw withNullability(ailw ailwVar, boolean z) {
        return aijj.withNullability(this, ailwVar, z);
    }

    @Override // defpackage.aimg
    public /* bridge */ aily asRigidType(ailw ailwVar) {
        return aijj.asRigidType(this, ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ aimm getVariance(aime aimeVar) {
        return aijj.getVariance(this, aimeVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isDefinitelyNotNullType(ailx ailxVar) {
        return default$isDefinitelyNotNullType(ailxVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ aily lowerBound(ailv ailvVar) {
        return aijj.lowerBound(this, ailvVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ ailw makeDefinitelyNotNullOrNotNull(ailw ailwVar, boolean z) {
        return aijj.makeDefinitelyNotNullOrNotNull(this, ailwVar, z);
    }

    @Override // defpackage.aimc
    public /* bridge */ aiic newTypeCheckerState(boolean z, boolean z2, boolean z3) {
        return default$newTypeCheckerState(z, z2, z3);
    }

    @Override // defpackage.aimg
    public /* bridge */ aimd typeConstructor(ailw ailwVar) {
        return default$typeConstructor(ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ aily upperBound(ailv ailvVar) {
        return aijj.upperBound(this, ailvVar);
    }

    @Override // defpackage.aijl, defpackage.aimg
    public /* bridge */ aimd typeConstructor(ailx ailxVar) {
        return aijj.typeConstructor(this, ailxVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ aily withNullability(ailx ailxVar, boolean z) {
        return aijj.withNullability((aijl) this, ailxVar, z);
    }

    public boolean default$isDefinitelyNotNullType(ailx ailxVar) {
        ailxVar.getClass();
        return asDefinitelyNotNullType(ailxVar) != null;
    }
}
