package com.google.d.f;

import androidx.collection.SieveCacheKt;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class c extends af {

    /* renamed from: a, reason: collision with root package name */
    private static final u f7795a = new b();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicLong f7796b = new AtomicLong(SieveCacheKt.NodeLinkMask);

    c() {
    }

    static af a(com.google.d.f.b.k kVar, s sVar) {
        Integer num = (Integer) kVar.c(m.f7849b);
        if (num == null) {
            return null;
        }
        c cVar = (c) f7795a.c(sVar, kVar);
        return cVar.f7796b.incrementAndGet() >= ((long) num.intValue()) ? cVar : f7679c;
    }

    @Override // com.google.d.f.af
    public final void b() {
        this.f7796b.set(0L);
    }
}
