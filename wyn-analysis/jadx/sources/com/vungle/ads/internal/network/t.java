package com.vungle.ads.internal.network;

import cg.C1618g;
import cg.InterfaceC1619h;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* loaded from: classes5.dex */
public final class t extends RequestBody {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ RequestBody f33449a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1618g f33450b;

    public t(RequestBody requestBody, C1618g c1618g) {
        this.f33449a = requestBody;
        this.f33450b = c1618g;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f33450b.f19902b;
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public final MediaType getF42304e() {
        return this.f33449a.getF42304e();
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(InterfaceC1619h sink) {
        AbstractC3340k.e(sink, "sink");
        sink.u(this.f33450b.D());
    }
}
