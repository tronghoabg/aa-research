package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.creative.mraid;

import Ef.E;
import ac.C1346a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.i;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class e extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C1346a f30611a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f30612b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(C1346a c1346a, String str, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30611a = c1346a;
        this.f30612b = str;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new e(this.f30611a, this.f30612b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        e eVar = (e) create((E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        eVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        ((i) this.f30611a.f17489b).loadUrl("javascript:" + this.f30612b);
        return C2515C.f34653a;
    }
}
