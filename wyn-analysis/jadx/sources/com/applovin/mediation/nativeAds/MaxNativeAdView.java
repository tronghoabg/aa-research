package com.applovin.mediation.nativeAds;

import Lb.h;
import R8.v;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.applovin.impl.d3;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.mediation.ads.b;
import com.applovin.impl.sdk.k;
import com.applovin.impl.sdk.nativeAd.AppLovinStarRatingView;
import com.applovin.impl.sdk.o;
import com.applovin.impl.sdk.utils.ImageViewUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class MaxNativeAdView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    private final View f24100a;

    /* renamed from: b, reason: collision with root package name */
    private final TextView f24101b;

    /* renamed from: c, reason: collision with root package name */
    private final TextView f24102c;

    /* renamed from: d, reason: collision with root package name */
    private final TextView f24103d;

    /* renamed from: e, reason: collision with root package name */
    private final Button f24104e;

    /* renamed from: f, reason: collision with root package name */
    private final ImageView f24105f;

    /* renamed from: g, reason: collision with root package name */
    private final FrameLayout f24106g;

    /* renamed from: h, reason: collision with root package name */
    private final ViewGroup f24107h;

    /* renamed from: i, reason: collision with root package name */
    private final FrameLayout f24108i;

    /* renamed from: j, reason: collision with root package name */
    private final ViewGroup f24109j;
    private final ViewGroup k;

    /* renamed from: l, reason: collision with root package name */
    private final FrameLayout f24110l;

    /* renamed from: m, reason: collision with root package name */
    private b f24111m;

    public class a implements ViewTreeObserver.OnPreDrawListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WeakReference f24112a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ViewGroup f24113b;

        public a(WeakReference weakReference, ViewGroup viewGroup) {
            this.f24112a = weakReference;
            this.f24113b = viewGroup;
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            ViewTreeObserver viewTreeObserver = (ViewTreeObserver) this.f24112a.get();
            if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
                k.f22986D0.O();
                if (o.a()) {
                    k.f22986D0.O().k("MaxNativeAdView", "Failed to remove onPreDrawListener since the view tree observer is not alive.");
                }
            } else {
                viewTreeObserver.removeOnPreDrawListener(this);
            }
            this.f24112a.clear();
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f24113b.getLayoutParams();
            layoutParams.height = ((View) this.f24113b.getParent()).getWidth();
            this.f24113b.setLayoutParams(layoutParams);
            return true;
        }
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, Activity activity) {
        this(maxNativeAd, (String) null, activity);
    }

    public b getAdViewTracker() {
        return this.f24111m;
    }

    public TextView getAdvertiserTextView() {
        return this.f24102c;
    }

    public TextView getBodyTextView() {
        return this.f24103d;
    }

    public Button getCallToActionButton() {
        return this.f24104e;
    }

    public List<View> getClickableViews() {
        ArrayList arrayList = new ArrayList(5);
        TextView textView = this.f24101b;
        if (textView != null) {
            arrayList.add(textView);
        }
        TextView textView2 = this.f24102c;
        if (textView2 != null) {
            arrayList.add(textView2);
        }
        TextView textView3 = this.f24103d;
        if (textView3 != null) {
            arrayList.add(textView3);
        }
        Button button = this.f24104e;
        if (button != null) {
            arrayList.add(button);
        }
        ImageView imageView = this.f24105f;
        if (imageView != null) {
            arrayList.add(imageView);
        }
        return arrayList;
    }

    @Deprecated
    public FrameLayout getIconContentView() {
        return this.f24106g;
    }

    public ImageView getIconImageView() {
        return this.f24105f;
    }

    public View getMainView() {
        return this.f24100a;
    }

    @Deprecated
    public FrameLayout getMediaContentView() {
        return this.f24110l;
    }

    public ViewGroup getMediaContentViewGroup() {
        ViewGroup viewGroup = this.k;
        return viewGroup != null ? viewGroup : this.f24110l;
    }

    @Deprecated
    public FrameLayout getOptionsContentView() {
        return this.f24108i;
    }

    public ViewGroup getOptionsContentViewGroup() {
        ViewGroup viewGroup = this.f24107h;
        return viewGroup != null ? viewGroup : this.f24108i;
    }

    public ViewGroup getStarRatingContentViewGroup() {
        return this.f24109j;
    }

    public TextView getTitleTextView() {
        return this.f24101b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        b bVar = this.f24111m;
        if (bVar != null) {
            bVar.c();
        }
        if (isHardwareAccelerated()) {
            return;
        }
        o.j("MaxNativeAdView", "Attached to non-hardware accelerated window: some native ad views require hardware accelerated Activities to render properly.");
    }

    public void recycle() {
        setOnClickListener(null);
        b bVar = this.f24111m;
        if (bVar != null) {
            bVar.a();
            this.f24111m = null;
        }
        View view = this.f24100a;
        if (view == null || view.getParent() == this) {
            return;
        }
        ViewGroup viewGroup = (ViewGroup) this.f24100a.getParent();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            removeView(viewGroup);
        }
        addView(this.f24100a);
    }

    public void render(d3 d3Var, a.InterfaceC0014a interfaceC0014a, k kVar) {
        recycle();
        if (!d3Var.o0().get() || !d3Var.n0().get()) {
            this.f24111m = new b(d3Var, this, interfaceC0014a, kVar);
        }
        MaxNativeAd nativeAd = d3Var.getNativeAd();
        if (d3Var.p0() && nativeAd.isContainerClickable()) {
            kVar.O();
            if (o.a()) {
                kVar.O().a("MaxNativeAdView", "Enabling container click");
            }
            setOnClickListener(new h(nativeAd, 1));
        }
        kVar.O();
        if (o.a()) {
            kVar.O().a("MaxNativeAdView", "Rendering custom ad view");
        }
        a(nativeAd);
    }

    @Deprecated
    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Activity activity) {
        this(maxNativeAd, str, activity.getApplicationContext());
    }

    private int a(String str, MaxAdFormat maxAdFormat) {
        if (maxAdFormat == MaxAdFormat.BANNER) {
            return "vertical_banner_template".equals(str) ? R.layout.max_native_ad_vertical_banner_view : ("media_banner_template".equals(str) || "no_body_banner_template".equals(str)) ? R.layout.max_native_ad_media_banner_view : "vertical_media_banner_template".equals(str) ? R.layout.max_native_ad_vertical_media_banner_view : R.layout.max_native_ad_banner_view;
        }
        if (maxAdFormat == MaxAdFormat.LEADER) {
            return "vertical_leader_template".equals(str) ? R.layout.max_native_ad_vertical_leader_view : R.layout.max_native_ad_leader_view;
        }
        if (maxAdFormat == MaxAdFormat.MREC) {
            return R.layout.max_native_ad_mrec_view;
        }
        if (maxAdFormat == MaxAdFormat.NATIVE) {
            throw new IllegalArgumentException(v.f("Attempting to render MAX native ad with invalid template: ", str));
        }
        throw new IllegalArgumentException("Unsupported ad format: " + maxAdFormat);
    }

    private void b(MaxNativeAd maxNativeAd) {
        if (StringUtils.isValidString(maxNativeAd.getTitle())) {
            this.f24101b.setText(maxNativeAd.getTitle());
        } else {
            this.f24101b.setVisibility(8);
        }
        if (this.f24102c != null) {
            if (StringUtils.isValidString(maxNativeAd.getAdvertiser())) {
                this.f24102c.setText(maxNativeAd.getAdvertiser());
            } else {
                this.f24102c.setVisibility(8);
            }
        }
        if (this.f24103d != null) {
            if (StringUtils.isValidString(maxNativeAd.getBody())) {
                this.f24103d.setText(maxNativeAd.getBody());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f24103d.setVisibility(8);
            } else {
                this.f24103d.setVisibility(4);
            }
        }
        if (this.f24104e != null) {
            if (StringUtils.isValidString(maxNativeAd.getCallToAction())) {
                this.f24104e.setText(maxNativeAd.getCallToAction());
            } else if (maxNativeAd.getFormat() == MaxAdFormat.NATIVE || maxNativeAd.getFormat() == MaxAdFormat.MREC) {
                this.f24104e.setVisibility(8);
            } else {
                this.f24104e.setVisibility(4);
            }
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        View iconView = maxNativeAd.getIconView();
        FrameLayout frameLayout = this.f24106g;
        if (frameLayout != null) {
            if (icon == null || this.f24105f == null) {
                if (iconView != null) {
                    iconView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                    this.f24106g.removeAllViews();
                    this.f24106g.addView(iconView);
                } else {
                    frameLayout.setVisibility(8);
                }
            } else if (icon.getDrawable() != null) {
                this.f24105f.setImageDrawable(icon.getDrawable());
            } else if (icon.getUri() == null || !StringUtils.isValidString(icon.getUri().toString())) {
                this.f24106g.setVisibility(8);
            } else {
                ImageViewUtils.setAndDownscaleImageUri(this.f24105f, icon.getUri());
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        FrameLayout frameLayout2 = this.f24108i;
        if (frameLayout2 != null && optionsView != null) {
            optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            this.f24108i.addView(optionsView);
            this.f24108i.bringToFront();
        } else if (frameLayout2 != null) {
            frameLayout2.setVisibility(8);
        }
        View mediaView = maxNativeAd.getMediaView();
        if (this.f24110l != null) {
            if (mediaView != null) {
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f24110l.addView(mediaView);
            } else if (maxNativeAd.getFormat() == MaxAdFormat.LEADER) {
                this.f24110l.setVisibility(8);
            }
        }
        if (this.f24109j != null) {
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                this.f24109j.removeAllViews();
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f24109j.addView(appLovinStarRatingView);
            } else {
                this.f24109j.setVisibility(8);
            }
        }
        b();
        postDelayed(new com.applovin.adview.a(this, 7), 2000L);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public MaxNativeAdView(MaxNativeAd maxNativeAd, String str, Context context) {
        MaxNativeAdViewBinder.Builder iconContentViewId = new MaxNativeAdViewBinder.Builder(-1).setTemplateType(str).setTitleTextViewId(R.id.applovin_native_title_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setCallToActionButtonId(R.id.applovin_native_cta_button).setIconImageViewId(R.id.applovin_native_icon_image_view).setIconContentViewId(R.id.applovin_native_icon_view);
        int i5 = R.id.applovin_native_options_view;
        MaxNativeAdViewBinder.Builder starRatingContentViewGroupId = iconContentViewId.setOptionsContentViewGroupId(i5).setOptionsContentFrameLayoutId(i5).setStarRatingContentViewGroupId(R.id.applovin_native_star_rating_view);
        int i10 = R.id.applovin_native_media_content_view;
        this(maxNativeAd, starRatingContentViewGroupId.setMediaContentViewGroupId(i10).setMediaContentFrameLayoutId(i10).build(), context);
    }

    public MaxNativeAdView(MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        this((MaxNativeAd) null, maxNativeAdViewBinder, context);
    }

    public MaxNativeAdView(MaxNativeAd maxNativeAd, MaxNativeAdViewBinder maxNativeAdViewBinder, Context context) {
        int iA;
        super(context);
        boolean z2 = maxNativeAdViewBinder.templateType != null;
        MaxAdFormat format = maxNativeAd != null ? maxNativeAd.getFormat() : MaxAdFormat.NATIVE;
        View view = maxNativeAdViewBinder.mainView;
        if (view != null) {
            this.f24100a = view;
        } else {
            if (z2) {
                iA = a(maxNativeAdViewBinder.templateType, format);
            } else {
                iA = maxNativeAdViewBinder.layoutResourceId;
            }
            this.f24100a = LayoutInflater.from(context).inflate(iA, (ViewGroup) this, false);
        }
        addView(this.f24100a);
        this.f24101b = (TextView) findViewById(maxNativeAdViewBinder.titleTextViewId);
        this.f24102c = (TextView) findViewById(maxNativeAdViewBinder.advertiserTextViewId);
        this.f24103d = (TextView) findViewById(maxNativeAdViewBinder.bodyTextViewId);
        this.f24104e = (Button) findViewById(maxNativeAdViewBinder.callToActionButtonId);
        this.f24105f = (ImageView) findViewById(maxNativeAdViewBinder.iconImageViewId);
        this.f24106g = (FrameLayout) findViewById(maxNativeAdViewBinder.iconContentViewId);
        this.f24107h = (ViewGroup) findViewById(maxNativeAdViewBinder.optionsContentViewGroupId);
        this.f24108i = (FrameLayout) findViewById(maxNativeAdViewBinder.optionsContentFrameLayoutId);
        this.f24109j = (ViewGroup) findViewById(maxNativeAdViewBinder.starRatingContentViewGroupId);
        this.k = (ViewGroup) findViewById(maxNativeAdViewBinder.mediaContentViewGroupId);
        this.f24110l = (FrameLayout) findViewById(maxNativeAdViewBinder.mediaContentFrameLayoutId);
        if (maxNativeAd != null) {
            b(maxNativeAd);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a() {
        setSelected(true);
    }

    private void a(MaxNativeAd maxNativeAd) {
        TextView textView = this.f24101b;
        if (textView != null) {
            textView.setText(maxNativeAd.getTitle());
        }
        TextView textView2 = this.f24103d;
        if (textView2 != null) {
            textView2.setText(maxNativeAd.getBody());
        }
        TextView textView3 = this.f24102c;
        if (textView3 != null) {
            textView3.setText(maxNativeAd.getAdvertiser());
        }
        Button button = this.f24104e;
        if (button != null) {
            button.setText(maxNativeAd.getCallToAction());
        }
        MaxNativeAd.MaxNativeAdImage icon = maxNativeAd.getIcon();
        ImageView imageView = this.f24105f;
        if (imageView != null) {
            if (icon != null) {
                if (icon.getDrawable() != null) {
                    this.f24105f.setImageDrawable(icon.getDrawable());
                } else if (icon.getUri() != null) {
                    ImageViewUtils.setAndDownscaleImageUri(this.f24105f, icon.getUri());
                } else {
                    this.f24105f.setImageDrawable(null);
                }
            } else {
                imageView.setImageDrawable(null);
            }
        }
        View mediaView = maxNativeAd.getMediaView();
        ViewGroup viewGroup = this.k;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
            if (mediaView != null) {
                ViewParent parent = mediaView.getParent();
                if (parent != null) {
                    ((ViewGroup) parent).removeAllViews();
                }
                mediaView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.k.addView(mediaView);
            }
        }
        View optionsView = maxNativeAd.getOptionsView();
        ViewGroup viewGroup2 = this.f24107h;
        if (viewGroup2 != null) {
            viewGroup2.removeAllViews();
            if (optionsView != null) {
                ViewParent parent2 = optionsView.getParent();
                if (parent2 != null) {
                    ((ViewGroup) parent2).removeAllViews();
                }
                optionsView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f24107h.addView(optionsView);
                this.f24107h.bringToFront();
            }
        }
        ViewGroup viewGroup3 = this.f24109j;
        if (viewGroup3 != null) {
            viewGroup3.removeAllViews();
            Double starRating = maxNativeAd.getStarRating();
            if (starRating != null) {
                AppLovinStarRatingView appLovinStarRatingView = new AppLovinStarRatingView(starRating, getContext());
                appLovinStarRatingView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                this.f24109j.addView(appLovinStarRatingView);
            }
        }
    }

    private void b() {
        ViewGroup viewGroup = (ViewGroup) findViewById(R.id.applovin_native_inner_parent_layout);
        if (viewGroup == null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.addOnPreDrawListener(new a(new WeakReference(viewTreeObserver), viewGroup));
        }
    }
}
