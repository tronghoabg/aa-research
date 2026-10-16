package com.vungle.ads.internal.network;

import cg.InterfaceC1620i;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
public final class k extends ResponseBody {

    /* renamed from: a, reason: collision with root package name */
    public final MediaType f33415a;

    /* renamed from: b, reason: collision with root package name */
    public final long f33416b;

    public k(MediaType mediaType, long j8) {
        this.f33415a = mediaType;
        this.f33416b = j8;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public final long getF42425e() {
        return this.f33416b;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public final MediaType getF42424d() {
        return this.f33415a;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public final InterfaceC1620i getF42426f() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
