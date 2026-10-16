package Re;

import java.util.concurrent.atomic.AtomicLong;

/* renamed from: Re.i, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0814i extends AtomicLong implements He.d, ug.b {

    /* renamed from: a, reason: collision with root package name */
    public final He.f f10734a;

    /* renamed from: b, reason: collision with root package name */
    public final Je.c f10735b = new Je.c(1);

    public AbstractC0814i(He.f fVar) {
        this.f10734a = fVar;
    }

    public final void a() {
        Je.c cVar = this.f10735b;
        if (cVar.b()) {
            return;
        }
        try {
            this.f10734a.onComplete();
        } finally {
            Me.a.a(cVar);
        }
    }

    public final boolean c(Throwable th) {
        if (th == null) {
            th = new NullPointerException("onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        }
        Je.c cVar = this.f10735b;
        if (cVar.b()) {
            return false;
        }
        try {
            this.f10734a.onError(th);
            Me.a.a(cVar);
            return true;
        } catch (Throwable th2) {
            Me.a.a(cVar);
            throw th2;
        }
    }

    @Override // ug.b
    public final void cancel() {
        Je.c cVar = this.f10735b;
        cVar.getClass();
        Me.a.a(cVar);
        f();
    }

    public final void d(Throwable th) {
        if (g(th)) {
            return;
        }
        S3.f.A(th);
    }

    public boolean g(Throwable th) {
        return c(th);
    }

    @Override // ug.b
    public final void request(long j8) {
        if (Ye.f.c(j8)) {
            Fe.e.f(this, j8);
            e();
        }
    }

    @Override // java.util.concurrent.atomic.AtomicLong
    public final String toString() {
        return getClass().getSimpleName() + "{" + super.toString() + "}";
    }

    public void e() {
    }

    public void f() {
    }
}
