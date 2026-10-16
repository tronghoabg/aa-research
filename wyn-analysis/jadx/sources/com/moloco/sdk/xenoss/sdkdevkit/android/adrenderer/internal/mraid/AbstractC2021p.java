package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import Ef.S;
import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import jf.InterfaceC3103c;
import kotlin.jvm.internal.AbstractC3340k;
import org.json.JSONObject;

/* renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC2021p implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n {

    /* renamed from: a, reason: collision with root package name */
    public final String f30427a;

    /* renamed from: b, reason: collision with root package name */
    public final F f30428b;

    /* renamed from: c, reason: collision with root package name */
    public tf.a f30429c;

    /* renamed from: d, reason: collision with root package name */
    public tf.l f30430d;

    /* renamed from: e, reason: collision with root package name */
    public tf.l f30431e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f30432f;

    /* renamed from: g, reason: collision with root package name */
    public final K8.H f30433g;

    /* renamed from: h, reason: collision with root package name */
    public final Kd.a f30434h;

    /* renamed from: i, reason: collision with root package name */
    public G f30435i;

    /* renamed from: j, reason: collision with root package name */
    public final K3.r f30436j;

    public AbstractC2021p(Context context, String adm, F f10, tf.a onShowListenerClick, tf.l lVar, tf.l onError, G0 externalLinkHandler, boolean z2, K8.H h10) {
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(adm, "adm");
        AbstractC3340k.e(onShowListenerClick, "onShowListenerClick");
        AbstractC3340k.e(onError, "onError");
        AbstractC3340k.e(externalLinkHandler, "externalLinkHandler");
        this.f30427a = adm;
        this.f30428b = f10;
        this.f30429c = onShowListenerClick;
        this.f30430d = lVar;
        this.f30431e = onError;
        this.f30432f = z2;
        this.f30433g = h10;
        Lf.e eVar = S.f3698a;
        Kd.a aVarC = Ef.H.c(Jf.n.f6132a);
        this.f30434h = aVarC;
        this.f30436j = new K3.r((O) h10.f6587f, context, aVarC);
    }

    public void a() {
    }

    public final Object b(InterfaceC3103c interfaceC3103c) {
        Object objP = Ef.H.h(this.f30434h, null, new C2014i(this, null), 3).p(interfaceC3103c);
        kf.a aVar = kf.a.f39711a;
        return objP;
    }

    public final void c(G g9) {
        this.f30435i = g9;
        this.f30433g.h("mraidbridge.setState(" + JSONObject.quote(g9.f30353a) + ')');
    }

    public abstract void d();

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
    public final void destroy() {
        Ef.H.j(this.f30434h, null);
        this.f30433g.destroy();
        this.f30436j.destroy();
    }
}
