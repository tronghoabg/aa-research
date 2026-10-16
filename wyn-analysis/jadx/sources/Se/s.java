package Se;

/* loaded from: classes5.dex */
public final class s extends Ye.c implements He.h {

    /* renamed from: c, reason: collision with root package name */
    public Je.b f11102c;

    @Override // He.h
    public final void a(Je.b bVar) {
        if (Me.a.f(this.f11102c, bVar)) {
            this.f11102c = bVar;
            this.f16791a.e(this);
        }
    }

    @Override // ug.b
    public final void cancel() {
        set(4);
        this.f16792b = null;
        this.f11102c.dispose();
    }

    @Override // He.h
    public final void onComplete() {
        this.f16791a.onComplete();
    }

    @Override // He.h
    public final void onError(Throwable th) {
        this.f16791a.onError(th);
    }
}
