package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public final class agsc {
    private static final Set<ahnf> GETTER_FQ_NAMES;
    private static final Map<ahnj, List<ahnj>> GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP;
    public static final agsc INSTANCE = new agsc();
    private static final Map<ahnf, ahnj> PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;
    private static final Set<ahnf> SPECIAL_FQ_NAMES;
    private static final Set<ahnj> SPECIAL_SHORT_NAMES;

    static {
        Map<ahnf, ahnj> mapBa = woy.ba(new aezu(agsd.childSafe(afyn._enum, "name"), afyo.NAME), new aezu(agsd.childSafe(afyn._enum, "ordinal"), ahnj.identifier("ordinal")), new aezu(agsd.child(afyn.collection, "size"), ahnj.identifier("size")), new aezu(agsd.child(afyn.map, "size"), ahnj.identifier("size")), new aezu(agsd.childSafe(afyn.charSequence, "length"), ahnj.identifier("length")), new aezu(agsd.child(afyn.map, "keys"), ahnj.identifier("keySet")), new aezu(agsd.child(afyn.map, "values"), ahnj.identifier("values")), new aezu(agsd.child(afyn.map, "entries"), ahnj.identifier("entrySet")), new aezu(agsd.child(afyn.atomicIntArray, "size"), ahnj.identifier("length")), new aezu(agsd.child(afyn.atomicLongArray, "size"), ahnj.identifier("length")), new aezu(agsd.child(afyn.atomicArray, "size"), ahnj.identifier("length")));
        PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP = mapBa;
        Set<Map.Entry<ahnf, ahnj>> setEntrySet = mapBa.entrySet();
        ArrayList<aezu> arrayList = new ArrayList(woy.bp(setEntrySet, 10));
        Iterator<T> it = setEntrySet.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            arrayList.add(new aezu(((ahnf) entry.getKey()).shortName(), entry.getValue()));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (aezu aezuVar : arrayList) {
            ahnj ahnjVar = (ahnj) aezuVar.b;
            Object arrayList2 = linkedHashMap.get(ahnjVar);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                linkedHashMap.put(ahnjVar, arrayList2);
            }
            ((List) arrayList2).add((ahnj) aezuVar.a);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(woy.aV(linkedHashMap.size()));
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            linkedHashMap2.put(entry2.getKey(), woy.bQ((Iterable) entry2.getValue()));
        }
        GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP = linkedHashMap2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<ahnf, ahnj> entry3 : PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP.entrySet()) {
            ahnd ahndVarMapKotlinToJava = afzq.INSTANCE.mapKotlinToJava(entry3.getKey().parent().toUnsafe());
            ahndVarMapKotlinToJava.getClass();
            linkedHashSet.add(ahndVarMapKotlinToJava.asSingleFqName().child(entry3.getValue()));
        }
        GETTER_FQ_NAMES = linkedHashSet;
        Set<ahnf> setKeySet = PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP.keySet();
        SPECIAL_FQ_NAMES = setKeySet;
        ArrayList arrayList3 = new ArrayList(woy.bp(setKeySet, 10));
        Iterator<T> it2 = setKeySet.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((ahnf) it2.next()).shortName());
        }
        SPECIAL_SHORT_NAMES = woy.cl(arrayList3);
    }

    private agsc() {
    }

    public final Map<ahnf, ahnj> getPROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP() {
        return PROPERTY_FQ_NAME_TO_JVM_GETTER_NAME_MAP;
    }

    public final List<ahnj> getPropertyNameCandidatesBySpecialGetterName(ahnj ahnjVar) {
        ahnjVar.getClass();
        List<ahnj> list = GETTER_JVM_NAME_TO_PROPERTIES_SHORT_NAME_MAP.get(ahnjVar);
        return list == null ? afbe.a : list;
    }

    public final Set<ahnf> getSPECIAL_FQ_NAMES() {
        return SPECIAL_FQ_NAMES;
    }

    public final Set<ahnj> getSPECIAL_SHORT_NAMES() {
        return SPECIAL_SHORT_NAMES;
    }
}
