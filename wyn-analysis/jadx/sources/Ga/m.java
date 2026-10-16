package ga;

import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import tf.p;
import x1.C4449b;
import x1.C4452e;

/* loaded from: classes4.dex */
public final class m extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f35818a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f35819b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4452e f35820c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n f35821d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(Object obj, C4452e c4452e, n nVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f35819b = obj;
        this.f35820c = c4452e;
        this.f35821d = nVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        m mVar = new m(this.f35819b, this.f35820c, this.f35821d, interfaceC3103c);
        mVar.f35818a = obj;
        return mVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        m mVar = (m) create((C4449b) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        mVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        C4449b c4449b = (C4449b) this.f35818a;
        Object obj2 = this.f35819b;
        C4452e key = this.f35820c;
        if (obj2 != null) {
            c4449b.c(key, obj2);
        } else {
            c4449b.getClass();
            AbstractC3340k.e(key, "key");
            c4449b.a();
            c4449b.f47646a.remove(key);
        }
        n.a(this.f35821d, c4449b);
        return C2515C.f34653a;
    }
}
