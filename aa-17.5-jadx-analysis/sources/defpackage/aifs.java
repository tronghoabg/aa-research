package defpackage;

import java.util.HashMap;
import java.util.List;

/* loaded from: classes3.dex */
public final class aifs {
    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str = i != 4 ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[i != 4 ? 3 : 2];
        switch (i) {
            case 1:
            case 6:
                objArr[0] = "originalSubstitution";
                break;
            case 2:
            case 7:
                objArr[0] = "newContainingDeclaration";
                break;
            case 3:
            case 8:
                objArr[0] = "result";
                break;
            case 4:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
                break;
            case 5:
            default:
                objArr[0] = "typeParameters";
                break;
        }
        if (i != 4) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/DescriptorSubstitutor";
        } else {
            objArr[1] = "substituteTypeParameters";
        }
        if (i != 4) {
            objArr[2] = "substituteTypeParameters";
        }
        String str2 = String.format(str, objArr);
        if (i == 4) {
            throw new IllegalStateException(str2);
        }
    }

    public static aiiy substituteTypeParameters(List<agee> list, aiit aiitVar, agbi agbiVar, List<agee> list2, boolean[] zArr) {
        if (list == null) {
            $$$reportNull$$$0(5);
        }
        if (aiitVar == null) {
            $$$reportNull$$$0(6);
        }
        if (agbiVar == null) {
            $$$reportNull$$$0(7);
        }
        if (list2 == null) {
            $$$reportNull$$$0(8);
        }
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        int i = 0;
        for (agee ageeVar : list) {
            agiu agiuVarCreateForFurtherModification = agiu.createForFurtherModification(agbiVar, ageeVar.getAnnotations(), ageeVar.isReified(), ageeVar.getVariance(), ageeVar.getName(), i, agdx.NO_SOURCE, ageeVar.getStorageManager());
            map.put(ageeVar.getTypeConstructor(), new aiip(agiuVarCreateForFurtherModification.getDefaultType()));
            map2.put(ageeVar, agiuVarCreateForFurtherModification);
            list2.add(agiuVarCreateForFurtherModification);
            i++;
        }
        aiig aiigVarCreateByConstructorsMap = aiig.createByConstructorsMap(map);
        aiiy aiiyVarCreateChainedSubstitutor = aiiy.createChainedSubstitutor(aiitVar, aiigVarCreateByConstructorsMap);
        aiiy aiiyVarCreateChainedSubstitutor2 = aiiy.createChainedSubstitutor(aiitVar.replaceWithNonApproximating(), aiigVarCreateByConstructorsMap);
        for (agee ageeVar2 : list) {
            agiu agiuVar = (agiu) map2.get(ageeVar2);
            for (aigl aiglVar : ageeVar2.getUpperBounds()) {
                agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
                aigl aiglVarSubstitute = (((declarationDescriptor instanceof agee) && aimr.hasTypeParameterRecursiveBounds((agee) declarationDescriptor)) ? aiiyVarCreateChainedSubstitutor : aiiyVarCreateChainedSubstitutor2).substitute(aiglVar, aijg.OUT_VARIANCE);
                if (aiglVarSubstitute == null) {
                    return null;
                }
                if (aiglVarSubstitute != aiglVar && zArr != null) {
                    zArr[0] = true;
                }
                agiuVar.addUpperBound(aiglVarSubstitute);
            }
            agiuVar.setInitialized();
        }
        return aiiyVarCreateChainedSubstitutor;
    }

    public static aiiy substituteTypeParameters(List<agee> list, aiit aiitVar, agbi agbiVar, List<agee> list2) {
        if (list == null) {
            $$$reportNull$$$0(0);
        }
        if (aiitVar == null) {
            $$$reportNull$$$0(1);
        }
        if (agbiVar == null) {
            $$$reportNull$$$0(2);
        }
        if (list2 == null) {
            $$$reportNull$$$0(3);
        }
        aiiy aiiyVarSubstituteTypeParameters = substituteTypeParameters(list, aiitVar, agbiVar, list2, null);
        if (aiiyVarSubstituteTypeParameters != null) {
            return aiiyVarSubstituteTypeParameters;
        }
        throw new AssertionError("Substitution failed");
    }
}
