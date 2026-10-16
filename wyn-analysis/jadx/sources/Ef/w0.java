package Ef;

import ef.C2515C;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.C3338i;

/* loaded from: classes5.dex */
public final /* synthetic */ class w0 extends C3338i implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public static final w0 f3786a = new w0(3, z0.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        z0 z0Var = (z0) obj;
        Mf.i iVar = (Mf.i) obj2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = z0.f3793a;
        z0Var.getClass();
        while (true) {
            Object objN = z0.f3793a.get(z0Var);
            if (!(objN instanceof InterfaceC0491h0)) {
                if (!(objN instanceof C0517x)) {
                    objN = H.N(objN);
                }
                ((Mf.h) iVar).f7655e = objN;
            } else if (z0Var.T(objN) >= 0) {
                ((Mf.h) iVar).f7653c = H.x(z0Var, true, new u0(z0Var, iVar, 0));
                break;
            }
        }
        return C2515C.f34653a;
    }
}
