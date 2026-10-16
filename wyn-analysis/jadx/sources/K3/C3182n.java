package k3;

import Ef.C0502n;
import Ef.E;
import Ef.H;
import Jf.u;
import com.moloco.sdk.acm.db.MetricsDb_Impl;
import ef.C2515C;
import jf.AbstractC3101a;
import jf.C3104d;
import jf.InterfaceC3103c;
import jf.InterfaceC3105e;
import jf.InterfaceC3106f;
import jf.InterfaceC3108h;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;

/* renamed from: k3.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3182n extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f39234a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f39235b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MetricsDb_Impl f39236c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C0502n f39237d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3183o f39238e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3182n(MetricsDb_Impl metricsDb_Impl, C0502n c0502n, C3183o c3183o, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f39236c = metricsDb_Impl;
        this.f39237d = c0502n;
        this.f39238e = c3183o;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C3182n c3182n = new C3182n(this.f39236c, this.f39237d, this.f39238e, interfaceC3103c);
        c3182n.f39235b = obj;
        return c3182n;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C3182n) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC3103c interfaceC3103c;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f39234a;
        if (i5 == 0) {
            Fe.e.U(obj);
            InterfaceC3106f interfaceC3106f = ((E) this.f39235b).getCoroutineContext().get(C3104d.f38758a);
            AbstractC3340k.b(interfaceC3106f);
            InterfaceC3105e interfaceC3105e = (InterfaceC3105e) interfaceC3106f;
            C3187s c3187s = new C3187s(interfaceC3105e);
            InterfaceC3108h interfaceC3108hPlus = ((AbstractC3101a) interfaceC3105e).plus(c3187s).plus(new u(Integer.valueOf(System.identityHashCode(c3187s)), this.f39236c.f39232j));
            C0502n c0502n = this.f39237d;
            this.f39235b = c0502n;
            this.f39234a = 1;
            obj = H.P(interfaceC3108hPlus, this.f39238e, this);
            if (obj == aVar) {
                return aVar;
            }
            interfaceC3103c = c0502n;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC3103c = (InterfaceC3103c) this.f39235b;
            Fe.e.U(obj);
        }
        interfaceC3103c.resumeWith(obj);
        return C2515C.f34653a;
    }
}
