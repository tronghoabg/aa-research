package Re;

/* renamed from: Re.s, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0823s implements He.f, Je.b {

    /* renamed from: a, reason: collision with root package name */
    public final He.h f10759a;

    /* renamed from: b, reason: collision with root package name */
    public ug.b f10760b;

    /* renamed from: c, reason: collision with root package name */
    public long f10761c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f10762d;

    public C0823s(He.h hVar) {
        this.f10759a = hVar;
    }

    @Override // He.f
    public final void b(Object obj) {
        if (this.f10762d) {
            return;
        }
        long j8 = this.f10761c;
        if (j8 != 0) {
            this.f10761c = j8 + 1;
            return;
        }
        this.f10762d = true;
        this.f10760b.cancel();
        this.f10760b = Ye.f.f16797a;
        this.f10759a.onSuccess(obj);
    }

    @Override // Je.b
    public final void dispose() {
        this.f10760b.cancel();
        this.f10760b = Ye.f.f16797a;
    }

    @Override // He.f
    public final void e(ug.b bVar) {
        if (Ye.f.d(this.f10760b, bVar)) {
            this.f10760b = bVar;
            this.f10759a.a(this);
            bVar.request(Long.MAX_VALUE);
        }
    }

    @Override // He.f
    public final void onComplete() {
        this.f10760b = Ye.f.f16797a;
        if (this.f10762d) {
            return;
        }
        this.f10762d = true;
        this.f10759a.onComplete();
    }

    @Override // He.f
    public final void onError(Throwable th) {
        if (this.f10762d) {
            S3.f.A(th);
            return;
        }
        this.f10762d = true;
        this.f10760b = Ye.f.f16797a;
        this.f10759a.onError(th);
    }
}
