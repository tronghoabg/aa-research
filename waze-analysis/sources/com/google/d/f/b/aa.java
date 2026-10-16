package com.google.d.f.b;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class aa extends ab {

    /* renamed from: a, reason: collision with root package name */
    private final Map f7730a;

    /* synthetic */ aa(k kVar, k kVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        d(linkedHashMap, kVar);
        d(linkedHashMap, kVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((com.google.d.f.aa) entry.getKey()).i()) {
                entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.f7730a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    private static void d(Map map, k kVar) {
        for (int i2 = 0; i2 < kVar.a(); i2++) {
            com.google.d.f.aa aaVarB = kVar.b(i2);
            Object obj = map.get(aaVarB);
            if (aaVarB.i()) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(aaVarB, arrayList);
                }
                arrayList.add(aaVarB.e(kVar.d(i2)));
            } else {
                map.put(aaVarB, aaVarB.e(kVar.d(i2)));
            }
        }
    }

    @Override // com.google.d.f.b.ab
    public final int a() {
        return this.f7730a.size();
    }

    @Override // com.google.d.f.b.ab
    public final Set b() {
        return this.f7730a.keySet();
    }

    @Override // com.google.d.f.b.ab
    public final void c(r rVar, Object obj) {
        for (Map.Entry entry : this.f7730a.entrySet()) {
            com.google.d.f.aa aaVar = (com.google.d.f.aa) entry.getKey();
            Object value = entry.getValue();
            if (aaVar.i()) {
                rVar.b(aaVar, ((List) value).iterator(), obj);
            } else {
                rVar.a(aaVar, value, obj);
            }
        }
    }
}
