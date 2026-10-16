package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C2097a;
import e.AbstractC2435c;
import g.AbstractC2655c;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/vast/VastActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "ad/r", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class VastActivity extends ComponentActivity {

    /* renamed from: e, reason: collision with root package name */
    public static final Hf.j0 f31299e = Hf.k0.b(0, 0, 7);

    /* renamed from: f, reason: collision with root package name */
    public static WeakReference f31300f = new WeakReference(null);

    /* renamed from: g, reason: collision with root package name */
    public static C2097a f31301g;

    /* renamed from: h, reason: collision with root package name */
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.G f31302h;

    /* renamed from: i, reason: collision with root package name */
    public static S8.d f31303i;

    /* renamed from: j, reason: collision with root package name */
    public static Ef.H0 f31304j;
    public static com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v k;

    /* renamed from: l, reason: collision with root package name */
    public static com.moloco.sdk.acm.recorder.c f31305l;

    /* renamed from: b, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q f31306b;

    /* renamed from: c, reason: collision with root package name */
    public final Kd.a f31307c;

    /* renamed from: d, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o f31308d;

    public VastActivity() {
        Lf.e eVar = Ef.S.f3698a;
        this.f31307c = Ef.H.c(Jf.n.f6132a);
    }

    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ic.d.e(getApplicationContext());
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a.f30877a;
        if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a.f30879c) {
            androidx.lifecycle.J.f18589i.f18595f.a(aVar);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a.f30879c = true;
        }
        AbstractC2655c abstractC2655cRegisterForActivityResult = registerForActivityResult(new androidx.fragment.app.Z(2), new S8.b(this, 28));
        AbstractC3340k.d(abstractC2655cRegisterForActivityResult, "registerForActivityResult(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0 g0A = com.moloco.sdk.service_locator.i.a();
        this.f31308d = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o(this, abstractC2655cRegisterForActivityResult, androidx.lifecycle.V.f(this), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a.f30878b);
        Intent intent = getIntent();
        AbstractC3340k.d(intent, "getIntent(...)");
        boolean booleanExtra = intent.getBooleanExtra("ANDROID_INLINE_ENABLED", false);
        Intent intent2 = getIntent();
        AbstractC3340k.d(intent2, "getIntent(...)");
        boolean booleanExtra2 = intent2.getBooleanExtra("ANDROID_AUTOINLINE_ENABLED", false);
        Intent intent3 = getIntent();
        AbstractC3340k.d(intent3, "getIntent(...)");
        boolean booleanExtra3 = intent3.getBooleanExtra("ANDROID_AUTOINLINE_SKIP", false);
        Intent intent4 = getIntent();
        AbstractC3340k.d(intent4, "getIntent(...)");
        boolean booleanExtra4 = intent4.getBooleanExtra("ANDROID_AUTOINLINE_FORCE_FULLSCREEN", false);
        Intent intent5 = getIntent();
        AbstractC3340k.d(intent5, "getIntent(...)");
        String stringExtra = intent5.getStringExtra("ANDROID_AUTOINLINE_CLICKTHROUGH");
        Intent intent6 = getIntent();
        AbstractC3340k.d(intent6, "getIntent(...)");
        String stringExtra2 = intent6.getStringExtra("ANDROID_AUTOINLINE_EVENTLINK");
        com.moloco.sdk.acm.recorder.c cVar = f31305l;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar = this.f31308d;
        if (oVar == null) {
            AbstractC3340k.m("storeInstallerImpl");
            throw null;
        }
        Intent intent7 = getIntent();
        AbstractC3340k.d(intent7, "getIntent(...)");
        String stringExtra3 = intent7.getStringExtra("BUNDLE_ID");
        com.google.android.gms.ads.nativead.l lVar = new com.google.android.gms.ads.nativead.l(2);
        Intent intent8 = getIntent();
        AbstractC3340k.d(intent8, "getIntent(...)");
        boolean booleanExtra5 = intent8.getBooleanExtra("ANDROID_INLINE_ENABLED", false);
        Intent intent9 = getIntent();
        AbstractC3340k.d(intent9, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c cVar2 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c(booleanExtra5, intent9.getStringExtra("ANDROID_INLINE_URL"));
        Intent intent10 = getIntent();
        AbstractC3340k.d(intent10, "getIntent(...)");
        boolean booleanExtra6 = intent10.getBooleanExtra("ANDROID_AUTOINLINE_ENABLED", false);
        Intent intent11 = getIntent();
        AbstractC3340k.d(intent11, "getIntent(...)");
        boolean booleanExtra7 = intent11.getBooleanExtra("ANDROID_AUTOINLINE_SKIP", false);
        Intent intent12 = getIntent();
        AbstractC3340k.d(intent12, "getIntent(...)");
        String stringExtra4 = intent12.getStringExtra("ANDROID_AUTOINLINE_EVENTLINK");
        Intent intent13 = getIntent();
        AbstractC3340k.d(intent13, "getIntent(...)");
        String stringExtra5 = intent13.getStringExtra("ANDROID_AUTOINLINE_CLICKTHROUGH");
        Intent intent14 = getIntent();
        AbstractC3340k.d(intent14, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k dVar = (booleanExtra || booleanExtra3 || booleanExtra2) ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d(new X8.c(oVar, stringExtra3, lVar, cVar2, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b(booleanExtra6, booleanExtra7, stringExtra4, stringExtra5, intent14.getBooleanExtra("ANDROID_AUTOINLINE_FORCE_FULLSCREEN", false)), f31305l), g0A, booleanExtra, booleanExtra2, booleanExtra3, booleanExtra4, stringExtra, stringExtra2, cVar) : new a2.v(g0A);
        C2097a c2097a = f31301g;
        if (c2097a == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "VastActivity", "ad is missing", null, false, 12, null);
            finish();
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.compose.G g9 = f31302h;
        if (g9 == null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "VastActivity", "VastRenderer is missing", null, false, 12, null);
            finish();
            return;
        }
        com.moloco.sdk.internal.services.events.c cVarA = com.moloco.sdk.service_locator.l.a();
        Intent intent15 = getIntent();
        AbstractC3340k.d(intent15, "getIntent(...)");
        boolean booleanExtra8 = intent15.getBooleanExtra("START_MUTED", true);
        Intent intent16 = getIntent();
        AbstractC3340k.d(intent16, "getIntent(...)");
        Boolean boolValueOf = intent16.hasExtra("SKIP_ENABLED") ? Boolean.valueOf(intent16.getBooleanExtra("SKIP_ENABLED", false)) : null;
        Intent intent17 = getIntent();
        AbstractC3340k.d(intent17, "getIntent(...)");
        int intExtra = intent17.getIntExtra("SKIP_DELAY_SECONDS", 0);
        Intent intent18 = getIntent();
        AbstractC3340k.d(intent18, "getIntent(...)");
        int intExtra2 = intent18.getIntExtra("CLOSE_DELAY_SECONDS", 0);
        Intent intent19 = getIntent();
        AbstractC3340k.d(intent19, "getIntent(...)");
        int intExtra3 = intent19.getIntExtra("DEC_DELAY_SECONDS", 0);
        Intent intent20 = getIntent();
        AbstractC3340k.d(intent20, "getIntent(...)");
        boolean booleanExtra9 = intent20.getBooleanExtra("AUTO_STORE_ON_SKIP", false);
        Intent intent21 = getIntent();
        AbstractC3340k.d(intent21, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q qVarG = android.support.v4.media.session.b.G(c2097a, g0A, this, cVarA, booleanExtra8, boolValueOf, intExtra, intExtra2, intExtra3, booleanExtra9, intent21.getBooleanExtra("AUTO_STORE_ON_COMPLETE", false), dVar);
        this.f31306b = qVarG;
        f31300f = new WeakReference(this);
        Hf.k0.u(new Hf.Z(qVarG.f31649i, new C2071h(this, null), 0), this.f31307c);
        try {
            AbstractC2435c.a(this, new V.d(-369589045, true, new com.moloco.sdk.internal.f(this, qVarG, g9, 2)));
            qVarG.a();
        } catch (ClassNotFoundException e7) {
            u(e7);
        } catch (NoClassDefFoundError e10) {
            u(e10);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        S8.d dVar = f31303i;
        if (dVar != null) {
            dVar.invoke();
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q qVar = this.f31306b;
        if (qVar != null) {
            qVar.destroy();
        }
        this.f31306b = null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar = this.f31308d;
        if (oVar == null) {
            AbstractC3340k.m("storeInstallerImpl");
            throw null;
        }
        oVar.b();
        Ef.H.j(this.f31307c, null);
        f31300f = new WeakReference(null);
        ad.r.b();
    }

    public final void u(Throwable th) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "VastActivity", "Compose dependency not available, cannot show fullscreen VAST ad", th, false, 8, null);
        com.moloco.sdk.acm.recorder.c cVar = f31305l;
        if (cVar != null) {
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
            cVar.a(new com.moloco.sdk.acm.h("fullscreen_ad_compose_not_available"));
        }
        Ef.H.D(this.f31307c, null, new C2069g(2, null), 3);
        finish();
    }
}
