package com.waze.jni.protos;

import com.waze.jni.protos.PinAdDisplay;
import com.waze.jni.protos.Position;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PinAdDisplayKt {
    public static final PinAdDisplayKt INSTANCE = new PinAdDisplayKt();

    private PinAdDisplayKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final PinAdDisplay.Builder _builder;

        private Dsl(PinAdDisplay.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ PinAdDisplay _build() {
            PinAdDisplay pinAdDisplayBuild = this._builder.build();
            x.e(pinAdDisplayBuild, "build(...)");
            return pinAdDisplayBuild;
        }

        public final void clearAboutThisAdUrl() {
            this._builder.clearAboutThisAdUrl();
        }

        public final void clearAdBody() {
            this._builder.clearAdBody();
        }

        public final void clearAdId() {
            this._builder.clearAdId();
        }

        public final void clearAdText() {
            this._builder.clearAdText();
        }

        public final void clearBusinessName() {
            this._builder.clearBusinessName();
        }

        public final void clearClickUrl() {
            this._builder.clearClickUrl();
        }

        public final void clearCtaMessage() {
            this._builder.clearCtaMessage();
        }

        public final void clearIsTest() {
            this._builder.clearIsTest();
        }

        public final void clearLogoImageUrl() {
            this._builder.clearLogoImageUrl();
        }

        public final void clearOpenStatus() {
            this._builder.clearOpenStatus();
        }

        public final void clearPinIconUrl() {
            this._builder.clearPinIconUrl();
        }

        public final void clearPlaceId() {
            this._builder.clearPlaceId();
        }

        public final void clearPosition() {
            this._builder.clearPosition();
        }

        public final void clearRating() {
            this._builder.clearRating();
        }

        public final void clearTrackAddStopUrl() {
            this._builder.clearTrackAddStopUrl();
        }

        public final void clearVisibleUrl() {
            this._builder.clearVisibleUrl();
        }

        public final String getAboutThisAdUrl() {
            String aboutThisAdUrl = this._builder.getAboutThisAdUrl();
            x.e(aboutThisAdUrl, "getAboutThisAdUrl(...)");
            return aboutThisAdUrl;
        }

        public final String getAdBody() {
            String adBody = this._builder.getAdBody();
            x.e(adBody, "getAdBody(...)");
            return adBody;
        }

        public final String getAdId() {
            String adId = this._builder.getAdId();
            x.e(adId, "getAdId(...)");
            return adId;
        }

        public final String getAdText() {
            String adText = this._builder.getAdText();
            x.e(adText, "getAdText(...)");
            return adText;
        }

        public final String getBusinessName() {
            String businessName = this._builder.getBusinessName();
            x.e(businessName, "getBusinessName(...)");
            return businessName;
        }

        public final String getClickUrl() {
            String clickUrl = this._builder.getClickUrl();
            x.e(clickUrl, "getClickUrl(...)");
            return clickUrl;
        }

        public final String getCtaMessage() {
            String ctaMessage = this._builder.getCtaMessage();
            x.e(ctaMessage, "getCtaMessage(...)");
            return ctaMessage;
        }

        public final boolean getIsTest() {
            return this._builder.getIsTest();
        }

        public final String getLogoImageUrl() {
            String logoImageUrl = this._builder.getLogoImageUrl();
            x.e(logoImageUrl, "getLogoImageUrl(...)");
            return logoImageUrl;
        }

        public final PinAdDisplay.OpenStatus getOpenStatus() {
            PinAdDisplay.OpenStatus openStatus = this._builder.getOpenStatus();
            x.e(openStatus, "getOpenStatus(...)");
            return openStatus;
        }

        public final int getOpenStatusValue() {
            return this._builder.getOpenStatusValue();
        }

        public final String getPinIconUrl() {
            String pinIconUrl = this._builder.getPinIconUrl();
            x.e(pinIconUrl, "getPinIconUrl(...)");
            return pinIconUrl;
        }

        public final String getPlaceId() {
            String placeId = this._builder.getPlaceId();
            x.e(placeId, "getPlaceId(...)");
            return placeId;
        }

        public final Position.IntPosition getPosition() {
            Position.IntPosition position = this._builder.getPosition();
            x.e(position, "getPosition(...)");
            return position;
        }

        public final Position.IntPosition getPositionOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return PinAdDisplayKtKt.getPositionOrNull(dsl._builder);
        }

        public final float getRating() {
            return this._builder.getRating();
        }

        public final String getTrackAddStopUrl() {
            String trackAddStopUrl = this._builder.getTrackAddStopUrl();
            x.e(trackAddStopUrl, "getTrackAddStopUrl(...)");
            return trackAddStopUrl;
        }

        public final String getVisibleUrl() {
            String visibleUrl = this._builder.getVisibleUrl();
            x.e(visibleUrl, "getVisibleUrl(...)");
            return visibleUrl;
        }

        public final boolean hasPosition() {
            return this._builder.hasPosition();
        }

        public final boolean hasRating() {
            return this._builder.hasRating();
        }

        public final void setAboutThisAdUrl(String str) {
            x.f(str, "value");
            this._builder.setAboutThisAdUrl(str);
        }

        public final void setAdBody(String str) {
            x.f(str, "value");
            this._builder.setAdBody(str);
        }

        public final void setAdId(String str) {
            x.f(str, "value");
            this._builder.setAdId(str);
        }

        public final void setAdText(String str) {
            x.f(str, "value");
            this._builder.setAdText(str);
        }

        public final void setBusinessName(String str) {
            x.f(str, "value");
            this._builder.setBusinessName(str);
        }

        public final void setClickUrl(String str) {
            x.f(str, "value");
            this._builder.setClickUrl(str);
        }

        public final void setCtaMessage(String str) {
            x.f(str, "value");
            this._builder.setCtaMessage(str);
        }

        public final void setIsTest(boolean z) {
            this._builder.setIsTest(z);
        }

        public final void setLogoImageUrl(String str) {
            x.f(str, "value");
            this._builder.setLogoImageUrl(str);
        }

        public final void setOpenStatus(PinAdDisplay.OpenStatus openStatus) {
            x.f(openStatus, "value");
            this._builder.setOpenStatus(openStatus);
        }

        public final void setOpenStatusValue(int i2) {
            this._builder.setOpenStatusValue(i2);
        }

        public final void setPinIconUrl(String str) {
            x.f(str, "value");
            this._builder.setPinIconUrl(str);
        }

        public final void setPlaceId(String str) {
            x.f(str, "value");
            this._builder.setPlaceId(str);
        }

        public final void setPosition(Position.IntPosition intPosition) {
            x.f(intPosition, "value");
            this._builder.setPosition(intPosition);
        }

        public final void setRating(float f2) {
            this._builder.setRating(f2);
        }

        public final void setTrackAddStopUrl(String str) {
            x.f(str, "value");
            this._builder.setTrackAddStopUrl(str);
        }

        public final void setVisibleUrl(String str) {
            x.f(str, "value");
            this._builder.setVisibleUrl(str);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(PinAdDisplay.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(PinAdDisplay.Builder builder, o oVar) {
            this(builder);
        }
    }
}
