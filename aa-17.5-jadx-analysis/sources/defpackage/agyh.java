package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;

/* loaded from: classes3.dex */
public abstract class agyh extends ahxf {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(agyh.class, "functionNamesLazy", "getFunctionNamesLazy()Ljava/util/Set;", 0), new affn(agyh.class, "propertyNamesLazy", "getPropertyNamesLazy()Ljava/util/Set;", 0), new affn(agyh.class, "classNamesLazy", "getClassNamesLazy()Ljava/util/Set;", 0)};
    private final aiec<Collection<agbi>> allDescriptors;
    private final agvu c;
    private final aiec classNamesLazy$delegate;
    private final aieb<ahnj, agdn> declaredField;
    private final aiea<ahnj, Collection<agdv>> declaredFunctions;
    private final aiec<agwe> declaredMemberIndex;
    private final aiec functionNamesLazy$delegate;
    private final aiea<ahnj, Collection<agdv>> functions;
    private final agyh mainScope;
    private final aiea<ahnj, List<agdn>> properties;
    private final aiec propertyNamesLazy$delegate;

    public agyh(agvu agvuVar, agyh agyhVar) {
        agvuVar.getClass();
        this.c = agvuVar;
        this.mainScope = agyhVar;
        this.allDescriptors = agvuVar.getStorageManager().createRecursionTolerantLazyValue(new agxs(this), afbe.a);
        this.declaredMemberIndex = agvuVar.getStorageManager().createLazyValue(new agxv(this));
        this.declaredFunctions = agvuVar.getStorageManager().createMemoizedFunction(new agxw(this));
        this.declaredField = agvuVar.getStorageManager().createMemoizedFunctionWithNullableValues(new agxx(this));
        this.functions = agvuVar.getStorageManager().createMemoizedFunction(new agxy(this));
        this.functionNamesLazy$delegate = agvuVar.getStorageManager().createLazyValue(new agxz(this));
        this.propertyNamesLazy$delegate = agvuVar.getStorageManager().createLazyValue(new agya(this));
        this.classNamesLazy$delegate = agvuVar.getStorageManager().createLazyValue(new agyb(this));
        this.properties = agvuVar.getStorageManager().createMemoizedFunction(new agyc(this));
    }

    static /* synthetic */ agav accessor$LazyJavaScope$lambda9(agdv agdvVar) {
        retainMostSpecificMethods$lambda$1(agdvVar);
        return agdvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection allDescriptors$lambda$0(agyh agyhVar) {
        return agyhVar.computeDescriptors(ahwt.ALL, ahxe.Companion.getALL_NAME_FILTER());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set classNamesLazy_delegate$lambda$0(agyh agyhVar) {
        return agyhVar.computeClassNames(ahwt.CLASSIFIERS, null);
    }

    private final agik createPropertyDescriptor(agzo agzoVar) {
        boolean z = !agzoVar.isFinal();
        return agvf.create(getOwnerDescriptor(), agvr.resolveAnnotations(this.c, agzoVar), agcq.FINAL, agub.toDescriptorVisibility(agzoVar.getVisibility()), z, agzoVar.getName(), this.c.getComponents().getSourceElementFactory().source(agzoVar), isFinalStatic(agzoVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agdn declaredField$lambda$0(agyh agyhVar, ahnj ahnjVar) {
        ahnjVar.getClass();
        agyh agyhVar2 = agyhVar.mainScope;
        if (agyhVar2 != null) {
            return agyhVar2.declaredField.invoke(ahnjVar);
        }
        agzo agzoVarFindFieldByName = agyhVar.declaredMemberIndex.invoke().findFieldByName(ahnjVar);
        if (agzoVarFindFieldByName == null || agzoVarFindFieldByName.isEnumEntry()) {
            return null;
        }
        return agyhVar.resolveProperty(agzoVarFindFieldByName);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection declaredFunctions$lambda$0(agyh agyhVar, ahnj ahnjVar) {
        ahnjVar.getClass();
        agyh agyhVar2 = agyhVar.mainScope;
        if (agyhVar2 != null) {
            return agyhVar2.declaredFunctions.invoke(ahnjVar);
        }
        ArrayList arrayList = new ArrayList();
        for (agzr agzrVar : agyhVar.declaredMemberIndex.invoke().findMethodsByName(ahnjVar)) {
            agve agveVarResolveMethodToFunctionDescriptor = agyhVar.resolveMethodToFunctionDescriptor(agzrVar);
            if (agyhVar.isVisibleAsFunction(agveVarResolveMethodToFunctionDescriptor)) {
                agyhVar.c.getComponents().getJavaResolverCache().recordMethod(agzrVar, agveVarResolveMethodToFunctionDescriptor);
                arrayList.add(agveVarResolveMethodToFunctionDescriptor);
            }
        }
        agyhVar.computeImplicitlyDeclaredFunctions(arrayList, ahnjVar);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set functionNamesLazy_delegate$lambda$0(agyh agyhVar) {
        return agyhVar.computeFunctionNames(ahwt.FUNCTIONS, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection functions$lambda$0(agyh agyhVar, ahnj ahnjVar) {
        ahnjVar.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet(agyhVar.declaredFunctions.invoke(ahnjVar));
        agyhVar.retainMostSpecificMethods(linkedHashSet);
        agyhVar.computeNonDeclaredFunctions(linkedHashSet, ahnjVar);
        return woy.cf(agyhVar.c.getComponents().getSignatureEnhancement().enhanceSignatures(agyhVar.c, linkedHashSet));
    }

    private final Set<ahnj> getClassNamesLazy() {
        return (Set) aieh.getValue(this.classNamesLazy$delegate, this, $$delegatedProperties[2]);
    }

    private final Set<ahnj> getFunctionNamesLazy() {
        return (Set) aieh.getValue(this.functionNamesLazy$delegate, this, $$delegatedProperties[0]);
    }

    private final Set<ahnj> getPropertyNamesLazy() {
        return (Set) aieh.getValue(this.propertyNamesLazy$delegate, this, $$delegatedProperties[1]);
    }

    private final aigl getPropertyType(agzo agzoVar) {
        aigl aiglVarTransformJavaType = this.c.getTypeResolver().transformJavaType(agzoVar.getType(), agys.toAttributes$default(aija.COMMON, false, false, null, 7, null));
        if ((!afye.isPrimitiveType(aiglVarTransformJavaType) && !afye.isString(aiglVarTransformJavaType)) || !isFinalStatic(agzoVar) || !agzoVar.getHasConstantNotNullInitializer()) {
            return aiglVarTransformJavaType;
        }
        aigl aiglVarMakeNotNullable = aijc.makeNotNullable(aiglVarTransformJavaType);
        aiglVarMakeNotNullable.getClass();
        return aiglVarMakeNotNullable;
    }

    private final boolean isFinalStatic(agzo agzoVar) {
        return agzoVar.isFinal() && agzoVar.isStatic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List properties$lambda$0(agyh agyhVar, ahnj ahnjVar) {
        ahnjVar.getClass();
        ArrayList arrayList = new ArrayList();
        aiow.addIfNotNull(arrayList, agyhVar.declaredField.invoke(ahnjVar));
        agyhVar.computeNonDeclaredProperties(ahnjVar, arrayList);
        return ahst.isAnnotationClass(agyhVar.getOwnerDescriptor()) ? woy.cf(arrayList) : woy.cf(agyhVar.c.getComponents().getSignatureEnhancement().enhanceSignatures(agyhVar.c, arrayList));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set propertyNamesLazy_delegate$lambda$0(agyh agyhVar) {
        return agyhVar.computePropertyNames(ahwt.VARIABLES, null);
    }

    private final agdn resolveProperty(agzo agzoVar) {
        affv affvVar = new affv();
        affvVar.a = createPropertyDescriptor(agzoVar);
        ((agik) affvVar.a).initialize(null, null, null, null);
        aigl propertyType = getPropertyType(agzoVar);
        agik agikVar = (agik) affvVar.a;
        afbe afbeVar = afbe.a;
        agikVar.setType(propertyType, afbeVar, getDispatchReceiverParameter(), null, afbeVar);
        agbi ownerDescriptor = getOwnerDescriptor();
        agba agbaVar = ownerDescriptor instanceof agba ? (agba) ownerDescriptor : null;
        if (agbaVar != null) {
            affvVar.a = this.c.getComponents().getSyntheticPartsProvider().modifyField(agbaVar, (agik) affvVar.a, this.c);
        }
        Object obj = affvVar.a;
        if (ahst.shouldRecordInitializerForProperty((agem) obj, ((agik) obj).getType())) {
            ((agik) affvVar.a).setCompileTimeInitializerFactory(new agxt(this, agzoVar, affvVar));
        }
        this.c.getComponents().getJavaResolverCache().recordField(agzoVar, (agdn) affvVar.a);
        return (agdn) affvVar.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final aied resolveProperty$lambda$1(agyh agyhVar, agzo agzoVar, affv affvVar) {
        return agyhVar.c.getStorageManager().createNullableLazyValue(new agxu(agyhVar, agzoVar, affvVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ahuh resolveProperty$lambda$1$0(agyh agyhVar, agzo agzoVar, affv affvVar) {
        return agyhVar.c.getComponents().getJavaPropertyInitializerEvaluator().getInitializerConstant(agzoVar, (agdn) affvVar.a);
    }

    private final void retainMostSpecificMethods(Set<agdv> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : set) {
            String strComputeJvmDescriptor$default = ahfp.computeJvmDescriptor$default((agdv) obj, false, false, 2, null);
            Object arrayList = linkedHashMap.get(strComputeJvmDescriptor$default);
            if (arrayList == null) {
                arrayList = new ArrayList();
                linkedHashMap.put(strComputeJvmDescriptor$default, arrayList);
            }
            ((List) arrayList).add(obj);
        }
        for (List list : linkedHashMap.values()) {
            if (list.size() != 1) {
                Collection<? extends agdv> collectionSelectMostSpecificInEachOverridableGroup = ahtm.selectMostSpecificInEachOverridableGroup(list, agyd.INSTANCE);
                set.removeAll(list);
                set.addAll(collectionSelectMostSpecificInEachOverridableGroup);
            }
        }
    }

    private static final agav retainMostSpecificMethods$lambda$1(agdv agdvVar) {
        agdvVar.getClass();
        return agdvVar;
    }

    protected abstract Set<ahnj> computeClassNames(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar);

    protected final List<agbi> computeDescriptors(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        afecVar.getClass();
        aglr aglrVar = aglr.WHEN_GET_ALL_DESCRIPTORS;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        if (ahwtVar.acceptsKinds(ahwt.Companion.getCLASSIFIERS_MASK())) {
            for (ahnj ahnjVar : computeClassNames(ahwtVar, afecVar)) {
                if (afecVar.invoke(ahnjVar).booleanValue()) {
                    aiow.addIfNotNull(linkedHashSet, getContributedClassifier(ahnjVar, aglrVar));
                }
            }
        }
        if (ahwtVar.acceptsKinds(ahwt.Companion.getFUNCTIONS_MASK()) && !ahwtVar.getExcludes().contains(ahwm.INSTANCE)) {
            for (ahnj ahnjVar2 : computeFunctionNames(ahwtVar, afecVar)) {
                if (afecVar.invoke(ahnjVar2).booleanValue()) {
                    linkedHashSet.addAll(getContributedFunctions(ahnjVar2, aglrVar));
                }
            }
        }
        if (ahwtVar.acceptsKinds(ahwt.Companion.getVARIABLES_MASK()) && !ahwtVar.getExcludes().contains(ahwm.INSTANCE)) {
            for (ahnj ahnjVar3 : computePropertyNames(ahwtVar, afecVar)) {
                if (afecVar.invoke(ahnjVar3).booleanValue()) {
                    linkedHashSet.addAll(getContributedVariables(ahnjVar3, aglrVar));
                }
            }
        }
        return woy.cf(linkedHashSet);
    }

    protected abstract Set<ahnj> computeFunctionNames(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar);

    protected void computeImplicitlyDeclaredFunctions(Collection<agdv> collection, ahnj ahnjVar) {
        collection.getClass();
        ahnjVar.getClass();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract agwe computeMemberIndex();

    protected final aigl computeMethodReturnType(agzr agzrVar, agvu agvuVar) {
        agzrVar.getClass();
        agvuVar.getClass();
        return agvuVar.getTypeResolver().transformJavaType(agzrVar.getReturnType(), agys.toAttributes$default(aija.COMMON, agzrVar.getContainingClass().isAnnotationType(), false, null, 6, null));
    }

    protected abstract void computeNonDeclaredFunctions(Collection<agdv> collection, ahnj ahnjVar);

    protected abstract void computeNonDeclaredProperties(ahnj ahnjVar, Collection<agdn> collection);

    protected abstract Set<ahnj> computePropertyNames(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar);

    protected final aiec<Collection<agbi>> getAllDescriptors() {
        return this.allDescriptors;
    }

    protected final agvu getC() {
        return this.c;
    }

    @Override // defpackage.ahxf, defpackage.ahxe
    public Set<ahnj> getClassifierNames() {
        return getClassNamesLazy();
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    public Collection<agbi> getContributedDescriptors(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        afecVar.getClass();
        return this.allDescriptors.invoke();
    }

    @Override // defpackage.ahxf, defpackage.ahxe, defpackage.ahxi
    public Collection<agdv> getContributedFunctions(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return !getFunctionNames().contains(ahnjVar) ? afbe.a : this.functions.invoke(ahnjVar);
    }

    @Override // defpackage.ahxf, defpackage.ahxe
    public Collection<agdn> getContributedVariables(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return !getVariableNames().contains(ahnjVar) ? afbe.a : this.properties.invoke(ahnjVar);
    }

    protected final aiec<agwe> getDeclaredMemberIndex() {
        return this.declaredMemberIndex;
    }

    protected abstract agdq getDispatchReceiverParameter();

    @Override // defpackage.ahxf, defpackage.ahxe
    public Set<ahnj> getFunctionNames() {
        return getFunctionNamesLazy();
    }

    protected final agyh getMainScope() {
        return this.mainScope;
    }

    protected abstract agbi getOwnerDescriptor();

    @Override // defpackage.ahxf, defpackage.ahxe
    public Set<ahnj> getVariableNames() {
        return getPropertyNamesLazy();
    }

    protected boolean isVisibleAsFunction(agve agveVar) {
        agveVar.getClass();
        return true;
    }

    protected abstract agyf resolveMethodSignature(agzr agzrVar, List<? extends agee> list, aigl aiglVar, List<? extends agel> list2);

    protected final agve resolveMethodToFunctionDescriptor(agzr agzrVar) {
        agzrVar.getClass();
        agvu agvuVar = this.c;
        agve agveVarCreateJavaMethod = agve.createJavaMethod(getOwnerDescriptor(), agvr.resolveAnnotations(agvuVar, agzrVar), agzrVar.getName(), agvuVar.getComponents().getSourceElementFactory().source(agzrVar), this.declaredMemberIndex.invoke().findRecordComponentByName(agzrVar.getName()) != null && agzrVar.getValueParameters().isEmpty());
        agvu agvuVarChildForMethod$default = agvk.childForMethod$default(this.c, agveVarCreateJavaMethod, agzrVar, 0, 4, null);
        List<agzx> typeParameters = agzrVar.getTypeParameters();
        List<? extends agee> arrayList = new ArrayList<>(woy.bp(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            agee ageeVarResolveTypeParameter = agvuVarChildForMethod$default.getTypeParameterResolver().resolveTypeParameter((agzx) it.next());
            ageeVarResolveTypeParameter.getClass();
            arrayList.add(ageeVarResolveTypeParameter);
        }
        agyg agygVarResolveValueParameters = resolveValueParameters(agvuVarChildForMethod$default, agveVarCreateJavaMethod, agzrVar.getValueParameters());
        agyf agyfVarResolveMethodSignature = resolveMethodSignature(agzrVar, arrayList, computeMethodReturnType(agzrVar, agvuVarChildForMethod$default), agygVarResolveValueParameters.getDescriptors());
        aigl receiverType = agyfVarResolveMethodSignature.getReceiverType();
        agveVarCreateJavaMethod.initialize(receiverType != null ? ahss.createExtensionReceiverParameterForCallable(agveVarCreateJavaMethod, receiverType, agfk.Companion.getEMPTY()) : null, getDispatchReceiverParameter(), afbe.a, agyfVarResolveMethodSignature.getTypeParameters(), agyfVarResolveMethodSignature.getValueParameters(), agyfVarResolveMethodSignature.getReturnType(), agcq.Companion.convertFromFlags(false, agzrVar.isAbstract(), true ^ agzrVar.isFinal()), agub.toDescriptorVisibility(agzrVar.getVisibility()), agyfVarResolveMethodSignature.getReceiverType() != null ? woy.aW(new aezu(agve.ORIGINAL_VALUE_PARAMETER_FOR_EXTENSION_RECEIVER, woy.bF(agygVarResolveValueParameters.getDescriptors()))) : afbf.a);
        agveVarCreateJavaMethod.setExternal(agzrVar.isNative());
        agveVarCreateJavaMethod.setParameterNamesStatus(agyfVarResolveMethodSignature.getHasStableParameterNames(), agygVarResolveValueParameters.getHasSynthesizedNames());
        if (!agyfVarResolveMethodSignature.getErrors().isEmpty()) {
            agvuVarChildForMethod$default.getComponents().getSignaturePropagator().reportSignatureErrors(agveVarCreateJavaMethod, agyfVarResolveMethodSignature.getErrors());
        }
        return agveVarCreateJavaMethod;
    }

    protected final agyg resolveValueParameters(agvu agvuVar, agcj agcjVar, List<? extends aglk> list) {
        aezu aezuVar;
        ahnj name;
        agvuVar.getClass();
        agcjVar.getClass();
        list.getClass();
        Iterable<afbh> iterableBD = woy.bD(list);
        ArrayList arrayList = new ArrayList(woy.bp(iterableBD, 10));
        boolean z = false;
        for (afbh afbhVar : iterableBD) {
            int i = afbhVar.a;
            aglk aglkVar = (aglk) afbhVar.b;
            agfk agfkVarResolveAnnotations = agvr.resolveAnnotations(agvuVar, aglkVar);
            agyr attributes$default = agys.toAttributes$default(aija.COMMON, false, false, null, 7, null);
            if (aglkVar.isVararg()) {
                agzw agzwVarM80getType = aglkVar.m80getType();
                agzi agziVar = agzwVarM80getType instanceof agzi ? (agzi) agzwVarM80getType : null;
                if (agziVar == null) {
                    Objects.toString(aglkVar);
                    throw new AssertionError("Vararg parameter should be an array: ".concat(String.valueOf(aglkVar)));
                }
                aigl aiglVarTransformArrayType = agvuVar.getTypeResolver().transformArrayType(agziVar, attributes$default, true);
                aezuVar = new aezu(aiglVarTransformArrayType, agvuVar.getModule().getBuiltIns().getArrayElementType(aiglVarTransformArrayType));
            } else {
                aezuVar = new aezu(agvuVar.getTypeResolver().transformJavaType(aglkVar.m80getType(), attributes$default), null);
            }
            Object obj = aezuVar.b;
            aigl aiglVar = (aigl) aezuVar.a;
            aigl aiglVar2 = (aigl) obj;
            if (affa.f(agcjVar.getName().asString(), "equals") && list.size() == 1 && affa.f(agvuVar.getModule().getBuiltIns().getNullableAnyType(), aiglVar)) {
                name = ahnj.identifier("other");
            } else {
                name = aglkVar.getName();
                z |= !(name != null);
                if (name == null) {
                    name = ahnj.identifier("p" + i);
                }
            }
            ahnj ahnjVar = name;
            ahnjVar.getClass();
            arrayList.add(new agiy(agcjVar, null, i, agfkVarResolveAnnotations, ahnjVar, aiglVar, false, false, false, aiglVar2, agvuVar.getComponents().getSourceElementFactory().source(aglkVar)));
        }
        return new agyg(woy.cf(arrayList), z);
    }

    public String toString() {
        agbi ownerDescriptor = getOwnerDescriptor();
        Objects.toString(ownerDescriptor);
        return "Lazy scope for ".concat(String.valueOf(ownerDescriptor));
    }

    public /* synthetic */ agyh(agvu agvuVar, agyh agyhVar, int i, afeu afeuVar) {
        this(agvuVar, (i & 2) != 0 ? null : agyhVar);
    }
}
