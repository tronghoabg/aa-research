package zg;

import cg.InterfaceC1619h;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* loaded from: classes5.dex */
public final class M extends RequestBody {

    /* renamed from: c, reason: collision with root package name */
    public final RequestBody f48547c;

    /* renamed from: d, reason: collision with root package name */
    public final MediaType f48548d;

    public M(RequestBody requestBody, MediaType mediaType) {
        this.f48547c = requestBody;
        this.f48548d = mediaType;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f48547c.contentLength();
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType */
    public final MediaType getF42391c() {
        return this.f48548d;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(InterfaceC1619h interfaceC1619h) {
        this.f48547c.writeTo(interfaceC1619h);
    }
}
