package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Iterator;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class e extends com.google.v.du<e, a> implements f {
    public static final int CAN_ENTER_FIELD_NUMBER = 5;
    public static final int CAN_EXIT_FIELD_NUMBER = 6;
    private static final e DEFAULT_INSTANCE;
    public static final int FEATURE_ID_FIELD_NUMBER = 10;
    public static final int FEATURE_TYPE_FIELD_NUMBER = 11;
    public static final int LEVEL_FEATURE_ID_FIELD_NUMBER = 13;
    public static final int METADATA_FIELD_NUMBER = 500;
    private static volatile com.google.v.fo<e> PARSER = null;
    public static final int POINT_FIELD_NUMBER = 9;
    public static final int POINT_OFF_SEGMENT_FIELD_NUMBER = 4;
    public static final int POINT_ON_SEGMENT_FIELD_NUMBER = 3;
    public static final int PRIORITY_FIELD_NUMBER = 8;
    public static final int SEGMENT_POSITION_FIELD_NUMBER = 2;
    public static final int UNSUITABLE_TRAVEL_MODE_FIELD_NUMBER = 12;
    private static final com.google.v.el<d> unsuitableTravelMode_converter_ = new ee(1);
    private int bitField0_;
    private boolean canEnter_;
    private boolean canExit_;
    private bw featureId_;
    private int featureType_;
    private bw levelFeatureId_;
    private ce metadata_;
    private es pointOffSegment_;
    private es pointOnSegment_;
    private es point_;
    private float segmentPosition_;
    private byte memoizedIsInitialized = 2;
    private int priority_ = 1;
    private com.google.v.ek unsuitableTravelMode_ = emptyIntList();

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        com.google.v.du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllUnsuitableTravelMode(Iterable<? extends d> iterable) {
        ensureUnsuitableTravelModeIsMutable();
        Iterator<? extends d> it = iterable.iterator();
        while (it.hasNext()) {
            this.unsuitableTravelMode_.i(it.next().getNumber());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addUnsuitableTravelMode(d dVar) {
        Objects.requireNonNull(dVar);
        ensureUnsuitableTravelModeIsMutable();
        this.unsuitableTravelMode_.i(dVar.getNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanEnter() {
        this.bitField0_ &= -65;
        this.canEnter_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanExit() {
        this.bitField0_ &= -129;
        this.canExit_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureId() {
        this.featureId_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFeatureType() {
        this.bitField0_ &= -5;
        this.featureType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLevelFeatureId() {
        this.levelFeatureId_ = null;
        this.bitField0_ &= -513;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetadata() {
        this.metadata_ = null;
        this.bitField0_ &= -1025;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPoint() {
        this.point_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPointOffSegment() {
        this.pointOffSegment_ = null;
        this.bitField0_ &= -33;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPointOnSegment() {
        this.pointOnSegment_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPriority() {
        this.bitField0_ &= -257;
        this.priority_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentPosition() {
        this.bitField0_ &= -9;
        this.segmentPosition_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnsuitableTravelMode() {
        this.unsuitableTravelMode_ = emptyIntList();
    }

    private void ensureUnsuitableTravelModeIsMutable() {
        com.google.v.ek ekVar = this.unsuitableTravelMode_;
        if (ekVar.c()) {
            return;
        }
        this.unsuitableTravelMode_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeFeatureId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.featureId_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.featureId_ = bwVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLevelFeatureId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.levelFeatureId_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.levelFeatureId_ = bwVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        ce ceVar2 = this.metadata_;
        if (ceVar2 != null && ceVar2 != ce.getDefaultInstance()) {
            cd cdVarNewBuilder = ce.newBuilder(ceVar2);
            cdVarNewBuilder.mergeFrom((cd) ceVar);
            ceVar = cdVarNewBuilder.buildPartial();
        }
        this.metadata_ = ceVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePoint(es esVar) {
        Objects.requireNonNull(esVar);
        es esVar2 = this.point_;
        if (esVar2 != null && esVar2 != es.getDefaultInstance()) {
            er erVarNewBuilder = es.newBuilder(esVar2);
            erVarNewBuilder.mergeFrom((er) esVar);
            esVar = erVarNewBuilder.buildPartial();
        }
        this.point_ = esVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePointOffSegment(es esVar) {
        Objects.requireNonNull(esVar);
        es esVar2 = this.pointOffSegment_;
        if (esVar2 != null && esVar2 != es.getDefaultInstance()) {
            er erVarNewBuilder = es.newBuilder(esVar2);
            erVarNewBuilder.mergeFrom((er) esVar);
            esVar = erVarNewBuilder.buildPartial();
        }
        this.pointOffSegment_ = esVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePointOnSegment(es esVar) {
        Objects.requireNonNull(esVar);
        es esVar2 = this.pointOnSegment_;
        if (esVar2 != null && esVar2 != es.getDefaultInstance()) {
            er erVarNewBuilder = es.newBuilder(esVar2);
            erVarNewBuilder.mergeFrom((er) esVar);
            esVar = erVarNewBuilder.buildPartial();
        }
        this.pointOnSegment_ = esVar;
        this.bitField0_ |= 16;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static e parseDelimitedFrom(InputStream inputStream) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(com.google.v.v vVar) {
        return (e) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanEnter(boolean z) {
        this.bitField0_ |= 64;
        this.canEnter_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanExit(boolean z) {
        this.bitField0_ |= 128;
        this.canExit_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.featureId_ = bwVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFeatureType(int i2) {
        this.bitField0_ |= 4;
        this.featureType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLevelFeatureId(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.levelFeatureId_ = bwVar;
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetadata(ce ceVar) {
        Objects.requireNonNull(ceVar);
        this.metadata_ = ceVar;
        this.bitField0_ |= 1024;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPoint(es esVar) {
        Objects.requireNonNull(esVar);
        this.point_ = esVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPointOffSegment(es esVar) {
        Objects.requireNonNull(esVar);
        this.pointOffSegment_ = esVar;
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPointOnSegment(es esVar) {
        Objects.requireNonNull(esVar);
        this.pointOnSegment_ = esVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPriority(b bVar) {
        this.priority_ = bVar.getNumber();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentPosition(float f2) {
        this.bitField0_ |= 8;
        this.segmentPosition_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnsuitableTravelMode(int i2, d dVar) {
        Objects.requireNonNull(dVar);
        ensureUnsuitableTravelModeIsMutable();
        this.unsuitableTravelMode_.e(i2, dVar.getNumber());
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0002Ǵ\f\u0000\u0001\u0005\u0002ခ\u0003\u0003ᐉ\u0004\u0004ᐉ\u0005\u0005ဇ\u0006\u0006ဇ\u0007\b᠌\b\tᐉ\u0000\nᐉ\u0001\u000bင\u0002\fࠞ\rᐉ\tǴဉ\n", new Object[]{"bitField0_", "segmentPosition_", "pointOnSegment_", "pointOffSegment_", "canEnter_", "canExit_", "priority_", c.f11198b, "point_", "featureId_", "featureType_", "unsuitableTravelMode_", c.f11197a, "levelFeatureId_", "metadata_"});
            case 3:
                return new e();
            case 4:
                return new a(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<e> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (e.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public boolean getCanEnter() {
        return this.canEnter_;
    }

    public boolean getCanExit() {
        return this.canExit_;
    }

    public bw getFeatureId() {
        bw bwVar = this.featureId_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public int getFeatureType() {
        return this.featureType_;
    }

    public bw getLevelFeatureId() {
        bw bwVar = this.levelFeatureId_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public ce getMetadata() {
        ce ceVar = this.metadata_;
        return ceVar == null ? ce.getDefaultInstance() : ceVar;
    }

    public es getPoint() {
        es esVar = this.point_;
        return esVar == null ? es.getDefaultInstance() : esVar;
    }

    public es getPointOffSegment() {
        es esVar = this.pointOffSegment_;
        return esVar == null ? es.getDefaultInstance() : esVar;
    }

    public es getPointOnSegment() {
        es esVar = this.pointOnSegment_;
        return esVar == null ? es.getDefaultInstance() : esVar;
    }

    public b getPriority() {
        b bVarA = b.a(this.priority_);
        return bVarA == null ? b.TYPE_PRIMARY : bVarA;
    }

    public float getSegmentPosition() {
        return this.segmentPosition_;
    }

    public d getUnsuitableTravelMode(int i2) {
        d dVarA = d.a(this.unsuitableTravelMode_.d(i2));
        return dVarA == null ? d.TRAVEL_MODE_MOTOR_VEHICLE : dVarA;
    }

    public int getUnsuitableTravelModeCount() {
        return this.unsuitableTravelMode_.size();
    }

    public List<d> getUnsuitableTravelModeList() {
        return new com.google.v.em(this.unsuitableTravelMode_, unsuitableTravelMode_converter_);
    }

    public boolean hasCanEnter() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasCanExit() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasFeatureId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasFeatureType() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLevelFeatureId() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasMetadata() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasPoint() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPointOffSegment() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasPointOnSegment() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPriority() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasSegmentPosition() {
        return (this.bitField0_ & 8) != 0;
    }

    public static a newBuilder(e eVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(eVar);
    }

    public static e parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (e) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static e parseFrom(com.google.v.z zVar) {
        return (e) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static e parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (e) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static e parseFrom(InputStream inputStream) {
        return (e) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (e) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(ByteBuffer byteBuffer) {
        return (e) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (e) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static e parseFrom(byte[] bArr) {
        return (e) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static e parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (e) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
