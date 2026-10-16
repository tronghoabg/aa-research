package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.publisher.AdLoad;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class h0 extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l0 f29035a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f29036b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdLoad.Listener f29037c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(l0 l0Var, String str, AdLoad.Listener listener, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f29035a = l0Var;
        this.f29036b = str;
        this.f29037c = listener;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new h0(this.f29035a, this.f29036b, this.f29037c, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        h0 h0Var = (h0) create((Ef.E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        h0Var.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        l0 l0Var = this.f29035a;
        l0Var.f29071p.load(this.f29036b, this.f29037c);
        return C2515C.f34653a;
    }
}
