package Se;

import Va.C1038ka;
import java.util.concurrent.atomic.AtomicReference;
import p7.AbstractC3772b;
import x9.C4504d;

/* loaded from: classes5.dex */
public final class b extends AtomicReference implements He.h, Je.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11064a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11065b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11066c;

    /* renamed from: d, reason: collision with root package name */
    public Object f11067d;

    public b() {
        ya.b bVar = Ne.b.f8674d;
        C1038ka c1038ka = Ne.b.f8675e;
        C4504d c4504d = Ne.b.f8673c;
        this.f11065b = bVar;
        this.f11066c = c1038ka;
        this.f11067d = c4504d;
    }

    @Override // He.h
    public final void a(Je.b bVar) {
        switch (this.f11064a) {
            case 0:
                Me.a.e(this, bVar);
                break;
            default:
                if (Me.a.f((Je.b) this.f11067d, bVar)) {
                    this.f11067d = bVar;
                    ((He.h) this.f11065b).a(this);
                    break;
                }
                break;
        }
    }

    @Override // Je.b
    public final void dispose() {
        switch (this.f11064a) {
            case 0:
                Me.a.a(this);
                break;
            default:
                Me.a.a(this);
                ((Je.b) this.f11067d).dispose();
                break;
        }
    }

    @Override // He.h
    public final void onComplete() {
        switch (this.f11064a) {
            case 0:
                lazySet(Me.a.f7633a);
                try {
                    ((C4504d) this.f11067d).getClass();
                    break;
                } catch (Throwable th) {
                    AbstractC3772b.U(th);
                    S3.f.A(th);
                    return;
                }
            default:
                ((He.h) this.f11065b).onComplete();
                break;
        }
    }

    @Override // He.h
    public final void onError(Throwable th) {
        switch (this.f11064a) {
            case 0:
                lazySet(Me.a.f7633a);
                try {
                    ((C1038ka) this.f11066c).accept(th);
                    break;
                } catch (Throwable th2) {
                    AbstractC3772b.U(th2);
                    S3.f.A(new Ke.b(th, th2));
                    return;
                }
            default:
                ((He.h) this.f11065b).onError(th);
                break;
        }
    }

    @Override // He.h
    public final void onSuccess(Object obj) {
        switch (this.f11064a) {
            case 0:
                lazySet(Me.a.f7633a);
                try {
                    ((ya.b) this.f11065b).getClass();
                    break;
                } catch (Throwable th) {
                    AbstractC3772b.U(th);
                    S3.f.A(th);
                }
            default:
                try {
                    Object objApply = ((Le.c) this.f11066c).apply(obj);
                    Ne.b.a(objApply, "The mapper returned a null MaybeSource");
                    He.g gVar = (He.g) objApply;
                    if (!Me.a.b((Je.b) get())) {
                        gVar.b(new S3.l(this));
                        break;
                    }
                } catch (Exception e7) {
                    AbstractC3772b.U(e7);
                    ((He.h) this.f11065b).onError(e7);
                    return;
                }
                break;
        }
    }

    public b(He.h hVar, Le.c cVar) {
        this.f11065b = hVar;
        this.f11066c = cVar;
    }
}
