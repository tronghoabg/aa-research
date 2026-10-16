package B;

import d0.C2384c;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: B.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323n extends AbstractC3471j implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public int f1444a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ C.e f1445b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ long f1446c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f1447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D.i f1448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ N.V f1449f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ N.V f1450g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0323n(boolean z2, D.i iVar, N.V v2, N.V v10, InterfaceC3103c interfaceC3103c) {
        super(3, interfaceC3103c);
        this.f1447d = z2;
        this.f1448e = iVar;
        this.f1449f = v2;
        this.f1450g = v10;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        long j8 = ((C2384c) obj2).f33935a;
        N.V v2 = this.f1450g;
        C0323n c0323n = new C0323n(this.f1447d, this.f1448e, this.f1449f, v2, (InterfaceC3103c) obj3);
        c0323n.f1445b = (C.e) obj;
        c0323n.f1446c = j8;
        return c0323n.invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f1444a;
        C2515C c2515c = C2515C.f34653a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return c2515c;
        }
        Fe.e.U(obj);
        C.e eVar = this.f1445b;
        long j8 = this.f1446c;
        if (this.f1447d) {
            this.f1444a = 1;
            Object objL = Ef.H.l(new C0328t(eVar, j8, this.f1448e, this.f1449f, this.f1450g, null), this);
            if (objL != aVar) {
                objL = c2515c;
            }
            if (objL == aVar) {
                return aVar;
            }
        }
        return c2515c;
    }
}
