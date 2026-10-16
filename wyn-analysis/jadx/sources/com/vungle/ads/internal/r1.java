package com.vungle.ads.internal;

import android.content.Context;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import com.vungle.ads.AdNotLoadedCantPlay;
import com.vungle.ads.InvalidAdStateError;
import com.vungle.ads.NativeAd$adPlayCallback$1;
import com.vungle.ads.VungleAdSize;
import com.vungle.ads.VungleError;
import com.vungle.ads.internal.model.i3;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.nativead.NativeVideoOptions;
import ef.C2515C;
import ef.C2530n;
import ef.EnumC2526j;
import ef.InterfaceC2525i;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.AbstractC3340k;

/* loaded from: classes5.dex */
public final class r1 extends s implements com.vungle.ads.internal.presenter.x {

    /* renamed from: A, reason: collision with root package name */
    public final View.OnTouchListener f33601A;

    /* renamed from: q, reason: collision with root package name */
    public final InterfaceC2525i f33602q;

    /* renamed from: r, reason: collision with root package name */
    public final AtomicBoolean f33603r;

    /* renamed from: s, reason: collision with root package name */
    public final InterfaceC2525i f33604s;

    /* renamed from: t, reason: collision with root package name */
    public com.vungle.ads.internal.presenter.w f33605t;

    /* renamed from: u, reason: collision with root package name */
    public LinkedHashMap f33606u;

    /* renamed from: v, reason: collision with root package name */
    public final InterfaceC2525i f33607v;

    /* renamed from: w, reason: collision with root package name */
    public final InterfaceC2525i f33608w;

    /* renamed from: x, reason: collision with root package name */
    public float f33609x;

    /* renamed from: y, reason: collision with root package name */
    public final InterfaceC2525i f33610y;

    /* renamed from: z, reason: collision with root package name */
    public com.vungle.ads.internal.ui.a0 f33611z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r1(Context context) {
        super(context);
        AbstractC3340k.e(context, "context");
        this.f33602q = Fe.c.z(new l1(context));
        this.f33603r = new AtomicBoolean(false);
        EnumC2526j enumC2526j = EnumC2526j.f34667a;
        this.f33604s = Fe.c.y(enumC2526j, new o1(context));
        this.f33607v = Fe.c.y(enumC2526j, new p1(context));
        this.f33608w = Fe.c.z(new k1(this));
        this.f33610y = Fe.c.z(q1.f33596a);
        this.f33601A = new Lb.g(this, 4);
    }

    @Override // com.vungle.ads.internal.s
    public final boolean a(VungleAdSize vungleAdSize) {
        return true;
    }

    @Override // com.vungle.ads.internal.s
    public final VungleAdSize b() {
        return null;
    }

    public final void c(ImageView imageView) {
        String str;
        LinkedHashMap linkedHashMap = this.f33606u;
        if (linkedHashMap == null || (str = (String) linkedHashMap.get("VUNGLE_PRIVACY_ICON_URL")) == null) {
            str = "";
        }
        ((com.vungle.ads.internal.util.p) this.f33608w.getValue()).a(str, new j1(imageView));
    }

    @Override // com.vungle.ads.internal.s
    public final InvalidAdStateError j() {
        if (this.f33615b == h.f33010c || i()) {
            return null;
        }
        return new InvalidAdStateError(Sdk.SDKError.Reason.AD_NOT_LOADED, this.f33615b + " can not play native ad.");
    }

    public final Double m() {
        String str;
        LinkedHashMap linkedHashMap = this.f33606u;
        if (linkedHashMap == null || (str = (String) linkedHashMap.get("APP_RATING_VALUE")) == null) {
            return null;
        }
        return Bf.q.Y(str);
    }

    public final f1 n() {
        return (f1) this.f33602q.getValue();
    }

    public final String o() {
        String str;
        LinkedHashMap linkedHashMap = this.f33606u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("MAIN_VIDEO")) == null) ? "" : str;
    }

    public final String p() {
        String str;
        LinkedHashMap linkedHashMap = this.f33606u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("ORIGINAL_VIDEO_URL")) == null) ? "" : str;
    }

    public final String q() {
        i3 i3Var = this.f33617d;
        if (i3Var != null) {
            return i3Var.f33227a;
        }
        return null;
    }

    public final NativeVideoOptions r() {
        return (NativeVideoOptions) this.f33610y.getValue();
    }

    public final boolean s() {
        return o().length() > 0;
    }

    public final boolean t() {
        return s();
    }

    public final boolean u() {
        boolean zBooleanValue;
        String str;
        Boolean boolU0;
        if (!((com.vungle.ads.internal.platform.c) ((com.vungle.ads.internal.platform.f) this.f33604s.getValue())).o()) {
            Boolean startMuted = r().getStartMuted();
            if (startMuted != null) {
                zBooleanValue = startMuted.booleanValue();
            } else {
                LinkedHashMap linkedHashMap = this.f33606u;
                zBooleanValue = (linkedHashMap == null || (str = (String) linkedHashMap.get("START_MUTED")) == null || (boolU0 = Bf.k.U0(str)) == null) ? true : boolU0.booleanValue();
            }
            if (!zBooleanValue) {
                return false;
            }
        }
        return true;
    }

    public final void v() {
        String str;
        com.vungle.ads.internal.presenter.w wVar = this.f33605t;
        if (wVar != null) {
            LinkedHashMap linkedHashMap = this.f33606u;
            if (linkedHashMap == null || (str = (String) linkedHashMap.get("VUNGLE_PRIVACY_URL")) == null) {
                str = "";
            }
            wVar.a("openPrivacy", (String) null, str);
        }
    }

    public final void w() {
        String str;
        a(8, (Map) null);
        com.vungle.ads.internal.presenter.w wVar = this.f33605t;
        if (wVar != null) {
            LinkedHashMap linkedHashMap = this.f33606u;
            if (linkedHashMap == null || (str = (String) linkedHashMap.get("CTA_BUTTON_URL")) == null) {
                str = "";
            }
            wVar.a("download", (String) null, str);
        }
    }

    public final void a(String str) {
        com.vungle.ads.internal.presenter.w wVar = this.f33605t;
        if (wVar != null) {
            wVar.a("tpat", "video.length", str);
        }
    }

    public final void b(ImageView imageView) {
        String str;
        LinkedHashMap linkedHashMap = this.f33606u;
        if (linkedHashMap == null || (str = (String) linkedHashMap.get("MAIN_IMAGE")) == null) {
            str = "";
        }
        ((com.vungle.ads.internal.util.p) this.f33608w.getValue()).a(str, new j1(imageView));
    }

    public static final com.vungle.ads.internal.executor.a a(r1 r1Var) {
        return (com.vungle.ads.internal.executor.a) r1Var.f33607v.getValue();
    }

    public static final boolean a(r1 this$0, View view, MotionEvent motionEvent) {
        AbstractC3340k.e(this$0, "this$0");
        com.vungle.ads.internal.presenter.w wVar = this$0.f33605t;
        if (wVar == null) {
            return false;
        }
        wVar.a(motionEvent);
        return false;
    }

    @Override // com.vungle.ads.internal.s
    public final void b(com.vungle.ads.internal.model.h0 advertisement) {
        String str;
        Throwable thA;
        Integer numL0;
        Integer numL02;
        Object objZ = C2515C.f34653a;
        AbstractC3340k.e(advertisement, "advertisement");
        this.f33606u = advertisement.s();
        com.vungle.ads.internal.util.s sVarE = e();
        Long lA = sVarE != null ? sVarE.a() : null;
        if ((lA != null && lA.longValue() == 3) || (lA != null && lA.longValue() == 4)) {
            l();
        }
        if (s()) {
            MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
            try {
                Context contextD = d();
                Uri uri = Uri.parse(o());
                AbstractC3340k.d(uri, "parse(this)");
                mediaMetadataRetriever.setDataSource(contextD, uri);
                String strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                int iIntValue = 0;
                int iIntValue2 = (strExtractMetadata == null || (numL02 = Bf.r.l0(strExtractMetadata)) == null) ? 0 : numL02.intValue();
                String strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                if (strExtractMetadata2 != null && (numL0 = Bf.r.l0(strExtractMetadata2)) != null) {
                    iIntValue = numL0.intValue();
                }
                if (iIntValue2 > 0 && iIntValue > 0) {
                    this.f33609x = iIntValue2 / iIntValue;
                }
                try {
                    mediaMetadataRetriever.release();
                } catch (Throwable th) {
                    objZ = Fe.e.z(th);
                }
                thA = C2530n.a(objZ);
                if (thA == null) {
                    return;
                }
            } catch (Throwable th2) {
                try {
                    boolean z2 = com.vungle.ads.internal.util.u.f33874a;
                    com.vungle.ads.internal.util.t.b("NativeAd", "Failed to retrieve video metadata: " + th2.getLocalizedMessage());
                    try {
                        mediaMetadataRetriever.release();
                    } catch (Throwable th3) {
                        objZ = Fe.e.z(th3);
                    }
                    thA = C2530n.a(objZ);
                    if (thA == null) {
                        return;
                    }
                } finally {
                }
            }
            boolean z10 = com.vungle.ads.internal.util.u.f33874a;
            com.vungle.ads.internal.util.t.a("NativeAdInternal", "Failed to release metadata retriever", thA);
            return;
        }
        com.vungle.ads.internal.util.p pVar = (com.vungle.ads.internal.util.p) this.f33608w.getValue();
        LinkedHashMap linkedHashMap = this.f33606u;
        if (linkedHashMap == null || (str = (String) linkedHashMap.get("MAIN_IMAGE")) == null) {
            str = "";
        }
        n1 n1Var = new n1(this);
        pVar.getClass();
        com.vungle.ads.internal.util.p.a(str, n1Var);
    }

    @Override // com.vungle.ads.internal.s
    public final boolean a(i3 placement) {
        AbstractC3340k.e(placement, "placement");
        return placement.i();
    }

    public final void a(ImageView imageView) {
        String str;
        LinkedHashMap linkedHashMap = this.f33606u;
        if (linkedHashMap == null || (str = (String) linkedHashMap.get("APP_ICON")) == null) {
            str = "";
        }
        ((com.vungle.ads.internal.util.p) this.f33608w.getValue()).a(str, new j1(imageView));
    }

    public final void a(int i5, Map map) {
        com.vungle.ads.internal.presenter.w wVar = this.f33605t;
        if (wVar != null) {
            wVar.a(i5, map);
        }
    }

    public static void a(r1 r1Var, String event) {
        r1Var.getClass();
        AbstractC3340k.e(event, "event");
        com.vungle.ads.internal.presenter.w wVar = r1Var.f33605t;
        if (wVar != null) {
            wVar.a("tpat", event, (String) null);
        }
    }

    public final void a(ViewGroup rootView, String str) {
        AbstractC3340k.e(rootView, "rootView");
        if (str == null) {
            return;
        }
        if (this.f33611z == null) {
            Context context = rootView.getContext();
            AbstractC3340k.d(context, "rootView.context");
            this.f33611z = new com.vungle.ads.internal.ui.a0(context, str);
        }
        com.vungle.ads.internal.ui.a0 a0Var = this.f33611z;
        if (a0Var == null || AbstractC3340k.a(a0Var.getParent(), rootView)) {
            return;
        }
        ViewParent parent = a0Var.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(a0Var);
        }
        rootView.addView(a0Var);
        a0Var.bringToFront();
    }

    public final void a(View rootView, NativeAd$adPlayCallback$1 nativeAd$adPlayCallback$1) {
        String str;
        AbstractC3340k.e(rootView, "rootView");
        com.vungle.ads.internal.model.h0 h0VarC = c();
        if (h0VarC == null) {
            VungleError vungleErrorLogError$vungle_ads_release = new AdNotLoadedCantPlay("Ad is null").setLogEntry$vungle_ads_release(e()).logError$vungle_ads_release();
            if (nativeAd$adPlayCallback$1 != null) {
                nativeAd$adPlayCallback$1.onFailure(vungleErrorLogError$vungle_ads_release);
                return;
            }
            return;
        }
        if (this.f33605t == null) {
            com.vungle.ads.internal.presenter.w wVar = new com.vungle.ads.internal.presenter.w(d(), this, h0VarC, (com.vungle.ads.internal.platform.f) this.f33604s.getValue());
            this.f33605t = wVar;
            wVar.a(new com.vungle.ads.internal.presenter.a(nativeAd$adPlayCallback$1, f()));
        }
        com.vungle.ads.internal.presenter.w wVar2 = this.f33605t;
        if (wVar2 != null) {
            LinkedHashMap linkedHashMap = this.f33606u;
            if (linkedHashMap == null || (str = (String) linkedHashMap.get("OM_SDK_DATA")) == null) {
                str = "";
            }
            wVar2.a(rootView, str);
        }
        n().a(rootView, new m1(this));
        com.vungle.ads.internal.presenter.w wVar3 = this.f33605t;
        if (wVar3 != null) {
            wVar3.c();
        }
    }

    public final void a(View view) {
        AbstractC3340k.e(view, "view");
        com.vungle.ads.internal.model.h0 h0VarC = c();
        if (h0VarC == null || !h0VarC.z()) {
            return;
        }
        view.setOnTouchListener(this.f33601A);
    }
}
