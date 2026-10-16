package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AbstractC2101d;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C2057a extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public /* synthetic */ Object f31325a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Ff.d f31326b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2057a(Ff.d dVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f31326b = dVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        C2057a c2057a = new C2057a(this.f31326b, interfaceC3103c);
        c2057a.f31325a = obj;
        return c2057a;
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        C2057a c2057a = (C2057a) create((AbstractC2101d) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        c2057a.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        this.f31326b.invoke((AbstractC2101d) this.f31325a);
        return C2515C.f34653a;
    }
}
