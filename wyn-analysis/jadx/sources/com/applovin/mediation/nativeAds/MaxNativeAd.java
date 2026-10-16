package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

/* loaded from: classes.dex */
public class MaxNativeAd extends MaxNativeAdImpl {
    private static final float MINIMUM_STARS_TO_RENDER = 3.0f;
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private boolean isExpired;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final Double starRating;
    private final String title;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private MaxAdFormat f24086a;

        /* renamed from: b, reason: collision with root package name */
        private String f24087b;

        /* renamed from: c, reason: collision with root package name */
        private String f24088c;

        /* renamed from: d, reason: collision with root package name */
        private String f24089d;

        /* renamed from: e, reason: collision with root package name */
        private String f24090e;

        /* renamed from: f, reason: collision with root package name */
        private MaxNativeAdImage f24091f;

        /* renamed from: g, reason: collision with root package name */
        private View f24092g;

        /* renamed from: h, reason: collision with root package name */
        private View f24093h;

        /* renamed from: i, reason: collision with root package name */
        private View f24094i;

        /* renamed from: j, reason: collision with root package name */
        private MaxNativeAdImage f24095j;
        private float k;

        /* renamed from: l, reason: collision with root package name */
        private Double f24096l;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f24086a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f24088c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f24089d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f24090e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f24091f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f24092g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.f24095j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f10) {
            this.k = f10;
            return this;
        }

        public Builder setMediaView(View view) {
            this.f24094i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f24093h = view;
            return this;
        }

        public Builder setStarRating(Double d3) {
            this.f24096l = d3;
            return this;
        }

        public Builder setTitle(String str) {
            this.f24087b = str;
            return this;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f24086a;
        this.title = builder.f24087b;
        this.advertiser = builder.f24088c;
        this.body = builder.f24089d;
        this.callToAction = builder.f24090e;
        this.icon = builder.f24091f;
        this.iconView = builder.f24092g;
        this.optionsView = builder.f24093h;
        this.mediaView = builder.f24094i;
        this.mainImage = builder.f24095j;
        this.mediaContentAspectRatio = builder.k;
        Double d3 = builder.f24096l;
        this.starRating = (d3 == null || d3.doubleValue() < 3.0d) ? null : d3;
    }

    public final String getAdvertiser() {
        return this.advertiser;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final MaxAdFormat getFormat() {
        return this.format;
    }

    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    public final View getIconView() {
        return this.iconView;
    }

    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    public final View getMediaView() {
        return this.mediaView;
    }

    public final View getOptionsView() {
        return this.optionsView;
    }

    public final Double getStarRating() {
        return this.starRating;
    }

    public final String getTitle() {
        return this.title;
    }

    public boolean isContainerClickable() {
        return false;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView == null || (callToActionButton = maxNativeAdView.getCallToActionButton()) == null) {
            return;
        }
        callToActionButton.performClick();
    }

    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        return false;
    }

    @Deprecated
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }

    public void setExpired() {
        this.isExpired = true;
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }

    public boolean shouldPrepareViewForInteractionOnMainThread() {
        return true;
    }

    public static class MaxNativeAdImage {

        /* renamed from: a, reason: collision with root package name */
        private Drawable f24097a;

        /* renamed from: b, reason: collision with root package name */
        private Uri f24098b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f24097a = drawable;
        }

        public Drawable getDrawable() {
            return this.f24097a;
        }

        public Uri getUri() {
            return this.f24098b;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f24098b = uri;
        }
    }
}
