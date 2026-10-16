package M;

import A7.B0;
import Ef.E;
import Hf.C0615z;
import Hf.j0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class f extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f7165a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f7166b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ D.i f7167c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ B0 f7168d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(D.i iVar, B0 b02, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f7167c = iVar;
        this.f7168d = b02;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        f fVar = new f(this.f7167c, this.f7168d, interfaceC3103c);
        fVar.f7166b = obj;
        return fVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f7165a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return C2515C.f34653a;
        }
        Fe.e.U(obj);
        E e7 = (E) this.f7166b;
        j0 j0Var = this.f7167c.f2248a;
        C0615z c0615z = new C0615z(6, this.f7168d, e7);
        this.f7165a = 1;
        j0Var.collect(c0615z, this);
        return aVar;
    }
}
