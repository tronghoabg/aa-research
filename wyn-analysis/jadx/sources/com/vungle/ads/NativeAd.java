package com.vungle.ads;

import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.iab.omid.library.vungle.adsession.AdSession;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vungle.ads.internal.AnalyticsClient;
import com.vungle.ads.internal.h;
import com.vungle.ads.internal.m2;
import com.vungle.ads.internal.n2;
import com.vungle.ads.internal.network.p;
import com.vungle.ads.internal.platform.c;
import com.vungle.ads.internal.presenter.b;
import com.vungle.ads.internal.presenter.w;
import com.vungle.ads.internal.protos.Sdk;
import com.vungle.ads.internal.r1;
import com.vungle.ads.internal.s;
import com.vungle.ads.internal.signals.j;
import com.vungle.ads.internal.t1;
import com.vungle.ads.internal.ui.a0;
import com.vungle.ads.internal.ui.view.MediaView;
import com.vungle.ads.internal.ui.view.e;
import com.vungle.ads.internal.ui.view.l;
import com.vungle.ads.internal.util.t;
import com.vungle.ads.internal.util.u;
import com.vungle.ads.internal.util.y;
import com.vungle.ads.nativead.NativeVideoOptions;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3340k;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import r7.AbstractC3935e;

@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 @2\u00020\u0001:\u0002A@B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0010¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\rJ\u000f\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0014\u001a\u00020\u0004¢\u0006\u0004\b\u0014\u0010\rJ\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u0015¢\u0006\u0004\b!\u0010\u0017J7\u0010*\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\u001b2\b\u0010&\u001a\u0004\u0018\u00010%2\u000e\u0010)\u001a\n\u0012\u0004\u0012\u00020(\u0018\u00010'¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020\u001e¢\u0006\u0004\b,\u0010 R(\u00105\u001a\u00020-8\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b.\u0010/\u0012\u0004\b4\u0010 \u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u0010;\u001a\u0002068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0011\u0010?\u001a\u00020<8F¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006B"}, d2 = {"Lcom/vungle/ads/NativeAd;", "Lcom/vungle/ads/BaseAd;", "Landroid/content/Context;", "context", "", HandleInvocationsFromAdViewer.KEY_PLACEMENT_ID, "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "Lcom/vungle/ads/internal/r1;", "constructAdInternal$vungle_ads_release", "(Landroid/content/Context;)Lcom/vungle/ads/internal/r1;", "constructAdInternal", "getAppIcon", "()Ljava/lang/String;", "getAdTitle", "getAdBodyText", "getAdCallToActionText", "", "getAdStarRating", "()Ljava/lang/Double;", "getAdSponsoredText", "", "hasCallToAction", "()Z", "", "getMediaAspectRatio", "()F", "Lcom/vungle/ads/internal/ui/view/MediaView;", "getMediaView", "()Lcom/vungle/ads/internal/ui/view/MediaView;", "Lef/C;", "unregisterView", "()V", "hasVideoContent", "Landroid/widget/FrameLayout;", "rootView", "mediaView", "Landroid/widget/ImageView;", "adIconView", "", "Landroid/view/View;", "clickableViews", "registerViewForInteraction", "(Landroid/widget/FrameLayout;Lcom/vungle/ads/internal/ui/view/MediaView;Landroid/widget/ImageView;Ljava/util/Collection;)V", "performCTA", "", "x", "I", "getAdOptionsPosition", "()I", "setAdOptionsPosition", "(I)V", "getAdOptionsPosition$annotations", "adOptionsPosition", "Lcom/vungle/ads/internal/n2;", "A", "Lcom/vungle/ads/internal/n2;", "getNativeDisplayDurationMetric$vungle_ads_release", "()Lcom/vungle/ads/internal/n2;", "nativeDisplayDurationMetric", "Lcom/vungle/ads/nativead/NativeVideoOptions;", "getVideoOptions", "()Lcom/vungle/ads/nativead/NativeVideoOptions;", "videoOptions", "Companion", "AdOptionsPosition", "vungle-ads_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes5.dex */
public final class NativeAd extends BaseAd {
    public static final int BOTTOM_LEFT = 2;
    public static final int BOTTOM_RIGHT = 3;
    public static final int TOP_LEFT = 0;
    public static final int TOP_RIGHT = 1;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public final n2 nativeDisplayDurationMetric;

    /* renamed from: B, reason: collision with root package name */
    public final AtomicBoolean f32804B;

    /* renamed from: C, reason: collision with root package name */
    public final NativeAd$adPlayCallback$1 f32805C;

    /* renamed from: s, reason: collision with root package name */
    public ImageView f32806s;

    /* renamed from: t, reason: collision with root package name */
    public MediaView f32807t;

    /* renamed from: u, reason: collision with root package name */
    public FrameLayout f32808u;

    /* renamed from: v, reason: collision with root package name */
    public Collection f32809v;

    /* renamed from: w, reason: collision with root package name */
    public l f32810w;

    /* renamed from: x, reason: collision with root package name and from kotlin metadata */
    public int adOptionsPosition;

    /* renamed from: y, reason: collision with root package name */
    public final r1 f32812y;

    /* renamed from: z, reason: collision with root package name */
    public int f32813z;

    @Retention(RetentionPolicy.RUNTIME)
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\b\u0086\u0002\u0018\u00002\u00020\u0001B\u0000¨\u0006\u0002"}, d2 = {"Lcom/vungle/ads/NativeAd$AdOptionsPosition;", "", "vungle-ads_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public @interface AdOptionsPosition {
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [com.vungle.ads.NativeAd$adPlayCallback$1] */
    public NativeAd(Context context, String str, AdConfig adConfig) {
        super(context, str, adConfig);
        this.adOptionsPosition = 1;
        s adInternal$vungle_ads_release = getAdInternal$vungle_ads_release();
        AbstractC3340k.c(adInternal$vungle_ads_release, "null cannot be cast to non-null type com.vungle.ads.internal.NativeAdInternal");
        this.f32812y = (r1) adInternal$vungle_ads_release;
        this.nativeDisplayDurationMetric = new n2(Sdk.SDKMetric.SDKMetricType.NATIVE_AD_DISPLAY_DURATION);
        this.f32804B = new AtomicBoolean(false);
        this.f32805C = new b() { // from class: com.vungle.ads.NativeAd$adPlayCallback$1
            @Override // com.vungle.ads.internal.presenter.b
            public void onAdClick(@Nullable String id2) throws Throwable {
                Handler handler = y.f33878a;
                y.a(new NativeAd$adPlayCallback$1$onAdClick$1(this.f32814a));
                this.f32814a.getDisplayToClickMetric().d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                t1 displayToClickMetric = this.f32814a.getDisplayToClickMetric();
                analyticsClient.a(displayToClickMetric, this.f32814a.getLogEntry(), displayToClickMetric.f33018b);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdEnd(@Nullable String id2) throws Throwable {
                if (this.f32814a.getAdInternal$vungle_ads_release().i()) {
                    this.f32814a.getAdInternal$vungle_ads_release().a(h.f33010c);
                }
                Handler handler = y.f33878a;
                y.a(new NativeAd$adPlayCallback$1$onAdEnd$1(this.f32814a));
                this.f32814a.getShowToCloseMetric().d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                t1 showToCloseMetric = this.f32814a.getShowToCloseMetric();
                analyticsClient.a(showToCloseMetric, this.f32814a.getLogEntry(), showToCloseMetric.f33018b);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdImpression(@Nullable String id2) throws Throwable {
                this.f32814a.getAdInternal$vungle_ads_release().a(h.f33012e);
                Handler handler = y.f33878a;
                y.a(new NativeAd$adPlayCallback$1$onAdImpression$1(this.f32814a));
                this.f32814a.getPresentToDisplayMetric().d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                t1 presentToDisplayMetric = this.f32814a.getPresentToDisplayMetric();
                analyticsClient.a(presentToDisplayMetric, this.f32814a.getLogEntry(), presentToDisplayMetric.f33018b);
                this.f32814a.getDisplayToClickMetric().e();
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdLeftApplication(@Nullable String id2) throws Throwable {
                Handler handler = y.f33878a;
                y.a(new NativeAd$adPlayCallback$1$onAdLeftApplication$1(this.f32814a));
                AnalyticsClient.a(AnalyticsClient.INSTANCE, this.f32814a.getLeaveApplicationMetric(), this.f32814a.getLogEntry(), 4);
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdRewarded(@Nullable String id2) {
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onAdStart(@Nullable String id2) throws Throwable {
                this.f32814a.getAdInternal$vungle_ads_release().a(h.f33011d);
                j signalManager$vungle_ads_release = this.f32814a.getSignalManager$vungle_ads_release();
                synchronized (signalManager$vungle_ads_release) {
                    signalManager$vungle_ads_release.f33664h.f33645f++;
                }
                this.f32814a.getAdInternal$vungle_ads_release().f33624l.d();
                AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
                t1 t1Var = this.f32814a.getAdInternal$vungle_ads_release().f33624l;
                analyticsClient.a(t1Var, this.f32814a.getLogEntry(), t1Var.f33018b);
                this.f32814a.getPresentToDisplayMetric().e();
                Handler handler = y.f33878a;
                y.a(new NativeAd$adPlayCallback$1$onAdStart$1(this.f32814a));
            }

            @Override // com.vungle.ads.internal.presenter.b
            public void onFailure(@NotNull VungleError error) throws Throwable {
                AbstractC3340k.e(error, "error");
                this.f32814a.getAdInternal$vungle_ads_release().a(h.f33014g);
                Handler handler = y.f33878a;
                y.a(new NativeAd$adPlayCallback$1$onFailure$1(this.f32814a, error));
                this.f32814a.getShowToFailMetric().d();
                AnalyticsClient.INSTANCE.a(this.f32814a.getShowToFailMetric(), this.f32814a.getLogEntry(), error.getCode() + '-' + error.getErrorMessage());
            }
        };
    }

    public static final void a(NativeAd this$0, View view) {
        AbstractC3340k.e(this$0, "this$0");
        this$0.f32812y.v();
    }

    public static final void b(NativeAd this$0, View view) {
        AbstractC3340k.e(this$0, "this$0");
        this$0.f32812y.w();
    }

    @AdOptionsPosition
    public static /* synthetic */ void getAdOptionsPosition$annotations() {
    }

    @NotNull
    public final String getAdBodyText() {
        String str;
        LinkedHashMap linkedHashMap = this.f32812y.f33606u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("APP_DESCRIPTION")) == null) ? "" : str;
    }

    @NotNull
    public final String getAdCallToActionText() {
        String str;
        LinkedHashMap linkedHashMap = this.f32812y.f33606u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("CTA_BUTTON_TEXT")) == null) ? "" : str;
    }

    public final int getAdOptionsPosition() {
        return this.adOptionsPosition;
    }

    @NotNull
    public final String getAdSponsoredText() {
        String str;
        LinkedHashMap linkedHashMap = this.f32812y.f33606u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("SPONSORED_BY")) == null) ? "" : str;
    }

    @Nullable
    public final Double getAdStarRating() {
        return this.f32812y.m();
    }

    @NotNull
    public final String getAdTitle() {
        String str;
        LinkedHashMap linkedHashMap = this.f32812y.f33606u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("APP_NAME")) == null) ? "" : str;
    }

    @NotNull
    public final String getAppIcon() {
        String str;
        LinkedHashMap linkedHashMap = this.f32812y.f33606u;
        return (linkedHashMap == null || (str = (String) linkedHashMap.get("APP_ICON")) == null) ? "" : str;
    }

    public final float getMediaAspectRatio() {
        return this.f32812y.f33609x;
    }

    @Nullable
    /* renamed from: getMediaView, reason: from getter */
    public final MediaView getF32807t() {
        return this.f32807t;
    }

    @NotNull
    /* renamed from: getNativeDisplayDurationMetric$vungle_ads_release, reason: from getter */
    public final n2 getNativeDisplayDurationMetric() {
        return this.nativeDisplayDurationMetric;
    }

    @NotNull
    public final NativeVideoOptions getVideoOptions() {
        return this.f32812y.r();
    }

    public final boolean hasCallToAction() {
        String str;
        LinkedHashMap linkedHashMap = this.f32812y.f33606u;
        if (linkedHashMap == null || (str = (String) linkedHashMap.get("CTA_BUTTON_URL")) == null) {
            str = "";
        }
        return str.length() > 0;
    }

    public final boolean hasVideoContent() {
        return this.f32812y.s();
    }

    public final void performCTA() {
        String str;
        r1 r1Var = this.f32812y;
        w wVar = r1Var.f33605t;
        if (wVar != null) {
            LinkedHashMap linkedHashMap = r1Var.f33606u;
            if (linkedHashMap == null || (str = (String) linkedHashMap.get("CTA_BUTTON_URL")) == null) {
                str = "";
            }
            wVar.a("download", (String) null, str);
        }
    }

    public final void registerViewForInteraction(@NotNull FrameLayout rootView, @NotNull MediaView mediaView, @Nullable ImageView adIconView, @Nullable Collection<? extends View> clickableViews) throws Throwable {
        final int i5 = 0;
        AbstractC3340k.e(rootView, "rootView");
        AbstractC3340k.e(mediaView, "mediaView");
        boolean z2 = u.f33874a;
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("registerViewForInteraction ");
        sbA.append(hashCode());
        t.c("NativeAd", sbA.toString());
        AnalyticsClient analyticsClient = AnalyticsClient.INSTANCE;
        AnalyticsClient.a(analyticsClient, new m2(Sdk.SDKMetric.SDKMetricType.PLAY_AD_API), getLogEntry(), 4);
        final int i10 = 1;
        this.f32813z++;
        this.nativeDisplayDurationMetric.e();
        getResponseToShowMetric().d();
        AnalyticsClient.a(analyticsClient, getResponseToShowMetric(), getLogEntry());
        getAdInternal$vungle_ads_release().g().e();
        getShowToFailMetric().e();
        getShowToCloseMetric().e();
        if (getAdInternal$vungle_ads_release().i()) {
            if (AbstractC3340k.a(this.f32808u, rootView)) {
                t.a("NativeAd", "no-op when re-play it on the same root view");
                return;
            }
            unregisterView();
        }
        this.f32804B.set(false);
        VungleError vungleErrorA = getAdInternal$vungle_ads_release().a(true);
        if (vungleErrorA != null) {
            StringBuilder sbA2 = com.iab.omid.library.vungle.internal.l.a("registerViewForInteraction can NOT play. ");
            sbA2.append(hashCode());
            sbA2.append(' ');
            sbA2.append(vungleErrorA);
            t.c("NativeAd", sbA2.toString());
            if (getAdInternal$vungle_ads_release().a(vungleErrorA.getCode())) {
                getAdInternal$vungle_ads_release().a(h.f33014g);
            }
            BaseAdListener adListener = getAdListener();
            if (adListener != null) {
                adListener.onAdFailedToPlay(this, vungleErrorA);
                return;
            }
            return;
        }
        this.f32808u = rootView;
        this.f32807t = mediaView;
        this.f32806s = adIconView;
        this.f32809v = clickableViews;
        this.f32812y.a(rootView, this.f32805C);
        if (this.f32810w == null) {
            this.f32810w = new l(getContext());
        }
        l lVar = this.f32810w;
        if (lVar != null) {
            lVar.setOnClickListener(new View.OnClickListener(this) { // from class: com.vungle.ads.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ NativeAd f32873b;

                {
                    this.f32873b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            NativeAd.a(this.f32873b, view);
                            break;
                        default:
                            NativeAd.b(this.f32873b, view);
                            break;
                    }
                }
            });
        }
        if (clickableViews == null) {
            clickableViews = AbstractC3935e.C(mediaView);
        }
        Iterator<T> it = clickableViews.iterator();
        while (it.hasNext()) {
            ((View) it.next()).setOnClickListener(new View.OnClickListener(this) { // from class: com.vungle.ads.a

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ NativeAd f32873b;

                {
                    this.f32873b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            NativeAd.a(this.f32873b, view);
                            break;
                        default:
                            NativeAd.b(this.f32873b, view);
                            break;
                    }
                }
            });
        }
        l lVar2 = this.f32810w;
        if (lVar2 != null) {
            lVar2.a(rootView, this.adOptionsPosition);
        }
        this.f32812y.a(mediaView);
        mediaView.a(this.f32812y);
        this.f32812y.a(adIconView);
        r1 r1Var = this.f32812y;
        l lVar3 = this.f32810w;
        r1Var.c(lVar3 != null ? lVar3.getPrivacyIcon$vungle_ads_release() : null);
        this.f32812y.a(rootView, getAdConfig().getWatermark$vungle_ads_release());
        getAdInternal$vungle_ads_release().g().d();
        AnalyticsClient.a(AnalyticsClient.INSTANCE, getAdInternal$vungle_ads_release().g(), getLogEntry());
        getAdInternal$vungle_ads_release().h().e();
    }

    public final void setAdOptionsPosition(int i5) {
        this.adOptionsPosition = i5;
    }

    public final void unregisterView() throws Throwable {
        boolean z2 = u.f33874a;
        StringBuilder sbA = com.iab.omid.library.vungle.internal.l.a("unregisterView  ");
        sbA.append(hashCode());
        t.c("NativeAd", sbA.toString());
        if (this.f32804B.getAndSet(true)) {
            return;
        }
        this.nativeDisplayDurationMetric.d();
        this.nativeDisplayDurationMetric.f33018b = String.valueOf(this.f32813z);
        AnalyticsClient.a(AnalyticsClient.INSTANCE, this.nativeDisplayDurationMetric, getLogEntry(), 4);
        Collection collection = this.f32809v;
        if (collection != null) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                ((View) it.next()).setOnClickListener(null);
            }
        }
        this.f32809v = null;
        this.f32808u = null;
        MediaView mediaView = this.f32807t;
        if (mediaView != null) {
            mediaView.setOnClickListener(null);
            mediaView.setOnTouchListener(null);
            mediaView.removeAllViews();
            e eVar = mediaView.f33753b;
            if (eVar != null) {
                eVar.a();
            }
            mediaView.f33753b = null;
        }
        this.f32807t = null;
        l lVar = this.f32810w;
        if (lVar != null) {
            lVar.a();
        }
        this.f32810w = null;
        r1 r1Var = this.f32812y;
        a0 a0Var = r1Var.f33611z;
        if (a0Var != null) {
            ViewParent parent = a0Var.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(a0Var);
            }
        }
        r1Var.f33611z = null;
        r1Var.n().a();
        w wVar = r1Var.f33605t;
        if (wVar != null) {
            com.vungle.ads.internal.omsdk.b bVar = wVar.f33581n;
            if (bVar != null) {
                AdSession adSession = bVar.f33461b;
                if (adSession != null) {
                    adSession.finish();
                }
                bVar.f33461b = null;
                bVar.f33462c = null;
                bVar.f33463d = null;
            }
            AlertDialog alertDialog = wVar.f33576h;
            if (alertDialog != null && alertDialog.isShowing()) {
                alertDialog.dismiss();
            }
            Long l10 = wVar.f33573e;
            if (l10 != null) {
                List listB = wVar.f33571c.b("ad.close", String.valueOf(System.currentTimeMillis() - l10.longValue()), String.valueOf(((c) wVar.f33572d).k()));
                if (listB != null) {
                    Iterator it2 = listB.iterator();
                    while (it2.hasNext()) {
                        p pVar = new p((String) it2.next());
                        pVar.f33431i = "ad.close";
                        pVar.f33432j = wVar.a();
                        wVar.b().a(pVar.a(), false);
                    }
                }
            }
            com.vungle.ads.internal.presenter.a aVar = wVar.f33574f;
            if (aVar != null) {
                aVar.a("end", null, ((r1) wVar.f33570b).q());
            }
        }
        try {
            ImageView imageView = this.f32806s;
            Drawable drawable = imageView != null ? imageView.getDrawable() : null;
            if (drawable instanceof BitmapDrawable) {
                Bitmap bitmap = ((BitmapDrawable) drawable).getBitmap();
                if (!bitmap.isRecycled()) {
                    bitmap.recycle();
                }
            }
        } catch (Exception e7) {
            boolean z10 = u.f33874a;
            StringBuilder sbA2 = com.iab.omid.library.vungle.internal.l.a("error msg: ");
            sbA2.append(e7.getLocalizedMessage());
            t.c("NativeAd", sbA2.toString());
        }
        ImageView imageView2 = this.f32806s;
        if (imageView2 != null) {
            imageView2.setImageDrawable(null);
        }
        this.f32806s = null;
    }

    @Override // com.vungle.ads.BaseAd
    @NotNull
    public r1 constructAdInternal$vungle_ads_release(@NotNull Context context) {
        AbstractC3340k.e(context, "context");
        return new r1(context);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public NativeAd(@NotNull Context context, @NotNull String placementId) {
        this(context, placementId, new AdConfig());
        AbstractC3340k.e(context, "context");
        AbstractC3340k.e(placementId, "placementId");
    }
}
