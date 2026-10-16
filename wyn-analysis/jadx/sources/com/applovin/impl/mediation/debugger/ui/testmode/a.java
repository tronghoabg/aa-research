package com.applovin.impl.mediation.debugger.ui.testmode;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.Switch;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.C1670w;
import com.applovin.impl.C1672x;
import com.applovin.impl.e3;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.n3;
import com.applovin.impl.o7;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class a extends n3 implements MaxRewardedAdListener, MaxAdViewAdListener, AdControlButton.a, MaxAdRevenueListener, C1670w.a {

    /* renamed from: a, reason: collision with root package name */
    private e3 f22144a;

    /* renamed from: b, reason: collision with root package name */
    private k f22145b;

    /* renamed from: c, reason: collision with root package name */
    private MaxAdView f22146c;

    /* renamed from: d, reason: collision with root package name */
    private MaxAdView f22147d;

    /* renamed from: e, reason: collision with root package name */
    private MaxInterstitialAd f22148e;

    /* renamed from: f, reason: collision with root package name */
    private MaxAppOpenAd f22149f;

    /* renamed from: g, reason: collision with root package name */
    private MaxRewardedAd f22150g;

    /* renamed from: h, reason: collision with root package name */
    private MaxAd f22151h;

    /* renamed from: i, reason: collision with root package name */
    private MaxNativeAdLoader f22152i;

    /* renamed from: j, reason: collision with root package name */
    private List f22153j;
    private String k;

    /* renamed from: l, reason: collision with root package name */
    private AdControlButton f22154l;

    /* renamed from: m, reason: collision with root package name */
    private AdControlButton f22155m;

    /* renamed from: n, reason: collision with root package name */
    private AdControlButton f22156n;

    /* renamed from: o, reason: collision with root package name */
    private AdControlButton f22157o;

    /* renamed from: p, reason: collision with root package name */
    private AdControlButton f22158p;

    /* renamed from: q, reason: collision with root package name */
    private AdControlButton f22159q;

    /* renamed from: r, reason: collision with root package name */
    private Button f22160r;

    /* renamed from: s, reason: collision with root package name */
    private Button f22161s;

    /* renamed from: t, reason: collision with root package name */
    private FrameLayout f22162t;

    /* renamed from: u, reason: collision with root package name */
    private FrameLayout f22163u;

    /* renamed from: v, reason: collision with root package name */
    private Switch f22164v;

    /* renamed from: w, reason: collision with root package name */
    private Switch f22165w;

    /* renamed from: x, reason: collision with root package name */
    private Map f22166x;

    /* renamed from: com.applovin.impl.mediation.debugger.ui.testmode.a$a, reason: collision with other inner class name */
    public class C0015a extends MaxNativeAdListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MaxNativeAdView f22167a;

        public C0015a(MaxNativeAdView maxNativeAdView) {
            this.f22167a = maxNativeAdView;
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdClicked(MaxAd maxAd) {
            a.this.onAdClicked(maxAd);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoadFailed(String str, MaxError maxError) {
            a.this.onAdLoadFailed(str, maxError);
        }

        @Override // com.applovin.mediation.nativeAds.MaxNativeAdListener
        public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
            if (a.this.f22151h != null) {
                a.this.f22152i.destroy(a.this.f22151h);
            }
            a.this.f22151h = maxAd;
            a.this.f22152i.render(this.f22167a, maxAd);
            a.this.f22163u.removeAllViews();
            a.this.f22163u.addView(this.f22167a);
            a.this.onAdLoaded(maxAd);
        }
    }

    private void e() {
        List listR = this.f22144a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.REWARDED;
        if (!listR.contains(maxAdFormat)) {
            findViewById(R.id.rewarded_control_view).setVisibility(8);
            return;
        }
        String str = "test_mode_rewarded_" + this.f22144a.m();
        this.k = str;
        MaxRewardedAd maxRewardedAd = MaxRewardedAd.getInstance(str, this.f22145b.z0(), this);
        this.f22150g = maxRewardedAd;
        maxRewardedAd.setExtraParameter("disable_auto_retries", "true");
        this.f22150g.setListener(this);
        AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
        this.f22158p = adControlButton;
        adControlButton.setOnClickListener(this);
        this.f22158p.setFormat(maxAdFormat);
    }

    @Override // com.applovin.impl.n3
    public k getSdk() {
        return this.f22145b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        return (this.f22144a.x() == null || !this.f22144a.x().containsKey(maxAdFormat)) ? this.f22144a.m() : (String) this.f22144a.x().get(maxAdFormat);
    }

    public void initialize(e3 e3Var) {
        this.f22144a = e3Var;
        this.f22145b = e3Var.o();
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
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
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
        AdControlButton adControlButtonA = a(str);
        adControlButtonA.setControlState(AdControlButton.b.LOAD);
        o7.a(maxError, adControlButtonA.getFormat().getLabel(), this);
    }

    @Override // com.applovin.mediation.MaxAdListener
    public void onAdLoaded(MaxAd maxAd) {
        AdControlButton adControlButtonA = a(maxAd.getAdUnitId());
        if (maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) {
            adControlButtonA.setControlState(AdControlButton.b.LOAD);
        } else {
            adControlButtonA.setControlState(AdControlButton.b.SHOW);
        }
    }

    @Override // com.applovin.impl.C1670w.a
    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f22146c.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            this.f22147d.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f22148e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f22149f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f22150g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f22152i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    @Override // com.applovin.mediation.MaxAdRevenueListener
    public void onAdRevenuePaid(MaxAd maxAd) {
        o7.a("onAdRevenuePaid", maxAd, this);
    }

    @Override // com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton.a
    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        AdControlButton.b bVar = AdControlButton.b.LOAD;
        if (bVar != adControlButton.getControlState()) {
            if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
                adControlButton.setControlState(bVar);
                b(format);
                return;
            }
            return;
        }
        adControlButton.setControlState(AdControlButton.b.LOADING);
        Map map = this.f22166x;
        if (map == null || map.get(format) == null) {
            a(format);
        } else {
            ((C1670w) this.f22166x.get(format)).a();
        }
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f22144a == null) {
            o.h("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f22144a.g() + " Test Ads");
        this.f22153j = this.f22145b.t0().b();
        a();
        c();
        b();
        e();
        d();
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.f22160r = (Button) findViewById(R.id.show_mrec_button);
        this.f22161s = (Button) findViewById(R.id.show_native_button);
        if (this.f22144a.J() && this.f22144a.r().contains(MaxAdFormat.MREC)) {
            this.f22163u.setVisibility(8);
            this.f22160r.setBackgroundColor(-1);
            this.f22161s.setBackgroundColor(-3355444);
            final int i5 = 0;
            this.f22160r.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f22170b;

                {
                    this.f22170b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i5) {
                        case 0:
                            this.f22170b.a(view);
                            break;
                        case 1:
                            this.f22170b.b(view);
                            break;
                        case 2:
                            this.f22170b.c(view);
                            break;
                        default:
                            this.f22170b.d(view);
                            break;
                    }
                }
            });
            final int i10 = 1;
            this.f22161s.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f22170b;

                {
                    this.f22170b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i10) {
                        case 0:
                            this.f22170b.a(view);
                            break;
                        case 1:
                            this.f22170b.b(view);
                            break;
                        case 2:
                            this.f22170b.c(view);
                            break;
                        default:
                            this.f22170b.d(view);
                            break;
                    }
                }
            });
        } else {
            this.f22160r.setVisibility(8);
            this.f22161s.setVisibility(8);
        }
        this.f22164v = (Switch) findViewById(R.id.native_banner_switch);
        this.f22165w = (Switch) findViewById(R.id.native_mrec_switch);
        if (this.f22144a.K()) {
            final int i11 = 2;
            this.f22164v.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f22170b;

                {
                    this.f22170b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i11) {
                        case 0:
                            this.f22170b.a(view);
                            break;
                        case 1:
                            this.f22170b.b(view);
                            break;
                        case 2:
                            this.f22170b.c(view);
                            break;
                        default:
                            this.f22170b.d(view);
                            break;
                    }
                }
            });
            final int i12 = 3;
            this.f22165w.setOnClickListener(new View.OnClickListener(this) { // from class: com.applovin.impl.mediation.debugger.ui.testmode.b

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ a f22170b;

                {
                    this.f22170b = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    switch (i12) {
                        case 0:
                            this.f22170b.a(view);
                            break;
                        case 1:
                            this.f22170b.b(view);
                            break;
                        case 2:
                            this.f22170b.c(view);
                            break;
                        default:
                            this.f22170b.d(view);
                            break;
                    }
                }
            });
        } else {
            this.f22164v.setVisibility(8);
            this.f22165w.setVisibility(8);
        }
        if (!StringUtils.isValidString(this.f22144a.e()) || this.f22144a.d() == null || this.f22144a.d().size() <= 0) {
            return;
        }
        AdRegistration.getInstance(this.f22144a.e(), this);
        AdRegistration.enableTesting(true);
        AdRegistration.enableLogging(true);
        HashMap map = new HashMap(this.f22144a.d().size());
        for (MaxAdFormat maxAdFormat : this.f22144a.d().keySet()) {
            map.put(maxAdFormat, new C1670w((C1672x) this.f22144a.d().get(maxAdFormat), maxAdFormat, getApplicationContext(), this));
        }
        this.f22166x = map;
    }

    @Override // com.applovin.impl.n3, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        this.f22145b.t0().a(this.f22153j);
        MaxAdView maxAdView = this.f22146c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f22147d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f22148e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f22150g;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.f22152i;
        if (maxNativeAdLoader != null) {
            MaxAd maxAd = this.f22151h;
            if (maxAd != null) {
                maxNativeAdLoader.destroy(maxAd);
            }
            this.f22152i.destroy();
        }
    }

    @Override // com.applovin.mediation.MaxRewardedAdListener
    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        o7.a("onUserRewarded", maxAd, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void d(View view) {
        this.f22147d.removeAllViews();
        this.f22155m.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void b(View view) {
        this.f22163u.setVisibility(0);
        this.f22162t.setVisibility(8);
        this.f22161s.setBackgroundColor(-1);
        this.f22160r.setBackgroundColor(-3355444);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void c(View view) {
        this.f22146c.removeAllViews();
        this.f22154l.setControlState(AdControlButton.b.LOAD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(View view) {
        this.f22162t.setVisibility(0);
        this.f22163u.setVisibility(8);
        this.f22160r.setBackgroundColor(-1);
        this.f22161s.setBackgroundColor(-3355444);
    }

    private void d() {
        this.f22163u = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.f22144a.J()) {
            MaxNativeAdView maxNativeAdView = new MaxNativeAdView(new MaxNativeAdViewBinder.Builder(R.layout.max_native_ad_template_1).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).build(), this);
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native");
            this.f22152i = maxNativeAdLoader;
            maxNativeAdLoader.setExtraParameter("disable_auto_retries", "true");
            this.f22152i.setNativeAdListener(new C0015a(maxNativeAdView));
            this.f22152i.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.f22159q = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f22159q.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.f22163u.setVisibility(8);
    }

    @Override // com.applovin.impl.C1670w.a
    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.BANNER != maxAdFormat && MaxAdFormat.LEADER != maxAdFormat) {
            if (MaxAdFormat.MREC == maxAdFormat) {
                this.f22147d.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f22148e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f22149f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f22150g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.f22152i.setLocalExtraParameter("amazon_ad_error", adError);
            }
        } else {
            this.f22146c.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    private void c() {
        this.f22162t = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        List listR = this.f22144a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.MREC;
        if (listR.contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", maxAdFormat, this.f22145b.z0(), this);
            this.f22147d = maxAdView;
            maxAdView.setExtraParameter("disable_auto_retries", "true");
            this.f22147d.setExtraParameter("disable_precache", "true");
            this.f22147d.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f22147d.stopAutoRefresh();
            this.f22147d.setListener(this);
            this.f22162t.addView(this.f22147d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.f22155m = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f22155m.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.f22162t.setVisibility(8);
    }

    private void b() {
        List listR = this.f22144a.r();
        MaxAdFormat maxAdFormat = MaxAdFormat.INTERSTITIAL;
        if (listR.contains(maxAdFormat)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f22145b.z0(), this);
            this.f22148e = maxInterstitialAd;
            maxInterstitialAd.setExtraParameter("disable_auto_retries", "true");
            this.f22148e.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.f22156n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f22156n.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.interstitial_control_view).setVisibility(8);
    }

    private void a() {
        MaxAdFormat maxAdFormat;
        String str;
        boolean zIsTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (zIsTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f22144a.r().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f22145b.z0(), this);
            this.f22146c = maxAdView;
            maxAdView.setExtraParameter("adaptive_banner", "false");
            this.f22146c.setExtraParameter("disable_auto_retries", "true");
            this.f22146c.setExtraParameter("disable_precache", "true");
            this.f22146c.setExtraParameter("allow_pause_auto_refresh_immediately", "true");
            this.f22146c.stopAutoRefresh();
            this.f22146c.setListener(this);
            frameLayout.addView(this.f22146c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.f22154l = adControlButton;
            adControlButton.setOnClickListener(this);
            this.f22154l.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void b(MaxAdFormat maxAdFormat) {
        o.g("MaxDebuggerMultiAdActivity", "Showing test " + maxAdFormat.getDisplayName() + " Ad from " + this.f22144a.g());
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f22148e.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f22149f.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f22150g.showAd();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        o.g("MaxDebuggerMultiAdActivity", "Loading test " + maxAdFormat.getDisplayName() + " Ad from " + this.f22144a.g());
        MaxAdFormat maxAdFormat2 = MaxAdFormat.BANNER;
        boolean z2 = false;
        boolean z10 = (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) && this.f22164v.isChecked();
        MaxAdFormat maxAdFormat3 = MaxAdFormat.MREC;
        if (maxAdFormat3 == maxAdFormat && this.f22165w.isChecked()) {
            z2 = true;
        }
        if (!z10 && !z2) {
            this.f22145b.t0().a(getTestModeNetwork(maxAdFormat));
        } else {
            this.f22145b.t0().a(this.f22144a.w());
        }
        if (maxAdFormat2 == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            this.f22146c.loadAd();
            return;
        }
        if (maxAdFormat3 == maxAdFormat) {
            this.f22147d.loadAd();
            this.f22160r.callOnClick();
            return;
        }
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f22148e.loadAd();
            return;
        }
        if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f22149f.loadAd();
            return;
        }
        if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f22150g.loadAd();
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.f22152i.loadAd();
            this.f22161s.callOnClick();
        }
    }

    private AdControlButton a(String str) {
        if (!str.equals("test_mode_banner") && !str.equals("test_mode_leader")) {
            if (str.equals("test_mode_mrec")) {
                return this.f22155m;
            }
            if (str.equals("test_mode_interstitial")) {
                return this.f22156n;
            }
            if (str.equals("test_mode_app_open")) {
                return this.f22157o;
            }
            if (str.equals(this.k)) {
                return this.f22158p;
            }
            if (str.equals("test_mode_native")) {
                return this.f22159q;
            }
            throw new IllegalArgumentException("Invalid test mode ad unit identifier provided ".concat(str));
        }
        return this.f22154l;
    }
}
