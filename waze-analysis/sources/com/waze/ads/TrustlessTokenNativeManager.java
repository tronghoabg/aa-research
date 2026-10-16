package com.waze.ads;

import h.g.b.o;
import h.g.b.x;
import kotlinx.coroutines.ab;
import kotlinx.coroutines.af;
import kotlinx.coroutines.aj;
import kotlinx.coroutines.av;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class TrustlessTokenNativeManager extends l {
    public static final int $stable = 8;
    private final af coroutineScope;
    private final com.waze.ads.a.h trustlessTokenFetcher;

    public TrustlessTokenNativeManager(com.waze.ads.a.h hVar, ab abVar) {
        x.f(hVar, "trustlessTokenFetcher");
        x.f(abVar, "ioDispatcher");
        this.trustlessTokenFetcher = hVar;
        this.coroutineScope = aj.e(abVar);
    }

    public final void getTrustlessToken$third_party_waze_client_android_project_waze_src_main_waze(int i2) {
        aj.z(this.coroutineScope, null, null, new h(this, i2, null), 3);
    }

    public final native void initNativeLayerNTV();

    public final native void onTokenReceivedNTV(int i2, String str);

    public /* synthetic */ TrustlessTokenNativeManager(com.waze.ads.a.h hVar, ab abVar, int i2, o oVar) {
        this(hVar, (i2 & 2) != 0 ? av.b() : abVar);
    }
}
