package e.a.h;

import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class l extends com.google.d.m.a.k {

    /* renamed from: a, reason: collision with root package name */
    private final e.a.k f47784a;

    l(e.a.k kVar) {
        this.f47784a = kVar;
    }

    @Override // com.google.d.m.a.k
    protected final String a() {
        com.google.d.b.z zVarH = an.H(this);
        zVarH.d("clientCall", this.f47784a);
        return zVarH.toString();
    }

    @Override // com.google.d.m.a.k
    protected final boolean c(Object obj) {
        return super.c(obj);
    }

    @Override // com.google.d.m.a.k
    protected final boolean d(Throwable th) {
        return super.d(th);
    }

    @Override // com.google.d.m.a.k
    protected final void l() {
        this.f47784a.a("GrpcFuture was cancelled", null);
    }
}
