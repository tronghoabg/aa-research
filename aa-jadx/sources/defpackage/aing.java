package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public interface aing extends defpackage.aink {
    boolean areEqualTypeConstructors(defpackage.aind aindVar, defpackage.aind aindVar2);

    int argumentsCount(defpackage.aimw aimwVar);

    defpackage.aimz asArgumentList(defpackage.aimx aimxVar);

    defpackage.aims asCapturedType(defpackage.aimy aimyVar);

    defpackage.aims asCapturedTypeUnwrappingDnn(defpackage.aimx aimxVar);

    defpackage.aimt asDefinitelyNotNullType(defpackage.aimx aimxVar);

    defpackage.aimu asDynamicType(defpackage.aimv aimvVar);

    defpackage.aimv asFlexibleType(defpackage.aimw aimwVar);

    defpackage.aimx asRigidType(defpackage.aimw aimwVar);

    defpackage.aina asTypeArgument(defpackage.aimw aimwVar);

    defpackage.aimx captureFromArguments(defpackage.aimx aimxVar, defpackage.aimq aimqVar);

    defpackage.aimq captureStatus(defpackage.aims aimsVar);

    java.util.List<defpackage.aimy> fastCorrespondingSupertypes(defpackage.aimx aimxVar, defpackage.aind aindVar);

    defpackage.aina get(defpackage.aimz aimzVar, int i);

    defpackage.aina getArgument(defpackage.aimw aimwVar, int i);

    defpackage.aina getArgumentOrNull(defpackage.aimx aimxVar, int i);

    java.util.List<defpackage.aina> getArguments(defpackage.aimw aimwVar);

    defpackage.affg<defpackage.aimw, defpackage.aimw, java.lang.Boolean> getCustomSubtypingCallback();

    defpackage.aine getParameter(defpackage.aind aindVar, int i);

    java.util.List<defpackage.aine> getParameters(defpackage.aind aindVar);

    defpackage.aimw getType(defpackage.aina ainaVar);

    defpackage.aind getTypeConstructor(defpackage.aine aineVar);

    defpackage.aine getTypeParameter(defpackage.ainl ainlVar);

    defpackage.aine getTypeParameterClassifier(defpackage.aind aindVar);

    java.util.List<defpackage.aimw> getUpperBounds(defpackage.aine aineVar);

    defpackage.ainm getVariance(defpackage.aina ainaVar);

    defpackage.ainm getVariance(defpackage.aine aineVar);

    boolean hasFlexibleNullability(defpackage.aimw aimwVar);

    boolean hasRecursiveBounds(defpackage.aine aineVar, defpackage.aind aindVar);

    defpackage.aimw intersectTypes(java.util.Collection<? extends defpackage.aimw> collection);

    boolean isAnyConstructor(defpackage.aind aindVar);

    boolean isCapturedType(defpackage.aimw aimwVar);

    boolean isClassType(defpackage.aimx aimxVar);

    boolean isClassTypeConstructor(defpackage.aind aindVar);

    boolean isCommonFinalClassConstructor(defpackage.aind aindVar);

    boolean isDefinitelyNotNullType(defpackage.aimw aimwVar);

    boolean isDefinitelyNotNullType(defpackage.aimx aimxVar);

    boolean isDenotable(defpackage.aind aindVar);

    boolean isDynamic(defpackage.aimw aimwVar);

    boolean isError(defpackage.aimw aimwVar);

    boolean isFlexible(defpackage.aimw aimwVar);

    boolean isFlexibleWithDifferentTypeConstructors(defpackage.aimw aimwVar);

    boolean isIntegerLiteralType(defpackage.aimx aimxVar);

    boolean isIntegerLiteralTypeConstructor(defpackage.aind aindVar);

    boolean isIntersection(defpackage.aind aindVar);

    boolean isMarkedNullable(defpackage.aimw aimwVar);

    boolean isNotNullTypeParameter(defpackage.aimw aimwVar);

    boolean isNothing(defpackage.aimw aimwVar);

    boolean isNothingConstructor(defpackage.aind aindVar);

    boolean isNullableType(defpackage.aimw aimwVar);

    boolean isOldCapturedType(defpackage.aims aimsVar);

    boolean isPrimitiveType(defpackage.aimy aimyVar);

    boolean isProjectionNotNull(defpackage.aims aimsVar);

    boolean isRawType(defpackage.aimw aimwVar);

    boolean isSingleClassifierType(defpackage.aimx aimxVar);

    boolean isStarProjection(defpackage.aina ainaVar);

    boolean isStubType(defpackage.aimx aimxVar);

    boolean isStubTypeForBuilderInference(defpackage.aimx aimxVar);

    boolean isTypeVariableType(defpackage.aimw aimwVar);

    defpackage.aimx lowerBound(defpackage.aimv aimvVar);

    defpackage.aimx lowerBoundIfFlexible(defpackage.aimw aimwVar);

    defpackage.aimw lowerType(defpackage.aims aimsVar);

    defpackage.aimw makeDefinitelyNotNullOrNotNull(defpackage.aimw aimwVar);

    defpackage.aimw makeDefinitelyNotNullOrNotNull(defpackage.aimw aimwVar, boolean z);

    defpackage.aimy original(defpackage.aimt aimtVar);

    defpackage.aimy originalIfDefinitelyNotNullable(defpackage.aimx aimxVar);

    int parametersCount(defpackage.aind aindVar);

    java.util.Collection<defpackage.aimw> possibleIntegerTypes(defpackage.aimx aimxVar);

    defpackage.aina projection(defpackage.aimr aimrVar);

    defpackage.aimw safeSubstitute(defpackage.ainf ainfVar, defpackage.aimw aimwVar);

    int size(defpackage.aimz aimzVar);

    defpackage.aijb substitutionSupertypePolicy(defpackage.aimx aimxVar);

    java.util.Collection<defpackage.aimw> supertypes(defpackage.aind aindVar);

    defpackage.aimr typeConstructor(defpackage.aims aimsVar);

    defpackage.aind typeConstructor(defpackage.aimw aimwVar);

    defpackage.aind typeConstructor(defpackage.aimx aimxVar);

    defpackage.aimx upperBound(defpackage.aimv aimvVar);

    defpackage.aimx upperBoundIfFlexible(defpackage.aimw aimwVar);

    defpackage.aimw withNullability(defpackage.aimw aimwVar, boolean z);

    defpackage.aimx withNullability(defpackage.aimx aimxVar, boolean z);
}
