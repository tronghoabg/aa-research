package Ef;

import ef.C2515C;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C3338i;

/* loaded from: classes5.dex */
public final /* synthetic */ class y0 extends C3338i implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public static final y0 f3790a = new y0(3, z0.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z2;
        z0 z0Var = (z0) obj;
        Mf.i iVar = (Mf.i) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z0.f3793a;
        z0Var.getClass();
        while (true) {
            Object obj4 = z0.f3793a.get(z0Var);
            if (!(obj4 instanceof InterfaceC0491h0)) {
                z2 = false;
                break;
            }
            if (z0Var.T(obj4) >= 0) {
                z2 = true;
                break;
            }
        }
        C2515C c2515c = C2515C.f34653a;
        if (z2) {
            ((Mf.h) iVar).f7653c = H.x(z0Var, true, new u0(z0Var, iVar, 1));
            return c2515c;
        }
        ((Mf.h) iVar).f7655e = c2515c;
        return c2515c;
    }
}
