package B;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: B.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325p extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f1453a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f1454b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f1455c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ D.i f1456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ N.V f1457e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ N.V f1458f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N.V f1459g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0325p(boolean z2, D.i iVar, N.V v2, N.V v10, N.V v11, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f1455c = z2;
        this.f1456d = iVar;
        this.f1457e = v2;
        this.f1458f = v10;
        this.f1459g = v11;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        N.V v2 = this.f1458f;
        N.V v10 = this.f1459g;
        C0325p c0325p = new C0325p(this.f1455c, this.f1456d, this.f1457e, v2, v10, interfaceC3103c);
        c0325p.f1454b = obj;
        return c0325p;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0325p) create((p0.t) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f1453a;
        C2515C c2515c = C2515C.f34653a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return c2515c;
        }
        Fe.e.U(obj);
        p0.t tVar = (p0.t) this.f1454b;
        C0323n c0323n = new C0323n(this.f1455c, this.f1456d, this.f1457e, this.f1458f, null);
        C0324o c0324o = new C0324o(0, this.f1459g, this.f1455c);
        this.f1453a = 1;
        C.h hVar = C.o.f1749a;
        Object objW = A6.c.w(tVar, new C.m(new C.e((L0.b) tVar), c0323n, c0324o, null), this);
        if (objW != aVar) {
            objW = c2515c;
        }
        return objW == aVar ? aVar : c2515c;
    }
}
