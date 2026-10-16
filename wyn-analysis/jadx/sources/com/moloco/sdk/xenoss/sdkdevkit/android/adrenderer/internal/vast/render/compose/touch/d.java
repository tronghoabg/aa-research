package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch;

import Ef.H;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import p0.t;
import tf.p;

/* loaded from: classes4.dex */
public final class d extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f31944a;

    /* renamed from: b, reason: collision with root package name */
    public /* synthetic */ Object f31945b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C.e f31946c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f31947d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(C.e eVar, p pVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31946c = eVar;
        this.f31947d = pVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        d dVar = new d(this.f31946c, this.f31947d, interfaceC3103c);
        dVar.f31945b = obj;
        return dVar;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((d) create((t) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31944a;
        if (i5 == 0) {
            Fe.e.U(obj);
            c cVar = new c(this.f31946c, (t) this.f31945b, this.f31947d, null);
            this.f31944a = 1;
            if (H.l(cVar, this) == aVar) {
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
