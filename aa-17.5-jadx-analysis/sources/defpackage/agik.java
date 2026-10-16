package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public class agik extends agja implements agdn {
    private agce backingField;
    private List<agdq> contextReceiverParameters;
    private agce delegateField;
    private agdq dispatchReceiverParameter;
    private agdq extensionReceiverParameter;
    private agil getter;
    private final boolean isActual;
    private final boolean isConst;
    private final boolean isDelegated;
    private final boolean isExpect;
    private final boolean isExternal;
    private final agaw kind;
    private final boolean lateInit;
    private final agcq modality;
    private final agdn original;
    private Collection<? extends agdn> overriddenProperties;
    private agdp setter;
    private boolean setterProjectedOut;
    private List<agee> typeParameters;
    private agcc visibility;

    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void $$$reportNull$$$0(int r11) {
        /*
            Method dump skipped, instructions count: 538
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agik.$$$reportNull$$$0(int):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected agik(agbi agbiVar, agdn agdnVar, agfk agfkVar, agcq agcqVar, agcc agccVar, boolean z, ahnj ahnjVar, agaw agawVar, agdx agdxVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        super(agbiVar, agfkVar, ahnjVar, null, z, agdxVar);
        if (agbiVar == null) {
            $$$reportNull$$$0(0);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(1);
        }
        if (agcqVar == null) {
            $$$reportNull$$$0(2);
        }
        if (agccVar == null) {
            $$$reportNull$$$0(3);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(4);
        }
        if (agawVar == null) {
            $$$reportNull$$$0(5);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(6);
        }
        this.overriddenProperties = null;
        this.contextReceiverParameters = Collections.EMPTY_LIST;
        this.modality = agcqVar;
        this.visibility = agccVar;
        this.original = agdnVar == null ? this : agdnVar;
        this.kind = agawVar;
        this.lateInit = z2;
        this.isConst = z3;
        this.isExpect = z4;
        this.isActual = z5;
        this.isExternal = z6;
        this.isDelegated = z7;
    }

    public static agik create(agbi agbiVar, agfk agfkVar, agcq agcqVar, agcc agccVar, boolean z, ahnj ahnjVar, agaw agawVar, agdx agdxVar, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        if (agbiVar == null) {
            $$$reportNull$$$0(7);
        }
        if (agfkVar == null) {
            $$$reportNull$$$0(8);
        }
        if (agcqVar == null) {
            $$$reportNull$$$0(9);
        }
        if (agccVar == null) {
            $$$reportNull$$$0(10);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(11);
        }
        if (agawVar == null) {
            $$$reportNull$$$0(12);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(13);
        }
        return new agik(agbiVar, null, agfkVar, agcqVar, agccVar, z, ahnjVar, agawVar, agdxVar, z2, z3, z4, z5, z6, z7);
    }

    private agdx getSourceToUseForCopy(boolean z, agdn agdnVar) {
        agdx source;
        if (z) {
            if (agdnVar == null) {
                agdnVar = getOriginal();
            }
            source = agdnVar.getSource();
        } else {
            source = agdx.NO_SOURCE;
        }
        if (source == null) {
            $$$reportNull$$$0(28);
        }
        return source;
    }

    private static agcj getSubstitutedInitialSignatureDescriptor(aiiy aiiyVar, agdm agdmVar) {
        if (aiiyVar == null) {
            $$$reportNull$$$0(30);
        }
        if (agdmVar == null) {
            $$$reportNull$$$0(31);
        }
        if (agdmVar.getInitialSignatureDescriptor() != null) {
            return agdmVar.getInitialSignatureDescriptor().substitute(aiiyVar);
        }
        return null;
    }

    private static agcc normalizeVisibility(agcc agccVar, agaw agawVar) {
        return (agawVar == agaw.FAKE_OVERRIDE && agcb.isPrivate(agccVar.normalize())) ? agcb.INVISIBLE_FAKE : agccVar;
    }

    private static agdq substituteContextParameterDescriptor(aiiy aiiyVar, agdn agdnVar, agdq agdqVar) {
        aigl aiglVarSubstitute = aiiyVar.substitute(agdqVar.getType(), aijg.IN_VARIANCE);
        if (aiglVarSubstitute == null) {
            return null;
        }
        return new agin(agdnVar, new ahxw(agdnVar, aiglVarSubstitute, ((ahxz) agdqVar.getValue()).getCustomLabelName(), agdqVar.getValue()), agdqVar.getAnnotations());
    }

    private static agdq substituteParameterDescriptor(aiiy aiiyVar, agdn agdnVar, agdq agdqVar) {
        aigl aiglVarSubstitute = aiiyVar.substitute(agdqVar.getType(), aijg.IN_VARIANCE);
        if (aiglVarSubstitute == null) {
            return null;
        }
        return new agin(agdnVar, new ahxx(agdnVar, aiglVarSubstitute, agdqVar.getValue()), agdqVar.getAnnotations());
    }

    @Override // defpackage.agbi
    public <R, D> R accept(agbk<R, D> agbkVar, D d) {
        return agbkVar.visitPropertyDescriptor(this, d);
    }

    @Override // defpackage.agax
    public agdn copy(agbi agbiVar, agcq agcqVar, agcc agccVar, agaw agawVar, boolean z) {
        agij agijVarNewCopyBuilder = newCopyBuilder();
        agijVarNewCopyBuilder.setOwner(agbiVar);
        agijVarNewCopyBuilder.setOriginal(null);
        agijVarNewCopyBuilder.setModality(agcqVar);
        agijVarNewCopyBuilder.setVisibility(agccVar);
        agijVarNewCopyBuilder.setKind(agawVar);
        agijVarNewCopyBuilder.setCopyOverrides(z);
        agdn agdnVarBuild = agijVarNewCopyBuilder.build();
        if (agdnVarBuild == null) {
            $$$reportNull$$$0(42);
        }
        return agdnVarBuild;
    }

    protected agik createSubstitutedCopy(agbi agbiVar, agcq agcqVar, agcc agccVar, agdn agdnVar, agaw agawVar, ahnj ahnjVar, agdx agdxVar) {
        if (agbiVar == null) {
            $$$reportNull$$$0(32);
        }
        if (agcqVar == null) {
            $$$reportNull$$$0(33);
        }
        if (agccVar == null) {
            $$$reportNull$$$0(34);
        }
        if (agawVar == null) {
            $$$reportNull$$$0(35);
        }
        if (ahnjVar == null) {
            $$$reportNull$$$0(36);
        }
        if (agdxVar == null) {
            $$$reportNull$$$0(37);
        }
        return new agik(agbiVar, agdnVar, getAnnotations(), agcqVar, agccVar, isVar(), ahnjVar, agawVar, agdxVar, isLateInit(), isConst(), isExpect(), isActual(), isExternal(), isDelegated());
    }

    protected agdn doSubstitute(agij agijVar) {
        agdq agdqVar;
        afdr<aied<ahuh<?>>> afdrVar;
        if (agijVar == null) {
            $$$reportNull$$$0(29);
        }
        agik agikVarCreateSubstitutedCopy = createSubstitutedCopy(agijVar.owner, agijVar.modality, agijVar.visibility, agijVar.original, agijVar.kind, agijVar.name, getSourceToUseForCopy(agijVar.preserveSourceElement, agijVar.original));
        List<agee> typeParameters = agijVar.newTypeParameters == null ? getTypeParameters() : agijVar.newTypeParameters;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        aiiy aiiyVarSubstituteTypeParameters = aifs.substituteTypeParameters(typeParameters, agijVar.substitution, agikVarCreateSubstitutedCopy, arrayList);
        aigl aiglVar = agijVar.returnType;
        aigl aiglVarSubstitute = aiiyVarSubstituteTypeParameters.substitute(aiglVar, aijg.OUT_VARIANCE);
        if (aiglVarSubstitute == null) {
            return null;
        }
        aigl aiglVarSubstitute2 = aiiyVarSubstituteTypeParameters.substitute(aiglVar, aijg.IN_VARIANCE);
        if (aiglVarSubstitute2 != null) {
            agikVarCreateSubstitutedCopy.setInType(aiglVarSubstitute2);
        }
        agdq agdqVar2 = agijVar.dispatchReceiverParameter;
        if (agdqVar2 != null) {
            agdq agdqVarSubstitute = agdqVar2.substitute(aiiyVarSubstituteTypeParameters);
            if (agdqVarSubstitute == null) {
                return null;
            }
            agdqVar = agdqVarSubstitute;
        } else {
            agdqVar = null;
        }
        agdq agdqVar3 = this.extensionReceiverParameter;
        agdq agdqVarSubstituteParameterDescriptor = agdqVar3 != null ? substituteParameterDescriptor(aiiyVarSubstituteTypeParameters, agikVarCreateSubstitutedCopy, agdqVar3) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator<agdq> it = this.contextReceiverParameters.iterator();
        while (it.hasNext()) {
            agdq agdqVarSubstituteContextParameterDescriptor = substituteContextParameterDescriptor(aiiyVarSubstituteTypeParameters, agikVarCreateSubstitutedCopy, it.next());
            if (agdqVarSubstituteContextParameterDescriptor != null) {
                arrayList2.add(agdqVarSubstituteContextParameterDescriptor);
            }
        }
        agikVarCreateSubstitutedCopy.setType(aiglVarSubstitute, arrayList, agdqVar, agdqVarSubstituteParameterDescriptor, arrayList2);
        agil agilVar = this.getter;
        agil agilVar2 = agilVar == null ? null : new agil(agikVarCreateSubstitutedCopy, agilVar.getAnnotations(), agijVar.modality, normalizeVisibility(this.getter.getVisibility(), agijVar.kind), this.getter.isDefault(), this.getter.isExternal(), this.getter.isInline(), agijVar.kind, agijVar.getOriginalGetter(), agdx.NO_SOURCE);
        if (agilVar2 != null) {
            aigl returnType = this.getter.getReturnType();
            agilVar2.setInitialSignatureDescriptor(getSubstitutedInitialSignatureDescriptor(aiiyVarSubstituteTypeParameters, this.getter));
            agilVar2.initialize(returnType != null ? aiiyVarSubstituteTypeParameters.substitute(returnType, aijg.OUT_VARIANCE) : null);
        }
        agdp agdpVar = this.setter;
        agim agimVar = agdpVar == null ? null : new agim(agikVarCreateSubstitutedCopy, agdpVar.getAnnotations(), agijVar.modality, normalizeVisibility(this.setter.getVisibility(), agijVar.kind), this.setter.isDefault(), this.setter.isExternal(), this.setter.isInline(), agijVar.kind, agijVar.getOriginalSetter(), agdx.NO_SOURCE);
        if (agimVar != null) {
            List<agel> substitutedValueParameters = aghm.getSubstitutedValueParameters(agimVar, this.setter.getValueParameters(), aiiyVarSubstituteTypeParameters, false, false, null);
            if (substitutedValueParameters == null) {
                agikVarCreateSubstitutedCopy.setSetterProjectedOut(true);
                substitutedValueParameters = Collections.singletonList(agim.createSetterParameter(agimVar, ahvz.getBuiltIns(agijVar.owner).getNothingType(), this.setter.getValueParameters().get(0).getAnnotations()));
            }
            if (substitutedValueParameters.size() != 1) {
                throw new IllegalStateException();
            }
            agimVar.setInitialSignatureDescriptor(getSubstitutedInitialSignatureDescriptor(aiiyVarSubstituteTypeParameters, this.setter));
            agimVar.initialize(substitutedValueParameters.get(0));
        }
        agce agceVar = this.backingField;
        aghi aghiVar = agceVar == null ? null : new aghi(agceVar.getAnnotations(), agikVarCreateSubstitutedCopy);
        agce agceVar2 = this.delegateField;
        agikVarCreateSubstitutedCopy.initialize(agilVar2, agimVar, aghiVar, agceVar2 == null ? null : new aghi(agceVar2.getAnnotations(), agikVarCreateSubstitutedCopy));
        if (agijVar.copyOverrides) {
            aipv aipvVarCreate = aipv.create();
            Iterator<? extends agav> it2 = getOverriddenDescriptors().iterator();
            while (it2.hasNext()) {
                aipvVarCreate.add(((agdn) it2.next()).substitute(aiiyVarSubstituteTypeParameters));
            }
            agikVarCreateSubstitutedCopy.setOverriddenDescriptors(aipvVarCreate);
        }
        if (isConst() && (afdrVar = this.compileTimeInitializerFactory) != null) {
            agikVarCreateSubstitutedCopy.setCompileTimeInitializer(this.compileTimeInitializer, afdrVar);
        }
        return agikVarCreateSubstitutedCopy;
    }

    @Override // defpackage.agdn
    public List<agdm> getAccessors() {
        ArrayList arrayList = new ArrayList(2);
        agil agilVar = this.getter;
        if (agilVar != null) {
            arrayList.add(agilVar);
        }
        agdp agdpVar = this.setter;
        if (agdpVar != null) {
            arrayList.add(agdpVar);
        }
        return arrayList;
    }

    @Override // defpackage.agdn
    public agce getBackingField() {
        return this.backingField;
    }

    @Override // defpackage.agiz, defpackage.agav
    public List<agdq> getContextReceiverParameters() {
        List<agdq> list = this.contextReceiverParameters;
        if (list == null) {
            $$$reportNull$$$0(22);
        }
        return list;
    }

    @Override // defpackage.agdn
    public agce getDelegateField() {
        return this.delegateField;
    }

    @Override // defpackage.agiz, defpackage.agav
    public agdq getDispatchReceiverParameter() {
        return this.dispatchReceiverParameter;
    }

    @Override // defpackage.agiz, defpackage.agav
    public agdq getExtensionReceiverParameter() {
        return this.extensionReceiverParameter;
    }

    @Override // defpackage.agax
    public agaw getKind() {
        agaw agawVar = this.kind;
        if (agawVar == null) {
            $$$reportNull$$$0(39);
        }
        return agawVar;
    }

    @Override // defpackage.agco
    public agcq getModality() {
        agcq agcqVar = this.modality;
        if (agcqVar == null) {
            $$$reportNull$$$0(24);
        }
        return agcqVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [agdn] */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // defpackage.agiz, defpackage.aggz, defpackage.aggy, defpackage.agbi
    public agdn getOriginal() {
        agdn agdnVar = this.original;
        ?? original = this;
        if (agdnVar != this) {
            original = agdnVar.getOriginal();
        }
        if (original == 0) {
            $$$reportNull$$$0(38);
        }
        return original;
    }

    @Override // defpackage.agiz, defpackage.agav
    public Collection<? extends agdn> getOverriddenDescriptors() {
        Collection<? extends agdn> collection = this.overriddenProperties;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            $$$reportNull$$$0(41);
        }
        return collection;
    }

    @Override // defpackage.agiz, defpackage.agav
    public aigl getReturnType() {
        aigl type = getType();
        if (type == null) {
            $$$reportNull$$$0(23);
        }
        return type;
    }

    @Override // defpackage.agdn
    public agdp getSetter() {
        return this.setter;
    }

    @Override // defpackage.agiz, defpackage.agav
    public List<agee> getTypeParameters() {
        List<agee> list = this.typeParameters;
        if (list != null) {
            return list;
        }
        toString();
        throw new IllegalStateException("typeParameters == null for ".concat(toString()));
    }

    @Override // defpackage.agiz, defpackage.agav
    public <V> V getUserData(agau<V> agauVar) {
        return null;
    }

    @Override // defpackage.agbm
    public agcc getVisibility() {
        agcc agccVar = this.visibility;
        if (agccVar == null) {
            $$$reportNull$$$0(25);
        }
        return agccVar;
    }

    public void initialize(agil agilVar, agdp agdpVar, agce agceVar, agce agceVar2) {
        this.getter = agilVar;
        this.setter = agdpVar;
        this.backingField = agceVar;
        this.delegateField = agceVar2;
    }

    @Override // defpackage.agco
    public boolean isActual() {
        return this.isActual;
    }

    @Override // defpackage.agiz, defpackage.agem
    public boolean isConst() {
        return this.isConst;
    }

    @Override // defpackage.agen
    public boolean isDelegated() {
        return this.isDelegated;
    }

    @Override // defpackage.agco
    public boolean isExpect() {
        return this.isExpect;
    }

    @Override // defpackage.agco
    public boolean isExternal() {
        return this.isExternal;
    }

    @Override // defpackage.agem
    public boolean isLateInit() {
        return this.lateInit;
    }

    public boolean isSetterProjectedOut() {
        return this.setterProjectedOut;
    }

    public agij newCopyBuilder() {
        return new agij(this);
    }

    public void setInType(aigl aiglVar) {
        if (aiglVar == null) {
            $$$reportNull$$$0(14);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.agax
    public void setOverriddenDescriptors(Collection<? extends agax> collection) {
        if (collection == 0) {
            $$$reportNull$$$0(40);
        }
        this.overriddenProperties = collection;
    }

    public void setSetterProjectedOut(boolean z) {
        this.setterProjectedOut = z;
    }

    public void setType(aigl aiglVar, List<? extends agee> list, agdq agdqVar, agdq agdqVar2, List<agdq> list2) {
        if (aiglVar == null) {
            $$$reportNull$$$0(17);
        }
        if (list == null) {
            $$$reportNull$$$0(18);
        }
        if (list2 == null) {
            $$$reportNull$$$0(19);
        }
        setOutType(aiglVar);
        this.typeParameters = new ArrayList(list);
        this.extensionReceiverParameter = agdqVar2;
        this.dispatchReceiverParameter = agdqVar;
        this.contextReceiverParameters = list2;
    }

    public void setVisibility(agcc agccVar) {
        if (agccVar == null) {
            $$$reportNull$$$0(20);
        }
        this.visibility = agccVar;
    }

    @Override // defpackage.agiz, defpackage.agea
    public agdn substitute(aiiy aiiyVar) {
        if (aiiyVar == null) {
            $$$reportNull$$$0(27);
        }
        if (aiiyVar.isEmpty()) {
            return this;
        }
        agij agijVarNewCopyBuilder = newCopyBuilder();
        agijVarNewCopyBuilder.setSubstitution(aiiyVar.getSubstitution());
        agijVarNewCopyBuilder.setOriginal(getOriginal());
        return agijVarNewCopyBuilder.build();
    }

    @Override // defpackage.agdn
    public agil getGetter() {
        return this.getter;
    }

    public void initialize(agil agilVar, agdp agdpVar) {
        initialize(agilVar, agdpVar, null, null);
    }
}
