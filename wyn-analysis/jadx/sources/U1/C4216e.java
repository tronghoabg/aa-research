package u1;

import ef.C2515C;
import java.util.List;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: u1.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4216e extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f46456a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46457b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List f46458c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4216e(List list, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f46458c = list;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C4216e c4216e = new C4216e(this.f46458c, interfaceC3103c);
        c4216e.f46457b = obj;
        return c4216e;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4216e) create((C4236y) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f46456a;
        if (i5 == 0) {
            Fe.e.U(obj);
            C4236y c4236y = (C4236y) this.f46457b;
            this.f46456a = 1;
            if (ic.d.g(this.f46458c, c4236y, this) == aVar) {
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
