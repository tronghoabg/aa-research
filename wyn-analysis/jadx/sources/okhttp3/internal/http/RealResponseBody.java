package okhttp3.internal.http;

import cg.C1610B;
import cg.InterfaceC1620i;
import kotlin.Metadata;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lokhttp3/internal/http/RealResponseBody;", "Lokhttp3/ResponseBody;", "okhttp"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class RealResponseBody extends ResponseBody {

    /* renamed from: d, reason: collision with root package name */
    public final String f42652d;

    /* renamed from: e, reason: collision with root package name */
    public final long f42653e;

    /* renamed from: f, reason: collision with root package name */
    public final C1610B f42654f;

    public RealResponseBody(String str, long j8, C1610B c1610b) {
        this.f42652d = str;
        this.f42653e = j8;
        this.f42654f = c1610b;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength, reason: from getter */
    public final long getF42653e() {
        return this.f42653e;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public final MediaType getF42424d() {
        String str = this.f42652d;
        if (str == null) {
            return null;
        }
        MediaType.f42292d.getClass();
        return MediaType.Companion.b(str);
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public final InterfaceC1620i getF42426f() {
        return this.f42654f;
    }
}
