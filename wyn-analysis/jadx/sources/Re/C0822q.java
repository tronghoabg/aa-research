package Re;

/* renamed from: Re.q, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0822q extends Ye.c implements He.f {

    /* renamed from: c, reason: collision with root package name */
    public ug.b f10756c;

    /* renamed from: d, reason: collision with root package name */
    public long f10757d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f10758e;

    @Override // He.f
    public final void b(Object obj) {
        if (this.f10758e) {
            return;
        }
        long j8 = this.f10757d;
        if (j8 != 0) {
            this.f10757d = j8 + 1;
            return;
        }
        this.f10758e = true;
        this.f10756c.cancel();
        f(obj);
    }

    @Override // ug.b
    public final void cancel() {
        set(4);
        this.f16792b = null;
        this.f10756c.cancel();
    }

    @Override // He.f
    public final void e(ug.b bVar) {
        if (Ye.f.d(this.f10756c, bVar)) {
            this.f10756c = bVar;
            this.f16791a.e(this);
            bVar.request(Long.MAX_VALUE);
        }
    }

    @Override // He.f
    public final void onComplete() {
        if (this.f10758e) {
            return;
        }
        this.f10758e = true;
        this.f16791a.onComplete();
    }

    @Override // He.f
    public final void onError(Throwable th) {
        if (this.f10758e) {
            S3.f.A(th);
        } else {
            this.f10758e = true;
            this.f16791a.onError(th);
        }
    }
}
