package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bab extends com.google.v.du<bab, azz> implements com.google.v.fj {
    public static final int ALERTER_INFO_FIELD_NUMBER = 3;
    private static final bab DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<bab> PARSER = null;
    public static final int SEGMENT_ID_FIELD_NUMBER = 2;
    public static final int SEGMENT_INSIGHT_TYPE_FIELD_NUMBER = 4;
    public static final int SEGMENT_TYPE_FIELD_NUMBER = 1;
    private int segmentInsightType_;
    private int segmentType_;
    private String segmentId_ = "";
    private com.google.v.eo<ck> alerterInfo_ = emptyProtobufList();

    static {
        bab babVar = new bab();
        DEFAULT_INSTANCE = babVar;
        com.google.v.du.registerDefaultInstance(bab.class, babVar);
    }

    private bab() {
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
    public void clearSegmentId() {
        this.segmentId_ = getDefaultInstance().getSegmentId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentInsightType() {
        this.segmentInsightType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentType() {
        this.segmentType_ = 0;
    }

    private void ensureAlerterInfoIsMutable() {
        com.google.v.eo<ck> eoVar = this.alerterInfo_;
        if (eoVar.c()) {
            return;
        }
        this.alerterInfo_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static bab getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static azz newBuilder() {
        return (azz) DEFAULT_INSTANCE.createBuilder();
    }

    public static bab parseDelimitedFrom(InputStream inputStream) {
        return (bab) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bab parseFrom(com.google.v.v vVar) {
        return (bab) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bab> parser() {
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
    public void setSegmentType(baa baaVar) {
        this.segmentType_ = baaVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentTypeValue(int i2) {
        this.segmentType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001\f\u0002Ȉ\u0003\u001b\u0004\f", new Object[]{"segmentType_", "segmentId_", "alerterInfo_", ck.class, "segmentInsightType_"});
        }
        if (iOrdinal == 3) {
            return new bab();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new azz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bab> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bab.class) {
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

    public baa getSegmentType() {
        baa baaVar;
        switch (this.segmentType_) {
            case 0:
                baaVar = baa.SEGMENT_TYPE_UNSPECIFIED;
                break;
            case 1:
                baaVar = baa.SCHOOL_ZONE;
                break;
            case 2:
                baaVar = baa.TRAFFIC;
                break;
            case 3:
                baaVar = baa.ENFORCEMENT_ZONE;
                break;
            case 4:
                baaVar = baa.AVERAGE_SPEED_ZONE;
                break;
            case 5:
                baaVar = baa.GUARDIAN;
                break;
            case 6:
                baaVar = baa.DANGER_ZONE;
                break;
            case 7:
                baaVar = baa.GROUPED_SPEED_BUMPS;
                break;
            case 8:
                baaVar = baa.GROUPED_SHARP_CURVES;
                break;
            case 9:
                baaVar = baa.GROUPED_HOV_LANE_CAMERAS;
                break;
            case 10:
                baaVar = baa.GROUPED_CARPOOL_LANE_CAMERAS;
                break;
            case 11:
                baaVar = baa.GROUPED_BUS_LANE_CAMERAS;
                break;
            case 12:
                baaVar = baa.GROUPED_CONSTRUCTION;
                break;
            case 13:
                baaVar = baa.GROUPED_HAZARD_WEATHER;
                break;
            case 14:
                baaVar = baa.GROUPED_HAZARD_WEATHER_FOG;
                break;
            case 15:
                baaVar = baa.GROUPED_HAZARD_WEATHER_HAIL;
                break;
            case 16:
                baaVar = baa.GROUPED_HAZARD_WEATHER_HEAVY_RAIN;
                break;
            case 17:
                baaVar = baa.GROUPED_HAZARD_WEATHER_FLOOD;
                break;
            default:
                baaVar = null;
                break;
        }
        return baaVar == null ? baa.UNRECOGNIZED : baaVar;
    }

    public int getSegmentTypeValue() {
        return this.segmentType_;
    }

    public static azz newBuilder(bab babVar) {
        return (azz) DEFAULT_INSTANCE.createBuilder(babVar);
    }

    public static bab parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bab) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bab parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bab) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bab parseFrom(com.google.v.z zVar) {
        return (bab) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bab parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bab) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAlerterInfo(ck ckVar) {
        Objects.requireNonNull(ckVar);
        ensureAlerterInfoIsMutable();
        this.alerterInfo_.add(ckVar);
    }

    public static bab parseFrom(InputStream inputStream) {
        return (bab) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bab parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bab) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bab parseFrom(ByteBuffer byteBuffer) {
        return (bab) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bab parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bab) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bab parseFrom(byte[] bArr) {
        return (bab) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bab parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bab) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
