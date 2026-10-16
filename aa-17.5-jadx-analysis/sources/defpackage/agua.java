package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
public class agua {
    public static final agtw Companion = new agtw(null);
    private static final List<String> ERASED_COLLECTION_PARAMETER_NAMES;
    private static final List<agtv> ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES;
    private static final List<String> ERASED_COLLECTION_PARAMETER_SIGNATURES;
    private static final Set<ahnj> ERASED_VALUE_PARAMETERS_SHORT_NAMES;
    private static final Set<String> ERASED_VALUE_PARAMETERS_SIGNATURES;
    private static final Map<agtv, agtz> GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP;
    private static final Map<ahnj, ahnj> JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP;
    private static final Set<String> JVM_SIGNATURES_FOR_RENAMED_BUILT_INS;
    private static final Map<agtv, ahnj> NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP;
    private static final Set<ahnj> ORIGINAL_SHORT_NAMES;
    private static final agtv REMOVE_AT_NAME_AND_SIGNATURE;
    private static final Map<String, agtz> SIGNATURE_TO_DEFAULT_VALUES_MAP;
    private static final Map<String, ahnj> SIGNATURE_TO_JVM_REPRESENTATION_NAME;

    static {
        Set<String> setDi = woy.di(new String[]{"containsAll", "removeAll", "retainAll"});
        ArrayList arrayList = new ArrayList(woy.bp(setDi, 10));
        for (String str : setDi) {
            String desc = ahwe.BOOLEAN.getDesc();
            desc.getClass();
            arrayList.add(Companion.method("java/util/Collection", str, "Ljava/util/Collection;", desc));
        }
        ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES = arrayList;
        ArrayList arrayList2 = new ArrayList(woy.bp(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((agtv) it.next()).getSignature());
        }
        ERASED_COLLECTION_PARAMETER_SIGNATURES = arrayList2;
        List<agtv> list = ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES;
        ArrayList arrayList3 = new ArrayList(woy.bp(list, 10));
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            arrayList3.add(((agtv) it2.next()).getName().asString());
        }
        ERASED_COLLECTION_PARAMETER_NAMES = arrayList3;
        ahft ahftVar = ahft.INSTANCE;
        String strJavaUtil = ahftVar.javaUtil("Collection");
        String desc2 = ahwe.BOOLEAN.getDesc();
        desc2.getClass();
        agtw agtwVar = Companion;
        String strJavaUtil2 = ahftVar.javaUtil("Collection");
        String desc3 = ahwe.BOOLEAN.getDesc();
        desc3.getClass();
        String strJavaUtil3 = ahftVar.javaUtil("Map");
        String desc4 = ahwe.BOOLEAN.getDesc();
        desc4.getClass();
        String strJavaUtil4 = ahftVar.javaUtil("Map");
        String desc5 = ahwe.BOOLEAN.getDesc();
        desc5.getClass();
        String strJavaUtil5 = ahftVar.javaUtil("Map");
        String desc6 = ahwe.BOOLEAN.getDesc();
        desc6.getClass();
        String strJavaUtil6 = ahftVar.javaUtil("List");
        String desc7 = ahwe.INT.getDesc();
        desc7.getClass();
        String strJavaUtil7 = ahftVar.javaUtil("List");
        String desc8 = ahwe.INT.getDesc();
        desc8.getClass();
        Map<agtv, agtz> mapBa = woy.ba(new aezu(agtwVar.method(strJavaUtil, "contains", "Ljava/lang/Object;", desc2), agtz.FALSE), new aezu(agtwVar.method(strJavaUtil2, "remove", "Ljava/lang/Object;", desc3), agtz.FALSE), new aezu(agtwVar.method(strJavaUtil3, "containsKey", "Ljava/lang/Object;", desc4), agtz.FALSE), new aezu(agtwVar.method(strJavaUtil4, "containsValue", "Ljava/lang/Object;", desc5), agtz.FALSE), new aezu(agtwVar.method(strJavaUtil5, "remove", "Ljava/lang/Object;Ljava/lang/Object;", desc6), agtz.FALSE), new aezu(agtwVar.method(ahftVar.javaUtil("Map"), "getOrDefault", "Ljava/lang/Object;Ljava/lang/Object;", "Ljava/lang/Object;"), agtz.MAP_GET_OR_DEFAULT), new aezu(agtwVar.method(ahftVar.javaUtil("Map"), "get", "Ljava/lang/Object;", "Ljava/lang/Object;"), agtz.NULL), new aezu(agtwVar.method(ahftVar.javaUtil("Map"), "remove", "Ljava/lang/Object;", "Ljava/lang/Object;"), agtz.NULL), new aezu(agtwVar.method(strJavaUtil6, "indexOf", "Ljava/lang/Object;", desc7), agtz.INDEX), new aezu(agtwVar.method(strJavaUtil7, "lastIndexOf", "Ljava/lang/Object;", desc8), agtz.INDEX));
        GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP = mapBa;
        LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(mapBa.size()));
        Iterator<T> it3 = mapBa.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            linkedHashMap.put(((agtv) entry.getKey()).getSignature(), entry.getValue());
        }
        SIGNATURE_TO_DEFAULT_VALUES_MAP = linkedHashMap;
        Set setAS = woy.aS(GENERIC_PARAMETERS_METHODS_TO_DEFAULT_VALUES_MAP.keySet(), ERASED_COLLECTION_PARAMETER_NAME_AND_SIGNATURES);
        ArrayList arrayList4 = new ArrayList(woy.bp(setAS, 10));
        Iterator it4 = setAS.iterator();
        while (it4.hasNext()) {
            arrayList4.add(((agtv) it4.next()).getName());
        }
        ERASED_VALUE_PARAMETERS_SHORT_NAMES = woy.cl(arrayList4);
        ArrayList arrayList5 = new ArrayList(woy.bp(setAS, 10));
        Iterator it5 = setAS.iterator();
        while (it5.hasNext()) {
            arrayList5.add(((agtv) it5.next()).getSignature());
        }
        ERASED_VALUE_PARAMETERS_SIGNATURES = woy.cl(arrayList5);
        String desc9 = ahwe.INT.getDesc();
        desc9.getClass();
        agtw agtwVar2 = Companion;
        agtv agtvVarMethod = agtwVar2.method("java/util/List", "removeAt", desc9, "Ljava/lang/Object;");
        REMOVE_AT_NAME_AND_SIGNATURE = agtvVarMethod;
        ahft ahftVar2 = ahft.INSTANCE;
        String strJavaLang = ahftVar2.javaLang("Number");
        ahnj ahnjVar = aiof.TO_BYTE;
        String desc10 = ahwe.BYTE.getDesc();
        desc10.getClass();
        String strJavaLang2 = ahftVar2.javaLang("Number");
        ahnj ahnjVar2 = aiof.TO_SHORT;
        String desc11 = ahwe.SHORT.getDesc();
        desc11.getClass();
        String strJavaLang3 = ahftVar2.javaLang("Number");
        ahnj ahnjVar3 = aiof.TO_INT;
        String desc12 = ahwe.INT.getDesc();
        desc12.getClass();
        String strJavaLang4 = ahftVar2.javaLang("Number");
        ahnj ahnjVar4 = aiof.TO_LONG;
        String desc13 = ahwe.LONG.getDesc();
        desc13.getClass();
        String strJavaLang5 = ahftVar2.javaLang("Number");
        ahnj ahnjVar5 = aiof.TO_FLOAT;
        String desc14 = ahwe.FLOAT.getDesc();
        desc14.getClass();
        String strJavaLang6 = ahftVar2.javaLang("Number");
        ahnj ahnjVar6 = aiof.TO_DOUBLE;
        String desc15 = ahwe.DOUBLE.getDesc();
        desc15.getClass();
        String strJavaLang7 = ahftVar2.javaLang("CharSequence");
        String desc16 = ahwe.INT.getDesc();
        desc16.getClass();
        String desc17 = ahwe.CHAR.getDesc();
        desc17.getClass();
        Map<agtv, ahnj> mapBa2 = woy.ba(new aezu(agtwVar2.method(strJavaLang, ahnjVar, "", desc10), ahnj.identifier("byteValue")), new aezu(agtwVar2.method(strJavaLang2, ahnjVar2, "", desc11), ahnj.identifier("shortValue")), new aezu(agtwVar2.method(strJavaLang3, ahnjVar3, "", desc12), ahnj.identifier("intValue")), new aezu(agtwVar2.method(strJavaLang4, ahnjVar4, "", desc13), ahnj.identifier("longValue")), new aezu(agtwVar2.method(strJavaLang5, ahnjVar5, "", desc14), ahnj.identifier("floatValue")), new aezu(agtwVar2.method(strJavaLang6, ahnjVar6, "", desc15), ahnj.identifier("doubleValue")), new aezu(agtvVarMethod, ahnj.identifier("remove")), new aezu(agtwVar2.method(strJavaLang7, "get", desc16, desc17), ahnj.identifier("charAt")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicInteger"), "load", "", "I"), ahnj.identifier("get")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicInteger"), "store", "I", "V"), ahnj.identifier("set")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicInteger"), "exchange", "I", "I"), ahnj.identifier("getAndSet")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicInteger"), "fetchAndAdd", "I", "I"), ahnj.identifier("getAndAdd")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicInteger"), "addAndFetch", "I", "I"), ahnj.identifier("addAndGet")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicLong"), "load", "", "J"), ahnj.identifier("get")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicLong"), "store", "J", "V"), ahnj.identifier("set")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicLong"), "exchange", "J", "J"), ahnj.identifier("getAndSet")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicLong"), "fetchAndAdd", "J", "J"), ahnj.identifier("getAndAdd")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicLong"), "addAndFetch", "J", "J"), ahnj.identifier("addAndGet")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicBoolean"), "load", "", "Z"), ahnj.identifier("get")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicBoolean"), "store", "Z", "V"), ahnj.identifier("set")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicBoolean"), "exchange", "Z", "Z"), ahnj.identifier("getAndSet")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicReference"), "load", "", "Ljava/lang/Object;"), ahnj.identifier("get")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicReference"), "store", "Ljava/lang/Object;", "V"), ahnj.identifier("set")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicReference"), "exchange", "Ljava/lang/Object;", "Ljava/lang/Object;"), ahnj.identifier("getAndSet")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "loadAt", "I", "I"), ahnj.identifier("get")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "storeAt", "II", "V"), ahnj.identifier("set")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "exchangeAt", "II", "I"), ahnj.identifier("getAndSet")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "compareAndSetAt", "III", "Z"), ahnj.identifier("compareAndSet")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "fetchAndAddAt", "II", "I"), ahnj.identifier("getAndAdd")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicIntegerArray"), "addAndFetchAt", "II", "I"), ahnj.identifier("addAndGet")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicLongArray"), "loadAt", "I", "J"), ahnj.identifier("get")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicLongArray"), "storeAt", "IJ", "V"), ahnj.identifier("set")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicLongArray"), "exchangeAt", "IJ", "J"), ahnj.identifier("getAndSet")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicLongArray"), "compareAndSetAt", "IJJ", "Z"), ahnj.identifier("compareAndSet")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicLongArray"), "fetchAndAddAt", "IJ", "J"), ahnj.identifier("getAndAdd")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicLongArray"), "addAndFetchAt", "IJ", "J"), ahnj.identifier("addAndGet")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicReferenceArray"), "loadAt", "I", "Ljava/lang/Object;"), ahnj.identifier("get")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicReferenceArray"), "storeAt", "ILjava/lang/Object;", "V"), ahnj.identifier("set")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicReferenceArray"), "exchangeAt", "ILjava/lang/Object;", "Ljava/lang/Object;"), ahnj.identifier("getAndSet")), new aezu(agtwVar2.method(ahftVar2.javaUtilConcurrentAtomic("AtomicReferenceArray"), "compareAndSetAt", "ILjava/lang/Object;Ljava/lang/Object;", "Z"), ahnj.identifier("compareAndSet")));
        NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP = mapBa2;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(woy.aV(mapBa2.size()));
        Iterator<T> it6 = mapBa2.entrySet().iterator();
        while (it6.hasNext()) {
            Map.Entry entry2 = (Map.Entry) it6.next();
            linkedHashMap2.put(((agtv) entry2.getKey()).getSignature(), entry2.getValue());
        }
        SIGNATURE_TO_JVM_REPRESENTATION_NAME = linkedHashMap2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry<agtv, ahnj> entry3 : NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP.entrySet()) {
            linkedHashSet.add(agtv.copy$default(entry3.getKey(), null, entry3.getValue(), null, null, 13, null).getSignature());
        }
        JVM_SIGNATURES_FOR_RENAMED_BUILT_INS = linkedHashSet;
        Set<agtv> setKeySet = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP.keySet();
        HashSet hashSet = new HashSet();
        Iterator<T> it7 = setKeySet.iterator();
        while (it7.hasNext()) {
            hashSet.add(((agtv) it7.next()).getName());
        }
        ORIGINAL_SHORT_NAMES = hashSet;
        Set<Map.Entry<agtv, ahnj>> setEntrySet = NAME_AND_SIGNATURE_TO_JVM_REPRESENTATION_NAME_MAP.entrySet();
        ArrayList<aezu> arrayList6 = new ArrayList(woy.bp(setEntrySet, 10));
        Iterator<T> it8 = setEntrySet.iterator();
        while (it8.hasNext()) {
            Map.Entry entry4 = (Map.Entry) it8.next();
            arrayList6.add(new aezu(((agtv) entry4.getKey()).getName(), entry4.getValue()));
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(afpt.e(woy.aV(woy.bp(arrayList6, 10)), 16));
        for (aezu aezuVar : arrayList6) {
            linkedHashMap3.put((ahnj) aezuVar.b, (ahnj) aezuVar.a);
        }
        JVM_SHORT_NAME_TO_BUILTIN_SHORT_NAMES_MAP = linkedHashMap3;
    }
}
