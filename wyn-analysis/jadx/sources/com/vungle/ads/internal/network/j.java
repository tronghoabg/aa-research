package com.vungle.ads.internal.network;

import cg.AbstractC1613b;
import cg.InterfaceC1620i;
import java.io.IOException;
import kotlin.jvm.internal.AbstractC3340k;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* loaded from: classes5.dex */
public final class j extends ResponseBody {

    /* renamed from: a, reason: collision with root package name */
    public final ResponseBody f33412a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1620i f33413b;

    /* renamed from: c, reason: collision with root package name */
    public IOException f33414c;

    public j(ResponseBody delegate) {
        AbstractC3340k.e(delegate, "delegate");
        this.f33412a = delegate;
        this.f33413b = AbstractC1613b.d(new i(this, delegate.source()));
    }

    public final void a(IOException iOException) {
        this.f33414c = iOException;
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f33412a.close();
    }

    @Override // okhttp3.ResponseBody
    public final long contentLength() {
        return this.f33412a.contentLength();
    }

    @Override // okhttp3.ResponseBody
    public final MediaType contentType() {
        return this.f33412a.contentType();
    }

    @Override // okhttp3.ResponseBody
    public final InterfaceC1620i source() {
        return this.f33413b;
    }

    public final void a() throws IOException {
        IOException iOException = this.f33414c;
        if (iOException != null) {
            throw iOException;
        }
    }
}
