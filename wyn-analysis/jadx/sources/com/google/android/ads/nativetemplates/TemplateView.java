package com.google.android.ads.nativetemplates;

import ad.a0;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.nativead.MediaView;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdView;
import com.google.android.gms.ads.nativead.c;
import com.unity3d.services.UnityAdsConstants;
import com.wynauto.wyn.R;
import p5.C3768a;

/* loaded from: classes3.dex */
public final class TemplateView extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public final int f26250a;

    /* renamed from: b, reason: collision with root package name */
    public C3768a f26251b;

    /* renamed from: c, reason: collision with root package name */
    public NativeAd f26252c;

    /* renamed from: d, reason: collision with root package name */
    public NativeAdView f26253d;

    /* renamed from: e, reason: collision with root package name */
    public TextView f26254e;

    /* renamed from: f, reason: collision with root package name */
    public TextView f26255f;

    /* renamed from: g, reason: collision with root package name */
    public RatingBar f26256g;

    /* renamed from: h, reason: collision with root package name */
    public TextView f26257h;

    /* renamed from: i, reason: collision with root package name */
    public ImageView f26258i;

    /* renamed from: j, reason: collision with root package name */
    public MediaView f26259j;
    public Button k;

    /* renamed from: l, reason: collision with root package name */
    public ConstraintLayout f26260l;

    public TemplateView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, a0.f17561a, 0, 0);
        try {
            this.f26250a = typedArrayObtainStyledAttributes.getResourceId(0, R.layout.gnt_medium_template_view);
            typedArrayObtainStyledAttributes.recycle();
            ((LayoutInflater) context.getSystemService("layout_inflater")).inflate(this.f26250a, this);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public NativeAdView getNativeAdView() {
        return this.f26253d;
    }

    public String getTemplateTypeName() {
        int i5 = this.f26250a;
        return i5 == R.layout.gnt_medium_template_view ? "medium_template" : i5 == R.layout.gnt_small_template_view ? "small_template" : "";
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        this.f26253d = (NativeAdView) findViewById(R.id.native_ad_view);
        this.f26254e = (TextView) findViewById(R.id.primary);
        this.f26255f = (TextView) findViewById(R.id.secondary);
        this.f26257h = (TextView) findViewById(R.id.body);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.rating_bar);
        this.f26256g = ratingBar;
        ratingBar.setEnabled(false);
        this.k = (Button) findViewById(R.id.cta);
        this.f26258i = (ImageView) findViewById(R.id.icon);
        this.f26259j = (MediaView) findViewById(R.id.media_view);
        this.f26260l = (ConstraintLayout) findViewById(R.id.background);
    }

    public void setNativeAd(NativeAd nativeAd) {
        this.f26252c = nativeAd;
        String store = nativeAd.getStore();
        String advertiser = nativeAd.getAdvertiser();
        String headline = nativeAd.getHeadline();
        String body = nativeAd.getBody();
        String callToAction = nativeAd.getCallToAction();
        Double starRating = nativeAd.getStarRating();
        c icon = nativeAd.getIcon();
        this.f26253d.setCallToActionView(this.k);
        this.f26253d.setHeadlineView(this.f26254e);
        this.f26253d.setMediaView(this.f26259j);
        this.f26255f.setVisibility(0);
        String store2 = nativeAd.getStore();
        String advertiser2 = nativeAd.getAdvertiser();
        if (!TextUtils.isEmpty(store2) && TextUtils.isEmpty(advertiser2)) {
            this.f26253d.setStoreView(this.f26255f);
        } else if (TextUtils.isEmpty(advertiser)) {
            store = "";
        } else {
            this.f26253d.setAdvertiserView(this.f26255f);
            store = advertiser;
        }
        this.f26254e.setText(headline);
        this.k.setText(callToAction);
        if (starRating == null || starRating.doubleValue() <= 0.0d) {
            this.f26255f.setText(store);
            this.f26255f.setVisibility(0);
            this.f26256g.setVisibility(8);
        } else {
            this.f26255f.setVisibility(8);
            this.f26256g.setVisibility(0);
            this.f26256g.setRating(starRating.floatValue());
            this.f26253d.setStarRatingView(this.f26256g);
        }
        if (icon != null) {
            this.f26258i.setVisibility(0);
            this.f26258i.setImageDrawable(icon.getDrawable());
        } else {
            this.f26258i.setVisibility(8);
        }
        TextView textView = this.f26257h;
        if (textView != null) {
            textView.setText(body);
            this.f26253d.setBodyView(this.f26257h);
        }
        this.f26253d.setNativeAd(nativeAd);
    }

    public void setStyles(C3768a c3768a) {
        TextView textView;
        TextView textView2;
        TextView textView3;
        Button button;
        TextView textView4;
        TextView textView5;
        TextView textView6;
        Button button2;
        Button button3;
        TextView textView7;
        TextView textView8;
        TextView textView9;
        Button button4;
        TextView textView10;
        TextView textView11;
        TextView textView12;
        this.f26251b = c3768a;
        ColorDrawable colorDrawable = c3768a.f43253q;
        if (colorDrawable != null) {
            this.f26260l.setBackground(colorDrawable);
            TextView textView13 = this.f26254e;
            if (textView13 != null) {
                textView13.setBackground(colorDrawable);
            }
            TextView textView14 = this.f26255f;
            if (textView14 != null) {
                textView14.setBackground(colorDrawable);
            }
            TextView textView15 = this.f26257h;
            if (textView15 != null) {
                textView15.setBackground(colorDrawable);
            }
        }
        Typeface typeface = this.f26251b.f43242e;
        if (typeface != null && (textView12 = this.f26254e) != null) {
            textView12.setTypeface(typeface);
        }
        Typeface typeface2 = this.f26251b.f43246i;
        if (typeface2 != null && (textView11 = this.f26255f) != null) {
            textView11.setTypeface(typeface2);
        }
        Typeface typeface3 = this.f26251b.f43249m;
        if (typeface3 != null && (textView10 = this.f26257h) != null) {
            textView10.setTypeface(typeface3);
        }
        Typeface typeface4 = this.f26251b.f43238a;
        if (typeface4 != null && (button4 = this.k) != null) {
            button4.setTypeface(typeface4);
        }
        Integer num = this.f26251b.f43244g;
        if (num != null && (textView9 = this.f26254e) != null) {
            textView9.setTextColor(num.intValue());
        }
        Integer num2 = this.f26251b.k;
        if (num2 != null && (textView8 = this.f26255f) != null) {
            textView8.setTextColor(num2.intValue());
        }
        Integer num3 = this.f26251b.f43251o;
        if (num3 != null && (textView7 = this.f26257h) != null) {
            textView7.setTextColor(num3.intValue());
        }
        Integer num4 = this.f26251b.f43240c;
        if (num4 != null && (button3 = this.k) != null) {
            button3.setTextColor(num4.intValue());
        }
        float f10 = this.f26251b.f43239b;
        if (f10 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (button2 = this.k) != null) {
            button2.setTextSize(f10);
        }
        float f11 = this.f26251b.f43243f;
        if (f11 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (textView6 = this.f26254e) != null) {
            textView6.setTextSize(f11);
        }
        float f12 = this.f26251b.f43247j;
        if (f12 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (textView5 = this.f26255f) != null) {
            textView5.setTextSize(f12);
        }
        float f13 = this.f26251b.f43250n;
        if (f13 > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (textView4 = this.f26257h) != null) {
            textView4.setTextSize(f13);
        }
        ColorDrawable colorDrawable2 = this.f26251b.f43241d;
        if (colorDrawable2 != null && (button = this.k) != null) {
            button.setBackground(colorDrawable2);
        }
        ColorDrawable colorDrawable3 = this.f26251b.f43245h;
        if (colorDrawable3 != null && (textView3 = this.f26254e) != null) {
            textView3.setBackground(colorDrawable3);
        }
        ColorDrawable colorDrawable4 = this.f26251b.f43248l;
        if (colorDrawable4 != null && (textView2 = this.f26255f) != null) {
            textView2.setBackground(colorDrawable4);
        }
        ColorDrawable colorDrawable5 = this.f26251b.f43252p;
        if (colorDrawable5 != null && (textView = this.f26257h) != null) {
            textView.setBackground(colorDrawable5);
        }
        invalidate();
        requestLayout();
    }
}
