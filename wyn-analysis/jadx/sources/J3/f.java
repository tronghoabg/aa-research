package J3;

import Ef.E;
import androidx.work.CoroutineWorker;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class f extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f5567a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f5568b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(CoroutineWorker coroutineWorker, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f5568b = coroutineWorker;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new f(this.f5568b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f5567a;
        CoroutineWorker coroutineWorker = this.f5568b;
        try {
            if (i5 == 0) {
                Fe.e.U(obj);
                this.f5567a = 1;
                obj = coroutineWorker.doWork(this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Fe.e.U(obj);
            }
            coroutineWorker.getFuture().i((p) obj);
        } catch (Throwable th) {
            coroutineWorker.getFuture().j(th);
        }
        return C2515C.f34653a;
    }
}
