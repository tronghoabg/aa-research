package j$.time.format;

import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class v {

    /* renamed from: a, reason: collision with root package name */
    private final Map f37619a;

    /* renamed from: b, reason: collision with root package name */
    private final HashMap f37620b;

    v(Map map) {
        this.f37619a = map;
        HashMap map2 = new HashMap();
        ArrayList arrayList = new ArrayList();
        for (Map.Entry entry : map.entrySet()) {
            HashMap map3 = new HashMap();
            for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                String str = (String) entry2.getValue();
                String str2 = (String) entry2.getValue();
                Long l10 = (Long) entry2.getKey();
                int i5 = b.f37569c;
                map3.put(str, new AbstractMap.SimpleImmutableEntry(str2, l10));
            }
            ArrayList arrayList2 = new ArrayList(map3.values());
            Collections.sort(arrayList2, b.f37568b);
            map2.put((A) entry.getKey(), arrayList2);
            arrayList.addAll(arrayList2);
            map2.put(null, arrayList);
        }
        Collections.sort(arrayList, b.f37568b);
        this.f37620b = map2;
    }

    final String a(long j8, A a5) {
        Map map = (Map) this.f37619a.get(a5);
        if (map != null) {
            return (String) map.get(Long.valueOf(j8));
        }
        return null;
    }

    final Iterator b(A a5) {
        List list = (List) this.f37620b.get(a5);
        if (list != null) {
            return list.iterator();
        }
        return null;
    }
}
