package Te;

import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class b implements He.j, Je.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11834a;

    /* renamed from: b, reason: collision with root package name */
    public final Ne.a f11835b;

    /* renamed from: c, reason: collision with root package name */
    public Je.b f11836c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f11837d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f11838e;

    public /* synthetic */ b(Object obj, Ne.a aVar, int i5) {
        this.f11834a = i5;
        this.f11838e = obj;
        this.f11835b = aVar;
    }

    @Override // He.j
    public final void a(Je.b bVar) {
        switch (this.f11834a) {
            case 0:
                if (Me.a.f(this.f11836c, bVar)) {
                    this.f11836c = bVar;
                    ((He.j) this.f11838e).a(this);
                    break;
                }
                break;
            default:
                if (Me.a.f(this.f11836c, bVar)) {
                    this.f11836c = bVar;
                    ((He.o) this.f11838e).a(this);
                    break;
                }
                break;
        }
    }

    @Override // He.j
    public final void b(Object obj) {
        switch (this.f11834a) {
            case 0:
                if (!this.f11837d) {
                    try {
                        if (this.f11835b.test(obj)) {
                            this.f11837d = true;
                            this.f11836c.dispose();
                            Boolean bool = Boolean.TRUE;
                            He.j jVar = (He.j) this.f11838e;
                            jVar.b(bool);
                            jVar.onComplete();
                            break;
                        }
                    } catch (Throwable th) {
                        AbstractC3772b.U(th);
                        this.f11836c.dispose();
                        onError(th);
                        return;
                    }
                }
                break;
            default:
                if (!this.f11837d) {
                    try {
                        if (this.f11835b.test(obj)) {
                            this.f11837d = true;
                            this.f11836c.dispose();
                            ((He.o) this.f11838e).onSuccess(Boolean.TRUE);
                            break;
                        }
                    } catch (Throwable th2) {
                        AbstractC3772b.U(th2);
                        this.f11836c.dispose();
                        onError(th2);
                    }
                }
                break;
        }
    }

    @Override // Je.b
    public final void dispose() {
        switch (this.f11834a) {
            case 0:
                this.f11836c.dispose();
                break;
            default:
                this.f11836c.dispose();
                break;
        }
    }

    @Override // He.j
    public final void onComplete() {
        switch (this.f11834a) {
            case 0:
                if (!this.f11837d) {
                    this.f11837d = true;
                    Boolean bool = Boolean.FALSE;
                    He.j jVar = (He.j) this.f11838e;
                    jVar.b(bool);
                    jVar.onComplete();
                    break;
                }
                break;
            default:
                if (!this.f11837d) {
                    this.f11837d = true;
                    ((He.o) this.f11838e).onSuccess(Boolean.FALSE);
                    break;
                }
                break;
        }
    }

    @Override // He.j
    public final void onError(Throwable th) {
        switch (this.f11834a) {
            case 0:
                if (!this.f11837d) {
                    this.f11837d = true;
                    ((He.j) this.f11838e).onError(th);
                    break;
                } else {
                    S3.f.A(th);
                    break;
                }
            default:
                if (!this.f11837d) {
                    this.f11837d = true;
                    ((He.o) this.f11838e).onError(th);
                    break;
                } else {
                    S3.f.A(th);
                    break;
                }
        }
    }
}
