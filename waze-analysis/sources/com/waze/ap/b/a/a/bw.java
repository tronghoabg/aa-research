package com.waze.ap.b.a.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bw extends com.google.v.du<bw, bv> implements fj {
    private static final bw DEFAULT_INSTANCE;
    public static final int MAX_DISTANCE_BETWEEN_TWO_INSIGHTS_FIELD_NUMBER = 1;
    public static final int MAX_DISTANCE_TO_EXTEND_SEGMENT_INSIGHT_FIELD_NUMBER = 2;
    public static final int MIN_LENGTH_SEGMENT_INSIGHT_FIELD_NUMBER = 3;
    private static volatile fo<bw> PARSER;
    private int bitField0_;
    private int maxDistanceBetweenTwoInsights_;
    private int maxDistanceToExtendSegmentInsight_;
    private int minLengthSegmentInsight_;

    static {
        bw bwVar = new bw();
        DEFAULT_INSTANCE = bwVar;
        com.google.v.du.registerDefaultInstance(bw.class, bwVar);
    }

    private bw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxDistanceBetweenTwoInsights() {
        this.bitField0_ &= -2;
        this.maxDistanceBetweenTwoInsights_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxDistanceToExtendSegmentInsight() {
        this.bitField0_ &= -3;
        this.maxDistanceToExtendSegmentInsight_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinLengthSegmentInsight() {
        this.bitField0_ &= -5;
        this.minLengthSegmentInsight_ = 0;
    }

    public static bw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bv newBuilder() {
        return (bv) DEFAULT_INSTANCE.createBuilder();
    }

    public static bw parseDelimitedFrom(InputStream inputStream) {
        return (bw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bw parseFrom(com.google.v.v vVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxDistanceBetweenTwoInsights(int i2) {
        this.bitField0_ |= 1;
        this.maxDistanceBetweenTwoInsights_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxDistanceToExtendSegmentInsight(int i2) {
        this.bitField0_ |= 2;
        this.maxDistanceToExtendSegmentInsight_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinLengthSegmentInsight(int i2) {
        this.bitField0_ |= 4;
        this.minLengthSegmentInsight_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002", new Object[]{"bitField0_", "maxDistanceBetweenTwoInsights_", "maxDistanceToExtendSegmentInsight_", "minLengthSegmentInsight_"});
        }
        if (iOrdinal == 3) {
            return new bw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bv(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getMaxDistanceBetweenTwoInsights() {
        return this.maxDistanceBetweenTwoInsights_;
    }

    public int getMaxDistanceToExtendSegmentInsight() {
        return this.maxDistanceToExtendSegmentInsight_;
    }

    public int getMinLengthSegmentInsight() {
        return this.minLengthSegmentInsight_;
    }

    public boolean hasMaxDistanceBetweenTwoInsights() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMaxDistanceToExtendSegmentInsight() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMinLengthSegmentInsight() {
        return (this.bitField0_ & 4) != 0;
    }

    public static bv newBuilder(bw bwVar) {
        return (bv) DEFAULT_INSTANCE.createBuilder(bwVar);
    }

    public static bw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bw parseFrom(com.google.v.z zVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bw parseFrom(InputStream inputStream) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bw parseFrom(ByteBuffer byteBuffer) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bw parseFrom(byte[] bArr) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
