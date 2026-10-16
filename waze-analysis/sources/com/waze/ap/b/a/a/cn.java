package com.waze.ap.b.a.a;

import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cn extends com.google.v.du<cn, cm> implements co {
    private static final cn DEFAULT_INSTANCE;
    public static final int PARAMETERS_SEGMENTATION_CONFIGURATION_FIELD_NUMBER = 2;
    private static volatile fo<cn> PARSER = null;
    public static final int ROAD_TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private bw parametersSegmentationConfiguration_;
    private int roadType_;

    static {
        cn cnVar = new cn();
        DEFAULT_INSTANCE = cnVar;
        com.google.v.du.registerDefaultInstance(cn.class, cnVar);
    }

    private cn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearParametersSegmentationConfiguration() {
        this.parametersSegmentationConfiguration_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadType() {
        this.bitField0_ &= -2;
        this.roadType_ = 0;
    }

    public static cn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeParametersSegmentationConfiguration(bw bwVar) {
        Objects.requireNonNull(bwVar);
        bw bwVar2 = this.parametersSegmentationConfiguration_;
        if (bwVar2 != null && bwVar2 != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder(bwVar2);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.parametersSegmentationConfiguration_ = bwVar;
        this.bitField0_ |= 2;
    }

    public static cm newBuilder() {
        return (cm) DEFAULT_INSTANCE.createBuilder();
    }

    public static cn parseDelimitedFrom(InputStream inputStream) {
        return (cn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cn parseFrom(com.google.v.v vVar) {
        return (cn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setParametersSegmentationConfiguration(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.parametersSegmentationConfiguration_ = bwVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadType(cl clVar) {
        this.roadType_ = clVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadTypeValue(int i2) {
        this.bitField0_ |= 1;
        this.roadType_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "roadType_", "parametersSegmentationConfiguration_"});
        }
        if (iOrdinal == 3) {
            return new cn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bw getParametersSegmentationConfiguration() {
        bw bwVar = this.parametersSegmentationConfiguration_;
        return bwVar == null ? bw.getDefaultInstance() : bwVar;
    }

    public cl getRoadType() {
        cl clVar;
        switch (this.roadType_) {
            case 0:
                clVar = cl.ROAD_TYPE_UNKNOWN;
                break;
            case 1:
                clVar = cl.ROAD_TYPE_FREEWAY;
                break;
            case 2:
                clVar = cl.ROAD_TYPE_PRIMARY;
                break;
            case 3:
                clVar = cl.ROAD_TYPE_SECONDARY;
                break;
            case 4:
                clVar = cl.ROAD_TYPE_RAMP;
                break;
            case 5:
                clVar = cl.ROAD_TYPE_MAIN;
                break;
            case 6:
                clVar = cl.ROAD_TYPE_EXIT;
                break;
            case 7:
                clVar = cl.ROAD_TYPE_STREET;
                break;
            case 8:
                clVar = cl.ROAD_TYPE_PEDESTRIAN;
                break;
            case 9:
                clVar = cl.ROAD_TYPE_4X4;
                break;
            case 10:
                clVar = cl.ROAD_TYPE_TRAIL;
                break;
            case 11:
                clVar = cl.ROAD_TYPE_WALKWAY;
                break;
            case 12:
                clVar = cl.ROAD_TYPE_RAILROAD;
                break;
            case 13:
                clVar = cl.ROAD_TYPE_RUNWAY;
                break;
            case 14:
                clVar = cl.ROAD_TYPE_FERRY;
                break;
            case 15:
                clVar = cl.ROAD_TYPE_PRIVATE;
                break;
            case 16:
                clVar = cl.ROAD_TYPE_PARKING;
                break;
            case 17:
                clVar = cl.ROAD_TYPE_DIRT;
                break;
            case 18:
                clVar = cl.ROAD_TYPE_MINOR;
                break;
            default:
                clVar = null;
                break;
        }
        return clVar == null ? cl.UNRECOGNIZED : clVar;
    }

    public int getRoadTypeValue() {
        return this.roadType_;
    }

    public boolean hasParametersSegmentationConfiguration() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRoadType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cm newBuilder(cn cnVar) {
        return (cm) DEFAULT_INSTANCE.createBuilder(cnVar);
    }

    public static cn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cn parseFrom(com.google.v.z zVar) {
        return (cn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cn parseFrom(InputStream inputStream) {
        return (cn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cn parseFrom(ByteBuffer byteBuffer) {
        return (cn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cn parseFrom(byte[] bArr) {
        return (cn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
