package Re;

import A.AbstractC0213f;
import cf.C1608b;
import com.google.protobuf.Internal;
import java.util.Iterator;
import p7.AbstractC3772b;

/* renamed from: Re.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0818m extends He.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f10742b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10743c;

    public /* synthetic */ C0818m(Object obj, int i5) {
        this.f10742b = i5;
        this.f10743c = obj;
    }

    public static void f(He.f fVar, Iterator it) {
        try {
            if (!it.hasNext()) {
                Ye.d.a(fVar);
            } else if (fVar instanceof Oe.a) {
                fVar.e(new E((Oe.a) fVar, it, 0));
            } else {
                fVar.e(new E(fVar, it, 1));
            }
        } catch (Throwable th) {
            AbstractC3772b.U(th);
            Ye.d.b(th, fVar);
        }
    }

    @Override // He.c
    public final void e(He.f fVar) {
        switch (this.f10742b) {
            case 0:
                int iF = AbstractC0213f.f(3);
                AbstractC0814i c0815j = iF != 0 ? iF != 1 ? iF != 3 ? iF != 4 ? new C0815j(fVar, He.c.f5007a) : new C0815j(fVar) : new C0816k(fVar, 0) : new C0816k(fVar, 1) : new C0817l(fVar);
                fVar.e(c0815j);
                try {
                    ((He.e) this.f10743c).g(c0815j);
                    break;
                } catch (Throwable th) {
                    AbstractC3772b.U(th);
                    c0815j.d(th);
                    return;
                }
            case 1:
                boolean z2 = fVar instanceof Oe.a;
                Object[] objArr = (Object[]) this.f10743c;
                if (!z2) {
                    fVar.e(new D(fVar, objArr, 1));
                    break;
                } else {
                    fVar.e(new D((Oe.a) fVar, objArr, 0));
                    break;
                }
            case 2:
                try {
                    f(fVar, ((Internal.ProtobufList) this.f10743c).iterator());
                    break;
                } catch (Throwable th2) {
                    AbstractC3772b.U(th2);
                    Ye.d.b(th2, fVar);
                    return;
                }
            case 3:
                ((C1608b) this.f10743c).c(new F(fVar));
                break;
            default:
                ((He.g) this.f10743c).b(new Se.s(fVar));
                break;
        }
    }
}
