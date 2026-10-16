package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer;

import Hf.k0;
import Hf.x0;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C1980a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C1982b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v;
import e.AbstractC2435c;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/StaticAdActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "com/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/staticrenderer/c", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class StaticAdActivity extends ComponentActivity {

    /* renamed from: c, reason: collision with root package name */
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f f30520c;

    /* renamed from: d, reason: collision with root package name */
    public static g f30521d;

    /* renamed from: e, reason: collision with root package name */
    public static StaticAdActivity f30522e;

    /* renamed from: f, reason: collision with root package name */
    public static S8.d f30523f;

    /* renamed from: g, reason: collision with root package name */
    public static C1980a f30524g;

    /* renamed from: i, reason: collision with root package name */
    public static v f30526i;

    /* renamed from: j, reason: collision with root package name */
    public static com.moloco.sdk.acm.recorder.c f30527j;
    public static C1982b k;

    /* renamed from: b, reason: collision with root package name */
    public static final c f30519b = new c();

    /* renamed from: h, reason: collision with root package name */
    public static final x0 f30525h = k0.c(Boolean.FALSE);

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ic.d.e(getApplicationContext());
        f30522e = this;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f fVar = f30520c;
        g gVar = f30521d;
        c cVar = f30519b;
        if (gVar == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "StaticAdActivity", "can't display ad: WebView is missing", null, false, 12, null);
            c.b(cVar);
            return;
        }
        if (fVar == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "StaticAdActivity", "can't display ad: StaticRenderer is missing", null, false, 12, null);
            c.b(cVar);
            return;
        }
        try {
            AbstractC2435c.a(this, new V.d(-1596214, true, new com.moloco.sdk.internal.f(this, gVar, fVar, 1)));
        } catch (ClassNotFoundException e7) {
            u(e7);
        } catch (NoClassDefFoundError e10) {
            u(e10);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        S8.d dVar = f30523f;
        if (dVar != null) {
            dVar.invoke();
        }
        f30522e = null;
    }

    public final void u(Throwable th) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "StaticAdActivity", "Compose dependency not available, cannot show fullscreen static ad", th, false, 8, null);
        com.moloco.sdk.acm.recorder.c cVar = f30527j;
        if (cVar != null) {
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
            cVar.a(new com.moloco.sdk.acm.h("fullscreen_ad_compose_not_available"));
        }
        C1982b c1982b = k;
        if (c1982b != null) {
            c1982b.invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.b.f30099b);
        }
        c.b(f30519b);
    }
}
