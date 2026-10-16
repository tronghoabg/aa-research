package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.ortb.model.C1908w;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2140z extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f32364a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ z0 f32365b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H f32366c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2140z(z0 z0Var, H h10, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f32365b = z0Var;
        this.f32366c = h10;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new C2140z(this.f32365b, this.f32366c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2140z) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f32364a;
        if (i5 == 0) {
            Fe.e.U(obj);
            z0 z0Var = this.f32365b;
            if (z0Var == null) {
                return null;
            }
            H h10 = this.f32366c;
            Y2.B b5 = h10.f29947d;
            C1908w c1908w = h10.f29944a.f28867d;
            String str = c1908w != null ? c1908w.f28873b : null;
            this.f32364a = 1;
            obj = b5.a(z0Var, str, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Fe.e.U(obj);
        }
        return (z0) obj;
    }
}
