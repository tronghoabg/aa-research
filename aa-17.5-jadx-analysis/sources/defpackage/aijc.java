package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aijc {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final aigw DONT_CARE = ailm.createErrorType(aill.DONT_CARE, new String[0]);
    public static final aigw CANNOT_INFER_FUNCTION_PARAM_TYPE = ailm.createErrorType(aill.UNINFERRED_LAMBDA_PARAMETER_TYPE, new String[0]);
    public static final aigw NO_EXPECTED_TYPE = new aijb("NO_EXPECTED_TYPE");
    public static final aigw UNIT_EXPECTED_TYPE = new aijb("UNIT_EXPECTED_TYPE");

    /* JADX WARN: Removed duplicated region for block: B:17:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0120  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void $$$reportNull$$$0(int r24) {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aijc.$$$reportNull$$$0(int):void");
    }

    public static boolean acceptsNullable(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(28);
        }
        if (aiglVar.isMarkedNullable()) {
            return true;
        }
        return aige.isFlexible(aiglVar) && acceptsNullable(aige.asFlexibleType(aiglVar).getUpperBound());
    }

    private static boolean contains(aigl aiglVar, afec<aijf, Boolean> afecVar, aipv<aigl> aipvVar) {
        if (afecVar == null) {
            $$$reportNull$$$0(44);
        }
        if (aiglVar == null) {
            return false;
        }
        aijf aijfVarUnwrap = aiglVar.unwrap();
        if (noExpectedType(aiglVar)) {
            return afecVar.invoke(aijfVarUnwrap).booleanValue();
        }
        if (aipvVar != null && aipvVar.contains(aiglVar)) {
            return false;
        }
        if (afecVar.invoke(aijfVarUnwrap).booleanValue()) {
            return true;
        }
        if (aipvVar == null) {
            aipvVar = aipv.create();
        }
        aipvVar.add(aiglVar);
        aiga aigaVar = aijfVarUnwrap instanceof aiga ? (aiga) aijfVarUnwrap : null;
        if (aigaVar != null && (contains(aigaVar.getLowerBound(), afecVar, aipvVar) || contains(aigaVar.getUpperBound(), afecVar, aipvVar))) {
            return true;
        }
        if ((aijfVarUnwrap instanceof aifo) && contains(((aifo) aijfVarUnwrap).getOriginal(), afecVar, aipvVar)) {
            return true;
        }
        aiid constructor = aiglVar.getConstructor();
        if (constructor instanceof aigk) {
            Iterator<aigl> it = ((aigk) constructor).mo89getSupertypes().iterator();
            while (it.hasNext()) {
                if (contains(it.next(), afecVar, aipvVar)) {
                    return true;
                }
            }
            return false;
        }
        for (aiin aiinVar : aiglVar.getArguments()) {
            if (!aiinVar.isStarProjection()) {
                if (contains(aiinVar.getType(), afecVar, aipvVar)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static aigl createSubstitutedSupertype(aigl aiglVar, aigl aiglVar2, aiiy aiiyVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(20);
        }
        if (aiglVar2 == null) {
            $$$reportNull$$$0(21);
        }
        if (aiiyVar == null) {
            $$$reportNull$$$0(22);
        }
        aigl aiglVarSubstitute = aiiyVar.substitute(aiglVar2, aijg.INVARIANT);
        if (aiglVarSubstitute != null) {
            return makeNullableIfNeeded(aiglVarSubstitute, aiglVar.isMarkedNullable());
        }
        return null;
    }

    public static agba getClassDescriptor(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(30);
        }
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor instanceof agba) {
            return (agba) declarationDescriptor;
        }
        return null;
    }

    public static List<aiin> getDefaultTypeProjections(List<agee> list) {
        if (list == null) {
            $$$reportNull$$$0(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<agee> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new aiip(it.next().getDefaultType()));
        }
        return woy.cf(arrayList);
    }

    public static List<aigl> getImmediateSupertypes(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(18);
        }
        aiiy aiiyVarCreate = aiiy.create(aiglVar);
        Collection<aigl> collectionMo89getSupertypes = aiglVar.getConstructor().mo89getSupertypes();
        ArrayList arrayList = new ArrayList(collectionMo89getSupertypes.size());
        Iterator<aigl> it = collectionMo89getSupertypes.iterator();
        while (it.hasNext()) {
            aigl aiglVarCreateSubstitutedSupertype = createSubstitutedSupertype(aiglVar, it.next(), aiiyVarCreate);
            if (aiglVarCreateSubstitutedSupertype != null) {
                arrayList.add(aiglVarCreateSubstitutedSupertype);
            }
        }
        return arrayList;
    }

    public static agee getTypeParameterDescriptorOrNull(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(63);
        }
        if (aiglVar.getConstructor().getDeclarationDescriptor() instanceof agee) {
            return (agee) aiglVar.getConstructor().getDeclarationDescriptor();
        }
        return null;
    }

    public static boolean hasNullableSuperType(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(29);
        }
        if (aiglVar.getConstructor().getDeclarationDescriptor() instanceof agba) {
            return false;
        }
        Iterator<aigl> it = getImmediateSupertypes(aiglVar).iterator();
        while (it.hasNext()) {
            if (isNullableType(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean isDontCarePlaceholder(aigl aiglVar) {
        return aiglVar != null && aiglVar.getConstructor() == DONT_CARE.getConstructor();
    }

    public static boolean isNullableType(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(27);
        }
        if (aiglVar.isMarkedNullable()) {
            return true;
        }
        if (aige.isFlexible(aiglVar) && isNullableType(aige.asFlexibleType(aiglVar).getUpperBound())) {
            return true;
        }
        if (aiha.isDefinitelyNotNullType(aiglVar)) {
            return false;
        }
        if (isTypeParameter(aiglVar)) {
            return hasNullableSuperType(aiglVar);
        }
        if (aiglVar instanceof aieo) {
            agee originalTypeParameter = ((aieo) aiglVar).getOriginalTypeVariable().getOriginalTypeParameter();
            return originalTypeParameter == null || hasNullableSuperType(originalTypeParameter.getDefaultType());
        }
        aiid constructor = aiglVar.getConstructor();
        if (constructor instanceof aigk) {
            Iterator<aigl> it = constructor.mo89getSupertypes().iterator();
            while (it.hasNext()) {
                if (isNullableType(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isTypeParameter(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(60);
        }
        return getTypeParameterDescriptorOrNull(aiglVar) != null || (aiglVar.getConstructor() instanceof aikg);
    }

    public static aigl makeNotNullable(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(2);
        }
        return makeNullableAsSpecified(aiglVar, false);
    }

    public static aigl makeNullable(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(1);
        }
        return makeNullableAsSpecified(aiglVar, true);
    }

    public static aigl makeNullableAsSpecified(aigl aiglVar, boolean z) {
        if (aiglVar == null) {
            $$$reportNull$$$0(3);
        }
        aijf aijfVarMakeNullableAsSpecified = aiglVar.unwrap().makeNullableAsSpecified(z);
        if (aijfVarMakeNullableAsSpecified == null) {
            $$$reportNull$$$0(4);
        }
        return aijfVarMakeNullableAsSpecified;
    }

    public static aigw makeNullableIfNeeded(aigw aigwVar, boolean z) {
        if (aigwVar == null) {
            $$$reportNull$$$0(5);
        }
        if (!z) {
            if (aigwVar == null) {
                $$$reportNull$$$0(7);
            }
            return aigwVar;
        }
        aigw aigwVarMakeNullableAsSpecified = aigwVar.makeNullableAsSpecified(true);
        if (aigwVarMakeNullableAsSpecified == null) {
            $$$reportNull$$$0(6);
        }
        return aigwVarMakeNullableAsSpecified;
    }

    public static aiin makeStarProjection(agee ageeVar, aify aifyVar) {
        if (ageeVar == null) {
            $$$reportNull$$$0(46);
        }
        return aifyVar.getHowThisTypeIsUsed() == aija.SUPERTYPE ? new aiip(aihf.starProjectionType(ageeVar)) : new aihd(ageeVar);
    }

    public static aigw makeUnsubstitutedType(aiid aiidVar, ahxe ahxeVar, afec<aiju, aigw> afecVar) {
        if (aiidVar == null) {
            $$$reportNull$$$0(12);
        }
        if (ahxeVar == null) {
            $$$reportNull$$$0(13);
        }
        if (afecVar == null) {
            $$$reportNull$$$0(14);
        }
        return aigq.simpleTypeWithNonTrivialMemberScope(aihr.Companion.getEmpty(), aiidVar, getDefaultTypeProjections(aiidVar.getParameters()), false, ahxeVar, afecVar);
    }

    public static boolean noExpectedType(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(0);
        }
        return aiglVar == NO_EXPECTED_TYPE || aiglVar == UNIT_EXPECTED_TYPE;
    }

    public static aigl makeNullableIfNeeded(aigl aiglVar, boolean z) {
        if (aiglVar == null) {
            $$$reportNull$$$0(8);
        }
        if (z) {
            return makeNullable(aiglVar);
        }
        if (aiglVar == null) {
            $$$reportNull$$$0(9);
        }
        return aiglVar;
    }

    public static aiin makeStarProjection(agee ageeVar) {
        if (ageeVar == null) {
            $$$reportNull$$$0(45);
        }
        return new aihd(ageeVar);
    }

    public static aigw makeUnsubstitutedType(agbd agbdVar, ahxe ahxeVar, afec<aiju, aigw> afecVar) {
        if (ailm.isError(agbdVar)) {
            return ailm.createErrorType(aill.UNABLE_TO_SUBSTITUTE_TYPE, agbdVar.toString());
        }
        return makeUnsubstitutedType(agbdVar.getTypeConstructor(), ahxeVar, afecVar);
    }

    public static boolean contains(aigl aiglVar, afec<aijf, Boolean> afecVar) {
        if (afecVar == null) {
            $$$reportNull$$$0(43);
        }
        return contains(aiglVar, afecVar, null);
    }
}
