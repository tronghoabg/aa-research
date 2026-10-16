package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer;

import Ef.E;
import android.webkit.WebSettings;
import ef.C2515C;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import tf.p;

/* loaded from: classes4.dex */
public final class f extends AbstractC3471j implements p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f30708a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.j f30709b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(i iVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.j jVar, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30708a = iVar;
        this.f30709b = jVar;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new f(this.f30708a, this.f30709b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        f fVar = (f) create((E) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        fVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        i iVar = this.f30708a;
        WebSettings settings = iVar.getSettings();
        int i5 = e.f30623a[this.f30709b.ordinal()];
        settings.setMediaPlaybackRequiresUserGesture(i5 != 1 ? i5 != 2 ? iVar.getSettings().getMediaPlaybackRequiresUserGesture() : false : true);
        return C2515C.f34653a;
    }
}
