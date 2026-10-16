package okhttp3;

import cg.C1621j;
import cg.InterfaceC1619h;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/RequestBody$Companion$toRequestBody$1", "Lokhttp3/RequestBody;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RequestBody$Companion$toRequestBody$1 extends RequestBody {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MediaType f42389c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C1621j f42390d;

    public RequestBody$Companion$toRequestBody$1(MediaType mediaType, C1621j c1621j) {
        this.f42389c = mediaType;
        this.f42390d = c1621j;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f42390d.d();
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType, reason: from getter */
    public final MediaType getF42304e() {
        return this.f42389c;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(InterfaceC1619h interfaceC1619h) {
        interfaceC1619h.u(this.f42390d);
    }
}
