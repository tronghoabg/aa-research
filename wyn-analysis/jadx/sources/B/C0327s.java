package B;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: B.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0327s extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public D.k f1469a;

    /* renamed from: b, reason: collision with root package name */
    public int f1470b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ N.V f1471c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f1472d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ D.i f1473e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ N.V f1474f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0327s(N.V v2, long j8, D.i iVar, N.V v10, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f1471c = v2;
        this.f1472d = j8;
        this.f1473e = iVar;
        this.f1474f = v10;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C0327s(this.f1471c, this.f1472d, this.f1473e, this.f1474f, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C0327s) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        D.k kVar;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f1470b;
        if (i5 == 0) {
            Fe.e.U(obj);
            if (((Boolean) ((tf.a) this.f1471c.getValue()).invoke()).booleanValue()) {
                long j8 = AbstractC0329u.f1483a;
                this.f1470b = 1;
                if (Ef.H.m(j8, this) != aVar) {
                }
                return aVar;
            }
        } else {
            if (i5 != 1) {
                if (i5 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kVar = this.f1469a;
                Fe.e.U(obj);
                this.f1474f.setValue(kVar);
                return C2515C.f34653a;
            }
            Fe.e.U(obj);
        }
        D.k kVar2 = new D.k(this.f1472d);
        this.f1469a = kVar2;
        this.f1470b = 2;
        if (this.f1473e.a(kVar2, this) != aVar) {
            kVar = kVar2;
            this.f1474f.setValue(kVar);
            return C2515C.f34653a;
        }
        return aVar;
    }
}
