package com.waze.jni.protos.navigate;

import com.waze.jni.protos.navigate.TollPriceInformation;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TollPriceInformationKt {
    public static final TollPriceInformationKt INSTANCE = new TollPriceInformationKt();

    private TollPriceInformationKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final TollPriceInformation.Builder _builder;

        private Dsl(TollPriceInformation.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ TollPriceInformation _build() {
            TollPriceInformation tollPriceInformationBuild = this._builder.build();
            x.e(tollPriceInformationBuild, "build(...)");
            return tollPriceInformationBuild;
        }

        public final void clearActionUrl() {
            this._builder.clearActionUrl();
        }

        public final void clearPassBasedMissingPassName() {
            this._builder.clearPassBasedMissingPassName();
        }

        public final void clearPassBasedPriceChangeToPrice() {
            this._builder.clearPassBasedPriceChangeToPrice();
        }

        public final void clearPassBasedUserPassName() {
            this._builder.clearPassBasedUserPassName();
        }

        public final void clearPopupId() {
            this._builder.clearPopupId();
        }

        public final void clearTimeBasedPriceChangeAtSeconds() {
            this._builder.clearTimeBasedPriceChangeAtSeconds();
        }

        public final void clearTimeBasedPriceChangeToPrice() {
            this._builder.clearTimeBasedPriceChangeToPrice();
        }

        public final void clearTollCurrencyCode() {
            this._builder.clearTollCurrencyCode();
        }

        public final void clearTollPrice() {
            this._builder.clearTollPrice();
        }

        public final void clearTollRoadName() {
            this._builder.clearTollRoadName();
        }

        public final String getActionUrl() {
            String actionUrl = this._builder.getActionUrl();
            x.e(actionUrl, "getActionUrl(...)");
            return actionUrl;
        }

        public final String getPassBasedMissingPassName() {
            String passBasedMissingPassName = this._builder.getPassBasedMissingPassName();
            x.e(passBasedMissingPassName, "getPassBasedMissingPassName(...)");
            return passBasedMissingPassName;
        }

        public final double getPassBasedPriceChangeToPrice() {
            return this._builder.getPassBasedPriceChangeToPrice();
        }

        public final String getPassBasedUserPassName() {
            String passBasedUserPassName = this._builder.getPassBasedUserPassName();
            x.e(passBasedUserPassName, "getPassBasedUserPassName(...)");
            return passBasedUserPassName;
        }

        public final int getPopupId() {
            return this._builder.getPopupId();
        }

        public final double getTimeBasedPriceChangeAtSeconds() {
            return this._builder.getTimeBasedPriceChangeAtSeconds();
        }

        public final double getTimeBasedPriceChangeToPrice() {
            return this._builder.getTimeBasedPriceChangeToPrice();
        }

        public final String getTollCurrencyCode() {
            String tollCurrencyCode = this._builder.getTollCurrencyCode();
            x.e(tollCurrencyCode, "getTollCurrencyCode(...)");
            return tollCurrencyCode;
        }

        public final double getTollPrice() {
            return this._builder.getTollPrice();
        }

        public final String getTollRoadName() {
            String tollRoadName = this._builder.getTollRoadName();
            x.e(tollRoadName, "getTollRoadName(...)");
            return tollRoadName;
        }

        public final boolean hasActionUrl() {
            return this._builder.hasActionUrl();
        }

        public final boolean hasPassBasedMissingPassName() {
            return this._builder.hasPassBasedMissingPassName();
        }

        public final boolean hasPassBasedPriceChangeToPrice() {
            return this._builder.hasPassBasedPriceChangeToPrice();
        }

        public final boolean hasPassBasedUserPassName() {
            return this._builder.hasPassBasedUserPassName();
        }

        public final boolean hasPopupId() {
            return this._builder.hasPopupId();
        }

        public final boolean hasTimeBasedPriceChangeAtSeconds() {
            return this._builder.hasTimeBasedPriceChangeAtSeconds();
        }

        public final boolean hasTimeBasedPriceChangeToPrice() {
            return this._builder.hasTimeBasedPriceChangeToPrice();
        }

        public final boolean hasTollCurrencyCode() {
            return this._builder.hasTollCurrencyCode();
        }

        public final boolean hasTollPrice() {
            return this._builder.hasTollPrice();
        }

        public final boolean hasTollRoadName() {
            return this._builder.hasTollRoadName();
        }

        public final void setActionUrl(String str) {
            x.f(str, "value");
            this._builder.setActionUrl(str);
        }

        public final void setPassBasedMissingPassName(String str) {
            x.f(str, "value");
            this._builder.setPassBasedMissingPassName(str);
        }

        public final void setPassBasedPriceChangeToPrice(double d2) {
            this._builder.setPassBasedPriceChangeToPrice(d2);
        }

        public final void setPassBasedUserPassName(String str) {
            x.f(str, "value");
            this._builder.setPassBasedUserPassName(str);
        }

        public final void setPopupId(int i2) {
            this._builder.setPopupId(i2);
        }

        public final void setTimeBasedPriceChangeAtSeconds(double d2) {
            this._builder.setTimeBasedPriceChangeAtSeconds(d2);
        }

        public final void setTimeBasedPriceChangeToPrice(double d2) {
            this._builder.setTimeBasedPriceChangeToPrice(d2);
        }

        public final void setTollCurrencyCode(String str) {
            x.f(str, "value");
            this._builder.setTollCurrencyCode(str);
        }

        public final void setTollPrice(double d2) {
            this._builder.setTollPrice(d2);
        }

        public final void setTollRoadName(String str) {
            x.f(str, "value");
            this._builder.setTollRoadName(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(TollPriceInformation.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(TollPriceInformation.Builder builder, o oVar) {
            this(builder);
        }
    }
}
