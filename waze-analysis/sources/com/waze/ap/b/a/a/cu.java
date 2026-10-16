package com.waze.ap.b.a.a;

import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cu extends com.google.v.du<cu, ct> implements fj {
    private static final cu DEFAULT_INSTANCE;
    public static final int DEFAULT_SEGMENTATION_CONFIGURATION_FIELD_NUMBER = 1;
    private static volatile fo<cu> PARSER = null;
    public static final int ROAD_TYPE_SPECIFIC_SEGMENTATION_CONFIGURATION_FIELD_NUMBER = 2;
    private int bitField0_;
    private bw defaultSegmentationConfiguration_;
    private eo<cn> roadTypeSpecificSegmentationConfiguration_ = emptyProtobufList();

    static {
        cu cuVar = new cu();
        DEFAULT_INSTANCE = cuVar;
        com.google.v.du.registerDefaultInstance(cu.class, cuVar);
    }

    private cu() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllRoadTypeSpecificSegmentationConfiguration(Iterable<? extends cn> iterable) {
        ensureRoadTypeSpecificSegmentationConfigurationIsMutable();
        com.google.v.c.addAll(iterable, this.roadTypeSpecificSegmentationConfiguration_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRoadTypeSpecificSegmentationConfiguration(int i2, cn cnVar) {
        Objects.requireNonNull(cnVar);
        ensureRoadTypeSpecificSegmentationConfigurationIsMutable();
        this.roadTypeSpecificSegmentationConfiguration_.add(i2, cnVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDefaultSegmentationConfiguration() {
        this.defaultSegmentationConfiguration_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadTypeSpecificSegmentationConfiguration() {
        this.roadTypeSpecificSegmentationConfiguration_ = emptyProtobufList();
    }

    private void ensureRoadTypeSpecificSegmentationConfigurationIsMutable() {
        eo<cn> eoVar = this.roadTypeSpecificSegmentationConfiguration_;
        if (eoVar.c()) {
            return;
        }
        this.roadTypeSpecificSegmentationConfiguration_ = com.google.v.du.mutableCopy(eoVar);
    }

    public static cu getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDefaultSegmentationConfiguration(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.defaultSegmentationConfiguration_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.defaultSegmentationConfiguration_ = bwVar;
        this.bitField0_ |= 1;
    }

    public static ct newBuilder() {
        return (ct) DEFAULT_INSTANCE.createBuilder();
    }

    public static cu parseDelimitedFrom(InputStream inputStream) {
        return (cu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cu parseFrom(com.google.v.v vVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cu> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeRoadTypeSpecificSegmentationConfiguration(int i2) {
        ensureRoadTypeSpecificSegmentationConfigurationIsMutable();
        this.roadTypeSpecificSegmentationConfiguration_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDefaultSegmentationConfiguration(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.defaultSegmentationConfiguration_ = bwVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadTypeSpecificSegmentationConfiguration(int i2, cn cnVar) {
        Objects.requireNonNull(cnVar);
        ensureRoadTypeSpecificSegmentationConfigurationIsMutable();
        this.roadTypeSpecificSegmentationConfiguration_.set(i2, cnVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b", new Object[]{"bitField0_", "defaultSegmentationConfiguration_", "roadTypeSpecificSegmentationConfiguration_", cn.class});
        }
        if (iOrdinal == 3) {
            return new cu();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ct(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cu> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cu.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bw getDefaultSegmentationConfiguration() {
        bw bwVar = this.defaultSegmentationConfiguration_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public cn getRoadTypeSpecificSegmentationConfiguration(int i2) {
        return this.roadTypeSpecificSegmentationConfiguration_.get(i2);
    }

    public int getRoadTypeSpecificSegmentationConfigurationCount() {
        return this.roadTypeSpecificSegmentationConfiguration_.size();
    }

    public List<cn> getRoadTypeSpecificSegmentationConfigurationList() {
        return this.roadTypeSpecificSegmentationConfiguration_;
    }

    public co getRoadTypeSpecificSegmentationConfigurationOrBuilder(int i2) {
        return this.roadTypeSpecificSegmentationConfiguration_.get(i2);
    }

    public List<? extends co> getRoadTypeSpecificSegmentationConfigurationOrBuilderList() {
        return this.roadTypeSpecificSegmentationConfiguration_;
    }

    public boolean hasDefaultSegmentationConfiguration() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ct newBuilder(cu cuVar) {
        return (ct) DEFAULT_INSTANCE.createBuilder(cuVar);
    }

    public static cu parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cu) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cu parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cu parseFrom(com.google.v.z zVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cu parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addRoadTypeSpecificSegmentationConfiguration(cn cnVar) {
        Objects.requireNonNull(cnVar);
        ensureRoadTypeSpecificSegmentationConfigurationIsMutable();
        this.roadTypeSpecificSegmentationConfiguration_.add(cnVar);
    }

    public static cu parseFrom(InputStream inputStream) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cu parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cu parseFrom(ByteBuffer byteBuffer) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cu parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cu parseFrom(byte[] bArr) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cu parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cu) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
