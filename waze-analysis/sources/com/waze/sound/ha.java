package com.waze.sound;

import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class ha {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ hl f40122a;

    /* renamed from: b, reason: collision with root package name */
    private final CompletableDeferred f40123b;

    public ha(hl hlVar, CompletableDeferred completableDeferred) {
        h.g.b.x.f(completableDeferred, "deferred");
        this.f40122a = hlVar;
        this.f40123b = completableDeferred;
    }

    public final CompletableDeferred a() {
        return this.f40123b;
    }

    public final void b() {
        h.g.b.x.f("New playback request", "reason");
        this.f40122a.f40154d.g("cancelling: New playback request");
        this.f40123b.a(com.waze.h.a.b.f24308a);
    }
}
