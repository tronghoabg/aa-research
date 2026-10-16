package com.waze.google_assistant;

import android.os.Handler;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.shared_infra.i.e f24139a = com.waze.shared_infra.i.a.d("GoogleAssistantActivityLifecycleDelegate");

    /* renamed from: b, reason: collision with root package name */
    private Runnable f24140b = null;

    /* renamed from: c, reason: collision with root package name */
    private final Handler f24141c = new Handler();

    public static /* synthetic */ void a(b bVar) {
        aa.f24060a.a().s();
        bVar.f24140b = null;
    }

    public final void b() {
        this.f24139a.a("onStart (onStartRunnable=" + String.valueOf(this.f24140b) + ")");
        if (this.f24140b == null) {
            com.google.android.material.internal.o oVar = new com.google.android.material.internal.o(this, 20);
            this.f24140b = oVar;
            this.f24141c.postDelayed(oVar, 100L);
        }
    }

    public final void c() {
        this.f24139a.a("onStop (onStartRunnable=" + String.valueOf(this.f24140b) + ")");
        Runnable runnable = this.f24140b;
        if (runnable == null) {
            aa.f24060a.a().u();
        } else {
            this.f24141c.removeCallbacks(runnable);
            this.f24140b = null;
        }
    }
}
