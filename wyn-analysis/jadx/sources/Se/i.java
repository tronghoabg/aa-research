package Se;

import A7.CallableC0255h0;
import java.util.concurrent.atomic.AtomicReference;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class i extends AtomicReference implements He.h, He.b, Je.b, He.o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11082a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11083b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f11084c;

    public /* synthetic */ i(int i5, Object obj, Object obj2) {
        this.f11082a = i5;
        this.f11083b = obj;
        this.f11084c = obj2;
    }

    @Override // He.h
    public final void a(Je.b bVar) {
        switch (this.f11082a) {
            case 0:
                Me.a.c(this, bVar);
                break;
            case 1:
                Me.a.e(this, bVar);
                break;
            case 2:
                if (Me.a.e(this, bVar)) {
                    ((He.h) this.f11083b).a(this);
                    break;
                }
                break;
            default:
                if (Me.a.e(this, bVar)) {
                    ((He.o) this.f11083b).a(this);
                    break;
                }
                break;
        }
    }

    @Override // Je.b
    public final void dispose() {
        switch (this.f11082a) {
            case 0:
                Me.a.a(this);
                break;
            case 1:
                Me.a.a(this);
                Je.c cVar = (Je.c) this.f11083b;
                cVar.getClass();
                Me.a.a(cVar);
                break;
            case 2:
                Me.a.a(this);
                break;
            default:
                Me.a.a(this);
                break;
        }
    }

    @Override // He.h
    public void onComplete() {
        switch (this.f11082a) {
            case 0:
                ((He.b) this.f11083b).onComplete();
                break;
            case 1:
                ((He.h) this.f11084c).onComplete();
                break;
            default:
                Je.b bVar = (Je.b) get();
                if (bVar != Me.a.f7633a && compareAndSet(bVar, null)) {
                    ((He.g) this.f11084c).b(new S3.s(22, (He.h) this.f11083b, this));
                    break;
                }
                break;
        }
    }

    @Override // He.h
    public final void onError(Throwable th) {
        boolean z2 = false;
        Object obj = this.f11084c;
        Object obj2 = this.f11083b;
        switch (this.f11082a) {
            case 0:
                ((He.b) obj2).onError(th);
                break;
            case 1:
                ((He.h) obj).onError(th);
                break;
            case 2:
                ((He.h) obj2).onError(th);
                break;
            default:
                He.o oVar = (He.o) obj2;
                try {
                    Object obj3 = ((CallableC0255h0) obj).f887b;
                    Ne.b.a(obj3, "The nextFunction returned a null SingleSource.");
                    ((He.n) obj3).b(new S3.e(this, z2, oVar, 14));
                    break;
                } catch (Throwable th2) {
                    AbstractC3772b.U(th2);
                    oVar.onError(new Ke.b(th, th2));
                }
        }
    }

    @Override // He.h
    public final void onSuccess(Object obj) {
        switch (this.f11082a) {
            case 0:
                try {
                    Object objApply = ((Le.c) this.f11084c).apply(obj);
                    Ne.b.a(objApply, "The mapper returned a null CompletableSource");
                    He.a aVar = (He.a) objApply;
                    if (!Me.a.b((Je.b) get())) {
                        aVar.d(this);
                        break;
                    }
                } catch (Throwable th) {
                    AbstractC3772b.U(th);
                    onError(th);
                    return;
                }
                break;
            case 1:
                ((He.h) this.f11084c).onSuccess(obj);
                break;
            case 2:
                ((He.h) this.f11083b).onSuccess(obj);
                break;
            default:
                ((He.o) this.f11083b).onSuccess(obj);
                break;
        }
    }

    public i(He.h hVar) {
        this.f11082a = 1;
        this.f11084c = hVar;
        this.f11083b = new Je.c(1);
    }
}
