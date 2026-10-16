package Qe;

import He.h;
import Se.r;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class d implements He.b, Je.b, h {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9993a;

    /* renamed from: b, reason: collision with root package name */
    public Je.b f9994b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9995c;

    /* renamed from: d, reason: collision with root package name */
    public final Object f9996d;

    public /* synthetic */ d(h hVar, Object obj, int i5) {
        this.f9993a = i5;
        this.f9995c = hVar;
        this.f9996d = obj;
    }

    @Override // He.b
    public final void a(Je.b bVar) {
        switch (this.f9993a) {
            case 0:
                He.b bVar2 = (He.b) this.f9995c;
                try {
                    ((e) this.f9996d).getClass();
                    if (Me.a.f(this.f9994b, bVar)) {
                        this.f9994b = bVar;
                        bVar2.a(this);
                        break;
                    }
                } catch (Throwable th) {
                    AbstractC3772b.U(th);
                    bVar.dispose();
                    this.f9994b = Me.a.f7633a;
                    bVar2.a(Me.b.f7635a);
                    bVar2.onError(th);
                    return;
                }
                break;
            case 1:
                if (Me.a.f(this.f9994b, bVar)) {
                    this.f9994b = bVar;
                    ((h) this.f9995c).a(this);
                    break;
                }
                break;
            default:
                h hVar = (h) this.f9995c;
                if (Me.a.f(this.f9994b, bVar)) {
                    try {
                        ((r) this.f9996d).getClass();
                        this.f9994b = bVar;
                        hVar.a(this);
                        break;
                    } catch (Throwable th2) {
                        AbstractC3772b.U(th2);
                        bVar.dispose();
                        this.f9994b = Me.a.f7633a;
                        hVar.a(Me.b.f7635a);
                        hVar.onError(th2);
                    }
                }
                break;
        }
    }

    public void b() {
        try {
            ((r) this.f9996d).getClass();
        } catch (Throwable th) {
            AbstractC3772b.U(th);
            S3.f.A(th);
        }
    }

    public void c(Throwable th) {
        try {
            ((r) this.f9996d).f11101c.accept(th);
        } catch (Throwable th2) {
            AbstractC3772b.U(th2);
            th = new Ke.b(th, th2);
        }
        this.f9994b = Me.a.f7633a;
        ((h) this.f9995c).onError(th);
        b();
    }

    @Override // Je.b
    public final void dispose() {
        switch (this.f9993a) {
            case 0:
                try {
                    ((e) this.f9996d).getClass();
                } catch (Throwable th) {
                    AbstractC3772b.U(th);
                    S3.f.A(th);
                }
                this.f9994b.dispose();
                break;
            case 1:
                Je.b bVar = this.f9994b;
                this.f9994b = Me.a.f7633a;
                bVar.dispose();
                break;
            default:
                try {
                    ((r) this.f9996d).getClass();
                } catch (Throwable th2) {
                    AbstractC3772b.U(th2);
                    S3.f.A(th2);
                }
                this.f9994b.dispose();
                this.f9994b = Me.a.f7633a;
                break;
        }
    }

    @Override // He.b
    public final void onComplete() {
        switch (this.f9993a) {
            case 0:
                He.b bVar = (He.b) this.f9995c;
                e eVar = (e) this.f9996d;
                if (this.f9994b != Me.a.f7633a) {
                    try {
                        eVar.f9999c.run();
                        bVar.onComplete();
                        try {
                            eVar.getClass();
                            break;
                        } catch (Throwable th) {
                            AbstractC3772b.U(th);
                            S3.f.A(th);
                            return;
                        }
                    } catch (Throwable th2) {
                        AbstractC3772b.U(th2);
                        bVar.onError(th2);
                        return;
                    }
                }
                break;
            case 1:
                ((h) this.f9995c).onComplete();
                break;
            default:
                Je.b bVar2 = this.f9994b;
                Me.a aVar = Me.a.f7633a;
                if (bVar2 != aVar) {
                    try {
                        ((r) this.f9996d).getClass();
                        this.f9994b = aVar;
                        ((h) this.f9995c).onComplete();
                        b();
                        break;
                    } catch (Throwable th3) {
                        AbstractC3772b.U(th3);
                        c(th3);
                    }
                }
                break;
        }
    }

    @Override // He.b
    public final void onError(Throwable th) {
        Object obj = this.f9995c;
        Me.a aVar = Me.a.f7633a;
        switch (this.f9993a) {
            case 0:
                e eVar = (e) this.f9996d;
                if (this.f9994b == aVar) {
                    S3.f.A(th);
                    break;
                } else {
                    try {
                        eVar.f9998b.accept(th);
                    } catch (Throwable th2) {
                        AbstractC3772b.U(th2);
                        th = new Ke.b(th, th2);
                    }
                    ((He.b) obj).onError(th);
                    try {
                        eVar.getClass();
                        break;
                    } catch (Throwable th3) {
                        AbstractC3772b.U(th3);
                        S3.f.A(th3);
                        return;
                    }
                }
            case 1:
                ((h) obj).onError(th);
                break;
            default:
                if (this.f9994b != aVar) {
                    c(th);
                    break;
                } else {
                    S3.f.A(th);
                    break;
                }
        }
    }

    @Override // He.h
    public void onSuccess(Object obj) {
        switch (this.f9993a) {
            case 1:
                h hVar = (h) this.f9995c;
                try {
                    Object objApply = ((Le.c) this.f9996d).apply(obj);
                    Ne.b.a(objApply, "The mapper returned a null item");
                    hVar.onSuccess(objApply);
                    break;
                } catch (Throwable th) {
                    AbstractC3772b.U(th);
                    hVar.onError(th);
                    return;
                }
            default:
                Je.b bVar = this.f9994b;
                Me.a aVar = Me.a.f7633a;
                if (bVar != aVar) {
                    try {
                        ((r) this.f9996d).f11100b.accept(obj);
                        this.f9994b = aVar;
                        ((h) this.f9995c).onSuccess(obj);
                        b();
                        break;
                    } catch (Throwable th2) {
                        AbstractC3772b.U(th2);
                        c(th2);
                    }
                }
                break;
        }
    }

    public d(e eVar, He.b bVar) {
        this.f9993a = 0;
        this.f9996d = eVar;
        this.f9995c = bVar;
    }
}
