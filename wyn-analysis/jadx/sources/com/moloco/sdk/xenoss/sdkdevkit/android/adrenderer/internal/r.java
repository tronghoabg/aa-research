package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import Ef.InterfaceC0501m0;
import android.os.Handler;
import android.os.Looper;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity;
import ef.C2515C;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import jf.InterfaceC3103c;
import lf.AbstractC3471j;
import p7.AbstractC3772b;

/* loaded from: classes4.dex */
public final class r extends AbstractC3471j implements tf.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ List f30497a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C2138x f30498b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(List list, C2138x c2138x, InterfaceC3103c interfaceC3103c) {
        super(2, interfaceC3103c);
        this.f30497a = list;
        this.f30498b = c2138x;
    }

    @Override // lf.AbstractC3462a
    public final InterfaceC3103c create(Object obj, InterfaceC3103c interfaceC3103c) {
        return new r(this.f30497a, this.f30498b, interfaceC3103c);
    }

    @Override // tf.p
    public final Object invoke(Object obj, Object obj2) {
        r rVar = (r) create((C2515C) obj, (InterfaceC3103c) obj2);
        C2515C c2515c = C2515C.f34653a;
        rVar.invokeSuspend(c2515c);
        return c2515c;
    }

    @Override // lf.AbstractC3462a
    public final Object invokeSuspend(Object obj) {
        kf.a aVar = kf.a.f39711a;
        Fe.e.U(obj);
        Iterator it = this.f30497a.iterator();
        while (it.hasNext()) {
            ((InterfaceC0501m0) it.next()).cancel(null);
        }
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateFullscreenAd", "Calling close()", null, false, 12, null);
        WeakReference weakReference = FullscreenWebviewActivity.f30710d;
        AbstractC3772b.c();
        new Handler(Looper.getMainLooper()).postDelayed(new com.applovin.adview.a(this.f30498b, 11), 1000L);
        return C2515C.f34653a;
    }
}
