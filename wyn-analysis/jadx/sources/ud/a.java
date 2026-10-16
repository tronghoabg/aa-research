package ud;

import A7.C0237b0;
import md.AbstractC3538f;
import p8.C3775b;
import p8.m;

/* loaded from: classes5.dex */
public final class a extends m {

    /* renamed from: h, reason: collision with root package name */
    public final AbstractC3538f f46772h;

    public a(AbstractC3538f abstractC3538f) {
        this.f46772h = abstractC3538f;
    }

    @Override // p8.m
    public final void g() {
        this.f46772h.a("GrpcFuture was cancelled", null);
    }

    @Override // p8.m
    public final String h() {
        C0237b0 c0237b0S = Ba.c.S(this);
        c0237b0S.f(this.f46772h, "clientCall");
        return c0237b0S.toString();
    }

    public final boolean j(Throwable th) {
        if (!m.f43293f.i(this, null, new C3775b(th))) {
            return false;
        }
        m.c(this, false);
        return true;
    }
}
