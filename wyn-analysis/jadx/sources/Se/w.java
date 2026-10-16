package Se;

import java.util.concurrent.atomic.AtomicReference;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class w extends AtomicReference implements He.h {

    /* renamed from: a, reason: collision with root package name */
    public final v f11112a;

    /* renamed from: b, reason: collision with root package name */
    public final int f11113b;

    public w(v vVar, int i5) {
        this.f11112a = vVar;
        this.f11113b = i5;
    }

    @Override // He.h
    public final void a(Je.b bVar) {
        Me.a.e(this, bVar);
    }

    @Override // He.h
    public final void onComplete() {
        v vVar = this.f11112a;
        if (vVar.getAndSet(0) > 0) {
            vVar.a(this.f11113b);
            vVar.f11108a.onComplete();
        }
    }

    @Override // He.h
    public final void onError(Throwable th) {
        v vVar = this.f11112a;
        if (vVar.getAndSet(0) <= 0) {
            S3.f.A(th);
        } else {
            vVar.a(this.f11113b);
            vVar.f11108a.onError(th);
        }
    }

    @Override // He.h
    public final void onSuccess(Object obj) {
        v vVar = this.f11112a;
        He.h hVar = vVar.f11108a;
        int i5 = this.f11113b;
        Object[] objArr = vVar.f11111d;
        objArr[i5] = obj;
        if (vVar.decrementAndGet() == 0) {
            try {
                hVar.onSuccess(vVar.f11109b.apply(objArr));
            } catch (Throwable th) {
                AbstractC3772b.U(th);
                hVar.onError(th);
            }
        }
    }
}
