package com.moloco.sdk.internal.publisher;

import Cd.AbstractC0350s;
import Cd.C0348p;
import android.os.Build;
import ba.C1521a;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity;
import com.unity3d.services.UnityAdsConstants;
import ef.C2515C;
import ff.AbstractC2641B;
import g0.C2661b;
import java.lang.ref.WeakReference;
import java.util.List;
import jf.InterfaceC3103c;
import kd.C3311g;
import kotlin.jvm.internal.AbstractC3340k;
import wd.C4402c;
import x0.AbstractC4446p;
import x0.C4437g;

/* renamed from: com.moloco.sdk.internal.publisher.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C1915d implements tf.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f29011a;

    public /* synthetic */ C1915d(int i5) {
        this.f29011a = i5;
    }

    @Override // tf.l
    public final Object invoke(Object obj) {
        int i5 = 1;
        InterfaceC3103c interfaceC3103c = null;
        C2515C c2515c = C2515C.f34653a;
        switch (this.f29011a) {
            case 0:
                com.moloco.sdk.internal.ortb.model.h0 h0Var = (com.moloco.sdk.internal.ortb.model.h0) obj;
                if (h0Var == null) {
                    break;
                } else {
                    break;
                }
            case 1:
                com.moloco.sdk.internal.ortb.model.h0 h0Var2 = (com.moloco.sdk.internal.ortb.model.h0) obj;
                if (h0Var2 == null) {
                    break;
                } else {
                    break;
                }
            case 2:
                C4437g semantics = (C4437g) obj;
                AbstractC3340k.e(semantics, "$this$semantics");
                AbstractC4446p.a(semantics, "playback_control_button");
                AbstractC4446p.c(semantics, "playback_control_button");
                break;
            case 3:
                Xf.f Json = (Xf.f) obj;
                AbstractC3340k.e(Json, "$this$Json");
                Json.f16263d = true;
                Json.f16262c = true;
                break;
            case 4:
                Jd.n headers = (Jd.n) obj;
                AbstractC3340k.e(headers, "$this$headers");
                String str = Build.VERSION.RELEASE;
                AbstractC2641B.d(headers, null);
                break;
            case 5:
                C4437g semantics2 = (C4437g) obj;
                AbstractC3340k.e(semantics2, "$this$semantics");
                AbstractC4446p.a(semantics2, "Watermark Overlay");
                AbstractC4446p.c(semantics2, "Watermark Overlay");
                break;
            case 6:
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d it = (com.moloco.sdk.xenoss.sdkdevkit.android.core.services.d) obj;
                AbstractC3340k.e(it, "it");
                break;
            case 7:
                String it2 = (String) obj;
                AbstractC3340k.e(it2, "it");
                break;
            case 8:
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d it3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj;
                AbstractC3340k.e(it3, "it");
                break;
            case 9:
                androidx.activity.o addCallback = (androidx.activity.o) obj;
                WeakReference weakReference = FullscreenWebviewActivity.f30710d;
                AbstractC3340k.e(addCallback, "$this$addCallback");
                MolocoLogger.debug$default(MolocoLogger.INSTANCE, "FullscreenWebviewActivity", "Back press detected, but disabled", false, 4, null);
                break;
            case 10:
                C4437g semantics3 = (C4437g) obj;
                AbstractC3340k.e(semantics3, "$this$semantics");
                AbstractC4446p.a(semantics3, "Ad Badge");
                AbstractC4446p.c(semantics3, "Ad Badge");
                break;
            case 11:
                C4437g semantics4 = (C4437g) obj;
                AbstractC3340k.e(semantics4, "$this$semantics");
                AbstractC4446p.a(semantics4, "rewarded_countdown_timer");
                AbstractC4446p.c(semantics4, "rewarded_countdown_timer");
                break;
            case 12:
                C4437g semantics5 = (C4437g) obj;
                AbstractC3340k.e(semantics5, "$this$semantics");
                AbstractC4446p.a(semantics5, "rewarded_countdown_timer_custom");
                AbstractC4446p.c(semantics5, "rewarded_countdown_timer_custom");
                break;
            case 13:
                C4437g semantics6 = (C4437g) obj;
                AbstractC3340k.e(semantics6, "$this$semantics");
                AbstractC4446p.a(semantics6, "custom_countdown_timer_text");
                AbstractC4446p.c(semantics6, "custom_countdown_timer_text");
                break;
            case 14:
                C4437g semantics7 = (C4437g) obj;
                AbstractC3340k.e(semantics7, "$this$semantics");
                AbstractC4446p.a(semantics7, "custom_timer_container");
                AbstractC4446p.c(semantics7, "custom_timer_container");
                break;
            case 15:
                C4437g semantics8 = (C4437g) obj;
                AbstractC3340k.e(semantics8, "$this$semantics");
                AbstractC4446p.a(semantics8, "timer_container");
                AbstractC4446p.c(semantics8, "timer_container");
                break;
            case 16:
                C4437g semantics9 = (C4437g) obj;
                AbstractC3340k.e(semantics9, "$this$semantics");
                AbstractC4446p.a(semantics9, "countdown_timer_text");
                AbstractC4446p.c(semantics9, "countdown_timer_text");
                break;
            case 17:
                t0.v drawWithContent = (t0.v) obj;
                AbstractC3340k.e(drawWithContent, "$this$drawWithContent");
                C2661b c2661b = drawWithContent.f45543a;
                float fD = d0.f.d(c2661b.f35484b.y()) / 2.0f;
                C1521a c1521a = c2661b.f35484b;
                float fB = d0.f.b(c1521a.y());
                long jY = c1521a.y();
                c1521a.v().m();
                ((C1521a) ((ad.L) c1521a.f19414b).f17515b).v().e(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, fD, fB, 1);
                drawWithContent.a();
                c1521a.v().restore();
                c1521a.J(jY);
                break;
            case 18:
                List it4 = (List) obj;
                AbstractC3340k.e(it4, "it");
                break;
            case 19:
                C4437g semantics10 = (C4437g) obj;
                AbstractC3340k.e(semantics10, "$this$semantics");
                AbstractC4446p.a(semantics10, "mute_button");
                AbstractC4446p.c(semantics10, "mute_button");
                break;
            case 20:
                break;
            case 21:
                int i10 = C3311g.f39660e;
                break;
            case 22:
                break;
            case 23:
                int i11 = kd.P.f39597h;
                break;
            case 24:
                int i12 = kd.T.f39613c;
                break;
            case 25:
                int i13 = kd.W.f39625c;
                break;
            case 26:
                int i14 = kd.a0.f39640d;
                break;
            case 27:
                C4402c install = (C4402c) obj;
                AbstractC3340k.e(install, "$this$install");
                vg.b bVar = AbstractC0350s.f2175a;
                int i15 = 3;
                install.f47469e.f(Fd.f.f4062j, new C0348p(i15, interfaceC3103c, 0));
                Cd.r rVar = new Cd.r(install, null);
                Gd.b bVar2 = install.f47470f;
                D8.a aVar = Gd.b.k;
                bVar2.f(aVar, rVar);
                bVar2.f(aVar, new C0348p(i15, interfaceC3103c, i5));
                break;
            case 28:
                AbstractC3340k.e(obj, "<this>");
                break;
            default:
                AbstractC3340k.e((Ad.h) obj, "<this>");
                break;
        }
        return c2515c;
    }

    public /* synthetic */ C1915d(Object obj, int i5) {
        this.f29011a = i5;
    }
}
