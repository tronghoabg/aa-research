package com.waze.network.b;

import androidx.core.app.NotificationCompat;
import java.io.IOException;
import java.net.SocketTimeoutException;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class aw implements okhttp3.g {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ CompletableDeferred f31968a;

    aw(CompletableDeferred completableDeferred) {
        this.f31968a = completableDeferred;
    }

    @Override // okhttp3.g
    public final void a(okhttp3.f fVar, IOException iOException) {
        h.g.b.x.f(fVar, NotificationCompat.CATEGORY_CALL);
        h.g.b.x.f(iOException, "e");
        this.f31968a.b(iOException);
    }

    @Override // okhttp3.g
    public final void b(okhttp3.f fVar, okhttp3.aq aqVar) {
        h.g.b.x.f(fVar, NotificationCompat.CATEGORY_CALL);
        h.g.b.x.f(aqVar, "response");
        if (aqVar.o()) {
            boolean zI = ay.i(aqVar);
            CompletableDeferred completableDeferred = this.f31968a;
            if (zI) {
                completableDeferred.b(new SocketTimeoutException("Gateway Timeout Waze Error"));
                return;
            } else {
                completableDeferred.a(aqVar);
                return;
            }
        }
        int iA = aqVar.a();
        CompletableDeferred completableDeferred2 = this.f31968a;
        if (iA == 504) {
            completableDeferred2.b(new SocketTimeoutException("Gateway Timeout Error"));
            return;
        }
        completableDeferred2.b(new RuntimeException("failed to login, code=" + aqVar.a()));
    }
}
