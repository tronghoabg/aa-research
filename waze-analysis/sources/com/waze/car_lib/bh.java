package com.waze.car_lib;

import com.waze.NativeManager;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bh {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.sdk.bd f19183a;

    /* renamed from: b, reason: collision with root package name */
    private final NativeManager f19184b;

    public bh(com.waze.sdk.bd bdVar, NativeManager nativeManager) {
        h.g.b.x.f(bdVar, "sdkManager");
        h.g.b.x.f(nativeManager, "nativeManager");
        this.f19183a = bdVar;
        this.f19184b = nativeManager;
    }

    static final void b(bh bhVar) {
        if (bhVar.f19184b.isLoggedIn()) {
            bhVar.f19183a.v();
        }
    }

    static final void c(bh bhVar) {
        bhVar.f19183a.v();
    }
}
