package i.b.l;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class su extends com.google.v.du<su, st> implements com.google.v.fj {
    public static final int ACTIONURL_FIELD_NUMBER = 4;
    private static final su DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<su> PARSER = null;
    public static final int PASS_BASED_MISSING_PASS_NAME_FIELD_NUMBER = 10;
    public static final int PASS_BASED_PRICE_CHANGE_TO_PRICE_FIELD_NUMBER = 11;
    public static final int PASS_BASED_USER_PASS_NAME_FIELD_NUMBER = 12;
    public static final int POPUPID_FIELD_NUMBER = 3;
    public static final int SERVERPARAMETERIZEDHEADER_FIELD_NUMBER = 5;
    public static final int SERVERPARAMETERIZEDMESSAGE_FIELD_NUMBER = 6;
    public static final int TIME_BASED_PRICE_CHANGE_AT_SECONDS_FIELD_NUMBER = 15;
    public static final int TIME_BASED_PRICE_CHANGE_TO_PRICE_FIELD_NUMBER = 14;
    public static final int TOLLPRICECURRENCYCODE_FIELD_NUMBER = 2;
    public static final int TOLLPRICE_FIELD_NUMBER = 1;
    public static final int TOLL_ROAD_NAME_FIELD_NUMBER = 13;
    private int bitField0_;
    private double passBasedPriceChangeToPrice_;
    private int popupId_;
    private int timeBasedPriceChangeAtSeconds_;
    private double timeBasedPriceChangeToPrice_;
    private double tollPrice_;
    private String tollPriceCurrencyCode_ = "";
    private String actionUrl_ = "";
    private String serverParameterizedHeader_ = "";
    private String serverParameterizedMessage_ = "";
    private String passBasedMissingPassName_ = "";
    private String passBasedUserPassName_ = "";
    private String tollRoadName_ = "";

    static {
        su suVar = new su();
        DEFAULT_INSTANCE = suVar;
        com.google.v.du.registerDefaultInstance(su.class, suVar);
    }

    private su() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearActionUrl() {
        this.bitField0_ &= -9;
        this.actionUrl_ = getDefaultInstance().getActionUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassBasedMissingPassName() {
        this.bitField0_ &= -65;
        this.passBasedMissingPassName_ = getDefaultInstance().getPassBasedMissingPassName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassBasedPriceChangeToPrice() {
        this.bitField0_ &= -129;
        this.passBasedPriceChangeToPrice_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPassBasedUserPassName() {
        this.bitField0_ &= -257;
        this.passBasedUserPassName_ = getDefaultInstance().getPassBasedUserPassName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopupId() {
        this.bitField0_ &= -5;
        this.popupId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerParameterizedHeader() {
        this.bitField0_ &= -17;
        this.serverParameterizedHeader_ = getDefaultInstance().getServerParameterizedHeader();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerParameterizedMessage() {
        this.bitField0_ &= -33;
        this.serverParameterizedMessage_ = getDefaultInstance().getServerParameterizedMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeBasedPriceChangeAtSeconds() {
        this.bitField0_ &= -2049;
        this.timeBasedPriceChangeAtSeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeBasedPriceChangeToPrice() {
        this.bitField0_ &= -1025;
        this.timeBasedPriceChangeToPrice_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollPrice() {
        this.bitField0_ &= -2;
        this.tollPrice_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollPriceCurrencyCode() {
        this.bitField0_ &= -3;
        this.tollPriceCurrencyCode_ = getDefaultInstance().getTollPriceCurrencyCode();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTollRoadName() {
        this.bitField0_ &= -513;
        this.tollRoadName_ = getDefaultInstance().getTollRoadName();
    }

    public static su getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static st newBuilder() {
        return (st) DEFAULT_INSTANCE.createBuilder();
    }

    public static su parseDelimitedFrom(InputStream inputStream) {
        return (su) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static su parseFrom(com.google.v.v vVar) {
        return (su) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<su> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.actionUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setActionUrlBytes(com.google.v.v vVar) {
        this.actionUrl_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassBasedMissingPassName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.passBasedMissingPassName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassBasedMissingPassNameBytes(com.google.v.v vVar) {
        this.passBasedMissingPassName_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassBasedPriceChangeToPrice(double d2) {
        this.bitField0_ |= 128;
        this.passBasedPriceChangeToPrice_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassBasedUserPassName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.passBasedUserPassName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPassBasedUserPassNameBytes(com.google.v.v vVar) {
        this.passBasedUserPassName_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopupId(ss ssVar) {
        this.popupId_ = ssVar.getNumber();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerParameterizedHeader(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.serverParameterizedHeader_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerParameterizedHeaderBytes(com.google.v.v vVar) {
        this.serverParameterizedHeader_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerParameterizedMessage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.serverParameterizedMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerParameterizedMessageBytes(com.google.v.v vVar) {
        this.serverParameterizedMessage_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeBasedPriceChangeAtSeconds(int i2) {
        this.bitField0_ |= 2048;
        this.timeBasedPriceChangeAtSeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeBasedPriceChangeToPrice(double d2) {
        this.bitField0_ |= 1024;
        this.timeBasedPriceChangeToPrice_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollPrice(double d2) {
        this.bitField0_ |= 1;
        this.tollPrice_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollPriceCurrencyCode(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.tollPriceCurrencyCode_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollPriceCurrencyCodeBytes(com.google.v.v vVar) {
        this.tollPriceCurrencyCode_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollRoadName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 512;
        this.tollRoadName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTollRoadNameBytes(com.google.v.v vVar) {
        this.tollRoadName_ = vVar.u();
        this.bitField0_ |= 512;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\u000f\f\u0000\u0000\u0000\u0001က\u0000\u0002ဈ\u0001\u0003᠌\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005\nဈ\u0006\u000bက\u0007\fဈ\b\rဈ\t\u000eက\n\u000fင\u000b", new Object[]{"bitField0_", "tollPrice_", "tollPriceCurrencyCode_", "popupId_", pa.f48959h, "actionUrl_", "serverParameterizedHeader_", "serverParameterizedMessage_", "passBasedMissingPassName_", "passBasedPriceChangeToPrice_", "passBasedUserPassName_", "tollRoadName_", "timeBasedPriceChangeToPrice_", "timeBasedPriceChangeAtSeconds_"});
        }
        if (iOrdinal == 3) {
            return new su();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new st(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<su> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (su.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getActionUrl() {
        return this.actionUrl_;
    }

    public com.google.v.v getActionUrlBytes() {
        return com.google.v.v.s(this.actionUrl_);
    }

    public String getPassBasedMissingPassName() {
        return this.passBasedMissingPassName_;
    }

    public com.google.v.v getPassBasedMissingPassNameBytes() {
        return com.google.v.v.s(this.passBasedMissingPassName_);
    }

    public double getPassBasedPriceChangeToPrice() {
        return this.passBasedPriceChangeToPrice_;
    }

    public String getPassBasedUserPassName() {
        return this.passBasedUserPassName_;
    }

    public com.google.v.v getPassBasedUserPassNameBytes() {
        return com.google.v.v.s(this.passBasedUserPassName_);
    }

    public ss getPopupId() {
        ss ssVarA = ss.a(this.popupId_);
        return ssVarA == null ? ss.TOLL_INFO_DYNAMIC_PRICE_NOT_SHOWN : ssVarA;
    }

    public String getServerParameterizedHeader() {
        return this.serverParameterizedHeader_;
    }

    public com.google.v.v getServerParameterizedHeaderBytes() {
        return com.google.v.v.s(this.serverParameterizedHeader_);
    }

    public String getServerParameterizedMessage() {
        return this.serverParameterizedMessage_;
    }

    public com.google.v.v getServerParameterizedMessageBytes() {
        return com.google.v.v.s(this.serverParameterizedMessage_);
    }

    public int getTimeBasedPriceChangeAtSeconds() {
        return this.timeBasedPriceChangeAtSeconds_;
    }

    public double getTimeBasedPriceChangeToPrice() {
        return this.timeBasedPriceChangeToPrice_;
    }

    public double getTollPrice() {
        return this.tollPrice_;
    }

    public String getTollPriceCurrencyCode() {
        return this.tollPriceCurrencyCode_;
    }

    public com.google.v.v getTollPriceCurrencyCodeBytes() {
        return com.google.v.v.s(this.tollPriceCurrencyCode_);
    }

    public String getTollRoadName() {
        return this.tollRoadName_;
    }

    public com.google.v.v getTollRoadNameBytes() {
        return com.google.v.v.s(this.tollRoadName_);
    }

    public boolean hasActionUrl() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPassBasedMissingPassName() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasPassBasedPriceChangeToPrice() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasPassBasedUserPassName() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasPopupId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasServerParameterizedHeader() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasServerParameterizedMessage() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasTimeBasedPriceChangeAtSeconds() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasTimeBasedPriceChangeToPrice() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasTollPrice() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTollPriceCurrencyCode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTollRoadName() {
        return (this.bitField0_ & 512) != 0;
    }

    public static st newBuilder(su suVar) {
        return (st) DEFAULT_INSTANCE.createBuilder(suVar);
    }

    public static su parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (su) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static su parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (su) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static su parseFrom(com.google.v.z zVar) {
        return (su) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static su parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (su) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static su parseFrom(InputStream inputStream) {
        return (su) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static su parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (su) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static su parseFrom(ByteBuffer byteBuffer) {
        return (su) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static su parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (su) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static su parseFrom(byte[] bArr) {
        return (su) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static su parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (su) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
