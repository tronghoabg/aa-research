package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aifz {
    private static final aime asTypeParameter(aiiz aiizVar, ailw ailwVar) {
        return aiizVar.getTypeParameterClassifier(aiizVar.typeConstructor(ailwVar));
    }

    private static final aime asTypeParameterOrArrayThereof(aiiz aiizVar, ailw ailwVar) {
        ailw type;
        aime aimeVarAsTypeParameter = asTypeParameter(aiizVar, ailwVar);
        if (aimeVarAsTypeParameter != null) {
            return aimeVarAsTypeParameter;
        }
        if (aiizVar.isArrayOrNullableArray(ailwVar) && (type = aiizVar.getType((aima) woy.bN(aiizVar.getArguments(ailwVar)))) != null) {
            return asTypeParameterOrArrayThereof(aiizVar, type);
        }
        return null;
    }

    public static final ailw computeExpandedTypeForInlineClass(aiiz aiizVar, ailw ailwVar) {
        aiizVar.getClass();
        ailwVar.getClass();
        return computeExpandedTypeInner(aiizVar, ailwVar, new HashSet());
    }

    private static final ailw computeExpandedTypeInner(aiiz aiizVar, ailw ailwVar, HashSet<aimd> hashSet) {
        ailw ailwVarComputeExpandedTypeInner;
        aimd aimdVarTypeConstructor = aiizVar.typeConstructor(ailwVar);
        if (!hashSet.add(aimdVarTypeConstructor)) {
            return null;
        }
        aime typeParameterClassifier = aiizVar.getTypeParameterClassifier(aimdVarTypeConstructor);
        if (typeParameterClassifier != null) {
            ailw representativeUpperBound = aiizVar.getRepresentativeUpperBound(typeParameterClassifier);
            ailw ailwVarComputeExpandedTypeInner2 = computeExpandedTypeInner(aiizVar, representativeUpperBound, hashSet);
            if (ailwVarComputeExpandedTypeInner2 == null) {
                return null;
            }
            boolean z = true;
            if (!aiizVar.isInlineClass(aiizVar.typeConstructor(representativeUpperBound)) && (!(representativeUpperBound instanceof aily) || !aiizVar.isPrimitiveType((aily) representativeUpperBound))) {
                z = false;
            }
            return ((ailwVarComputeExpandedTypeInner2 instanceof aily) && aiizVar.isPrimitiveType((aily) ailwVarComputeExpandedTypeInner2) && aiizVar.isNullableType(ailwVar) && z) ? aiizVar.makeNullable(representativeUpperBound) : (aiizVar.isNullableType(ailwVarComputeExpandedTypeInner2) || !aiizVar.isMarkedNullable(ailwVar)) ? ailwVarComputeExpandedTypeInner2 : aiizVar.makeNullable(ailwVarComputeExpandedTypeInner2);
        }
        if (aiizVar.isInlineClass(aimdVarTypeConstructor)) {
            ailw substitutedUnderlyingType = getSubstitutedUnderlyingType(aiizVar, ailwVar);
            if (substitutedUnderlyingType == null || (ailwVarComputeExpandedTypeInner = computeExpandedTypeInner(aiizVar, substitutedUnderlyingType, hashSet)) == null) {
                return null;
            }
            if (!aiizVar.isNullableType(ailwVar)) {
                return ailwVarComputeExpandedTypeInner;
            }
            if (!aiizVar.isNullableType(ailwVarComputeExpandedTypeInner) && (!(ailwVarComputeExpandedTypeInner instanceof aily) || !aiizVar.isPrimitiveType((aily) ailwVarComputeExpandedTypeInner))) {
                return aiizVar.makeNullable(ailwVarComputeExpandedTypeInner);
            }
        }
        return ailwVar;
    }

    private static final ailw getSubstitutedUnderlyingType(aiiz aiizVar, ailw ailwVar) {
        List<aime> parameters = aiizVar.getParameters(aiizVar.typeConstructor(ailwVar));
        List<aima> arguments = aiizVar.getArguments(ailwVar);
        ArrayList arrayList = new ArrayList(woy.bp(arguments, 10));
        int i = 0;
        for (Object obj : arguments) {
            int i2 = i + 1;
            if (i < 0) {
                woy.bo();
            }
            ailw type = aiizVar.getType((aima) obj);
            if (type == null) {
                type = aiizVar.getRepresentativeUpperBound(parameters.get(i));
            }
            arrayList.add(type);
            i = i2;
        }
        ArrayList arrayList2 = new ArrayList(woy.bp(parameters, 10));
        Iterator<T> it = parameters.iterator();
        while (it.hasNext()) {
            arrayList2.add(aiizVar.getTypeConstructor((aime) it.next()));
        }
        aimf aimfVarTypeSubstitutorForUnderlyingType = aiizVar.typeSubstitutorForUnderlyingType(woy.bc(woy.ci(arrayList2, arrayList)));
        ailw unsubstitutedUnderlyingType = aiizVar.getUnsubstitutedUnderlyingType(ailwVar);
        if (unsubstitutedUnderlyingType == null) {
            return null;
        }
        aime aimeVarAsTypeParameterOrArrayThereof = asTypeParameterOrArrayThereof(aiizVar, unsubstitutedUnderlyingType);
        return aimeVarAsTypeParameterOrArrayThereof == null ? aiizVar.safeSubstitute(aimfVarTypeSubstitutorForUnderlyingType, unsubstitutedUnderlyingType) : substituteUpperBound(aiizVar, unsubstitutedUnderlyingType, aiizVar.safeSubstitute(aimfVarTypeSubstitutorForUnderlyingType, aiizVar.getRepresentativeUpperBound(aimeVarAsTypeParameterOrArrayThereof)));
    }

    private static final ailw substituteUpperBound(aiiz aiizVar, ailw ailwVar, ailw ailwVar2) {
        ailw ailwVarNullableAnyType;
        if (asTypeParameter(aiizVar, ailwVar) != null) {
            return aiizVar.isNullableType(ailwVar) ? aiizVar.makeNullable(ailwVar2) : ailwVar2;
        }
        aima aimaVar = (aima) woy.bN(aiizVar.getArguments(ailwVar));
        aimm variance = aiizVar.getVariance(aimaVar);
        aimm aimmVar = aimm.IN;
        if (variance.ordinal() != 0) {
            ailw type = aiizVar.getType(aimaVar);
            type.getClass();
            ailwVarNullableAnyType = substituteUpperBound(aiizVar, type, ailwVar2);
        } else {
            ailwVarNullableAnyType = aiizVar.nullableAnyType();
        }
        aily ailyVarArrayType = aiizVar.arrayType(ailwVarNullableAnyType);
        return aiizVar.isNullableType(ailwVar) ? aiizVar.makeNullable(ailyVarArrayType) : ailyVarArrayType;
    }
}
