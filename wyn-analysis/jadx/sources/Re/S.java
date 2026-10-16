package Re;

import java.util.concurrent.Callable;
import p7.AbstractC3772b;

/* loaded from: classes5.dex */
public final class S extends He.c {

    /* renamed from: b, reason: collision with root package name */
    public final Object f10699b;

    /* renamed from: c, reason: collision with root package name */
    public final Le.c f10700c;

    public S(Object obj, Le.c cVar) {
        this.f10699b = obj;
        this.f10700c = cVar;
    }

    @Override // He.c
    public final void e(He.f fVar) {
        try {
            Object objApply = this.f10700c.apply(this.f10699b);
            Ne.b.a(objApply, "The mapper returned a null Publisher");
            ug.a aVar = (ug.a) objApply;
            if (!(aVar instanceof Callable)) {
                aVar.a(fVar);
                return;
            }
            try {
                Object objCall = ((Callable) aVar).call();
                if (objCall == null) {
                    Ye.d.a(fVar);
                } else {
                    fVar.e(new Ye.e(fVar, objCall));
                }
            } catch (Throwable th) {
                AbstractC3772b.U(th);
                Ye.d.b(th, fVar);
            }
        } catch (Throwable th2) {
            Ye.d.b(th2, fVar);
        }
    }
}
