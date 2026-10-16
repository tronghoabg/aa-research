package M0;

import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes.dex */
public final class e extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f7242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ i f7243b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ long f7244c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(i iVar, long j8, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f7243b = iVar;
        this.f7244c = j8;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new e(this.f7243b, this.f7244c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f7242a;
        if (i5 == 0) {
            Fe.e.U(obj);
            i iVar = this.f7243b;
            this.f7242a = 1;
            if (iVar.f7250a.b(this.f7244c, this) == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        return C2515C.f34653a;
    }
}
