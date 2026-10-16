package C;

import B.C0323n;
import Ef.E;
import d0.C2384c;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes.dex */
public final class j extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f1725a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C0323n f1726b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f1727c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p0.k f1728d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(C0323n c0323n, e eVar, p0.k kVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f1726b = c0323n;
        this.f1727c = eVar;
        this.f1728d = kVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new j(this.f1726b, this.f1727c, this.f1728d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((j) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f1725a;
        if (i5 == 0) {
            Fe.e.U(obj);
            C2384c c2384c = new C2384c(this.f1728d.f43143c);
            this.f1725a = 1;
            if (this.f1726b.invoke(this.f1727c, c2384c, this) == aVar) {
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
