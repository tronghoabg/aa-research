package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public abstract class ahww extends ahxf {
    static final /* synthetic */ afia<Object>[] $$delegatedProperties = {new affn(ahww.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0)};
    private final aiec allDescriptors$delegate;
    private final agba containingClass;

    public ahww(aiei aieiVar, agba agbaVar) {
        aieiVar.getClass();
        agbaVar.getClass();
        this.containingClass = agbaVar;
        this.allDescriptors$delegate = aieiVar.createLazyValue(new ahwu(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List allDescriptors_delegate$lambda$0(ahww ahwwVar) {
        List<agcj> listComputeDeclaredFunctions = ahwwVar.computeDeclaredFunctions();
        return woy.bY(listComputeDeclaredFunctions, ahwwVar.createFakeOverrides(listComputeDeclaredFunctions));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final List<agbi> createFakeOverrides(List<? extends agcj> list) {
        Collection<? extends agax> arrayList;
        ArrayList arrayList2 = new ArrayList(3);
        Collection<aigl> collectionMo89getSupertypes = this.containingClass.getTypeConstructor().mo89getSupertypes();
        collectionMo89getSupertypes.getClass();
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it = collectionMo89getSupertypes.iterator();
        while (it.hasNext()) {
            woy.cq(arrayList3, ahxh.getContributedDescriptors$default(((aigl) it.next()).getMemberScope(), null, null, 3, null));
        }
        ArrayList arrayList4 = new ArrayList();
        for (Object obj : arrayList3) {
            if (obj instanceof agax) {
                arrayList4.add(obj);
            }
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj2 : arrayList4) {
            ahnj name = ((agax) obj2).getName();
            Object arrayList5 = linkedHashMap.get(name);
            if (arrayList5 == null) {
                arrayList5 = new ArrayList();
                linkedHashMap.put(name, arrayList5);
            }
            ((List) arrayList5).add(obj2);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            Object key = entry.getKey();
            key.getClass();
            ahnj ahnjVar = (ahnj) key;
            List list2 = (List) entry.getValue();
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Object obj3 : list2) {
                Boolean boolValueOf = Boolean.valueOf(((agax) obj3) instanceof agcj);
                Object arrayList6 = linkedHashMap2.get(boolValueOf);
                if (arrayList6 == null) {
                    arrayList6 = new ArrayList();
                    linkedHashMap2.put(boolValueOf, arrayList6);
                }
                ((List) arrayList6).add(obj3);
            }
            for (Map.Entry entry2 : linkedHashMap2.entrySet()) {
                boolean zBooleanValue = ((Boolean) entry2.getKey()).booleanValue();
                List list3 = (List) entry2.getValue();
                ahtj ahtjVar = ahtj.DEFAULT;
                if (zBooleanValue) {
                    arrayList = new ArrayList<>();
                    for (Object obj4 : list) {
                        if (affa.f(((agcj) obj4).getName(), ahnjVar)) {
                            arrayList.add(obj4);
                        }
                    }
                } else {
                    arrayList = afbe.a;
                }
                ahtjVar.generateOverridesInFunctionGroup(ahnjVar, list3, arrayList, this.containingClass, new ahwv(arrayList2, this));
            }
        }
        return aiow.compact(arrayList2);
    }

    private final List<agbi> getAllDescriptors() {
        return (List) aieh.getValue(this.allDescriptors$delegate, this, $$delegatedProperties[0]);
    }

    protected abstract List<agcj> computeDeclaredFunctions();

    protected final agba getContainingClass() {
        return this.containingClass;
    }

    @Override // defpackage.ahxf, defpackage.ahxi
    public Collection<agbi> getContributedDescriptors(ahwt ahwtVar, afec<? super ahnj, Boolean> afecVar) {
        ahwtVar.getClass();
        afecVar.getClass();
        return !ahwtVar.acceptsKinds(ahwt.CALLABLES.getKindMask()) ? afbe.a : getAllDescriptors();
    }

    @Override // defpackage.ahxf, defpackage.ahxe, defpackage.ahxi
    public Collection<agdv> getContributedFunctions(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        List<agbi> allDescriptors = getAllDescriptors();
        if (allDescriptors.isEmpty()) {
            return afbe.a;
        }
        aipr aiprVar = new aipr();
        for (Object obj : allDescriptors) {
            if ((obj instanceof agdv) && affa.f(((agdv) obj).getName(), ahnjVar)) {
                aiprVar.add(obj);
            }
        }
        return aiprVar;
    }

    @Override // defpackage.ahxf, defpackage.ahxe
    public Collection<agdn> getContributedVariables(ahnj ahnjVar, aglo agloVar) {
        ahnjVar.getClass();
        agloVar.getClass();
        List<agbi> allDescriptors = getAllDescriptors();
        if (allDescriptors.isEmpty()) {
            return afbe.a;
        }
        aipr aiprVar = new aipr();
        for (Object obj : allDescriptors) {
            if ((obj instanceof agdn) && affa.f(((agdn) obj).getName(), ahnjVar)) {
                aiprVar.add(obj);
            }
        }
        return aiprVar;
    }
}
