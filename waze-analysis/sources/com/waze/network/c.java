package com.waze.network;

import android.net.TrafficStats;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class c implements ap {

    /* renamed from: a, reason: collision with root package name */
    private final h.f f32170a = h.g.a(new com.waze.native_managers.n(3));

    /* renamed from: b, reason: collision with root package name */
    private final CompletableDeferred f32171b = kotlinx.coroutines.bo.j();

    public static final /* synthetic */ ao a(c cVar) {
        return new ao(TrafficStats.getUidRxBytes(cVar.e()), TrafficStats.getUidTxBytes(cVar.e()));
    }

    private final int e() {
        return ((Number) this.f32170a.getValue()).intValue();
    }

    @Override // com.waze.network.ap
    public final Object b(h.c.e eVar) {
        return kotlinx.coroutines.aj.v(kotlinx.coroutines.av.b(), new a(this, null), eVar);
    }

    @Override // com.waze.network.ap
    public final Object c(h.c.e eVar) {
        Object objV = kotlinx.coroutines.aj.v(kotlinx.coroutines.av.b(), new b(this, null), eVar);
        return objV == h.c.a.a.f48038a ? objV : h.ab.f48028a;
    }
}
