package com.google.firebase.perf.network;

import com.google.firebase.perf.e.m;
import org.apache.http.HttpResponse;
import org.apache.http.client.ResponseHandler;

/* compiled from: WazeSource */
/* loaded from: classes4.dex */
public final class f implements ResponseHandler {

    /* renamed from: a, reason: collision with root package name */
    private final ResponseHandler f10551a;

    /* renamed from: b, reason: collision with root package name */
    private final m f10552b;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.firebase.perf.metrics.f f10553c;

    public f(ResponseHandler responseHandler, m mVar, com.google.firebase.perf.metrics.f fVar) {
        this.f10551a = responseHandler;
        this.f10552b = mVar;
        this.f10553c = fVar;
    }

    @Override // org.apache.http.client.ResponseHandler
    public final Object handleResponse(HttpResponse httpResponse) {
        m mVar = this.f10552b;
        com.google.firebase.perf.metrics.f fVar = this.f10553c;
        fVar.n(mVar.b());
        fVar.g(httpResponse.getStatusLine().getStatusCode());
        Long lA = h.a(httpResponse);
        if (lA != null) {
            fVar.l(lA.longValue());
        }
        String strB = h.b(httpResponse);
        if (strB != null) {
            fVar.k(strB);
        }
        fVar.e();
        return this.f10551a.handleResponse(httpResponse);
    }
}
