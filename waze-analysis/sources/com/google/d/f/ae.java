package com.google.d.f;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
final class ae {

    /* renamed from: a, reason: collision with root package name */
    private static final u f7676a = new ad();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicBoolean f7677b = new AtomicBoolean();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicInteger f7678c = new AtomicInteger();

    private ae() {
    }

    static int a(af afVar, s sVar, com.google.d.f.b.k kVar) {
        ae aeVar = (ae) f7676a.c(sVar, kVar);
        int iIncrementAndGet = aeVar.f7678c.incrementAndGet();
        if (afVar == af.f7679c || !aeVar.f7677b.compareAndSet(false, true)) {
            return -1;
        }
        try {
            afVar.b();
            aeVar.f7677b.set(false);
            aeVar.f7678c.addAndGet(-iIncrementAndGet);
            return iIncrementAndGet - 1;
        } catch (Throwable th) {
            aeVar.f7677b.set(false);
            throw th;
        }
    }

    /* synthetic */ ae(byte[] bArr) {
    }
}
