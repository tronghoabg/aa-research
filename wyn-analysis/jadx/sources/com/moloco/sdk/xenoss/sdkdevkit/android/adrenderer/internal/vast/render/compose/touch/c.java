package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.touch;

import Ef.E;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import p0.t;
import tf.p;

/* loaded from: classes4.dex */
public final class c extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public int f31940a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C.e f31941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ t f31942c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p f31943d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(C.e eVar, t tVar, p pVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31941b = eVar;
        this.f31942c = tVar;
        this.f31943d = pVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new c(this.f31941b, this.f31942c, this.f31943d, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        return ((c) create((E) obj, (InterfaceC3103c) obj2)).invokeSuspend(C2515C.f34653a);
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        int i5 = this.f31940a;
        if (i5 == 0) {
            Fe.e.U(obj);
            C.e eVar = this.f31941b;
            eVar.f1716d.f();
            eVar.f1714b = false;
            eVar.f1715c = false;
            b bVar = new b(eVar, this.f31943d, null);
            this.f31940a = 1;
            if (this.f31942c.A(bVar, this) == aVar) {
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
