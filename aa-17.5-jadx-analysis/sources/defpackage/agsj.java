package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class agsj {
    public static final agsj INSTANCE;
    private static final Map<ahnd, ahnd> pureImplementationsClassIds;
    private static final Map<ahnf, ahnf> pureImplementationsFqNames;

    static {
        agsj agsjVar = new agsj();
        INSTANCE = agsjVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        pureImplementationsClassIds = linkedHashMap;
        agsjVar.implementedWith(ahnn.INSTANCE.getMutableList(), agsjVar.fqNameListOf("java.util.ArrayList", "java.util.LinkedList"));
        agsjVar.implementedWith(ahnn.INSTANCE.getMutableSet(), agsjVar.fqNameListOf("java.util.HashSet", "java.util.TreeSet", "java.util.LinkedHashSet"));
        agsjVar.implementedWith(ahnn.INSTANCE.getMutableMap(), agsjVar.fqNameListOf("java.util.HashMap", "java.util.TreeMap", "java.util.LinkedHashMap", "java.util.concurrent.ConcurrentHashMap", "java.util.concurrent.ConcurrentSkipListMap"));
        agsjVar.implementedWith(ahnd.Companion.topLevel(new ahnf("java.util.function.Function")), agsjVar.fqNameListOf("java.util.function.UnaryOperator"));
        agsjVar.implementedWith(ahnd.Companion.topLevel(new ahnf("java.util.function.BiFunction")), agsjVar.fqNameListOf("java.util.function.BinaryOperator"));
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            arrayList.add(new aezu(((ahnd) entry.getKey()).asSingleFqName(), ((ahnd) entry.getValue()).asSingleFqName()));
        }
        pureImplementationsFqNames = woy.bc(arrayList);
    }

    private agsj() {
    }

    private final List<ahnd> fqNameListOf(String... strArr) {
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(ahnd.Companion.topLevel(new ahnf(str)));
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void implementedWith(ahnd ahndVar, List<ahnd> list) {
        Map<ahnd, ahnd> map = pureImplementationsClassIds;
        for (Object obj : list) {
            map.put(obj, ahndVar);
        }
    }

    public final ahnd getPurelyImplementedInterface(ahnd ahndVar) {
        ahndVar.getClass();
        return pureImplementationsClassIds.get(ahndVar);
    }

    public final ahnf getPurelyImplementedInterface(ahnf ahnfVar) {
        ahnfVar.getClass();
        return pureImplementationsFqNames.get(ahnfVar);
    }
}
