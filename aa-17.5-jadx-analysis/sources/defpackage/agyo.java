package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class agyo extends agyp {
    private final agzj jClass;
    private final aguz ownerDescriptor;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agyo(agvu agvuVar, agzj agzjVar, aguz aguzVar) {
        super(agvuVar);
        agvuVar.getClass();
        agzjVar.getClass();
        aguzVar.getClass();
        this.jClass = agzjVar;
        this.ownerDescriptor = aguzVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean computeMemberIndex$lambda$0(agzq agzqVar) {
        agzqVar.getClass();
        return agzqVar.isStatic();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection computeNonDeclaredProperties$lambda$0(ahnj ahnjVar, ahxe ahxeVar) {
        ahxeVar.getClass();
        return ahxeVar.getContributedVariables(ahnjVar, aglr.WHEN_GET_SUPER_MEMBERS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection computePropertyNames$lambda$0$0(ahxe ahxeVar) {
        ahxeVar.getClass();
        return ahxeVar.getVariableNames();
    }

    private final <R> Set<R> flatMapJavaStaticSupertypesScopes(agba agbaVar, Set<R> set, afec<? super ahxe, ? extends Collection<? extends R>> afecVar) {
        aipd.dfs(woy.bg(agbaVar), agyl.INSTANCE, new agyn(agbaVar, set, afecVar));
        return set;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterable flatMapJavaStaticSupertypesScopes$lambda$0(agba agbaVar) {
        Collection<aigl> collectionMo89getSupertypes = agbaVar.getTypeConstructor().mo89getSupertypes();
        collectionMo89getSupertypes.getClass();
        return new airu(afrg.r(woy.cm(collectionMo89getSupertypes), agym.INSTANCE), 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agba flatMapJavaStaticSupertypesScopes$lambda$0$0(aigl aiglVar) {
        agbd declarationDescriptor = aiglVar.getConstructor().getDeclarationDescriptor();
        if (declarationDescriptor instanceof agba) {
            return (agba) declarationDescriptor;
        }
        return null;
    }

    private final agdn getRealOriginal(agdn agdnVar) {
        if (agdnVar.getKind().isReal()) {
            return agdnVar;
        }
        Collection<? extends agdn> overriddenDescriptors = agdnVar.getOverriddenDescriptors();
        overriddenDescriptors.getClass();
        ArrayList arrayList = new ArrayList(woy.bp(overriddenDescriptors, 10));
        for (agdn agdnVar2 : overriddenDescriptors) {
            agdnVar2.getClass();
            arrayList.add(getRealOriginal(agdnVar2));
        }
        return (agdn) woy.bN(woy.bQ(arrayList));
    }

    private final Set<agdv> getStaticFunctionsFromJavaSuperClasses(ahnj ahnjVar, agba agbaVar) {
        agyo parentJavaStaticClassScope = agvh.getParentJavaStaticClassScope(agbaVar);
        return parentJavaStaticClassScope == null ? afbg.a : woy.cl(parentJavaStaticClassScope.getContributedFunctions(ahnjVar, aglr.WHEN_GET_SUPER_MEMBERS));
    }

    @Override // defpackage.agyh
    protected Set<ahnj> computeClassNames(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        return afbg.a;
    }

    @Override // defpackage.agyh
    protected Set<ahnj> computeFunctionNames(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        Set<ahnj> setCk = woy.ck(getDeclaredMemberIndex().invoke().getMethodNames());
        agyo parentJavaStaticClassScope = agvh.getParentJavaStaticClassScope(getOwnerDescriptor());
        Set<ahnj> functionNames = parentJavaStaticClassScope != null ? parentJavaStaticClassScope.getFunctionNames() : null;
        if (functionNames == null) {
            functionNames = afbg.a;
        }
        setCk.addAll(functionNames);
        if (this.jClass.isEnum()) {
            setCk.addAll(woy.bi(afyo.ENUM_VALUE_OF, afyo.ENUM_VALUES));
        }
        setCk.addAll(getC().getComponents().getSyntheticPartsProvider().getStaticFunctionNames(getOwnerDescriptor(), getC()));
        return setCk;
    }

    @Override // defpackage.agyh
    protected void computeImplicitlyDeclaredFunctions(Collection<agdv> collection, ahnj ahnjVar) {
        collection.getClass();
        ahnjVar.getClass();
        getC().getComponents().getSyntheticPartsProvider().generateStaticFunctions(getOwnerDescriptor(), ahnjVar, collection, getC());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agyh
    public agwc computeMemberIndex() {
        return new agwc(this.jClass, agyi.INSTANCE);
    }

    @Override // defpackage.agyh
    protected void computeNonDeclaredFunctions(Collection<agdv> collection, ahnj ahnjVar) {
        collection.getClass();
        ahnjVar.getClass();
        collection.addAll(ague.resolveOverridesForStaticMembers(ahnjVar, getStaticFunctionsFromJavaSuperClasses(ahnjVar, getOwnerDescriptor()), collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil()));
        if (this.jClass.isEnum()) {
            if (affa.f(ahnjVar, afyo.ENUM_VALUE_OF)) {
                agdv agdvVarCreateEnumValueOfMethod = ahss.createEnumValueOfMethod(getOwnerDescriptor());
                agdvVarCreateEnumValueOfMethod.getClass();
                collection.add(agdvVarCreateEnumValueOfMethod);
            } else if (affa.f(ahnjVar, afyo.ENUM_VALUES)) {
                agdv agdvVarCreateEnumValuesMethod = ahss.createEnumValuesMethod(getOwnerDescriptor());
                agdvVarCreateEnumValuesMethod.getClass();
                collection.add(agdvVarCreateEnumValuesMethod);
            }
        }
    }

    @Override // defpackage.agyp, defpackage.agyh
    protected void computeNonDeclaredProperties(ahnj ahnjVar, Collection<agdn> collection) {
        ahnj ahnjVar2;
        Collection<agdn> collection2;
        ahnjVar.getClass();
        collection.getClass();
        aguz ownerDescriptor = getOwnerDescriptor();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        flatMapJavaStaticSupertypesScopes(ownerDescriptor, linkedHashSet, new agyk(ahnjVar));
        if (collection.isEmpty()) {
            ahnjVar2 = ahnjVar;
            collection2 = collection;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Object obj : linkedHashSet) {
                agdn realOriginal = getRealOriginal((agdn) obj);
                Object arrayList = linkedHashMap.get(realOriginal);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(realOriginal, arrayList);
                }
                ((List) arrayList).add(obj);
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = linkedHashMap.entrySet().iterator();
            while (it.hasNext()) {
                woy.cq(arrayList2, ague.resolveOverridesForStaticMembers(ahnjVar2, (Collection) ((Map.Entry) it.next()).getValue(), collection2, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil()));
            }
            collection2.addAll(arrayList2);
        } else {
            Collection<? extends agdn> collectionResolveOverridesForStaticMembers = ague.resolveOverridesForStaticMembers(ahnjVar, linkedHashSet, collection, getOwnerDescriptor(), getC().getComponents().getErrorReporter(), getC().getComponents().getKotlinTypeChecker().getOverridingUtil());
            ahnjVar2 = ahnjVar;
            collection2 = collection;
            collection2.addAll(collectionResolveOverridesForStaticMembers);
        }
        if (this.jClass.isEnum() && affa.f(ahnjVar2, afyo.ENUM_ENTRIES)) {
            aiow.addIfNotNull(collection2, ahss.createEnumEntriesProperty(getOwnerDescriptor()));
        }
    }

    @Override // defpackage.agyh
    protected Set<ahnj> computePropertyNames(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        Set<ahnj> setCk = woy.ck(getDeclaredMemberIndex().invoke().getFieldNames());
        flatMapJavaStaticSupertypesScopes(getOwnerDescriptor(), setCk, agyj.INSTANCE);
        if (this.jClass.isEnum()) {
            setCk.add(afyo.ENUM_ENTRIES);
        }
        return setCk;
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    public agbd getContributedClassifier(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agyh
    public aguz getOwnerDescriptor() {
        return this.ownerDescriptor;
    }
}
