package Re;

/* loaded from: classes5.dex */
public final class F implements He.j, ug.b {

    /* renamed from: a, reason: collision with root package name */
    public final He.f f10649a;

    /* renamed from: b, reason: collision with root package name */
    public Je.b f10650b;

    public F(He.f fVar) {
        this.f10649a = fVar;
    }

    @Override // He.j
    public final void a(Je.b bVar) {
        this.f10650b = bVar;
        this.f10649a.e(this);
    }

    @Override // He.j
    public final void b(Object obj) {
        this.f10649a.b(obj);
    }

    @Override // ug.b
    public final void cancel() {
        this.f10650b.dispose();
    }

    @Override // He.j
    public final void onComplete() {
        this.f10649a.onComplete();
    }

    @Override // He.j
    public final void onError(Throwable th) {
        this.f10649a.onError(th);
    }

    @Override // ug.b
    public final void request(long j8) {
    }
}
