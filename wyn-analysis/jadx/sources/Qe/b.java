package Qe;

import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class b extends He.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9990a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9991b;

    public /* synthetic */ b(Object obj, int i5) {
        this.f9990a = i5;
        this.f9991b = obj;
    }

    @Override // He.a
    public final void e(He.b bVar) {
        switch (this.f9990a) {
            case 0:
                a aVar = new a(bVar, (He.a[]) this.f9991b);
                bVar.a(aVar.f9989d);
                aVar.b();
                break;
            case 1:
                Je.c cVar = new Je.c(Ne.b.f8672b);
                bVar.a(cVar);
                try {
                    ((Le.a) this.f9991b).run();
                    if (!cVar.b()) {
                        bVar.onComplete();
                        break;
                    }
                } catch (Throwable th) {
                    AbstractC3772b.U(th);
                    if (cVar.b()) {
                        return;
                    }
                    bVar.onError(th);
                    return;
                }
                break;
            case 2:
                Je.c cVar2 = new Je.c(Ne.b.f8672b);
                bVar.a(cVar2);
                try {
                    ((B8.c) this.f9991b).call();
                    if (!cVar2.b()) {
                        bVar.onComplete();
                        break;
                    }
                } catch (Throwable th2) {
                    AbstractC3772b.U(th2);
                    if (cVar2.b()) {
                        return;
                    }
                    bVar.onError(th2);
                    return;
                }
                break;
            default:
                ((e) this.f9991b).d(new S3.c(17, this, bVar));
                break;
        }
    }
}
