package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bi extends com.google.v.du<bi, bh> implements com.google.v.fj {
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final bi DEFAULT_INSTANCE;
    public static final int GOOGLE_AD_INFORMATION_FIELD_NUMBER = 6;
    public static final int IS_AD_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<bi> PARSER = null;
    public static final int PHOTOS_COUNT_FIELD_NUMBER = 3;
    public static final int RESIDENTIAL_FIELD_NUMBER = 4;
    public static final int TRIGGERING_PLATFORM_FIELD_NUMBER = 7;
    public static final int VENUE_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private int context_;
    private zh googleAdInformation_;
    private boolean isAd_;
    private long photosCount_;
    private boolean residential_;
    private int triggeringPlatform_;
    private String venueId_ = "";

    static {
        bi biVar = new bi();
        DEFAULT_INSTANCE = biVar;
        com.google.v.du.registerDefaultInstance(bi.class, biVar);
    }

    private bi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdInformation() {
        this.googleAdInformation_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsAd() {
        this.bitField0_ &= -5;
        this.isAd_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPhotosCount() {
        this.bitField0_ &= -2;
        this.photosCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResidential() {
        this.bitField0_ &= -3;
        this.residential_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggeringPlatform() {
        this.triggeringPlatform_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static bi getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGoogleAdInformation(zh zhVar) {
        Objects.requireNonNull(zhVar);
        zh zhVar2 = this.googleAdInformation_;
        if (zhVar2 != null && zhVar2 != zh.getDefaultInstance()) {
            zg zgVarNewBuilder = zh.newBuilder(zhVar2);
            zgVarNewBuilder.mergeFrom((zg) zhVar);
            zhVar = zgVarNewBuilder.buildPartial();
        }
        this.googleAdInformation_ = zhVar;
        this.bitField0_ |= 8;
    }

    public static bh newBuilder() {
        return (bh) DEFAULT_INSTANCE.createBuilder();
    }

    public static bi parseDelimitedFrom(InputStream inputStream) {
        return (bi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bi parseFrom(com.google.v.v vVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bi> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(ba baVar) {
        this.context_ = baVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextValue(int i2) {
        this.context_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAdInformation(zh zhVar) {
        Objects.requireNonNull(zhVar);
        this.googleAdInformation_ = zhVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsAd(boolean z) {
        this.bitField0_ |= 4;
        this.isAd_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPhotosCount(long j2) {
        this.bitField0_ |= 1;
        this.photosCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResidential(boolean z) {
        this.bitField0_ |= 2;
        this.residential_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringPlatform(bjz bjzVar) {
        this.triggeringPlatform_ = bjzVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggeringPlatformValue(int i2) {
        this.triggeringPlatform_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueId(String str) {
        Objects.requireNonNull(str);
        this.venueId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.venueId_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003ဂ\u0000\u0004ဇ\u0001\u0005ဇ\u0002\u0006ဉ\u0003\u0007\f", new Object[]{"bitField0_", "context_", "venueId_", "photosCount_", "residential_", "isAd_", "googleAdInformation_", "triggeringPlatform_"});
        }
        if (iOrdinal == 3) {
            return new bi();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bi> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bi.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ba getContext() {
        ba baVarA = ba.a(this.context_);
        return baVarA == null ? ba.UNRECOGNIZED : baVarA;
    }

    public int getContextValue() {
        return this.context_;
    }

    public zh getGoogleAdInformation() {
        zh zhVar = this.googleAdInformation_;
        return zhVar == null ? zh.getDefaultInstance() : zhVar;
    }

    public boolean getIsAd() {
        return this.isAd_;
    }

    public long getPhotosCount() {
        return this.photosCount_;
    }

    @Deprecated
    public boolean getResidential() {
        return this.residential_;
    }

    public bjz getTriggeringPlatform() {
        bjz bjzVarA = bjz.a(this.triggeringPlatform_);
        return bjzVarA == null ? bjz.UNRECOGNIZED : bjzVarA;
    }

    public int getTriggeringPlatformValue() {
        return this.triggeringPlatform_;
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public boolean hasGoogleAdInformation() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIsAd() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPhotosCount() {
        return (this.bitField0_ & 1) != 0;
    }

    @Deprecated
    public boolean hasResidential() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bh newBuilder(bi biVar) {
        return (bh) DEFAULT_INSTANCE.createBuilder(biVar);
    }

    public static bi parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bi) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bi parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bi parseFrom(com.google.v.z zVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bi parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bi parseFrom(InputStream inputStream) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bi parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bi parseFrom(ByteBuffer byteBuffer) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bi parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bi parseFrom(byte[] bArr) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bi parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bi) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
