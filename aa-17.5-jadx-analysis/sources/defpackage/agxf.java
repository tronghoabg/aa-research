package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.load.java.JavaIncompatibilityRulesOverridabilityCondition;

/* loaded from: classes3.dex */
public final class agxf extends agyh {
    private final aiec<List<agaz>> constructors;
    private final aiec<Map<ahnj, agzo>> enumEntryIndex;
    private final aiec<Set<ahnj>> generatedNestedClassNames;
    private final agzj jClass;
    private final aiec<Set<ahnj>> nestedClassIndex;
    private final aieb<ahnj, agba> nestedClasses;
    private final agba ownerDescriptor;
    private final boolean skipRefinement;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agxf(agvu agvuVar, agba agbaVar, agzj agzjVar, boolean z, agxf agxfVar) {
        super(agvuVar, agxfVar);
        agvuVar.getClass();
        agbaVar.getClass();
        agzjVar.getClass();
        this.ownerDescriptor = agbaVar;
        this.jClass = agzjVar;
        this.skipRefinement = z;
        this.constructors = agvuVar.getStorageManager().createLazyValue(new agwt(this, agvuVar));
        this.nestedClassIndex = agvuVar.getStorageManager().createLazyValue(new agwu(this));
        this.generatedNestedClassNames = agvuVar.getStorageManager().createLazyValue(new agwv(agvuVar, this));
        this.enumEntryIndex = agvuVar.getStorageManager().createLazyValue(new agww(this));
        this.nestedClasses = agvuVar.getStorageManager().createMemoizedFunctionWithNullableValues(new agwx(this, agvuVar));
    }

    private final void addAnnotationValueParameter(List<agel> list, agbh agbhVar, int i, agzr agzrVar, aigl aiglVar, aigl aiglVar2) {
        agfk empty = agfk.Companion.getEMPTY();
        ahnj name = agzrVar.getName();
        aigl aiglVarMakeNotNullable = aijc.makeNotNullable(aiglVar);
        aiglVarMakeNotNullable.getClass();
        list.add(new agiy(agbhVar, null, i, empty, name, aiglVarMakeNotNullable, agzrVar.getHasAnnotationParameterDefaultValue(), false, false, aiglVar2 != null ? aijc.makeNotNullable(aiglVar2) : null, getC().getComponents().getSourceElementFactory().source(agzrVar)));
    }

    private final void addFunctionFromSupertypes(Collection<agdv> collection, ahnj ahnjVar, Collection<? extends agdv> collection2, boolean z) {
        Collection<? extends agdv> collectionResolveOverridesForNonStaticMembers = ague.resolveOverridesForNonStaticMembers(ahnjVar, collection2, collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        if (!z) {
            collection.addAll(collectionResolveOverridesForNonStaticMembers);
            return;
        }
        List listBY = woy.bY(collection, collectionResolveOverridesForNonStaticMembers);
        ArrayList arrayList = new ArrayList(woy.bp(collectionResolveOverridesForNonStaticMembers, 10));
        for (agdv agdvVarCreateHiddenCopyIfBuiltinAlreadyAccidentallyOverridden : collectionResolveOverridesForNonStaticMembers) {
            agdv agdvVar = (agdv) agtu.getOverriddenSpecialBuiltin(agdvVarCreateHiddenCopyIfBuiltinAlreadyAccidentallyOverridden);
            if (agdvVar == null) {
                agdvVarCreateHiddenCopyIfBuiltinAlreadyAccidentallyOverridden.getClass();
            } else {
                agdvVarCreateHiddenCopyIfBuiltinAlreadyAccidentallyOverridden.getClass();
                agdvVarCreateHiddenCopyIfBuiltinAlreadyAccidentallyOverridden = createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(agdvVarCreateHiddenCopyIfBuiltinAlreadyAccidentallyOverridden, agdvVar, listBY);
            }
            arrayList.add(agdvVarCreateHiddenCopyIfBuiltinAlreadyAccidentallyOverridden);
        }
        collection.addAll(arrayList);
    }

    private final void addOverriddenSpecialMethods(ahnj ahnjVar, Collection<? extends agdv> collection, Collection<? extends agdv> collection2, Collection<agdv> collection3, afec<? super ahnj, ? extends Collection<? extends agdv>> afecVar) {
        for (agdv agdvVar : collection2) {
            aiow.addIfNotNull(collection3, obtainOverrideForBuiltinWithDifferentJvmName(agdvVar, afecVar, ahnjVar, collection));
            aiow.addIfNotNull(collection3, obtainOverrideForBuiltInWithErasedValueParametersInJava(agdvVar, afecVar, collection));
            aiow.addIfNotNull(collection3, obtainOverrideForSuspend(agdvVar, afecVar));
        }
    }

    private final void addPropertyOverrideByMethod(Set<? extends agdn> set, Collection<agdn> collection, Set<agdn> set2, afec<? super ahnj, ? extends Collection<? extends agdv>> afecVar) {
        for (agdn agdnVar : set) {
            agvf agvfVarCreatePropertyDescriptorByMethods = createPropertyDescriptorByMethods(agdnVar, afecVar);
            if (agvfVarCreatePropertyDescriptorByMethods != null) {
                collection.add(agvfVarCreatePropertyDescriptorByMethods);
                if (set2 != null) {
                    set2.add(agdnVar);
                    return;
                }
                return;
            }
        }
    }

    private final void computeAnnotationProperties(ahnj ahnjVar, Collection<agdn> collection) {
        agzr agzrVar = (agzr) woy.bO(getDeclaredMemberIndex().invoke().findMethodsByName(ahnjVar));
        if (agzrVar == null) {
            return;
        }
        collection.add(createPropertyDescriptorWithDefaultGetter$default(this, agzrVar, null, agcq.FINAL, 2, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean computeMemberIndex$lambda$0(agzq agzqVar) {
        agzqVar.getClass();
        return !agzqVar.isStatic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection computeNonDeclaredProperties$lambda$0(agxf agxfVar, ahnj ahnjVar) {
        ahnjVar.getClass();
        return agxfVar.searchMethodsByNameWithoutBuiltinMagic(ahnjVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection computeNonDeclaredProperties$lambda$1(agxf agxfVar, ahnj ahnjVar) {
        ahnjVar.getClass();
        return agxfVar.searchMethodsInSupertypesWithoutBuiltinMagic(ahnjVar);
    }

    private final Collection<aigl> computeSupertypes() {
        if (!this.skipRefinement) {
            return getC().getComponents().getKotlinTypeChecker().getKotlinTypeRefiner().refineSupertypes(getOwnerDescriptor());
        }
        Collection<aigl> collectionMo89getSupertypes = getOwnerDescriptor().getTypeConstructor().mo89getSupertypes();
        collectionMo89getSupertypes.getClass();
        return collectionMo89getSupertypes;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List] */
    public static final List constructors$lambda$0(agxf agxfVar, agvu agvuVar) {
        Collection<agzm> constructors = agxfVar.jClass.getConstructors();
        ArrayList arrayList = new ArrayList(constructors.size());
        Iterator<agzm> it = constructors.iterator();
        while (it.hasNext()) {
            arrayList.add(agxfVar.resolveConstructor(it.next()));
        }
        if (agxfVar.jClass.isRecord()) {
            agaz agazVarCreateDefaultRecordConstructor = agxfVar.createDefaultRecordConstructor();
            String strComputeJvmDescriptor$default = ahfp.computeJvmDescriptor$default(agazVarCreateDefaultRecordConstructor, false, false, 2, null);
            if (arrayList.isEmpty()) {
                arrayList.add(agazVarCreateDefaultRecordConstructor);
                agvuVar.getComponents().getJavaResolverCache().recordConstructor(agxfVar.jClass, agazVarCreateDefaultRecordConstructor);
            } else {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (affa.f(ahfp.computeJvmDescriptor$default((agaz) it2.next(), false, false, 2, null), strComputeJvmDescriptor$default)) {
                        break;
                    }
                }
                arrayList.add(agazVarCreateDefaultRecordConstructor);
                agvuVar.getComponents().getJavaResolverCache().recordConstructor(agxfVar.jClass, agazVarCreateDefaultRecordConstructor);
            }
        }
        agvuVar.getComponents().getSyntheticPartsProvider().generateConstructors(agxfVar.getOwnerDescriptor(), arrayList, agvuVar);
        ahcu signatureEnhancement = agvuVar.getComponents().getSignatureEnhancement();
        boolean zIsEmpty = arrayList.isEmpty();
        ArrayList arrayListBj = arrayList;
        if (zIsEmpty) {
            arrayListBj = woy.bj(agxfVar.createDefaultConstructor());
        }
        return woy.cf(signatureEnhancement.enhanceSignatures(agvuVar, arrayListBj));
    }

    private final List<agel> createAnnotationConstructorParameters(aggu agguVar) {
        agxf agxfVar;
        aggu agguVar2;
        aezu aezuVar;
        Collection<agzr> methods = this.jClass.getMethods();
        ArrayList arrayList = new ArrayList(methods.size());
        agyr attributes$default = agys.toAttributes$default(aija.COMMON, true, false, null, 6, null);
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : methods) {
            if (affa.f(((agzr) obj).getName(), agti.DEFAULT_ANNOTATION_MEMBER_NAME)) {
                arrayList2.add(obj);
            } else {
                arrayList3.add(obj);
            }
        }
        aezu aezuVar2 = new aezu(arrayList2, arrayList3);
        List list = (List) aezuVar2.a;
        List<agzr> list2 = (List) aezuVar2.b;
        list.size();
        agzr agzrVar = (agzr) woy.bH(list);
        if (agzrVar != null) {
            agzw returnType = agzrVar.getReturnType();
            if (returnType instanceof agzi) {
                agzi agziVar = (agzi) returnType;
                aezuVar = new aezu(getC().getTypeResolver().transformArrayType(agziVar, attributes$default, true), getC().getTypeResolver().transformJavaType(agziVar.getComponentType(), attributes$default));
            } else {
                aezuVar = new aezu(getC().getTypeResolver().transformJavaType(returnType, attributes$default), null);
            }
            Object obj2 = aezuVar.b;
            aigl aiglVar = (aigl) aezuVar.a;
            aigl aiglVar2 = (aigl) obj2;
            agxfVar = this;
            agguVar2 = agguVar;
            agxfVar.addAnnotationValueParameter(arrayList, agguVar2, 0, agzrVar, aiglVar, aiglVar2);
        } else {
            agxfVar = this;
            agguVar2 = agguVar;
        }
        int i = 0;
        int i2 = agzrVar == null ? 0 : 1;
        for (agzr agzrVar2 : list2) {
            agxfVar.addAnnotationValueParameter(arrayList, agguVar2, i + i2, agzrVar2, agxfVar.getC().getTypeResolver().transformJavaType(agzrVar2.getReturnType(), attributes$default), null);
            i++;
        }
        return arrayList;
    }

    private final agaz createDefaultConstructor() {
        agzj agzjVar = this.jClass;
        boolean zIsAnnotationType = agzjVar.isAnnotationType();
        if ((agzjVar.isInterface() || !this.jClass.hasDefaultConstructor()) && !zIsAnnotationType) {
            return null;
        }
        agba ownerDescriptor = getOwnerDescriptor();
        aguy aguyVarCreateJavaConstructor = aguy.createJavaConstructor(ownerDescriptor, agfk.Companion.getEMPTY(), true, getC().getComponents().getSourceElementFactory().source(this.jClass));
        List<agel> listCreateAnnotationConstructorParameters = zIsAnnotationType ? createAnnotationConstructorParameters(aguyVarCreateJavaConstructor) : Collections.EMPTY_LIST;
        aguyVarCreateJavaConstructor.setHasSynthesizedParameterNames(false);
        aguyVarCreateJavaConstructor.initialize(listCreateAnnotationConstructorParameters, getConstructorVisibility(ownerDescriptor));
        aguyVarCreateJavaConstructor.setHasStableParameterNames(true);
        aguyVarCreateJavaConstructor.setReturnType(ownerDescriptor.getDefaultType());
        getC().getComponents().getJavaResolverCache().recordConstructor(this.jClass, aguyVarCreateJavaConstructor);
        return aguyVarCreateJavaConstructor;
    }

    private final agaz createDefaultRecordConstructor() {
        agba ownerDescriptor = getOwnerDescriptor();
        aguy aguyVarCreateJavaConstructor = aguy.createJavaConstructor(ownerDescriptor, agfk.Companion.getEMPTY(), true, getC().getComponents().getSourceElementFactory().source(this.jClass));
        List<agel> listCreateRecordConstructorParameters = createRecordConstructorParameters(aguyVarCreateJavaConstructor);
        aguyVarCreateJavaConstructor.setHasSynthesizedParameterNames(false);
        aguyVarCreateJavaConstructor.initialize(listCreateRecordConstructorParameters, getConstructorVisibility(ownerDescriptor));
        aguyVarCreateJavaConstructor.setHasStableParameterNames(false);
        aguyVarCreateJavaConstructor.setReturnType(ownerDescriptor.getDefaultType());
        return aguyVarCreateJavaConstructor;
    }

    private final agdv createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(agdv agdvVar, agav agavVar, Collection<? extends agdv> collection) {
        if (!(collection instanceof Collection) || !collection.isEmpty()) {
            for (agdv agdvVar2 : collection) {
                if (!affa.f(agdvVar, agdvVar2) && agdvVar2.getInitialSignatureDescriptor() == null && doesOverride(agdvVar2, agavVar)) {
                    agcj agcjVarBuild = agdvVar.newCopyBuilder().setHiddenToOvercomeSignatureClash().build();
                    agcjVarBuild.getClass();
                    return (agdv) agcjVarBuild;
                }
            }
        }
        return agdvVar;
    }

    private final agdv createOverrideForBuiltinFunctionWithErasedParameterIfNeeded(agcj agcjVar, afec<? super ahnj, ? extends Collection<? extends agdv>> afecVar) {
        Object next;
        ahnj name = agcjVar.getName();
        name.getClass();
        Iterator<T> it = afecVar.invoke(name).iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (hasSameJvmDescriptorButDoesNotOverride((agdv) next, agcjVar)) {
                break;
            }
        }
        agdv agdvVar = (agdv) next;
        if (agdvVar == null) {
            return null;
        }
        agci<? extends agdv> agciVarNewCopyBuilder = agdvVar.newCopyBuilder();
        List<agel> valueParameters = agcjVar.getValueParameters();
        valueParameters.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(valueParameters, 10));
        Iterator<T> it2 = valueParameters.iterator();
        while (it2.hasNext()) {
            arrayList.add(((agel) it2.next()).getType());
        }
        List<agel> valueParameters2 = agdvVar.getValueParameters();
        valueParameters2.getClass();
        agciVarNewCopyBuilder.setValueParameters(agvh.copyValueParameters(arrayList, valueParameters2, agcjVar));
        agciVarNewCopyBuilder.setSignatureChange();
        agciVarNewCopyBuilder.setPreserveSourceElement();
        agciVarNewCopyBuilder.putUserData(agve.HAS_ERASED_VALUE_PARAMETERS, true);
        return (agdv) agciVarNewCopyBuilder.build();
    }

    private final agvf createPropertyDescriptorByMethods(agdn agdnVar, afec<? super ahnj, ? extends Collection<? extends agdv>> afecVar) {
        agdv agdvVarFindSetterOverride;
        agim agimVarCreateSetter = null;
        if (!doesClassOverridesProperty(agdnVar, afecVar)) {
            return null;
        }
        agdv agdvVarFindGetterOverride = findGetterOverride(agdnVar, afecVar);
        agdvVarFindGetterOverride.getClass();
        if (agdnVar.isVar()) {
            agdvVarFindSetterOverride = findSetterOverride(agdnVar, afecVar);
            agdvVarFindSetterOverride.getClass();
        } else {
            agdvVarFindSetterOverride = null;
        }
        if (agdvVarFindSetterOverride != null) {
            agdvVarFindSetterOverride.getModality();
            agdvVarFindGetterOverride.getModality();
        }
        agva agvaVar = new agva(getOwnerDescriptor(), agdvVarFindGetterOverride, agdvVarFindSetterOverride, agdnVar);
        aigl returnType = agdvVarFindGetterOverride.getReturnType();
        returnType.getClass();
        afbe afbeVar = afbe.a;
        agvaVar.setType(returnType, afbeVar, getDispatchReceiverParameter(), null, afbeVar);
        agil agilVarCreateGetter = ahss.createGetter(agvaVar, agdvVarFindGetterOverride.getAnnotations(), false, false, false, agdvVarFindGetterOverride.getSource());
        agilVarCreateGetter.setInitialSignatureDescriptor(agdvVarFindGetterOverride);
        agilVarCreateGetter.initialize(agvaVar.getType());
        if (agdvVarFindSetterOverride != null) {
            List<agel> valueParameters = agdvVarFindSetterOverride.getValueParameters();
            valueParameters.getClass();
            agel agelVar = (agel) woy.bH(valueParameters);
            if (agelVar == null) {
                Objects.toString(agdvVarFindSetterOverride);
                throw new AssertionError("No parameter found for ".concat(agdvVarFindSetterOverride.toString()));
            }
            agimVarCreateSetter = ahss.createSetter(agvaVar, agdvVarFindSetterOverride.getAnnotations(), agelVar.getAnnotations(), false, false, false, agdvVarFindSetterOverride.getVisibility(), agdvVarFindSetterOverride.getSource());
            agimVarCreateSetter.setInitialSignatureDescriptor(agdvVarFindSetterOverride);
        }
        agvaVar.initialize(agilVarCreateGetter, agimVarCreateSetter);
        return agvaVar;
    }

    private final agvf createPropertyDescriptorWithDefaultGetter(agzr agzrVar, aigl aiglVar, agcq agcqVar) {
        agvf agvfVar;
        agxf agxfVar;
        aigl aiglVarComputeMethodReturnType;
        agvf agvfVarCreate = agvf.create(getOwnerDescriptor(), agvr.resolveAnnotations(getC(), agzrVar), agcqVar, agub.toDescriptorVisibility(agzrVar.getVisibility()), false, agzrVar.getName(), getC().getComponents().getSourceElementFactory().source(agzrVar), false);
        agil agilVarCreateDefaultGetter = ahss.createDefaultGetter(agvfVarCreate, agfk.Companion.getEMPTY());
        agvfVarCreate.initialize(agilVarCreateDefaultGetter, null);
        if (aiglVar == null) {
            agvu agvuVarChildForMethod$default = agvk.childForMethod$default(getC(), agvfVarCreate, agzrVar, 0, 4, null);
            agvfVar = agvfVarCreate;
            agxfVar = this;
            aiglVarComputeMethodReturnType = agxfVar.computeMethodReturnType(agzrVar, agvuVarChildForMethod$default);
        } else {
            agvfVar = agvfVarCreate;
            agxfVar = this;
            aiglVarComputeMethodReturnType = aiglVar;
        }
        afbe afbeVar = afbe.a;
        agvfVar.setType(aiglVarComputeMethodReturnType, afbeVar, agxfVar.getDispatchReceiverParameter(), null, afbeVar);
        agilVarCreateDefaultGetter.initialize(aiglVarComputeMethodReturnType);
        return agvfVar;
    }

    static /* synthetic */ agvf createPropertyDescriptorWithDefaultGetter$default(agxf agxfVar, agzr agzrVar, aigl aiglVar, agcq agcqVar, int i, Object obj) {
        if ((i & 2) != 0) {
            aiglVar = null;
        }
        return agxfVar.createPropertyDescriptorWithDefaultGetter(agzrVar, aiglVar, agcqVar);
    }

    private final List<agel> createRecordConstructorParameters(aggu agguVar) {
        Collection<agzv> recordComponents = this.jClass.getRecordComponents();
        ArrayList arrayList = new ArrayList(recordComponents.size());
        agyr attributes$default = agys.toAttributes$default(aija.COMMON, false, false, null, 6, null);
        Iterator<T> it = recordComponents.iterator();
        int i = 0;
        while (true) {
            int i2 = i;
            if (!it.hasNext()) {
                return arrayList;
            }
            i = i2 + 1;
            agzv agzvVar = (agzv) it.next();
            aigl aiglVarTransformJavaType = getC().getTypeResolver().transformJavaType(agzvVar.getType(), attributes$default);
            arrayList.add(new agiy(agguVar, null, i2, agfk.Companion.getEMPTY(), agzvVar.getName(), aiglVarTransformJavaType, false, false, false, agzvVar.isVararg() ? getC().getComponents().getModule().getBuiltIns().getArrayElementType(aiglVarTransformJavaType) : null, getC().getComponents().getSourceElementFactory().source(agzvVar)));
        }
    }

    private final agdv createRenamedCopy(agdv agdvVar, ahnj ahnjVar) {
        agci<? extends agdv> agciVarNewCopyBuilder = agdvVar.newCopyBuilder();
        agciVarNewCopyBuilder.setName(ahnjVar);
        agciVarNewCopyBuilder.setSignatureChange();
        agciVarNewCopyBuilder.setPreserveSourceElement();
        agcj agcjVarBuild = agciVarNewCopyBuilder.build();
        agcjVarBuild.getClass();
        return (agdv) agcjVarBuild;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final defpackage.agdv createSuspendView(defpackage.agdv r5) {
        /*
            r4 = this;
            java.util.List r4 = r5.getValueParameters()
            r4.getClass()
            java.lang.Object r4 = defpackage.woy.bL(r4)
            agel r4 = (defpackage.agel) r4
            r0 = 0
            if (r4 == 0) goto L77
            aigl r1 = r4.getType()
            aiid r1 = r1.getConstructor()
            agbd r1 = r1.getDeclarationDescriptor()
            r2 = 1
            if (r1 == 0) goto L31
            ahnh r1 = defpackage.ahvz.getFqNameUnsafe(r1)
            boolean r3 = r1.isSafe()
            if (r2 == r3) goto L2a
            r1 = r0
        L2a:
            if (r1 == 0) goto L31
            ahnf r1 = r1.toSafe()
            goto L32
        L31:
            r1 = r0
        L32:
            ahnf r3 = defpackage.afyo.CONTINUATION_INTERFACE_FQ_NAME
            boolean r1 = defpackage.affa.f(r1, r3)
            if (r2 == r1) goto L3b
            r4 = r0
        L3b:
            if (r4 != 0) goto L3e
            goto L77
        L3e:
            agci r0 = r5.newCopyBuilder()
            java.util.List r5 = r5.getValueParameters()
            r5.getClass()
            java.util.List r5 = defpackage.woy.bS(r5, r2)
            agci r5 = r0.setValueParameters(r5)
            aigl r4 = r4.getType()
            java.util.List r4 = r4.getArguments()
            r0 = 0
            java.lang.Object r4 = r4.get(r0)
            aiin r4 = (defpackage.aiin) r4
            aigl r4 = r4.getType()
            agci r4 = r5.setReturnType(r4)
            agcj r4 = r4.build()
            agdv r4 = (defpackage.agdv) r4
            r5 = r4
            agio r5 = (defpackage.agio) r5
            if (r5 == 0) goto L76
            r5.setSuspend(r2)
        L76:
            return r4
        L77:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.agxf.createSuspendView(agdv):agdv");
    }

    private final boolean doesClassOverridesProperty(agdn agdnVar, afec<? super ahnj, ? extends Collection<? extends agdv>> afecVar) {
        if (agwf.isJavaField(agdnVar)) {
            return false;
        }
        agdv agdvVarFindGetterOverride = findGetterOverride(agdnVar, afecVar);
        agdv agdvVarFindSetterOverride = findSetterOverride(agdnVar, afecVar);
        if (agdvVarFindGetterOverride == null) {
            return false;
        }
        if (agdnVar.isVar()) {
            return agdvVarFindSetterOverride != null && agdvVarFindSetterOverride.getModality() == agdvVarFindGetterOverride.getModality();
        }
        return true;
    }

    private final boolean doesOverride(agav agavVar, agav agavVar2) {
        ahth result = ahtj.DEFAULT.isOverridableByWithoutExternalConditions(agavVar2, agavVar, true).getResult();
        result.getClass();
        return result == ahth.OVERRIDABLE && !JavaIncompatibilityRulesOverridabilityCondition.Companion.doesJavaOverrideHaveIncompatibleValueParameterKinds(agavVar2, agavVar);
    }

    private final boolean doesOverrideRenamedBuiltins(agdv agdvVar) {
        agtw agtwVar = agua.Companion;
        ahnj name = agdvVar.getName();
        name.getClass();
        ahnj builtinFunctionNamesByJvmName = agtwVar.getBuiltinFunctionNamesByJvmName(name);
        if (builtinFunctionNamesByJvmName == null) {
            return false;
        }
        Set<agdv> functionsFromSupertypes = getFunctionsFromSupertypes(builtinFunctionNamesByJvmName);
        ArrayList arrayList = new ArrayList();
        for (Object obj : functionsFromSupertypes) {
            if (agtu.doesOverrideBuiltinWithDifferentJvmName((agdv) obj)) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        agdv agdvVarCreateRenamedCopy = createRenamedCopy(agdvVar, builtinFunctionNamesByJvmName);
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (doesOverrideRenamedDescriptor((agdv) it.next(), agdvVarCreateRenamedCopy)) {
                return true;
            }
        }
        return false;
    }

    private final boolean doesOverrideRenamedDescriptor(agdv agdvVar, agcj agcjVar) {
        if (agry.INSTANCE.isRemoveAtByIndex(agdvVar)) {
            agcjVar = agcjVar.getOriginal();
        }
        agcjVar.getClass();
        return doesOverride(agcjVar, agdvVar);
    }

    private final boolean doesOverrideSuspendFunction(agdv agdvVar) {
        agdv agdvVarCreateSuspendView = createSuspendView(agdvVar);
        if (agdvVarCreateSuspendView == null) {
            return false;
        }
        ahnj name = agdvVar.getName();
        name.getClass();
        Set<agdv> functionsFromSupertypes = getFunctionsFromSupertypes(name);
        if (functionsFromSupertypes.isEmpty()) {
            return false;
        }
        for (agdv agdvVar2 : functionsFromSupertypes) {
            if (agdvVar2.isSuspend() && doesOverride(agdvVarCreateSuspendView, agdvVar2)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Map enumEntryIndex$lambda$0(agxf agxfVar) {
        Collection<agzo> fields = agxfVar.jClass.getFields();
        ArrayList arrayList = new ArrayList();
        for (Object obj : fields) {
            if (((agzo) obj).isEnumEntry()) {
                arrayList.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(woy.bp(arrayList, 10)), 16));
        for (Object obj2 : arrayList) {
            linkedHashMap.put(((agzo) obj2).getName(), obj2);
        }
        return linkedHashMap;
    }

    private final agdv findGetterByName(agdn agdnVar, String str, afec<? super ahnj, ? extends Collection<? extends agdv>> afecVar) {
        agdv agdvVar;
        Iterator<T> it = afecVar.invoke(ahnj.identifier(str)).iterator();
        do {
            agdvVar = null;
            if (!it.hasNext()) {
                break;
            }
            agdv agdvVar2 = (agdv) it.next();
            if (agdvVar2.getValueParameters().size() == 0) {
                aijp aijpVar = aijp.DEFAULT;
                aigl returnType = agdvVar2.getReturnType();
                if (returnType != null && aijpVar.isSubtypeOf(returnType, agdnVar.getType())) {
                    agdvVar = agdvVar2;
                }
            }
        } while (agdvVar == null);
        return agdvVar;
    }

    private final agdv findGetterOverride(agdn agdnVar, afec<? super ahnj, ? extends Collection<? extends agdv>> afecVar) {
        agdo getter = agdnVar.getGetter();
        agdo agdoVar = getter != null ? (agdo) agtu.getOverriddenBuiltinWithDifferentJvmName(getter) : null;
        String builtinSpecialPropertyGetterName = agdoVar != null ? agsf.INSTANCE.getBuiltinSpecialPropertyGetterName(agdoVar) : null;
        if (builtinSpecialPropertyGetterName != null && !agtu.hasRealKotlinSuperClassWithOverrideOf(getOwnerDescriptor(), agdoVar)) {
            return findGetterByName(agdnVar, builtinSpecialPropertyGetterName, afecVar);
        }
        String strAsString = agdnVar.getName().asString();
        strAsString.getClass();
        return findGetterByName(agdnVar, agth.getterName(strAsString), afecVar);
    }

    private final agdv findSetterOverride(agdn agdnVar, afec<? super ahnj, ? extends Collection<? extends agdv>> afecVar) {
        agdv agdvVar;
        aigl returnType;
        String strAsString = agdnVar.getName().asString();
        strAsString.getClass();
        Iterator<T> it = afecVar.invoke(ahnj.identifier(agth.setterName(strAsString))).iterator();
        do {
            agdvVar = null;
            if (!it.hasNext()) {
                break;
            }
            agdv agdvVar2 = (agdv) it.next();
            if (agdvVar2.getValueParameters().size() == 1 && (returnType = agdvVar2.getReturnType()) != null && afye.isUnit(returnType)) {
                aijp aijpVar = aijp.DEFAULT;
                List<agel> valueParameters = agdvVar2.getValueParameters();
                valueParameters.getClass();
                if (true == aijpVar.equalTypes(((agel) woy.bN(valueParameters)).getType(), agdnVar.getType())) {
                    agdvVar = agdvVar2;
                }
            }
        } while (agdvVar == null);
        return agdvVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set generatedNestedClassNames$lambda$0(agvu agvuVar, agxf agxfVar) {
        return woy.cl(agvuVar.getComponents().getSyntheticPartsProvider().getNestedClassNames(agxfVar.getOwnerDescriptor(), agvuVar));
    }

    private final agcc getConstructorVisibility(agba agbaVar) {
        agcc visibility = agbaVar.getVisibility();
        visibility.getClass();
        if (!affa.f(visibility, agsv.PROTECTED_STATIC_VISIBILITY)) {
            return visibility;
        }
        agcc agccVar = agsv.PROTECTED_AND_PACKAGE;
        agccVar.getClass();
        return agccVar;
    }

    private final Set<agdv> getFunctionsFromSupertypes(ahnj ahnjVar) {
        Collection<aigl> collectionComputeSupertypes = computeSupertypes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionComputeSupertypes.iterator();
        while (it.hasNext()) {
            woy.cq(linkedHashSet, ((aigl) it.next()).getMemberScope().getContributedFunctions(ahnjVar, aglr.WHEN_GET_SUPER_MEMBERS));
        }
        return linkedHashSet;
    }

    private final Set<agdn> getPropertiesFromSupertypes(ahnj ahnjVar) {
        Collection<aigl> collectionComputeSupertypes = computeSupertypes();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = collectionComputeSupertypes.iterator();
        while (it.hasNext()) {
            Collection<? extends agdn> contributedVariables = ((aigl) it.next()).getMemberScope().getContributedVariables(ahnjVar, aglr.WHEN_GET_SUPER_MEMBERS);
            ArrayList arrayList2 = new ArrayList(woy.bp(contributedVariables, 10));
            Iterator<T> it2 = contributedVariables.iterator();
            while (it2.hasNext()) {
                arrayList2.add((agdn) it2.next());
            }
            woy.cq(arrayList, arrayList2);
        }
        return woy.cl(arrayList);
    }

    private final boolean hasSameJvmDescriptorButDoesNotOverride(agdv agdvVar, agcj agcjVar) {
        String strComputeJvmDescriptor$default = ahfp.computeJvmDescriptor$default(agdvVar, false, false, 2, null);
        agcj original = agcjVar.getOriginal();
        original.getClass();
        return affa.f(strComputeJvmDescriptor$default, ahfp.computeJvmDescriptor$default(original, false, false, 2, null)) && !doesOverride(agdvVar, agcjVar);
    }

    private final boolean isVisibleAsFunctionInCurrentClass(agdv agdvVar) {
        ahnj name = agdvVar.getName();
        name.getClass();
        List<ahnj> propertyNamesCandidatesByAccessorName = agto.getPropertyNamesCandidatesByAccessorName(name);
        if (!propertyNamesCandidatesByAccessorName.isEmpty()) {
            Iterator<T> it = propertyNamesCandidatesByAccessorName.iterator();
            while (it.hasNext()) {
                Set<agdn> propertiesFromSupertypes = getPropertiesFromSupertypes((ahnj) it.next());
                if (!propertiesFromSupertypes.isEmpty()) {
                    for (agdn agdnVar : propertiesFromSupertypes) {
                        if (doesClassOverridesProperty(agdnVar, new agwz(agdvVar, this))) {
                            if (!agdnVar.isVar()) {
                                String strAsString = agdvVar.getName().asString();
                                strAsString.getClass();
                                if (!agth.isSetterName(strAsString)) {
                                }
                            }
                            return false;
                        }
                    }
                }
            }
        }
        return (doesOverrideRenamedBuiltins(agdvVar) || shouldBeVisibleAsOverrideOfBuiltInWithErasedValueParameters(agdvVar) || doesOverrideSuspendFunction(agdvVar)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection isVisibleAsFunctionInCurrentClass$lambda$0$0$0(agdv agdvVar, agxf agxfVar, ahnj ahnjVar) {
        ahnjVar.getClass();
        return affa.f(agdvVar.getName(), ahnjVar) ? woy.bg(agdvVar) : woy.bY(agxfVar.searchMethodsByNameWithoutBuiltinMagic(ahnjVar), agxfVar.searchMethodsInSupertypesWithoutBuiltinMagic(ahnjVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set nestedClassIndex$lambda$0(agxf agxfVar) {
        return woy.cl(agxfVar.jClass.getInnerClassNames());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agba nestedClasses$lambda$0(agxf agxfVar, agvu agvuVar, ahnj ahnjVar) {
        ahnjVar.getClass();
        if (agxfVar.nestedClassIndex.invoke().contains(ahnjVar)) {
            agsm finder = agvuVar.getComponents().getFinder();
            ahnd classId = ahvz.getClassId(agxfVar.getOwnerDescriptor());
            classId.getClass();
            agzj agzjVarFindClass = finder.findClass(new agsl(classId.createNestedClassId(ahnjVar), null, agxfVar.jClass, 2, null));
            if (agzjVarFindClass == null) {
                return null;
            }
            agws agwsVar = new agws(agvuVar, agxfVar.getOwnerDescriptor(), agzjVarFindClass, null, 8, null);
            agvuVar.getComponents().getJavaClassesTracker().reportClass(agwsVar);
            return agwsVar;
        }
        if (!agxfVar.generatedNestedClassNames.invoke().contains(ahnjVar)) {
            agzo agzoVar = agxfVar.enumEntryIndex.invoke().get(ahnjVar);
            if (agzoVar == null) {
                return null;
            }
            return aghh.create(agvuVar.getStorageManager(), agxfVar.getOwnerDescriptor(), ahnjVar, agvuVar.getStorageManager().createLazyValue(new agxc(agxfVar)), agvr.resolveAnnotations(agvuVar, agzoVar), agvuVar.getComponents().getSourceElementFactory().source(agzoVar));
        }
        afbt afbtVar = new afbt(10);
        agvuVar.getComponents().getSyntheticPartsProvider().generateNestedClass(agxfVar.getOwnerDescriptor(), ahnjVar, afbtVar, agvuVar);
        List listF = afbtVar.f();
        int i = ((afbt) listF).b;
        if (i == 0) {
            return null;
        }
        if (i == 1) {
            return (agba) woy.bN(listF);
        }
        Objects.toString(listF);
        throw new IllegalStateException("Multiple classes with same name are generated: ".concat(String.valueOf(listF)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Set nestedClasses$lambda$0$2(agxf agxfVar) {
        return woy.aS(agxfVar.getFunctionNames(), agxfVar.getVariableNames());
    }

    private final agdv obtainOverrideForBuiltInWithErasedValueParametersInJava(agdv agdvVar, afec<? super ahnj, ? extends Collection<? extends agdv>> afecVar, Collection<? extends agdv> collection) {
        agdv agdvVarCreateOverrideForBuiltinFunctionWithErasedParameterIfNeeded;
        agcj overriddenBuiltinFunctionWithErasedValueParametersInJava = agsb.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(agdvVar);
        if (overriddenBuiltinFunctionWithErasedValueParametersInJava != null && (agdvVarCreateOverrideForBuiltinFunctionWithErasedParameterIfNeeded = createOverrideForBuiltinFunctionWithErasedParameterIfNeeded(overriddenBuiltinFunctionWithErasedValueParametersInJava, afecVar)) != null) {
            if (true != isVisibleAsFunctionInCurrentClass(agdvVarCreateOverrideForBuiltinFunctionWithErasedParameterIfNeeded)) {
                agdvVarCreateOverrideForBuiltinFunctionWithErasedParameterIfNeeded = null;
            }
            if (agdvVarCreateOverrideForBuiltinFunctionWithErasedParameterIfNeeded != null) {
                return createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(agdvVarCreateOverrideForBuiltinFunctionWithErasedParameterIfNeeded, overriddenBuiltinFunctionWithErasedValueParametersInJava, collection);
            }
        }
        return null;
    }

    private final agdv obtainOverrideForBuiltinWithDifferentJvmName(agdv agdvVar, afec<? super ahnj, ? extends Collection<? extends agdv>> afecVar, ahnj ahnjVar, Collection<? extends agdv> collection) {
        agdv agdvVar2 = (agdv) agtu.getOverriddenBuiltinWithDifferentJvmName(agdvVar);
        if (agdvVar2 == null) {
            return null;
        }
        String jvmMethodNameIfSpecial = agtu.getJvmMethodNameIfSpecial(agdvVar2);
        jvmMethodNameIfSpecial.getClass();
        Iterator<? extends agdv> it = afecVar.invoke(ahnj.identifier(jvmMethodNameIfSpecial)).iterator();
        while (it.hasNext()) {
            agdv agdvVarCreateRenamedCopy = createRenamedCopy(it.next(), ahnjVar);
            if (doesOverrideRenamedDescriptor(agdvVar2, agdvVarCreateRenamedCopy)) {
                return createHiddenCopyIfBuiltinAlreadyAccidentallyOverridden(agdvVarCreateRenamedCopy, agdvVar2, collection);
            }
        }
        return null;
    }

    private final agdv obtainOverrideForSuspend(agdv agdvVar, afec<? super ahnj, ? extends Collection<? extends agdv>> afecVar) {
        if (!agdvVar.isSuspend()) {
            return null;
        }
        ahnj name = agdvVar.getName();
        name.getClass();
        Iterator<T> it = afecVar.invoke(name).iterator();
        while (it.hasNext()) {
            agdv agdvVarCreateSuspendView = createSuspendView((agdv) it.next());
            if (agdvVarCreateSuspendView == null || !doesOverride(agdvVarCreateSuspendView, agdvVar)) {
                agdvVarCreateSuspendView = null;
            }
            if (agdvVarCreateSuspendView != null) {
                return agdvVarCreateSuspendView;
            }
        }
        return null;
    }

    private final aguy resolveConstructor(agzm agzmVar) {
        agba ownerDescriptor = getOwnerDescriptor();
        aguy aguyVarCreateJavaConstructor = aguy.createJavaConstructor(ownerDescriptor, agvr.resolveAnnotations(getC(), agzmVar), false, getC().getComponents().getSourceElementFactory().source(agzmVar));
        agvu agvuVarChildForMethod = agvk.childForMethod(getC(), aguyVarCreateJavaConstructor, agzmVar, ownerDescriptor.getDeclaredTypeParameters().size());
        agyg agygVarResolveValueParameters = resolveValueParameters(agvuVarChildForMethod, aguyVarCreateJavaConstructor, agzmVar.getValueParameters());
        List<agee> declaredTypeParameters = ownerDescriptor.getDeclaredTypeParameters();
        declaredTypeParameters.getClass();
        List<agzx> typeParameters = agzmVar.getTypeParameters();
        ArrayList arrayList = new ArrayList(woy.bp(typeParameters, 10));
        Iterator<T> it = typeParameters.iterator();
        while (it.hasNext()) {
            agee ageeVarResolveTypeParameter = agvuVarChildForMethod.getTypeParameterResolver().resolveTypeParameter((agzx) it.next());
            ageeVarResolveTypeParameter.getClass();
            arrayList.add(ageeVarResolveTypeParameter);
        }
        aguyVarCreateJavaConstructor.initialize(agygVarResolveValueParameters.getDescriptors(), agub.toDescriptorVisibility(agzmVar.getVisibility()), woy.bY(declaredTypeParameters, arrayList));
        aguyVarCreateJavaConstructor.setHasStableParameterNames(false);
        aguyVarCreateJavaConstructor.setHasSynthesizedParameterNames(agygVarResolveValueParameters.getHasSynthesizedNames());
        aguyVarCreateJavaConstructor.setReturnType(ownerDescriptor.getDefaultType());
        agvuVarChildForMethod.getComponents().getJavaResolverCache().recordConstructor(agzmVar, aguyVarCreateJavaConstructor);
        return aguyVarCreateJavaConstructor;
    }

    private final agve resolveRecordComponentToFunctionDescriptor(agzv agzvVar) {
        agve agveVarCreateJavaMethod = agve.createJavaMethod(getOwnerDescriptor(), agvr.resolveAnnotations(getC(), agzvVar), agzvVar.getName(), getC().getComponents().getSourceElementFactory().source(agzvVar), true);
        aigl aiglVarTransformJavaType = getC().getTypeResolver().transformJavaType(agzvVar.getType(), agys.toAttributes$default(aija.COMMON, false, false, null, 6, null));
        agdq dispatchReceiverParameter = getDispatchReceiverParameter();
        afbe afbeVar = afbe.a;
        agveVarCreateJavaMethod.initialize(null, dispatchReceiverParameter, afbeVar, afbeVar, afbeVar, aiglVarTransformJavaType, agcq.Companion.convertFromFlags(false, false, true), agcb.PUBLIC, null);
        agveVarCreateJavaMethod.setParameterNamesStatus(false, false);
        getC().getComponents().getJavaResolverCache().recordMethod(agzvVar, agveVarCreateJavaMethod);
        return agveVarCreateJavaMethod;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<agdv> searchMethodsByNameWithoutBuiltinMagic(ahnj ahnjVar) {
        Collection<agzr> collectionFindMethodsByName = getDeclaredMemberIndex().invoke().findMethodsByName(ahnjVar);
        ArrayList arrayList = new ArrayList(woy.bp(collectionFindMethodsByName, 10));
        Iterator<T> it = collectionFindMethodsByName.iterator();
        while (it.hasNext()) {
            arrayList.add(resolveMethodToFunctionDescriptor((agzr) it.next()));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Collection<agdv> searchMethodsInSupertypesWithoutBuiltinMagic(ahnj ahnjVar) {
        Set<agdv> functionsFromSupertypes = getFunctionsFromSupertypes(ahnjVar);
        ArrayList arrayList = new ArrayList();
        for (Object obj : functionsFromSupertypes) {
            agdv agdvVar = (agdv) obj;
            if (!agtu.doesOverrideBuiltinWithDifferentJvmName(agdvVar) && agsb.getOverriddenBuiltinFunctionWithErasedValueParametersInJava(agdvVar) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean shouldBeVisibleAsOverrideOfBuiltInWithErasedValueParameters(agdv agdvVar) {
        agsb agsbVar = agsb.INSTANCE;
        ahnj name = agdvVar.getName();
        name.getClass();
        if (!agsbVar.getSameAsBuiltinMethodWithErasedValueParameters(name)) {
            return false;
        }
        ahnj name2 = agdvVar.getName();
        name2.getClass();
        Set<agdv> functionsFromSupertypes = getFunctionsFromSupertypes(name2);
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = functionsFromSupertypes.iterator();
        while (it.hasNext()) {
            agcj overriddenBuiltinFunctionWithErasedValueParametersInJava = agsb.getOverriddenBuiltinFunctionWithErasedValueParametersInJava((agdv) it.next());
            if (overriddenBuiltinFunctionWithErasedValueParametersInJava != null) {
                arrayList.add(overriddenBuiltinFunctionWithErasedValueParametersInJava);
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (hasSameJvmDescriptorButDoesNotOverride(agdvVar, (agcj) it2.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.agyh
    protected Set<ahnj> computeClassNames(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        return woy.aS(this.nestedClassIndex.invoke(), this.enumEntryIndex.invoke().keySet());
    }

    @Override // defpackage.agyh
    protected LinkedHashSet<ahnj> computeFunctionNames(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        Collection<aigl> collectionMo89getSupertypes = getOwnerDescriptor().getTypeConstructor().mo89getSupertypes();
        collectionMo89getSupertypes.getClass();
        LinkedHashSet<ahnj> linkedHashSet = new LinkedHashSet<>();
        Iterator<T> it = collectionMo89getSupertypes.iterator();
        while (it.hasNext()) {
            woy.cq(linkedHashSet, ((aigl) it.next()).getMemberScope().getFunctionNames());
        }
        linkedHashSet.addAll(getDeclaredMemberIndex().invoke().getMethodNames());
        linkedHashSet.addAll(getDeclaredMemberIndex().invoke().getRecordComponentNames());
        linkedHashSet.addAll(computeClassNames(ahwtVar, afecVar));
        linkedHashSet.addAll(getC().getComponents().getSyntheticPartsProvider().getMethodNames(getOwnerDescriptor(), getC()));
        return linkedHashSet;
    }

    @Override // defpackage.agyh
    protected void computeImplicitlyDeclaredFunctions(Collection<agdv> collection, ahnj ahnjVar) {
        collection.getClass();
        ahnjVar.getClass();
        if (this.jClass.isRecord() && getDeclaredMemberIndex().invoke().findRecordComponentByName(ahnjVar) != null) {
            if (collection.isEmpty()) {
                agzv agzvVarFindRecordComponentByName = getDeclaredMemberIndex().invoke().findRecordComponentByName(ahnjVar);
                agzvVarFindRecordComponentByName.getClass();
                collection.add(resolveRecordComponentToFunctionDescriptor(agzvVarFindRecordComponentByName));
            } else {
                Iterator<T> it = collection.iterator();
                while (it.hasNext()) {
                    if (((agdv) it.next()).getValueParameters().isEmpty()) {
                        break;
                    }
                }
                agzv agzvVarFindRecordComponentByName2 = getDeclaredMemberIndex().invoke().findRecordComponentByName(ahnjVar);
                agzvVarFindRecordComponentByName2.getClass();
                collection.add(resolveRecordComponentToFunctionDescriptor(agzvVarFindRecordComponentByName2));
            }
        }
        getC().getComponents().getSyntheticPartsProvider().generateMethods(getOwnerDescriptor(), ahnjVar, collection, getC());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agyh
    public agwc computeMemberIndex() {
        return new agwc(this.jClass, agwy.INSTANCE);
    }

    @Override // defpackage.agyh
    protected void computeNonDeclaredFunctions(Collection<agdv> collection, ahnj ahnjVar) {
        collection.getClass();
        ahnjVar.getClass();
        Set<agdv> functionsFromSupertypes = getFunctionsFromSupertypes(ahnjVar);
        if (!agua.Companion.getSameAsRenamedInJvmBuiltin(ahnjVar) && !agsb.INSTANCE.getSameAsBuiltinMethodWithErasedValueParameters(ahnjVar)) {
            if (!functionsFromSupertypes.isEmpty()) {
                Iterator<T> it = functionsFromSupertypes.iterator();
                while (it.hasNext()) {
                    if (((agcj) it.next()).isSuspend()) {
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            for (Object obj : functionsFromSupertypes) {
                if (isVisibleAsFunctionInCurrentClass((agdv) obj)) {
                    arrayList.add(obj);
                }
            }
            addFunctionFromSupertypes(collection, ahnjVar, arrayList, false);
            return;
        }
        aipv aipvVarCreate = aipv.Companion.create();
        Collection<? extends agdv> collectionResolveOverridesForNonStaticMembers = ague.resolveOverridesForNonStaticMembers(ahnjVar, functionsFromSupertypes, afbe.a, getOwnerDescriptor(), ahzh.DO_NOTHING, getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
        addOverriddenSpecialMethods(ahnjVar, collection, collectionResolveOverridesForNonStaticMembers, collection, new agxd(this));
        addOverriddenSpecialMethods(ahnjVar, collection, collectionResolveOverridesForNonStaticMembers, aipvVarCreate, new agxe(this));
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : functionsFromSupertypes) {
            if (isVisibleAsFunctionInCurrentClass((agdv) obj2)) {
                arrayList2.add(obj2);
            }
        }
        addFunctionFromSupertypes(collection, ahnjVar, woy.bY(arrayList2, aipvVarCreate), true);
    }

    @Override // defpackage.agyh
    protected void computeNonDeclaredProperties(ahnj ahnjVar, Collection<agdn> collection) {
        ahnjVar.getClass();
        collection.getClass();
        if (this.jClass.isAnnotationType()) {
            computeAnnotationProperties(ahnjVar, collection);
        }
        Set<agdn> propertiesFromSupertypes = getPropertiesFromSupertypes(ahnjVar);
        if (propertiesFromSupertypes.isEmpty()) {
            return;
        }
        aipv aipvVarCreate = aipv.Companion.create();
        aipv aipvVarCreate2 = aipv.Companion.create();
        addPropertyOverrideByMethod(propertiesFromSupertypes, collection, aipvVarCreate, new agxa(this));
        addPropertyOverrideByMethod(woy.aQ(propertiesFromSupertypes, aipvVarCreate), aipvVarCreate2, null, new agxb(this));
        collection.addAll(ague.resolveOverridesForNonStaticMembers(ahnjVar, woy.aS(propertiesFromSupertypes, aipvVarCreate2), collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil()));
    }

    @Override // defpackage.agyh
    protected Set<ahnj> computePropertyNames(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        if (this.jClass.isAnnotationType()) {
            return getFunctionNames();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(getDeclaredMemberIndex().invoke().getFieldNames());
        Collection<aigl> collectionMo89getSupertypes = getOwnerDescriptor().getTypeConstructor().mo89getSupertypes();
        collectionMo89getSupertypes.getClass();
        Iterator<T> it = collectionMo89getSupertypes.iterator();
        while (it.hasNext()) {
            woy.cq(linkedHashSet, ((aigl) it.next()).getMemberScope().getVariableNames());
        }
        return linkedHashSet;
    }

    public final aiec<List<agaz>> getConstructors$org_jetbrains_kotlin_descriptors_jvm() {
        return this.constructors;
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    public agbd getContributedClassifier(ahnj ahnjVar, aglo agloVar) {
        aieb<ahnj, agba> aiebVar;
        agba agbaVarInvoke;
        ahnjVar.getClass();
        agloVar.getClass();
        mo95recordLookup(ahnjVar, agloVar);
        agxf agxfVar = (agxf) getMainScope();
        return (agxfVar == null || (aiebVar = agxfVar.nestedClasses) == null || (agbaVarInvoke = aiebVar.invoke(ahnjVar)) == null) ? this.nestedClasses.invoke(ahnjVar) : agbaVarInvoke;
    }

    @Override // defpackage.agyh, defpackage.ahxf, defpackage.ahxe, defpackage.ahxi
    public Collection<agdv> getContributedFunctions(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        mo95recordLookup(ahnjVar, agloVar);
        return super.getContributedFunctions(ahnjVar, agloVar);
    }

    @Override // defpackage.agyh, defpackage.ahxf, defpackage.ahxe
    public Collection<agdn> getContributedVariables(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        mo95recordLookup(ahnjVar, agloVar);
        return super.getContributedVariables(ahnjVar, agloVar);
    }

    @Override // defpackage.agyh
    protected agdq getDispatchReceiverParameter() {
        return ahst.getDispatchReceiverParameterIfNeeded(getOwnerDescriptor());
    }

    @Override // defpackage.agyh
    protected boolean isVisibleAsFunction(agve agveVar) {
        agveVar.getClass();
        if (this.jClass.isAnnotationType()) {
            return false;
        }
        return isVisibleAsFunctionInCurrentClass(agveVar);
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    /* renamed from: recordLookup */
    public void mo95recordLookup(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        aglm.record(getC().getComponents().getLookupTracker(), agloVar, getOwnerDescriptor(), ahnjVar);
    }

    @Override // defpackage.agyh
    protected agyf resolveMethodSignature(agzr agzrVar, List<? extends agee> list, aigl aiglVar, List<? extends agel> list2) {
        agzrVar.getClass();
        list.getClass();
        aiglVar.getClass();
        list2.getClass();
        aguv aguvVarResolvePropagatedSignature = getC().getComponents().getSignaturePropagator().resolvePropagatedSignature(agzrVar, getOwnerDescriptor(), aiglVar, null, list2, list);
        aguvVarResolvePropagatedSignature.getClass();
        aigl returnType = aguvVarResolvePropagatedSignature.getReturnType();
        returnType.getClass();
        aigl receiverType = aguvVarResolvePropagatedSignature.getReceiverType();
        List<agel> valueParameters = aguvVarResolvePropagatedSignature.getValueParameters();
        valueParameters.getClass();
        List<agee> typeParameters = aguvVarResolvePropagatedSignature.getTypeParameters();
        typeParameters.getClass();
        boolean zHasStableParameterNames = aguvVarResolvePropagatedSignature.hasStableParameterNames();
        List<String> errors = aguvVarResolvePropagatedSignature.getErrors();
        errors.getClass();
        return new agyf(returnType, receiverType, valueParameters, typeParameters, zHasStableParameterNames, errors);
    }

    @Override // defpackage.agyh
    public String toString() {
        ahnf fqName = this.jClass.getFqName();
        Objects.toString(fqName);
        return "Lazy Java member scope for ".concat(String.valueOf(fqName));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agyh
    public agba getOwnerDescriptor() {
        return this.ownerDescriptor;
    }

    public /* synthetic */ agxf(agvu agvuVar, agba agbaVar, agzj agzjVar, boolean z, agxf agxfVar, int i, afeu afeuVar) {
        this(agvuVar, agbaVar, agzjVar, z, (i & 16) != 0 ? null : agxfVar);
    }

    @Override // defpackage.agyh
    public /* bridge */ /* synthetic */ Set computeFunctionNames(ahwt ahwtVar, afec afecVar) {
        return computeFunctionNames(ahwtVar, (afec<? super ahnj, Boolean>) afecVar);
    }
}
