package defpackage;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public final class agis {
    private agis() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final aiiy getTypeSubstitutorForUnderlyingClass(aged agedVar) {
        if (agedVar.getClassDescriptor() == null) {
            return null;
        }
        return aiiy.create(agedVar.getExpandedType());
    }

    public final agiq createIfAvailable(aiei aieiVar, aged agedVar, agaz agazVar) {
        agaz agazVarSubstitute;
        List<agdq> arrayList;
        aieiVar.getClass();
        agedVar.getClass();
        agazVar.getClass();
        aiiy typeSubstitutorForUnderlyingClass = getTypeSubstitutorForUnderlyingClass(agedVar);
        if (typeSubstitutorForUnderlyingClass != null && (agazVarSubstitute = agazVar.substitute(typeSubstitutorForUnderlyingClass)) != null) {
            agfk annotations = agazVar.getAnnotations();
            agaw kind = agazVar.getKind();
            kind.getClass();
            agdx source = agedVar.getSource();
            source.getClass();
            agit agitVar = new agit(aieiVar, agedVar, agazVarSubstitute, null, annotations, kind, source, null);
            List<agel> substitutedValueParameters = aghm.getSubstitutedValueParameters(agitVar, agazVar.getValueParameters(), typeSubstitutorForUnderlyingClass);
            if (substitutedValueParameters != null) {
                aigw aigwVarLowerIfFlexible = aige.lowerIfFlexible(agazVarSubstitute.getReturnType().unwrap());
                aigw defaultType = agedVar.getDefaultType();
                defaultType.getClass();
                aigw aigwVarWithAbbreviation = aiha.withAbbreviation(aigwVarLowerIfFlexible, defaultType);
                agdq dispatchReceiverParameter = agazVar.getDispatchReceiverParameter();
                agdq agdqVarCreateExtensionReceiverParameterForCallable = dispatchReceiverParameter != null ? ahss.createExtensionReceiverParameterForCallable(agitVar, typeSubstitutorForUnderlyingClass.safeSubstitute(dispatchReceiverParameter.getType(), aijg.INVARIANT), agfk.Companion.getEMPTY()) : null;
                agba classDescriptor = agedVar.getClassDescriptor();
                if (classDescriptor != null) {
                    List<agdq> contextReceiverParameters = agazVar.getContextReceiverParameters();
                    contextReceiverParameters.getClass();
                    arrayList = new ArrayList<>(woy.bp(contextReceiverParameters, 10));
                    int i = 0;
                    for (Object obj : contextReceiverParameters) {
                        int i2 = i + 1;
                        if (i < 0) {
                            woy.bo();
                        }
                        agdq agdqVar = (agdq) obj;
                        aigl aiglVarSafeSubstitute = typeSubstitutorForUnderlyingClass.safeSubstitute(agdqVar.getType(), aijg.INVARIANT);
                        ahya value = agdqVar.getValue();
                        value.getClass();
                        arrayList.add(ahss.createContextReceiverParameterForClass(classDescriptor, aiglVarSafeSubstitute, ((ahxz) value).getCustomLabelName(), agfk.Companion.getEMPTY(), i));
                        i = i2;
                    }
                } else {
                    arrayList = afbe.a;
                }
                agitVar.initialize(agdqVarCreateExtensionReceiverParameterForCallable, null, arrayList, agedVar.getDeclaredTypeParameters(), substitutedValueParameters, aigwVarWithAbbreviation, agcq.FINAL, agedVar.getVisibility());
                return agitVar;
            }
        }
        return null;
    }

    public /* synthetic */ agis(afeu afeuVar) {
        this();
    }
}
