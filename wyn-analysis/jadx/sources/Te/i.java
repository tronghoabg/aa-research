package Te;

import java.util.concurrent.Callable;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class i extends a {

    /* renamed from: b, reason: collision with root package name */
    public final F5.d f11870b;

    /* renamed from: c, reason: collision with root package name */
    public final int f11871c;

    public i(He.i iVar, F5.d dVar, int i5) {
        super(iVar);
        this.f11870b = dVar;
        this.f11871c = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // He.i
    public final void d(He.j jVar) {
        Je.b bVar = Me.b.f7635a;
        F5.d dVar = this.f11870b;
        He.i iVar = this.f11833a;
        if (!(iVar instanceof Callable)) {
            iVar.c(new h(jVar, dVar, this.f11871c));
            return;
        }
        try {
            Object objCall = ((Callable) iVar).call();
            if (objCall == null) {
                jVar.a(bVar);
                jVar.onComplete();
                return;
            }
            try {
                He.i iVar2 = (He.i) dVar.apply(objCall);
                if (!(iVar2 instanceof Callable)) {
                    iVar2.c(jVar);
                    return;
                }
                try {
                    Object objCall2 = ((Callable) iVar2).call();
                    if (objCall2 == null) {
                        jVar.a(bVar);
                        jVar.onComplete();
                    } else {
                        o oVar = new o(jVar, objCall2);
                        jVar.a(oVar);
                        oVar.run();
                    }
                } catch (Throwable th) {
                    AbstractC3772b.U(th);
                    jVar.a(bVar);
                    jVar.onError(th);
                }
            } catch (Throwable th2) {
                AbstractC3772b.U(th2);
                jVar.a(bVar);
                jVar.onError(th2);
            }
        } catch (Throwable th3) {
            AbstractC3772b.U(th3);
            jVar.a(bVar);
            jVar.onError(th3);
        }
    }
}
