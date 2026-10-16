package Se;

/* loaded from: classes5.dex */
public final class t extends Pe.a implements He.h {

    /* renamed from: a, reason: collision with root package name */
    public final He.j f11103a;

    /* renamed from: b, reason: collision with root package name */
    public Object f11104b;

    /* renamed from: c, reason: collision with root package name */
    public Je.b f11105c;

    public t(He.j jVar) {
        this.f11103a = jVar;
    }

    @Override // He.h
    public final void a(Je.b bVar) {
        if (Me.a.f(this.f11105c, bVar)) {
            this.f11105c = bVar;
            this.f11103a.a(this);
        }
    }

    @Override // Oe.d
    public final int c(int i5) {
        lazySet(8);
        return 2;
    }

    @Override // Oe.h
    public final void clear() {
        lazySet(32);
        this.f11104b = null;
    }

    @Override // Je.b
    public final void dispose() {
        set(4);
        this.f11104b = null;
        this.f11105c.dispose();
    }

    @Override // Oe.h
    public final boolean isEmpty() {
        return get() != 16;
    }

    @Override // He.h
    public final void onComplete() {
        if ((get() & 54) != 0) {
            return;
        }
        lazySet(2);
        this.f11103a.onComplete();
    }

    @Override // He.h
    public final void onError(Throwable th) {
        if ((get() & 54) != 0) {
            S3.f.A(th);
        } else {
            lazySet(2);
            this.f11103a.onError(th);
        }
    }

    @Override // He.h
    public final void onSuccess(Object obj) {
        int i5 = get();
        if ((i5 & 54) != 0) {
            return;
        }
        He.j jVar = this.f11103a;
        if (i5 == 8) {
            this.f11104b = obj;
            lazySet(16);
            jVar.b(null);
        } else {
            lazySet(2);
            jVar.b(obj);
        }
        if (get() != 4) {
            jVar.onComplete();
        }
    }

    @Override // Oe.h
    public final Object poll() {
        if (get() != 16) {
            return null;
        }
        Object obj = this.f11104b;
        this.f11104b = null;
        lazySet(32);
        return obj;
    }
}
