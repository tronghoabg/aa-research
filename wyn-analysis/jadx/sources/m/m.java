package M;

import A.AbstractC0226t;
import A.C0212e;
import A.C0225s;
import A.Z;
import Ef.E;
import com.unity3d.services.UnityAdsConstants;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes.dex */
public final class m extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f7185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f7186b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(o oVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f7186b = oVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new m(this.f7186b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((m) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f7185a;
        if (i5 == 0) {
            Fe.e.U(obj);
            o oVar = this.f7186b;
            Float f10 = new Float(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            Z zJ = AbstractC0226t.j(150, C0225s.f182a, 2);
            this.f7185a = 1;
            if (C0212e.c(oVar.f7195g, f10, zJ, this) == aVar) {
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
