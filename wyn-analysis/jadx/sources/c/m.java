package C;

import B.C0323n;
import B.C0324o;
import Ef.H;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import p0.t;
import tf.p;

/* loaded from: classes.dex */
public final class m extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f1741a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1742b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f1743c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0323n f1744d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0324o f1745e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(e eVar, C0323n c0323n, C0324o c0324o, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f1743c = eVar;
        this.f1744d = c0323n;
        this.f1745e = c0324o;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        m mVar = new m(this.f1743c, this.f1744d, this.f1745e, interfaceC3103c);
        mVar.f1742b = obj;
        return mVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((t) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f1741a;
        if (i5 == 0) {
            Fe.e.U(obj);
            l lVar = new l(this.f1743c, (t) this.f1742b, this.f1744d, this.f1745e, null);
            this.f1741a = 1;
            if (H.l(lVar, this) == aVar) {
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
