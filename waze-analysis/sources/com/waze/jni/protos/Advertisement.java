package com.waze.jni.protos;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.AdvilRequest;
import com.waze.jni.protos.VenueData;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class Advertisement extends du<Advertisement, Builder> implements AdvertisementOrBuilder {
    public static final int ADVIL_REQUEST_FIELD_NUMBER = 12;
    public static final int BRAND_ID_FIELD_NUMBER = 4;
    public static final int CHANNEL_FIELD_NUMBER = 1;
    private static final Advertisement DEFAULT_INSTANCE;
    public static final int MENU_ICON_NAME_FIELD_NUMBER = 6;
    public static final int NAVIGABLE_FIELD_NUMBER = 7;
    private static volatile fo<Advertisement> PARSER = null;
    public static final int PIN_ID_FIELD_NUMBER = 2;
    public static final int PREVIEW_ICON_NAME_FIELD_NUMBER = 5;
    public static final int PROMOTION_ID_FIELD_NUMBER = 3;
    public static final int VENUE_DATA_FIELD_NUMBER = 11;
    private AdvilRequest advilRequest_;
    private int bitField0_;
    private boolean navigable_;
    private int pinId_;
    private VenueData venueData_;
    private String channel_ = "";
    private String promotionId_ = "";
    private String brandId_ = "";
    private String previewIconName_ = "";
    private String menuIconName_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.Advertisement$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[dt.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[dt.f12882d.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12883e.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12881c.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12884f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12885g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12879a.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[dt.f12880b.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        Advertisement advertisement = new Advertisement();
        DEFAULT_INSTANCE = advertisement;
        du.registerDefaultInstance(Advertisement.class, advertisement);
    }

    private Advertisement() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdvilRequest() {
        this.advilRequest_ = null;
        this.bitField0_ &= -257;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrandId() {
        this.bitField0_ &= -9;
        this.brandId_ = getDefaultInstance().getBrandId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearChannel() {
        this.bitField0_ &= -2;
        this.channel_ = getDefaultInstance().getChannel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMenuIconName() {
        this.bitField0_ &= -33;
        this.menuIconName_ = getDefaultInstance().getMenuIconName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigable() {
        this.bitField0_ &= -65;
        this.navigable_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinId() {
        this.bitField0_ &= -3;
        this.pinId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewIconName() {
        this.bitField0_ &= -17;
        this.previewIconName_ = getDefaultInstance().getPreviewIconName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPromotionId() {
        this.bitField0_ &= -5;
        this.promotionId_ = getDefaultInstance().getPromotionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueData() {
        this.venueData_ = null;
        this.bitField0_ &= -129;
    }

    public static Advertisement getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdvilRequest(AdvilRequest advilRequest) {
        Objects.requireNonNull(advilRequest);
        AdvilRequest advilRequest2 = this.advilRequest_;
        if (advilRequest2 != null && advilRequest2 != AdvilRequest.getDefaultInstance()) {
            AdvilRequest.Builder builderNewBuilder = AdvilRequest.newBuilder(advilRequest2);
            builderNewBuilder.mergeFrom((AdvilRequest.Builder) advilRequest);
            advilRequest = builderNewBuilder.buildPartial();
        }
        this.advilRequest_ = advilRequest;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVenueData(VenueData venueData) {
        Objects.requireNonNull(venueData);
        VenueData venueData2 = this.venueData_;
        if (venueData2 != null && venueData2 != VenueData.getDefaultInstance()) {
            VenueData.Builder builderNewBuilder = VenueData.newBuilder(venueData2);
            builderNewBuilder.mergeFrom((VenueData.Builder) venueData);
            venueData = builderNewBuilder.buildPartial();
        }
        this.venueData_ = venueData;
        this.bitField0_ |= 128;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Advertisement parseDelimitedFrom(InputStream inputStream) {
        return (Advertisement) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Advertisement parseFrom(v vVar) {
        return (Advertisement) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<Advertisement> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdvilRequest(AdvilRequest advilRequest) {
        Objects.requireNonNull(advilRequest);
        this.advilRequest_ = advilRequest;
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.brandId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrandIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.brandId_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.channel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setChannelBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.channel_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMenuIconName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.menuIconName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMenuIconNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.menuIconName_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigable(boolean z) {
        this.bitField0_ |= 64;
        this.navigable_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinId(int i2) {
        this.bitField0_ |= 2;
        this.pinId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewIconName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.previewIconName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewIconNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.previewIconName_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromotionId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.promotionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPromotionIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.promotionId_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueData(VenueData venueData) {
        Objects.requireNonNull(venueData);
        this.venueData_ = venueData;
        this.bitField0_ |= 128;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\f\t\u0000\u0000\u0000\u0001ለ\u0000\u0002င\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005\u0007ဇ\u0006\u000bဉ\u0007\fဉ\b", new Object[]{"bitField0_", "channel_", "pinId_", "promotionId_", "brandId_", "previewIconName_", "menuIconName_", "navigable_", "venueData_", "advilRequest_"});
        }
        if (iOrdinal == 3) {
            return new Advertisement();
        }
        if (iOrdinal == 4) {
            return new Builder();
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<Advertisement> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (Advertisement.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public AdvilRequest getAdvilRequest() {
        AdvilRequest advilRequest = this.advilRequest_;
        return advilRequest == null ? AdvilRequest.getDefaultInstance() : advilRequest;
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public String getBrandId() {
        return this.brandId_;
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public v getBrandIdBytes() {
        return v.s(this.brandId_);
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public String getChannel() {
        return this.channel_;
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public v getChannelBytes() {
        return v.s(this.channel_);
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public String getMenuIconName() {
        return this.menuIconName_;
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public v getMenuIconNameBytes() {
        return v.s(this.menuIconName_);
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public boolean getNavigable() {
        return this.navigable_;
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public int getPinId() {
        return this.pinId_;
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public String getPreviewIconName() {
        return this.previewIconName_;
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public v getPreviewIconNameBytes() {
        return v.s(this.previewIconName_);
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public String getPromotionId() {
        return this.promotionId_;
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public v getPromotionIdBytes() {
        return v.s(this.promotionId_);
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public VenueData getVenueData() {
        VenueData venueData = this.venueData_;
        return venueData == null ? VenueData.getDefaultInstance() : venueData;
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public boolean hasAdvilRequest() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public boolean hasBrandId() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public boolean hasChannel() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public boolean hasMenuIconName() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public boolean hasNavigable() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public boolean hasPinId() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public boolean hasPreviewIconName() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public boolean hasPromotionId() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.AdvertisementOrBuilder
    public boolean hasVenueData() {
        return (this.bitField0_ & 128) != 0;
    }

    public static Builder newBuilder(Advertisement advertisement) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(advertisement);
    }

    public static Advertisement parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (Advertisement) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Advertisement parseFrom(v vVar, de deVar) {
        return (Advertisement) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static Advertisement parseFrom(z zVar) {
        return (Advertisement) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static Advertisement parseFrom(z zVar, de deVar) {
        return (Advertisement) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static Advertisement parseFrom(InputStream inputStream) {
        return (Advertisement) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Advertisement parseFrom(InputStream inputStream, de deVar) {
        return (Advertisement) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static Advertisement parseFrom(ByteBuffer byteBuffer) {
        return (Advertisement) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Advertisement parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (Advertisement) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<Advertisement, Builder> implements AdvertisementOrBuilder {
        private Builder() {
            super(Advertisement.DEFAULT_INSTANCE);
        }

        public Builder clearAdvilRequest() {
            copyOnWrite();
            ((Advertisement) this.instance).clearAdvilRequest();
            return this;
        }

        public Builder clearBrandId() {
            copyOnWrite();
            ((Advertisement) this.instance).clearBrandId();
            return this;
        }

        public Builder clearChannel() {
            copyOnWrite();
            ((Advertisement) this.instance).clearChannel();
            return this;
        }

        public Builder clearMenuIconName() {
            copyOnWrite();
            ((Advertisement) this.instance).clearMenuIconName();
            return this;
        }

        public Builder clearNavigable() {
            copyOnWrite();
            ((Advertisement) this.instance).clearNavigable();
            return this;
        }

        public Builder clearPinId() {
            copyOnWrite();
            ((Advertisement) this.instance).clearPinId();
            return this;
        }

        public Builder clearPreviewIconName() {
            copyOnWrite();
            ((Advertisement) this.instance).clearPreviewIconName();
            return this;
        }

        public Builder clearPromotionId() {
            copyOnWrite();
            ((Advertisement) this.instance).clearPromotionId();
            return this;
        }

        public Builder clearVenueData() {
            copyOnWrite();
            ((Advertisement) this.instance).clearVenueData();
            return this;
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public AdvilRequest getAdvilRequest() {
            return ((Advertisement) this.instance).getAdvilRequest();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public String getBrandId() {
            return ((Advertisement) this.instance).getBrandId();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public v getBrandIdBytes() {
            return ((Advertisement) this.instance).getBrandIdBytes();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public String getChannel() {
            return ((Advertisement) this.instance).getChannel();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public v getChannelBytes() {
            return ((Advertisement) this.instance).getChannelBytes();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public String getMenuIconName() {
            return ((Advertisement) this.instance).getMenuIconName();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public v getMenuIconNameBytes() {
            return ((Advertisement) this.instance).getMenuIconNameBytes();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public boolean getNavigable() {
            return ((Advertisement) this.instance).getNavigable();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public int getPinId() {
            return ((Advertisement) this.instance).getPinId();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public String getPreviewIconName() {
            return ((Advertisement) this.instance).getPreviewIconName();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public v getPreviewIconNameBytes() {
            return ((Advertisement) this.instance).getPreviewIconNameBytes();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public String getPromotionId() {
            return ((Advertisement) this.instance).getPromotionId();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public v getPromotionIdBytes() {
            return ((Advertisement) this.instance).getPromotionIdBytes();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public VenueData getVenueData() {
            return ((Advertisement) this.instance).getVenueData();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public boolean hasAdvilRequest() {
            return ((Advertisement) this.instance).hasAdvilRequest();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public boolean hasBrandId() {
            return ((Advertisement) this.instance).hasBrandId();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public boolean hasChannel() {
            return ((Advertisement) this.instance).hasChannel();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public boolean hasMenuIconName() {
            return ((Advertisement) this.instance).hasMenuIconName();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public boolean hasNavigable() {
            return ((Advertisement) this.instance).hasNavigable();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public boolean hasPinId() {
            return ((Advertisement) this.instance).hasPinId();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public boolean hasPreviewIconName() {
            return ((Advertisement) this.instance).hasPreviewIconName();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public boolean hasPromotionId() {
            return ((Advertisement) this.instance).hasPromotionId();
        }

        @Override // com.waze.jni.protos.AdvertisementOrBuilder
        public boolean hasVenueData() {
            return ((Advertisement) this.instance).hasVenueData();
        }

        public Builder mergeAdvilRequest(AdvilRequest advilRequest) {
            copyOnWrite();
            ((Advertisement) this.instance).mergeAdvilRequest(advilRequest);
            return this;
        }

        public Builder mergeVenueData(VenueData venueData) {
            copyOnWrite();
            ((Advertisement) this.instance).mergeVenueData(venueData);
            return this;
        }

        public Builder setAdvilRequest(AdvilRequest.Builder builder) {
            copyOnWrite();
            ((Advertisement) this.instance).setAdvilRequest(builder.build());
            return this;
        }

        public Builder setBrandId(String str) {
            copyOnWrite();
            ((Advertisement) this.instance).setBrandId(str);
            return this;
        }

        public Builder setBrandIdBytes(v vVar) {
            copyOnWrite();
            ((Advertisement) this.instance).setBrandIdBytes(vVar);
            return this;
        }

        public Builder setChannel(String str) {
            copyOnWrite();
            ((Advertisement) this.instance).setChannel(str);
            return this;
        }

        public Builder setChannelBytes(v vVar) {
            copyOnWrite();
            ((Advertisement) this.instance).setChannelBytes(vVar);
            return this;
        }

        public Builder setMenuIconName(String str) {
            copyOnWrite();
            ((Advertisement) this.instance).setMenuIconName(str);
            return this;
        }

        public Builder setMenuIconNameBytes(v vVar) {
            copyOnWrite();
            ((Advertisement) this.instance).setMenuIconNameBytes(vVar);
            return this;
        }

        public Builder setNavigable(boolean z) {
            copyOnWrite();
            ((Advertisement) this.instance).setNavigable(z);
            return this;
        }

        public Builder setPinId(int i2) {
            copyOnWrite();
            ((Advertisement) this.instance).setPinId(i2);
            return this;
        }

        public Builder setPreviewIconName(String str) {
            copyOnWrite();
            ((Advertisement) this.instance).setPreviewIconName(str);
            return this;
        }

        public Builder setPreviewIconNameBytes(v vVar) {
            copyOnWrite();
            ((Advertisement) this.instance).setPreviewIconNameBytes(vVar);
            return this;
        }

        public Builder setPromotionId(String str) {
            copyOnWrite();
            ((Advertisement) this.instance).setPromotionId(str);
            return this;
        }

        public Builder setPromotionIdBytes(v vVar) {
            copyOnWrite();
            ((Advertisement) this.instance).setPromotionIdBytes(vVar);
            return this;
        }

        public Builder setVenueData(VenueData.Builder builder) {
            copyOnWrite();
            ((Advertisement) this.instance).setVenueData(builder.build());
            return this;
        }

        public Builder setAdvilRequest(AdvilRequest advilRequest) {
            copyOnWrite();
            ((Advertisement) this.instance).setAdvilRequest(advilRequest);
            return this;
        }

        public Builder setVenueData(VenueData venueData) {
            copyOnWrite();
            ((Advertisement) this.instance).setVenueData(venueData);
            return this;
        }
    }

    public static Advertisement parseFrom(byte[] bArr) {
        return (Advertisement) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Advertisement parseFrom(byte[] bArr, de deVar) {
        return (Advertisement) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
