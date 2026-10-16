package e3;

import Ef.E;
import ef.C2515C;
import g3.C2697b;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* renamed from: e3.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2470a extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f34414a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ d f34415b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2470a(d dVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f34415b = dVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2470a(this.f34415b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2470a) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f34414a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        C2697b c2697b = this.f34415b.f34423a;
        this.f34414a = 1;
        Object objB = c2697b.b(this);
        return objB == aVar ? aVar : objB;
    }
}
