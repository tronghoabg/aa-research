package fd;

import ef.C2515C;
import java.util.List;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes5.dex */
public final class t extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f35376a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2628H f35377b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f35378c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(C2628H c2628h, List list, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f35377b = c2628h;
        this.f35378c = list;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new t(this.f35377b, this.f35378c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((t) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f35376a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return obj;
        }
        Fe.e.U(obj);
        this.f35376a = 1;
        Object objB = C2628H.b(this.f35377b, this.f35378c, this);
        return objB == aVar ? aVar : objB;
    }
}
