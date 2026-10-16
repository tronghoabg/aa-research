package fd;

import Hf.k0;
import android.content.Context;
import ef.C2515C;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import lf.AbstractC3471j;
import x1.C4452e;

/* loaded from: classes5.dex */
public final class w extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public kotlin.jvm.internal.G f35390a;

    /* renamed from: b, reason: collision with root package name */
    public int f35391b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f35392c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C2628H f35393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.G f35394e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(String str, C2628H c2628h, kotlin.jvm.internal.G g9, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f35392c = str;
        this.f35393d = c2628h;
        this.f35394e = g9;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new w(this.f35392c, this.f35393d, this.f35394e, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kotlin.jvm.internal.G g9;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f35391b;
        if (i5 == 0) {
            Fe.e.U(obj);
            C4452e c4452e = new C4452e(this.f35392c);
            Context context = this.f35393d.f35320a;
            if (context == null) {
                AbstractC3340k.m("context");
                throw null;
            }
            n nVar = new n(AbstractC2629I.a(context).getData(), c4452e, 2);
            kotlin.jvm.internal.G g10 = this.f35394e;
            this.f35390a = g10;
            this.f35391b = 1;
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
            g9 = this.f35390a;
            Fe.e.U(obj);
        }
        g9.f39740a = obj;
        return C2515C.f34653a;
    }
}
