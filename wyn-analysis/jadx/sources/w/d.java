package W;

import ff.AbstractC2640A;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import u0.Q;

/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: a, reason: collision with root package name */
    public final LinkedHashMap f14928a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f14929b;

    public d(LinkedHashMap linkedHashMap) {
        this.f14928a = linkedHashMap != null ? AbstractC2640A.a0(linkedHashMap) : new LinkedHashMap();
        this.f14929b = new LinkedHashMap();
    }

    @Override // W.c
    public final G9.e a(String str, tf.a aVar) {
        int length = str.length();
        for (int i5 = 0; i5 < length; i5++) {
            if (!tg.b.I(str.charAt(i5))) {
                LinkedHashMap linkedHashMap = this.f14929b;
                Object arrayList = linkedHashMap.get(str);
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    linkedHashMap.put(str, arrayList);
                }
                ((List) arrayList).add(aVar);
                return new G9.e(this, str, aVar);
            }
        }
        throw new IllegalArgumentException("Registered key is empty or blank");
    }

    @Override // W.c
    public final boolean b(Object obj) {
        return Q.c(obj);
    }

    @Override // W.c
    public final Object c(String str) {
        LinkedHashMap linkedHashMap = this.f14928a;
        List list = (List) linkedHashMap.remove(str);
        if (list == null || list.isEmpty()) {
            return null;
        }
        if (list.size() > 1) {
            linkedHashMap.put(str, list.subList(1, list.size()));
        }
        return list.get(0);
    }
}
