package u1;

import Hf.C0596f;
import Hf.C0600j;
import Hf.D0;
import Hf.InterfaceC0603m;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: u1.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4232u extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f46490a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f46491b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4209G f46492c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4232u(C4209G c4209g, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f46492c = c4209g;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C4232u c4232u = new C4232u(this.f46492c, interfaceC3103c);
        c4232u.f46491b = obj;
        return c4232u;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4232u) create((InterfaceC0603m) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f46490a;
        C2515C c2515c = C2515C.f34653a;
        if (i5 != 0) {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
            return c2515c;
        }
        Fe.e.U(obj);
        InterfaceC0603m interfaceC0603m = (InterfaceC0603m) this.f46491b;
        C4209G c4209g = this.f46492c;
        AbstractC4210H abstractC4210H = (AbstractC4210H) c4209g.f46450g.getValue();
        if (!(abstractC4210H instanceof C4214c)) {
            c4209g.f46452i.b(new C4226o(abstractC4210H));
        }
        C4230s c4230s = new C4230s(abstractC4210H, null);
        this.f46490a = 1;
        if (interfaceC0603m instanceof D0) {
            throw ((D0) interfaceC0603m).f5031a;
        }
        c4209g.f46450g.collect(new C0600j(new kotlin.jvm.internal.C(), new C0596f(interfaceC0603m, 11), c4230s), this);
        return aVar;
    }
}
