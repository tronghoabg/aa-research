package Re;

import java.util.concurrent.Callable;
import p7.AbstractC3772b;
import za.C4658a;

/* loaded from: classes5.dex */
public final class B extends AbstractC0806a {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f10624c = 2;

    /* renamed from: d, reason: collision with root package name */
    public final int f10625d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f10626e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B(x xVar, int i5) {
        super(xVar);
        C4658a c4658a = Ne.b.f8671a;
        this.f10626e = c4658a;
        this.f10625d = i5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // He.c
    public final void e(He.f fVar) {
        switch (this.f10624c) {
            case 0:
                this.f10702b.d(new A(fVar, (Le.c) this.f10626e, this.f10625d));
                break;
            case 1:
                He.c cVar = this.f10702b;
                boolean z2 = cVar instanceof Callable;
                C4658a c4658a = (C4658a) this.f10626e;
                if (!z2) {
                    cVar.d(new C(fVar, c4658a, this.f10625d));
                    break;
                } else {
                    try {
                        Object objCall = ((Callable) cVar).call();
                        if (objCall == null) {
                            Ye.d.a(fVar);
                            break;
                        } else {
                            try {
                                c4658a.getClass();
                                C0818m.f(fVar, ((Iterable) objCall).iterator());
                                break;
                            } catch (Throwable th) {
                                AbstractC3772b.U(th);
                                Ye.d.b(th, fVar);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        AbstractC3772b.U(th2);
                        Ye.d.b(th2, fVar);
                        return;
                    }
                }
            default:
                He.l lVarA = ((He.m) this.f10626e).a();
                boolean z10 = fVar instanceof Oe.a;
                int i5 = this.f10625d;
                He.c cVar2 = this.f10702b;
                if (!z10) {
                    cVar2.d(new K(fVar, lVarA, i5));
                    break;
                } else {
                    cVar2.d(new J((Oe.a) fVar, lVarA, i5));
                    break;
                }
        }
    }

    public B(He.c cVar, He.m mVar, int i5) {
        super(cVar);
        this.f10626e = mVar;
        this.f10625d = i5;
    }

    public B(He.c cVar, Le.c cVar2) {
        super(cVar);
        this.f10626e = cVar2;
        this.f10625d = com.google.android.gms.common.api.f.API_PRIORITY_OTHER;
    }
}
