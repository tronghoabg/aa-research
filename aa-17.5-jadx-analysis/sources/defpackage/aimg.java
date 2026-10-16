package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public interface aimg extends aimk {
    boolean areEqualTypeConstructors(aimd aimdVar, aimd aimdVar2);

    int argumentsCount(ailw ailwVar);

    ailz asArgumentList(ailx ailxVar);

    ails asCapturedType(aily ailyVar);

    ails asCapturedTypeUnwrappingDnn(ailx ailxVar);

    ailt asDefinitelyNotNullType(ailx ailxVar);

    ailu asDynamicType(ailv ailvVar);

    ailv asFlexibleType(ailw ailwVar);

    ailx asRigidType(ailw ailwVar);

    aima asTypeArgument(ailw ailwVar);

    ailx captureFromArguments(ailx ailxVar, ailq ailqVar);

    ailq captureStatus(ails ailsVar);

    List<aily> fastCorrespondingSupertypes(ailx ailxVar, aimd aimdVar);

    aima get(ailz ailzVar, int i);

    aima getArgument(ailw ailwVar, int i);

    aima getArgumentOrNull(ailx ailxVar, int i);

    List<aima> getArguments(ailw ailwVar);

    afeg<ailw, ailw, Boolean> getCustomSubtypingCallback();

    aime getParameter(aimd aimdVar, int i);

    List<aime> getParameters(aimd aimdVar);

    ailw getType(aima aimaVar);

    aimd getTypeConstructor(aime aimeVar);

    aime getTypeParameter(aiml aimlVar);

    aime getTypeParameterClassifier(aimd aimdVar);

    List<ailw> getUpperBounds(aime aimeVar);

    aimm getVariance(aima aimaVar);

    aimm getVariance(aime aimeVar);

    boolean hasFlexibleNullability(ailw ailwVar);

    boolean hasRecursiveBounds(aime aimeVar, aimd aimdVar);

    ailw intersectTypes(Collection<? extends ailw> collection);

    boolean isAnyConstructor(aimd aimdVar);

    boolean isCapturedType(ailw ailwVar);

    boolean isClassType(ailx ailxVar);

    boolean isClassTypeConstructor(aimd aimdVar);

    boolean isCommonFinalClassConstructor(aimd aimdVar);

    boolean isDefinitelyNotNullType(ailw ailwVar);

    boolean isDefinitelyNotNullType(ailx ailxVar);

    boolean isDenotable(aimd aimdVar);

    boolean isDynamic(ailw ailwVar);

    boolean isError(ailw ailwVar);

    boolean isFlexible(ailw ailwVar);

    boolean isFlexibleWithDifferentTypeConstructors(ailw ailwVar);

    boolean isIntegerLiteralType(ailx ailxVar);

    boolean isIntegerLiteralTypeConstructor(aimd aimdVar);

    boolean isIntersection(aimd aimdVar);

    boolean isMarkedNullable(ailw ailwVar);

    boolean isNotNullTypeParameter(ailw ailwVar);

    boolean isNothing(ailw ailwVar);

    boolean isNothingConstructor(aimd aimdVar);

    boolean isNullableType(ailw ailwVar);

    boolean isOldCapturedType(ails ailsVar);

    boolean isPrimitiveType(aily ailyVar);

    boolean isProjectionNotNull(ails ailsVar);

    boolean isRawType(ailw ailwVar);

    boolean isSingleClassifierType(ailx ailxVar);

    boolean isStarProjection(aima aimaVar);

    boolean isStubType(ailx ailxVar);

    boolean isStubTypeForBuilderInference(ailx ailxVar);

    boolean isTypeVariableType(ailw ailwVar);

    ailx lowerBound(ailv ailvVar);

    ailx lowerBoundIfFlexible(ailw ailwVar);

    ailw lowerType(ails ailsVar);

    ailw makeDefinitelyNotNullOrNotNull(ailw ailwVar);

    ailw makeDefinitelyNotNullOrNotNull(ailw ailwVar, boolean z);

    aily original(ailt ailtVar);

    aily originalIfDefinitelyNotNullable(ailx ailxVar);

    int parametersCount(aimd aimdVar);

    Collection<ailw> possibleIntegerTypes(ailx ailxVar);

    aima projection(ailr ailrVar);

    ailw safeSubstitute(aimf aimfVar, ailw ailwVar);

    int size(ailz ailzVar);

    aiib substitutionSupertypePolicy(ailx ailxVar);

    Collection<ailw> supertypes(aimd aimdVar);

    ailr typeConstructor(ails ailsVar);

    aimd typeConstructor(ailw ailwVar);

    aimd typeConstructor(ailx ailxVar);

    ailx upperBound(ailv ailvVar);

    ailx upperBoundIfFlexible(ailw ailwVar);

    ailw withNullability(ailw ailwVar, boolean z);

    ailx withNullability(ailx ailxVar, boolean z);
}
