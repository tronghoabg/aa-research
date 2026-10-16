package com.google.firebase.remoteconfig.internal;

import android.content.Context;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    private final Set f10716a;

    /* renamed from: b, reason: collision with root package name */
    private final s f10717b;

    public o(com.google.firebase.e eVar, com.google.firebase.installations.d dVar, m mVar, f fVar, Context context, String str, v vVar, ScheduledExecutorService scheduledExecutorService) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f10716a = linkedHashSet;
        this.f10717b = new s(eVar, dVar, mVar, fVar, context, str, linkedHashSet, vVar, scheduledExecutorService);
    }

    private final synchronized void b() {
        if (this.f10716a.isEmpty()) {
            return;
        }
        this.f10717b.h();
    }

    public final synchronized void a(boolean z) {
        this.f10717b.g(z);
        if (z) {
            return;
        }
        b();
    }
}
