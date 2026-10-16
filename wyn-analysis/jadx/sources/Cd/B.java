package Cd;

import ef.C2515C;
import java.util.List;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class B extends AbstractC3471j implements tf.q {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1985a;

    /* renamed from: b, reason: collision with root package name */
    public int f1986b;

    /* renamed from: c, reason: collision with root package name */
    public /* synthetic */ Object f1987c;

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ Throwable f1988d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ List f1989e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ B(List list, InterfaceC3103c interfaceC3103c, int i5) {
        super(3, interfaceC3103c);
        this.f1985a = i5;
        this.f1989e = list;
    }

    @Override // tf.q
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Fd.b bVar = (Fd.b) obj;
        Throwable th = (Throwable) obj2;
        InterfaceC3103c interfaceC3103c = (InterfaceC3103c) obj3;
        switch (this.f1985a) {
            case 0:
                B b5 = new B(this.f1989e, interfaceC3103c, 0);
                b5.f1987c = bVar;
                b5.f1988d = th;
                return b5.invokeSuspend(C2515C.f34653a);
            default:
                B b10 = new B(this.f1989e, interfaceC3103c, 1);
                b10.f1987c = bVar;
                b10.f1988d = th;
                return b10.invokeSuspend(C2515C.f34653a);
        }
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        switch (this.f1985a) {
            case 0:
                kf.a aVar = kf.a.f39711a;
                int i5 = this.f1986b;
                if (i5 != 0) {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th = (Throwable) this.f1987c;
                    Fe.e.U(obj);
                    return th;
                }
                Fe.e.U(obj);
                Fd.b bVar = (Fd.b) this.f1987c;
                Throwable thA = Hd.a.a(this.f1988d);
                this.f1987c = thA;
                this.f1986b = 1;
                F.a(this.f1989e, thA, bVar, this);
                return C2515C.f34653a == aVar ? aVar : thA;
            default:
                kf.a aVar2 = kf.a.f39711a;
                int i10 = this.f1986b;
                if (i10 != 0) {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Throwable th2 = (Throwable) this.f1987c;
                    Fe.e.U(obj);
                    return th2;
                }
                Fe.e.U(obj);
                Fd.b bVar2 = (Fd.b) this.f1987c;
                Throwable thA2 = Hd.a.a(this.f1988d);
                this.f1987c = thA2;
                this.f1986b = 1;
                F.a(this.f1989e, thA2, bVar2, this);
                return C2515C.f34653a == aVar2 ? aVar2 : thA2;
        }
    }
}
