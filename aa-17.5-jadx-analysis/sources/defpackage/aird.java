package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class aird implements aimg {
    public static final aird INSTANCE = new aird();

    private aird() {
    }

    private final aimm convertVariance(afie afieVar) {
        int iOrdinal = afieVar.ordinal();
        if (iOrdinal == 0) {
            return aimm.INV;
        }
        if (iOrdinal == 1) {
            return aimm.IN;
        }
        if (iOrdinal == 2) {
            return aimm.OUT;
        }
        throw new aezs();
    }

    private final Void shouldNotBeCalled(Object obj) {
        throw new aftw(a.bm(obj, "This method should not be called on ", " with a new kotlin-reflect implementation. Please file an issue at https://kotl.in/issue"));
    }

    @Override // defpackage.aimg
    public boolean areEqualTypeConstructors(aimd aimdVar, aimd aimdVar2) {
        aimdVar.getClass();
        aimdVar2.getClass();
        return affa.f(aimdVar, aimdVar2);
    }

    @Override // defpackage.aimg
    public int argumentsCount(ailw ailwVar) {
        ailwVar.getClass();
        return ((afib) ailwVar).getArguments().size();
    }

    @Override // defpackage.aimg
    public ailz asArgumentList(ailx ailxVar) {
        ailxVar.getClass();
        return (ailz) ailxVar;
    }

    @Override // defpackage.aimg
    public ails asCapturedType(aily ailyVar) {
        ailyVar.getClass();
        if (ailyVar instanceof ails) {
            return (ails) ailyVar;
        }
        return null;
    }

    @Override // defpackage.aimg
    public /* bridge */ ails asCapturedTypeUnwrappingDnn(ailx ailxVar) {
        return default$asCapturedTypeUnwrappingDnn(ailxVar);
    }

    @Override // defpackage.aimg
    public ailt asDefinitelyNotNullType(ailx ailxVar) {
        ailxVar.getClass();
        if ((ailxVar instanceof aiqc) && ((aiqc) ailxVar).isDefinitelyNotNullType()) {
            return (ailt) ailxVar;
        }
        return null;
    }

    @Override // defpackage.aimg
    public ailu asDynamicType(ailv ailvVar) {
        ailvVar.getClass();
        shouldNotBeCalled(ailvVar);
        throw new aezp();
    }

    @Override // defpackage.aimg
    public ailv asFlexibleType(ailw ailwVar) {
        ailwVar.getClass();
        if (!(ailwVar instanceof aiqc) || ((aiqc) ailwVar).lowerBoundIfFlexible() == null) {
            return null;
        }
        return (ailv) ailwVar;
    }

    @Override // defpackage.aimg
    public ailx asRigidType(ailw ailwVar) {
        ailwVar.getClass();
        if (asFlexibleType(ailwVar) != null) {
            return null;
        }
        return (ailx) ailwVar;
    }

    @Override // defpackage.aimg
    public aima asTypeArgument(ailw ailwVar) {
        ailwVar.getClass();
        shouldNotBeCalled(ailwVar);
        throw new aezp();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [afib, ailx] */
    @Override // defpackage.aimg
    public ailx captureFromArguments(ailx ailxVar, ailq ailqVar) {
        ailxVar.getClass();
        ailqVar.getClass();
        return aiqj.captureKTypeFromArguments((afib) ailxVar);
    }

    @Override // defpackage.aimg
    public ailq captureStatus(ails ailsVar) {
        ailsVar.getClass();
        return ailq.FOR_SUBTYPING;
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

    public boolean default$identicalArguments(ailx ailxVar, ailx ailxVar2) {
        ailxVar.getClass();
        ailxVar2.getClass();
        return false;
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
        isIntegerLiteralTypeConstructor(typeConstructor(ailxVar));
        return false;
    }

    public boolean default$isNotNullTypeParameter(ailw ailwVar) {
        ailwVar.getClass();
        return false;
    }

    public boolean default$isNothing(ailw ailwVar) {
        ailwVar.getClass();
        return isNothingConstructor(typeConstructor(ailwVar)) && !isNullableType(ailwVar);
    }

    public ailx default$lowerBoundIfFlexible(ailw ailwVar) {
        ailwVar.getClass();
        ailv ailvVarAsFlexibleType = asFlexibleType(ailwVar);
        if (ailvVarAsFlexibleType != null) {
            return lowerBound(ailvVarAsFlexibleType);
        }
        ailx ailxVarAsRigidType = asRigidType(ailwVar);
        ailxVarAsRigidType.getClass();
        return ailxVarAsRigidType;
    }

    public ailw default$makeDefinitelyNotNullOrNotNull(ailw ailwVar) {
        ailwVar.getClass();
        return makeDefinitelyNotNullOrNotNull(ailwVar, false);
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
        ailwVar.getClass();
        ailv ailvVarAsFlexibleType = asFlexibleType(ailwVar);
        if (ailvVarAsFlexibleType != null) {
            return upperBound(ailvVarAsFlexibleType);
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
    public aima getArgument(ailw ailwVar, int i) {
        ailwVar.getClass();
        return new aiqs(((afib) ailwVar).getArguments().get(i));
    }

    @Override // defpackage.aimg
    public /* bridge */ aima getArgumentOrNull(ailx ailxVar, int i) {
        return default$getArgumentOrNull(ailxVar, i);
    }

    @Override // defpackage.aimg
    public List<aima> getArguments(ailw ailwVar) {
        ailwVar.getClass();
        shouldNotBeCalled(ailwVar);
        throw new aezp();
    }

    @Override // defpackage.aimg
    public /* bridge */ afeg<ailw, ailw, Boolean> getCustomSubtypingCallback() {
        return null;
    }

    @Override // defpackage.aimg
    public aime getParameter(aimd aimdVar, int i) {
        aimdVar.getClass();
        afic aficVar = aiqj.allTypeParameters((afhe) aimdVar).get(i);
        aficVar.getClass();
        return (afrv) aficVar;
    }

    @Override // defpackage.aimg
    public List<aime> getParameters(aimd aimdVar) {
        aimdVar.getClass();
        shouldNotBeCalled(aimdVar);
        throw new aezp();
    }

    @Override // defpackage.aimg
    public ailw getType(aima aimaVar) {
        aimaVar.getClass();
        return (ailw) ((aiqs) aimaVar).getValue().c;
    }

    @Override // defpackage.aimg
    public aimd getTypeConstructor(aime aimeVar) {
        aimeVar.getClass();
        shouldNotBeCalled(aimeVar);
        throw new aezp();
    }

    @Override // defpackage.aimg
    public aime getTypeParameter(aiml aimlVar) {
        aimlVar.getClass();
        shouldNotBeCalled(aimlVar);
        throw new aezp();
    }

    @Override // defpackage.aimg
    public aime getTypeParameterClassifier(aimd aimdVar) {
        aimdVar.getClass();
        shouldNotBeCalled(aimdVar);
        throw new aezp();
    }

    @Override // defpackage.aimg
    public List<ailw> getUpperBounds(aime aimeVar) {
        aimeVar.getClass();
        shouldNotBeCalled(aimeVar);
        throw new aezp();
    }

    @Override // defpackage.aimg
    public aimm getVariance(aima aimaVar) {
        aimm aimmVarConvertVariance;
        aimaVar.getClass();
        afie afieVar = ((aiqs) aimaVar).getValue().b;
        return (afieVar == null || (aimmVarConvertVariance = convertVariance(afieVar)) == null) ? aimm.OUT : aimmVarConvertVariance;
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean hasFlexibleNullability(ailw ailwVar) {
        return default$hasFlexibleNullability(ailwVar);
    }

    @Override // defpackage.aimg
    public boolean hasRecursiveBounds(aime aimeVar, aimd aimdVar) {
        aimeVar.getClass();
        shouldNotBeCalled(aimeVar);
        throw new aezp();
    }

    @Override // defpackage.aimk
    public /* bridge */ boolean identicalArguments(ailx ailxVar, ailx ailxVar2) {
        default$identicalArguments(ailxVar, ailxVar2);
        return false;
    }

    @Override // defpackage.aimg
    public ailw intersectTypes(Collection<? extends ailw> collection) {
        collection.getClass();
        shouldNotBeCalled(this);
        throw new aezp();
    }

    @Override // defpackage.aimg
    public boolean isAnyConstructor(aimd aimdVar) {
        aimdVar.getClass();
        return affa.f(aimdVar, affw.b(Object.class));
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
    public boolean isClassTypeConstructor(aimd aimdVar) {
        aimdVar.getClass();
        return aimdVar instanceof afhe;
    }

    @Override // defpackage.aimg
    public boolean isCommonFinalClassConstructor(aimd aimdVar) {
        aimdVar.getClass();
        if (!(aimdVar instanceof afqw)) {
            return false;
        }
        afqw afqwVar = (afqw) aimdVar;
        return (!afqwVar.isFinal() || afqwVar.getClassKind$kotlin_reflection() == agmp.ENUM_CLASS || afqwVar.getClassKind$kotlin_reflection() == agmp.ENUM_ENTRY || afqwVar.getClassKind$kotlin_reflection() == agmp.ANNOTATION_CLASS) ? false : true;
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isDefinitelyNotNullType(ailw ailwVar) {
        return default$isDefinitelyNotNullType(ailwVar);
    }

    @Override // defpackage.aimg
    public boolean isDenotable(aimd aimdVar) {
        aimdVar.getClass();
        return !(aimdVar instanceof aiqg);
    }

    @Override // defpackage.aimg
    public boolean isDynamic(ailw ailwVar) {
        ailwVar.getClass();
        return false;
    }

    @Override // defpackage.aimg
    public boolean isError(ailw ailwVar) {
        aigl type;
        ailwVar.getClass();
        if ((ailwVar instanceof aiqc) && (((aiqc) ailwVar).getClassifier() instanceof afmt)) {
            return true;
        }
        aiqp aiqpVar = ailwVar instanceof aiqp ? (aiqp) ailwVar : null;
        return (aiqpVar == null || (type = aiqpVar.getType()) == null || !aigr.isError(type)) ? false : true;
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isFlexible(ailw ailwVar) {
        return default$isFlexible(ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isFlexibleWithDifferentTypeConstructors(ailw ailwVar) {
        return default$isFlexibleWithDifferentTypeConstructors(ailwVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isIntegerLiteralType(ailx ailxVar) {
        default$isIntegerLiteralType(ailxVar);
        return false;
    }

    @Override // defpackage.aimg
    public boolean isIntegerLiteralTypeConstructor(aimd aimdVar) {
        aimdVar.getClass();
        return false;
    }

    @Override // defpackage.aimg
    public boolean isIntersection(aimd aimdVar) {
        aimdVar.getClass();
        return false;
    }

    @Override // defpackage.aimg
    public boolean isMarkedNullable(ailw ailwVar) {
        ailwVar.getClass();
        return ((afib) ailwVar).isMarkedNullable();
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isNotNullTypeParameter(ailw ailwVar) {
        default$isNotNullTypeParameter(ailwVar);
        return false;
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isNothing(ailw ailwVar) {
        return default$isNothing(ailwVar);
    }

    @Override // defpackage.aimg
    public boolean isNothingConstructor(aimd aimdVar) {
        aimdVar.getClass();
        return affa.f(aimdVar, airb.INSTANCE);
    }

    @Override // defpackage.aimg
    public boolean isNullableType(ailw ailwVar) {
        ailwVar.getClass();
        shouldNotBeCalled(ailwVar);
        throw new aezp();
    }

    @Override // defpackage.aimg
    public boolean isOldCapturedType(ails ailsVar) {
        ailsVar.getClass();
        return false;
    }

    @Override // defpackage.aimg
    public boolean isPrimitiveType(aily ailyVar) {
        ailyVar.getClass();
        shouldNotBeCalled(ailyVar);
        throw new aezp();
    }

    @Override // defpackage.aimg
    public boolean isProjectionNotNull(ails ailsVar) {
        ailsVar.getClass();
        return false;
    }

    @Override // defpackage.aimg
    public boolean isRawType(ailw ailwVar) {
        ailwVar.getClass();
        shouldNotBeCalled(ailwVar);
        throw new aezp();
    }

    @Override // defpackage.aimg
    public boolean isSingleClassifierType(ailx ailxVar) {
        ailxVar.getClass();
        shouldNotBeCalled(ailxVar);
        throw new aezp();
    }

    @Override // defpackage.aimg
    public boolean isStarProjection(aima aimaVar) {
        aimaVar.getClass();
        return affa.f(((aiqs) aimaVar).getValue(), afid.a);
    }

    @Override // defpackage.aimg
    public boolean isStubType(ailx ailxVar) {
        ailxVar.getClass();
        return false;
    }

    @Override // defpackage.aimg
    public boolean isStubTypeForBuilderInference(ailx ailxVar) {
        ailxVar.getClass();
        return false;
    }

    @Override // defpackage.aimg
    public boolean isTypeVariableType(ailw ailwVar) {
        ailwVar.getClass();
        shouldNotBeCalled(ailwVar);
        throw new aezp();
    }

    @Override // defpackage.aimg
    public ailx lowerBound(ailv ailvVar) {
        ailvVar.getClass();
        aiqc aiqcVarLowerBoundIfFlexible = ((aiqc) ailvVar).lowerBoundIfFlexible();
        aiqcVarLowerBoundIfFlexible.getClass();
        return aiqcVarLowerBoundIfFlexible;
    }

    @Override // defpackage.aimg
    public /* bridge */ ailx lowerBoundIfFlexible(ailw ailwVar) {
        return default$lowerBoundIfFlexible(ailwVar);
    }

    @Override // defpackage.aimg
    public ailw lowerType(ails ailsVar) {
        ailsVar.getClass();
        return (ailw) ((aiqf) ailsVar).getLowerType();
    }

    @Override // defpackage.aimg
    public ailw makeDefinitelyNotNullOrNotNull(ailw ailwVar, boolean z) {
        ailwVar.getClass();
        shouldNotBeCalled(ailwVar);
        throw new aezp();
    }

    @Override // defpackage.aimg
    public aily original(ailt ailtVar) {
        ailtVar.getClass();
        shouldNotBeCalled(ailtVar);
        throw new aezp();
    }

    @Override // defpackage.aimg
    public /* bridge */ aily originalIfDefinitelyNotNullable(ailx ailxVar) {
        return default$originalIfDefinitelyNotNullable(ailxVar);
    }

    @Override // defpackage.aimg
    public int parametersCount(aimd aimdVar) {
        aimdVar.getClass();
        if (aimdVar instanceof afhe) {
            return aiqj.allTypeParameters((afhe) aimdVar).size();
        }
        return 0;
    }

    @Override // defpackage.aimg
    public Collection<ailw> possibleIntegerTypes(ailx ailxVar) {
        ailxVar.getClass();
        shouldNotBeCalled(ailxVar);
        throw new aezp();
    }

    @Override // defpackage.aimg
    public aima projection(ailr ailrVar) {
        ailrVar.getClass();
        return new aiqs(((aiqg) ailrVar).getProjection());
    }

    @Override // defpackage.aimg
    public ailw safeSubstitute(aimf aimfVar, ailw ailwVar) {
        aimfVar.getClass();
        ailwVar.getClass();
        shouldNotBeCalled(aimfVar);
        throw new aezp();
    }

    @Override // defpackage.aimg
    public /* bridge */ int size(ailz ailzVar) {
        return default$size(ailzVar);
    }

    @Override // defpackage.aimg
    public aiib substitutionSupertypePolicy(ailx ailxVar) {
        ailxVar.getClass();
        return new airc(aiqu.Companion.create((afib) ailxVar));
    }

    @Override // defpackage.aimg
    public Collection<ailw> supertypes(aimd aimdVar) {
        aimdVar.getClass();
        if (aimdVar instanceof afhe) {
            List<afib> supertypes = ((afhe) aimdVar).getSupertypes();
            ArrayList arrayList = new ArrayList(woy.bp(supertypes, 10));
            for (afib afibVar : supertypes) {
                afibVar.getClass();
                arrayList.add((ailw) afibVar);
            }
            return arrayList;
        }
        if (aimdVar instanceof afic) {
            List<afib> upperBounds = ((afic) aimdVar).getUpperBounds();
            ArrayList arrayList2 = new ArrayList(woy.bp(upperBounds, 10));
            for (afib afibVar2 : upperBounds) {
                afibVar2.getClass();
                arrayList2.add((ailw) afibVar2);
            }
            return arrayList2;
        }
        if (!(aimdVar instanceof aiqg)) {
            throw new IllegalStateException("Unsupported type constructor: " + aimdVar + " (" + aimdVar.getClass().getName() + ')');
        }
        List<afib> supertypes2 = ((aiqg) aimdVar).getSupertypes();
        ArrayList arrayList3 = new ArrayList(woy.bp(supertypes2, 10));
        for (afib afibVar3 : supertypes2) {
            afibVar3.getClass();
            arrayList3.add((ailw) afibVar3);
        }
        return arrayList3;
    }

    @Override // defpackage.aimg
    public aimd typeConstructor(ailx ailxVar) {
        Class<?> componentType;
        ailxVar.getClass();
        if (ailxVar instanceof aiqf) {
            return ((aiqf) ailxVar).getTypeConstructor();
        }
        aiqc aiqcVar = (aiqc) ailxVar;
        if (aiqcVar.isNothingType()) {
            return airb.INSTANCE;
        }
        afhf classifier = aiqcVar.getClassifier();
        afqw afqwVar = classifier instanceof afqw ? (afqw) classifier : null;
        if (afqwVar != null && (componentType = affa.h(afqwVar).getComponentType()) != null && !componentType.isPrimitive()) {
            return (aimd) affw.b(Object[].class);
        }
        afhf mutableCollectionClass = aiqcVar.getMutableCollectionClass();
        if (mutableCollectionClass == null) {
            mutableCollectionClass = aiqcVar.getClassifier();
        }
        mutableCollectionClass.getClass();
        return (aimd) mutableCollectionClass;
    }

    @Override // defpackage.aimg
    public ailx upperBound(ailv ailvVar) {
        ailvVar.getClass();
        aiqc aiqcVarUpperBoundIfFlexible = ((aiqc) ailvVar).upperBoundIfFlexible();
        aiqcVarUpperBoundIfFlexible.getClass();
        return aiqcVarUpperBoundIfFlexible;
    }

    @Override // defpackage.aimg
    public /* bridge */ ailx upperBoundIfFlexible(ailw ailwVar) {
        return default$upperBoundIfFlexible(ailwVar);
    }

    @Override // defpackage.aimg
    public ailw withNullability(ailw ailwVar, boolean z) {
        ailwVar.getClass();
        shouldNotBeCalled(ailwVar);
        throw new aezp();
    }

    @Override // defpackage.aimg
    public /* bridge */ boolean isDefinitelyNotNullType(ailx ailxVar) {
        return default$isDefinitelyNotNullType(ailxVar);
    }

    @Override // defpackage.aimg
    public /* bridge */ ailw makeDefinitelyNotNullOrNotNull(ailw ailwVar) {
        return default$makeDefinitelyNotNullOrNotNull(ailwVar);
    }

    @Override // defpackage.aimg
    public ailx withNullability(ailx ailxVar, boolean z) {
        ailxVar.getClass();
        return ((aiqc) ailxVar).makeNullableAsSpecified(z);
    }

    public boolean default$isDefinitelyNotNullType(ailx ailxVar) {
        ailxVar.getClass();
        return asDefinitelyNotNullType(ailxVar) != null;
    }

    @Override // defpackage.aimg
    public aimm getVariance(aime aimeVar) {
        aimeVar.getClass();
        return convertVariance(((afic) aimeVar).getVariance());
    }

    @Override // defpackage.aimg
    public /* bridge */ aimd typeConstructor(ailw ailwVar) {
        return default$typeConstructor(ailwVar);
    }

    @Override // defpackage.aimg
    public ailr typeConstructor(ails ailsVar) {
        ailsVar.getClass();
        return ((aiqf) ailsVar).getTypeConstructor();
    }
}
