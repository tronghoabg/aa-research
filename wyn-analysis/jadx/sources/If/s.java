package If;

import Hf.InterfaceC0602l;
import ef.C2515C;
import java.util.concurrent.atomic.AtomicInteger;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class s extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f5504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC0602l[] f5505b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f5506c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ AtomicInteger f5507d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Gf.e f5508e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(InterfaceC0602l[] interfaceC0602lArr, int i5, AtomicInteger atomicInteger, Gf.e eVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f5505b = interfaceC0602lArr;
        this.f5506c = i5;
        this.f5507d = atomicInteger;
        this.f5508e = eVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new s(this.f5505b, this.f5506c, this.f5507d, this.f5508e, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((s) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f5504a;
        AtomicInteger atomicInteger = this.f5507d;
        Gf.e eVar = this.f5508e;
        try {
            if (i5 == 0) {
                Fe.e.U(obj);
                InterfaceC0602l[] interfaceC0602lArr = this.f5505b;
                int i10 = this.f5506c;
                InterfaceC0602l interfaceC0602l = interfaceC0602lArr[i10];
                r rVar = new r(eVar, i10);
                this.f5504a = 1;
                if (interfaceC0602l.collect(rVar, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                Fe.e.U(obj);
            }
            if (atomicInteger.decrementAndGet() == 0) {
                eVar.h(null);
            }
            return C2515C.f34653a;
        } finally {
            if (atomicInteger.decrementAndGet() == 0) {
                eVar.h(null);
            }
        }
    }
}
