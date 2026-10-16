package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public final class agws extends aggv implements aguz {
    public static final agwp Companion = new agwp(null);
    private static final Set<String> PUBLIC_METHOD_NAMES_IN_OBJECT = woy.di(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    private final agba additionalSupertypeClassDescriptor;
    private final agfk annotations;
    private final agvu c;
    private final aiec<List<agee>> declaredParameters;
    private final ahwx innerClassesScope;
    private final boolean isInner;
    private final agzj jClass;
    private final agbb kind;
    private final agcq modality;
    private final aezr moduleAnnotations$delegate;
    private final agvu outerContext;
    private final agdu<agxf> scopeHolder;
    private final agyo staticScope;
    private final agwr typeConstructor;
    private final agxf unsubstitutedMemberScope;
    private final agey visibility;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agws(agvu agvuVar, agbi agbiVar, agzj agzjVar, agba agbaVar) {
        agcq agcqVarConvertFromFlags;
        super(agvuVar.getStorageManager(), agbiVar, agzjVar.getName(), agvuVar.getComponents().getSourceElementFactory().source(agzjVar), false);
        agvuVar.getClass();
        agbiVar.getClass();
        agzjVar.getClass();
        this.outerContext = agvuVar;
        this.jClass = agzjVar;
        this.additionalSupertypeClassDescriptor = agbaVar;
        agvu agvuVarChildForClassOrPackage$default = agvk.childForClassOrPackage$default(agvuVar, this, agzjVar, 0, 4, null);
        this.c = agvuVarChildForClassOrPackage$default;
        agvuVarChildForClassOrPackage$default.getComponents().getJavaResolverCache().recordClass(agzjVar, this);
        agzjVar.getLightClassOriginKind();
        this.moduleAnnotations$delegate = woy.dG(new agwm(this));
        this.kind = agzjVar.isAnnotationType() ? agbb.ANNOTATION_CLASS : agzjVar.isInterface() ? agbb.INTERFACE : agzjVar.isEnum() ? agbb.ENUM_CLASS : agbb.CLASS;
        if (agzjVar.isAnnotationType() || agzjVar.isEnum()) {
            agcqVarConvertFromFlags = agcq.FINAL;
        } else {
            agcqVarConvertFromFlags = agcq.Companion.convertFromFlags(agzjVar.isSealed(), agzjVar.isSealed() || agzjVar.isAbstract() || agzjVar.isInterface(), !agzjVar.isFinal());
        }
        this.modality = agcqVarConvertFromFlags;
        this.visibility = agzjVar.getVisibility();
        this.isInner = (agzjVar.getOuterClass() == null || agzjVar.isStatic()) ? false : true;
        this.typeConstructor = new agwr(this);
        agxf agxfVar = new agxf(agvuVarChildForClassOrPackage$default, this, agzjVar, agbaVar != null, null, 16, null);
        this.unsubstitutedMemberScope = agxfVar;
        this.scopeHolder = agdu.Companion.create(this, agvuVarChildForClassOrPackage$default.getStorageManager(), agvuVarChildForClassOrPackage$default.getComponents().getKotlinTypeChecker().getKotlinTypeRefiner(), new agwn(this));
        this.innerClassesScope = new ahwx(agxfVar);
        this.staticScope = new agyo(agvuVarChildForClassOrPackage$default, agzjVar, this);
        this.annotations = agvr.resolveAnnotations(agvuVarChildForClassOrPackage$default, agzjVar);
        this.declaredParameters = agvuVarChildForClassOrPackage$default.getStorageManager().createLazyValue(new agwo(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List declaredParameters$lambda$0(agws agwsVar) {
        List<agzx> typeParameters = agwsVar.jClass.getTypeParameters();
        ArrayList arrayList = new ArrayList(woy.bp(typeParameters, 10));
        for (agzx agzxVar : typeParameters) {
            agee ageeVarResolveTypeParameter = agwsVar.c.getTypeParameterResolver().resolveTypeParameter(agzxVar);
            if (ageeVarResolveTypeParameter == null) {
                throw new AssertionError("Parameter " + agzxVar + " surely belongs to class " + agwsVar.jClass + ", so it must be resolved");
            }
            arrayList.add(ageeVarResolveTypeParameter);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List moduleAnnotations_delegate$lambda$0(agws agwsVar) {
        ahnd classId = ahvz.getClassId(agwsVar);
        if (classId != null) {
            return agwsVar.outerContext.getComponents().getJavaModuleResolver().getAnnotationsForModuleOwnerOfClass(classId);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agxf scopeHolder$lambda$0(agws agwsVar, aiju aijuVar) {
        aijuVar.getClass();
        return new agxf(agwsVar.c, agwsVar, agwsVar.jClass, agwsVar.additionalSupertypeClassDescriptor != null, agwsVar.unsubstitutedMemberScope);
    }

    public final agws copy$org_jetbrains_kotlin_descriptors_jvm(agup agupVar, agba agbaVar) {
        agupVar.getClass();
        agvu agvuVarReplaceComponents = agvk.replaceComponents(this.c, this.c.getComponents().replace(agupVar));
        agbi containingDeclaration = getContainingDeclaration();
        containingDeclaration.getClass();
        return new agws(agvuVarReplaceComponents, containingDeclaration, this.jClass, agbaVar);
    }

    @Override // defpackage.agez
    public agfk getAnnotations() {
        return this.annotations;
    }

    @Override // defpackage.agba
    public agba getCompanionObjectDescriptor() {
        return null;
    }

    @Override // defpackage.agba
    public List<agaz> getConstructors() {
        return this.unsubstitutedMemberScope.getConstructors$org_jetbrains_kotlin_descriptors_jvm().invoke();
    }

    @Override // defpackage.agba, defpackage.agbe
    public List<agee> getDeclaredTypeParameters() {
        return this.declaredParameters.invoke();
    }

    public final agzj getJClass() {
        return this.jClass;
    }

    @Override // defpackage.agba
    public agbb getKind() {
        return this.kind;
    }

    @Override // defpackage.agba, defpackage.agco
    public agcq getModality() {
        return this.modality;
    }

    public final List<agzf> getModuleAnnotations() {
        return (List) this.moduleAnnotations$delegate.a();
    }

    @Override // defpackage.agba
    public ahxe getStaticScope() {
        return this.staticScope;
    }

    @Override // defpackage.agbd
    public aiid getTypeConstructor() {
        return this.typeConstructor;
    }

    @Override // defpackage.aggh, defpackage.agba
    public ahxe getUnsubstitutedInnerClassesScope() {
        return this.innerClassesScope;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aghw
    public agxf getUnsubstitutedMemberScope(aiju aijuVar) {
        aijuVar.getClass();
        return (agxf) this.scopeHolder.getScope(aijuVar);
    }

    @Override // defpackage.agba
    public agaz getUnsubstitutedPrimaryConstructor() {
        return null;
    }

    @Override // defpackage.agba
    public agej<aigw> getValueClassRepresentation() {
        return null;
    }

    @Override // defpackage.agba, defpackage.agco, defpackage.agbm
    public agcc getVisibility() {
        if (!affa.f(this.visibility, agcb.PRIVATE) || this.jClass.getOuterClass() != null) {
            return agub.toDescriptorVisibility(this.visibility);
        }
        agcc agccVar = agsv.PACKAGE_VISIBILITY;
        agccVar.getClass();
        return agccVar;
    }

    @Override // defpackage.agco
    public boolean isActual() {
        return false;
    }

    @Override // defpackage.agba
    public boolean isCompanionObject() {
        return false;
    }

    @Override // defpackage.agba
    public boolean isData() {
        return false;
    }

    @Override // defpackage.agco
    public boolean isExpect() {
        return false;
    }

    @Override // defpackage.agba
    public boolean isFun() {
        return false;
    }

    @Override // defpackage.agba
    public boolean isInline() {
        return false;
    }

    @Override // defpackage.agbe
    public boolean isInner() {
        return this.isInner;
    }

    @Override // defpackage.agba
    public boolean isValue() {
        return false;
    }

    public String toString() {
        ahnh fqNameUnsafe = ahvz.getFqNameUnsafe(this);
        Objects.toString(fqNameUnsafe);
        return "Lazy Java class ".concat(fqNameUnsafe.toString());
    }

    @Override // defpackage.aggh, defpackage.agba
    public agxf getUnsubstitutedMemberScope() {
        ahxe unsubstitutedMemberScope = super.getUnsubstitutedMemberScope();
        unsubstitutedMemberScope.getClass();
        return (agxf) unsubstitutedMemberScope;
    }

    public /* synthetic */ agws(agvu agvuVar, agbi agbiVar, agzj agzjVar, agba agbaVar, int i, afeu afeuVar) {
        this(agvuVar, agbiVar, agzjVar, (i & 8) != 0 ? null : agbaVar);
    }
}
