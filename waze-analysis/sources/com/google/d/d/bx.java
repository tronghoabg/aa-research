package com.google.d.d;

import java.util.Map;
import java.util.Set;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class bx {

    /* renamed from: a, reason: collision with root package name */
    Map f7478a;

    /* renamed from: b, reason: collision with root package name */
    final int f7479b = 4;

    final Map a() {
        Map map = this.f7478a;
        if (map != null) {
            return map;
        }
        ao aoVar = new ao();
        this.f7478a = aoVar;
        return aoVar;
    }

    public final bo b() {
        bo boVar;
        Map map = this.f7478a;
        if (map == null) {
            boVar = az.f7443a;
        } else {
            Set<Map.Entry> setEntrySet = map.entrySet();
            if (setEntrySet.isEmpty()) {
                boVar = az.f7443a;
            } else {
                bq bqVar = new bq(setEntrySet.size());
                int size = 0;
                for (Map.Entry entry : setEntrySet) {
                    Object key = entry.getKey();
                    bn bnVarF = ((bi) entry.getValue()).f();
                    bqVar.d(key, bnVarF);
                    size += bnVarF.size();
                }
                boVar = new bo(bqVar.b(), size);
            }
        }
        return boVar;
    }

    public final void c(Object obj) {
        fo.af("charset", obj);
        bg bgVarC = (bg) a().get("charset");
        if (bgVarC == null) {
            bgVarC = bn.c(4);
            a().put("charset", bgVarC);
        }
        bgVarC.b(obj);
    }
}
