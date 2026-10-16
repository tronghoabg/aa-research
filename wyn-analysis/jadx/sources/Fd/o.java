package fd;

import Hf.k0;
import a.AbstractC1304a;
import android.content.Context;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import x1.C4452e;

/* loaded from: classes5.dex */
public final class o extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.G f35355a;

    /* renamed from: b, reason: collision with root package name */
    public int f35356b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f35357c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2628H f35358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f35359e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(String str, C2628H c2628h, kotlin.jvm.internal.G g9, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f35357c = str;
        this.f35358d = c2628h;
        this.f35359e = g9;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new o(this.f35357c, this.f35358d, this.f35359e, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((o) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.G g9;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f35356b;
        if (i5 == 0) {
            Fe.e.U(obj);
            C4452e c4452eK = AbstractC1304a.k(this.f35357c);
            Context context = this.f35358d.f35320a;
            if (context == null) {
                AbstractC3340k.m("context");
                throw null;
            }
            n nVar = new n(AbstractC2629I.a(context).getData(), c4452eK, 0);
            kotlin.jvm.internal.G g10 = this.f35359e;
            this.f35355a = g10;
            this.f35356b = 1;
            Object objQ = k0.q(nVar, this);
            if (objQ == aVar) {
                return aVar;
            }
            g9 = g10;
            obj = objQ;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g9 = this.f35355a;
            Fe.e.U(obj);
        }
        g9.f39740a = obj;
        return C2515C.f34653a;
    }
}
