package com.waze.jni.protos.navigate;

import androidx.camera.video.AudioStats;
import com.google.v.de;
import com.google.v.dm;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class TollPriceInformation extends du<TollPriceInformation, Builder> implements TollPriceInformationOrBuilder {
    public static final int ACTION_URL_FIELD_NUMBER = 4;
    private static final TollPriceInformation DEFAULT_INSTANCE;
    private static volatile fo<TollPriceInformation> PARSER = null;
    public static final int PASS_BASED_MISSING_PASS_NAME_FIELD_NUMBER = 5;
    public static final int PASS_BASED_PRICE_CHANGE_TO_PRICE_FIELD_NUMBER = 6;
    public static final int PASS_BASED_USER_PASS_NAME_FIELD_NUMBER = 7;
    public static final int POPUP_ID_FIELD_NUMBER = 3;
    public static final int TIME_BASED_PRICE_CHANGE_AT_SECONDS_FIELD_NUMBER = 10;
    public static final int TIME_BASED_PRICE_CHANGE_TO_PRICE_FIELD_NUMBER = 9;
    public static final int TOLL_CURRENCY_CODE_FIELD_NUMBER = 2;
    public static final int TOLL_PRICE_FIELD_NUMBER = 1;
    public static final int TOLL_ROAD_NAME_FIELD_NUMBER = 8;
    private int bitField0_;
    private double passBasedPriceChangeToPrice_;
    private int popupId_;
    private double timeBasedPriceChangeAtSeconds_;
    private double timeBasedPriceChangeToPrice_;
    private double tollPrice_;
    private String tollCurrencyCode_ = "";
    private String actionUrl_ = "";
    private String passBasedMissingPassName_ = "";
    private String passBasedUserPassName_ = "";
    private String tollRoadName_ = "";

    /* compiled from: WazeSource */
    /* renamed from: com.waze.jni.protos.navigate.TollPriceInformation$1, reason: invalid class name */
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
    public final class Builder extends dm<TollPriceInformation, Builder> implements TollPriceInformationOrBuilder {
        private Builder() {
            super(TollPriceInformation.DEFAULT_INSTANCE);
        }

        public Builder clearActionUrl() {
            copyOnWrite();
            ((TollPriceInformation) this.instance).clearActionUrl();
            return this;
        }

        public Builder clearPassBasedMissingPassName() {
            copyOnWrite();
            ((TollPriceInformation) this.instance).clearPassBasedMissingPassName();
            return this;
        }

        public Builder clearPassBasedPriceChangeToPrice() {
            copyOnWrite();
            ((TollPriceInformation) this.instance).clearPassBasedPriceChangeToPrice();
            return this;
        }

        public Builder clearPassBasedUserPassName() {
            copyOnWrite();
            ((TollPriceInformation) this.instance).clearPassBasedUserPassName();
            return this;
        }

        public Builder clearPopupId() {
            copyOnWrite();
            ((TollPriceInformation) this.instance).clearPopupId();
            return this;
        }

        public Builder clearTimeBasedPriceChangeAtSeconds() {
            copyOnWrite();
            ((TollPriceInformation) this.instance).clearTimeBasedPriceChangeAtSeconds();
            return this;
        }

        public Builder clearTimeBasedPriceChangeToPrice() {
            copyOnWrite();
            ((TollPriceInformation) this.instance).clearTimeBasedPriceChangeToPrice();
            return this;
        }

        public Builder clearTollCurrencyCode() {
            copyOnWrite();
            ((TollPriceInformation) this.instance).clearTollCurrencyCode();
            return this;
        }

        public Builder clearTollPrice() {
            copyOnWrite();
            ((TollPriceInformation) this.instance).clearTollPrice();
            return this;
        }

        public Builder clearTollRoadName() {
            copyOnWrite();
            ((TollPriceInformation) this.instance).clearTollRoadName();
            return this;
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public String getActionUrl() {
            return ((TollPriceInformation) this.instance).getActionUrl();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public v getActionUrlBytes() {
            return ((TollPriceInformation) this.instance).getActionUrlBytes();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public String getPassBasedMissingPassName() {
            return ((TollPriceInformation) this.instance).getPassBasedMissingPassName();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public v getPassBasedMissingPassNameBytes() {
            return ((TollPriceInformation) this.instance).getPassBasedMissingPassNameBytes();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public double getPassBasedPriceChangeToPrice() {
            return ((TollPriceInformation) this.instance).getPassBasedPriceChangeToPrice();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public String getPassBasedUserPassName() {
            return ((TollPriceInformation) this.instance).getPassBasedUserPassName();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public v getPassBasedUserPassNameBytes() {
            return ((TollPriceInformation) this.instance).getPassBasedUserPassNameBytes();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public int getPopupId() {
            return ((TollPriceInformation) this.instance).getPopupId();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public double getTimeBasedPriceChangeAtSeconds() {
            return ((TollPriceInformation) this.instance).getTimeBasedPriceChangeAtSeconds();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public double getTimeBasedPriceChangeToPrice() {
            return ((TollPriceInformation) this.instance).getTimeBasedPriceChangeToPrice();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public String getTollCurrencyCode() {
            return ((TollPriceInformation) this.instance).getTollCurrencyCode();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public v getTollCurrencyCodeBytes() {
            return ((TollPriceInformation) this.instance).getTollCurrencyCodeBytes();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public double getTollPrice() {
            return ((TollPriceInformation) this.instance).getTollPrice();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public String getTollRoadName() {
            return ((TollPriceInformation) this.instance).getTollRoadName();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public v getTollRoadNameBytes() {
            return ((TollPriceInformation) this.instance).getTollRoadNameBytes();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public boolean hasActionUrl() {
            return ((TollPriceInformation) this.instance).hasActionUrl();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public boolean hasPassBasedMissingPassName() {
            return ((TollPriceInformation) this.instance).hasPassBasedMissingPassName();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public boolean hasPassBasedPriceChangeToPrice() {
            return ((TollPriceInformation) this.instance).hasPassBasedPriceChangeToPrice();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public boolean hasPassBasedUserPassName() {
            return ((TollPriceInformation) this.instance).hasPassBasedUserPassName();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public boolean hasPopupId() {
            return ((TollPriceInformation) this.instance).hasPopupId();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public boolean hasTimeBasedPriceChangeAtSeconds() {
            return ((TollPriceInformation) this.instance).hasTimeBasedPriceChangeAtSeconds();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public boolean hasTimeBasedPriceChangeToPrice() {
            return ((TollPriceInformation) this.instance).hasTimeBasedPriceChangeToPrice();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public boolean hasTollCurrencyCode() {
            return ((TollPriceInformation) this.instance).hasTollCurrencyCode();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public boolean hasTollPrice() {
            return ((TollPriceInformation) this.instance).hasTollPrice();
        }

        @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
        public boolean hasTollRoadName() {
            return ((TollPriceInformation) this.instance).hasTollRoadName();
        }

        public Builder setActionUrl(String str) {
            copyOnWrite();
            ((TollPriceInformation) this.instance).setActionUrl(str);
            return this;
        }

        public Builder setActionUrlBytes(v vVar) {
            copyOnWrite();
            ((TollPriceInformation) this.instance).setActionUrlBytes(vVar);
            return this;
        }

        public Builder setPassBasedMissingPassName(String str) {
            copyOnWrite();
            ((TollPriceInformation) this.instance).setPassBasedMissingPassName(str);
            return this;
        }

        public Builder setPassBasedMissingPassNameBytes(v vVar) {
            copyOnWrite();
            ((TollPriceInformation) this.instance).setPassBasedMissingPassNameBytes(vVar);
            return this;
        }

        public Builder setPassBasedPriceChangeToPrice(double d2) {
            copyOnWrite();
            ((TollPriceInformation) this.instance).setPassBasedPriceChangeToPrice(d2);
            return this;
        }

        public Builder setPassBasedUserPassName(String str) {
            copyOnWrite();
            ((TollPriceInformation) this.instance).setPassBasedUserPassName(str);
            return this;
        }

        public Builder setPassBasedUserPassNameBytes(v vVar) {
            copyOnWrite();
            ((TollPriceInformation) this.instance).setPassBasedUserPassNameBytes(vVar);
            return this;
        }

        public Builder setPopupId(int i2) {
            copyOnWrite();
            ((TollPriceInformation) this.instance).setPopupId(i2);
            return this;
        }

        public Builder setTimeBasedPriceChangeAtSeconds(double d2) {
            copyOnWrite();
            ((TollPriceInformation) this.instance).setTimeBasedPriceChangeAtSeconds(d2);
            return this;
        }

        public Builder setTimeBasedPriceChangeToPrice(double d2) {
            copyOnWrite();
            ((TollPriceInformation) this.instance).setTimeBasedPriceChangeToPrice(d2);
            return this;
        }

        public Builder setTollCurrencyCode(String str) {
            copyOnWrite();
            ((TollPriceInformation) this.instance).setTollCurrencyCode(str);
            return this;
        }

        public Builder setTollCurrencyCodeBytes(v vVar) {
            copyOnWrite();
            ((TollPriceInformation) this.instance).setTollCurrencyCodeBytes(vVar);
            return this;
        }

        public Builder setTollPrice(double d2) {
            copyOnWrite();
            ((TollPriceInformation) this.instance).setTollPrice(d2);
            return this;
        }

        public Builder setTollRoadName(String str) {
            copyOnWrite();
            ((TollPriceInformation) this.instance).setTollRoadName(str);
            return this;
        }

        public Builder setTollRoadNameBytes(v vVar) {
            copyOnWrite();
            ((TollPriceInformation) this.instance).setTollRoadNameBytes(vVar);
            return this;
        }
    }

    static {
        TollPriceInformation tollPriceInformation = new TollPriceInformation();
        DEFAULT_INSTANCE = tollPriceInformation;
        du.registerDefaultInstance(TollPriceInformation.class, tollPriceInformation);
    }

    private TollPriceInformation() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionUrl() {
        this.bitField0_ &= -9;
        this.actionUrl_ = getDefaultInstance().getActionUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassBasedMissingPassName() {
        this.bitField0_ &= -17;
        this.passBasedMissingPassName_ = getDefaultInstance().getPassBasedMissingPassName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassBasedPriceChangeToPrice() {
        this.bitField0_ &= -33;
        this.passBasedPriceChangeToPrice_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassBasedUserPassName() {
        this.bitField0_ &= -65;
        this.passBasedUserPassName_ = getDefaultInstance().getPassBasedUserPassName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopupId() {
        this.bitField0_ &= -5;
        this.popupId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeBasedPriceChangeAtSeconds() {
        this.bitField0_ &= -513;
        this.timeBasedPriceChangeAtSeconds_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeBasedPriceChangeToPrice() {
        this.bitField0_ &= -257;
        this.timeBasedPriceChangeToPrice_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollCurrencyCode() {
        this.bitField0_ &= -3;
        this.tollCurrencyCode_ = getDefaultInstance().getTollCurrencyCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollPrice() {
        this.bitField0_ &= -2;
        this.tollPrice_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollRoadName() {
        this.bitField0_ &= -129;
        this.tollRoadName_ = getDefaultInstance().getTollRoadName();
    }

    public static TollPriceInformation getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static TollPriceInformation parseDelimitedFrom(InputStream inputStream) {
        return (TollPriceInformation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TollPriceInformation parseFrom(v vVar) {
        return (TollPriceInformation) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<TollPriceInformation> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.actionUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionUrlBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.actionUrl_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassBasedMissingPassName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.passBasedMissingPassName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassBasedMissingPassNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.passBasedMissingPassName_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassBasedPriceChangeToPrice(double d2) {
        this.bitField0_ |= 32;
        this.passBasedPriceChangeToPrice_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassBasedUserPassName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.passBasedUserPassName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassBasedUserPassNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.passBasedUserPassName_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopupId(int i2) {
        this.bitField0_ |= 4;
        this.popupId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeBasedPriceChangeAtSeconds(double d2) {
        this.bitField0_ |= 512;
        this.timeBasedPriceChangeAtSeconds_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeBasedPriceChangeToPrice(double d2) {
        this.bitField0_ |= 256;
        this.timeBasedPriceChangeToPrice_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollCurrencyCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.tollCurrencyCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollCurrencyCodeBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.tollCurrencyCode_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollPrice(double d2) {
        this.bitField0_ |= 1;
        this.tollPrice_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollRoadName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.tollRoadName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollRoadNameBytes(v vVar) {
        checkByteStringIsUtf8(vVar);
        this.tollRoadName_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001က\u0000\u0002ለ\u0001\u0003င\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006က\u0005\u0007ለ\u0006\bለ\u0007\tက\b\nက\t", new Object[]{"bitField0_", "tollPrice_", "tollCurrencyCode_", "popupId_", "actionUrl_", "passBasedMissingPassName_", "passBasedPriceChangeToPrice_", "passBasedUserPassName_", "tollRoadName_", "timeBasedPriceChangeToPrice_", "timeBasedPriceChangeAtSeconds_"});
        }
        if (iOrdinal == 3) {
            return new TollPriceInformation();
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
        fo<TollPriceInformation> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (TollPriceInformation.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public String getActionUrl() {
        return this.actionUrl_;
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public v getActionUrlBytes() {
        return v.s(this.actionUrl_);
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public String getPassBasedMissingPassName() {
        return this.passBasedMissingPassName_;
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public v getPassBasedMissingPassNameBytes() {
        return v.s(this.passBasedMissingPassName_);
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public double getPassBasedPriceChangeToPrice() {
        return this.passBasedPriceChangeToPrice_;
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public String getPassBasedUserPassName() {
        return this.passBasedUserPassName_;
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public v getPassBasedUserPassNameBytes() {
        return v.s(this.passBasedUserPassName_);
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public int getPopupId() {
        return this.popupId_;
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public double getTimeBasedPriceChangeAtSeconds() {
        return this.timeBasedPriceChangeAtSeconds_;
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public double getTimeBasedPriceChangeToPrice() {
        return this.timeBasedPriceChangeToPrice_;
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public String getTollCurrencyCode() {
        return this.tollCurrencyCode_;
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public v getTollCurrencyCodeBytes() {
        return v.s(this.tollCurrencyCode_);
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public double getTollPrice() {
        return this.tollPrice_;
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public String getTollRoadName() {
        return this.tollRoadName_;
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public v getTollRoadNameBytes() {
        return v.s(this.tollRoadName_);
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public boolean hasActionUrl() {
        return (this.bitField0_ & 8) != 0;
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public boolean hasPassBasedMissingPassName() {
        return (this.bitField0_ & 16) != 0;
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public boolean hasPassBasedPriceChangeToPrice() {
        return (this.bitField0_ & 32) != 0;
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public boolean hasPassBasedUserPassName() {
        return (this.bitField0_ & 64) != 0;
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public boolean hasPopupId() {
        return (this.bitField0_ & 4) != 0;
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public boolean hasTimeBasedPriceChangeAtSeconds() {
        return (this.bitField0_ & 512) != 0;
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public boolean hasTimeBasedPriceChangeToPrice() {
        return (this.bitField0_ & 256) != 0;
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public boolean hasTollCurrencyCode() {
        return (this.bitField0_ & 2) != 0;
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public boolean hasTollPrice() {
        return (this.bitField0_ & 1) != 0;
    }

    @Override // com.waze.jni.protos.navigate.TollPriceInformationOrBuilder
    public boolean hasTollRoadName() {
        return (this.bitField0_ & 128) != 0;
    }

    public static Builder newBuilder(TollPriceInformation tollPriceInformation) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(tollPriceInformation);
    }

    public static TollPriceInformation parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (TollPriceInformation) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static TollPriceInformation parseFrom(v vVar, de deVar) {
        return (TollPriceInformation) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static TollPriceInformation parseFrom(z zVar) {
        return (TollPriceInformation) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static TollPriceInformation parseFrom(z zVar, de deVar) {
        return (TollPriceInformation) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static TollPriceInformation parseFrom(InputStream inputStream) {
        return (TollPriceInformation) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TollPriceInformation parseFrom(InputStream inputStream, de deVar) {
        return (TollPriceInformation) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static TollPriceInformation parseFrom(ByteBuffer byteBuffer) {
        return (TollPriceInformation) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static TollPriceInformation parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (TollPriceInformation) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static TollPriceInformation parseFrom(byte[] bArr) {
        return (TollPriceInformation) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TollPriceInformation parseFrom(byte[] bArr, de deVar) {
        return (TollPriceInformation) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
