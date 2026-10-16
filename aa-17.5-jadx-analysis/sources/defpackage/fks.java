package defpackage;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class fks implements fkr {
    private final Map a = new LinkedHashMap();

    @Override // defpackage.fkr
    public final List a(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map = this.a;
        for (Map.Entry entry : map.entrySet()) {
            if (affa.f(((fny) entry.getKey()).a, str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            map.remove((fny) it.next());
        }
        return woy.cf(linkedHashMap.values());
    }

    @Override // defpackage.fkr
    public final boolean b(fny fnyVar) {
        return this.a.containsKey(fnyVar);
    }

    @Override // defpackage.fkr
    public final gjv c(fny fnyVar) {
        return (gjv) this.a.remove(fnyVar);
    }

    @Override // defpackage.fkr
    public final gjv d(fny fnyVar) {
        Map map = this.a;
        Object gjvVar = map.get(fnyVar);
        if (gjvVar == null) {
            gjvVar = new gjv(fnyVar);
            map.put(fnyVar, gjvVar);
        }
        return (gjv) gjvVar;
    }

    @Override // defpackage.fkr
    public final /* synthetic */ gjv e(fod fodVar) {
        return dsz.m(this, fodVar);
    }
}
