package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen;

import E5.Q;
import Ef.H;
import Ef.S;
import Hf.Z;
import Hf.k0;
import Hf.x0;
import Jf.n;
import Lf.e;
import U8.v0;
import android.os.Bundle;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.activity.w;
import androidx.activity.x;
import androidx.appcompat.app.AppCompatActivity;
import ba.C1521a;
import com.moloco.sdk.acm.h;
import com.moloco.sdk.acm.recorder.c;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.publisher.C1915d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.C2010e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.i;
import java.lang.ref.WeakReference;
import ka.AbstractC3256n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import p7.AbstractC3772b;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/renderer/fullscreen/FullscreenWebviewActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "<init>", "()V", "p7/b", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class FullscreenWebviewActivity extends AppCompatActivity {

    /* renamed from: d, reason: collision with root package name */
    public static WeakReference f30710d = new WeakReference(null);

    /* renamed from: e, reason: collision with root package name */
    public static WeakReference f30711e = new WeakReference(null);

    /* renamed from: f, reason: collision with root package name */
    public static WeakReference f30712f = new WeakReference(null);

    /* renamed from: g, reason: collision with root package name */
    public static x0 f30713g;

    /* renamed from: h, reason: collision with root package name */
    public static x0 f30714h;

    /* renamed from: c, reason: collision with root package name */
    public x f30715c;

    public final void E(b bVar) {
        Integer num;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a aVar = bVar.f30595a;
        if (aVar == com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.orientation.a.f30593c) {
            MolocoLogger.debug$default(MolocoLogger.INSTANCE, "FullscreenWebviewActivity", "Orientation is none, not setting requested orientation", false, 4, null);
            return;
        }
        int i5 = a.f30716a[aVar.ordinal()];
        if (i5 == 1) {
            num = 1;
        } else if (i5 == 2) {
            num = 0;
        } else {
            if (i5 != 3) {
                throw new Q((byte) 0, 9);
            }
            num = null;
        }
        if (num != null) {
            int iIntValue = num.intValue();
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "FullscreenWebviewActivity", AbstractC3256n.g(iIntValue, "Setting orientation to "), null, false, 12, null);
            setRequestedOrientation(iIntValue);
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        int i5 = 0;
        super.onCreate(bundle);
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "FullscreenWebviewActivity", "onCreate called", null, false, 12, null);
        com.moloco.sdk.acm.recorder.b bVar = (com.moloco.sdk.acm.recorder.b) f30712f.get();
        if (bVar != null) {
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
            ((c) bVar).a(new h("fullscreen_webview_activity_create"));
        }
        w onBackPressedDispatcher = getOnBackPressedDispatcher();
        AbstractC3340k.d(onBackPressedDispatcher, "<get-onBackPressedDispatcher>(...)");
        this.f30715c = v0.j(onBackPressedDispatcher, this, new C1915d(9));
        f30711e = new WeakReference(this);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c) f30710d.get();
        if (cVar == null) {
            MolocoLogger.error$default(molocoLogger, "FullscreenWebviewActivity", "WebviewAd is null, something went wrong", null, false, 12, null);
            finish();
            return;
        }
        i iVar = cVar.f30576c;
        if (iVar.getParent() != null) {
            ViewParent parent = iVar.getParent();
            AbstractC3340k.c(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(iVar);
        }
        setContentView(iVar);
        x0 x0Var = f30713g;
        if (x0Var != null) {
            x0Var.k(null, Boolean.TRUE);
        }
        MolocoLogger.info$default(molocoLogger, "FullscreenWebviewActivity", "WebView is not null, proceeding to notify viewReady and viewVisible", null, false, 12, null);
        C1521a c1521a = cVar.f30577d;
        c1521a.getClass();
        MolocoLogger.info$default(molocoLogger, "TemplateBridgeImpl", "viewReady called, invoking notifyReadyEvent in WebView", null, false, 12, null);
        com.moloco.sdk.internal.client_metrics_data.a[] aVarArr2 = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
        h hVar = new h("template_bridge_notify_ready_invoked");
        i iVar2 = (i) c1521a.f19414b;
        hVar.a("attached", String.valueOf(iVar2.isAttachedToWindow()));
        ((c) c1521a.f19415c).a(hVar);
        iVar2.evaluateJavascript("notifyReadyEvent()", new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.bridge.b(c1521a, i5));
        android.support.v4.media.session.b.I(this);
        Hf.v0 orientation$moloco_sdk_release = iVar.getOrientation$moloco_sdk_release();
        e eVar = S.f3698a;
        Kd.a aVarC = H.c(n.f6132a);
        MolocoLogger.info$default(molocoLogger, "FullscreenWebviewActivity", "Starting to listen to orientation events", null, false, 12, null);
        E((b) orientation$moloco_sdk_release.getValue());
        k0.u(new Z(orientation$moloco_sdk_release, new C2010e(2, this, FullscreenWebviewActivity.class, "setOrientation", "setOrientation(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/templates/ad/orientation/OrientationSettings;)V", 4, 1), 0), aVarC);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "FullscreenWebviewActivity", "onDestroy called for FullscreenWebviewActivity", null, false, 12, null);
        x0 x0Var = f30714h;
        if (x0Var != null) {
            x0Var.k(null, Boolean.TRUE);
        }
        f30714h = null;
        x xVar = this.f30715c;
        if (xVar != null && xVar.f17724a) {
            xVar.e();
        }
        AbstractC3772b.c();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onPause() {
        C1521a c1521a;
        super.onPause();
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "FullscreenWebviewActivity", "Lifecycle onPause called", null, false, 12, null);
        if (isFinishing() || isDestroyed()) {
            MolocoLogger.info$default(molocoLogger, "FullscreenWebviewActivity", "Activity is finishing or destroyed, skipping viewVisible call", null, false, 12, null);
            return;
        }
        MolocoLogger.info$default(molocoLogger, "FullscreenWebviewActivity", "Activity is not finishing or destroyed, setting viewVisible to false", null, false, 12, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c) f30710d.get();
        if (cVar == null || (c1521a = cVar.f30577d) == null) {
            return;
        }
        c1521a.b(false);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        C1521a c1521a;
        super.onResume();
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "FullscreenWebviewActivity", "Lifecycle onResume called", null, false, 12, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c) f30710d.get();
        if (cVar == null || (c1521a = cVar.f30577d) == null) {
            return;
        }
        c1521a.b(true);
    }
}
