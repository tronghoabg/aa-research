package defpackage;

import java.util.Collection;
import java.util.List;

/* loaded from: classes3.dex */
public final class ailg implements agdn {
    private final /* synthetic */ agik $$delegate_0;

    public ailg() {
        agik agikVarCreate = agik.create(ailm.INSTANCE.getErrorClass(), agfk.Companion.getEMPTY(), agcq.OPEN, agcb.PUBLIC, true, ahnj.special(ailb.ERROR_PROPERTY.getDebugText()), agaw.DECLARATION, agdx.NO_SOURCE, false, false, false, false, false, false);
        aigl errorPropertyType = ailm.INSTANCE.getErrorPropertyType();
        afbe afbeVar = afbe.a;
        agikVarCreate.setType(errorPropertyType, afbeVar, null, null, afbeVar);
        this.$$delegate_0 = agikVarCreate;
    }

    @Override // defpackage.agbi
    public <R, D> R accept(agbk<R, D> agbkVar, D d) {
        return (R) this.$$delegate_0.accept(agbkVar, d);
    }

    @Override // defpackage.agax
    public agax copy(agbi agbiVar, agcq agcqVar, agcc agccVar, agaw agawVar, boolean z) {
        agdn agdnVarCopy = this.$$delegate_0.copy(agbiVar, agcqVar, agccVar, agawVar, z);
        agdnVarCopy.getClass();
        return agdnVarCopy;
    }

    @Override // defpackage.agdn
    public List<agdm> getAccessors() {
        List<agdm> accessors = this.$$delegate_0.getAccessors();
        accessors.getClass();
        return accessors;
    }

    @Override // defpackage.agez
    public agfk getAnnotations() {
        agfk annotations = this.$$delegate_0.getAnnotations();
        annotations.getClass();
        return annotations;
    }

    @Override // defpackage.agdn
    public agce getBackingField() {
        return this.$$delegate_0.getBackingField();
    }

    @Override // defpackage.agem
    public ahuh<?> getCompileTimeInitializer() {
        return this.$$delegate_0.getCompileTimeInitializer();
    }

    @Override // defpackage.agbj, defpackage.agbi
    public agbi getContainingDeclaration() {
        agbi containingDeclaration = this.$$delegate_0.getContainingDeclaration();
        containingDeclaration.getClass();
        return containingDeclaration;
    }

    @Override // defpackage.agav
    public List<agdq> getContextReceiverParameters() {
        List<agdq> contextReceiverParameters = this.$$delegate_0.getContextReceiverParameters();
        contextReceiverParameters.getClass();
        return contextReceiverParameters;
    }

    @Override // defpackage.agdn
    public agce getDelegateField() {
        return this.$$delegate_0.getDelegateField();
    }

    @Override // defpackage.agav
    public agdq getDispatchReceiverParameter() {
        return this.$$delegate_0.getDispatchReceiverParameter();
    }

    @Override // defpackage.agav
    public agdq getExtensionReceiverParameter() {
        return this.$$delegate_0.getExtensionReceiverParameter();
    }

    @Override // defpackage.agdn
    public agdo getGetter() {
        return this.$$delegate_0.getGetter();
    }

    @Override // defpackage.agax
    public agaw getKind() {
        agaw kind = this.$$delegate_0.getKind();
        kind.getClass();
        return kind;
    }

    @Override // defpackage.agco
    public agcq getModality() {
        agcq modality = this.$$delegate_0.getModality();
        modality.getClass();
        return modality;
    }

    @Override // defpackage.agcw
    public ahnj getName() {
        ahnj name = this.$$delegate_0.getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.agbi
    public agdn getOriginal() {
        agdn original = this.$$delegate_0.getOriginal();
        original.getClass();
        return original;
    }

    @Override // defpackage.agdn, defpackage.agax, defpackage.agav
    public Collection<? extends agdn> getOverriddenDescriptors() {
        Collection overriddenDescriptors = this.$$delegate_0.getOverriddenDescriptors();
        overriddenDescriptors.getClass();
        return overriddenDescriptors;
    }

    @Override // defpackage.agav
    public aigl getReturnType() {
        return this.$$delegate_0.getReturnType();
    }

    @Override // defpackage.agdn
    public agdp getSetter() {
        return this.$$delegate_0.getSetter();
    }

    @Override // defpackage.agbl
    public agdx getSource() {
        agdx source = this.$$delegate_0.getSource();
        source.getClass();
        return source;
    }

    @Override // defpackage.agek
    public aigl getType() {
        aigl type = this.$$delegate_0.getType();
        type.getClass();
        return type;
    }

    @Override // defpackage.agav
    public List<agee> getTypeParameters() {
        List<agee> typeParameters = this.$$delegate_0.getTypeParameters();
        typeParameters.getClass();
        return typeParameters;
    }

    @Override // defpackage.agav
    public <V> V getUserData(agau<V> agauVar) {
        return (V) this.$$delegate_0.getUserData(agauVar);
    }

    @Override // defpackage.agav
    public List<agel> getValueParameters() {
        List<agel> valueParameters = this.$$delegate_0.getValueParameters();
        valueParameters.getClass();
        return valueParameters;
    }

    @Override // defpackage.agbm
    public agcc getVisibility() {
        agcc visibility = this.$$delegate_0.getVisibility();
        visibility.getClass();
        return visibility;
    }

    @Override // defpackage.agav
    public boolean hasSynthesizedParameterNames() {
        return this.$$delegate_0.hasSynthesizedParameterNames();
    }

    @Override // defpackage.agco
    public boolean isActual() {
        return this.$$delegate_0.isActual();
    }

    @Override // defpackage.agem
    public boolean isConst() {
        return this.$$delegate_0.isConst();
    }

    @Override // defpackage.agen
    public boolean isDelegated() {
        return this.$$delegate_0.isDelegated();
    }

    @Override // defpackage.agco
    public boolean isExpect() {
        return this.$$delegate_0.isExpect();
    }

    @Override // defpackage.agco
    public boolean isExternal() {
        return this.$$delegate_0.isExternal();
    }

    @Override // defpackage.agem
    public boolean isLateInit() {
        return this.$$delegate_0.isLateInit();
    }

    @Override // defpackage.agem
    public boolean isVar() {
        return this.$$delegate_0.isVar();
    }

    @Override // defpackage.agax
    public void setOverriddenDescriptors(Collection<? extends agax> collection) {
        collection.getClass();
        this.$$delegate_0.setOverriddenDescriptors(collection);
    }

    @Override // defpackage.agea
    public agdn substitute(aiiy aiiyVar) {
        aiiyVar.getClass();
        return this.$$delegate_0.substitute(aiiyVar);
    }
}
