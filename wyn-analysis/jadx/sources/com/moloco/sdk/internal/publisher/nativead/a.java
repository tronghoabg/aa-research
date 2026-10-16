package com.moloco.sdk.internal.publisher.nativead;

import Af.r;
import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.moloco.sdk.internal.C1880b;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.NativeAd;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.G0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.S;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.C2047h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.s;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.C2097a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.q;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v;

/* loaded from: classes4.dex */
public final class a implements NativeAd.Assets {

    /* renamed from: a, reason: collision with root package name */
    public final Context f29100a;

    /* renamed from: b, reason: collision with root package name */
    public final S f29101b;

    /* renamed from: c, reason: collision with root package name */
    public final C1880b f29102c;

    /* renamed from: d, reason: collision with root package name */
    public final v f29103d;

    /* renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.internal.d f29104e;

    /* renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.c f29105f;

    /* renamed from: g, reason: collision with root package name */
    public S8.d f29106g;

    /* renamed from: h, reason: collision with root package name */
    public com.moloco.sdk.internal.publisher.nativead.model.n f29107h;

    /* renamed from: i, reason: collision with root package name */
    public final Uri f29108i;

    /* renamed from: j, reason: collision with root package name */
    public A6.i f29109j;
    public com.moloco.sdk.internal.publisher.nativead.ui.g k;

    public a(Context context, S s10, C1880b c1880b, v vVar, com.moloco.sdk.internal.d dVar, com.moloco.sdk.acm.recorder.c cVar) {
        this.f29100a = context;
        this.f29101b = s10;
        this.f29102c = c1880b;
        this.f29103d = vVar;
        this.f29104e = dVar;
        this.f29105f = cVar;
        com.moloco.sdk.internal.publisher.nativead.model.n nVar = this.f29107h;
        this.f29108i = nVar != null ? nVar.b(1) : null;
    }

    public static void a(ViewGroup viewGroup) {
        ViewParent parent = viewGroup.getParent();
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup2 != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Detaching view " + viewGroup.getClass().getSimpleName() + " from parent " + viewGroup2.getClass().getSimpleName(), null, false, 12, null);
            viewGroup2.removeView(viewGroup);
        }
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public final String getCallToActionText() {
        com.moloco.sdk.internal.publisher.nativead.model.n nVar = this.f29107h;
        if (nVar != null) {
            return nVar.a(7);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public final String getDescription() {
        com.moloco.sdk.internal.publisher.nativead.model.n nVar = this.f29107h;
        if (nVar != null) {
            return nVar.a(5);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public final Uri getIconUri() {
        com.moloco.sdk.internal.publisher.nativead.model.n nVar = this.f29107h;
        if (nVar != null) {
            return nVar.b(0);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public final Uri getMainImageUri() {
        return this.f29108i;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public final View getMediaView() {
        Uri uriB;
        com.moloco.sdk.internal.publisher.nativead.ui.g gVar = this.k;
        if (gVar != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Using cached video view", null, false, 12, null);
            a(gVar);
            return gVar;
        }
        com.moloco.sdk.internal.publisher.nativead.model.n nVar = this.f29107h;
        Context context = this.f29100a;
        v vVar = this.f29103d;
        if (nVar != null) {
            com.moloco.sdk.internal.publisher.nativead.model.l lVar = (com.moloco.sdk.internal.publisher.nativead.model.l) nVar.f29200d.get(2);
            C2097a c2097a = lVar != null ? lVar.f29195b : null;
            if (c2097a != null) {
                try {
                    q qVar = (q) this.f29104e.invoke(c2097a);
                    qVar.a();
                    com.moloco.sdk.internal.publisher.nativead.ui.g gVar2 = new com.moloco.sdk.internal.publisher.nativead.ui.g(context, qVar, this.f29101b, this.f29102c, vVar, this.f29106g);
                    this.k = gVar2;
                    return gVar2;
                } catch (NoClassDefFoundError e7) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Compose dependency not available for native video rendering, falling back to image", e7, false, 8, null);
                    com.moloco.sdk.internal.client_metrics_data.a[] aVarArr = com.moloco.sdk.internal.client_metrics_data.a.f28494b;
                    this.f29105f.a(new com.moloco.sdk.acm.h("native_ad_compose_not_available"));
                }
            }
        }
        A6.i iVar = this.f29109j;
        if (iVar != null) {
            MolocoLogger.info$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Using cached image view", null, false, 12, null);
            a(iVar);
            return iVar;
        }
        com.moloco.sdk.internal.publisher.nativead.model.n nVar2 = this.f29107h;
        if (nVar2 == null || (uriB = nVar2.b(1)) == null) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "NativeAdAssetsProvider", "Missing video and image asset", new Exception(), false, 8, null);
            return null;
        }
        S8.d dVar = this.f29106g;
        G0 g0A = com.moloco.sdk.service_locator.i.a();
        s sVar = new s();
        A6.i iVar2 = new A6.i(context);
        ImageView imageView = new ImageView(context);
        imageView.setImageURI(uriB);
        imageView.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        imageView.setOnClickListener(new Lb.h(dVar, 3));
        C2047h c2047h = new C2047h(g0A, context);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(20);
        c2047h.setPadding(16, 0, 0, 16);
        c2047h.setOnButtonRenderedListener(new r(sVar, 16));
        c2047h.setLayoutParams(layoutParams);
        vVar.b(imageView);
        iVar2.addView(imageView);
        iVar2.addView(c2047h);
        this.f29109j = iVar2;
        return iVar2;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public final Float getRating() {
        String strA;
        com.moloco.sdk.internal.publisher.nativead.model.n nVar = this.f29107h;
        if (nVar == null || (strA = nVar.a(6)) == null) {
            return null;
        }
        try {
            if (Bf.q.X(strA)) {
                return Float.valueOf(Float.parseFloat(strA));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public final String getSponsorText() {
        com.moloco.sdk.internal.publisher.nativead.model.n nVar = this.f29107h;
        if (nVar != null) {
            return nVar.a(4);
        }
        return null;
    }

    @Override // com.moloco.sdk.publisher.NativeAd.Assets
    public final String getTitle() {
        com.moloco.sdk.internal.publisher.nativead.model.k kVar;
        com.moloco.sdk.internal.publisher.nativead.model.n nVar = this.f29107h;
        if (nVar == null || (kVar = (com.moloco.sdk.internal.publisher.nativead.model.k) nVar.f29199c.get(3)) == null) {
            return null;
        }
        return kVar.f29194b;
    }
}
