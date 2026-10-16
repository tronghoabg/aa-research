package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ro extends com.google.v.du<ro, rn> implements com.google.v.fj {
    public static final int ALERT_SUBTYPE_FIELD_NUMBER = 2;
    public static final int ALERT_TYPE_FIELD_NUMBER = 1;
    public static final int ALTERNATIVE_ROUTE_UUID_FIELD_NUMBER = 3;
    private static final ro DEFAULT_INSTANCE;
    public static final int DETOUR_ID_FIELD_NUMBER = 4;
    public static final int DIFFERENCE_MINUTES_FIELD_NUMBER = 6;
    public static final int IMAGE_LABEL_TYPE_FIELD_NUMBER = 10;
    private static volatile com.google.v.fo<ro> PARSER = null;
    public static final int PREFERRED_FIELD_NUMBER = 8;
    public static final int REASSURANCE_FIELD_NUMBER = 5;
    public static final int ROADSHIELD_FIELD_NUMBER = 9;
    public static final int SIMILAR_ETA_BY_BE_FIELD_NUMBER = 7;
    private long alertSubtype_;
    private long alertType_;
    private String alternativeRouteUuid_ = "";
    private int bitField0_;
    private long detourId_;
    private long differenceMinutes_;
    private int imageLabelType_;
    private boolean preferred_;
    private boolean reassurance_;
    private boolean roadshield_;
    private boolean similarEtaByBe_;

    static {
        ro roVar = new ro();
        DEFAULT_INSTANCE = roVar;
        com.google.v.du.registerDefaultInstance(ro.class, roVar);
    }

    private ro() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertSubtype() {
        this.bitField0_ &= -3;
        this.alertSubtype_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertType() {
        this.bitField0_ &= -2;
        this.alertType_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRouteUuid() {
        this.alternativeRouteUuid_ = getDefaultInstance().getAlternativeRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourId() {
        this.bitField0_ &= -5;
        this.detourId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDifferenceMinutes() {
        this.bitField0_ &= -17;
        this.differenceMinutes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageLabelType() {
        this.bitField0_ &= -257;
        this.imageLabelType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreferred() {
        this.bitField0_ &= -65;
        this.preferred_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReassurance() {
        this.bitField0_ &= -9;
        this.reassurance_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadshield() {
        this.bitField0_ &= -129;
        this.roadshield_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSimilarEtaByBe() {
        this.bitField0_ &= -33;
        this.similarEtaByBe_ = false;
    }

    public static ro getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static rn newBuilder() {
        return (rn) DEFAULT_INSTANCE.createBuilder();
    }

    public static ro parseDelimitedFrom(InputStream inputStream) {
        return (ro) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ro parseFrom(com.google.v.v vVar) {
        return (ro) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ro> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertSubtype(long j2) {
        this.bitField0_ |= 2;
        this.alertSubtype_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertType(long j2) {
        this.bitField0_ |= 1;
        this.alertType_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.alternativeRouteUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuidBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.alternativeRouteUuid_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourId(long j2) {
        this.bitField0_ |= 4;
        this.detourId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDifferenceMinutes(long j2) {
        this.bitField0_ |= 16;
        this.differenceMinutes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageLabelType(abq abqVar) {
        this.imageLabelType_ = abqVar.getNumber();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageLabelTypeValue(int i2) {
        this.bitField0_ |= 256;
        this.imageLabelType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreferred(boolean z) {
        this.bitField0_ |= 64;
        this.preferred_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReassurance(boolean z) {
        this.bitField0_ |= 8;
        this.reassurance_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadshield(boolean z) {
        this.bitField0_ |= 128;
        this.roadshield_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSimilarEtaByBe(boolean z) {
        this.bitField0_ |= 32;
        this.similarEtaByBe_ = z;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001တ\u0000\u0002ဂ\u0001\u0003Ȉ\u0004တ\u0002\u0005ဇ\u0003\u0006တ\u0004\u0007ဇ\u0005\bဇ\u0006\tဇ\u0007\nဌ\b", new Object[]{"bitField0_", "alertType_", "alertSubtype_", "alternativeRouteUuid_", "detourId_", "reassurance_", "differenceMinutes_", "similarEtaByBe_", "preferred_", "roadshield_", "imageLabelType_"});
        }
        if (iOrdinal == 3) {
            return new ro();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new rn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ro> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ro.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getAlertSubtype() {
        return this.alertSubtype_;
    }

    public long getAlertType() {
        return this.alertType_;
    }

    public String getAlternativeRouteUuid() {
        return this.alternativeRouteUuid_;
    }

    public com.google.v.v getAlternativeRouteUuidBytes() {
        return com.google.v.v.s(this.alternativeRouteUuid_);
    }

    public long getDetourId() {
        return this.detourId_;
    }

    public long getDifferenceMinutes() {
        return this.differenceMinutes_;
    }

    public abq getImageLabelType() {
        abq abqVar;
        switch (this.imageLabelType_) {
            case 0:
                abqVar = abq.IMAGE_LABEL_TYPE_UNKNOWN;
                break;
            case 1:
                abqVar = abq.PREFERRED;
                break;
            case 2:
                abqVar = abq.TRAFFIC;
                break;
            case 3:
                abqVar = abq.ACCIDENT;
                break;
            case 4:
                abqVar = abq.CONSTRUCTION;
                break;
            case 5:
                abqVar = abq.POTHOLE;
                break;
            case 6:
                abqVar = abq.BROKEN_TRAFFIC_LIGHT;
                break;
            case 7:
                abqVar = abq.WEATHER;
                break;
            case 8:
                abqVar = abq.SLIPPERY_ROAD;
                break;
            case 9:
                abqVar = abq.FLOOD;
                break;
            case 10:
                abqVar = abq.UNPLOWED_ROAD;
                break;
            case 11:
                abqVar = abq.FOG;
                break;
            case 12:
                abqVar = abq.ICY_ROAD;
                break;
            case 13:
                abqVar = abq.BLOCKED_LANE;
                break;
            default:
                abqVar = null;
                break;
        }
        return abqVar == null ? abq.UNRECOGNIZED : abqVar;
    }

    public int getImageLabelTypeValue() {
        return this.imageLabelType_;
    }

    public boolean getPreferred() {
        return this.preferred_;
    }

    public boolean getReassurance() {
        return this.reassurance_;
    }

    public boolean getRoadshield() {
        return this.roadshield_;
    }

    public boolean getSimilarEtaByBe() {
        return this.similarEtaByBe_;
    }

    public boolean hasAlertSubtype() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasAlertType() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDetourId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDifferenceMinutes() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasImageLabelType() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasPreferred() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasReassurance() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasRoadshield() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasSimilarEtaByBe() {
        return (this.bitField0_ & 32) != 0;
    }

    public static rn newBuilder(ro roVar) {
        return (rn) DEFAULT_INSTANCE.createBuilder(roVar);
    }

    public static ro parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ro) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ro parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ro) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ro parseFrom(com.google.v.z zVar) {
        return (ro) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ro parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ro) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ro parseFrom(InputStream inputStream) {
        return (ro) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ro parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ro) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ro parseFrom(ByteBuffer byteBuffer) {
        return (ro) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ro parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ro) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ro parseFrom(byte[] bArr) {
        return (ro) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ro parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ro) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
