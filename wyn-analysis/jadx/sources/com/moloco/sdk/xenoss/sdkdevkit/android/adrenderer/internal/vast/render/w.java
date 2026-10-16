package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render;

import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* loaded from: classes4.dex */
public final class w extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ tf.a f32095a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(tf.a aVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f32095a = aVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new w(this.f32095a, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        w wVar = (w) create((C2515C) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        wVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        this.f32095a.invoke();
        return C2515C.f34653a;
    }
}
