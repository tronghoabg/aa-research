package com.waze.jni.protos;

import com.waze.jni.protos.Advertisement;
import h.g.b.o;
import h.g.b.x;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class AdvertisementKt {
    public static final AdvertisementKt INSTANCE = new AdvertisementKt();

    private AdvertisementKt() {
    }

    /* compiled from: WazeSource */
    public final class Dsl {
        public static final Companion Companion = new Companion(null);
        private final Advertisement.Builder _builder;

        private Dsl(Advertisement.Builder builder) {
            this._builder = builder;
        }

        public final /* synthetic */ Advertisement _build() {
            Advertisement advertisementBuild = this._builder.build();
            x.e(advertisementBuild, "build(...)");
            return advertisementBuild;
        }

        public final void clearAdvilRequest() {
            this._builder.clearAdvilRequest();
        }

        public final void clearBrandId() {
            this._builder.clearBrandId();
        }

        public final void clearChannel() {
            this._builder.clearChannel();
        }

        public final void clearMenuIconName() {
            this._builder.clearMenuIconName();
        }

        public final void clearNavigable() {
            this._builder.clearNavigable();
        }

        public final void clearPinId() {
            this._builder.clearPinId();
        }

        public final void clearPreviewIconName() {
            this._builder.clearPreviewIconName();
        }

        public final void clearPromotionId() {
            this._builder.clearPromotionId();
        }

        public final void clearVenueData() {
            this._builder.clearVenueData();
        }

        public final AdvilRequest getAdvilRequest() {
            AdvilRequest advilRequest = this._builder.getAdvilRequest();
            x.e(advilRequest, "getAdvilRequest(...)");
            return advilRequest;
        }

        public final AdvilRequest getAdvilRequestOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return AdvertisementKtKt.getAdvilRequestOrNull(dsl._builder);
        }

        public final String getBrandId() {
            String brandId = this._builder.getBrandId();
            x.e(brandId, "getBrandId(...)");
            return brandId;
        }

        public final String getChannel() {
            String channel = this._builder.getChannel();
            x.e(channel, "getChannel(...)");
            return channel;
        }

        public final String getMenuIconName() {
            String menuIconName = this._builder.getMenuIconName();
            x.e(menuIconName, "getMenuIconName(...)");
            return menuIconName;
        }

        public final boolean getNavigable() {
            return this._builder.getNavigable();
        }

        public final int getPinId() {
            return this._builder.getPinId();
        }

        public final String getPreviewIconName() {
            String previewIconName = this._builder.getPreviewIconName();
            x.e(previewIconName, "getPreviewIconName(...)");
            return previewIconName;
        }

        public final String getPromotionId() {
            String promotionId = this._builder.getPromotionId();
            x.e(promotionId, "getPromotionId(...)");
            return promotionId;
        }

        public final VenueData getVenueData() {
            VenueData venueData = this._builder.getVenueData();
            x.e(venueData, "getVenueData(...)");
            return venueData;
        }

        public final VenueData getVenueDataOrNull(Dsl dsl) {
            x.f(dsl, "<this>");
            return AdvertisementKtKt.getVenueDataOrNull(dsl._builder);
        }

        public final boolean hasAdvilRequest() {
            return this._builder.hasAdvilRequest();
        }

        public final boolean hasBrandId() {
            return this._builder.hasBrandId();
        }

        public final boolean hasChannel() {
            return this._builder.hasChannel();
        }

        public final boolean hasMenuIconName() {
            return this._builder.hasMenuIconName();
        }

        public final boolean hasNavigable() {
            return this._builder.hasNavigable();
        }

        public final boolean hasPinId() {
            return this._builder.hasPinId();
        }

        public final boolean hasPreviewIconName() {
            return this._builder.hasPreviewIconName();
        }

        public final boolean hasPromotionId() {
            return this._builder.hasPromotionId();
        }

        public final boolean hasVenueData() {
            return this._builder.hasVenueData();
        }

        public final void setAdvilRequest(AdvilRequest advilRequest) {
            x.f(advilRequest, "value");
            this._builder.setAdvilRequest(advilRequest);
        }

        public final void setBrandId(String str) {
            x.f(str, "value");
            this._builder.setBrandId(str);
        }

        public final void setChannel(String str) {
            x.f(str, "value");
            this._builder.setChannel(str);
        }

        public final void setMenuIconName(String str) {
            x.f(str, "value");
            this._builder.setMenuIconName(str);
        }

        public final void setNavigable(boolean z) {
            this._builder.setNavigable(z);
        }

        public final void setPinId(int i2) {
            this._builder.setPinId(i2);
        }

        public final void setPreviewIconName(String str) {
            x.f(str, "value");
            this._builder.setPreviewIconName(str);
        }

        public final void setPromotionId(String str) {
            x.f(str, "value");
            this._builder.setPromotionId(str);
        }

        public final void setVenueData(VenueData venueData) {
            x.f(venueData, "value");
            this._builder.setVenueData(venueData);
        }

        /* compiled from: WazeSource */
        public final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Dsl _create(Advertisement.Builder builder) {
                x.f(builder, "builder");
                return new Dsl(builder, null);
            }

            public /* synthetic */ Companion(o oVar) {
                this();
            }
        }

        public /* synthetic */ Dsl(Advertisement.Builder builder, o oVar) {
            this(builder);
        }
    }
}
