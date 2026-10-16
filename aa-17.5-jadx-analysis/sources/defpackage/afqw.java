package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* loaded from: classes.dex */
public final class afqw<T> extends afrj implements affd, afhe, afrx, aimd {
    public static final afpt Companion = new afpt(null);
    private static final Set<String> SPECIAL_JVM_ANNOTATION_NAMES;
    private final aezr<afqs> data;
    private final Class<T> jClass;

    static {
        Set<ahnd> special_annotations = afxo.INSTANCE.getSPECIAL_ANNOTATIONS();
        HashSet hashSet = new HashSet();
        Iterator<T> it = special_annotations.iterator();
        while (it.hasNext()) {
            hashSet.add(((ahnd) it.next()).asSingleFqName().toString());
        }
        SPECIAL_JVM_ANNOTATION_NAMES = hashSet;
    }

    public afqw(Class<T> cls) {
        cls.getClass();
        this.jClass = cls;
        this.data = woy.dH(2, new afpr(this));
    }

    private final agba createSyntheticClass(ahnd ahndVar, agjq agjqVar) {
        aggw aggwVar = new aggw(new aghb(agjqVar.getModule(), ahndVar.getPackageFqName()), ahndVar.getShortClassName(), agcq.FINAL, agbb.CLASS, woy.bg(agjqVar.getModule().getBuiltIns().getAny().getDefaultType()), agdx.NO_SOURCE, false, agjqVar.getDeserialization().getStorageManager());
        aggwVar.initialize(new afqu(aggwVar, agjqVar.getDeserialization().getStorageManager()), afbg.a, null);
        return aggwVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final agba createSyntheticClassOrFail(ahnd ahndVar, agjq agjqVar) {
        ahgb classHeader;
        if (getJClass().isSynthetic()) {
            return createSyntheticClass(ahndVar, agjqVar);
        }
        agjk agjkVarCreate = agjk.Factory.create(getJClass());
        ahga kind = null;
        if (agjkVarCreate != null && (classHeader = agjkVarCreate.getClassHeader()) != null) {
            kind = classHeader.getKind();
        }
        if (kind != null) {
            int iOrdinal = kind.ordinal();
            if (iOrdinal == 0) {
                throw new aftw("Unknown class: " + getJClass() + " (kind = " + kind + ')');
            }
            if (iOrdinal != 1) {
                if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 5) {
                    return createSyntheticClass(ahndVar, agjqVar);
                }
                throw new aezs();
            }
        }
        throw new aftw("Unresolved class: " + getJClass() + " (kind = " + kind + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final afqs data$lambda$0(afqw afqwVar) {
        return new afqs(afqwVar);
    }

    private final agnq getKmClass() {
        return ((afqs) this.data.a()).getKmClass();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agdn getLocalPropertyDescriptor$lambda$0$0$0(ahzy ahzyVar, ahis ahisVar) {
        ahzyVar.getClass();
        ahisVar.getClass();
        return ahzyVar.loadProperty(ahisVar, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.Collection<defpackage.afko<?>> getMembers(defpackage.ahxe r7, defpackage.afqt r8) {
        /*
            r6 = this;
            afqv r0 = new afqv
            r0.<init>(r6)
            r6 = 3
            r1 = 0
            java.util.Collection r6 = defpackage.ahxh.getContributedDescriptors$default(r7, r1, r1, r6, r1)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r6 = r6.iterator()
        L14:
            boolean r2 = r6.hasNext()
            if (r2 == 0) goto L49
            java.lang.Object r2 = r6.next()
            agbi r2 = (defpackage.agbi) r2
            boolean r3 = r2 instanceof defpackage.agax
            if (r3 == 0) goto L42
            r3 = r2
            agax r3 = (defpackage.agax) r3
            agcc r4 = r3.getVisibility()
            agcc r5 = defpackage.agcb.INVISIBLE_FAKE
            boolean r4 = defpackage.affa.f(r4, r5)
            if (r4 != 0) goto L42
            boolean r3 = r8.accept(r3)
            if (r3 == 0) goto L42
            afak r3 = defpackage.afak.a
            java.lang.Object r2 = r2.accept(r0, r3)
            afko r2 = (defpackage.afko) r2
            goto L43
        L42:
            r2 = r1
        L43:
            if (r2 == 0) goto L14
            r7.add(r2)
            goto L14
        L49:
            java.util.List r6 = defpackage.woy.cf(r7)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afqw.getMembers(ahxe, afqt):java.util.Collection");
    }

    private final agox getModality() {
        agox modality;
        agnq kmClass = getKmClass();
        return (kmClass == null || (modality = agmo.getModality(kmClass)) == null) ? (getJClass().isAnnotation() || getJClass().isEnum()) ? agox.FINAL : affa.f(agjx.INSTANCE.loadIsSealed(getJClass()), true) ? agox.SEALED : Modifier.isAbstract(getJClass().getModifiers()) ? agox.ABSTRACT : !Modifier.isFinal(getJClass().getModifiers()) ? agox.OPEN : agox.FINAL : modality;
    }

    public boolean equals(Object obj) {
        return (obj instanceof afqw) && affa.f(affa.i(this), affa.i((afhe) obj));
    }

    @Override // defpackage.affd
    public GenericDeclaration findJavaDeclaration() {
        return getJClass();
    }

    @Override // defpackage.afhc
    public List<Annotation> getAnnotations() {
        return ((afqs) this.data.a()).getAnnotations();
    }

    public final ahnd getClassId$kotlin_reflection() {
        return afvg.INSTANCE.mapJvmClassToKotlinClassId(getJClass());
    }

    public final agmp getClassKind$kotlin_reflection() {
        agmp kind;
        agnq kmClass = getKmClass();
        return (kmClass == null || (kind = agmo.getKind(kmClass)) == null) ? getJClass().isAnnotation() ? agmp.ANNOTATION_CLASS : getJClass().isInterface() ? agmp.INTERFACE : getJClass().isEnum() ? agmp.ENUM_CLASS : getJClass().getSuperclass().isEnum() ? agmp.ENUM_ENTRY : agmp.CLASS : kind;
    }

    @Override // defpackage.afrj
    public Collection<agbh> getConstructorDescriptors() {
        Collection<agaz> constructors = getDescriptor().getConstructors();
        constructors.getClass();
        return constructors;
    }

    @Override // defpackage.afhe
    public Collection<afhh<T>> getConstructors() {
        return ((afqs) this.data.a()).getConstructors();
    }

    @Override // defpackage.afrj
    public Collection<agnw> getConstructorsMetadata() {
        agnq kmClass = getKmClass();
        List<agnw> constructors = kmClass != null ? kmClass.getConstructors() : null;
        return constructors == null ? afbe.a : constructors;
    }

    public final aezr<afqs> getData() {
        return this.data;
    }

    public final agba getDescriptor() {
        return ((afqs) this.data.a()).getDescriptor();
    }

    @Override // defpackage.afrj
    public Collection<agcj> getFunctions(ahnj ahnjVar) {
        ahnjVar.getClass();
        return woy.bY(getMemberScope$kotlin_reflection().getContributedFunctions(ahnjVar, aglr.FROM_REFLECTION), getStaticScope$kotlin_reflection().getContributedFunctions(ahnjVar, aglr.FROM_REFLECTION));
    }

    public final String getInlineClassUnderlyingPropertyName$kotlin_reflection() {
        agnq kmClass = getKmClass();
        if (kmClass != null) {
            return kmClass.getInlineClassUnderlyingPropertyName();
        }
        return null;
    }

    public final afib getInlineClassUnderlyingType$kotlin_reflection() {
        return ((afqs) this.data.a()).getInlineClassUnderlyingType$kotlin_reflection();
    }

    @Override // defpackage.afer
    public Class<T> getJClass() {
        return this.jClass;
    }

    @Override // defpackage.afrj
    public agdn getLocalPropertyDescriptor(int i) {
        agba descriptor = getDescriptor();
        aibt aibtVar = descriptor instanceof aibt ? (aibt) descriptor : null;
        if (aibtVar != null) {
            ahhc classProto = aibtVar.getClassProto();
            ahop<ahhc, List<ahis>> ahopVar = ahmh.classLocalVariable;
            ahopVar.getClass();
            ahis ahisVar = (ahis) ahlf.getExtensionOrNull(classProto, ahopVar, i);
            if (ahisVar != null) {
                return (agdn) afvu.deserializeToDescriptor(getJClass(), new afuc(this), ahisVar, aibtVar.getC().getNameResolver(), aibtVar.getC().getTypeTable(), aibtVar.getMetadataVersion(), afps.INSTANCE);
            }
        }
        return null;
    }

    @Override // defpackage.afrj
    public agoj getLocalPropertyMetadata(int i) {
        List<agoj> localDelegatedProperties;
        agnq kmClass = getKmClass();
        if (kmClass == null || (localDelegatedProperties = agqk.getLocalDelegatedProperties(kmClass)) == null) {
            return null;
        }
        return (agoj) woy.bI(localDelegatedProperties, i);
    }

    public final ahxe getMemberScope$kotlin_reflection() {
        return getDescriptor().getDefaultType().getMemberScope();
    }

    public final String getModuleName$kotlin_reflection() {
        agnq kmClass = getKmClass();
        if (kmClass != null) {
            return agqk.getModuleName(kmClass);
        }
        return null;
    }

    @Override // defpackage.afhe
    public Collection<afhe<?>> getNestedClasses() {
        return ((afqs) this.data.a()).getNestedClasses();
    }

    @Override // defpackage.afhe
    public T getObjectInstance() {
        return (T) ((afqs) this.data.a()).getObjectInstance();
    }

    @Override // defpackage.afrj
    public Collection<agdn> getProperties(ahnj ahnjVar) {
        ahnjVar.getClass();
        return woy.bY(getMemberScope$kotlin_reflection().getContributedVariables(ahnjVar, aglr.FROM_REFLECTION), getStaticScope$kotlin_reflection().getContributedVariables(ahnjVar, aglr.FROM_REFLECTION));
    }

    @Override // defpackage.afhe
    public String getQualifiedName() {
        return ((afqs) this.data.a()).getQualifiedName();
    }

    @Override // defpackage.afhe
    public List<afhe<? extends T>> getSealedSubclasses() {
        return ((afqs) this.data.a()).getSealedSubclasses();
    }

    @Override // defpackage.afhe
    public String getSimpleName() {
        return ((afqs) this.data.a()).getSimpleName();
    }

    public final ahxe getStaticScope$kotlin_reflection() {
        ahxe staticScope = getDescriptor().getStaticScope();
        staticScope.getClass();
        return staticScope;
    }

    @Override // defpackage.afhe
    public List<afib> getSupertypes() {
        return ((afqs) this.data.a()).getSupertypes();
    }

    public final afvq getTypeParameterTable$kotlin_reflection() {
        return ((afqs) this.data.a()).getTypeParameterTable$kotlin_reflection();
    }

    @Override // defpackage.afhe
    public List<afic> getTypeParameters() {
        return ((afqs) this.data.a()).getTypeParameters();
    }

    @Override // defpackage.afhe
    public afif getVisibility() {
        agcc visibility = getDescriptor().getVisibility();
        visibility.getClass();
        return afvu.toKVisibility(visibility);
    }

    @Override // defpackage.afhe
    public int hashCode() {
        return affa.i(this).hashCode();
    }

    @Override // defpackage.afhe
    public boolean isAbstract() {
        return getModality() == agox.ABSTRACT;
    }

    @Override // defpackage.afhe
    public boolean isCompanion() {
        agnq kmClass = getKmClass();
        return (kmClass != null ? agmo.getKind(kmClass) : null) == agmp.COMPANION_OBJECT;
    }

    @Override // defpackage.afhe
    public boolean isData() {
        agnq kmClass = getKmClass();
        return kmClass != null && agmo.isData(kmClass);
    }

    @Override // defpackage.afhe
    public boolean isFinal() {
        return getModality() == agox.FINAL;
    }

    @Override // defpackage.afhe
    public boolean isFun() {
        agnq kmClass = getKmClass();
        return kmClass != null && agmo.isFunInterface(kmClass);
    }

    @Override // defpackage.afhe
    public boolean isInner() {
        agnq kmClass = getKmClass();
        return kmClass == null ? (getJClass().getDeclaringClass() == null || Modifier.isStatic(getJClass().getModifiers())) ? false : true : agmo.isInner(kmClass);
    }

    @Override // defpackage.afhe
    public boolean isInstance(Object obj) {
        Integer functionClassArity = agkc.getFunctionClassArity(getJClass());
        if (functionClassArity != null) {
            return affz.d(obj, functionClassArity.intValue());
        }
        Class wrapperByPrimitive = agkc.getWrapperByPrimitive(getJClass());
        if (wrapperByPrimitive == null) {
            wrapperByPrimitive = getJClass();
        }
        return wrapperByPrimitive.isInstance(obj);
    }

    @Override // defpackage.afhe
    public boolean isOpen() {
        return getModality() == agox.OPEN;
    }

    @Override // defpackage.afhe
    public boolean isSealed() {
        return getModality() == agox.SEALED;
    }

    @Override // defpackage.afhe
    public boolean isValue() {
        agnq kmClass = getKmClass();
        return kmClass != null && agmo.isValue(kmClass);
    }

    public String toString() {
        String str;
        StringBuilder sb = new StringBuilder("class ");
        ahnd classId$kotlin_reflection = getClassId$kotlin_reflection();
        ahnf packageFqName = classId$kotlin_reflection.getPackageFqName();
        if (packageFqName.isRoot()) {
            str = "";
        } else {
            str = packageFqName.asString() + '.';
        }
        sb.append(str.concat(afyh.I(classId$kotlin_reflection.getRelativeClassName().asString(), '.', '$')));
        return sb.toString();
    }

    @Override // defpackage.afhe
    public Collection<afhd<?>> getMembers() {
        return ((afqs) this.data.a()).getAllMembers();
    }
}
