package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/* loaded from: classes3.dex */
public final class aikw {
    public static final aikw INSTANCE = new aikw();

    private aikw() {
    }

    private final Collection<aigw> filterTypes(Collection<? extends aigw> collection, afeg<? super aigw, ? super aigw, Boolean> afegVar) {
        ArrayList arrayList = new ArrayList(collection);
        Iterator it = arrayList.iterator();
        it.getClass();
        while (it.hasNext()) {
            aigw aigwVar = (aigw) it.next();
            if (!arrayList.isEmpty()) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    aigw aigwVar2 = (aigw) it2.next();
                    if (aigwVar2 != aigwVar) {
                        aigwVar2.getClass();
                        aigwVar.getClass();
                        if (afegVar.invoke(aigwVar2, aigwVar).booleanValue()) {
                            it.remove();
                            break;
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    private final aigw intersectTypesWithoutIntersectionType(Set<? extends aigw> set) {
        if (set.size() == 1) {
            return (aigw) woy.bM(set);
        }
        Collection<aigw> collectionFilterTypes = filterTypes(set, new aiku(this));
        collectionFilterTypes.isEmpty();
        aigw aigwVarFindIntersectionType = ahuv.Companion.findIntersectionType(collectionFilterTypes);
        if (aigwVarFindIntersectionType != null) {
            return aigwVarFindIntersectionType;
        }
        Collection<aigw> collectionFilterTypes2 = filterTypes(collectionFilterTypes, new aikv(aike.Companion.getDefault()));
        collectionFilterTypes2.isEmpty();
        return collectionFilterTypes2.size() < 2 ? (aigw) woy.bM(collectionFilterTypes2) : new aigk(set).createType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String intersectTypesWithoutIntersectionType$lambda$0(Set set) {
        return "This collections cannot be empty! input types: ".concat(woy.cu(set, null, null, null, null, 63));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean isStrictSupertype(aigl aiglVar, aigl aiglVar2) {
        aikf aikfVar = aike.Companion.getDefault();
        return aikfVar.isSubtypeOf(aiglVar, aiglVar2) && !aikfVar.isSubtypeOf(aiglVar2, aiglVar);
    }

    public final aigw intersectTypes$org_jetbrains_kotlin_descriptors(List<? extends aigw> list) {
        list.getClass();
        list.size();
        ArrayList<aigw> arrayList = new ArrayList();
        for (aigw aigwVar : list) {
            if (aigwVar.getConstructor() instanceof aigk) {
                Collection<aigl> collectionMo89getSupertypes = aigwVar.getConstructor().mo89getSupertypes();
                collectionMo89getSupertypes.getClass();
                ArrayList arrayList2 = new ArrayList(woy.bp(collectionMo89getSupertypes, 10));
                for (aigl aiglVar : collectionMo89getSupertypes) {
                    aiglVar.getClass();
                    aigw aigwVarUpperIfFlexible = aige.upperIfFlexible(aiglVar);
                    if (aigwVar.isMarkedNullable()) {
                        aigwVarUpperIfFlexible = aigwVarUpperIfFlexible.makeNullableAsSpecified(true);
                    }
                    arrayList2.add(aigwVarUpperIfFlexible);
                }
                arrayList.addAll(arrayList2);
            } else {
                arrayList.add(aigwVar);
            }
        }
        aikt aiktVarCombine = aikt.START;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            aiktVarCombine = aiktVarCombine.combine((aijf) it.next());
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (aigw aigwVarMakeSimpleTypeDefinitelyNotNullOrNotNull : arrayList) {
            if (aiktVarCombine == aikt.NOT_NULL) {
                if (aigwVarMakeSimpleTypeDefinitelyNotNullOrNotNull instanceof aijw) {
                    aigwVarMakeSimpleTypeDefinitelyNotNullOrNotNull = aiha.withNotNullProjection((aijw) aigwVarMakeSimpleTypeDefinitelyNotNullOrNotNull);
                }
                aigwVarMakeSimpleTypeDefinitelyNotNullOrNotNull = aiha.makeSimpleTypeDefinitelyNotNullOrNotNull(aigwVarMakeSimpleTypeDefinitelyNotNullOrNotNull, 1 == ((false ? 1 : 0) & ((1 & 1) ^ 1)));
            }
            linkedHashSet.add(aigwVarMakeSimpleTypeDefinitelyNotNullOrNotNull);
        }
        ArrayList arrayList3 = new ArrayList(woy.bp(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((aigw) it2.next()).getAttributes());
        }
        Iterator it3 = arrayList3.iterator();
        if (!it3.hasNext()) {
            throw new UnsupportedOperationException("Empty collection can't be reduced.");
        }
        Object next = it3.next();
        while (it3.hasNext()) {
            next = ((aihr) next).intersect((aihr) it3.next());
        }
        return intersectTypesWithoutIntersectionType(linkedHashSet).replaceAttributes((aihr) next);
    }
}
