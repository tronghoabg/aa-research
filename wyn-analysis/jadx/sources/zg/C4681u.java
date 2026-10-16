package zg;

import cg.AbstractC1613b;
import cg.C1610B;
import cg.InterfaceC1620i;
import java.io.IOException;
import okhttp3.MediaType;
import okhttp3.ResponseBody;

/* renamed from: zg.u, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4681u extends ResponseBody {

    /* renamed from: d, reason: collision with root package name */
    public final ResponseBody f48642d;

    /* renamed from: e, reason: collision with root package name */
    public final C1610B f48643e;

    /* renamed from: f, reason: collision with root package name */
    public IOException f48644f;

    public C4681u(ResponseBody responseBody) {
        this.f48642d = responseBody;
        this.f48643e = AbstractC1613b.d(new Z3.b(this, responseBody.getF42426f()));
    }

    @Override // okhttp3.ResponseBody, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.f48642d.close();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentLength */
    public final long getF42425e() {
        return this.f48642d.getF42425e();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: contentType */
    public final MediaType getF42424d() {
        return this.f48642d.getF42424d();
    }

    @Override // okhttp3.ResponseBody
    /* renamed from: source */
    public final InterfaceC1620i getF42426f() {
        return this.f48643e;
    }
}
