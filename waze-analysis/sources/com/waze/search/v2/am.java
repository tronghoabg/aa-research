package com.waze.search.v2;

import androidx.core.app.NotificationCompat;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class am extends com.waze.speech.k {

    /* renamed from: a, reason: collision with root package name */
    private final com.waze.ui.m.cb f36154a;

    /* renamed from: b, reason: collision with root package name */
    private final kotlinx.coroutines.b.bm f36155b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(com.waze.ui.m.cb cbVar, kotlinx.coroutines.b.bm bmVar) {
        super(null);
        h.g.b.x.f(cbVar, NotificationCompat.CATEGORY_EVENT);
        h.g.b.x.f(bmVar, "uiRequests");
        this.f36154a = cbVar;
        this.f36155b = bmVar;
    }

    public final com.waze.ui.m.cb a() {
        return this.f36154a;
    }

    public final kotlinx.coroutines.b.bm b() {
        return this.f36155b;
    }
}
