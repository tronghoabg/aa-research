package Se;

/* loaded from: classes5.dex */
public final class l implements He.b, Je.b, He.h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11088a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11089b;

    /* renamed from: c, reason: collision with root package name */
    public Je.b f11090c;

    public /* synthetic */ l(Object obj, int i5) {
        this.f11088a = i5;
        this.f11089b = obj;
    }

    @Override // He.b
    public final void a(Je.b bVar) {
        switch (this.f11088a) {
            case 0:
                if (Me.a.f(this.f11090c, bVar)) {
                    this.f11090c = bVar;
                    ((He.h) this.f11089b).a(this);
                    break;
                }
                break;
            case 1:
                if (Me.a.f(this.f11090c, bVar)) {
                    this.f11090c = bVar;
                    ((He.h) this.f11089b).a(this);
                    break;
                }
                break;
            default:
                if (Me.a.f(this.f11090c, bVar)) {
                    this.f11090c = bVar;
                    ((He.o) this.f11089b).a(this);
                    break;
                }
                break;
        }
    }

    @Override // Je.b
    public final void dispose() {
        switch (this.f11088a) {
            case 0:
                this.f11090c.dispose();
                this.f11090c = Me.a.f7633a;
                break;
            case 1:
                this.f11090c.dispose();
                break;
            default:
                this.f11090c.dispose();
                this.f11090c = Me.a.f7633a;
                break;
        }
    }

    @Override // He.b
    public final void onComplete() {
        switch (this.f11088a) {
            case 0:
                this.f11090c = Me.a.f7633a;
                ((He.h) this.f11089b).onComplete();
                break;
            case 1:
                ((He.h) this.f11089b).onSuccess(Boolean.TRUE);
                break;
            default:
                this.f11090c = Me.a.f7633a;
                ((He.o) this.f11089b).onSuccess(Boolean.TRUE);
                break;
        }
    }

    @Override // He.b
    public final void onError(Throwable th) {
        switch (this.f11088a) {
            case 0:
                this.f11090c = Me.a.f7633a;
                ((He.h) this.f11089b).onError(th);
                break;
            case 1:
                ((He.h) this.f11089b).onError(th);
                break;
            default:
                this.f11090c = Me.a.f7633a;
                ((He.o) this.f11089b).onError(th);
                break;
        }
    }

    @Override // He.h
    public void onSuccess(Object obj) {
        switch (this.f11088a) {
            case 1:
                ((He.h) this.f11089b).onSuccess(Boolean.FALSE);
                break;
            default:
                this.f11090c = Me.a.f7633a;
                ((He.o) this.f11089b).onSuccess(Boolean.FALSE);
                break;
        }
    }
}
