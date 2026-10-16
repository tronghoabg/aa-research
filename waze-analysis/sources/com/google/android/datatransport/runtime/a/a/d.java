package com.google.android.datatransport.runtime.a.a;

import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final Object f4107a;

    public d() {
        this.f4107a = new AtomicInteger();
    }

    public static c a() {
        return new c();
    }

    public final j b() {
        return (j) this.f4107a;
    }

    public final int c() {
        return ((AtomicInteger) this.f4107a).get();
    }

    public final void d() {
        ((AtomicInteger) this.f4107a).incrementAndGet();
    }

    d(j jVar) {
        this.f4107a = jVar;
    }
}
