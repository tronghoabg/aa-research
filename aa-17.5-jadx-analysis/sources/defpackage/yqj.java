package defpackage;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* loaded from: classes3.dex */
final class yqj extends yqk {
    private final Map a;

    public yqj(ypt yptVar, ypt yptVar2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        e(linkedHashMap, yptVar);
        e(linkedHashMap, yptVar2);
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            if (((yos) entry.getKey()).b) {
                entry.setValue(DesugarCollections.unmodifiableList((List) entry.getValue()));
            }
        }
        this.a = DesugarCollections.unmodifiableMap(linkedHashMap);
    }

    private static void e(Map map, ypt yptVar) {
        for (int i = 0; i < yptVar.b(); i++) {
            yos yosVarC = yptVar.c(i);
            Object obj = map.get(yosVarC);
            if (yosVarC.b) {
                List arrayList = (List) obj;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                    map.put(yosVarC, arrayList);
                }
                arrayList.add(yosVarC.c(yptVar.e(i)));
            } else {
                map.put(yosVarC, yosVarC.c(yptVar.e(i)));
            }
        }
    }

    @Override // defpackage.yqk
    public final int a() {
        return this.a.size();
    }

    @Override // defpackage.yqk
    public final Object b(yos yosVar) {
        yrm.h(!yosVar.b, "key must be single valued");
        Object obj = this.a.get(yosVar);
        if (obj != null) {
            return obj;
        }
        return null;
    }

    @Override // defpackage.yqk
    public final Set c() {
        return this.a.keySet();
    }

    @Override // defpackage.yqk
    public final void d(yqa yqaVar, Object obj) {
        for (Map.Entry entry : this.a.entrySet()) {
            yos yosVar = (yos) entry.getKey();
            Object value = entry.getValue();
            if (yosVar.b) {
                yqaVar.b(yosVar, ((List) value).iterator(), obj);
            } else {
                yqaVar.a(yosVar, value, obj);
            }
        }
    }
}
