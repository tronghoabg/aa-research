package defpackage;

/* JADX INFO: loaded from: D:\AA\aa-apk-unpacked\classes.dex */
public final class afrw<T> extends afsj implements defpackage.afgd, defpackage.afie, afsx, aind {
    public static final defpackage.afqt Companion = new defpackage.afqt(null);
    private static final java.util.Set<java.lang.String> SPECIAL_JVM_ANNOTATION_NAMES;
    private final defpackage.afar<afrs> data;
    private final java.lang.Class<T> jClass;

    static {
        java.util.Set special_annotations = afyo.INSTANCE.getSPECIAL_ANNOTATIONS();
        java.util.HashSet hashSet = new java.util.HashSet();
        java.util.Iterator<T> it = special_annotations.iterator();
        while (it.hasNext()) {
            hashSet.add(((ahod) it.next()).asSingleFqName().toString());
        }
        SPECIAL_JVM_ANNOTATION_NAMES = hashSet;
    }

    public afrw(java.lang.Class<T> cls) {
        cls.getClass();
        this.jClass = cls;
        this.data = defpackage.afga.cB(2, new defpackage.afqr(this));
    }

    private final agca createSyntheticClass(ahod ahodVar, agkq agkqVar) {
        aghw aghwVar = new aghw(new agib(agkqVar.getModule(), ahodVar.getPackageFqName()), ahodVar.getShortClassName(), agdq.FINAL, agcb.CLASS, defpackage.afga.aa(agkqVar.getModule().getBuiltIns().getAny().getDefaultType()), agex.NO_SOURCE, false, agkqVar.getDeserialization().getStorageManager());
        aghwVar.initialize(new afru(aghwVar, agkqVar.getDeserialization().getStorageManager()), defpackage.afcg.a, (agbz) null);
        return aghwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: Thrown type has an unknown type hierarchy: afuw */
    public final agca createSyntheticClassOrFail(ahod ahodVar, agkq agkqVar) throws afuw {
        ahhb classHeader;
        if (getJClass().isSynthetic()) {
            return createSyntheticClass(ahodVar, agkqVar);
        }
        agkk agkkVarCreate = agkk.Factory.create(getJClass());
        ahha kind = null;
        if (agkkVarCreate != null && (classHeader = agkkVarCreate.getClassHeader()) != null) {
            kind = classHeader.getKind();
        }
        if (kind != null) {
            int iOrdinal = kind.ordinal();
            if (iOrdinal == 0) {
                throw new afuw("Unknown class: " + getJClass() + " (kind = " + kind + ')');
            }
            if (iOrdinal != 1) {
                if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
                    return createSyntheticClass(ahodVar, agkqVar);
                }
                throw new defpackage.afas();
            }
        }
        throw new afuw("Unresolved class: " + getJClass() + " (kind = " + kind + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afrs data$lambda$0(defpackage.afrw afrwVar) {
        return new afrs(afrwVar);
    }

    private final agoq getKmClass() {
        return ((afrs) this.data.a()).getKmClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agen getLocalPropertyDescriptor$lambda$0$0$0(aiay aiayVar, ahjs ahjsVar) {
        aiayVar.getClass();
        ahjsVar.getClass();
        return aiayVar.loadProperty(ahjsVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:12:0x0042  */
    public final java.util.Collection<aflo<?>> getMembers(ahye ahyeVar, afrt afrtVar) {
        aflo afloVar;
        afrv afrvVar = new afrv(this);
        java.util.Collection<agbx> contributedDescriptors$default = ahyh.getContributedDescriptors$default(ahyeVar, (ahxt) null, (defpackage.affc) null, 3, (java.lang.Object) null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (agbx agbxVar : contributedDescriptors$default) {
            if (agbxVar instanceof agbx) {
                agbx agbxVar2 = agbxVar;
                if (defpackage.afga.f(agbxVar2.getVisibility(), agdb.INVISIBLE_FAKE) || !afrtVar.accept(agbxVar2)) {
                    afloVar = null;
                } else {
                    afloVar = (aflo) agbxVar.accept(afrvVar, defpackage.afbk.a);
                }
            } else {
                afloVar = null;
            }
            if (afloVar != null) {
                arrayList.add(afloVar);
            }
        }
        return defpackage.afga.aZ(arrayList);
    }

    private final agpx getModality() {
        agpx modality;
        agoq kmClass = getKmClass();
        if (kmClass != null && (modality = agno.getModality(kmClass)) != null) {
            return modality;
        }
        if (getJClass().isAnnotation() || getJClass().isEnum()) {
            return agpx.FINAL;
        }
        if (defpackage.afga.f(agkx.INSTANCE.loadIsSealed(getJClass()), java.lang.Boolean.TRUE)) {
            return agpx.SEALED;
        }
        if (java.lang.reflect.Modifier.isAbstract(getJClass().getModifiers())) {
            return agpx.ABSTRACT;
        }
        return !java.lang.reflect.Modifier.isFinal(getJClass().getModifiers()) ? agpx.OPEN : agpx.FINAL;
    }

    public boolean equals(java.lang.Object obj) {
        return (obj instanceof defpackage.afrw) && defpackage.afga.f(defpackage.afga.i(this), defpackage.afga.i((defpackage.afie) obj));
    }

    @Override // defpackage.afgd
    public java.lang.reflect.GenericDeclaration findJavaDeclaration() {
        return getJClass();
    }

    @Override // defpackage.afic
    public java.util.List<java.lang.annotation.Annotation> getAnnotations() {
        return ((afrs) this.data.a()).getAnnotations();
    }

    public final ahod getClassId$kotlin_reflection() {
        return afwg.INSTANCE.mapJvmClassToKotlinClassId(getJClass());
    }

    public final agnp getClassKind$kotlin_reflection() {
        agnp kind;
        agoq kmClass = getKmClass();
        if (kmClass != null && (kind = agno.getKind(kmClass)) != null) {
            return kind;
        }
        if (getJClass().isAnnotation()) {
            return agnp.ANNOTATION_CLASS;
        }
        if (getJClass().isInterface()) {
            return agnp.INTERFACE;
        }
        if (getJClass().isEnum()) {
            return agnp.ENUM_CLASS;
        }
        return getJClass().getSuperclass().isEnum() ? agnp.ENUM_ENTRY : agnp.CLASS;
    }

    public java.util.Collection<agch> getConstructorDescriptors() {
        java.util.Collection<agch> constructors = getDescriptor().getConstructors();
        constructors.getClass();
        return constructors;
    }

    @Override // defpackage.afie
    public java.util.Collection<defpackage.afih<T>> getConstructors() {
        return ((afrs) this.data.a()).getConstructors();
    }

    public java.util.Collection<agow> getConstructorsMetadata() {
        agoq kmClass = getKmClass();
        java.util.List constructors = kmClass != null ? kmClass.getConstructors() : null;
        return constructors == null ? defpackage.afce.a : constructors;
    }

    public final defpackage.afar<afrs> getData() {
        return this.data;
    }

    public final agca getDescriptor() {
        return ((afrs) this.data.a()).getDescriptor();
    }

    public java.util.Collection<agdj> getFunctions(ahoj ahojVar) {
        ahojVar.getClass();
        return defpackage.afga.aS(getMemberScope$kotlin_reflection().getContributedFunctions(ahojVar, agmr.FROM_REFLECTION), getStaticScope$kotlin_reflection().getContributedFunctions(ahojVar, agmr.FROM_REFLECTION));
    }

    public final java.lang.String getInlineClassUnderlyingPropertyName$kotlin_reflection() {
        agoq kmClass = getKmClass();
        if (kmClass != null) {
            return kmClass.getInlineClassUnderlyingPropertyName();
        }
        return null;
    }

    public final afjb getInlineClassUnderlyingType$kotlin_reflection() {
        return ((afrs) this.data.a()).getInlineClassUnderlyingType$kotlin_reflection();
    }

    public java.lang.Class<T> getJClass() {
        return this.jClass;
    }

    public agen getLocalPropertyDescriptor(int i) {
        aict descriptor = getDescriptor();
        aict aictVar = descriptor instanceof aict ? descriptor : null;
        if (aictVar != null) {
            ahic classProto = aictVar.getClassProto();
            ahpp ahppVar = ahnh.classLocalVariable;
            ahppVar.getClass();
            ahjs ahjsVar = (ahjs) ahmf.getExtensionOrNull(classProto, ahppVar, i);
            if (ahjsVar != null) {
                return afwu.deserializeToDescriptor(getJClass(), new afvc(this), ahjsVar, aictVar.getC().getNameResolver(), aictVar.getC().getTypeTable(), aictVar.getMetadataVersion(), afqs.INSTANCE);
            }
        }
        return null;
    }

    public agpj getLocalPropertyMetadata(int i) {
        java.util.List localDelegatedProperties;
        agoq kmClass = getKmClass();
        if (kmClass == null || (localDelegatedProperties = agrk.getLocalDelegatedProperties(kmClass)) == null) {
            return null;
        }
        return (agpj) defpackage.afga.aC(localDelegatedProperties, i);
    }

    public final ahye getMemberScope$kotlin_reflection() {
        return getDescriptor().getDefaultType().getMemberScope();
    }

    public final java.lang.String getModuleName$kotlin_reflection() {
        agoq kmClass = getKmClass();
        if (kmClass != null) {
            return agrk.getModuleName(kmClass);
        }
        return null;
    }

    @Override // defpackage.afie
    public java.util.Collection<defpackage.afie<?>> getNestedClasses() {
        return ((afrs) this.data.a()).getNestedClasses();
    }

    @Override // defpackage.afie
    public T getObjectInstance() {
        return (T) ((afrs) this.data.a()).getObjectInstance();
    }

    public java.util.Collection<agen> getProperties(ahoj ahojVar) {
        ahojVar.getClass();
        return defpackage.afga.aS(getMemberScope$kotlin_reflection().getContributedVariables(ahojVar, agmr.FROM_REFLECTION), getStaticScope$kotlin_reflection().getContributedVariables(ahojVar, agmr.FROM_REFLECTION));
    }

    @Override // defpackage.afie
    public java.lang.String getQualifiedName() {
        return ((afrs) this.data.a()).getQualifiedName();
    }

    @Override // defpackage.afie
    public java.util.List<defpackage.afie<? extends T>> getSealedSubclasses() {
        return ((afrs) this.data.a()).getSealedSubclasses();
    }

    @Override // defpackage.afie
    public java.lang.String getSimpleName() {
        return ((afrs) this.data.a()).getSimpleName();
    }

    public final ahye getStaticScope$kotlin_reflection() {
        ahye staticScope = getDescriptor().getStaticScope();
        staticScope.getClass();
        return staticScope;
    }

    @Override // defpackage.afie
    public java.util.List<afjb> getSupertypes() {
        return ((afrs) this.data.a()).getSupertypes();
    }

    public final afwq getTypeParameterTable$kotlin_reflection() {
        return ((afrs) this.data.a()).getTypeParameterTable$kotlin_reflection();
    }

    @Override // defpackage.afie
    public java.util.List<afjc> getTypeParameters() {
        return ((afrs) this.data.a()).getTypeParameters();
    }

    @Override // defpackage.afie
    public afjf getVisibility() {
        agdc visibility = getDescriptor().getVisibility();
        visibility.getClass();
        return afwu.toKVisibility(visibility);
    }

    @Override // defpackage.afie
    public int hashCode() {
        return defpackage.afga.i(this).hashCode();
    }

    @Override // defpackage.afie
    public boolean isAbstract() {
        return getModality() == agpx.ABSTRACT;
    }

    @Override // defpackage.afie
    public boolean isCompanion() {
        agoq kmClass = getKmClass();
        return (kmClass != null ? agno.getKind(kmClass) : null) == agnp.COMPANION_OBJECT;
    }

    @Override // defpackage.afie
    public boolean isData() {
        agoq kmClass = getKmClass();
        return kmClass != null && agno.isData(kmClass);
    }

    @Override // defpackage.afie
    public boolean isFinal() {
        return getModality() == agpx.FINAL;
    }

    @Override // defpackage.afie
    public boolean isFun() {
        agoq kmClass = getKmClass();
        return kmClass != null && agno.isFunInterface(kmClass);
    }

    @Override // defpackage.afie
    public boolean isInner() {
        agoq kmClass = getKmClass();
        if (kmClass == null) {
            return (getJClass().getDeclaringClass() == null || java.lang.reflect.Modifier.isStatic(getJClass().getModifiers())) ? false : true;
        }
        return agno.isInner(kmClass);
    }

    @Override // defpackage.afie
    public boolean isInstance(java.lang.Object obj) {
        java.lang.Integer functionClassArity = aglc.getFunctionClassArity(getJClass());
        if (functionClassArity != null) {
            return defpackage.afgz.d(obj, functionClassArity.intValue());
        }
        java.lang.Class<T> wrapperByPrimitive = aglc.getWrapperByPrimitive(getJClass());
        if (wrapperByPrimitive == null) {
            wrapperByPrimitive = getJClass();
        }
        return wrapperByPrimitive.isInstance(obj);
    }

    @Override // defpackage.afie
    public boolean isOpen() {
        return getModality() == agpx.OPEN;
    }

    @Override // defpackage.afie
    public boolean isSealed() {
        return getModality() == agpx.SEALED;
    }

    @Override // defpackage.afie
    public boolean isValue() {
        agoq kmClass = getKmClass();
        return kmClass != null && agno.isValue(kmClass);
    }

    public java.lang.String toString() {
        java.lang.String str;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("class ");
        ahod classId$kotlin_reflection = getClassId$kotlin_reflection();
        ahof packageFqName = classId$kotlin_reflection.getPackageFqName();
        if (packageFqName.isRoot()) {
            str = "";
        } else {
            str = packageFqName.asString() + '.';
        }
        sb.append(str.concat(afzh.I(classId$kotlin_reflection.getRelativeClassName().asString(), '.', '$')));
        return sb.toString();
    }

    @Override // defpackage.afie
    public java.util.Collection<defpackage.afid<?>> getMembers() {
        return ((afrs) this.data.a()).getAllMembers();
    }
}
