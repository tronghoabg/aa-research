package com.applovin.impl;

import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.C1649m;
import com.applovin.impl.C1670w;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.List;

/* renamed from: com.applovin.impl.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractActivityC1647l extends n3 implements AdControlButton.a, MaxRewardedAdListener, MaxAdViewAdListener, MaxAdRevenueListener, C1670w.a {

    /* renamed from: a, reason: collision with root package name */
    private com.applovin.impl.sdk.k f21825a;

    /* renamed from: b, reason: collision with root package name */
    private C1651n f21826b;

    /* renamed from: c, reason: collision with root package name */
    private j8 f21827c;

    /* renamed from: d, reason: collision with root package name */
    private C1649m f21828d;

    /* renamed from: e, reason: collision with root package name */
    private MaxAdView f21829e;

    /* renamed from: f, reason: collision with root package name */
    private MaxInterstitialAd f21830f;

    /* renamed from: g, reason: collision with root package name */
    private MaxAppOpenAd f21831g;

    /* renamed from: h, reason: collision with root package name */
    private MaxRewardedAd f21832h;

    /* renamed from: i, reason: collision with root package name */
    private MaxNativeAdView f21833i;

    /* renamed from: j, reason: collision with root package name */
    private MaxNativeAdLoader f21834j;
    private MaxAd k;

    /* renamed from: l, reason: collision with root package name */
    private r f21835l;

    /* renamed from: m, reason: collision with root package name */
    private List f21836m;

    /* renamed from: n, reason: collision with root package name */
    private ListView f21837n;

    /* renamed from: o, reason: collision with root package name */
    private View f21838o;

    /* renamed from: p, reason: collision with root package name */
    private AdControlButton f21839p;

    /* renamed from: q, reason: collision with root package name */
    private TextView f21840q;

    /* renamed from: r, reason: collision with root package name */
    private C1670w f21841r;

    /* renamed from: com.applovin.impl.l$a */
    public class a extends MaxNativeAdListener {
        public a() {
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            AbstractActivityC1647l.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            AbstractActivityC1647l.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (AbstractActivityC1647l.this.k != null) {
                AbstractActivityC1647l.this.f21834j.destroy(AbstractActivityC1647l.this.k);
            }
            AbstractActivityC1647l.this.k = maxAd;
            AbstractActivityC1647l.this.f21834j.render(AbstractActivityC1647l.this.f21833i, maxAd);
            AbstractActivityC1647l.this.onAdLoaded(maxAd);
        }
    }

    @Override // com.applovin.impl.n3
    public com.applovin.impl.sdk.k getSdk() {
        return this.f21825a;
    }

    public void initialize(C1651n c1651n, C1653o c1653o, j8 j8Var, com.applovin.impl.sdk.k kVar) {
        List listA;
        this.f21825a = kVar;
        this.f21826b = c1651n;
        this.f21827c = j8Var;
        this.f21836m = kVar.t0().b();
        C1649m c1649m = new C1649m(c1651n, c1653o, j8Var, this);
        this.f21828d = c1649m;
        c1649m.a(new Y(this, kVar, c1651n, c1653o));
        b();
        if (c1651n.f().f()) {
            if ((j8Var != null && !j8Var.b().d().D()) || (listA = kVar.U().a(c1651n.c())) == null || listA.isEmpty()) {
                return;
            }
            this.f21841r = new C1670w(listA, c1651n.a(), getApplicationContext(), this);
        }
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdClicked(MaxAd maxAd) {
        o7.a("onAdClicked", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdCollapsed(MaxAd maxAd) {
        o7.a("onAdCollapsed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.f21839p.setControlState(AdControlButton.b.LOAD);
        this.f21840q.setText("");
        o7.a("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdDisplayed(MaxAd maxAd) {
        o7.a("onAdDisplayed", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdViewAdListener
    public void onAdExpanded(MaxAd maxAd) {
        o7.a("onAdExpanded", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdHidden(MaxAd maxAd) {
        o7.a("onAdHidden", maxAd, this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoadFailed(String str, MaxError maxError) {
        this.f21839p.setControlState(AdControlButton.b.LOAD);
        this.f21840q.setText("");
        if (204 == maxError.getCode()) {
            o7.a("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", this);
            return;
        }
        o7.a("", "Failed to load with error code: " + maxError.getCode(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        this.f21840q.setText(maxAd.getNetworkName() + " ad loaded");
        this.f21839p.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f21829e, maxAd.getFormat().getSize());
        } else if (MaxAdFormat.NATIVE == this.f21826b.a()) {
            a(this.f21833i, MaxAdFormat.MREC.getSize());
        }
    }

    @Override // com.applovin.impl.C1670w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f21829e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f21830f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f21831g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f21832h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f21834j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        o7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        if (this.f21825a.t0().c()) {
            o7.a("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", this);
            return;
        }
        if (this.f21828d.j() != this.f21826b.f()) {
            o7.a("Not Supported", "You cannot load an ad from this waterfall because it does not target the current device. To load an ad, please select the targeted waterfall.", this);
            return;
        }
        MaxAdFormat maxAdFormatA = this.f21826b.a();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            C1670w c1670w = this.f21841r;
            if (c1670w != null) {
                c1670w.a();
                return;
            } else {
                a(maxAdFormatA);
                return;
            }
        }
        if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            if (!maxAdFormatA.isAdViewAd() && maxAdFormatA != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(bVar);
            }
            b(maxAdFormatA);
        }
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f21828d.k());
        this.f21837n = (ListView) findViewById(R.id.listView);
        this.f21838o = findViewById(R.id.ad_presenter_view);
        this.f21839p = (AdControlButton) findViewById(R.id.ad_control_button);
        this.f21840q = (TextView) findViewById(R.id.status_textview);
        this.f21837n.setAdapter((ListAdapter) this.f21828d);
        this.f21840q.setText(a());
        this.f21840q.setTypeface(Typeface.DEFAULT_BOLD);
        this.f21839p.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer(10, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.f21838o.setBackground(layerDrawable);
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        if (this.f21827c != null) {
            this.f21825a.t0().a(this.f21836m);
        }
        MaxAdView maxAdView = this.f21829e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f21830f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.f21831g;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f21832h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f21834j;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.k;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f21834j.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        o7.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(com.applovin.impl.sdk.k kVar, C1651n c1651n, C1653o c1653o, j2 j2Var, r2 r2Var) {
        if (r2Var instanceof C1649m.b) {
            AbstractC1631d.a(this, MaxDebuggerAdUnitDetailActivity.class, kVar.e(), new Y(r2Var, c1651n, c1653o, kVar));
        }
    }

    private void b() {
        String strC = this.f21826b.c();
        if (this.f21826b.a().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(strC, this.f21826b.a());
            this.f21829e = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f21829e.setExtraParameter("disable_auto_retries", "true");
            this.f21829e.setExtraParameter("disable_precache", "true");
            this.f21829e.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f21829e.stopAutoRefresh();
            this.f21829e.setListener(this);
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f21826b.a()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(strC);
            this.f21830f = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f21830f.setListener(this);
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f21826b.a()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(strC);
            this.f21831g = maxAppOpenAd;
            maxAppOpenAd.setExtraParameter("disable_auto_retries", "true");
            this.f21831g.setListener(this);
            return;
        }
        if (MaxAdFormat.REWARDED == this.f21826b.a()) {
            MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(strC);
            this.f21832h = maxRewardedAd;
            maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
            this.f21832h.setListener(this);
            return;
        }
        if (MaxAdFormat.NATIVE == this.f21826b.a()) {
            this.f21833i = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), com.applovin.impl.sdk.k.o());
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(strC);
            this.f21834j = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f21834j.setNativeAdListener(new a());
            this.f21834j.setRevenueListener(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(r2 r2Var, C1651n c1651n, C1653o c1653o, com.applovin.impl.sdk.k kVar, MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
        maxDebuggerAdUnitDetailActivity.initialize(c1651n, c1653o, ((C1649m.b) r2Var).v(), kVar);
    }

    @Override // com.applovin.impl.C1670w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f21829e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f21830f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f21831g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f21832h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f21834j.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void a(MaxAdFormat maxAdFormat) {
        StringBuilder sb2 = new StringBuilder("Loading live ");
        sb2.append(maxAdFormat.getDisplayName());
        sb2.append(" Ad from ");
        j8 j8Var = this.f21827c;
        sb2.append(j8Var != null ? j8Var.b().a() : this.f21828d.j().c());
        com.applovin.impl.sdk.o.g("MaxDebuggerAdUnitDetailActivity", sb2.toString());
        if (this.f21827c != null) {
            this.f21825a.t0().a(this.f21827c.b().b());
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f21829e.setPlacement("[Mediation Debugger Live Ad]");
            this.f21829e.loadAd();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f21826b.a()) {
            this.f21830f.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f21826b.a()) {
            this.f21831g.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == this.f21826b.a()) {
            this.f21832h.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f21826b.a()) {
            this.f21834j.setPlacement("[Mediation Debugger Live Ad]");
            this.f21834j.loadAd();
        } else {
            o7.a("Live ads currently unavailable for ad format", this);
        }
    }

    private void a(ViewGroup viewGroup, AppLovinSdkUtils.Size size) {
        if (this.f21835l != null) {
            return;
        }
        r rVar = new r(viewGroup, size, this);
        this.f21835l = rVar;
        rVar.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.applovin.impl.Z
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                this.f20873a.a(dialogInterface);
            }
        });
        this.f21835l.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(DialogInterface dialogInterface) {
        this.f21835l = null;
    }

    private String a() {
        if (this.f21825a.t0().c()) {
            return "Not supported while Test Mode is enabled";
        }
        if (this.f21828d.j() != this.f21826b.f()) {
            return "This waterfall is not targeted for the current device";
        }
        return "Tap to load an ad";
    }

    private void b(MaxAdFormat maxAdFormat) {
        StringBuilder sb2 = new StringBuilder("Showing live ");
        sb2.append(maxAdFormat.getDisplayName());
        sb2.append(" Ad from ");
        j8 j8Var = this.f21827c;
        sb2.append(j8Var != null ? j8Var.b().a() : this.f21828d.j().c());
        com.applovin.impl.sdk.o.g("MaxDebuggerAdUnitDetailActivity", sb2.toString());
        if (maxAdFormat.isAdViewAd()) {
            a(this.f21829e, maxAdFormat.getSize());
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == this.f21826b.a()) {
            this.f21830f.showAd("[Mediation Debugger Live Ad]");
            return;
        }
        if (MaxAdFormat.APP_OPEN == this.f21826b.a()) {
            this.f21831g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f21826b.a()) {
            this.f21832h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f21826b.a()) {
            a(this.f21833i, MaxAdFormat.MREC.getSize());
        }
    }
}
