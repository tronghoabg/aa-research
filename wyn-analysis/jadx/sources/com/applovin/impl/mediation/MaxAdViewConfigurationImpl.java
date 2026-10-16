package com.applovin.impl.mediation;

import A7.AbstractC0279p0;
import com.applovin.mediation.MaxAdViewConfiguration;

/* loaded from: classes.dex */
public class MaxAdViewConfigurationImpl extends MaxAdViewConfiguration {

    /* renamed from: a, reason: collision with root package name */
    private final MaxAdViewConfiguration.AdaptiveType f21945a;

    /* renamed from: b, reason: collision with root package name */
    private final int f21946b;

    /* renamed from: c, reason: collision with root package name */
    private final int f21947c;

    public static class BuilderImpl implements MaxAdViewConfiguration.Builder {

        /* renamed from: a, reason: collision with root package name */
        private MaxAdViewConfiguration.AdaptiveType f21948a = MaxAdViewConfiguration.AdaptiveType.NONE;

        /* renamed from: b, reason: collision with root package name */
        private int f21949b = -1;

        /* renamed from: c, reason: collision with root package name */
        private int f21950c = -1;

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration build() {
            return new MaxAdViewConfigurationImpl(this);
        }

        public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
            return this.f21948a;
        }

        public int getAdaptiveWidth() {
            return this.f21949b;
        }

        public int getInlineMaximumHeight() {
            return this.f21950c;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveType(MaxAdViewConfiguration.AdaptiveType adaptiveType) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setAdaptiveType(adaptiveType=" + adaptiveType + ")");
            this.f21948a = adaptiveType;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setAdaptiveWidth(int i5) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setAdaptiveWidth(adaptiveWidth=" + i5 + ")");
            this.f21949b = i5;
            return this;
        }

        @Override // com.applovin.mediation.MaxAdViewConfiguration.Builder
        public MaxAdViewConfiguration.Builder setInlineMaximumHeight(int i5) {
            com.applovin.impl.sdk.o.e("MaxAdViewConfiguration", "setInlineMaximumHeight(inlineMaximumHeight=" + i5 + ")");
            this.f21950c = i5;
            return this;
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder("MaxAdViewConfiguration.Builder{adaptiveType=");
            sb2.append(this.f21948a);
            sb2.append(", adaptiveWidth=");
            sb2.append(this.f21949b);
            sb2.append(", inlineMaximumHeight=");
            return AbstractC0279p0.j(this.f21950c, "}", sb2);
        }
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public MaxAdViewConfiguration.AdaptiveType getAdaptiveType() {
        return this.f21945a;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getAdaptiveWidth() {
        return this.f21946b;
    }

    @Override // com.applovin.mediation.MaxAdViewConfiguration
    public int getInlineMaximumHeight() {
        return this.f21947c;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("MaxAdViewConfiguration{adaptiveType=");
        sb2.append(this.f21945a);
        sb2.append(", adaptiveWidth=");
        sb2.append(this.f21946b);
        sb2.append(", inlineMaximumHeight=");
        return AbstractC0279p0.j(this.f21947c, "}", sb2);
    }

    private MaxAdViewConfigurationImpl(BuilderImpl builderImpl) {
        this.f21945a = builderImpl.f21948a;
        this.f21946b = builderImpl.f21949b;
        this.f21947c = builderImpl.f21950c;
    }
}
