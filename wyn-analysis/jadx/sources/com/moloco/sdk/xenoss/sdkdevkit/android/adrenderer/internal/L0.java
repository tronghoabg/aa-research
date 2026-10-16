package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import com.moloco.sdk.internal.ortb.model.C1906u;
import com.moloco.sdk.internal.ortb.model.C1908w;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class L0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public z0 f29984a;

    /* renamed from: b, reason: collision with root package name */
    public int f29985b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ z0 f29986c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Q0 f29987d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L0(z0 z0Var, Q0 q02, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29986c = z0Var;
        this.f29987d = q02;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new L0(this.f29986c, this.f29987d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((L0) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) throws Throwable {
        z0 z0Var;
        C1908w c1908w;
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f29985b;
        if (i5 == 0) {
            Fe.e.U(obj);
            String str = null;
            z0 z0Var2 = this.f29986c;
            if (z0Var2 == null) {
                return null;
            }
            Q0 q02 = this.f29987d;
            try {
                Y2.B b5 = q02.f30026c;
                C1906u c1906u = q02.f30025b;
                if (c1906u != null && (c1908w = c1906u.f28867d) != null) {
                    str = c1908w.f28873b;
                }
                this.f29984a = z0Var2;
                this.f29985b = 1;
                obj = b5.a(z0Var2, str, this);
                if (obj == aVar) {
                    return aVar;
                }
                z0Var = z0Var2;
            } catch (Exception unused) {
                return z0Var2;
            }
        } else {
            if (i5 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z0Var = this.f29984a;
            try {
                Fe.e.U(obj);
            } catch (Exception unused2) {
                return z0Var;
            }
        }
        return (z0) obj;
    }
}
