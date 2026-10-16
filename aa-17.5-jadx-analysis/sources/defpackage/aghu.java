package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes3.dex */
public final class aghu extends aghw {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private List<agee> declaredTypeParameters;
    private aiiy newSubstitutor;
    private final aghw original;
    private final aiiy originalSubstitutor;
    private aiid typeConstructor;
    private List<agee> typeConstructorParameters;

    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static /* synthetic */ void $$$reportNull$$$0(int r15) {
        /*
            Method dump skipped, instructions count: 318
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aghu.$$$reportNull$$$0(int):void");
    }

    public aghu(aghw aghwVar, aiiy aiiyVar) {
        this.original = aghwVar;
        this.originalSubstitutor = aiiyVar;
    }

    private aiiy getSubstitutor() {
        if (this.newSubstitutor == null) {
            if (this.originalSubstitutor.isEmpty()) {
                this.newSubstitutor = this.originalSubstitutor;
            } else {
                List<agee> parameters = this.original.getTypeConstructor().getParameters();
                this.typeConstructorParameters = new ArrayList(parameters.size());
                this.newSubstitutor = aifs.substituteTypeParameters(parameters, this.originalSubstitutor.getSubstitution(), this, this.typeConstructorParameters);
                this.declaredTypeParameters = woy.bT(this.typeConstructorParameters, new aghs(this));
            }
        }
        return this.newSubstitutor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public aigw substituteSimpleType(aigw aigwVar) {
        return (aigwVar == null || this.originalSubstitutor.isEmpty()) ? aigwVar : (aigw) getSubstitutor().substitute(aigwVar, aijg.INVARIANT);
    }

    @Override // defpackage.agbi
    public <R, D> R accept(agbk<R, D> agbkVar, D d) {
        return agbkVar.visitClassDescriptor(this, d);
    }

    @Override // defpackage.agez
    public agfk getAnnotations() {
        agfk annotations = this.original.getAnnotations();
        if (annotations == null) {
            $$$reportNull$$$0(19);
        }
        return annotations;
    }

    @Override // defpackage.agba
    public agba getCompanionObjectDescriptor() {
        return this.original.getCompanionObjectDescriptor();
    }

    @Override // defpackage.agba
    public Collection<agaz> getConstructors() {
        Collection<agaz> constructors = this.original.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.size());
        for (agaz agazVar : constructors) {
            arrayList.add(((agaz) agazVar.newCopyBuilder().setOriginal(agazVar.getOriginal()).setModality(agazVar.getModality()).setVisibility(agazVar.getVisibility()).setKind(agazVar.getKind()).setCopyOverrides(false).build()).substitute(getSubstitutor()));
        }
        return arrayList;
    }

    @Override // defpackage.agba, defpackage.agbj, defpackage.agbi
    public agbi getContainingDeclaration() {
        agbi containingDeclaration = this.original.getContainingDeclaration();
        if (containingDeclaration == null) {
            $$$reportNull$$$0(22);
        }
        return containingDeclaration;
    }

    @Override // defpackage.agba
    public List<agdq> getContextReceivers() {
        List<agdq> list = Collections.EMPTY_LIST;
        if (list == null) {
            $$$reportNull$$$0(17);
        }
        return list;
    }

    @Override // defpackage.agba, defpackage.agbe
    public List<agee> getDeclaredTypeParameters() {
        getSubstitutor();
        List<agee> list = this.declaredTypeParameters;
        if (list == null) {
            $$$reportNull$$$0(30);
        }
        return list;
    }

    @Override // defpackage.agba, defpackage.agbd
    public aigw getDefaultType() {
        return aigq.simpleTypeWithNonTrivialMemberScope(aifm.INSTANCE.toAttributes(getAnnotations(), null, null), getTypeConstructor(), aijc.getDefaultTypeProjections(getTypeConstructor().getParameters()), false, getUnsubstitutedMemberScope());
    }

    @Override // defpackage.agba
    public agbb getKind() {
        agbb kind = this.original.getKind();
        if (kind == null) {
            $$$reportNull$$$0(25);
        }
        return kind;
    }

    @Override // defpackage.aghw
    public ahxe getMemberScope(aiit aiitVar, aiju aijuVar) {
        if (aiitVar == null) {
            $$$reportNull$$$0(5);
        }
        if (aijuVar == null) {
            $$$reportNull$$$0(6);
        }
        ahxe memberScope = this.original.getMemberScope(aiitVar, aijuVar);
        if (!this.originalSubstitutor.isEmpty()) {
            return new ahxo(memberScope, getSubstitutor());
        }
        if (memberScope == null) {
            $$$reportNull$$$0(7);
        }
        return memberScope;
    }

    @Override // defpackage.agba, defpackage.agco
    public agcq getModality() {
        agcq modality = this.original.getModality();
        if (modality == null) {
            $$$reportNull$$$0(26);
        }
        return modality;
    }

    @Override // defpackage.agcw
    public ahnj getName() {
        ahnj name = this.original.getName();
        if (name == null) {
            $$$reportNull$$$0(20);
        }
        return name;
    }

    @Override // defpackage.aghw, defpackage.agbi
    public agba getOriginal() {
        agba original = this.original.getOriginal();
        if (original == null) {
            $$$reportNull$$$0(21);
        }
        return original;
    }

    @Override // defpackage.agbl
    public agdx getSource() {
        agdx agdxVar = agdx.NO_SOURCE;
        if (agdxVar == null) {
            $$$reportNull$$$0(29);
        }
        return agdxVar;
    }

    @Override // defpackage.agba
    public ahxe getStaticScope() {
        ahxe staticScope = this.original.getStaticScope();
        if (staticScope == null) {
            $$$reportNull$$$0(15);
        }
        return staticScope;
    }

    @Override // defpackage.agba
    public agdq getThisAsReceiverParameter() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.agbd
    public aiid getTypeConstructor() {
        aiiy aiiyVar = this.originalSubstitutor;
        aiid typeConstructor = this.original.getTypeConstructor();
        if (aiiyVar.isEmpty()) {
            if (typeConstructor == null) {
                $$$reportNull$$$0(0);
            }
            return typeConstructor;
        }
        if (this.typeConstructor == null) {
            aiiy substitutor = getSubstitutor();
            Collection<aigl> collectionMo89getSupertypes = typeConstructor.mo89getSupertypes();
            ArrayList arrayList = new ArrayList(collectionMo89getSupertypes.size());
            Iterator<aigl> it = collectionMo89getSupertypes.iterator();
            while (it.hasNext()) {
                arrayList.add(substitutor.substitute(it.next(), aijg.INVARIANT));
            }
            this.typeConstructor = new aifj(this, this.typeConstructorParameters, arrayList, aidz.NO_LOCKS);
        }
        aiid aiidVar = this.typeConstructor;
        if (aiidVar == null) {
            $$$reportNull$$$0(1);
        }
        return aiidVar;
    }

    @Override // defpackage.agba
    public ahxe getUnsubstitutedInnerClassesScope() {
        ahxe unsubstitutedInnerClassesScope = this.original.getUnsubstitutedInnerClassesScope();
        if (unsubstitutedInnerClassesScope == null) {
            $$$reportNull$$$0(28);
        }
        return unsubstitutedInnerClassesScope;
    }

    @Override // defpackage.aghw
    public ahxe getUnsubstitutedMemberScope(aiju aijuVar) {
        if (aijuVar == null) {
            $$$reportNull$$$0(13);
        }
        aghw aghwVar = this.original;
        aiiy aiiyVar = this.originalSubstitutor;
        ahxe unsubstitutedMemberScope = aghwVar.getUnsubstitutedMemberScope(aijuVar);
        if (!aiiyVar.isEmpty()) {
            return new ahxo(unsubstitutedMemberScope, getSubstitutor());
        }
        if (unsubstitutedMemberScope == null) {
            $$$reportNull$$$0(14);
        }
        return unsubstitutedMemberScope;
    }

    @Override // defpackage.agba
    public agaz getUnsubstitutedPrimaryConstructor() {
        return this.original.getUnsubstitutedPrimaryConstructor();
    }

    @Override // defpackage.agba
    public agej<aigw> getValueClassRepresentation() {
        agej<aigw> valueClassRepresentation = this.original.getValueClassRepresentation();
        if (valueClassRepresentation == null) {
            return null;
        }
        return valueClassRepresentation.mapUnderlyingType(new aght(this));
    }

    @Override // defpackage.agba, defpackage.agco, defpackage.agbm
    public agcc getVisibility() {
        agcc visibility = this.original.getVisibility();
        if (visibility == null) {
            $$$reportNull$$$0(27);
        }
        return visibility;
    }

    @Override // defpackage.agco
    public boolean isActual() {
        return this.original.isActual();
    }

    @Override // defpackage.agba
    public boolean isCompanionObject() {
        return this.original.isCompanionObject();
    }

    @Override // defpackage.agba
    public boolean isData() {
        return this.original.isData();
    }

    @Override // defpackage.agco
    public boolean isExpect() {
        return this.original.isExpect();
    }

    @Override // defpackage.agco
    public boolean isExternal() {
        return this.original.isExternal();
    }

    @Override // defpackage.agba
    public boolean isFun() {
        return this.original.isFun();
    }

    @Override // defpackage.agba
    public boolean isInline() {
        return this.original.isInline();
    }

    @Override // defpackage.agbe
    public boolean isInner() {
        return this.original.isInner();
    }

    @Override // defpackage.agba
    public boolean isValue() {
        return this.original.isValue();
    }

    @Override // defpackage.agea
    public agba substitute(aiiy aiiyVar) {
        if (aiiyVar == null) {
            $$$reportNull$$$0(23);
        }
        return aiiyVar.isEmpty() ? this : new aghu(this, aiiy.createChainedSubstitutor(aiiyVar.getSubstitution(), getSubstitutor().getSubstitution()));
    }

    @Override // defpackage.agba
    public ahxe getUnsubstitutedMemberScope() {
        ahxe unsubstitutedMemberScope = getUnsubstitutedMemberScope(ahvz.getKotlinTypeRefiner(ahst.getContainingModule(this.original)));
        if (unsubstitutedMemberScope == null) {
            $$$reportNull$$$0(12);
        }
        return unsubstitutedMemberScope;
    }

    @Override // defpackage.agba
    public ahxe getMemberScope(aiit aiitVar) {
        if (aiitVar == null) {
            $$$reportNull$$$0(10);
        }
        ahxe memberScope = getMemberScope(aiitVar, ahvz.getKotlinTypeRefiner(ahst.getContainingModule(this)));
        if (memberScope == null) {
            $$$reportNull$$$0(11);
        }
        return memberScope;
    }
}
