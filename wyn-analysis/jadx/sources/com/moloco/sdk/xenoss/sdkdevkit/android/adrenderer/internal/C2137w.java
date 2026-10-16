package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import Hf.C0594d0;
import ef.C2515C;
import java.util.List;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import r7.AbstractC3935e;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2137w extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public int f32265a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f32266b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C2138x f32267c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y2.B f32268d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2137w(C2138x c2138x, Y2.B b5, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f32267c = c2138x;
        this.f32268d = b5;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2137w c2137w = new C2137w(this.f32267c, this.f32268d, interfaceC3103c);
        c2137w.f32266b = obj;
        return c2137w;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((C2137w) create((Ef.E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f32265a;
        if (i5 == 0) {
            Fe.e.U(obj);
            Ef.E e7 = (Ef.E) this.f32266b;
            Y2.B b5 = this.f32268d;
            C2138x c2138x = this.f32267c;
            List listD = AbstractC3935e.D(Ef.H.D(e7, null, new C2032t(c2138x, b5, null), 3), Ef.H.D(e7, null, new C2039u(c2138x, b5, null), 3), Ef.H.D(e7, null, new C2056v(c2138x, b5, null), 3));
            C0594d0 c0594d0 = c2138x.f32347e.f30680d;
            r rVar = new r(listD, c2138x, null);
            this.f32265a = 1;
            if (Hf.k0.k(c0594d0, rVar, this) == aVar) {
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
