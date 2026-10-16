package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class cn extends com.google.v.du<cn, cm> implements fj {
    public static final int AZIMUTH_FIELD_NUMBER = 6;
    private static final cn DEFAULT_INSTANCE;
    public static final int FROM_NODE_ID_FIELD_NUMBER = 2;
    public static final int LAT_TIMES_1000000_FIELD_NUMBER = 4;
    public static final int LON_TIMES_1000000_FIELD_NUMBER = 5;
    private static volatile fo<cn> PARSER = null;
    public static final int TO_NODE_ID_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int azimuth_;
    private int bitField0_;
    private int fromNodeId_;
    private int latTimes1000000_;
    private int lonTimes1000000_;
    private int toNodeId_;
    private int type_;

    static {
        cn cnVar = new cn();
        DEFAULT_INSTANCE = cnVar;
        com.google.v.du.registerDefaultInstance(cn.class, cnVar);
    }

    private cn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAzimuth() {
        this.bitField0_ &= -33;
        this.azimuth_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromNodeId() {
        this.bitField0_ &= -3;
        this.fromNodeId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatTimes1000000() {
        this.bitField0_ &= -9;
        this.latTimes1000000_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLonTimes1000000() {
        this.bitField0_ &= -17;
        this.lonTimes1000000_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToNodeId() {
        this.bitField0_ &= -5;
        this.toNodeId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.bitField0_ &= -2;
        this.type_ = 0;
    }

    public static cn getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
    public void setAzimuth(int i2) {
        this.bitField0_ |= 32;
        this.azimuth_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromNodeId(int i2) {
        this.bitField0_ |= 2;
        this.fromNodeId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatTimes1000000(int i2) {
        this.bitField0_ |= 8;
        this.latTimes1000000_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLonTimes1000000(int i2) {
        this.bitField0_ |= 16;
        this.lonTimes1000000_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToNodeId(int i2) {
        this.bitField0_ |= 4;
        this.toNodeId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(bq bqVar) {
        this.type_ = bqVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001᠌\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004\u0006င\u0005", new Object[]{"bitField0_", "type_", o.f16565k, "fromNodeId_", "toNodeId_", "latTimes1000000_", "lonTimes1000000_", "azimuth_"});
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

    public int getAzimuth() {
        return this.azimuth_;
    }

    public int getFromNodeId() {
        return this.fromNodeId_;
    }

    public int getLatTimes1000000() {
        return this.latTimes1000000_;
    }

    public int getLonTimes1000000() {
        return this.lonTimes1000000_;
    }

    public int getToNodeId() {
        return this.toNodeId_;
    }

    public bq getType() {
        bq bqVarA = bq.a(this.type_);
        return bqVarA == null ? bq.CLOSURE_UNSPECIFIED : bqVarA;
    }

    public boolean hasAzimuth() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasFromNodeId() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLatTimes1000000() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLonTimes1000000() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasToNodeId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasType() {
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
