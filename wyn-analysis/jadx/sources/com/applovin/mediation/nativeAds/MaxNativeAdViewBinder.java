package com.applovin.mediation.nativeAds;

import android.view.View;

/* loaded from: classes.dex */
public class MaxNativeAdViewBinder {
    protected final int advertiserTextViewId;
    protected final int bodyTextViewId;
    protected final int callToActionButtonId;
    protected final int iconContentViewId;
    protected final int iconImageViewId;
    protected final int layoutResourceId;
    protected final View mainView;
    protected final int mediaContentFrameLayoutId;
    protected final int mediaContentViewGroupId;
    protected final int optionsContentFrameLayoutId;
    protected final int optionsContentViewGroupId;
    protected final int starRatingContentViewGroupId;
    protected final String templateType;
    protected final int titleTextViewId;

    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        private final View f24115a;

        /* renamed from: b, reason: collision with root package name */
        private final int f24116b;

        /* renamed from: c, reason: collision with root package name */
        private int f24117c;

        /* renamed from: d, reason: collision with root package name */
        private int f24118d;

        /* renamed from: e, reason: collision with root package name */
        private int f24119e;

        /* renamed from: f, reason: collision with root package name */
        private int f24120f;

        /* renamed from: g, reason: collision with root package name */
        private int f24121g;

        /* renamed from: h, reason: collision with root package name */
        private int f24122h;

        /* renamed from: i, reason: collision with root package name */
        private int f24123i;

        /* renamed from: j, reason: collision with root package name */
        private int f24124j;
        private int k;

        /* renamed from: l, reason: collision with root package name */
        private int f24125l;

        /* renamed from: m, reason: collision with root package name */
        private int f24126m;

        /* renamed from: n, reason: collision with root package name */
        private String f24127n;

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f24115a, this.f24116b, this.f24117c, this.f24118d, this.f24119e, this.f24120f, this.f24121g, this.f24124j, this.f24122h, this.f24123i, this.k, this.f24125l, this.f24126m, this.f24127n);
        }

        public Builder setAdvertiserTextViewId(int i5) {
            this.f24118d = i5;
            return this;
        }

        public Builder setBodyTextViewId(int i5) {
            this.f24119e = i5;
            return this;
        }

        public Builder setCallToActionButtonId(int i5) {
            this.f24126m = i5;
            return this;
        }

        @Deprecated
        public Builder setIconContentViewId(int i5) {
            this.f24121g = i5;
            return this;
        }

        public Builder setIconImageViewId(int i5) {
            this.f24120f = i5;
            return this;
        }

        @Deprecated
        public Builder setMediaContentFrameLayoutId(int i5) {
            this.f24125l = i5;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i5) {
            this.k = i5;
            return this;
        }

        @Deprecated
        public Builder setOptionsContentFrameLayoutId(int i5) {
            this.f24123i = i5;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i5) {
            this.f24122h = i5;
            return this;
        }

        public Builder setStarRatingContentViewGroupId(int i5) {
            this.f24124j = i5;
            return this;
        }

        public Builder setTemplateType(String str) {
            this.f24127n = str;
            return this;
        }

        public Builder setTitleTextViewId(int i5) {
            this.f24117c = i5;
            return this;
        }

        public Builder(int i5) {
            this(i5, null);
        }

        private Builder(int i5, View view) {
            this.f24117c = -1;
            this.f24118d = -1;
            this.f24119e = -1;
            this.f24120f = -1;
            this.f24121g = -1;
            this.f24122h = -1;
            this.f24123i = -1;
            this.f24124j = -1;
            this.k = -1;
            this.f24125l = -1;
            this.f24126m = -1;
            this.f24116b = i5;
            this.f24115a = view;
        }
    }

    private MaxNativeAdViewBinder(View view, int i5, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, int i20, String str) {
        this.mainView = view;
        this.layoutResourceId = i5;
        this.titleTextViewId = i10;
        this.advertiserTextViewId = i11;
        this.bodyTextViewId = i12;
        this.iconImageViewId = i13;
        this.iconContentViewId = i14;
        this.starRatingContentViewGroupId = i15;
        this.optionsContentViewGroupId = i16;
        this.optionsContentFrameLayoutId = i17;
        this.mediaContentViewGroupId = i18;
        this.mediaContentFrameLayoutId = i19;
        this.callToActionButtonId = i20;
        this.templateType = str;
    }
}
