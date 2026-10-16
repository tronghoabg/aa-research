package com.google.d.f;

import com.google.d.d.fo;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class f extends af {

    /* renamed from: a, reason: collision with root package name */
    private static final u f7840a = new d();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f7841b = new AtomicLong(-1);

    f() {
    }

    static af a(com.google.d.f.b.k kVar, s sVar, long j2) {
        if (((e) kVar.c(m.f7851d)) == null) {
            return null;
        }
        f fVar = (f) f7840a.c(sVar, kVar);
        fo.l(j2 >= 0, "timestamp cannot be negative");
        AtomicLong atomicLong = fVar.f7841b;
        long j3 = atomicLong.get();
        if (j3 >= 0) {
            throw null;
        }
        atomicLong.compareAndSet(j3, -j2);
        return fVar;
    }

    @Override // com.google.d.f.af
    public final void b() {
        AtomicLong atomicLong = this.f7841b;
        atomicLong.set(Math.max(-atomicLong.get(), 0L));
    }
}
