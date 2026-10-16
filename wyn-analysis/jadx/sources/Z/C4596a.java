package z;

import A.T;
import A.U;
import Ef.E;
import Hf.f0;
import N.C0718d;
import N.V;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C2055p;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: z.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4596a extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f48198a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ U f48199b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ V f48200c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4596a(U u10, V v2, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f48199b = u10;
        this.f48200c = v2;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C4596a(this.f48199b, this.f48200c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C4596a) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f48198a;
        if (i5 == 0) {
            Fe.e.U(obj);
            f0 f0VarN = C0718d.N(new T(this.f48199b, 1));
            C2055p c2055p = new C2055p(this.f48200c, 2);
            this.f48198a = 1;
            if (f0VarN.collect(c2055p, this) == aVar) {
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
