package zg;

import cg.InterfaceC1620i;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* renamed from: zg.v, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4682v extends ResponseBody {

    /* renamed from: d, reason: collision with root package name */
    public final MediaType f48645d;

    /* renamed from: e, reason: collision with root package name */
    public final long f48646e;

    public C4682v(MediaType mediaType, long j8) {
        this.f48645d = mediaType;
        this.f48646e = j8;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public final long getF42425e() {
        return this.f48646e;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public final MediaType getF42424d() {
        return this.f48645d;
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public final InterfaceC1620i getF42426f() {
        throw new IllegalStateException("Cannot read raw response body of a converted body.");
    }
}
