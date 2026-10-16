package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aet extends com.google.v.du<aet, aeq> implements com.google.v.fj {
    public static final int ALERTER_INFO_FIELD_NUMBER = 4;
    private static final aet DEFAULT_INSTANCE;
    public static final int IMPRESSION_ID_FIELD_NUMBER = 7;
    public static final int IS_PERSONALIZED_SEGMENT_FIELD_NUMBER = 6;
    private static volatile com.google.v.fo<aet> PARSER = null;
    public static final int SEGMENT_ID_FIELD_NUMBER = 1;
    public static final int SEGMENT_INSIGHT_TYPE_FIELD_NUMBER = 5;
    public static final int TYPE_FIELD_NUMBER = 3;
    public static final int USER_POSITION_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean isPersonalizedSegment_;
    private int segmentInsightType_;
    private int type_;
    private int userPosition_;
    private String segmentId_ = "";
    private com.google.v.eo<ck> alerterInfo_ = emptyProtobufList();
    private String impressionId_ = "";

    static {
        aet aetVar = new aet();
        DEFAULT_INSTANCE = aetVar;
        com.google.v.du.registerDefaultInstance(aet.class, aetVar);
    }

    private aet() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlerterInfo(int i2, ck ckVar) {
        Objects.requireNonNull(ckVar);
        ensureAlerterInfoIsMutable();
        this.alerterInfo_.add(i2, ckVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAlerterInfo(Iterable<? extends ck> iterable) {
        ensureAlerterInfoIsMutable();
        com.google.v.c.addAll(iterable, this.alerterInfo_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlerterInfo() {
        this.alerterInfo_ = emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImpressionId() {
        this.impressionId_ = getDefaultInstance().getImpressionId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsPersonalizedSegment() {
        this.bitField0_ &= -2;
        this.isPersonalizedSegment_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentId() {
        this.segmentId_ = getDefaultInstance().getSegmentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentInsightType() {
        this.segmentInsightType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserPosition() {
        this.userPosition_ = 0;
    }

    private void ensureAlerterInfoIsMutable() {
        com.google.v.eo<ck> eoVar = this.alerterInfo_;
        if (eoVar.c()) {
            return;
        }
        this.alerterInfo_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static aet getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aeq newBuilder() {
        return (aeq) DEFAULT_INSTANCE.createBuilder();
    }

    public static aet parseDelimitedFrom(InputStream inputStream) {
        return (aet) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aet parseFrom(com.google.v.v vVar) {
        return (aet) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aet> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAlerterInfo(int i2) {
        ensureAlerterInfoIsMutable();
        this.alerterInfo_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlerterInfo(int i2, ck ckVar) {
        Objects.requireNonNull(ckVar);
        ensureAlerterInfoIsMutable();
        this.alerterInfo_.set(i2, ckVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpressionId(String str) {
        Objects.requireNonNull(str);
        this.impressionId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImpressionIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.impressionId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsPersonalizedSegment(boolean z) {
        this.bitField0_ |= 1;
        this.isPersonalizedSegment_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentId(String str) {
        Objects.requireNonNull(str);
        this.segmentId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.segmentId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentInsightType(bae baeVar) {
        this.segmentInsightType_ = baeVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentInsightTypeValue(int i2) {
        this.segmentInsightType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(aer aerVar) {
        this.type_ = aerVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i2) {
        this.type_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserPosition(aes aesVar) {
        this.userPosition_ = aesVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserPositionValue(int i2) {
        this.userPosition_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0001\u0000\u0001Ȉ\u0002\f\u0003\f\u0004\u001b\u0005\f\u0006ဇ\u0000\u0007Ȉ", new Object[]{"bitField0_", "segmentId_", "userPosition_", "type_", "alerterInfo_", ck.class, "segmentInsightType_", "isPersonalizedSegment_", "impressionId_"});
        }
        if (iOrdinal == 3) {
            return new aet();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aeq(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aet> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aet.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ck getAlerterInfo(int i2) {
        return this.alerterInfo_.get(i2);
    }

    public int getAlerterInfoCount() {
        return this.alerterInfo_.size();
    }

    public List<ck> getAlerterInfoList() {
        return this.alerterInfo_;
    }

    public cl getAlerterInfoOrBuilder(int i2) {
        return this.alerterInfo_.get(i2);
    }

    public List<? extends cl> getAlerterInfoOrBuilderList() {
        return this.alerterInfo_;
    }

    public String getImpressionId() {
        return this.impressionId_;
    }

    public com.google.v.v getImpressionIdBytes() {
        return com.google.v.v.s(this.impressionId_);
    }

    public boolean getIsPersonalizedSegment() {
        return this.isPersonalizedSegment_;
    }

    public String getSegmentId() {
        return this.segmentId_;
    }

    public com.google.v.v getSegmentIdBytes() {
        return com.google.v.v.s(this.segmentId_);
    }

    public bae getSegmentInsightType() {
        bae baeVarA = bae.a(this.segmentInsightType_);
        return baeVarA == null ? bae.UNRECOGNIZED : baeVarA;
    }

    public int getSegmentInsightTypeValue() {
        return this.segmentInsightType_;
    }

    public aer getType() {
        aer aerVar;
        switch (this.type_) {
            case 0:
                aerVar = aer.SEGMENT_TYPE_UNSPECIFIED;
                break;
            case 1:
                aerVar = aer.SCHOOL_ZONE;
                break;
            case 2:
                aerVar = aer.TRAFFIC;
                break;
            case 3:
                aerVar = aer.ENFORCEMENT_ZONE;
                break;
            case 4:
                aerVar = aer.AVERAGE_SPEED_ZONE;
                break;
            case 5:
                aerVar = aer.GUARDIAN;
                break;
            case 6:
                aerVar = aer.DANGER_ZONE;
                break;
            case 7:
                aerVar = aer.GROUPED_SPEED_BUMPS;
                break;
            case 8:
                aerVar = aer.GROUPED_SHARP_CURVES;
                break;
            case 9:
                aerVar = aer.GROUPED_HOV_LANE_CAMERAS;
                break;
            case 10:
                aerVar = aer.GROUPED_CARPOOL_LANE_CAMERAS;
                break;
            case 11:
                aerVar = aer.GROUPED_BUS_LANE_CAMERAS;
                break;
            case 12:
                aerVar = aer.GROUPED_CONSTRUCTION;
                break;
            case 13:
                aerVar = aer.GROUPED_HAZARD_WEATHER;
                break;
            case 14:
                aerVar = aer.GROUPED_HAZARD_WEATHER_FOG;
                break;
            case 15:
                aerVar = aer.GROUPED_HAZARD_WEATHER_HAIL;
                break;
            case 16:
                aerVar = aer.GROUPED_HAZARD_WEATHER_HEAVY_RAIN;
                break;
            case 17:
                aerVar = aer.GROUPED_HAZARD_WEATHER_FLOOD;
                break;
            default:
                aerVar = null;
                break;
        }
        return aerVar == null ? aer.UNRECOGNIZED : aerVar;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public aes getUserPosition() {
        int i2 = this.userPosition_;
        aes aesVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : aes.FINISHED : aes.WITHIN : aes.AT_START : aes.APPROACHING : aes.USER_POSITION_UNSPECIFIED;
        return aesVar == null ? aes.UNRECOGNIZED : aesVar;
    }

    public int getUserPositionValue() {
        return this.userPosition_;
    }

    public boolean hasIsPersonalizedSegment() {
        return (this.bitField0_ & 1) != 0;
    }

    public static aeq newBuilder(aet aetVar) {
        return (aeq) DEFAULT_INSTANCE.createBuilder(aetVar);
    }

    public static aet parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aet) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aet parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aet) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aet parseFrom(com.google.v.z zVar) {
        return (aet) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aet parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aet) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlerterInfo(ck ckVar) {
        Objects.requireNonNull(ckVar);
        ensureAlerterInfoIsMutable();
        this.alerterInfo_.add(ckVar);
    }

    public static aet parseFrom(InputStream inputStream) {
        return (aet) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aet parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aet) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aet parseFrom(ByteBuffer byteBuffer) {
        return (aet) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aet parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aet) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aet parseFrom(byte[] bArr) {
        return (aet) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aet parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aet) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
