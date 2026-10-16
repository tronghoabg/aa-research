package com.waze.native_managers;

import h.g.b.x;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c<T> {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f30677a = new AtomicInteger(0);

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentHashMap f30678b = new ConcurrentHashMap();

    public final int a(h.g.a.l lVar) {
        x.f(lVar, "callback");
        AtomicInteger atomicInteger = this.f30677a;
        x.f(atomicInteger, "<this>");
        ConcurrentHashMap concurrentHashMap = this.f30678b;
        int iAddAndGet = atomicInteger.addAndGet(1);
        concurrentHashMap.put(Integer.valueOf(iAddAndGet), lVar);
        return iAddAndGet;
    }

    public final h.g.a.l b(int i2) {
        return (h.g.a.l) this.f30678b.remove(Integer.valueOf(i2));
    }
}
