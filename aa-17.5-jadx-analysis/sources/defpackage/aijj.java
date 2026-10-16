package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class aijj {
    public static boolean areEqualTypeConstructors(aijl aijlVar, aimd aimdVar, aimd aimdVar2) {
        aimdVar.getClass();
        aimdVar2.getClass();
        if (!(aimdVar instanceof aiid)) {
            throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimdVar + ", " + affw.b(aimdVar.getClass()));
        }
        if (aimdVar2 instanceof aiid) {
            return affa.f(aimdVar, aimdVar2);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimdVar2 + ", " + affw.b(aimdVar2.getClass()));
    }

    public static int argumentsCount(aijl aijlVar, ailw ailwVar) {
        ailwVar.getClass();
        if (ailwVar instanceof aigl) {
            return ((aigl) ailwVar).getArguments().size();
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailwVar + ", " + affw.b(ailwVar.getClass()));
    }

    public static aily arrayType(aijl aijlVar, ailw ailwVar) {
        ailwVar.getClass();
        if (ailwVar instanceof aigl) {
            aigw arrayType = aijlVar.getBuiltIns().getArrayType(aijg.INVARIANT, (aigl) ailwVar);
            arrayType.getClass();
            return arrayType;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aijlVar + ", " + affw.b(aijlVar.getClass()));
    }

    public static ailz asArgumentList(aijl aijlVar, ailx ailxVar) {
        ailxVar.getClass();
        if (ailxVar instanceof aigw) {
            return (ailz) ailxVar;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailxVar + ", " + affw.b(ailxVar.getClass()));
    }

    public static ails asCapturedType(aijl aijlVar, aily ailyVar) {
        ailyVar.getClass();
        if (ailyVar instanceof aigw) {
            if (ailyVar instanceof aigz) {
                return aijlVar.asCapturedType(((aigz) ailyVar).getOrigin());
            }
            if (ailyVar instanceof aijw) {
                return (aijw) ailyVar;
            }
            return null;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailyVar + ", " + affw.b(ailyVar.getClass()));
    }

    public static ailt asDefinitelyNotNullType(aijl aijlVar, ailx ailxVar) {
        ailxVar.getClass();
        if (ailxVar instanceof aigw) {
            if (ailxVar instanceof aifo) {
                return (aifo) ailxVar;
            }
            return null;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailxVar + ", " + affw.b(ailxVar.getClass()));
    }

    public static ailu asDynamicType(aijl aijlVar, ailv ailvVar) {
        ailvVar.getClass();
        if (ailvVar instanceof aiga) {
            if (ailvVar instanceof aifv) {
                return (aifv) ailvVar;
            }
            return null;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailvVar + ", " + affw.b(ailvVar.getClass()));
    }

    public static ailv asFlexibleType(aijl aijlVar, ailw ailwVar) {
        ailwVar.getClass();
        if (ailwVar instanceof aigl) {
            aijf aijfVarUnwrap = ((aigl) ailwVar).unwrap();
            if (aijfVarUnwrap instanceof aiga) {
                return (aiga) aijfVarUnwrap;
            }
            return null;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailwVar + ", " + affw.b(ailwVar.getClass()));
    }

    public static aily asRigidType(aijl aijlVar, ailw ailwVar) {
        ailwVar.getClass();
        if (ailwVar instanceof aigl) {
            aijf aijfVarUnwrap = ((aigl) ailwVar).unwrap();
            if (aijfVarUnwrap instanceof aigw) {
                return (aigw) aijfVarUnwrap;
            }
            return null;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailwVar + ", " + affw.b(ailwVar.getClass()));
    }

    public static aima asTypeArgument(aijl aijlVar, ailw ailwVar) {
        ailwVar.getClass();
        if (ailwVar instanceof aigl) {
            return aimr.asTypeProjection((aigl) ailwVar);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailwVar + ", " + affw.b(ailwVar.getClass()));
    }

    public static aigw captureFromArguments(aijl aijlVar, ailx ailxVar, ailq ailqVar) {
        ailxVar.getClass();
        ailqVar.getClass();
        if (ailxVar instanceof aigw) {
            return aikc.captureFromArguments((aigw) ailxVar, ailqVar);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailxVar + ", " + affw.b(ailxVar.getClass()));
    }

    public static ailq captureStatus(aijl aijlVar, ails ailsVar) {
        ailsVar.getClass();
        if (ailsVar instanceof aijw) {
            return ((aijw) ailsVar).getCaptureStatus();
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailsVar + ", " + affw.b(ailsVar.getClass()));
    }

    public static ailw createFlexibleType(aijl aijlVar, ailx ailxVar, ailx ailxVar2) {
        ailxVar.getClass();
        ailxVar2.getClass();
        if (!(ailxVar instanceof aigw)) {
            throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aijlVar + ", " + affw.b(aijlVar.getClass()));
        }
        if (ailxVar2 instanceof aigw) {
            return aigq.flexibleType((aigw) ailxVar, (aigw) ailxVar2);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aijlVar + ", " + affw.b(aijlVar.getClass()));
    }

    public static aima getArgument(aijl aijlVar, ailw ailwVar, int i) {
        ailwVar.getClass();
        if (ailwVar instanceof aigl) {
            return ((aigl) ailwVar).getArguments().get(i);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailwVar + ", " + affw.b(ailwVar.getClass()));
    }

    public static List<aima> getArguments(aijl aijlVar, ailw ailwVar) {
        ailwVar.getClass();
        if (ailwVar instanceof aigl) {
            return ((aigl) ailwVar).getArguments();
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailwVar + ", " + affw.b(ailwVar.getClass()));
    }

    public static afye getBuiltIns(aijl aijlVar) {
        throw new UnsupportedOperationException("Not supported");
    }

    public static ahnh getClassFqNameUnsafe(aijl aijlVar, aimd aimdVar) {
        aimdVar.getClass();
        if (aimdVar instanceof aiid) {
            agbd declarationDescriptor = ((aiid) aimdVar).getDeclarationDescriptor();
            declarationDescriptor.getClass();
            return ahvz.getFqNameUnsafe((agba) declarationDescriptor);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimdVar + ", " + affw.b(aimdVar.getClass()));
    }

    public static aime getParameter(aijl aijlVar, aimd aimdVar, int i) {
        aimdVar.getClass();
        if (aimdVar instanceof aiid) {
            agee ageeVar = ((aiid) aimdVar).getParameters().get(i);
            ageeVar.getClass();
            return ageeVar;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimdVar + ", " + affw.b(aimdVar.getClass()));
    }

    public static List<aime> getParameters(aijl aijlVar, aimd aimdVar) {
        aimdVar.getClass();
        if (aimdVar instanceof aiid) {
            List<agee> parameters = ((aiid) aimdVar).getParameters();
            parameters.getClass();
            return parameters;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimdVar + ", " + affw.b(aimdVar.getClass()));
    }

    public static afyi getPrimitiveArrayType(aijl aijlVar, aimd aimdVar) {
        aimdVar.getClass();
        if (aimdVar instanceof aiid) {
            agbd declarationDescriptor = ((aiid) aimdVar).getDeclarationDescriptor();
            declarationDescriptor.getClass();
            return afye.getPrimitiveArrayType((agba) declarationDescriptor);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimdVar + ", " + affw.b(aimdVar.getClass()));
    }

    public static afyi getPrimitiveType(aijl aijlVar, aimd aimdVar) {
        aimdVar.getClass();
        if (aimdVar instanceof aiid) {
            agbd declarationDescriptor = ((aiid) aimdVar).getDeclarationDescriptor();
            declarationDescriptor.getClass();
            return afye.getPrimitiveType((agba) declarationDescriptor);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimdVar + ", " + affw.b(aimdVar.getClass()));
    }

    public static ailw getRepresentativeUpperBound(aijl aijlVar, aime aimeVar) {
        aimeVar.getClass();
        if (aimeVar instanceof agee) {
            return aimr.getRepresentativeUpperBound((agee) aimeVar);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimeVar + ", " + affw.b(aimeVar.getClass()));
    }

    public static ailw getType(aijl aijlVar, aima aimaVar) {
        aimaVar.getClass();
        if (aijlVar.isStarProjection(aimaVar)) {
            return null;
        }
        if (aimaVar instanceof aiin) {
            return ((aiin) aimaVar).getType().unwrap();
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimaVar + ", " + affw.b(aimaVar.getClass()));
    }

    public static aimd getTypeConstructor(aijl aijlVar, aime aimeVar) {
        aimeVar.getClass();
        if (aimeVar instanceof agee) {
            aiid typeConstructor = ((agee) aimeVar).getTypeConstructor();
            typeConstructor.getClass();
            return typeConstructor;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimeVar + ", " + affw.b(aimeVar.getClass()));
    }

    public static aime getTypeParameter(aijl aijlVar, aiml aimlVar) {
        aimlVar.getClass();
        if (aimlVar instanceof aikg) {
            return ((aikg) aimlVar).getOriginalTypeParameter();
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimlVar + ", " + affw.b(aimlVar.getClass()));
    }

    public static aime getTypeParameterClassifier(aijl aijlVar, aimd aimdVar) {
        aimdVar.getClass();
        if (aimdVar instanceof aiid) {
            agbd declarationDescriptor = ((aiid) aimdVar).getDeclarationDescriptor();
            if (declarationDescriptor instanceof agee) {
                return (agee) declarationDescriptor;
            }
            return null;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimdVar + ", " + affw.b(aimdVar.getClass()));
    }

    public static ailw getUnsubstitutedUnderlyingType(aijl aijlVar, ailw ailwVar) {
        ailwVar.getClass();
        if (ailwVar instanceof aigl) {
            return ahsw.unsubstitutedUnderlyingType((aigl) ailwVar);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailwVar + ", " + affw.b(ailwVar.getClass()));
    }

    public static List<ailw> getUpperBounds(aijl aijlVar, aime aimeVar) {
        aimeVar.getClass();
        if (aimeVar instanceof agee) {
            List<aigl> upperBounds = ((agee) aimeVar).getUpperBounds();
            upperBounds.getClass();
            return upperBounds;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimeVar + ", " + affw.b(aimeVar.getClass()));
    }

    public static aimm getVariance(aijl aijlVar, aima aimaVar) {
        aimaVar.getClass();
        if (aimaVar instanceof aiin) {
            aijg projectionKind = ((aiin) aimaVar).getProjectionKind();
            projectionKind.getClass();
            return aimi.convertVariance(projectionKind);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimaVar + ", " + affw.b(aimaVar.getClass()));
    }

    public static boolean hasAnnotation(aijl aijlVar, ailw ailwVar, ahnf ahnfVar) {
        ailwVar.getClass();
        ahnfVar.getClass();
        if (ailwVar instanceof aigl) {
            return ((aigl) ailwVar).getAnnotations().hasAnnotation(ahnfVar);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailwVar + ", " + affw.b(ailwVar.getClass()));
    }

    public static boolean hasRecursiveBounds(aijl aijlVar, aime aimeVar, aimd aimdVar) {
        aimeVar.getClass();
        if (!(aimeVar instanceof agee)) {
            throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimeVar + ", " + affw.b(aimeVar.getClass()));
        }
        agee ageeVar = (agee) aimeVar;
        if (aimdVar == null ? true : aimdVar instanceof aiid) {
            return aimr.hasTypeParameterRecursiveBounds$default(ageeVar, (aiid) aimdVar, null, 4, null);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ageeVar + ", " + affw.b(ageeVar.getClass()));
    }

    public static boolean identicalArguments(aijl aijlVar, ailx ailxVar, ailx ailxVar2) {
        ailxVar.getClass();
        ailxVar2.getClass();
        if (!(ailxVar instanceof aigw)) {
            throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailxVar + ", " + affw.b(ailxVar.getClass()));
        }
        if (ailxVar2 instanceof aigw) {
            return ((aigw) ailxVar).getArguments() == ((aigw) ailxVar2).getArguments();
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailxVar2 + ", " + affw.b(ailxVar2.getClass()));
    }

    public static ailw intersectTypes(aijl aijlVar, Collection<? extends ailw> collection) {
        collection.getClass();
        return aijn.intersectTypes(collection);
    }

    public static boolean isAnyConstructor(aijl aijlVar, aimd aimdVar) {
        aimdVar.getClass();
        if (aimdVar instanceof aiid) {
            return afye.isTypeConstructorForGivenClass((aiid) aimdVar, afyn.any);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimdVar + ", " + affw.b(aimdVar.getClass()));
    }

    public static boolean isArrayOrNullableArray(aijl aijlVar, ailw ailwVar) {
        ailwVar.getClass();
        if (ailwVar instanceof aigl) {
            return afye.isArray((aigl) ailwVar);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailwVar + ", " + affw.b(ailwVar.getClass()));
    }

    public static boolean isClassTypeConstructor(aijl aijlVar, aimd aimdVar) {
        aimdVar.getClass();
        if (aimdVar instanceof aiid) {
            return ((aiid) aimdVar).getDeclarationDescriptor() instanceof agba;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimdVar + ", " + affw.b(aimdVar.getClass()));
    }

    public static boolean isCommonFinalClassConstructor(aijl aijlVar, aimd aimdVar) {
        aimdVar.getClass();
        if (aimdVar instanceof aiid) {
            agbd declarationDescriptor = ((aiid) aimdVar).getDeclarationDescriptor();
            agba agbaVar = declarationDescriptor instanceof agba ? (agba) declarationDescriptor : null;
            return (agbaVar == null || !agcr.isFinalClass(agbaVar) || agbaVar.getKind() == agbb.ENUM_ENTRY || agbaVar.getKind() == agbb.ANNOTATION_CLASS) ? false : true;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimdVar + ", " + affw.b(aimdVar.getClass()));
    }

    public static boolean isDenotable(aijl aijlVar, aimd aimdVar) {
        aimdVar.getClass();
        if (aimdVar instanceof aiid) {
            return ((aiid) aimdVar).isDenotable();
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimdVar + ", " + affw.b(aimdVar.getClass()));
    }

    public static boolean isError(aijl aijlVar, ailw ailwVar) {
        ailwVar.getClass();
        if (ailwVar instanceof aigl) {
            return aigr.isError((aigl) ailwVar);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailwVar + ", " + affw.b(ailwVar.getClass()));
    }

    public static boolean isInlineClass(aijl aijlVar, aimd aimdVar) {
        aimdVar.getClass();
        if (aimdVar instanceof aiid) {
            agbd declarationDescriptor = ((aiid) aimdVar).getDeclarationDescriptor();
            agba agbaVar = declarationDescriptor instanceof agba ? (agba) declarationDescriptor : null;
            return (agbaVar != null ? agbaVar.getValueClassRepresentation() : null) instanceof agck;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimdVar + ", " + affw.b(aimdVar.getClass()));
    }

    public static boolean isIntegerLiteralTypeConstructor(aijl aijlVar, aimd aimdVar) {
        aimdVar.getClass();
        if (aimdVar instanceof aiid) {
            return aimdVar instanceof ahuv;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimdVar + ", " + affw.b(aimdVar.getClass()));
    }

    public static boolean isIntersection(aijl aijlVar, aimd aimdVar) {
        aimdVar.getClass();
        if (aimdVar instanceof aiid) {
            return aimdVar instanceof aigk;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimdVar + ", " + affw.b(aimdVar.getClass()));
    }

    public static boolean isK2(aijl aijlVar) {
        return false;
    }

    public static boolean isMarkedNullable(aijl aijlVar, ailw ailwVar) {
        ailwVar.getClass();
        return (ailwVar instanceof aigw) && ((aigw) ailwVar).isMarkedNullable();
    }

    public static boolean isNotNullTypeParameter(aijl aijlVar, ailw ailwVar) {
        ailwVar.getClass();
        return ailwVar instanceof ahat;
    }

    public static boolean isNothingConstructor(aijl aijlVar, aimd aimdVar) {
        aimdVar.getClass();
        if (aimdVar instanceof aiid) {
            return afye.isTypeConstructorForGivenClass((aiid) aimdVar, afyn.nothing);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimdVar + ", " + affw.b(aimdVar.getClass()));
    }

    public static boolean isNullableType(aijl aijlVar, ailw ailwVar) {
        ailwVar.getClass();
        if (ailwVar instanceof aigl) {
            return aijc.isNullableType((aigl) ailwVar);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailwVar + ", " + affw.b(ailwVar.getClass()));
    }

    public static boolean isOldCapturedType(aijl aijlVar, ails ailsVar) {
        ailsVar.getClass();
        return ailsVar instanceof ahtv;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean isPrimitiveType(aijl aijlVar, aily ailyVar) {
        ailyVar.getClass();
        if (ailyVar instanceof aigl) {
            return afye.isPrimitiveType((aigl) ailyVar);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailyVar + ", " + affw.b(ailyVar.getClass()));
    }

    public static boolean isProjectionNotNull(aijl aijlVar, ails ailsVar) {
        ailsVar.getClass();
        if (ailsVar instanceof aijw) {
            return ((aijw) ailsVar).isProjectionNotNull();
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailsVar + ", " + affw.b(ailsVar.getClass()));
    }

    public static boolean isRawType(aijl aijlVar, ailw ailwVar) {
        ailwVar.getClass();
        if (ailwVar instanceof aigl) {
            return ailwVar instanceof agzc;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailwVar + ", " + affw.b(ailwVar.getClass()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean isSingleClassifierType(aijl aijlVar, ailx ailxVar) {
        ailxVar.getClass();
        if (ailxVar instanceof aigw) {
            if (!aigr.isError((aigl) ailxVar)) {
                aigw aigwVar = (aigw) ailxVar;
                if (!(aigwVar.getConstructor().getDeclarationDescriptor() instanceof aged)) {
                    return aigwVar.getConstructor().getDeclarationDescriptor() != null || (ailxVar instanceof ahtv) || (ailxVar instanceof aijw) || (ailxVar instanceof aifo) || (aigwVar.getConstructor() instanceof ahuv) || isSingleClassifierTypeWithEnhancement(aijlVar, (aily) ailxVar);
                }
            }
            return false;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailxVar + ", " + affw.b(ailxVar.getClass()));
    }

    private static boolean isSingleClassifierTypeWithEnhancement(aijl aijlVar, aily ailyVar) {
        return (ailyVar instanceof aigz) && aijlVar.isSingleClassifierType(((aigz) ailyVar).getOrigin());
    }

    public static boolean isStarProjection(aijl aijlVar, aima aimaVar) {
        aimaVar.getClass();
        if (aimaVar instanceof aiin) {
            return ((aiin) aimaVar).isStarProjection();
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimaVar + ", " + affw.b(aimaVar.getClass()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean isStubType(aijl aijlVar, ailx ailxVar) {
        ailxVar.getClass();
        if (ailxVar instanceof aigw) {
            return aimr.isStubType((aigl) ailxVar);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailxVar + ", " + affw.b(ailxVar.getClass()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean isStubTypeForBuilderInference(aijl aijlVar, ailx ailxVar) {
        ailxVar.getClass();
        if (ailxVar instanceof aigw) {
            return aimr.isStubTypeForBuilderInference((aigl) ailxVar);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailxVar + ", " + affw.b(ailxVar.getClass()));
    }

    public static boolean isTypeVariableType(aijl aijlVar, ailw ailwVar) {
        ailwVar.getClass();
        return (ailwVar instanceof aijf) && (((aijf) ailwVar).getConstructor() instanceof aikg);
    }

    public static boolean isUnderKotlinPackage(aijl aijlVar, aimd aimdVar) {
        aimdVar.getClass();
        if (aimdVar instanceof aiid) {
            agbd declarationDescriptor = ((aiid) aimdVar).getDeclarationDescriptor();
            return declarationDescriptor != null && afye.isUnderKotlinPackage(declarationDescriptor);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimdVar + ", " + affw.b(aimdVar.getClass()));
    }

    public static aily lowerBound(aijl aijlVar, ailv ailvVar) {
        ailvVar.getClass();
        if (ailvVar instanceof aiga) {
            return ((aiga) ailvVar).getLowerBound();
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailvVar + ", " + affw.b(ailvVar.getClass()));
    }

    public static ailw lowerType(aijl aijlVar, ails ailsVar) {
        ailsVar.getClass();
        if (ailsVar instanceof aijw) {
            return ((aijw) ailsVar).getLowerType();
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailsVar + ", " + affw.b(ailsVar.getClass()));
    }

    public static ailw makeDefinitelyNotNullOrNotNull(aijl aijlVar, ailw ailwVar, boolean z) {
        ailwVar.getClass();
        if (ailwVar instanceof aijf) {
            return aijm.makeDefinitelyNotNullOrNotNullInternal((aijf) ailwVar);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailwVar + ", " + affw.b(ailwVar.getClass()));
    }

    public static aiic newTypeCheckerState(aijl aijlVar, aimg aimgVar, boolean z, boolean z2, boolean z3) {
        aimgVar.getClass();
        return aiji.createClassicTypeCheckerState$default(z, z2, aimgVar, null, null, 24, null);
    }

    public static aily nullableAnyType(aijl aijlVar) {
        aigw nullableAnyType = aijlVar.getBuiltIns().getNullableAnyType();
        nullableAnyType.getClass();
        return nullableAnyType;
    }

    public static aily original(aijl aijlVar, ailt ailtVar) {
        ailtVar.getClass();
        if (ailtVar instanceof aifo) {
            return ((aifo) ailtVar).getOriginal();
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailtVar + ", " + affw.b(ailtVar.getClass()));
    }

    public static int parametersCount(aijl aijlVar, aimd aimdVar) {
        aimdVar.getClass();
        if (aimdVar instanceof aiid) {
            return ((aiid) aimdVar).getParameters().size();
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimdVar + ", " + affw.b(aimdVar.getClass()));
    }

    public static Collection<ailw> possibleIntegerTypes(aijl aijlVar, ailx ailxVar) {
        ailxVar.getClass();
        aimd aimdVarTypeConstructor = aijlVar.typeConstructor(ailxVar);
        if (aimdVarTypeConstructor instanceof ahuv) {
            return ((ahuv) aimdVarTypeConstructor).getPossibleTypes();
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailxVar + ", " + affw.b(ailxVar.getClass()));
    }

    public static aima projection(aijl aijlVar, ailr ailrVar) {
        ailrVar.getClass();
        if (ailrVar instanceof aikb) {
            return ((aikb) ailrVar).getProjection();
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailrVar + ", " + affw.b(ailrVar.getClass()));
    }

    public static ailw safeSubstitute(aijl aijlVar, aimf aimfVar, ailw ailwVar) {
        aimfVar.getClass();
        ailwVar.getClass();
        if (!(ailwVar instanceof aijf)) {
            throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailwVar + ", " + affw.b(ailwVar.getClass()));
        }
        if (aimfVar instanceof aiiy) {
            aigl aiglVarSafeSubstitute = ((aiiy) aimfVar).safeSubstitute((aigl) ailwVar, aijg.INVARIANT);
            aiglVarSafeSubstitute.getClass();
            return aiglVarSafeSubstitute;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimfVar + ", " + affw.b(aimfVar.getClass()));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static aiib substitutionSupertypePolicy(aijl aijlVar, ailx ailxVar) {
        ailxVar.getClass();
        if (ailxVar instanceof aigw) {
            return new aijk(aijlVar, aiig.Companion.create((aigl) ailxVar).buildSubstitutor());
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailxVar + ", " + affw.b(ailxVar.getClass()));
    }

    public static Collection<ailw> supertypes(aijl aijlVar, aimd aimdVar) {
        aimdVar.getClass();
        if (aimdVar instanceof aiid) {
            Collection<aigl> collectionMo89getSupertypes = ((aiid) aimdVar).mo89getSupertypes();
            collectionMo89getSupertypes.getClass();
            return collectionMo89getSupertypes;
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimdVar + ", " + affw.b(aimdVar.getClass()));
    }

    public static ailr typeConstructor(aijl aijlVar, ails ailsVar) {
        ailsVar.getClass();
        if (ailsVar instanceof aijw) {
            return ((aijw) ailsVar).getConstructor();
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailsVar + ", " + affw.b(ailsVar.getClass()));
    }

    public static aimf typeSubstitutorForUnderlyingType(aijl aijlVar, Map<aimd, ? extends ailw> map) {
        map.getClass();
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<aimd, ? extends ailw> entry : map.entrySet()) {
            aimd key = entry.getKey();
            ailw value = entry.getValue();
            key.getClass();
            value.getClass();
            arrayList.add(new aezu((aiid) key, aimr.asTypeProjection((aigl) value)));
        }
        return aiiy.create((Map<aiid, aiin>) woy.bc(arrayList));
    }

    public static aily upperBound(aijl aijlVar, ailv ailvVar) {
        ailvVar.getClass();
        if (ailvVar instanceof aiga) {
            return ((aiga) ailvVar).getUpperBound();
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailvVar + ", " + affw.b(ailvVar.getClass()));
    }

    public static aily withNullability(aijl aijlVar, ailx ailxVar, boolean z) {
        ailxVar.getClass();
        if (ailxVar instanceof aigw) {
            return ((aigw) ailxVar).makeNullableAsSpecified(z);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailxVar + ", " + affw.b(ailxVar.getClass()));
    }

    public static aimd typeConstructor(aijl aijlVar, ailx ailxVar) {
        ailxVar.getClass();
        if (ailxVar instanceof aigw) {
            return ((aigw) ailxVar).getConstructor();
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + ailxVar + ", " + affw.b(ailxVar.getClass()));
    }

    public static ailw withNullability(aijl aijlVar, ailw ailwVar, boolean z) {
        ailwVar.getClass();
        if (ailwVar instanceof ailx) {
            return aijlVar.withNullability((ailx) ailwVar, z);
        }
        if (ailwVar instanceof ailv) {
            ailv ailvVar = (ailv) ailwVar;
            return aijlVar.createFlexibleType(aijlVar.withNullability((ailx) aijlVar.lowerBound(ailvVar), z), aijlVar.withNullability((ailx) aijlVar.upperBound(ailvVar), z));
        }
        throw new IllegalStateException("sealed");
    }

    public static aimm getVariance(aijl aijlVar, aime aimeVar) {
        aimeVar.getClass();
        if (aimeVar instanceof agee) {
            aijg variance = ((agee) aimeVar).getVariance();
            variance.getClass();
            return aimi.convertVariance(variance);
        }
        throw new IllegalArgumentException("ClassicTypeSystemContext couldn't handle: " + aimeVar + ", " + affw.b(aimeVar.getClass()));
    }
}
