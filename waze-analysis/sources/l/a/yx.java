package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class yx extends com.google.v.du<yx, yw> implements com.google.v.fj {
    private static final yx DEFAULT_INSTANCE;
    public static final int GOOGLE_AD_INFORMATION_FIELD_NUMBER = 1;
    public static final int LOGO_DISPLAYED_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<yx> PARSER = null;
    public static final int VENUE_OPENING_INFORMATION_FIELD_NUMBER = 2;
    public static final int VENUE_RATING_INFORMATION_FIELD_NUMBER = 3;
    private int bitField0_;
    private zh googleAdInformation_;
    private boolean logoDisplayed_;
    private int venueOpeningInformation_;
    private float venueRatingInformation_;

    static {
        yx yxVar = new yx();
        DEFAULT_INSTANCE = yxVar;
        com.google.v.du.registerDefaultInstance(yx.class, yxVar);
    }

    private yx() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleAdInformation() {
        this.googleAdInformation_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLogoDisplayed() {
        this.bitField0_ &= -5;
        this.logoDisplayed_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueOpeningInformation() {
        this.venueOpeningInformation_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueRatingInformation() {
        this.bitField0_ &= -3;
        this.venueRatingInformation_ = 0.0f;
    }

    public static yx getDefaultInstance() {
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
        this.bitField0_ |= 1;
    }

    public static yw newBuilder() {
        return (yw) DEFAULT_INSTANCE.createBuilder();
    }

    public static yx parseDelimitedFrom(InputStream inputStream) {
        return (yx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static yx parseFrom(com.google.v.v vVar) {
        return (yx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<yx> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleAdInformation(zh zhVar) {
        Objects.requireNonNull(zhVar);
        this.googleAdInformation_ = zhVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLogoDisplayed(boolean z) {
        this.bitField0_ |= 4;
        this.logoDisplayed_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueOpeningInformation(bps bpsVar) {
        this.venueOpeningInformation_ = bpsVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueOpeningInformationValue(int i2) {
        this.venueOpeningInformation_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVenueRatingInformation(float f2) {
        this.bitField0_ |= 2;
        this.venueRatingInformation_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ခ\u0001\u0004ဇ\u0002", new Object[]{"bitField0_", "googleAdInformation_", "venueOpeningInformation_", "venueRatingInformation_", "logoDisplayed_"});
        }
        if (iOrdinal == 3) {
            return new yx();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new yw(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<yx> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (yx.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public zh getGoogleAdInformation() {
        zh zhVar = this.googleAdInformation_;
        return zhVar == null ? zh.getDefaultInstance() : zhVar;
    }

    public boolean getLogoDisplayed() {
        return this.logoDisplayed_;
    }

    public bps getVenueOpeningInformation() {
        bps bpsVarA = bps.a(this.venueOpeningInformation_);
        return bpsVarA == null ? bps.UNRECOGNIZED : bpsVarA;
    }

    public int getVenueOpeningInformationValue() {
        return this.venueOpeningInformation_;
    }

    public float getVenueRatingInformation() {
        return this.venueRatingInformation_;
    }

    public boolean hasGoogleAdInformation() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLogoDisplayed() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasVenueRatingInformation() {
        return (this.bitField0_ & 2) != 0;
    }

    public static yw newBuilder(yx yxVar) {
        return (yw) DEFAULT_INSTANCE.createBuilder(yxVar);
    }

    public static yx parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (yx) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static yx parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (yx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static yx parseFrom(com.google.v.z zVar) {
        return (yx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static yx parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (yx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static yx parseFrom(InputStream inputStream) {
        return (yx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static yx parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (yx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static yx parseFrom(ByteBuffer byteBuffer) {
        return (yx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static yx parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (yx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static yx parseFrom(byte[] bArr) {
        return (yx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static yx parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (yx) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
