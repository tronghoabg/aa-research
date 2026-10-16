package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ackt extends acko {
    public static final acku b = acks.b(Collections.EMPTY_MAP);

    public ackt(Map map) {
        super(map);
    }

    @Override // defpackage.aezk, defpackage.aezj
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final Map a() {
        Map map = this.a;
        LinkedHashMap linkedHashMapDK = woy.dK(map.size());
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMapDK.put(entry.getKey(), ((acku) entry.getValue()).a());
        }
        return DesugarCollections.unmodifiableMap(linkedHashMapDK);
    }
}
