package com.waze.map;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class ec implements dq {

    /* renamed from: a, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f28819a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f28820b;

    public ec() {
        kotlinx.coroutines.b.bm bmVarE = kotlinx.coroutines.b.bu.e(0, 16, kotlinx.coroutines.a.a.f51272b, 1);
        this.f28819a = bmVarE;
        this.f28820b = bmVarE;
    }

    @Override // com.waze.map.dq
    public final /* synthetic */ kotlinx.coroutines.b.k a() {
        return this.f28820b;
    }

    public final void b(eb ebVar) {
        h.g.b.x.f(ebVar, NotificationCompat.CATEGORY_EVENT);
        this.f28819a.c(ebVar);
    }
}
