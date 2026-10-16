package okhttp3;

import cg.AbstractC1613b;
import cg.C1615d;
import cg.InterfaceC1619h;
import java.io.File;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"okhttp3/RequestBody$Companion$asRequestBody$1", "Lokhttp3/RequestBody;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RequestBody$Companion$asRequestBody$1 extends RequestBody {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MediaType f42387c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ File f42388d;

    public RequestBody$Companion$asRequestBody$1(MediaType mediaType, File file) {
        this.f42387c = mediaType;
        this.f42388d = file;
    }

    @Override // okhttp3.RequestBody
    public final long contentLength() {
        return this.f42388d.length();
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType, reason: from getter */
    public final MediaType getF42304e() {
        return this.f42387c;
    }

    @Override // okhttp3.RequestBody
    public final void writeTo(InterfaceC1619h interfaceC1619h) {
        C1615d c1615dL = AbstractC1613b.l(this.f42388d);
        try {
            interfaceC1619h.q(c1615dL);
            c1615dL.close();
        } finally {
        }
    }
}
