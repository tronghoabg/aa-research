package com.google.d.f;

import j$.util.concurrent.ConcurrentHashMap;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public abstract class u {

    /* renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f7875a = new ConcurrentHashMap();

    protected u() {
    }

    protected abstract Object a();

    public final Object c(s sVar, com.google.d.f.b.k kVar) {
        ConcurrentHashMap concurrentHashMap = this.f7875a;
        Object obj = concurrentHashMap.get(sVar);
        if (obj != null) {
            return obj;
        }
        Object objA = a();
        Object objPutIfAbsent = concurrentHashMap.putIfAbsent(sVar, objA);
        if (objPutIfAbsent != null) {
            return objPutIfAbsent;
        }
        int iA = kVar.a();
        t tVar = null;
        for (int i2 = 0; i2 < iA; i2++) {
            if (m.f7853f.equals(kVar.b(i2))) {
                Object objD = kVar.d(i2);
                if (objD instanceof y) {
                    if (tVar == null) {
                        tVar = new t(this, sVar);
                    }
                    ((y) objD).a();
                }
            }
        }
        return objA;
    }
}
