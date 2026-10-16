package Se;

import java.util.concurrent.Callable;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class k extends He.g implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final Callable f11087a;

    public k(Callable callable) {
        this.f11087a = callable;
    }

    @Override // He.g
    public final void c(He.h hVar) {
        Je.c cVar = new Je.c(Ne.b.f8672b);
        hVar.a(cVar);
        if (cVar.b()) {
            return;
        }
        try {
            Object objCall = this.f11087a.call();
            if (cVar.b()) {
                return;
            }
            if (objCall == null) {
                hVar.onComplete();
            } else {
                hVar.onSuccess(objCall);
            }
        } catch (Throwable th) {
            AbstractC3772b.U(th);
            if (cVar.b()) {
                S3.f.A(th);
            } else {
                hVar.onError(th);
            }
        }
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.f11087a.call();
    }
}
