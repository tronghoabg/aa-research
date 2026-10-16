package defpackage;

import java.io.Serializable;
import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Metadata;

/* loaded from: classes.dex */
public final class afqs extends afri {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(afqs.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0), new affn(afqs.class, "annotations", "getAnnotations()Ljava/util/List;", 0), new affn(afqs.class, "simpleName", "getSimpleName()Ljava/lang/String;", 0), new affn(afqs.class, "qualifiedName", "getQualifiedName()Ljava/lang/String;", 0), new affn(afqs.class, "constructors", "getConstructors()Ljava/util/Collection;", 0), new affn(afqs.class, "nestedClasses", "getNestedClasses()Ljava/util/Collection;", 0), new affn(afqs.class, "typeParameters", "getTypeParameters()Ljava/util/List;", 0), new affn(afqs.class, "typeParameterTable", "getTypeParameterTable$kotlin_reflection()Lkotlin/reflect/jvm/internal/TypeParameterTable;", 0), new affn(afqs.class, "supertypes", "getSupertypes()Ljava/util/List;", 0), new affn(afqs.class, "sealedSubclasses", "getSealedSubclasses()Ljava/util/List;", 0), new affn(afqs.class, "declaredNonStaticMembers", "getDeclaredNonStaticMembers()Ljava/util/Collection;", 0), new affn(afqs.class, "declaredStaticMembers", "getDeclaredStaticMembers()Ljava/util/Collection;", 0), new affn(afqs.class, "inheritedNonStaticMembers_k1Impl", "getInheritedNonStaticMembers_k1Impl()Ljava/util/Collection;", 0), new affn(afqs.class, "inheritedStaticMembers_k1Impl", "getInheritedStaticMembers_k1Impl()Ljava/util/Collection;", 0), new affn(afqs.class, "allNonStaticMembers", "getAllNonStaticMembers()Ljava/util/Collection;", 0), new affn(afqs.class, "allStaticMembers", "getAllStaticMembers()Ljava/util/Collection;", 0), new affn(afqs.class, "declaredMembers", "getDeclaredMembers()Ljava/util/Collection;", 0), new affn(afqs.class, "allMembers", "getAllMembers()Ljava/util/Collection;", 0), new affn(afqs.class, "fakeOverrideMembers", "getFakeOverrideMembers$kotlin_reflection()Lkotlin/reflect/jvm/internal/FakeOverrideMembers;", 0)};
    private final afup allMembers$delegate;
    private final afup allNonStaticMembers$delegate;
    private final afup allStaticMembers$delegate;
    private final afup annotations$delegate;
    private final afup constructors$delegate;
    private final afup declaredMembers$delegate;
    private final afup declaredNonStaticMembers$delegate;
    private final afup declaredStaticMembers$delegate;
    private final afup descriptor$delegate;
    private final afup fakeOverrideMembers$delegate;
    private final afup inheritedNonStaticMembers_k1Impl$delegate;
    private final afup inheritedStaticMembers_k1Impl$delegate;
    private final aezr inlineClassUnderlyingType$delegate;
    private final aezr kmClass$delegate;
    private final afup nestedClasses$delegate;
    private final aezr objectInstance$delegate;
    private final afup qualifiedName$delegate;
    private final afup sealedSubclasses$delegate;
    private final afup simpleName$delegate;
    private final afup supertypes$delegate;
    final /* synthetic */ afqw this$0;
    private final afup typeParameterTable$delegate;
    private final afup typeParameters$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afqs(afqw afqwVar) {
        super(afqwVar);
        this.this$0 = afqwVar;
        this.kmClass$delegate = woy.dH(2, new afpu(afqwVar, this));
        this.descriptor$delegate = afus.lazySoft(new afqf(afqwVar));
        this.annotations$delegate = afus.lazySoft(new afqk(afqwVar, this));
        this.simpleName$delegate = afus.lazySoft(new afql(afqwVar, this));
        this.qualifiedName$delegate = afus.lazySoft(new afqm(afqwVar));
        this.constructors$delegate = afus.lazySoft(new afqn(afqwVar, this));
        this.nestedClasses$delegate = afus.lazySoft(new afqo(this, afqwVar));
        this.objectInstance$delegate = woy.dH(2, new afqp(this, afqwVar));
        this.typeParameters$delegate = afus.lazySoft(new afqq(this, afqwVar));
        this.typeParameterTable$delegate = afus.lazySoft(new afqr(this, afqwVar));
        this.supertypes$delegate = afus.lazySoft(new afpv(afqwVar, this));
        this.sealedSubclasses$delegate = afus.lazySoft(new afpw(afqwVar, this));
        this.inlineClassUnderlyingType$delegate = woy.dH(2, new afpx(this, afqwVar));
        this.declaredNonStaticMembers$delegate = afus.lazySoft(new afpy(afqwVar));
        this.declaredStaticMembers$delegate = afus.lazySoft(new afpz(this, afqwVar));
        this.inheritedNonStaticMembers_k1Impl$delegate = afus.lazySoft(new afqa(afqwVar));
        this.inheritedStaticMembers_k1Impl$delegate = afus.lazySoft(new afqb(afqwVar));
        this.allNonStaticMembers$delegate = afus.lazySoft(new afqc(this));
        this.allStaticMembers$delegate = afus.lazySoft(new afqd(this));
        this.declaredMembers$delegate = afus.lazySoft(new afqe(this));
        this.allMembers$delegate = afus.lazySoft(new afqg(this, afqwVar));
        this.fakeOverrideMembers$delegate = afus.lazySoft(new afqh(afqwVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection allMembers_delegate$lambda$0(afqs afqsVar, afqw afqwVar) {
        return afqsVar.useK1ImplementationForFakeOverrides() ? woy.bY(afqsVar.getAllNonStaticMembers(), afqsVar.getAllStaticMembers()) : afmz.getAllMembers(afqwVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List allNonStaticMembers_delegate$lambda$0(afqs afqsVar) {
        if (afqsVar.useK1ImplementationForFakeOverrides()) {
            return woy.bY(afqsVar.getDeclaredNonStaticMembers(), afqsVar.getInheritedNonStaticMembers_k1Impl());
        }
        Collection<afue<?>> allMembers = afqsVar.getAllMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allMembers) {
            if (!afmz.isStatic((afue) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List allStaticMembers_delegate$lambda$0(afqs afqsVar) {
        if (afqsVar.useK1ImplementationForFakeOverrides()) {
            return woy.bY(afqsVar.getDeclaredStaticMembers(), afqsVar.getInheritedStaticMembers_k1Impl());
        }
        Collection<afue<?>> allMembers = afqsVar.getAllMembers();
        ArrayList arrayList = new ArrayList();
        for (Object obj : allMembers) {
            if (afmz.isStatic((afue) obj)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List annotations_delegate$lambda$0(afqw afqwVar, afqs afqsVar) {
        List arrayList;
        Annotation[] annotations = afqwVar.getJClass().getAnnotations();
        if (annotations.length != afqwVar.getJClass().getDeclaredAnnotations().length) {
            ArrayList arrayList2 = new ArrayList();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Class jClass = afqwVar.getJClass();
            do {
                Annotation[] declaredAnnotations = jClass.getDeclaredAnnotations();
                int length = declaredAnnotations.length;
                while (true) {
                    length--;
                    if (length < 0) {
                        break;
                    }
                    Annotation annotation = declaredAnnotations[length];
                    if (!afqw.SPECIAL_JVM_ANNOTATION_NAMES.contains(affa.h(affa.k(annotation)).getName())) {
                        if (jClass != afqwVar.getJClass()) {
                            annotation.getClass();
                            if (afqsVar.isInheritable(annotation)) {
                            }
                        }
                        annotation.getClass();
                        afhe<? extends Annotation> unwrappedAnnotationClass = afvu.getUnwrappedAnnotationClass(annotation);
                        Class cls = (Class) linkedHashMap.get(unwrappedAnnotationClass);
                        if (cls == null) {
                            linkedHashMap.put(unwrappedAnnotationClass, jClass);
                        }
                        if (cls == null || affa.f(cls, jClass)) {
                            arrayList2.add(annotation);
                        }
                    }
                }
                jClass = jClass.getSuperclass();
            } while (jClass != null);
            arrayList = woy.ca(arrayList2);
        } else {
            annotations.getClass();
            arrayList = new ArrayList();
            for (Annotation annotation2 : annotations) {
                if (!afqw.SPECIAL_JVM_ANNOTATION_NAMES.contains(affa.h(affa.k(annotation2)).getName())) {
                    arrayList.add(annotation2);
                }
            }
        }
        return afvu.unwrapKotlinRepeatableAnnotations(arrayList);
    }

    private final String calculateLocalClassName(Class<?> cls) {
        String simpleName = cls.getSimpleName();
        Method enclosingMethod = cls.getEnclosingMethod();
        if (enclosingMethod != null) {
            simpleName.getClass();
            return afyh.o(simpleName, enclosingMethod.getName() + '$', simpleName);
        }
        Constructor<?> enclosingConstructor = cls.getEnclosingConstructor();
        if (enclosingConstructor == null) {
            simpleName.getClass();
            return afyh.N(simpleName, simpleName);
        }
        simpleName.getClass();
        return afyh.o(simpleName, enclosingConstructor.getName() + '$', simpleName);
    }

    private final List<afib> computeLegacySupertypes() {
        Collection<aigl> collectionMo89getSupertypes = getDescriptor().getTypeConstructor().mo89getSupertypes();
        collectionMo89getSupertypes.getClass();
        ArrayList arrayList = new ArrayList(collectionMo89getSupertypes.size());
        for (aigl aiglVar : collectionMo89getSupertypes) {
            afqw afqwVar = this.this$0;
            aiglVar.getClass();
            arrayList.add(new aiqp(aiglVar, new afqi(aiglVar, afqwVar)));
        }
        if (!afye.isSpecialClassWithNoSupertypes(getDescriptor())) {
            if (arrayList.isEmpty()) {
                arrayList.add(afvm.INSTANCE.getANY());
            } else {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    afhf classifier = ((afib) it.next()).getClassifier();
                    afqw afqwVar2 = classifier instanceof afqw ? (afqw) classifier : null;
                    if (afqwVar2 == null || (afqwVar2.getClassKind$kotlin_reflection() != agmp.INTERFACE && afqwVar2.getClassKind$kotlin_reflection() != agmp.ANNOTATION_CLASS)) {
                        break;
                    }
                }
                arrayList.add(afvm.INSTANCE.getANY());
            }
        }
        return aiow.compact(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type computeLegacySupertypes$lambda$0$0(aigl aiglVar, afqw afqwVar) {
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        if (!(declarationDescriptor instanceof agba)) {
            Objects.toString(declarationDescriptor);
            throw new aftw("Supertype not a class: ".concat(String.valueOf(declarationDescriptor)));
        }
        Class<?> javaClass = afvu.toJavaClass((agba) declarationDescriptor);
        if (javaClass == null) {
            throw new aftw(a.bt(declarationDescriptor, afqwVar, "Unsupported superclass of ", ": "));
        }
        if (affa.f(afqwVar.getJClass().getSuperclass(), javaClass)) {
            Type genericSuperclass = afqwVar.getJClass().getGenericSuperclass();
            genericSuperclass.getClass();
            return genericSuperclass;
        }
        Class<?>[] interfaces = afqwVar.getJClass().getInterfaces();
        interfaces.getClass();
        int iCP = woy.cP(interfaces, javaClass);
        if (iCP < 0) {
            throw new aftw(a.bt(declarationDescriptor, afqwVar, "No superclass of ", " in Java reflection for "));
        }
        Type type = afqwVar.getJClass().getGenericInterfaces()[iCP];
        type.getClass();
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List constructors_delegate$lambda$0(afqw afqwVar, afqs afqsVar) throws SecurityException {
        if (afqwVar.getClassKind$kotlin_reflection() == agmp.INTERFACE || afqwVar.getClassKind$kotlin_reflection() == agmp.OBJECT || afqwVar.getClassKind$kotlin_reflection() == agmp.COMPANION_OBJECT || afqwVar.getClassKind$kotlin_reflection() == agmp.ENUM_ENTRY || afqwVar.getJClass().isSynthetic()) {
            return afbe.a;
        }
        if (afvn.getUseK1Implementation() || afqsVar.isClassWithAdditionalConstructorsFromMappedType()) {
            Collection<agbh> constructorDescriptors = afqwVar.getConstructorDescriptors();
            ArrayList arrayList = new ArrayList(woy.bp(constructorDescriptors, 10));
            Iterator<T> it = constructorDescriptors.iterator();
            while (it.hasNext()) {
                arrayList.add(new afku(afqwVar, (agbh) it.next(), null, 4, null));
            }
            return arrayList;
        }
        if (afqsVar.getKmClass() != null) {
            Collection<agnw> constructorsMetadata = afqwVar.getConstructorsMetadata();
            ArrayList arrayList2 = new ArrayList(woy.bp(constructorsMetadata, 10));
            Iterator<T> it2 = constructorsMetadata.iterator();
            while (it2.hasNext()) {
                arrayList2.add(afjz.createUnboundConstructor((agnw) it2.next(), afqwVar));
            }
            return arrayList2;
        }
        if (afqwVar.getJClass().isAnnotationPresent(Metadata.class)) {
            return afbe.a;
        }
        if (afqwVar.getJClass().isAnnotation()) {
            return woy.bg(new afnl(afqwVar));
        }
        Constructor<?>[] declaredConstructors = afqwVar.getJClass().getDeclaredConstructors();
        declaredConstructors.getClass();
        ArrayList arrayList3 = new ArrayList();
        for (Constructor<?> constructor : declaredConstructors) {
            constructor.getClass();
            arrayList3.add(new afny(afqwVar, constructor, afeq.NO_RECEIVER));
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List declaredMembers_delegate$lambda$0(afqs afqsVar) {
        return woy.bY(afqsVar.getDeclaredNonStaticMembers(), afqsVar.getDeclaredStaticMembers());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection declaredNonStaticMembers_delegate$lambda$0(afqw afqwVar) {
        return afqwVar.getMembers(afqwVar.getMemberScope$kotlin_reflection(), afqt.DECLARED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection declaredStaticMembers_delegate$lambda$0(afqs afqsVar, afqw afqwVar) throws SecurityException {
        if (afvn.getUseK1Implementation() || afqsVar.getKmClass() != null || afqwVar.getClassKind$kotlin_reflection() == agmp.ENUM_ENTRY) {
            return afqwVar.getMembers(afqwVar.getStaticScope$kotlin_reflection(), afqt.DECLARED);
        }
        afbt afbtVar = new afbt(10);
        Method[] declaredMethods = afqwVar.getJClass().getDeclaredMethods();
        declaredMethods.getClass();
        for (Method method : declaredMethods) {
            if (Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                method.getClass();
                afbtVar.add(new afok(afqwVar, method, afeq.NO_RECEIVER, afpq.EMPTY));
            }
        }
        Field[] declaredFields = afqwVar.getJClass().getDeclaredFields();
        declaredFields.getClass();
        for (Field field : declaredFields) {
            if (!field.isEnumConstant() && Modifier.isStatic(field.getModifiers()) && !field.isSynthetic()) {
                if (Modifier.isFinal(field.getModifiers())) {
                    field.getClass();
                    afbtVar.add(new afox(afqwVar, field, afeq.NO_RECEIVER, afpq.EMPTY));
                } else {
                    field.getClass();
                    afbtVar.add(new afog(afqwVar, field, afeq.NO_RECEIVER, afpq.EMPTY));
                }
            }
        }
        if (afqwVar.getJClass().isEnum()) {
            afqwVar.getClass();
            afbtVar.add(new afnt(afqwVar));
        }
        return afbtVar.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agba descriptor_delegate$lambda$0(afqw afqwVar) {
        ahnd classId$kotlin_reflection = afqwVar.getClassId$kotlin_reflection();
        agjq moduleData = ((afqs) afqwVar.getData().a()).getModuleData();
        agba agbaVarDeserializeClass = (classId$kotlin_reflection.isLocal() && afqwVar.getJClass().isAnnotationPresent(Metadata.class)) ? moduleData.getDeserialization().deserializeClass(classId$kotlin_reflection) : agch.findClassAcrossModuleDependencies(moduleData.getModule(), classId$kotlin_reflection);
        return agbaVarDeserializeClass == null ? afqwVar.createSyntheticClassOrFail(classId$kotlin_reflection, moduleData) : agbaVarDeserializeClass;
    }

    private final Collection<afue<?>> getDeclaredStaticMembers() {
        T value = this.declaredStaticMembers$delegate.getValue(this, $$delegatedProperties[11]);
        value.getClass();
        return (Collection) value;
    }

    private final Collection<afue<?>> getInheritedNonStaticMembers_k1Impl() {
        T value = this.inheritedNonStaticMembers_k1Impl$delegate.getValue(this, $$delegatedProperties[12]);
        value.getClass();
        return (Collection) value;
    }

    private final Collection<afue<?>> getInheritedStaticMembers_k1Impl() {
        T value = this.inheritedStaticMembers_k1Impl$delegate.getValue(this, $$delegatedProperties[13]);
        value.getClass();
        return (Collection) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection inheritedNonStaticMembers_k1Impl_delegate$lambda$0(afqw afqwVar) {
        return afqwVar.getMembers(afqwVar.getMemberScope$kotlin_reflection(), afqt.INHERITED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection inheritedStaticMembers_k1Impl_delegate$lambda$0(afqw afqwVar) {
        return afqwVar.getMembers(afqwVar.getStaticScope$kotlin_reflection(), afqt.INHERITED);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aiqc inlineClassUnderlyingType_delegate$lambda$0(afqs afqsVar, afqw afqwVar) {
        agnq kmClass = afqsVar.getKmClass();
        Object obj = null;
        if (kmClass == null || !agmo.isValue(kmClass)) {
            return null;
        }
        if (kmClass.getInlineClassUnderlyingType() != null) {
            agol inlineClassUnderlyingType = kmClass.getInlineClassUnderlyingType();
            if (inlineClassUnderlyingType == null) {
                return null;
            }
            return afjz.toKType$default(inlineClassUnderlyingType, agkc.getSafeClassLoader(afqwVar.getJClass()), afqsVar.getTypeParameterTable$kotlin_reflection(), false, null, 12, null);
        }
        boolean z = false;
        for (Object obj2 : kmClass.getProperties()) {
            agoj agojVar = (agoj) obj2;
            if (affa.f(agojVar.getName(), kmClass.getInlineClassUnderlyingPropertyName()) && agojVar.getContextParameters().isEmpty() && agojVar.getReceiverParameterType() == null) {
                if (z) {
                    throw new IllegalArgumentException("Collection contains more than one matching element.");
                }
                z = true;
                obj = obj2;
            }
        }
        if (z) {
            return afjz.toKType$default(((agoj) obj).getReturnType(), agkc.getSafeClassLoader(afqwVar.getJClass()), afqsVar.getTypeParameterTable$kotlin_reflection(), false, null, 12, null);
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private final boolean isClassWithAdditionalConstructorsFromMappedType() throws SecurityException {
        if (getKmClass() != null) {
            Constructor<?>[] declaredConstructors = this.this$0.getJClass().getDeclaredConstructors();
            declaredConstructors.getClass();
            int i = 0;
            for (Constructor<?> constructor : declaredConstructors) {
                if (Modifier.isPublic(constructor.getModifiers()) || Modifier.isProtected(constructor.getModifiers())) {
                    i++;
                }
            }
            if (i > this.this$0.getConstructorsMetadata().size()) {
                return true;
            }
        }
        return false;
    }

    private final boolean isInheritable(Annotation annotation) {
        return afvu.hasInherited(annotation) && !afvu.isRepeatableContainerForNonInheritedAnnotation(annotation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agnq kmClass_delegate$lambda$0(afqw afqwVar, afqs afqsVar) {
        if (afvn.getLoadMetadataDirectly()) {
            Metadata metadata = (Metadata) afqwVar.getJClass().getAnnotation(Metadata.class);
            if (metadata != null) {
                agqx lenient = agqx.Companion.readLenient(metadata);
                agqq agqqVar = lenient instanceof agqq ? (agqq) lenient : null;
                if (agqqVar != null) {
                    return agqqVar.getKmClass();
                }
            }
            return null;
        }
        agba descriptor = afqsVar.getDescriptor();
        if (!(descriptor instanceof afyw)) {
            aibt aibtVar = descriptor instanceof aibt ? (aibt) descriptor : null;
            if (aibtVar == null) {
                return null;
            }
            return agpo.toKmClass$default(aibtVar.getClassProto(), aibtVar.getC().getNameResolver(), false, null, 6, null);
        }
        afyw afywVar = (afyw) descriptor;
        if (afywVar.getFunctionTypeKind() instanceof afzd) {
            return afiu.createFunctionKmClass(afywVar.getArity());
        }
        throw new aftw("Unsupported function type kind: " + afywVar.getFunctionTypeKind() + " (" + descriptor + ')');
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List nestedClasses_delegate$lambda$0(afqs afqsVar, afqw afqwVar) {
        agnq kmClass = afqsVar.getKmClass();
        if (kmClass != null) {
            ahnd classId = afjz.toClassId(kmClass.getName());
            ClassLoader safeClassLoader = agkc.getSafeClassLoader(afqwVar.getJClass());
            List<String> nestedClasses = kmClass.getNestedClasses();
            ArrayList arrayList = new ArrayList();
            Iterator<T> it = nestedClasses.iterator();
            while (it.hasNext()) {
                Class clsLoadClass$default = afvu.loadClass$default(safeClassLoader, classId.createNestedClassId(ahnj.identifier((String) it.next())), 0, 2, null);
                afhe afheVarL = clsLoadClass$default != null ? affa.l(clsLoadClass$default) : null;
                if (afheVarL != null) {
                    arrayList.add(afheVarL);
                }
            }
            return arrayList;
        }
        Class<?>[] declaredClasses = afqwVar.getJClass().getDeclaredClasses();
        declaredClasses.getClass();
        ArrayList arrayList2 = new ArrayList();
        for (Class<?> cls : declaredClasses) {
            cls.getClass();
            afhe afheVarL2 = affa.l(cls);
            if (afheVarL2 != null) {
                arrayList2.add(afheVarL2);
            }
        }
        return arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object objectInstance_delegate$lambda$0(afqs afqsVar, afqw afqwVar) throws IllegalAccessException, IllegalArgumentException {
        agnq kmClass = afqsVar.getKmClass();
        if (kmClass == null || !(agmo.getKind(kmClass) == agmp.OBJECT || agmo.getKind(kmClass) == agmp.COMPANION_OBJECT)) {
            return null;
        }
        Object obj = ((agmo.getKind(kmClass) != agmp.COMPANION_OBJECT || woy.cn(afxs.INSTANCE.getClassIds(), afjz.toClassId(kmClass.getName()).getOuterClassId())) ? afqwVar.getJClass().getDeclaredField("INSTANCE") : afqwVar.getJClass().getEnclosingClass().getDeclaredField(afjz.toNonLocalSimpleName(kmClass.getName()))).get(null);
        obj.getClass();
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String qualifiedName_delegate$lambda$0(afqw afqwVar) {
        if (afqwVar.getJClass().isAnonymousClass()) {
            return null;
        }
        ahnd classId$kotlin_reflection = afqwVar.getClassId$kotlin_reflection();
        if (classId$kotlin_reflection.isLocal()) {
            return null;
        }
        return classId$kotlin_reflection.asSingleFqName().asString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List sealedSubclasses_delegate$lambda$0(defpackage.afqw r5, defpackage.afqs r6) throws java.lang.IllegalAccessException, java.lang.IllegalArgumentException, java.lang.reflect.InvocationTargetException {
        /*
            java.lang.Class r0 = r5.getJClass()
            java.lang.ClassLoader r0 = defpackage.agkc.getSafeClassLoader(r0)
            agnq r6 = r6.getKmClass()
            r1 = 0
            r2 = 0
            if (r6 == 0) goto L34
            java.util.List r5 = r6.getSealedSubclasses()
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L1d:
            boolean r3 = r5.hasNext()
            if (r3 == 0) goto L71
            java.lang.Object r3 = r5.next()
            java.lang.String r3 = (java.lang.String) r3
            r4 = 2
            afhe r3 = defpackage.afjz.loadKClass$default(r0, r3, r1, r4, r2)
            if (r3 == 0) goto L1d
            r6.add(r3)
            goto L1d
        L34:
            agjx r6 = defpackage.agjx.INSTANCE
            java.lang.Class r0 = r5.getJClass()
            java.lang.Boolean r6 = r6.loadIsSealed(r0)
            r0 = 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            boolean r6 = defpackage.affa.f(r6, r0)
            if (r6 == 0) goto L6f
            agjx r6 = defpackage.agjx.INSTANCE
            java.lang.Class r5 = r5.getJClass()
            java.lang.Class[] r5 = r6.loadGetPermittedSubclasses(r5)
            if (r5 == 0) goto L6a
            java.util.ArrayList r2 = new java.util.ArrayList
            int r6 = r5.length
            r2.<init>(r6)
        L5b:
            int r6 = r5.length
            if (r1 >= r6) goto L6a
            r6 = r5[r1]
            afhe r6 = defpackage.affa.l(r6)
            r2.add(r6)
            int r1 = r1 + 1
            goto L5b
        L6a:
            if (r2 != 0) goto L6d
            goto L6f
        L6d:
            r6 = r2
            goto L71
        L6f:
            afbe r6 = defpackage.afbe.a
        L71:
            r6.getClass()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afqs.sealedSubclasses_delegate$lambda$0(afqw, afqs):java.util.List");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String simpleName_delegate$lambda$0(afqw afqwVar, afqs afqsVar) {
        if (afqwVar.getJClass().isAnonymousClass()) {
            return null;
        }
        ahnd classId$kotlin_reflection = afqwVar.getClassId$kotlin_reflection();
        if (classId$kotlin_reflection.isLocal()) {
            return afqsVar.calculateLocalClassName(afqwVar.getJClass());
        }
        String strAsString = classId$kotlin_reflection.getShortClassName().asString();
        strAsString.getClass();
        return strAsString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List supertypes_delegate$lambda$0(afqw afqwVar, afqs afqsVar) {
        String qualifiedName;
        String name;
        if (affa.f(afqwVar.getJClass(), Object.class)) {
            return afbe.a;
        }
        if (afvn.getUseK1Implementation()) {
            return afqsVar.computeLegacySupertypes();
        }
        ArrayList arrayList = new ArrayList();
        agnq kmClass = afqsVar.getKmClass();
        List<agol> supertypes = kmClass != null ? kmClass.getSupertypes() : null;
        if (supertypes != null) {
            for (agol agolVar : supertypes) {
                agnu classifier = agolVar.getClassifier();
                agnr agnrVar = classifier instanceof agnr ? (agnr) classifier : null;
                if (agnrVar == null || (name = agnrVar.getName()) == null) {
                    throw new aftw("Supertype of " + afqwVar + " not a class: " + agolVar.getClassifier());
                }
                ahnd classId = afjz.toClassId(name);
                Class clsLoadClass$default = afvu.loadClass$default(agkc.getSafeClassLoader(afqwVar.getJClass()), classId, 0, 2, null);
                if (clsLoadClass$default == null) {
                    throw new aftw(a.bt(classId, afqwVar, "Unsupported superclass of ", ": "));
                }
                arrayList.add(afjz.toKType$default(agolVar, agkc.getSafeClassLoader(afqwVar.getJClass()), afqsVar.getTypeParameterTable$kotlin_reflection(), false, new afqj(afqwVar, clsLoadClass$default, classId), 4, null));
            }
            if (afqwVar.getJClass().isArray()) {
                arrayList.add(afvm.INSTANCE.getCLONEABLE());
            }
            if (Serializable.class.isAssignableFrom(afqwVar.getJClass()) && !arrayList.contains(afvm.INSTANCE.getSERIALIZABLE()) && (qualifiedName = afqsVar.getQualifiedName()) != null && afyh.g(qualifiedName, "kotlin.", false)) {
                arrayList.add(afvm.INSTANCE.getSERIALIZABLE());
            }
        } else {
            afib purelyImplementedSupertype = afjs.getPurelyImplementedSupertype(afqwVar);
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(afqwVar.getJClass().getGenericSuperclass());
            affx.a(afqwVar.getJClass().getGenericInterfaces(), arrayList2);
            for (Type type : woy.bi(arrayList2.toArray(new Type[arrayList2.size()]))) {
                if (type != null && !affa.f(type, Object.class)) {
                    if (!affa.f(type, purelyImplementedSupertype != null ? purelyImplementedSupertype.getClassifier() : null)) {
                        arrayList.add(afjs.toKType$default(type, afbf.a, afvo.NOT_NULL, false, false, afvr.SUPERTYPE, 12, null));
                    }
                }
            }
            aiow.addIfNotNull(arrayList, purelyImplementedSupertype);
        }
        if (arrayList.isEmpty()) {
            arrayList.add(afvm.INSTANCE.getANY());
        } else {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                afhf classifier2 = ((afib) it.next()).getClassifier();
                afqw afqwVar2 = classifier2 instanceof afqw ? (afqw) classifier2 : null;
                if (afqwVar2 == null || (afqwVar2.getClassKind$kotlin_reflection() != agmp.INTERFACE && afqwVar2.getClassKind$kotlin_reflection() != agmp.ANNOTATION_CLASS)) {
                    break;
                }
            }
            arrayList.add(afvm.INSTANCE.getANY());
        }
        return aiow.compact(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Type supertypes_delegate$lambda$0$0$0(afqw afqwVar, Class cls, ahnd ahndVar) {
        if (affa.f(afqwVar.getJClass().getSuperclass(), cls)) {
            Type genericSuperclass = afqwVar.getJClass().getGenericSuperclass();
            genericSuperclass.getClass();
            return genericSuperclass;
        }
        Class<?>[] interfaces = afqwVar.getJClass().getInterfaces();
        interfaces.getClass();
        int iCP = woy.cP(interfaces, cls);
        if (iCP < 0) {
            throw new aftw(a.bt(ahndVar, afqwVar, "No superclass of ", " in Java reflection for "));
        }
        Type type = afqwVar.getJClass().getGenericInterfaces()[iCP];
        type.getClass();
        return type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.afvq typeParameterTable_delegate$lambda$0(defpackage.afqs r5, defpackage.afqw r6) {
        /*
            agnq r0 = r5.getKmClass()
            if (r0 != 0) goto L9
            afvq r5 = defpackage.afvq.EMPTY
            return r5
        L9:
            afvp r0 = defpackage.afvq.Companion
            agnq r1 = r5.getKmClass()
            r1.getClass()
            java.util.List r1 = r1.getTypeParameters()
            java.lang.Class r2 = r6.getJClass()
            java.lang.Class r2 = r2.getEnclosingClass()
            r3 = 0
            if (r2 == 0) goto L37
            agnq r5 = r5.getKmClass()
            r5.getClass()
            boolean r5 = defpackage.agmo.isInner(r5)
            r4 = 1
            if (r4 == r5) goto L30
            r2 = r3
        L30:
            if (r2 == 0) goto L37
            afhe r5 = defpackage.affa.l(r2)
            goto L38
        L37:
            r5 = r3
        L38:
            boolean r2 = r5 instanceof defpackage.afqw
            if (r2 == 0) goto L3f
            afqw r5 = (defpackage.afqw) r5
            goto L40
        L3f:
            r5 = r3
        L40:
            if (r5 == 0) goto L54
            aezr r5 = r5.getData()
            if (r5 == 0) goto L54
            java.lang.Object r5 = r5.a()
            afqs r5 = (defpackage.afqs) r5
            if (r5 == 0) goto L54
            afvq r3 = r5.getTypeParameterTable$kotlin_reflection()
        L54:
            java.lang.Class r5 = r6.getJClass()
            java.lang.ClassLoader r5 = defpackage.agkc.getSafeClassLoader(r5)
            afvq r5 = r0.create(r1, r3, r6, r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.afqs.typeParameterTable_delegate$lambda$0(afqs, afqw):afvq");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List typeParameters_delegate$lambda$0(afqs afqsVar, afqw afqwVar) {
        if (!afvn.getUseK1Implementation()) {
            if (afqsVar.getKmClass() != null) {
                return afqsVar.getTypeParameterTable$kotlin_reflection().getOwnTypeParameters();
            }
            TypeVariable[] typeParameters = afqwVar.getJClass().getTypeParameters();
            typeParameters.getClass();
            return afjs.toKTypeParameters(typeParameters, afqwVar);
        }
        List<agee> declaredTypeParameters = afqsVar.getDescriptor().getDeclaredTypeParameters();
        declaredTypeParameters.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(declaredTypeParameters, 10));
        for (agee ageeVar : declaredTypeParameters) {
            ageeVar.getClass();
            arrayList.add(new afrv(afqwVar, ageeVar));
        }
        return arrayList;
    }

    private final boolean useK1ImplementationForFakeOverrides() {
        return !afvn.getNewFakeOverridesImplementation() || afvn.getUseK1Implementation() || afir.c(this.this$0, affw.b(Iterable.class)) || afir.c(this.this$0, affw.b(Map.class)) || afir.c(this.this$0, affw.b(CharSequence.class)) || afir.c(this.this$0, affw.b(Number.class));
    }

    public final Collection<afue<?>> getAllMembers() {
        T value = this.allMembers$delegate.getValue(this, $$delegatedProperties[17]);
        value.getClass();
        return (Collection) value;
    }

    public final Collection<afue<?>> getAllNonStaticMembers() {
        T value = this.allNonStaticMembers$delegate.getValue(this, $$delegatedProperties[14]);
        value.getClass();
        return (Collection) value;
    }

    public final Collection<afue<?>> getAllStaticMembers() {
        T value = this.allStaticMembers$delegate.getValue(this, $$delegatedProperties[15]);
        value.getClass();
        return (Collection) value;
    }

    public final List<Annotation> getAnnotations() {
        T value = this.annotations$delegate.getValue(this, $$delegatedProperties[1]);
        value.getClass();
        return (List) value;
    }

    public final Collection<afhh> getConstructors() {
        T value = this.constructors$delegate.getValue(this, $$delegatedProperties[4]);
        value.getClass();
        return (Collection) value;
    }

    public final Collection<afue<?>> getDeclaredMembers() {
        T value = this.declaredMembers$delegate.getValue(this, $$delegatedProperties[16]);
        value.getClass();
        return (Collection) value;
    }

    public final Collection<afue<?>> getDeclaredNonStaticMembers() {
        T value = this.declaredNonStaticMembers$delegate.getValue(this, $$delegatedProperties[10]);
        value.getClass();
        return (Collection) value;
    }

    public final agba getDescriptor() {
        T value = this.descriptor$delegate.getValue(this, $$delegatedProperties[0]);
        value.getClass();
        return (agba) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final afmv getFakeOverrideMembers$kotlin_reflection() {
        T value = this.fakeOverrideMembers$delegate.getValue(this, $$delegatedProperties[18]);
        value.getClass();
        return (afmv) value;
    }

    public final afib getInlineClassUnderlyingType$kotlin_reflection() {
        return (afib) this.inlineClassUnderlyingType$delegate.a();
    }

    public final agnq getKmClass() {
        return (agnq) this.kmClass$delegate.a();
    }

    public final Collection<afhe<?>> getNestedClasses() {
        T value = this.nestedClasses$delegate.getValue(this, $$delegatedProperties[5]);
        value.getClass();
        return (Collection) value;
    }

    public final Object getObjectInstance() {
        return this.objectInstance$delegate.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getQualifiedName() {
        return (String) this.qualifiedName$delegate.getValue(this, $$delegatedProperties[3]);
    }

    public final List<afhe> getSealedSubclasses() {
        T value = this.sealedSubclasses$delegate.getValue(this, $$delegatedProperties[9]);
        value.getClass();
        return (List) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String getSimpleName() {
        return (String) this.simpleName$delegate.getValue(this, $$delegatedProperties[2]);
    }

    public final List<afib> getSupertypes() {
        T value = this.supertypes$delegate.getValue(this, $$delegatedProperties[8]);
        value.getClass();
        return (List) value;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final afvq getTypeParameterTable$kotlin_reflection() {
        T value = this.typeParameterTable$delegate.getValue(this, $$delegatedProperties[7]);
        value.getClass();
        return (afvq) value;
    }

    public final List<afic> getTypeParameters() {
        T value = this.typeParameters$delegate.getValue(this, $$delegatedProperties[6]);
        value.getClass();
        return (List) value;
    }
}
