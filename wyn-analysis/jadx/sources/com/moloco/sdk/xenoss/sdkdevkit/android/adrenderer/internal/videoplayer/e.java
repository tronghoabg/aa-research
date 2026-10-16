package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.videoplayer;

import Ef.H;
import Ef.H0;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class e extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f32221a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j f32222b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(j jVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f32222b = jVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        e eVar = new e(this.f32222b, interfaceC3103c);
        eVar.f32221a = obj;
        return eVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        e eVar = (e) create((a) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        eVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        boolean z2 = ((a) this.f32221a).f32208a;
        j jVar = this.f32222b;
        if (z2) {
            H0 h02 = jVar.f32251v;
            if (h02 != null) {
                h02.cancel(null);
            }
            jVar.f32251v = H.D(jVar.f32235e, null, new i(jVar, null), 3);
        } else {
            H0 h03 = jVar.f32251v;
            if (h03 != null) {
                h03.cancel(null);
            }
        }
        return C2515C.f34653a;
    }
}
