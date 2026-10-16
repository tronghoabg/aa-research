package com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport;

import Ef.E;
import Jd.s;
import Jd.v;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;
import wd.C4402c;

/* loaded from: classes4.dex */
public final class g extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f32440a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4402c f32441b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f32442c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(C4402c c4402c, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f32441b = c4402c;
        this.f32442c = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new g(this.f32441b, this.f32442c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f32440a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Fd.c cVar = new Fd.c();
            Fd.e.b(cVar, this.f32442c);
            A6.h.d(cVar, 5000L);
            cVar.c(s.f6065b);
            S3.s sVar = new S3.s(cVar, this.f32441b);
            this.f32440a = 1;
            obj = sVar.p(this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        v vVarE = ((Gd.a) obj).e();
        return Boolean.valueOf(vVarE.compareTo(v.f6076c) >= 0 && vVarE.compareTo(v.k) < 0);
    }
}
