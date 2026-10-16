package com.google.d.m.a;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ac extends ab {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicReferenceFieldUpdater f7978a = AtomicReferenceFieldUpdater.newUpdater(ae.class, Set.class, "seenExceptionsField");

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicIntegerFieldUpdater f7979b = AtomicIntegerFieldUpdater.newUpdater(ae.class, "remainingField");

    @Override // com.google.d.m.a.ab
    final int a(ae aeVar) {
        return f7979b.decrementAndGet(aeVar);
    }

    @Override // com.google.d.m.a.ab
    final void b(ae aeVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f7978a;
        while (!atomicReferenceFieldUpdater.compareAndSet(aeVar, null, set) && atomicReferenceFieldUpdater.get(aeVar) == null) {
        }
    }
}
