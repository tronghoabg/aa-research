package Xe;

import He.f;
import Re.G;
import Va.C1038ka;
import java.util.concurrent.atomic.AtomicReference;
import o1.C3641c;
import p7.AbstractC3772b;
import x9.C4504d;

/* loaded from: classes5.dex */
public final class c extends AtomicReference implements f, ug.b, Je.b {

    /* renamed from: a, reason: collision with root package name */
    public final C3641c f16238a;

    /* renamed from: b, reason: collision with root package name */
    public final C1038ka f16239b;

    /* renamed from: c, reason: collision with root package name */
    public final C4504d f16240c;

    /* renamed from: d, reason: collision with root package name */
    public final G f16241d;

    public c(C3641c c3641c) {
        C1038ka c1038ka = Ne.b.f8675e;
        C4504d c4504d = Ne.b.f8673c;
        G g9 = G.f10651a;
        this.f16238a = c3641c;
        this.f16239b = c1038ka;
        this.f16240c = c4504d;
        this.f16241d = g9;
    }

    @Override // He.f
    public final void b(Object obj) {
        if (get() == Ye.f.f16797a) {
            return;
        }
        try {
            this.f16238a.accept(obj);
        } catch (Throwable th) {
            AbstractC3772b.U(th);
            ((ug.b) get()).cancel();
            onError(th);
        }
    }

    @Override // ug.b
    public final void cancel() {
        Ye.f.a(this);
    }

    @Override // Je.b
    public final void dispose() {
        Ye.f.a(this);
    }

    @Override // He.f
    public final void e(ug.b bVar) {
        if (Ye.f.b(this, bVar)) {
            try {
                this.f16241d.accept(this);
            } catch (Throwable th) {
                AbstractC3772b.U(th);
                bVar.cancel();
                onError(th);
            }
        }
    }

    @Override // He.f
    public final void onComplete() {
        Object obj = get();
        Ye.f fVar = Ye.f.f16797a;
        if (obj != fVar) {
            lazySet(fVar);
            try {
                this.f16240c.getClass();
            } catch (Throwable th) {
                AbstractC3772b.U(th);
                S3.f.A(th);
            }
        }
    }

    @Override // He.f
    public final void onError(Throwable th) {
        Object obj = get();
        Ye.f fVar = Ye.f.f16797a;
        if (obj == fVar) {
            S3.f.A(th);
            return;
        }
        lazySet(fVar);
        try {
            this.f16239b.accept(th);
        } catch (Throwable th2) {
            AbstractC3772b.U(th2);
            S3.f.A(new Ke.b(th, th2));
        }
    }

    @Override // ug.b
    public final void request(long j8) {
        ((ug.b) get()).request(j8);
    }
}
