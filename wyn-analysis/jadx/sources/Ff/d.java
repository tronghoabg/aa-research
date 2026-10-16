package Ff;

import C8.i;
import E5.Q;
import Hf.x0;
import N.V;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.webkit.JsPromptResult;
import com.moloco.sdk.internal.publisher.C1918g;
import com.moloco.sdk.internal.publisher.C1919h;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.L;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.AbstractC2101d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.C2098a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.C2099b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.C2100c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.G;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.h;
import com.unity3d.services.UnityAdsConstants;
import d0.C2384c;
import ef.C2515C;
import j$.util.Objects;
import kd.C3300K;
import kd.P;
import kotlin.jvm.internal.AbstractC3340k;
import r0.InterfaceC3906k;
import t0.y;
import tf.l;

/* loaded from: classes5.dex */
public final /* synthetic */ class d implements l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4111a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f4112b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f4113c;

    public /* synthetic */ d(int i5, Object obj, Object obj2) {
        this.f4111a = i5;
        this.f4112b = obj;
        this.f4113c = obj2;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        switch (this.f4111a) {
            case 0:
                ((e) this.f4112b).f4114b.removeCallbacks((C8.d) this.f4113c);
                return C2515C.f34653a;
            case 1:
                ((Nf.c) this.f4113c).getClass();
                ((Nf.d) this.f4112b).a(null);
                return C2515C.f34653a;
            case 2:
                ((Boolean) obj).booleanValue();
                ((C1919h) this.f4112b).onRewardedVideoCompleted(MolocoAdKt.createAdInfo$default(((C1918g) this.f4113c).f29020b, null, null, 6, null));
                return C2515C.f34653a;
            case 3:
                AbstractC2101d event = (AbstractC2101d) obj;
                L l10 = (L) this.f4112b;
                l10.getClass();
                AbstractC3340k.e(event, "event");
                boolean zEquals = event.equals(C2099b.f31610e);
                x0 x0Var = l10.f29981h;
                if (zEquals) {
                    Boolean bool = Boolean.TRUE;
                    x0Var.getClass();
                    x0Var.k(null, bool);
                } else if (event.equals(C2099b.f31606a)) {
                    Boolean bool2 = Boolean.TRUE;
                    x0Var.getClass();
                    x0Var.k(null, bool2);
                } else if (event.equals(C2099b.f31608c)) {
                    Boolean bool3 = Boolean.TRUE;
                    x0Var.getClass();
                    x0Var.k(null, bool3);
                } else {
                    boolean zEquals2 = event.equals(C2099b.f31612g);
                    r rVar = (r) this.f4113c;
                    if (zEquals2) {
                        rVar.a(true);
                    } else if (event.equals(C2099b.f31613h)) {
                        rVar.a();
                    } else if (event.equals(C2099b.f31607b)) {
                        rVar.a(false);
                    } else if (event.equals(C2098a.f31605a)) {
                        rVar.b();
                    } else if (event instanceof C2100c) {
                        rVar.e(((C2100c) event).f31614a);
                    } else if (!event.equals(C2099b.f31611f) && !event.equals(C2099b.f31609d)) {
                        throw new Q((byte) 0, 9);
                    }
                }
                return C2515C.f34653a;
            case 4:
                String url = (String) obj;
                AbstractC3340k.e(url, "url");
                ((tf.a) this.f4112b).invoke();
                k kVar = (k) this.f4113c;
                if (kVar != null) {
                    kVar.a(url);
                }
                return C2515C.f34653a;
            case 5:
                InterfaceC3906k it = (InterfaceC3906k) obj;
                AbstractC3340k.e(it, "it");
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) this.f4112b;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.c buttonType = dVar.f32413a;
                AbstractC3340k.e(buttonType, "buttonType");
                g gVar = new g(((int) C2384c.b(Fe.g.G(it))) / Resources.getSystem().getDisplayMetrics().density, ((int) C2384c.c(Fe.g.G(it))) / Resources.getSystem().getDisplayMetrics().density);
                y yVar = (y) it;
                float f10 = ((int) (yVar.f44309c & 4294967295L)) / Resources.getSystem().getDisplayMetrics().density;
                float f11 = ((int) (yVar.f44309c >> 32)) / Resources.getSystem().getDisplayMetrics().density;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d dVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d(buttonType, gVar, new h(f11, f10));
                if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && !dVar2.equals(dVar)) {
                    ((l) this.f4113c).invoke(dVar2);
                }
                return C2515C.f34653a;
            case 6:
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d it2 = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj;
                AbstractC3340k.e(it2, "it");
                ((V) this.f4113c).setValue(it2);
                ((l) this.f4112b).invoke(it2);
                return C2515C.f34653a;
            case 7:
                Context ctx = (Context) obj;
                AbstractC3340k.e(ctx, "ctx");
                return (View) ((G) this.f4112b).invoke(ctx, (q) this.f4113c);
            case 8:
                C3300K c3300k = (C3300K) obj;
                P p10 = (P) this.f4112b;
                if (c3300k.f39580d) {
                    i iVar = p10.f39598b.f39663a;
                    Throwable th = c3300k.f39579c;
                    Objects.requireNonNull(th);
                    iVar.getClass();
                    i.t(th);
                    return null;
                }
                String str = (String) c3300k.f39578b;
                JsPromptResult jsPromptResult = (JsPromptResult) this.f4113c;
                if (str != null) {
                    jsPromptResult.confirm(str);
                    return null;
                }
                jsPromptResult.cancel();
                return null;
            default:
                AbstractC3340k.e(obj, "<this>");
                l lVar = (l) this.f4112b;
                if (lVar != null) {
                    lVar.invoke(obj);
                }
                ((l) this.f4113c).invoke(obj);
                return C2515C.f34653a;
        }
    }
}
