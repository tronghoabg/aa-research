package kotlin.reflect.jvm.internal.impl.metadata.jvm.deserialization;

import Bf.r;
import Fe.c;
import N0.a;
import R8.v;
import ff.o;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import ka.AbstractC3256n;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import r7.AbstractC3935e;
import wg.b;

/* loaded from: classes5.dex */
public final class ClassMapperLite {

    @NotNull
    public static final ClassMapperLite INSTANCE = new ClassMapperLite();

    /* renamed from: kotlin, reason: collision with root package name */
    @NotNull
    private static final String f39769kotlin = o.w0(AbstractC3935e.D('k', 'o', 't', 'l', 'i', 'n'), "", null, null, null, 62);

    @NotNull
    private static final Map<String, String> map;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        List listD = AbstractC3935e.D("Boolean", "Z", "Char", "C", "Byte", "B", "Short", "S", "Int", "I", "Float", "F", "Long", "J", "Double", "D");
        int iT = c.t(0, listD.size() - 1, 2);
        if (iT >= 0) {
            int i5 = 0;
            while (true) {
                StringBuilder sb2 = new StringBuilder();
                String str = f39769kotlin;
                sb2.append(str);
                sb2.append('/');
                sb2.append((String) listD.get(i5));
                int i10 = i5 + 1;
                linkedHashMap.put(sb2.toString(), listD.get(i10));
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append('/');
                linkedHashMap.put(b.c(sb3, (String) listD.get(i5), "Array"), "[" + ((String) listD.get(i10)));
                if (i5 == iT) {
                    break;
                } else {
                    i5 += 2;
                }
            }
        }
        linkedHashMap.put(f39769kotlin + "/Unit", "V");
        map$lambda$0$add(linkedHashMap, "Any", "java/lang/Object");
        map$lambda$0$add(linkedHashMap, "Nothing", "java/lang/Void");
        map$lambda$0$add(linkedHashMap, "Annotation", "java/lang/annotation/Annotation");
        for (String str2 : AbstractC3935e.D("String", "CharSequence", "Throwable", "Cloneable", "Number", "Comparable", "Enum")) {
            map$lambda$0$add(linkedHashMap, str2, v.f("java/lang/", str2));
        }
        for (String str3 : AbstractC3935e.D("Iterator", "Collection", "List", "Set", "Map", "ListIterator")) {
            map$lambda$0$add(linkedHashMap, v.f("collections/", str3), v.f("java/util/", str3));
            map$lambda$0$add(linkedHashMap, v.f("collections/Mutable", str3), v.f("java/util/", str3));
        }
        map$lambda$0$add(linkedHashMap, "collections/Iterable", "java/lang/Iterable");
        map$lambda$0$add(linkedHashMap, "collections/MutableIterable", "java/lang/Iterable");
        map$lambda$0$add(linkedHashMap, "collections/Map.Entry", "java/util/Map$Entry");
        map$lambda$0$add(linkedHashMap, "collections/MutableMap.MutableEntry", "java/util/Map$Entry");
        for (int i11 = 0; i11 < 23; i11++) {
            String strG = AbstractC3256n.g(i11, "Function");
            StringBuilder sb4 = new StringBuilder();
            String str4 = f39769kotlin;
            sb4.append(str4);
            sb4.append("/jvm/functions/Function");
            sb4.append(i11);
            map$lambda$0$add(linkedHashMap, strG, sb4.toString());
            map$lambda$0$add(linkedHashMap, AbstractC3256n.g(i11, "reflect/KFunction"), a.f(str4, "/reflect/KFunction"));
        }
        for (String str5 : AbstractC3935e.D("Char", "Byte", "Short", "Int", "Float", "Long", "Double", "String", "Enum")) {
            map$lambda$0$add(linkedHashMap, a.f(str5, ".Companion"), AbstractC3256n.h(new StringBuilder(), f39769kotlin, "/jvm/internal/", str5, "CompanionObject"));
        }
        map = linkedHashMap;
    }

    private ClassMapperLite() {
    }

    private static final void map$lambda$0$add(Map<String, String> map2, String str, String str2) {
        map2.put(f39769kotlin + '/' + str, "L" + str2 + ';');
    }

    @NotNull
    public static final String mapClass(@NotNull String classId) {
        AbstractC3340k.e(classId, "classId");
        String str = map.get(classId);
        if (str != null) {
            return str;
        }
        return "L" + r.i0(classId, '.', '$') + ';';
    }
}
