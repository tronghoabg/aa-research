package J3;

import Ef.E;
import androidx.work.CoroutineWorker;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class e extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public l f5563a;

    /* renamed from: b, reason: collision with root package name */
    public int f5564b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ l f5565c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ CoroutineWorker f5566d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(l lVar, CoroutineWorker coroutineWorker, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f5565c = lVar;
        this.f5566d = coroutineWorker;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new e(this.f5565c, this.f5566d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        l lVar;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f5564b;
        if (i5 == 0) {
            Fe.e.U(obj);
            l lVar2 = this.f5565c;
            this.f5563a = lVar2;
            this.f5564b = 1;
            Object foregroundInfo = this.f5566d.getForegroundInfo(this);
            if (foregroundInfo == aVar) {
                return aVar;
            }
            lVar = lVar2;
            obj = foregroundInfo;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            lVar = this.f5563a;
            Fe.e.U(obj);
        }
        lVar.f5579a.i(obj);
        return C2515C.f34653a;
    }
}
