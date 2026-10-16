package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class aibp {
    private final aieb<ahnj, agba> enumEntryByName;
    private final Map<ahnj, ahhx> enumEntryProtos;
    private final aiec<Set<ahnj>> enumMemberNames;
    final /* synthetic */ aibt this$0;

    public aibp(aibt aibtVar) {
        this.this$0 = aibtVar;
        List<ahhx> enumEntryList = aibtVar.getClassProto().getEnumEntryList();
        enumEntryList.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(afpt.e(woy.aV(woy.bp(enumEntryList, 10)), 16));
        for (Object obj : enumEntryList) {
            linkedHashMap.put(ahzz.getName(aibtVar.getC().getNameResolver(), ((ahhx) obj).getName()), obj);
        }
        this.enumEntryProtos = linkedHashMap;
        this.enumEntryByName = this.this$0.getC().getStorageManager().createMemoizedFunctionWithNullableValues(new aibm(this, this.this$0));
        this.enumMemberNames = this.this$0.getC().getStorageManager().createLazyValue(new aibn(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Set<ahnj> computeEnumMemberNames() {
        HashSet hashSet = new HashSet();
        Iterator<aigl> it = this.this$0.getTypeConstructor().mo89getSupertypes().iterator();
        while (it.hasNext()) {
            for (agbi agbiVar : ahxh.getContributedDescriptors$default(it.next().getMemberScope(), null, null, 3, null)) {
                if ((agbiVar instanceof agdv) || (agbiVar instanceof agdn)) {
                    hashSet.add(((agax) agbiVar).getName());
                }
            }
        }
        List<ahif> functionList = this.this$0.getClassProto().getFunctionList();
        functionList.getClass();
        aibt aibtVar = this.this$0;
        Iterator<T> it2 = functionList.iterator();
        while (it2.hasNext()) {
            hashSet.add(ahzz.getName(aibtVar.getC().getNameResolver(), ((ahif) it2.next()).getName()));
        }
        List<ahis> propertyList = this.this$0.getClassProto().getPropertyList();
        propertyList.getClass();
        aibt aibtVar2 = this.this$0;
        Iterator<T> it3 = propertyList.iterator();
        while (it3.hasNext()) {
            hashSet.add(ahzz.getName(aibtVar2.getC().getNameResolver(), ((ahis) it3.next()).getName()));
        }
        return woy.aS(hashSet, hashSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final agba enumEntryByName$lambda$0(aibp aibpVar, aibt aibtVar, ahnj ahnjVar) {
        ahnjVar.getClass();
        ahhx ahhxVar = aibpVar.enumEntryProtos.get(ahnjVar);
        if (ahhxVar != null) {
            return aghh.create(aibtVar.getC().getStorageManager(), aibtVar, ahnjVar, aibpVar.enumMemberNames, new aiaw(aibtVar.getC().getStorageManager(), new aibo(aibtVar, ahhxVar)), agdx.NO_SOURCE);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List enumEntryByName$lambda$0$0$0(aibt aibtVar, ahhx ahhxVar) {
        return woy.cf(aibtVar.getC().getComponents().getAnnotationAndConstantLoader().loadEnumEntryAnnotations(aibtVar.getThisAsProtoContainer$org_jetbrains_kotlin_deserialization(), ahhxVar));
    }

    public final Collection<agba> all() {
        Set<ahnj> setKeySet = this.enumEntryProtos.keySet();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            agba agbaVarFindEnumEntry = findEnumEntry((ahnj) it.next());
            if (agbaVarFindEnumEntry != null) {
                arrayList.add(agbaVarFindEnumEntry);
            }
        }
        return arrayList;
    }

    public final agba findEnumEntry(ahnj ahnjVar) {
        ahnjVar.getClass();
        return this.enumEntryByName.invoke(ahnjVar);
    }
}
