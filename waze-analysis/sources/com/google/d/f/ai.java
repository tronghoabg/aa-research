package com.google.d.f;

import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ai extends af {

    /* renamed from: b, reason: collision with root package name */
    private static final u f7681b = new ag();

    /* renamed from: e, reason: collision with root package name */
    private static final ThreadLocal f7682e = new ah();

    /* renamed from: a, reason: collision with root package name */
    final AtomicInteger f7683a = new AtomicInteger();

    ai() {
    }

    static af a(com.google.d.f.b.k kVar, s sVar) {
        Integer num = (Integer) kVar.c(m.f7850c);
        if (num == null || num.intValue() <= 0) {
            return null;
        }
        ai aiVar = (ai) f7681b.c(sVar, kVar);
        return (((Random) f7682e.get()).nextInt(num.intValue()) == 0 ? aiVar.f7683a.incrementAndGet() : aiVar.f7683a.get()) > 0 ? aiVar : f7679c;
    }

    @Override // com.google.d.f.af
    public final void b() {
        this.f7683a.decrementAndGet();
    }
}
