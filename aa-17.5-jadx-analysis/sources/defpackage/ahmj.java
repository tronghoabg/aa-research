package defpackage;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ahmj {
    public static final ahmj INSTANCE = new ahmj();

    /* renamed from: kotlin, reason: collision with root package name */
    private static final String f14kotlin;
    private static final Map<String, String> map;

    static {
        String str;
        String strCu = woy.cu(woy.bi('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);
        f14kotlin = strCu;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listBi = woy.bi("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iO = affa.o(0, listBi.size() - 1, 2);
        if (iO >= 0) {
            int i = 0;
            while (true) {
                StringBuilder sb = new StringBuilder();
                str = f14kotlin;
                sb.append(str);
                sb.append('/');
                sb.append((String) listBi.get(i));
                int i2 = i + 1;
                linkedHashMap.put(sb.toString(), listBi.get(i2));
                linkedHashMap.put(str + '/' + ((String) listBi.get(i)) + "Array", "[" + ((String) listBi.get(i2)));
                if (i == iO) {
                    break;
                } else {
                    i += 2;
                }
            }
            strCu = str;
        }
        linkedHashMap.put(String.valueOf(strCu).concat("/Unit"), "V");
        map$lambda$0$add(linkedHashMap, "Any", "java/lang/Object");
        map$lambda$0$add(linkedHashMap, "Nothing", "java/lang/Void");
        map$lambda$0$add(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : woy.bi("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            map$lambda$0$add(linkedHashMap, str2, "java/lang/".concat(String.valueOf(str2)));
        }
        for (String str3 : woy.bi("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            map$lambda$0$add(linkedHashMap, "collections/".concat(String.valueOf(str3)), "java/util/".concat(String.valueOf(str3)));
            map$lambda$0$add(linkedHashMap, "collections/Mutable".concat(String.valueOf(str3)), "java/util/".concat(String.valueOf(str3)));
        }
        map$lambda$0$add(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        map$lambda$0$add(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        map$lambda$0$add(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        map$lambda$0$add(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i3 = 0; i3 < 23; i3++) {
            String strBp = a.bp(i3, "Function");
            StringBuilder sb2 = new StringBuilder();
            String str4 = f14kotlin;
            sb2.append(str4);
            sb2.append("/jvm/functions/Function");
            sb2.append(i3);
            map$lambda$0$add(linkedHashMap, strBp, sb2.toString());
            map$lambda$0$add(linkedHashMap, a.bp(i3, "reflect/KFunction"), String.valueOf(str4).concat("/reflect/KFunction"));
        }
        for (String str5 : woy.bi("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            map$lambda$0$add(linkedHashMap, String.valueOf(str5).concat(".Companion"), f14kotlin + "/jvm/internal/" + str5 + "CompanionObject");
        }
        map = linkedHashMap;
    }

    private ahmj() {
    }

    private static final void map$lambda$0$add(Map<String, String> map2, String str, String str2) {
        map2.put(f14kotlin + '/' + str, "L" + str2 + ';');
    }

    public static final String mapClass(String str) {
        str.getClass();
        String str2 = map.get(str);
        if (str2 != null) {
            return str2;
        }
        return "L" + afyh.I(str, '.', '$') + ';';
    }
}
