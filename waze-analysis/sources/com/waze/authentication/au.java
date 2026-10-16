package com.waze.authentication;

import com.google.firebase.perf.config.RemoteConfigManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final /* synthetic */ class au implements com.google.android.gms.o.m {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f15744a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ int f15745b;

    public /* synthetic */ au(Object obj, int i2) {
        this.f15745b = i2;
        this.f15744a = obj;
    }

    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object, kotlinx.coroutines.CompletableDeferred] */
    @Override // com.google.android.gms.o.m
    public final void onFailure(Exception exc) {
        int i2 = this.f15745b;
        if (i2 == 0) {
            aw.i((aw) this.f15744a, exc);
            return;
        }
        if (i2 == 1) {
            ((RemoteConfigManager) this.f15744a).lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
            return;
        }
        if (i2 != 2) {
            com.waze.shared_infra.i.h.l("UidEventsController", "Failed to authorize", exc);
            ((com.waze.uid.state_impl.b.n) this.f15744a).l();
            return;
        }
        h.g.b.x.f(exc, "e");
        boolean z = exc instanceof com.google.android.gms.common.api.y;
        ?? r3 = this.f15744a;
        boolean z2 = false;
        if (z) {
            r3.a(new com.waze.location.h(false, (com.google.android.gms.common.api.y) exc));
        } else if (exc instanceof com.google.android.gms.common.api.i) {
            r3.a(new com.waze.location.h(false, new com.google.android.gms.common.api.y(((com.google.android.gms.common.api.i) exc).b())));
        } else {
            r3.a(new com.waze.location.h(z2));
        }
    }
}
