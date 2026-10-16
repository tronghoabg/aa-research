package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class apr extends com.google.v.du<apr, app> implements com.google.v.fj {
    public static final int AD_FIELD_NUMBER = 2;
    public static final int BEST_FIELD_NUMBER = 3;
    public static final int CONTEXT_FIELD_NUMBER = 1;
    private static final apr DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<apr> PARSER = null;
    public static final int POPULAR_FIELD_NUMBER = 4;
    public static final int PRICE_SHOWN_FIELD_NUMBER = 6;
    public static final int SPONSORED_FIELD_NUMBER = 5;
    public static final int VENUE_ID_FIELD_NUMBER = 7;
    private boolean ad_;
    private boolean best_;
    private int bitField0_;
    private int context_;
    private boolean popular_;
    private boolean priceShown_;
    private boolean sponsored_;
    private String venueId_ = "";

    static {
        apr aprVar = new apr();
        DEFAULT_INSTANCE = aprVar;
        com.google.v.du.registerDefaultInstance(apr.class, aprVar);
    }

    private apr() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAd() {
        this.bitField0_ &= -2;
        this.ad_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBest() {
        this.bitField0_ &= -3;
        this.best_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContext() {
        this.context_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPopular() {
        this.bitField0_ &= -5;
        this.popular_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriceShown() {
        this.bitField0_ &= -17;
        this.priceShown_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSponsored() {
        this.bitField0_ &= -9;
        this.sponsored_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVenueId() {
        this.venueId_ = getDefaultInstance().getVenueId();
    }

    public static apr getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static app newBuilder() {
        return (app) DEFAULT_INSTANCE.createBuilder();
    }

    public static apr parseDelimitedFrom(InputStream inputStream) {
        return (apr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static apr parseFrom(com.google.v.v vVar) {
        return (apr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<apr> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAd(boolean z) {
        this.bitField0_ |= 1;
        this.ad_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBest(boolean z) {
        this.bitField0_ |= 2;
        this.best_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContext(apq apqVar) {
        this.context_ = apqVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContextValue(int i2) {
        this.context_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPopular(boolean z) {
        this.bitField0_ |= 4;
        this.popular_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriceShown(boolean z) {
        this.bitField0_ |= 16;
        this.priceShown_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSponsored(boolean z) {
        this.bitField0_ |= 8;
        this.sponsored_ = z;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002ဇ\u0000\u0003ဇ\u0001\u0004ဇ\u0002\u0005ဇ\u0003\u0006ဇ\u0004\u0007Ȉ", new Object[]{"bitField0_", "context_", "ad_", "best_", "popular_", "sponsored_", "priceShown_", "venueId_"});
        }
        if (iOrdinal == 3) {
            return new apr();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new app(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<apr> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (apr.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getAd() {
        return this.ad_;
    }

    public boolean getBest() {
        return this.best_;
    }

    public apq getContext() {
        apq apqVar;
        switch (this.context_) {
            case 0:
                apqVar = apq.CONTEXT_UNSPECIFIED;
                break;
            case 1:
                apqVar = apq.MAP;
                break;
            case 2:
                apqVar = apq.MORE;
                break;
            case 3:
                apqVar = apq.NEARING;
                break;
            case 4:
                apqVar = apq.PREVIEW;
                break;
            case 5:
                apqVar = apq.NAV_LIST;
                break;
            case 6:
                apqVar = apq.PLANNED_DRIVE;
                break;
            case 7:
                apqVar = apq.CATEGORICAL;
                break;
            case 8:
                apqVar = apq.ADD_WAYPOINT;
                break;
            case 9:
                apqVar = apq.FAVORITES;
                break;
            case 10:
                apqVar = apq.NULL;
                break;
            default:
                apqVar = null;
                break;
        }
        return apqVar == null ? apq.UNRECOGNIZED : apqVar;
    }

    public int getContextValue() {
        return this.context_;
    }

    public boolean getPopular() {
        return this.popular_;
    }

    public boolean getPriceShown() {
        return this.priceShown_;
    }

    public boolean getSponsored() {
        return this.sponsored_;
    }

    public String getVenueId() {
        return this.venueId_;
    }

    public com.google.v.v getVenueIdBytes() {
        return com.google.v.v.s(this.venueId_);
    }

    public boolean hasAd() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasBest() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPopular() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPriceShown() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasSponsored() {
        return (this.bitField0_ & 8) != 0;
    }

    public static app newBuilder(apr aprVar) {
        return (app) DEFAULT_INSTANCE.createBuilder(aprVar);
    }

    public static apr parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (apr) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static apr parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (apr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static apr parseFrom(com.google.v.z zVar) {
        return (apr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static apr parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (apr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static apr parseFrom(InputStream inputStream) {
        return (apr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static apr parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (apr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static apr parseFrom(ByteBuffer byteBuffer) {
        return (apr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static apr parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (apr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static apr parseFrom(byte[] bArr) {
        return (apr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static apr parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (apr) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
