package defpackage;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
final class zfg extends zff {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(zfi.class, Set.class, "seenExceptionsField");
    private static final AtomicIntegerFieldUpdater b = AtomicIntegerFieldUpdater.newUpdater(zfi.class, "remainingField");

    @Override // defpackage.zff
    public final int a(zfi zfiVar) {
        return b.decrementAndGet(zfiVar);
    }

    @Override // defpackage.zff
    public final void b(zfi zfiVar, Set set) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = a;
        while (!atomicReferenceFieldUpdater.compareAndSet(zfiVar, null, set) && atomicReferenceFieldUpdater.get(zfiVar) == null) {
        }
    }
}
