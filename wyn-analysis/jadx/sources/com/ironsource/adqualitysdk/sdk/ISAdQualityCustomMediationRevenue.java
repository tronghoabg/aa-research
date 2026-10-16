package com.ironsource.adqualitysdk.sdk;

@Deprecated
/* loaded from: classes4.dex */
public class ISAdQualityCustomMediationRevenue {

    /* renamed from: a, reason: collision with root package name */
    public final ISAdQualityMediationNetwork f28271a;

    /* renamed from: b, reason: collision with root package name */
    public final ISAdQualityAdType f28272b;

    /* renamed from: c, reason: collision with root package name */
    public final double f28273c;

    /* renamed from: d, reason: collision with root package name */
    public final String f28274d;

    @Deprecated
    public static class Builder {

        /* renamed from: a, reason: collision with root package name */
        public ISAdQualityMediationNetwork f28275a = ISAdQualityMediationNetwork.UNKNOWN;

        /* renamed from: b, reason: collision with root package name */
        public ISAdQualityAdType f28276b = ISAdQualityAdType.UNKNOWN;

        /* renamed from: c, reason: collision with root package name */
        public double f28277c;

        /* renamed from: d, reason: collision with root package name */
        public String f28278d;

        @Deprecated
        public Builder() {
        }

        @Deprecated
        public ISAdQualityCustomMediationRevenue build() {
            return new ISAdQualityCustomMediationRevenue(this.f28275a, this.f28276b, this.f28277c, this.f28278d);
        }

        @Deprecated
        public Builder setAdType(ISAdQualityAdType iSAdQualityAdType) {
            this.f28276b = iSAdQualityAdType;
            return this;
        }

        @Deprecated
        public Builder setMediationNetwork(ISAdQualityMediationNetwork iSAdQualityMediationNetwork) {
            this.f28275a = iSAdQualityMediationNetwork;
            return this;
        }

        @Deprecated
        public Builder setPlacement(String str) {
            this.f28278d = str;
            return this;
        }

        @Deprecated
        public Builder setRevenue(double d3) {
            this.f28277c = d3;
            return this;
        }
    }

    public ISAdQualityCustomMediationRevenue(ISAdQualityMediationNetwork iSAdQualityMediationNetwork, ISAdQualityAdType iSAdQualityAdType, double d3, String str) {
        this.f28271a = iSAdQualityMediationNetwork;
        this.f28272b = iSAdQualityAdType;
        this.f28273c = d3;
        this.f28274d = str;
    }

    @Deprecated
    public ISAdQualityAdType getAdType() {
        return this.f28272b;
    }

    @Deprecated
    public ISAdQualityMediationNetwork getMediationNetwork() {
        return this.f28271a;
    }

    @Deprecated
    public String getPlacement() {
        return this.f28274d;
    }

    @Deprecated
    public double getRevenue() {
        return this.f28273c;
    }
}
