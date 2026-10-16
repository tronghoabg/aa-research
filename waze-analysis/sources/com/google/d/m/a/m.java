package com.google.d.m.a;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class m extends l {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<r, Thread> f8073a = AtomicReferenceFieldUpdater.newUpdater(r.class, Thread.class, "thread");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<r, r> f8074b = AtomicReferenceFieldUpdater.newUpdater(r.class, r.class, "next");

    /* renamed from: c, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<? super s<?>, r> f8075c = AtomicReferenceFieldUpdater.newUpdater(s.class, r.class, "waitersField");

    /* renamed from: d, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<? super s<?>, h> f8076d = AtomicReferenceFieldUpdater.newUpdater(s.class, h.class, "listenersField");

    /* renamed from: e, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater<? super s<?>, Object> f8077e = AtomicReferenceFieldUpdater.newUpdater(s.class, Object.class, "valueField");

    @Override // com.google.d.m.a.l
    final h a(s sVar, h hVar) {
        return f8076d.getAndSet(sVar, hVar);
    }

    @Override // com.google.d.m.a.l
    final r b(s sVar, r rVar) {
        return f8075c.getAndSet(sVar, rVar);
    }

    @Override // com.google.d.m.a.l
    final void c(r rVar, r rVar2) {
        f8074b.lazySet(rVar, rVar2);
    }

    @Override // com.google.d.m.a.l
    final void d(r rVar, Thread thread) {
        f8073a.lazySet(rVar, thread);
    }

    @Override // com.google.d.m.a.l
    final boolean e(s sVar, h hVar, h hVar2) {
        return a.a.d(f8076d, sVar, hVar, hVar2);
    }

    @Override // com.google.d.m.a.l
    final boolean f(s sVar, Object obj, Object obj2) {
        return a.a.d(f8077e, sVar, obj, obj2);
    }

    @Override // com.google.d.m.a.l
    final boolean g(s sVar, r rVar, r rVar2) {
        return a.a.d(f8075c, sVar, rVar, rVar2);
    }
}
