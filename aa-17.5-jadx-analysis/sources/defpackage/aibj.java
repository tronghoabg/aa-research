package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
final class aibj extends aics {
    public static final /* synthetic */ int a = 0;
    private final aiec<Collection<agbi>> allDescriptors;
    private final aiju kotlinTypeRefiner;
    private final aiec<Collection<aigl>> refinedSupertypes;
    final /* synthetic */ aibt this$0;

    public aibj(aibt aibtVar, aiju aijuVar) {
        aijuVar.getClass();
        this.this$0 = aibtVar;
        ahyy c = aibtVar.getC();
        List<ahif> functionList = aibtVar.getClassProto().getFunctionList();
        functionList.getClass();
        List<ahis> propertyList = aibtVar.getClassProto().getPropertyList();
        propertyList.getClass();
        List<ahjq> typeAliasList = aibtVar.getClassProto().getTypeAliasList();
        typeAliasList.getClass();
        List<Integer> nestedClassNameList = aibtVar.getClassProto().getNestedClassNameList();
        nestedClassNameList.getClass();
        ahld nameResolver = aibtVar.getC().getNameResolver();
        ArrayList arrayList = new ArrayList(woy.bp(nestedClassNameList, 10));
        Iterator<T> it = nestedClassNameList.iterator();
        while (it.hasNext()) {
            arrayList.add(ahzz.getName(nameResolver, ((Number) it.next()).intValue()));
        }
        super(c, functionList, propertyList, typeAliasList, new aibf(arrayList));
        this.kotlinTypeRefiner = aijuVar;
        this.allDescriptors = getC().getStorageManager().createLazyValue(new aibg(this));
        this.refinedSupertypes = getC().getStorageManager().createLazyValue(new aibh(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection allDescriptors$lambda$0(aibj aibjVar) {
        return aibjVar.computeDescriptors(ahwt.ALL, ahxe.Companion.getALL_NAME_FILTER(), aglr.WHEN_GET_ALL_DESCRIPTORS);
    }

    private final <D extends agax> void generateFakeOverrides(ahnj ahnjVar, Collection<? extends D> collection, List<D> list) {
        getC().getComponents().getKotlinTypeChecker().getOverridingUtil().generateOverridesInFunctionGroup(ahnjVar, collection, new ArrayList(list), getClassDescriptor(), new aibi(list));
    }

    private final aibt getClassDescriptor() {
        return this.this$0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Collection refinedSupertypes$lambda$0(aibj aibjVar) {
        return aibjVar.kotlinTypeRefiner.refineSupertypes(aibjVar.getClassDescriptor());
    }

    @Override // defpackage.aics
    protected void addEnumEntryDescriptors(Collection<agbi> collection, afec<? super ahnj, Boolean> afecVar) {
        collection.getClass();
        afecVar.getClass();
        aibp aibpVar = getClassDescriptor().enumEntries;
        Collection<agba> collectionAll = aibpVar != null ? aibpVar.all() : null;
        if (collectionAll == null) {
            collectionAll = afbe.a;
        }
        collection.addAll(collectionAll);
    }

    @Override // defpackage.aics
    protected void computeNonDeclaredFunctions(ahnj ahnjVar, List<agdv> list) {
        ahnjVar.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<aigl> it = this.refinedSupertypes.invoke().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getMemberScope().getContributedFunctions(ahnjVar, aglr.FOR_ALREADY_TRACKED));
        }
        list.addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctions(ahnjVar, this.this$0));
        generateFakeOverrides(ahnjVar, arrayList, list);
    }

    @Override // defpackage.aics
    protected void computeNonDeclaredProperties(ahnj ahnjVar, List<agdn> list) {
        ahnjVar.getClass();
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator<aigl> it = this.refinedSupertypes.invoke().iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getMemberScope().getContributedVariables(ahnjVar, aglr.FOR_ALREADY_TRACKED));
        }
        generateFakeOverrides(ahnjVar, arrayList, list);
    }

    @Override // defpackage.aics
    protected ahnd createClassId(ahnj ahnjVar) {
        ahnjVar.getClass();
        return this.this$0.classId.createNestedClassId(ahnjVar);
    }

    @Override // defpackage.aics, defpackage.ahxf, defpackage.ahxi
    public agbd getContributedClassifier(ahnj ahnjVar, aglo agloVar) {
        agba agbaVarFindEnumEntry;
        ahnjVar.getClass();
        agloVar.getClass();
        mo95recordLookup(ahnjVar, agloVar);
        aibp aibpVar = getClassDescriptor().enumEntries;
        return (aibpVar == null || (agbaVarFindEnumEntry = aibpVar.findEnumEntry(ahnjVar)) == null) ? super.getContributedClassifier(ahnjVar, agloVar) : agbaVarFindEnumEntry;
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    public Collection<agbi> getContributedDescriptors(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        afecVar.getClass();
        return this.allDescriptors.invoke();
    }

    @Override // defpackage.aics, defpackage.ahxf, defpackage.ahxe, defpackage.ahxi
    public Collection<agdv> getContributedFunctions(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        mo95recordLookup(ahnjVar, agloVar);
        return super.getContributedFunctions(ahnjVar, agloVar);
    }

    @Override // defpackage.aics, defpackage.ahxf, defpackage.ahxe
    public Collection<agdn> getContributedVariables(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        mo95recordLookup(ahnjVar, agloVar);
        return super.getContributedVariables(ahnjVar, agloVar);
    }

    @Override // defpackage.aics
    protected Set<ahnj> getNonDeclaredClassifierNames() {
        List<aigl> listMo89getSupertypes = getClassDescriptor().typeConstructor.mo89getSupertypes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = listMo89getSupertypes.iterator();
        while (it.hasNext()) {
            Set<ahnj> classifierNames = ((aigl) it.next()).getMemberScope().getClassifierNames();
            if (classifierNames == null) {
                return null;
            }
            woy.cq(linkedHashSet, classifierNames);
        }
        return linkedHashSet;
    }

    @Override // defpackage.aics
    protected Set<ahnj> getNonDeclaredFunctionNames() {
        List<aigl> listMo89getSupertypes = getClassDescriptor().typeConstructor.mo89getSupertypes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = listMo89getSupertypes.iterator();
        while (it.hasNext()) {
            woy.cq(linkedHashSet, ((aigl) it.next()).getMemberScope().getFunctionNames());
        }
        linkedHashSet.addAll(getC().getComponents().getAdditionalClassPartsProvider().getFunctionsNames(this.this$0));
        return linkedHashSet;
    }

    @Override // defpackage.aics
    protected Set<ahnj> getNonDeclaredVariableNames() {
        List<aigl> listMo89getSupertypes = getClassDescriptor().typeConstructor.mo89getSupertypes();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = listMo89getSupertypes.iterator();
        while (it.hasNext()) {
            woy.cq(linkedHashSet, ((aigl) it.next()).getMemberScope().getVariableNames());
        }
        return linkedHashSet;
    }

    @Override // defpackage.aics
    protected boolean isDeclaredFunctionAvailable(agdv agdvVar) {
        agdvVar.getClass();
        return getC().getComponents().getPlatformDependentDeclarationFilter().isFunctionAvailable(this.this$0, agdvVar);
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    /* renamed from: recordLookup */
    public void mo95recordLookup(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        aglm.record(getC().getComponents().getLookupTracker(), agloVar, getClassDescriptor(), ahnjVar);
    }

    private static final List _init_$lambda$0$0(List list) {
        return list;
    }

    static /* synthetic */ List accessor$DeserializedClassDescriptor$DeserializedClassMemberScope$lambda0(List list) {
        return list;
    }
}
