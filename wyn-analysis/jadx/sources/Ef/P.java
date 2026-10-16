package Ef;

import java.util.concurrent.CancellationException;
import jf.InterfaceC3103c;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3464c;

/* loaded from: classes5.dex */
public abstract class P extends Lf.i {

    /* renamed from: c, reason: collision with root package name */
    public int f3694c;

    public P(int i5) {
        super(0L, false);
        this.f3694c = i5;
    }

    public abstract InterfaceC3103c d();

    public Throwable e(Object obj) {
        C0517x c0517x = obj instanceof C0517x ? (C0517x) obj : null;
        if (c0517x != null) {
            return c0517x.f3788a;
        }
        return null;
    }

    public final void h(Throwable th) {
        H.w(d().getContext(), new G("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            InterfaceC3103c interfaceC3103cD = d();
            AbstractC3340k.c(interfaceC3103cD, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            Jf.f fVar = (Jf.f) interfaceC3103cD;
            AbstractC3464c abstractC3464c = fVar.f6110e;
            Object obj = fVar.f6112g;
            InterfaceC3108h context = abstractC3464c.getContext();
            Object objN = Jf.b.n(context, obj);
            InterfaceC0501m0 interfaceC0501m0 = null;
            P0 p0O = objN != Jf.b.f6100d ? H.O(abstractC3464c, context, objN) : null;
            try {
                InterfaceC3108h context2 = abstractC3464c.getContext();
                Object objI = i();
                Throwable thE = e(objI);
                if (thE == null) {
                    int i5 = this.f3694c;
                    boolean z2 = true;
                    if (i5 != 1 && i5 != 2) {
                        z2 = false;
                    }
                    if (z2) {
                        interfaceC0501m0 = (InterfaceC0501m0) context2.get(C0499l0.f3748a);
                    }
                }
                if (interfaceC0501m0 != null && !interfaceC0501m0.isActive()) {
                    CancellationException cancellationException = interfaceC0501m0.getCancellationException();
                    c(cancellationException);
                    abstractC3464c.resumeWith(Fe.e.z(cancellationException));
                } else if (thE != null) {
                    abstractC3464c.resumeWith(Fe.e.z(thE));
                } else {
                    abstractC3464c.resumeWith(f(objI));
                }
                if (p0O == null || p0O.c0()) {
                    Jf.b.g(context, objN);
                }
            } catch (Throwable th) {
                if (p0O == null || p0O.c0()) {
                    Jf.b.g(context, objN);
                }
                throw th;
            }
        } catch (N e7) {
            H.w(d().getContext(), e7.f3687a);
        } catch (Throwable th2) {
            h(th2);
        }
    }

    public void c(CancellationException cancellationException) {
    }

    public Object f(Object obj) {
        return obj;
    }
}
