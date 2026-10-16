package com.google.e.a.e;

import j$.util.DesugarCollections;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class ab {
    public static final ad a(Map map) {
        return new ad(map);
    }

    public static final void b(com.google.e.a.k.a aVar, Object obj, Map map) {
        List list;
        if (aVar.a() != 0 && aVar.a() != 5) {
            throw new GeneralSecurityException("PrefixMap only supports 0 and 5 byte prefixes");
        }
        if (map.containsKey(aVar)) {
            list = (List) map.get(aVar);
        } else {
            ArrayList arrayList = new ArrayList();
            map.put(aVar, arrayList);
            list = arrayList;
        }
        list.add(obj);
    }

    public static final void c(Enum r0, Object obj, Map map, Map map2) {
        map.put(r0, obj);
        map2.put(obj, r0);
    }

    public static final ai d(Map map, Map map2) {
        return new ai(DesugarCollections.unmodifiableMap(map), DesugarCollections.unmodifiableMap(map2));
    }
}
