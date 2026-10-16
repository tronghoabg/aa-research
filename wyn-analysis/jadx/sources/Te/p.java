package Te;

import java.util.concurrent.Callable;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class p extends He.i {

    /* renamed from: a, reason: collision with root package name */
    public final Object f11895a;

    /* renamed from: b, reason: collision with root package name */
    public final F5.d f11896b;

    public p(Object obj, F5.d dVar) {
        this.f11895a = obj;
        this.f11896b = dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // He.i
    public final void d(He.j jVar) {
        Je.b bVar = Me.b.f7635a;
        try {
            He.i iVar = (He.i) this.f11896b.apply(this.f11895a);
            if (!(iVar instanceof Callable)) {
                iVar.c(jVar);
                return;
            }
            try {
                Object objCall = ((Callable) iVar).call();
                if (objCall == null) {
                    jVar.a(bVar);
                    jVar.onComplete();
                } else {
                    o oVar = new o(jVar, objCall);
                    jVar.a(oVar);
                    oVar.run();
                }
            } catch (Throwable th) {
                AbstractC3772b.U(th);
                jVar.a(bVar);
                jVar.onError(th);
            }
        } catch (Throwable th2) {
            jVar.a(bVar);
            jVar.onError(th2);
        }
    }
}
