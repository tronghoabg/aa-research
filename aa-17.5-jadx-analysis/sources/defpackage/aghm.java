package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class aghm extends aggz implements agcj {
    private List<agdq> contextReceiverParameters;
    private agdq dispatchReceiverParameter;
    private agdq extensionReceiverParameter;
    private boolean hasStableParameterNames;
    private boolean hasSynthesizedParameterNames;
    private agcj initialSignatureDescriptor;
    private boolean isActual;
    private boolean isExpect;
    private boolean isExternal;
    private boolean isHiddenForResolutionEverywhereBesideSupercalls;
    private boolean isHiddenToOvercomeSignatureClash;
    private boolean isInfix;
    private boolean isInline;
    private boolean isOperator;
    private boolean isSuspend;
    private boolean isTailrec;
    private final agaw kind;
    private volatile afdr<Collection<agcj>> lazyOverriddenFunctionsTask;
    private agcq modality;
    private final agcj original;
    private Collection<? extends agcj> overriddenFunctions;
    private List<agee> typeParameters;
    private aigl unsubstitutedReturnType;
    private List<agel> unsubstitutedValueParameters;
    protected Map<agau<?>, Object> userDataMap;
    private agcc visibility;

    private static /* synthetic */ void $$$reportNull$$$0(int i) {
        String str;
        int i2;
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                i2 = 2;
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                i2 = 3;
                break;
        }
        Object[] objArr = new Object[i2];
        switch (i) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "kind";
                break;
            case 4:
                objArr[0] = "source";
                break;
            case 5:
                objArr[0] = "contextReceiverParameters";
                break;
            case 6:
                objArr[0] = "typeParameters";
                break;
            case 7:
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case 30:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 8:
            case 10:
                objArr[0] = "visibility";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 11:
                objArr[0] = "unsubstitutedReturnType";
                break;
            case 12:
                objArr[0] = "extensionReceiverParameter";
                break;
            case 17:
                objArr[0] = "overriddenDescriptors";
                break;
            case 22:
                objArr[0] = "originalSubstitutor";
                break;
            case 24:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 31:
                objArr[0] = "substitutor";
                break;
            case 25:
                objArr[0] = "configuration";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i) {
            case 9:
                objArr[1] = "initialize";
                break;
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/FunctionDescriptorImpl";
                break;
            case 13:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 14:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 15:
                objArr[1] = "getModality";
                break;
            case 16:
                objArr[1] = "getVisibility";
                break;
            case 18:
                objArr[1] = "getTypeParameters";
                break;
            case 19:
                objArr[1] = "getValueParameters";
                break;
            case 20:
                objArr[1] = "getOriginal";
                break;
            case 21:
                objArr[1] = "getKind";
                break;
            case 23:
                objArr[1] = "newCopyBuilder";
                break;
            case 26:
                objArr[1] = "copy";
                break;
            case 27:
                objArr[1] = "getSourceToUseForCopy";
                break;
        }
        switch (i) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "initialize";
                break;
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                break;
            case 10:
                objArr[2] = "setVisibility";
                break;
            case 11:
                objArr[2] = "setReturnType";
                break;
            case 12:
                objArr[2] = "setExtensionReceiverParameter";
                break;
            case 17:
                objArr[2] = "setOverriddenDescriptors";
                break;
            case 22:
                objArr[2] = "substitute";
                break;
            case 24:
                objArr[2] = "newCopyBuilder";
                break;
            case 25:
                objArr[2] = "doSubstitute";
                break;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
            case 30:
            case 31:
                objArr[2] = "getSubstitutedValueParameters";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i) {
            case 9:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 20:
            case 21:
            case 23:
            case 26:
            case 27:
                throw new IllegalStateException(str2);
            case 10:
            case 11:
            case 12:
            case 17:
            case 22:
            case 24:
            case 25:
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected aghm(agbi agbiVar, agcj agcjVar, agfk agfkVar, ahnj ahnjVar, agaw agawVar, agdx agdxVar) {
        super(agbiVar, agfkVar, ahnjVar, agdxVar);
        if (agbiVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(1);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(2);
        }
        if (agawVar == null) {
            $$$reportNull$$$0(3);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(4);
        }
        this.visibility = agcb.UNKNOWN;
        this.isOperator = false;
        this.isInfix = false;
        this.isExternal = false;
        this.isInline = false;
        this.isTailrec = false;
        this.isExpect = false;
        this.isActual = false;
        this.isHiddenToOvercomeSignatureClash = false;
        this.isHiddenForResolutionEverywhereBesideSupercalls = false;
        this.isSuspend = false;
        this.hasStableParameterNames = true;
        this.hasSynthesizedParameterNames = false;
        this.overriddenFunctions = null;
        this.lazyOverriddenFunctionsTask = null;
        this.initialSignatureDescriptor = null;
        this.userDataMap = null;
        this.original = agcjVar == null ? this : agcjVar;
        this.kind = agawVar;
    }

    private agdx getSourceToUseForCopy(boolean z, agcj agcjVar) {
        agdx source;
        if (z) {
            if (agcjVar == null) {
                agcjVar = getOriginal();
            }
            source = agcjVar.getSource();
        } else {
            source = agdx.NO_SOURCE;
        }
        if (source == null) {
            $$$reportNull$$$0(27);
        }
        return source;
    }

    public static List<agel> getSubstitutedValueParameters(agcj agcjVar, List<agel> list, aiiy aiiyVar, boolean z, boolean z2, boolean[] zArr) {
        if (list == null) {
            $$$reportNull$$$0(30);
        }
        if (aiiyVar == null) {
            $$$reportNull$$$0(31);
        }
        ArrayList arrayList = new ArrayList(list.size());
        for (agel agelVar : list) {
            aigl aiglVarSubstitute = aiiyVar.substitute(agelVar.getType(), aijg.IN_VARIANCE);
            aigl varargElementType = agelVar.getVarargElementType();
            aigl aiglVarSubstitute2 = varargElementType == null ? null : aiiyVar.substitute(varargElementType, aijg.IN_VARIANCE);
            if (aiglVarSubstitute == null) {
                return null;
            }
            if ((aiglVarSubstitute != agelVar.getType() || varargElementType != aiglVarSubstitute2) && zArr != null) {
                zArr[0] = true;
            }
            arrayList.add(agiy.createWithDestructuringDeclarations(agcjVar, true != z ? agelVar : null, agelVar.getIndex(), agelVar.getAnnotations(), agelVar.getName(), aiglVarSubstitute, agelVar.declaresDefaultValue(), agelVar.isCrossinline(), agelVar.isNoinline(), aiglVarSubstitute2, z2 ? agelVar.getSource() : agdx.NO_SOURCE, agelVar instanceof agix ? new aghk(((agix) agelVar).getDestructuringVariables()) : null));
        }
        return arrayList;
    }

    private void performOverriddenLazyCalculationIfNeeded() {
        afdr<Collection<agcj>> afdrVar = this.lazyOverriddenFunctionsTask;
        if (afdrVar != null) {
            this.overriddenFunctions = afdrVar.invoke();
            this.lazyOverriddenFunctionsTask = null;
        }
    }

    private void setHiddenForResolutionEverywhereBesideSupercalls(boolean z) {
        this.isHiddenForResolutionEverywhereBesideSupercalls = z;
    }

    private void setHiddenToOvercomeSignatureClash(boolean z) {
        this.isHiddenToOvercomeSignatureClash = z;
    }

    private void setInitialSignatureDescriptor(agcj agcjVar) {
        this.initialSignatureDescriptor = agcjVar;
    }

    public <R, D> R accept(agbk<R, D> agbkVar, D d) {
        return agbkVar.visitFunctionDescriptor(this, d);
    }

    @Override // defpackage.agax
    public agcj copy(agbi agbiVar, agcq agcqVar, agcc agccVar, agaw agawVar, boolean z) {
        agcj agcjVarBuild = newCopyBuilder().setOwner(agbiVar).setModality(agcqVar).setVisibility(agccVar).setKind(agawVar).setCopyOverrides(z).build();
        if (agcjVarBuild == null) {
            $$$reportNull$$$0(26);
        }
        return agcjVarBuild;
    }

    protected abstract aghm createSubstitutedCopy(agbi agbiVar, agcj agcjVar, agaw agawVar, ahnj ahnjVar, agfk agfkVar, agdx agdxVar);

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v3 */
    protected agcj doSubstitute(aghl aghlVar) {
        ?? r15;
        agin aginVar;
        agcj agcjVar;
        aigl aiglVarSubstitute;
        if (aghlVar == null) {
            $$$reportNull$$$0(25);
        }
        boolean[] zArr = new boolean[1];
        agfk agfkVarComposeAnnotations = aghlVar.additionalAnnotations != null ? agfm.composeAnnotations(getAnnotations(), aghlVar.additionalAnnotations) : getAnnotations();
        agbi agbiVar = aghlVar.newOwner;
        agcj agcjVar2 = aghlVar.original;
        aghm aghmVarCreateSubstitutedCopy = createSubstitutedCopy(agbiVar, agcjVar2, aghlVar.kind, aghlVar.name, agfkVarComposeAnnotations, getSourceToUseForCopy(aghlVar.preserveSourceElement, agcjVar2));
        List<agee> typeParameters = aghlVar.newTypeParameters == null ? getTypeParameters() : aghlVar.newTypeParameters;
        zArr[0] = zArr[0] | (!typeParameters.isEmpty());
        ArrayList arrayList = new ArrayList(typeParameters.size());
        aiiy aiiyVarSubstituteTypeParameters = aifs.substituteTypeParameters(typeParameters, aghlVar.substitution, aghmVarCreateSubstitutedCopy, arrayList, zArr);
        agdq agdqVar = null;
        if (aiiyVarSubstituteTypeParameters == null) {
            return null;
        }
        ArrayList arrayList2 = new ArrayList();
        if (!aghlVar.newContextReceiverParameters.isEmpty()) {
            int i = 0;
            for (agdq agdqVar2 : aghlVar.newContextReceiverParameters) {
                aigl aiglVarSubstitute2 = aiiyVarSubstituteTypeParameters.substitute(agdqVar2.getType(), aijg.IN_VARIANCE);
                if (aiglVarSubstitute2 == null) {
                    return null;
                }
                int i2 = i + 1;
                arrayList2.add(ahss.createContextReceiverParameterForCallable(aghmVarCreateSubstitutedCopy, aiglVarSubstitute2, ((ahxz) agdqVar2.getValue()).getCustomLabelName(), agdqVar2.getAnnotations(), i));
                zArr[0] = zArr[0] | (aiglVarSubstitute2 != agdqVar2.getType());
                i = i2;
            }
        }
        agdq agdqVar3 = aghlVar.newExtensionReceiverParameter;
        if (agdqVar3 != null) {
            aigl aiglVarSubstitute3 = aiiyVarSubstituteTypeParameters.substitute(agdqVar3.getType(), aijg.IN_VARIANCE);
            if (aiglVarSubstitute3 == null) {
                return null;
            }
            agin aginVar2 = new agin(aghmVarCreateSubstitutedCopy, new ahxx(aghmVarCreateSubstitutedCopy, aiglVarSubstitute3, aghlVar.newExtensionReceiverParameter.getValue()), aghlVar.newExtensionReceiverParameter.getAnnotations());
            zArr[0] = (aiglVarSubstitute3 != aghlVar.newExtensionReceiverParameter.getType()) | zArr[0];
            r15 = 0;
            aginVar = aginVar2;
        } else {
            r15 = 0;
            aginVar = null;
        }
        agdq agdqVar4 = aghlVar.dispatchReceiverParameter;
        if (agdqVar4 != null) {
            agdq agdqVarSubstitute = agdqVar4.substitute(aiiyVarSubstituteTypeParameters);
            if (agdqVarSubstitute == null) {
                return null;
            }
            zArr[r15] = zArr[r15] | (agdqVarSubstitute != aghlVar.dispatchReceiverParameter ? true : r15);
            agcjVar = null;
            agdqVar = agdqVarSubstitute;
        } else {
            agcjVar = null;
        }
        List<agel> substitutedValueParameters = getSubstitutedValueParameters(aghmVarCreateSubstitutedCopy, aghlVar.newValueParameterDescriptors, aiiyVarSubstituteTypeParameters, aghlVar.dropOriginalInContainingParts, aghlVar.preserveSourceElement, zArr);
        if (substitutedValueParameters == null || (aiglVarSubstitute = aiiyVarSubstituteTypeParameters.substitute(aghlVar.newReturnType, aijg.OUT_VARIANCE)) == null) {
            return agcjVar;
        }
        boolean z = zArr[r15] | (aiglVarSubstitute != aghlVar.newReturnType ? true : r15);
        zArr[r15] = z;
        if (!z && aghlVar.justForTypeSubstitution) {
            return this;
        }
        aghmVarCreateSubstitutedCopy.initialize(aginVar, agdqVar, arrayList2, arrayList, substitutedValueParameters, aiglVarSubstitute, aghlVar.newModality, aghlVar.newVisibility);
        aghmVarCreateSubstitutedCopy.setOperator(this.isOperator);
        aghmVarCreateSubstitutedCopy.setInfix(this.isInfix);
        aghmVarCreateSubstitutedCopy.setExternal(this.isExternal);
        aghmVarCreateSubstitutedCopy.setInline(this.isInline);
        aghmVarCreateSubstitutedCopy.setTailrec(this.isTailrec);
        aghmVarCreateSubstitutedCopy.setSuspend(this.isSuspend);
        aghmVarCreateSubstitutedCopy.setExpect(this.isExpect);
        aghmVarCreateSubstitutedCopy.setActual(this.isActual);
        aghmVarCreateSubstitutedCopy.setHasStableParameterNames(this.hasStableParameterNames);
        aghmVarCreateSubstitutedCopy.setHiddenToOvercomeSignatureClash(aghlVar.isHiddenToOvercomeSignatureClash);
        aghmVarCreateSubstitutedCopy.setHiddenForResolutionEverywhereBesideSupercalls(aghlVar.isHiddenForResolutionEverywhereBesideSupercalls);
        aghmVarCreateSubstitutedCopy.setHasSynthesizedParameterNames(aghlVar.newHasSynthesizedParameterNames != null ? aghlVar.newHasSynthesizedParameterNames.booleanValue() : this.hasSynthesizedParameterNames);
        if (!aghlVar.userDataMap.isEmpty() || this.userDataMap != null) {
            Map<agau<?>, Object> map = aghlVar.userDataMap;
            Map<agau<?>, Object> map2 = this.userDataMap;
            if (map2 != null) {
                for (Map.Entry<agau<?>, Object> entry : map2.entrySet()) {
                    if (!map.containsKey(entry.getKey())) {
                        map.put(entry.getKey(), entry.getValue());
                    }
                }
            }
            if (map.size() == 1) {
                aghmVarCreateSubstitutedCopy.userDataMap = Collections.singletonMap(map.keySet().iterator().next(), map.values().iterator().next());
            } else {
                aghmVarCreateSubstitutedCopy.userDataMap = map;
            }
        }
        if (aghlVar.signatureChange || getInitialSignatureDescriptor() != null) {
            aghmVarCreateSubstitutedCopy.setInitialSignatureDescriptor((getInitialSignatureDescriptor() != null ? getInitialSignatureDescriptor() : this).substitute(aiiyVarSubstituteTypeParameters));
        }
        if (aghlVar.copyOverrides && !getOriginal().getOverriddenDescriptors().isEmpty()) {
            if (aghlVar.substitution.isEmpty()) {
                afdr<Collection<agcj>> afdrVar = this.lazyOverriddenFunctionsTask;
                if (afdrVar != null) {
                    aghmVarCreateSubstitutedCopy.lazyOverriddenFunctionsTask = afdrVar;
                    return aghmVarCreateSubstitutedCopy;
                }
                aghmVarCreateSubstitutedCopy.setOverriddenDescriptors(getOverriddenDescriptors());
                return aghmVarCreateSubstitutedCopy;
            }
            aghmVarCreateSubstitutedCopy.lazyOverriddenFunctionsTask = new aghj(this, aiiyVarSubstituteTypeParameters);
        }
        return aghmVarCreateSubstitutedCopy;
    }

    @Override // defpackage.agav
    public List<agdq> getContextReceiverParameters() {
        List<agdq> list = this.contextReceiverParameters;
        if (list == null) {
            $$$reportNull$$$0(13);
        }
        return list;
    }

    @Override // defpackage.agav
    public agdq getDispatchReceiverParameter() {
        return this.dispatchReceiverParameter;
    }

    @Override // defpackage.agav
    public agdq getExtensionReceiverParameter() {
        return this.extensionReceiverParameter;
    }

    @Override // defpackage.agcj
    public agcj getInitialSignatureDescriptor() {
        return this.initialSignatureDescriptor;
    }

    @Override // defpackage.agax
    public agaw getKind() {
        agaw agawVar = this.kind;
        if (agawVar == null) {
            $$$reportNull$$$0(21);
        }
        return agawVar;
    }

    @Override // defpackage.agco
    public agcq getModality() {
        agcq agcqVar = this.modality;
        if (agcqVar == null) {
            $$$reportNull$$$0(15);
        }
        return agcqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [agcj] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // defpackage.aggz, defpackage.aggy, defpackage.agbi
    public agcj getOriginal() {
        agcj agcjVar = this.original;
        ?? original = this;
        if (agcjVar != this) {
            original = agcjVar.getOriginal();
        }
        if (original == 0) {
            $$$reportNull$$$0(20);
        }
        return original;
    }

    public Collection<? extends agcj> getOverriddenDescriptors() {
        performOverriddenLazyCalculationIfNeeded();
        Collection<? extends agcj> collection = this.overriddenFunctions;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            $$$reportNull$$$0(14);
        }
        return collection;
    }

    @Override // defpackage.agav
    public aigl getReturnType() {
        return this.unsubstitutedReturnType;
    }

    @Override // defpackage.agav
    public List<agee> getTypeParameters() {
        List<agee> list = this.typeParameters;
        if (list != null) {
            return list;
        }
        toString();
        throw new IllegalStateException("typeParameters == null for ".concat(toString()));
    }

    @Override // defpackage.agav
    public <V> V getUserData(agau<V> agauVar) {
        Map<agau<?>, Object> map = this.userDataMap;
        if (map == null) {
            return null;
        }
        return (V) map.get(agauVar);
    }

    @Override // defpackage.agav
    public List<agel> getValueParameters() {
        List<agel> list = this.unsubstitutedValueParameters;
        if (list == null) {
            $$$reportNull$$$0(19);
        }
        return list;
    }

    @Override // defpackage.agbm
    public agcc getVisibility() {
        agcc agccVar = this.visibility;
        if (agccVar == null) {
            $$$reportNull$$$0(16);
        }
        return agccVar;
    }

    public boolean hasStableParameterNames() {
        return this.hasStableParameterNames;
    }

    @Override // defpackage.agav
    public boolean hasSynthesizedParameterNames() {
        return this.hasSynthesizedParameterNames;
    }

    public aghm initialize(agdq agdqVar, agdq agdqVar2, List<agdq> list, List<? extends agee> list2, List<agel> list3, aigl aiglVar, agcq agcqVar, agcc agccVar) {
        if (list == null) {
            $$$reportNull$$$0(5);
        }
        if (list2 == null) {
            $$$reportNull$$$0(6);
        }
        if (list3 == null) {
            $$$reportNull$$$0(7);
        }
        if (agccVar == null) {
            $$$reportNull$$$0(8);
        }
        this.typeParameters = woy.cf(list2);
        this.unsubstitutedValueParameters = woy.cf(list3);
        this.unsubstitutedReturnType = aiglVar;
        this.modality = agcqVar;
        this.visibility = agccVar;
        this.extensionReceiverParameter = agdqVar;
        this.dispatchReceiverParameter = agdqVar2;
        this.contextReceiverParameters = list;
        for (int i = 0; i < list2.size(); i++) {
            agee ageeVar = list2.get(i);
            if (ageeVar.getIndex() != i) {
                throw new IllegalStateException(ageeVar + " index is " + ageeVar.getIndex() + " but position is " + i);
            }
        }
        for (int i2 = 0; i2 < list3.size(); i2++) {
            agel agelVar = list3.get(i2);
            if (agelVar.getIndex() != i2) {
                throw new IllegalStateException(agelVar + "index is " + agelVar.getIndex() + " but position is " + i2);
            }
        }
        return this;
    }

    @Override // defpackage.agco
    public boolean isActual() {
        return this.isActual;
    }

    @Override // defpackage.agco
    public boolean isExpect() {
        return this.isExpect;
    }

    public boolean isExternal() {
        return this.isExternal;
    }

    @Override // defpackage.agcj
    public boolean isHiddenForResolutionEverywhereBesideSupercalls() {
        return this.isHiddenForResolutionEverywhereBesideSupercalls;
    }

    @Override // defpackage.agcj
    public boolean isHiddenToOvercomeSignatureClash() {
        return this.isHiddenToOvercomeSignatureClash;
    }

    @Override // defpackage.agcj
    public boolean isInfix() {
        if (this.isInfix) {
            return true;
        }
        Iterator<? extends agcj> it = getOriginal().getOverriddenDescriptors().iterator();
        while (it.hasNext()) {
            if (it.next().isInfix()) {
                return true;
            }
        }
        return false;
    }

    public boolean isInline() {
        return this.isInline;
    }

    @Override // defpackage.agcj
    public boolean isOperator() {
        if (this.isOperator) {
            return true;
        }
        Iterator<? extends agcj> it = getOriginal().getOverriddenDescriptors().iterator();
        while (it.hasNext()) {
            if (it.next().isOperator()) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.agcj
    public boolean isSuspend() {
        return this.isSuspend;
    }

    public boolean isTailrec() {
        return this.isTailrec;
    }

    protected aghl newCopyBuilder(aiiy aiiyVar) {
        if (aiiyVar == null) {
            $$$reportNull$$$0(24);
        }
        return new aghl(this, aiiyVar.getSubstitution(), getContainingDeclaration(), getModality(), getVisibility(), getKind(), getValueParameters(), getContextReceiverParameters(), getExtensionReceiverParameter(), getReturnType(), null);
    }

    public <V> void putInUserDataMap(agau<V> agauVar, Object obj) {
        if (this.userDataMap == null) {
            this.userDataMap = new LinkedHashMap();
        }
        this.userDataMap.put(agauVar, obj);
    }

    public void setActual(boolean z) {
        this.isActual = z;
    }

    public void setExpect(boolean z) {
        this.isExpect = z;
    }

    public void setExternal(boolean z) {
        this.isExternal = z;
    }

    public void setHasStableParameterNames(boolean z) {
        this.hasStableParameterNames = z;
    }

    public void setHasSynthesizedParameterNames(boolean z) {
        this.hasSynthesizedParameterNames = z;
    }

    public void setInfix(boolean z) {
        this.isInfix = z;
    }

    public void setInline(boolean z) {
        this.isInline = z;
    }

    public void setOperator(boolean z) {
        this.isOperator = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void setOverriddenDescriptors(Collection<? extends agax> collection) {
        if (collection == 0) {
            $$$reportNull$$$0(17);
        }
        this.overriddenFunctions = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (((agcj) it.next()).isHiddenForResolutionEverywhereBesideSupercalls()) {
                this.isHiddenForResolutionEverywhereBesideSupercalls = true;
                return;
            }
        }
    }

    public void setReturnType(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(11);
        }
        this.unsubstitutedReturnType = aiglVar;
    }

    public void setSuspend(boolean z) {
        this.isSuspend = z;
    }

    public void setTailrec(boolean z) {
        this.isTailrec = z;
    }

    public void setVisibility(agcc agccVar) {
        if (agccVar == null) {
            $$$reportNull$$$0(10);
        }
        this.visibility = agccVar;
    }

    @Override // defpackage.agcj, defpackage.agea
    public agcj substitute(aiiy aiiyVar) {
        if (aiiyVar == null) {
            $$$reportNull$$$0(22);
        }
        if (aiiyVar.isEmpty()) {
            return this;
        }
        aghl aghlVarNewCopyBuilder = newCopyBuilder(aiiyVar);
        aghlVarNewCopyBuilder.setOriginal((agax) getOriginal());
        aghlVarNewCopyBuilder.setPreserveSourceElement();
        aghlVarNewCopyBuilder.setJustForTypeSubstitution(true);
        return aghlVarNewCopyBuilder.build();
    }

    @Override // defpackage.agcj
    public agci<? extends agcj> newCopyBuilder() {
        aghl aghlVarNewCopyBuilder = newCopyBuilder(aiiy.EMPTY);
        if (aghlVarNewCopyBuilder == null) {
            $$$reportNull$$$0(23);
        }
        return aghlVarNewCopyBuilder;
    }

    public static List<agel> getSubstitutedValueParameters(agcj agcjVar, List<agel> list, aiiy aiiyVar) {
        if (list == null) {
            $$$reportNull$$$0(28);
        }
        if (aiiyVar == null) {
            $$$reportNull$$$0(29);
        }
        return getSubstitutedValueParameters(agcjVar, list, aiiyVar, false, false, null);
    }
}
