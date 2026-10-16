package com.google.l.b.a;

import java.util.concurrent.atomic.AtomicLong;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
final class bj extends com.google.l.u {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ com.google.l.u f12261a;

    bj(com.google.l.u uVar) {
        this.f12261a = uVar;
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ Object b(com.google.l.d.b bVar) {
        return new AtomicLong(((Number) this.f12261a.b(bVar)).longValue());
    }

    @Override // com.google.l.u
    public final /* bridge */ /* synthetic */ void d(com.google.l.d.c cVar, Object obj) {
        this.f12261a.d(cVar, Long.valueOf(((AtomicLong) obj).get()));
    }
}
