package com.waze.jni.protos;

import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eg;
import com.google.v.eh;
import com.google.v.ei;
import com.google.v.ep;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import com.waze.jni.protos.Position;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class PinAdDisplay extends du<PinAdDisplay, Builder> implements PinAdDisplayOrBuilder {
    public static final int ABOUT_THIS_AD_URL_FIELD_NUMBER = 15;
    public static final int AD_BODY_FIELD_NUMBER = 6;
    public static final int AD_ID_FIELD_NUMBER = 1;
    public static final int AD_TEXT_FIELD_NUMBER = 5;
    public static final int BUSINESS_NAME_FIELD_NUMBER = 3;
    public static final int CLICK_URL_FIELD_NUMBER = 9;
    public static final int CTA_MESSAGE_FIELD_NUMBER = 8;
    private static final PinAdDisplay DEFAULT_INSTANCE;
    public static final int IS_TEST_FIELD_NUMBER = 17;
    public static final int LOGO_IMAGE_URL_FIELD_NUMBER = 7;
    public static final int OPEN_STATUS_FIELD_NUMBER = 13;
    private static volatile fo<PinAdDisplay> PARSER = null;
    public static final int PIN_ICON_URL_FIELD_NUMBER = 14;
    public static final int PLACE_ID_FIELD_NUMBER = 2;
    public static final int POSITION_FIELD_NUMBER = 4;
    public static final int RATING_FIELD_NUMBER = 12;
    public static final int TRACK_ADD_STOP_URL_FIELD_NUMBER = 16;
    public static final int VISIBLE_URL_FIELD_NUMBER = 10;
    private int bitField0_;
    private boolean isTest_;
    private int openStatus_;
    private Position.IntPosition position_;
    private float rating_;
    private String adId_ = "";
    private String placeId_ = "";
    private String businessName_ = "";
    private String adText_ = "";
    private String adBody_ = "";
    private String logoImageUrl_ = "";
    private String ctaMessage_ = "";
    private String clickUrl_ = "";
    private String visibleUrl_ = "";
    private String pinIconUrl_ = "";
    private String aboutThisAdUrl_ = "";
    private String trackAddStopUrl_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.PinAdDisplay$1, reason: invalid class name */
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

    /* compiled from: WazeSource */
    public enum OpenStatus implements eg {
        STATUS_UNSPECIFIED(0),
        OPEN(1),
        OPENS_SOON(2),
        CLOSED(3),
        CLOSES_SOON(4),
        UNRECOGNIZED(-1);

        public static final int CLOSED_VALUE = 3;
        public static final int CLOSES_SOON_VALUE = 4;
        public static final int OPENS_SOON_VALUE = 2;
        public static final int OPEN_VALUE = 1;
        public static final int STATUS_UNSPECIFIED_VALUE = 0;
        private static final eh<OpenStatus> internalValueMap = new eh<OpenStatus>() { // from class: com.waze.jni.protos.PinAdDisplay.OpenStatus.1
            @Override // com.google.v.eh
            public OpenStatus findValueByNumber(int i2) {
                return OpenStatus.forNumber(i2);
            }
        };
        private final int value;

        /* compiled from: WazeSource */
        final class OpenStatusVerifier implements ei {
            static final ei INSTANCE = new OpenStatusVerifier();

            private OpenStatusVerifier() {
            }

            @Override // com.google.v.ei
            public boolean isInRange(int i2) {
                return OpenStatus.forNumber(i2) != null;
            }
        }

        OpenStatus(int i2) {
            this.value = i2;
        }

        public static OpenStatus forNumber(int i2) {
            if (i2 == 0) {
                return STATUS_UNSPECIFIED;
            }
            if (i2 == 1) {
                return OPEN;
            }
            if (i2 == 2) {
                return OPENS_SOON;
            }
            if (i2 == 3) {
                return CLOSED;
            }
            if (i2 != 4) {
                return null;
            }
            return CLOSES_SOON;
        }

        public static eh<OpenStatus> internalGetValueMap() {
            return internalValueMap;
        }

        public static ei internalGetVerifier() {
            return OpenStatusVerifier.INSTANCE;
        }

        @Override // com.google.v.eg
        public final int getNumber() {
            return this == UNRECOGNIZED ? ep.b() : this.value;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return Integer.toString(this.value);
        }
    }

    static {
        PinAdDisplay pinAdDisplay = new PinAdDisplay();
        DEFAULT_INSTANCE = pinAdDisplay;
        du.registerDefaultInstance(PinAdDisplay.class, pinAdDisplay);
    }

    private PinAdDisplay() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAboutThisAdUrl() {
        this.aboutThisAdUrl_ = getDefaultInstance().getAboutThisAdUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdBody() {
        this.adBody_ = getDefaultInstance().getAdBody();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdId() {
        this.adId_ = getDefaultInstance().getAdId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdText() {
        this.adText_ = getDefaultInstance().getAdText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBusinessName() {
        this.businessName_ = getDefaultInstance().getBusinessName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClickUrl() {
        this.clickUrl_ = getDefaultInstance().getClickUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCtaMessage() {
        this.ctaMessage_ = getDefaultInstance().getCtaMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsTest() {
        this.isTest_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogoImageUrl() {
        this.logoImageUrl_ = getDefaultInstance().getLogoImageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpenStatus() {
        this.openStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinIconUrl() {
        this.pinIconUrl_ = getDefaultInstance().getPinIconUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaceId() {
        this.placeId_ = getDefaultInstance().getPlaceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRating() {
        this.bitField0_ &= -3;
        this.rating_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrackAddStopUrl() {
        this.trackAddStopUrl_ = getDefaultInstance().getTrackAddStopUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVisibleUrl() {
        this.visibleUrl_ = getDefaultInstance().getVisibleUrl();
    }

    public static PinAdDisplay getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        Position.IntPosition intPosition2 = this.position_;
        if (intPosition2 != null && intPosition2 != Position.IntPosition.getDefaultInstance()) {
            Position.IntPosition.Builder builderNewBuilder = Position.IntPosition.newBuilder(intPosition2);
            builderNewBuilder.mergeFrom((Position.IntPosition.Builder) intPosition);
            intPosition = builderNewBuilder.buildPartial();
        }
        this.position_ = intPosition;
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static PinAdDisplay parseDelimitedFrom(InputStream inputStream) {
        return (PinAdDisplay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PinAdDisplay parseFrom(v vVar) {
        return (PinAdDisplay) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<PinAdDisplay> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAboutThisAdUrl(String str) {
        Objects.requireNonNull(str);
        this.aboutThisAdUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAboutThisAdUrlBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.aboutThisAdUrl_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdBody(String str) {
        Objects.requireNonNull(str);
        this.adBody_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdBodyBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.adBody_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdId(String str) {
        Objects.requireNonNull(str);
        this.adId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.adId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdText(String str) {
        Objects.requireNonNull(str);
        this.adText_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdTextBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.adText_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBusinessName(String str) {
        Objects.requireNonNull(str);
        this.businessName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBusinessNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.businessName_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickUrl(String str) {
        Objects.requireNonNull(str);
        this.clickUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickUrlBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.clickUrl_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtaMessage(String str) {
        Objects.requireNonNull(str);
        this.ctaMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtaMessageBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.ctaMessage_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsTest(boolean z) {
        this.isTest_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogoImageUrl(String str) {
        Objects.requireNonNull(str);
        this.logoImageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogoImageUrlBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.logoImageUrl_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenStatus(OpenStatus openStatus) {
        this.openStatus_ = openStatus.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenStatusValue(int i2) {
        this.openStatus_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinIconUrl(String str) {
        Objects.requireNonNull(str);
        this.pinIconUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinIconUrlBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.pinIconUrl_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaceId(String str) {
        Objects.requireNonNull(str);
        this.placeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaceIdBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.placeId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(Position.IntPosition intPosition) {
        Objects.requireNonNull(intPosition);
        this.position_ = intPosition;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRating(float f2) {
        this.bitField0_ |= 2;
        this.rating_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackAddStopUrl(String str) {
        Objects.requireNonNull(str);
        this.trackAddStopUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrackAddStopUrlBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.trackAddStopUrl_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisibleUrl(String str) {
        Objects.requireNonNull(str);
        this.visibleUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisibleUrlBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.visibleUrl_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0010\u0000\u0001\u0001\u0011\u0010\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003Ȉ\u0004ဉ\u0000\u0005Ȉ\u0006Ȉ\u0007Ȉ\bȈ\tȈ\nȈ\fခ\u0001\r\f\u000eȈ\u000fȈ\u0010Ȉ\u0011\u0007", new Object[]{"bitField0_", "adId_", "placeId_", "businessName_", "position_", "adText_", "adBody_", "logoImageUrl_", "ctaMessage_", "clickUrl_", "visibleUrl_", "rating_", "openStatus_", "pinIconUrl_", "aboutThisAdUrl_", "trackAddStopUrl_", "isTest_"});
        }
        if (iOrdinal == 3) {
            return new PinAdDisplay();
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
        fo<PinAdDisplay> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (PinAdDisplay.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public String getAboutThisAdUrl() {
        return this.aboutThisAdUrl_;
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public v getAboutThisAdUrlBytes() {
        return v.s(this.aboutThisAdUrl_);
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public String getAdBody() {
        return this.adBody_;
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public v getAdBodyBytes() {
        return v.s(this.adBody_);
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public String getAdId() {
        return this.adId_;
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public v getAdIdBytes() {
        return v.s(this.adId_);
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public String getAdText() {
        return this.adText_;
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public v getAdTextBytes() {
        return v.s(this.adText_);
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public String getBusinessName() {
        return this.businessName_;
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public v getBusinessNameBytes() {
        return v.s(this.businessName_);
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public String getClickUrl() {
        return this.clickUrl_;
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public v getClickUrlBytes() {
        return v.s(this.clickUrl_);
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public String getCtaMessage() {
        return this.ctaMessage_;
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public v getCtaMessageBytes() {
        return v.s(this.ctaMessage_);
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public boolean getIsTest() {
        return this.isTest_;
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public String getLogoImageUrl() {
        return this.logoImageUrl_;
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public v getLogoImageUrlBytes() {
        return v.s(this.logoImageUrl_);
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public OpenStatus getOpenStatus() {
        OpenStatus openStatusForNumber = OpenStatus.forNumber(this.openStatus_);
        return openStatusForNumber == null ? OpenStatus.UNRECOGNIZED : openStatusForNumber;
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public int getOpenStatusValue() {
        return this.openStatus_;
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public String getPinIconUrl() {
        return this.pinIconUrl_;
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public v getPinIconUrlBytes() {
        return v.s(this.pinIconUrl_);
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public String getPlaceId() {
        return this.placeId_;
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public v getPlaceIdBytes() {
        return v.s(this.placeId_);
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public Position.IntPosition getPosition() {
        Position.IntPosition intPosition = this.position_;
        return intPosition == null ? Position.IntPosition.getDefaultInstance() : intPosition;
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public float getRating() {
        return this.rating_;
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public String getTrackAddStopUrl() {
        return this.trackAddStopUrl_;
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public v getTrackAddStopUrlBytes() {
        return v.s(this.trackAddStopUrl_);
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public String getVisibleUrl() {
        return this.visibleUrl_;
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public v getVisibleUrlBytes() {
        return v.s(this.visibleUrl_);
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public boolean hasPosition() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
    public boolean hasRating() {
        return (this.bitField0_ & 2) != 0;
    }

    public static Builder newBuilder(PinAdDisplay pinAdDisplay) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(pinAdDisplay);
    }

    public static PinAdDisplay parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (PinAdDisplay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static PinAdDisplay parseFrom(v vVar, de deVar) {
        return (PinAdDisplay) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static PinAdDisplay parseFrom(z zVar) {
        return (PinAdDisplay) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static PinAdDisplay parseFrom(z zVar, de deVar) {
        return (PinAdDisplay) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static PinAdDisplay parseFrom(InputStream inputStream) {
        return (PinAdDisplay) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static PinAdDisplay parseFrom(InputStream inputStream, de deVar) {
        return (PinAdDisplay) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static PinAdDisplay parseFrom(ByteBuffer byteBuffer) {
        return (PinAdDisplay) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static PinAdDisplay parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (PinAdDisplay) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    /* compiled from: WazeSource */
    public final class Builder extends dm<PinAdDisplay, Builder> implements PinAdDisplayOrBuilder {
        private Builder() {
            super(PinAdDisplay.DEFAULT_INSTANCE);
        }

        public Builder clearAboutThisAdUrl() {
            copyOnWrite();
            ((PinAdDisplay) this.instance).clearAboutThisAdUrl();
            return this;
        }

        public Builder clearAdBody() {
            copyOnWrite();
            ((PinAdDisplay) this.instance).clearAdBody();
            return this;
        }

        public Builder clearAdId() {
            copyOnWrite();
            ((PinAdDisplay) this.instance).clearAdId();
            return this;
        }

        public Builder clearAdText() {
            copyOnWrite();
            ((PinAdDisplay) this.instance).clearAdText();
            return this;
        }

        public Builder clearBusinessName() {
            copyOnWrite();
            ((PinAdDisplay) this.instance).clearBusinessName();
            return this;
        }

        public Builder clearClickUrl() {
            copyOnWrite();
            ((PinAdDisplay) this.instance).clearClickUrl();
            return this;
        }

        public Builder clearCtaMessage() {
            copyOnWrite();
            ((PinAdDisplay) this.instance).clearCtaMessage();
            return this;
        }

        public Builder clearIsTest() {
            copyOnWrite();
            ((PinAdDisplay) this.instance).clearIsTest();
            return this;
        }

        public Builder clearLogoImageUrl() {
            copyOnWrite();
            ((PinAdDisplay) this.instance).clearLogoImageUrl();
            return this;
        }

        public Builder clearOpenStatus() {
            copyOnWrite();
            ((PinAdDisplay) this.instance).clearOpenStatus();
            return this;
        }

        public Builder clearPinIconUrl() {
            copyOnWrite();
            ((PinAdDisplay) this.instance).clearPinIconUrl();
            return this;
        }

        public Builder clearPlaceId() {
            copyOnWrite();
            ((PinAdDisplay) this.instance).clearPlaceId();
            return this;
        }

        public Builder clearPosition() {
            copyOnWrite();
            ((PinAdDisplay) this.instance).clearPosition();
            return this;
        }

        public Builder clearRating() {
            copyOnWrite();
            ((PinAdDisplay) this.instance).clearRating();
            return this;
        }

        public Builder clearTrackAddStopUrl() {
            copyOnWrite();
            ((PinAdDisplay) this.instance).clearTrackAddStopUrl();
            return this;
        }

        public Builder clearVisibleUrl() {
            copyOnWrite();
            ((PinAdDisplay) this.instance).clearVisibleUrl();
            return this;
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public String getAboutThisAdUrl() {
            return ((PinAdDisplay) this.instance).getAboutThisAdUrl();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public v getAboutThisAdUrlBytes() {
            return ((PinAdDisplay) this.instance).getAboutThisAdUrlBytes();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public String getAdBody() {
            return ((PinAdDisplay) this.instance).getAdBody();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public v getAdBodyBytes() {
            return ((PinAdDisplay) this.instance).getAdBodyBytes();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public String getAdId() {
            return ((PinAdDisplay) this.instance).getAdId();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public v getAdIdBytes() {
            return ((PinAdDisplay) this.instance).getAdIdBytes();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public String getAdText() {
            return ((PinAdDisplay) this.instance).getAdText();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public v getAdTextBytes() {
            return ((PinAdDisplay) this.instance).getAdTextBytes();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public String getBusinessName() {
            return ((PinAdDisplay) this.instance).getBusinessName();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public v getBusinessNameBytes() {
            return ((PinAdDisplay) this.instance).getBusinessNameBytes();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public String getClickUrl() {
            return ((PinAdDisplay) this.instance).getClickUrl();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public v getClickUrlBytes() {
            return ((PinAdDisplay) this.instance).getClickUrlBytes();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public String getCtaMessage() {
            return ((PinAdDisplay) this.instance).getCtaMessage();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public v getCtaMessageBytes() {
            return ((PinAdDisplay) this.instance).getCtaMessageBytes();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public boolean getIsTest() {
            return ((PinAdDisplay) this.instance).getIsTest();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public String getLogoImageUrl() {
            return ((PinAdDisplay) this.instance).getLogoImageUrl();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public v getLogoImageUrlBytes() {
            return ((PinAdDisplay) this.instance).getLogoImageUrlBytes();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public OpenStatus getOpenStatus() {
            return ((PinAdDisplay) this.instance).getOpenStatus();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public int getOpenStatusValue() {
            return ((PinAdDisplay) this.instance).getOpenStatusValue();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public String getPinIconUrl() {
            return ((PinAdDisplay) this.instance).getPinIconUrl();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public v getPinIconUrlBytes() {
            return ((PinAdDisplay) this.instance).getPinIconUrlBytes();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public String getPlaceId() {
            return ((PinAdDisplay) this.instance).getPlaceId();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public v getPlaceIdBytes() {
            return ((PinAdDisplay) this.instance).getPlaceIdBytes();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public Position.IntPosition getPosition() {
            return ((PinAdDisplay) this.instance).getPosition();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public float getRating() {
            return ((PinAdDisplay) this.instance).getRating();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public String getTrackAddStopUrl() {
            return ((PinAdDisplay) this.instance).getTrackAddStopUrl();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public v getTrackAddStopUrlBytes() {
            return ((PinAdDisplay) this.instance).getTrackAddStopUrlBytes();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public String getVisibleUrl() {
            return ((PinAdDisplay) this.instance).getVisibleUrl();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public v getVisibleUrlBytes() {
            return ((PinAdDisplay) this.instance).getVisibleUrlBytes();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public boolean hasPosition() {
            return ((PinAdDisplay) this.instance).hasPosition();
        }

        @Override // com.waze.jni.protos.PinAdDisplayOrBuilder
        public boolean hasRating() {
            return ((PinAdDisplay) this.instance).hasRating();
        }

        public Builder mergePosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).mergePosition(intPosition);
            return this;
        }

        public Builder setAboutThisAdUrl(String str) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setAboutThisAdUrl(str);
            return this;
        }

        public Builder setAboutThisAdUrlBytes(v vVar) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setAboutThisAdUrlBytes(vVar);
            return this;
        }

        public Builder setAdBody(String str) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setAdBody(str);
            return this;
        }

        public Builder setAdBodyBytes(v vVar) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setAdBodyBytes(vVar);
            return this;
        }

        public Builder setAdId(String str) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setAdId(str);
            return this;
        }

        public Builder setAdIdBytes(v vVar) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setAdIdBytes(vVar);
            return this;
        }

        public Builder setAdText(String str) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setAdText(str);
            return this;
        }

        public Builder setAdTextBytes(v vVar) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setAdTextBytes(vVar);
            return this;
        }

        public Builder setBusinessName(String str) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setBusinessName(str);
            return this;
        }

        public Builder setBusinessNameBytes(v vVar) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setBusinessNameBytes(vVar);
            return this;
        }

        public Builder setClickUrl(String str) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setClickUrl(str);
            return this;
        }

        public Builder setClickUrlBytes(v vVar) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setClickUrlBytes(vVar);
            return this;
        }

        public Builder setCtaMessage(String str) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setCtaMessage(str);
            return this;
        }

        public Builder setCtaMessageBytes(v vVar) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setCtaMessageBytes(vVar);
            return this;
        }

        public Builder setIsTest(boolean z) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setIsTest(z);
            return this;
        }

        public Builder setLogoImageUrl(String str) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setLogoImageUrl(str);
            return this;
        }

        public Builder setLogoImageUrlBytes(v vVar) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setLogoImageUrlBytes(vVar);
            return this;
        }

        public Builder setOpenStatus(OpenStatus openStatus) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setOpenStatus(openStatus);
            return this;
        }

        public Builder setOpenStatusValue(int i2) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setOpenStatusValue(i2);
            return this;
        }

        public Builder setPinIconUrl(String str) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setPinIconUrl(str);
            return this;
        }

        public Builder setPinIconUrlBytes(v vVar) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setPinIconUrlBytes(vVar);
            return this;
        }

        public Builder setPlaceId(String str) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setPlaceId(str);
            return this;
        }

        public Builder setPlaceIdBytes(v vVar) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setPlaceIdBytes(vVar);
            return this;
        }

        public Builder setPosition(Position.IntPosition.Builder builder) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setPosition(builder.build());
            return this;
        }

        public Builder setRating(float f2) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setRating(f2);
            return this;
        }

        public Builder setTrackAddStopUrl(String str) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setTrackAddStopUrl(str);
            return this;
        }

        public Builder setTrackAddStopUrlBytes(v vVar) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setTrackAddStopUrlBytes(vVar);
            return this;
        }

        public Builder setVisibleUrl(String str) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setVisibleUrl(str);
            return this;
        }

        public Builder setVisibleUrlBytes(v vVar) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setVisibleUrlBytes(vVar);
            return this;
        }

        public Builder setPosition(Position.IntPosition intPosition) {
            copyOnWrite();
            ((PinAdDisplay) this.instance).setPosition(intPosition);
            return this;
        }
    }

    public static PinAdDisplay parseFrom(byte[] bArr) {
        return (PinAdDisplay) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static PinAdDisplay parseFrom(byte[] bArr, de deVar) {
        return (PinAdDisplay) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
