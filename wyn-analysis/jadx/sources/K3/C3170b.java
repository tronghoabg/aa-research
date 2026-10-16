package k3;

import Ef.E;
import ef.C2515C;
import java.util.concurrent.Callable;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: k3.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3170b extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Callable f39178a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3170b(Callable callable, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f39178a = callable;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C3170b(this.f39178a, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C3170b) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        return this.f39178a.call();
    }
}
