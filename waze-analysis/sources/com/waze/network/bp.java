package com.waze.network;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bp implements okhttp3.g {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ bq f32165a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f32166b;

    bp(bq bqVar, CompletableDeferred completableDeferred) {
        this.f32165a = bqVar;
        this.f32166b = completableDeferred;
    }

    @Override // okhttp3.g
    public final void a(okhttp3.f fVar, IOException iOException) {
        h.g.b.x.f(fVar, NotificationCompat.CATEGORY_CALL);
        h.g.b.x.f(iOException, "e");
        this.f32165a.f32168b.b("HTTP Get onFailure ".concat(String.valueOf(iOException.getMessage())));
        this.f32166b.a(h.m.d(e.b.c.a(iOException)));
    }

    @Override // okhttp3.g
    public final void b(okhttp3.f fVar, okhttp3.aq aqVar) {
        h.g.b.x.f(fVar, NotificationCompat.CATEGORY_CALL);
        h.g.b.x.f(aqVar, "response");
        this.f32165a.f32168b.a("HTTP Get onResponse success = " + aqVar.o());
        boolean zO = aqVar.o();
        CompletableDeferred completableDeferred = this.f32166b;
        if (zO) {
            completableDeferred.a(h.m.d(new bm(Integer.valueOf(aqVar.a()), aqVar.m())));
        } else {
            completableDeferred.a(h.m.d(e.b.c.a(new IOException())));
        }
    }
}
