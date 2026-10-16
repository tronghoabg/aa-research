package fd;

import Hf.C0588a0;
import Hf.k0;
import android.content.Context;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import x1.C4452e;

/* loaded from: classes5.dex */
public final class q extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.G f35363a;

    /* renamed from: b, reason: collision with root package name */
    public int f35364b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f35365c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2628H f35366d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f35367e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(String str, C2628H c2628h, kotlin.jvm.internal.G g9, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f35365c = str;
        this.f35366d = c2628h;
        this.f35367e = g9;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new q(this.f35365c, this.f35366d, this.f35367e, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((q) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.G g9;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f35364b;
        if (i5 == 0) {
            Fe.e.U(obj);
            C4452e c4452e = new C4452e(this.f35365c);
            C2628H c2628h = this.f35366d;
            Context context = c2628h.f35320a;
            if (context == null) {
                AbstractC3340k.m("context");
                throw null;
            }
            C0588a0 c0588a0 = new C0588a0(AbstractC2629I.a(context).getData(), c2628h, c4452e);
            kotlin.jvm.internal.G g10 = this.f35367e;
            this.f35363a = g10;
            this.f35364b = 1;
            Object objQ = k0.q(c0588a0, this);
            if (objQ == aVar) {
                return aVar;
            }
            g9 = g10;
            obj = objQ;
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g9 = this.f35363a;
            Fe.e.U(obj);
        }
        g9.f39740a = obj;
        return C2515C.f34653a;
    }
}
