package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ahdb {
    private final Map<Integer, ahar> map;

    public ahdb(Map<Integer, ahar> map) {
        map.getClass();
        this.map = map;
    }

    public final ahdb copyForWarnings() {
        Map<Integer, ahar> map = this.map;
        LinkedHashMap linkedHashMap = new LinkedHashMap(woy.aV(map.size()));
        Iterator<T> it = map.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ahar.copy$default((ahar) entry.getValue(), null, null, false, true, true, 7, null));
        }
        return new ahdb(linkedHashMap);
    }

    public final Map<Integer, ahar> getMap() {
        return this.map;
    }
}
