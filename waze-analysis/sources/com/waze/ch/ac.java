package com.waze.ch;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ac extends du<ac, aa> implements ad {
    public static final int ABOUT_THIS_AD_URL_FIELD_NUMBER = 8;
    public static final int AD_BANNER_FIELD_NUMBER = 10;
    public static final int AD_POSITION_FIELD_NUMBER = 9;
    public static final int AD_TRACKING_FIELD_NUMBER = 11;
    public static final int BUSINESS_NAME_FIELD_NUMBER = 3;
    public static final int BUSINESS_RATING_FIELD_NUMBER = 5;
    public static final int CUSTOMER_ID_FIELD_NUMBER = 12;
    private static final ac DEFAULT_INSTANCE;
    public static final int IMPRESSION_ID_FIELD_NUMBER = 1;
    public static final int OPEN_STATUS_FIELD_NUMBER = 6;
    private static volatile fo<ac> PARSER = null;
    public static final int PIN_ICON_URL_FIELD_NUMBER = 7;
    public static final int PIN_POSITION_FIELD_NUMBER = 4;
    public static final int PLACE_ID_FIELD_NUMBER = 2;
    private b adBanner_;
    private int adPosition_;
    private i adTracking_;
    private int bitField0_;
    private float businessRating_;
    private long customerId_;
    private int openStatus_;
    private i.b.s pinPosition_;
    private String impressionId_ = "";
    private String placeId_ = "";
    private String businessName_ = "";
    private String pinIconUrl_ = "";
    private String aboutThisAdUrl_ = "";

    static {
        ac acVar = new ac();
        DEFAULT_INSTANCE = acVar;
        du.registerDefaultInstance(ac.class, acVar);
    }

    private ac() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAboutThisAdUrl() {
        this.bitField0_ &= -129;
        this.aboutThisAdUrl_ = getDefaultInstance().getAboutThisAdUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdBanner() {
        this.adBanner_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdPosition() {
        this.bitField0_ &= -257;
        this.adPosition_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdTracking() {
        this.adTracking_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBusinessName() {
        this.bitField0_ &= -5;
        this.businessName_ = getDefaultInstance().getBusinessName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBusinessRating() {
        this.bitField0_ &= -17;
        this.businessRating_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCustomerId() {
        this.bitField0_ &= -2049;
        this.customerId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImpressionId() {
        this.bitField0_ &= -2;
        this.impressionId_ = getDefaultInstance().getImpressionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOpenStatus() {
        this.bitField0_ &= -33;
        this.openStatus_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinIconUrl() {
        this.bitField0_ &= -65;
        this.pinIconUrl_ = getDefaultInstance().getPinIconUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPinPosition() {
        this.pinPosition_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPlaceId() {
        this.bitField0_ &= -3;
        this.placeId_ = getDefaultInstance().getPlaceId();
    }

    public static ac getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdBanner(b bVar) {
        Objects.requireNonNull(bVar);
        b bVar2 = this.adBanner_;
        if (bVar2 != null && bVar2 != b.getDefaultInstance()) {
            a aVarNewBuilder = b.newBuilder(bVar2);
            aVarNewBuilder.mergeFrom((a) bVar);
            bVar = aVarNewBuilder.buildPartial();
        }
        this.adBanner_ = bVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdTracking(i iVar) {
        Objects.requireNonNull(iVar);
        i iVar2 = this.adTracking_;
        if (iVar2 != null && iVar2 != i.getDefaultInstance()) {
            h hVarNewBuilder = i.newBuilder(iVar2);
            hVarNewBuilder.mergeFrom((h) iVar);
            iVar = hVarNewBuilder.buildPartial();
        }
        this.adTracking_ = iVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePinPosition(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.pinPosition_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.pinPosition_ = sVar;
        this.bitField0_ |= 8;
    }

    public static aa newBuilder() {
        return (aa) DEFAULT_INSTANCE.createBuilder();
    }

    public static ac parseDelimitedFrom(InputStream inputStream) {
        return (ac) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ac parseFrom(com.google.v.v vVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ac> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAboutThisAdUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.aboutThisAdUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAboutThisAdUrlBytes(com.google.v.v vVar) {
        this.aboutThisAdUrl_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdBanner(b bVar) {
        Objects.requireNonNull(bVar);
        this.adBanner_ = bVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdPosition(int i2) {
        this.bitField0_ |= 256;
        this.adPosition_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdTracking(i iVar) {
        Objects.requireNonNull(iVar);
        this.adTracking_ = iVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBusinessName(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.businessName_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBusinessNameBytes(com.google.v.v vVar) {
        this.businessName_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBusinessRating(float f2) {
        this.bitField0_ |= 16;
        this.businessRating_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCustomerId(long j2) {
        this.bitField0_ |= 2048;
        this.customerId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpressionId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.impressionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpressionIdBytes(com.google.v.v vVar) {
        this.impressionId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOpenStatus(ab abVar) {
        this.openStatus_ = abVar.getNumber();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinIconUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.pinIconUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinIconUrlBytes(com.google.v.v vVar) {
        this.pinIconUrl_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinPosition(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.pinPosition_ = sVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaceId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.placeId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaceIdBytes(com.google.v.v vVar) {
        this.placeId_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003\u0005ခ\u0004\u0006᠌\u0005\u0007ဈ\u0006\bဈ\u0007\tင\b\nဉ\t\u000bဉ\n\fဂ\u000b", new Object[]{"bitField0_", "impressionId_", "placeId_", "businessName_", "pinPosition_", "businessRating_", "openStatus_", j.f22371h, "pinIconUrl_", "aboutThisAdUrl_", "adPosition_", "adBanner_", "adTracking_", "customerId_"});
        }
        if (iOrdinal == 3) {
            return new ac();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aa(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ac> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ac.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAboutThisAdUrl() {
        return this.aboutThisAdUrl_;
    }

    public com.google.v.v getAboutThisAdUrlBytes() {
        return com.google.v.v.s(this.aboutThisAdUrl_);
    }

    public b getAdBanner() {
        b bVar = this.adBanner_;
        return bVar == null ? b.getDefaultInstance() : bVar;
    }

    public int getAdPosition() {
        return this.adPosition_;
    }

    public i getAdTracking() {
        i iVar = this.adTracking_;
        return iVar == null ? i.getDefaultInstance() : iVar;
    }

    public String getBusinessName() {
        return this.businessName_;
    }

    public com.google.v.v getBusinessNameBytes() {
        return com.google.v.v.s(this.businessName_);
    }

    public float getBusinessRating() {
        return this.businessRating_;
    }

    public long getCustomerId() {
        return this.customerId_;
    }

    public String getImpressionId() {
        return this.impressionId_;
    }

    public com.google.v.v getImpressionIdBytes() {
        return com.google.v.v.s(this.impressionId_);
    }

    public ab getOpenStatus() {
        ab abVarA = ab.a(this.openStatus_);
        return abVarA == null ? ab.STATUS_UNSPECIFIED : abVarA;
    }

    public String getPinIconUrl() {
        return this.pinIconUrl_;
    }

    public com.google.v.v getPinIconUrlBytes() {
        return com.google.v.v.s(this.pinIconUrl_);
    }

    public i.b.s getPinPosition() {
        i.b.s sVar = this.pinPosition_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public String getPlaceId() {
        return this.placeId_;
    }

    public com.google.v.v getPlaceIdBytes() {
        return com.google.v.v.s(this.placeId_);
    }

    public boolean hasAboutThisAdUrl() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasAdBanner() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasAdPosition() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasAdTracking() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasBusinessName() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasBusinessRating() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasCustomerId() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasImpressionId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOpenStatus() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasPinIconUrl() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasPinPosition() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasPlaceId() {
        return (this.bitField0_ & 2) != 0;
    }

    public static aa newBuilder(ac acVar) {
        return (aa) DEFAULT_INSTANCE.createBuilder(acVar);
    }

    public static ac parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ac) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ac parseFrom(com.google.v.v vVar, de deVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ac parseFrom(com.google.v.z zVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ac parseFrom(com.google.v.z zVar, de deVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ac parseFrom(InputStream inputStream) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ac parseFrom(InputStream inputStream, de deVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ac parseFrom(ByteBuffer byteBuffer) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ac parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ac parseFrom(byte[] bArr) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ac parseFrom(byte[] bArr, de deVar) {
        return (ac) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
