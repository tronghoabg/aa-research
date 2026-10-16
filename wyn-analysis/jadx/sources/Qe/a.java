package Qe;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes5.dex */
public final class a extends AtomicInteger implements He.b {

    /* renamed from: a, reason: collision with root package name */
    public final He.b f9986a;

    /* renamed from: b, reason: collision with root package name */
    public final He.a[] f9987b;

    /* renamed from: c, reason: collision with root package name */
    public int f9988c;

    /* renamed from: d, reason: collision with root package name */
    public final Je.c f9989d = new Je.c(1);

    public a(He.b bVar, He.a[] aVarArr) {
        this.f9986a = bVar;
        this.f9987b = aVarArr;
    }

    @Override // He.b
    public final void a(Je.b bVar) {
        Je.c cVar = this.f9989d;
        cVar.getClass();
        Me.a.c(cVar, bVar);
    }

    public final void b() {
        Je.c cVar = this.f9989d;
        if (!cVar.b() && getAndIncrement() == 0) {
            while (!cVar.b()) {
                int i5 = this.f9988c;
                this.f9988c = i5 + 1;
                He.a[] aVarArr = this.f9987b;
                if (i5 == aVarArr.length) {
                    this.f9986a.onComplete();
                    return;
                } else {
                    aVarArr[i5].d(this);
                    if (decrementAndGet() == 0) {
                        return;
                    }
                }
            }
        }
    }

    @Override // He.b
    public final void onComplete() {
        b();
    }

    @Override // He.b
    public final void onError(Throwable th) {
        this.f9986a.onError(th);
    }
}
