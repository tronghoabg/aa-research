package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import E5.Q;
import Ef.S;
import Hf.e0;
import Hf.j0;
import Hf.k0;
import Va.Y7;
import android.content.Intent;
import android.os.Bundle;
import androidx.activity.ComponentActivity;
import androidx.fragment.app.Z;
import androidx.lifecycle.V;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C1982b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.z0;
import e.AbstractC2435c;
import ef.C2532p;
import g.AbstractC2655c;
import java.lang.ref.WeakReference;
import jf.InterfaceC3103c;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidActivity;", "Landroidx/activity/ComponentActivity;", "<init>", "()V", "com/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/a", "moloco-sdk_release"}, k = 1, mv = {2, 0, 0})
/* loaded from: classes4.dex */
public final class MraidActivity extends ComponentActivity {

    /* renamed from: h, reason: collision with root package name */
    public static final j0 f30371h = k0.b(0, 0, 7);

    /* renamed from: b, reason: collision with root package name */
    public final Kd.a f30372b;

    /* renamed from: c, reason: collision with root package name */
    public final C2532p f30373c;

    /* renamed from: d, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q f30374d;

    /* renamed from: e, reason: collision with root package name */
    public t f30375e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f30376f;

    /* renamed from: g, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o f30377g;

    public MraidActivity() {
        Lf.e eVar = S.f3698a;
        this.f30372b = Ef.H.c(Jf.n.f6132a);
        this.f30373c = Fe.c.z(new com.moloco.sdk.service_locator.h(11));
    }

    public final void B(Throwable th) {
        MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidActivity", "Compose dependency not available, cannot show fullscreen MRAID ad", th, false, 8, null);
        com.moloco.sdk.acm.recorder.c cVar = AbstractC2012g.f30413n;
        if (cVar != null) {
            com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
            cVar.a(new com.moloco.sdk.acm.h("fullscreen_ad_compose_not_available"));
        }
        C1982b c1982b = AbstractC2012g.k;
        if (c1982b != null) {
            c1982b.invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.b.f30099b);
        }
        finish();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        boolean z2;
        int i5;
        InterfaceC3103c interfaceC3103c;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q qVar;
        Y7 y72;
        MraidActivity mraidActivity = this;
        int i10 = 2;
        super.onCreate(bundle);
        ic.d.e(mraidActivity.getApplicationContext());
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a aVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a.f30877a;
        if (!com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a.f30879c) {
            androidx.lifecycle.J.f18589i.f18595f.a(aVar);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a.f30879c = true;
        }
        AbstractC2655c abstractC2655cRegisterForActivityResult = mraidActivity.registerForActivityResult(new Z(i10), new S8.b(mraidActivity, 27));
        AbstractC3340k.d(abstractC2655cRegisterForActivityResult, "registerForActivityResult(...)");
        mraidActivity.f30377g = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o(mraidActivity, abstractC2655cRegisterForActivityResult, V.f(mraidActivity), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.a.f30878b);
        G0 g0A = com.moloco.sdk.service_locator.i.a();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.c cVar = AbstractC2012g.f30411l;
        boolean z10 = cVar != null ? cVar.f30885a : false;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.b bVar = AbstractC2012g.f30412m;
        boolean z11 = bVar != null ? bVar.f30880a : false;
        boolean z12 = bVar != null ? bVar.f30881b : false;
        boolean z13 = bVar != null ? bVar.f30884e : true;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.A a5 = null;
        String str = bVar != null ? bVar.f30883d : null;
        String str2 = bVar != null ? bVar.f30882c : null;
        com.moloco.sdk.acm.recorder.c cVar2 = AbstractC2012g.f30413n;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar = mraidActivity.f30377g;
        if (oVar == null) {
            AbstractC3340k.m("storeInstallerImpl");
            throw null;
        }
        Intent intent = mraidActivity.getIntent();
        AbstractC3340k.d(intent, "getIntent(...)");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.k dVar = (z10 || z12 || z11) ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.d(new X8.c(oVar, intent.getStringExtra("BUNDLE_ID"), new com.google.android.gms.ads.nativead.l(2), AbstractC2012g.f30411l, AbstractC2012g.f30412m, AbstractC2012g.f30413n), g0A, z10, z11, z12, z13, str, str2, cVar2) : new a2.v(g0A);
        AbstractC2012g.f30402b = new WeakReference(mraidActivity);
        tf.p pVar = AbstractC2012g.f30404d;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.webview.f fVar = AbstractC2012g.f30403c;
        if (fVar == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidActivity", "can't display ad: MraidRenderer is missing", null, false, 12, null);
            mraidActivity.finish();
            return;
        }
        t tVar = (t) AbstractC2012g.f30401a.get();
        if (tVar == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidActivity", "can't display ad: mraid controller is missing", null, false, 12, null);
            mraidActivity.finish();
            return;
        }
        C2013h c2013h = AbstractC2012g.f30406f;
        if (c2013h != null) {
            Intent intent2 = mraidActivity.getIntent();
            AbstractC3340k.d(intent2, "getIntent(...)");
            int intExtra = intent2.getIntExtra("DEC_DELAY_SECONDS", 0);
            com.moloco.sdk.internal.services.events.c customUserEventBuilderService = (com.moloco.sdk.internal.services.events.c) mraidActivity.f30373c.getValue();
            AbstractC3340k.e(customUserEventBuilderService, "customUserEventBuilderService");
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.C c10 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.C(tVar);
            z0 z0Var = c2013h.f30414a;
            if (z0Var != null) {
                if (intExtra < 0) {
                    intExtra = 0;
                }
                z2 = true;
                y72 = 0;
                i5 = 0;
                mraidActivity = this;
                a5 = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.A(new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.c(z0Var, null, intExtra, this, customUserEventBuilderService, g0A, dVar));
            } else {
                z2 = true;
                i5 = 0;
                y72 = 0;
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.D[] dArr = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.D[2];
            dArr[i5] = c10;
            dArr[z2 ? 1 : 0] = a5;
            qVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q(ff.m.s0(dArr), y72);
            interfaceC3103c = y72;
        } else {
            z2 = true;
            i5 = 0;
            interfaceC3103c = null;
            qVar = null;
        }
        if (qVar == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "MraidActivity", "can't display ad: mraid ad data is missing", null, false, 12, null);
            mraidActivity.finish();
            return;
        }
        tVar.f30450d = dVar;
        e0 e0Var = tVar.f30454h;
        mraidActivity.u((B) e0Var.getValue());
        int i11 = i5;
        Hf.Z z14 = new Hf.Z(e0Var, new C2010e(2, this, MraidActivity.class, "setOrientation", "setOrientation(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/mraid/MraidJsCommand$SetOrientationProperties;)V", 4, 0), i11);
        Kd.a aVar2 = this.f30372b;
        k0.u(z14, aVar2);
        k0.u(new Hf.Z(qVar.f31649i, new C2008c(this, interfaceC3103c), i11), aVar2);
        try {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q qVar2 = qVar;
            AbstractC2435c.a(this, new V.d(2083734656, z2, new C2009d(this, qVar2, tVar, fVar, pVar)));
            qVar2.a();
            this.f30374d = qVar2;
            this.f30375e = tVar;
        } catch (ClassNotFoundException e7) {
            B(e7);
        } catch (NoClassDefFoundError e10) {
            B(e10);
        }
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        S8.d dVar;
        super.onDestroy();
        if (!this.f30376f && (dVar = AbstractC2012g.f30408h) != null) {
            dVar.invoke();
        }
        S8.d dVar2 = AbstractC2012g.f30405e;
        if (dVar2 != null) {
            dVar2.invoke();
        }
        C2006a.b(this.f30375e);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q qVar = this.f30374d;
        if (qVar != null) {
            qVar.destroy();
        }
        this.f30374d = null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.o oVar = this.f30377g;
        if (oVar == null) {
            AbstractC3340k.m("storeInstallerImpl");
            throw null;
        }
        oVar.b();
        Ef.H.j(this.f30372b, null);
    }

    public final void u(B b5) {
        D d3;
        Integer num;
        if (b5 == null || (d3 = b5.f30338c) == null) {
            return;
        }
        int i5 = AbstractC2007b.f30390a[d3.ordinal()];
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
            setRequestedOrientation(num.intValue());
        }
    }
}
