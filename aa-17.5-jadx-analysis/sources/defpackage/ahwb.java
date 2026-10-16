package defpackage;

import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class ahwb {
    private static final boolean isDontMangleClass(agba agbaVar) {
        return affa.f(ahvz.getFqNameSafe(agbaVar), afyo.RESULT_FQ_NAME);
    }

    private static final boolean isTypeParameterWithUpperBoundThatRequiresMangling(aigl aiglVar, boolean z) {
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        agee ageeVar = declarationDescriptor instanceof agee ? (agee) declarationDescriptor : null;
        if (ageeVar == null) {
            return false;
        }
        return (z || !ahsw.isMultiFieldValueClass(ageeVar)) && requiresFunctionNameManglingInParameterTypes(aimr.getRepresentativeUpperBound(ageeVar));
    }

    public static final boolean isValueClassThatRequiresMangling(aigl aiglVar) {
        aiglVar.getClass();
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor != null) {
            return (ahsw.isInlineClass(declarationDescriptor) && isValueClassThatRequiresMangling(declarationDescriptor)) || ahsw.needsMfvcFlattening(aiglVar);
        }
        return false;
    }

    private static final boolean requiresFunctionNameManglingInParameterTypes(aigl aiglVar) {
        return isValueClassThatRequiresMangling(aiglVar) || isTypeParameterWithUpperBoundThatRequiresMangling(aiglVar, true);
    }

    public static final boolean shouldHideConstructorDueToValueClassTypeValueParameters(agax agaxVar) {
        agaxVar.getClass();
        agaz agazVar = agaxVar instanceof agaz ? (agaz) agaxVar : null;
        if (agazVar == null || agcb.isPrivate(agazVar.getVisibility())) {
            return false;
        }
        agba constructedClass = agazVar.getConstructedClass();
        constructedClass.getClass();
        if (ahsw.isValueClass(constructedClass) || ahst.isSealedClass(agazVar.getConstructedClass())) {
            return false;
        }
        List<agel> valueParameters = agazVar.getValueParameters();
        valueParameters.getClass();
        if (valueParameters.isEmpty()) {
            return false;
        }
        Iterator<T> it = valueParameters.iterator();
        while (it.hasNext()) {
            aigl type = ((agel) it.next()).getType();
            type.getClass();
            if (requiresFunctionNameManglingInParameterTypes(type)) {
                return true;
            }
        }
        return false;
    }

    public static final boolean isValueClassThatRequiresMangling(agbi agbiVar) {
        agbiVar.getClass();
        return ahsw.isValueClass(agbiVar) && !isDontMangleClass((agba) agbiVar);
    }
}
