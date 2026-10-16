package e.a.h;

import com.google.d.b.an;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
final class k<ReqT> extends h {

    /* renamed from: a, reason: collision with root package name */
    private final e.a.k f47780a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f47781b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f47782c = false;

    /* renamed from: d, reason: collision with root package name */
    private boolean f47783d = false;

    k(e.a.k kVar, boolean z) {
        this.f47780a = kVar;
        this.f47781b = z;
    }

    public final void b() {
        boolean z = this.f47781b;
        e.a.k kVar = this.f47780a;
        if (z) {
            kVar.c(1);
        } else {
            kVar.c(2);
        }
    }

    @Override // e.a.h.ae
    public final void onCompleted() {
        this.f47780a.b();
        this.f47783d = true;
    }

    @Override // e.a.h.ae
    public final void onError(Throwable th) {
        this.f47780a.a("Cancelled by client with StreamObserver.onError()", th);
        this.f47782c = true;
    }

    @Override // e.a.h.ae
    public final void onNext(ReqT reqt) {
        an.v(!this.f47782c, "Stream was terminated by error, no further calls are allowed");
        an.v(!this.f47783d, "Stream is already completed, no further calls are allowed");
        this.f47780a.d(reqt);
    }
}
