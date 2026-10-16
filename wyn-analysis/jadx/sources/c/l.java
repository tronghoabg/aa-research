package C;

import B.C0323n;
import B.C0324o;
import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import p0.t;
import tf.p;

/* loaded from: classes.dex */
public final class l extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f1735a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1736b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e f1737c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ t f1738d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C0323n f1739e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ C0324o f1740f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(e eVar, t tVar, C0323n c0323n, C0324o c0324o, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f1737c = eVar;
        this.f1738d = tVar;
        this.f1739e = c0323n;
        this.f1740f = c0324o;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        l lVar = new l(this.f1737c, this.f1738d, this.f1739e, this.f1740f, interfaceC3103c);
        lVar.f1736b = obj;
        return lVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((l) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f1735a;
        if (i5 == 0) {
            Fe.e.U(obj);
            E e7 = (E) this.f1736b;
            e eVar = this.f1737c;
            eVar.f1716d.f();
            eVar.f1714b = false;
            eVar.f1715c = false;
            k kVar = new k(this.f1739e, e7, eVar, this.f1740f, null);
            this.f1735a = 1;
            if (this.f1738d.A(kVar, this) == aVar) {
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
