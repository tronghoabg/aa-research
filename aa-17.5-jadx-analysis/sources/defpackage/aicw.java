package defpackage;

import java.util.List;

/* loaded from: classes3.dex */
public final class aicw extends aggo implements aibw {
    private final aibv containerSource;
    private aigw defaultTypeImpl;
    private aigw expandedType;
    private final ahld nameResolver;
    private final ahjq proto;
    private List<? extends agee> typeConstructorParameters;
    private final ahlh typeTable;
    private aigw underlyingType;
    private final ahln versionRequirementTable;

    /* JADX WARN: Illegal instructions before constructor call */
    public aicw(aiei aieiVar, agbi agbiVar, agfk agfkVar, ahnj ahnjVar, agcc agccVar, ahjq ahjqVar, ahld ahldVar, ahlh ahlhVar, ahln ahlnVar, aibv aibvVar) {
        aieiVar.getClass();
        agbiVar.getClass();
        agfkVar.getClass();
        ahnjVar.getClass();
        agccVar.getClass();
        ahjqVar.getClass();
        ahldVar.getClass();
        ahlhVar.getClass();
        ahlnVar.getClass();
        agdx agdxVar = agdx.NO_SOURCE;
        agdxVar.getClass();
        super(aieiVar, agbiVar, agfkVar, ahnjVar, agdxVar, agccVar);
        this.proto = ahjqVar;
        this.nameResolver = ahldVar;
        this.typeTable = ahlhVar;
        this.versionRequirementTable = ahlnVar;
        this.containerSource = aibvVar;
    }

    @Override // defpackage.aged
    public agba getClassDescriptor() {
        if (aigr.isError(getExpandedType())) {
            return null;
        }
        agbd declarationDescriptor = getExpandedType().getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor instanceof agba) {
            return (agba) declarationDescriptor;
        }
        return null;
    }

    @Override // defpackage.aibw
    public aibv getContainerSource() {
        return this.containerSource;
    }

    @Override // defpackage.agbd
    public aigw getDefaultType() {
        aigw aigwVar = this.defaultTypeImpl;
        if (aigwVar != null) {
            return aigwVar;
        }
        affa.d("defaultTypeImpl");
        return null;
    }

    @Override // defpackage.aged
    public aigw getExpandedType() {
        aigw aigwVar = this.expandedType;
        if (aigwVar != null) {
            return aigwVar;
        }
        affa.d("expandedType");
        return null;
    }

    @Override // defpackage.aibw
    public ahld getNameResolver() {
        return this.nameResolver;
    }

    @Override // defpackage.aggo
    protected List<agee> getTypeConstructorTypeParameters() {
        List list = this.typeConstructorParameters;
        if (list != null) {
            return list;
        }
        affa.d("typeConstructorParameters");
        return null;
    }

    @Override // defpackage.aibw
    public ahlh getTypeTable() {
        return this.typeTable;
    }

    @Override // defpackage.aged
    public aigw getUnderlyingType() {
        aigw aigwVar = this.underlyingType;
        if (aigwVar != null) {
            return aigwVar;
        }
        affa.d("underlyingType");
        return null;
    }

    public ahln getVersionRequirementTable() {
        return this.versionRequirementTable;
    }

    public final void initialize(List<? extends agee> list, aigw aigwVar, aigw aigwVar2) {
        list.getClass();
        aigwVar.getClass();
        aigwVar2.getClass();
        initialize(list);
        this.underlyingType = aigwVar;
        this.expandedType = aigwVar2;
        this.typeConstructorParameters = agei.computeConstructorTypeParameters(this);
        this.defaultTypeImpl = computeDefaultType();
    }

    @Override // defpackage.agea
    public aged substitute(aiiy aiiyVar) {
        aiiyVar.getClass();
        if (aiiyVar.isEmpty()) {
            return this;
        }
        aiei storageManager = getStorageManager();
        agbi containingDeclaration = getContainingDeclaration();
        containingDeclaration.getClass();
        agfk annotations = getAnnotations();
        annotations.getClass();
        ahnj name = getName();
        name.getClass();
        aicw aicwVar = new aicw(storageManager, containingDeclaration, annotations, name, getVisibility(), getProto(), getNameResolver(), getTypeTable(), getVersionRequirementTable(), getContainerSource());
        List<agee> declaredTypeParameters = getDeclaredTypeParameters();
        aigl aiglVarSafeSubstitute = aiiyVar.safeSubstitute(getUnderlyingType(), aijg.INVARIANT);
        aiglVarSafeSubstitute.getClass();
        aigw aigwVarAsSimpleType = aiiu.asSimpleType(aiglVarSafeSubstitute);
        aigl aiglVarSafeSubstitute2 = aiiyVar.safeSubstitute(getExpandedType(), aijg.INVARIANT);
        aiglVarSafeSubstitute2.getClass();
        aicwVar.initialize(declaredTypeParameters, aigwVarAsSimpleType, aiiu.asSimpleType(aiglVarSafeSubstitute2));
        return aicwVar;
    }

    @Override // defpackage.aibw
    public ahjq getProto() {
        return this.proto;
    }
}
