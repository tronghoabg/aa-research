package com.google.k.a.a.b;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class db extends com.google.v.du<db, da> implements dc {
    public static final int BOUNDING_MARKER_FIELD_NUMBER = 1;
    public static final int BOUNDING_MARKER_ID_FIELD_NUMBER = 11;
    public static final int BOUNDING_MARKER_PATTERN_FIELD_NUMBER = 9;
    public static final int BOUNDING_MARKER_STATUS_FIELD_NUMBER = 8;
    public static final int BOUNDING_MARKER_TOKEN_FIELD_NUMBER = 7;
    private static final db DEFAULT_INSTANCE;
    public static final int FLOWLINE_ADJACENCY_BEGIN_FRACTION_FIELD_NUMBER = 5;
    public static final int FLOWLINE_ADJACENCY_END_FRACTION_FIELD_NUMBER = 6;
    public static final int MARKER_ADJACENCY_BEGIN_FRACTION_FIELD_NUMBER = 3;
    public static final int MARKER_ADJACENCY_END_FRACTION_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<db> PARSER = null;
    public static final int SIDE_FIELD_NUMBER = 2;
    private int bitField0_;
    private long boundingMarkerId_;
    private Object boundingMarkerOneof_;
    private double flowlineAdjacencyBeginFraction_;
    private double flowlineAdjacencyEndFraction_;
    private double markerAdjacencyBeginFraction_;
    private double markerAdjacencyEndFraction_;
    private int side_;
    private int boundingMarkerOneofCase_ = 0;
    private byte memoizedIsInitialized = 2;
    private String boundingMarkerToken_ = "";

    static {
        db dbVar = new db();
        DEFAULT_INSTANCE = dbVar;
        com.google.v.du.registerDefaultInstance(db.class, dbVar);
    }

    private db() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoundingMarker() {
        if (this.boundingMarkerOneofCase_ == 1) {
            this.boundingMarkerOneofCase_ = 0;
            this.boundingMarkerOneof_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoundingMarkerId() {
        this.bitField0_ &= -2;
        this.boundingMarkerId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoundingMarkerOneof() {
        this.boundingMarkerOneofCase_ = 0;
        this.boundingMarkerOneof_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoundingMarkerPattern() {
        if (this.boundingMarkerOneofCase_ == 9) {
            this.boundingMarkerOneofCase_ = 0;
            this.boundingMarkerOneof_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoundingMarkerStatus() {
        if (this.boundingMarkerOneofCase_ == 8) {
            this.boundingMarkerOneofCase_ = 0;
            this.boundingMarkerOneof_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoundingMarkerToken() {
        this.bitField0_ &= -65;
        this.boundingMarkerToken_ = getDefaultInstance().getBoundingMarkerToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlowlineAdjacencyBeginFraction() {
        this.bitField0_ &= -17;
        this.flowlineAdjacencyBeginFraction_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlowlineAdjacencyEndFraction() {
        this.bitField0_ &= -33;
        this.flowlineAdjacencyEndFraction_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMarkerAdjacencyBeginFraction() {
        this.bitField0_ &= -5;
        this.markerAdjacencyBeginFraction_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMarkerAdjacencyEndFraction() {
        this.bitField0_ &= -9;
        this.markerAdjacencyEndFraction_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSide() {
        this.bitField0_ &= -3;
        this.side_ = 0;
    }

    public static db getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBoundingMarker(bw bwVar) {
        Objects.requireNonNull(bwVar);
        if (this.boundingMarkerOneofCase_ == 1 && this.boundingMarkerOneof_ != bw.getDefaultInstance()) {
            bv bvVarNewBuilder = bw.newBuilder((bw) this.boundingMarkerOneof_);
            bvVarNewBuilder.mergeFrom((bv) bwVar);
            bwVar = bvVarNewBuilder.buildPartial();
        }
        this.boundingMarkerOneof_ = bwVar;
        this.boundingMarkerOneofCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBoundingMarkerPattern(com.google.k.a.a.fg fgVar) {
        Objects.requireNonNull(fgVar);
        if (this.boundingMarkerOneofCase_ == 9 && this.boundingMarkerOneof_ != com.google.k.a.a.fg.getDefaultInstance()) {
            com.google.k.a.a.ff ffVarNewBuilder = com.google.k.a.a.fg.newBuilder((com.google.k.a.a.fg) this.boundingMarkerOneof_);
            ffVarNewBuilder.mergeFrom((com.google.k.a.a.ff) fgVar);
            fgVar = ffVarNewBuilder.buildPartial();
        }
        this.boundingMarkerOneof_ = fgVar;
        this.boundingMarkerOneofCase_ = 9;
    }

    public static da newBuilder() {
        return (da) DEFAULT_INSTANCE.createBuilder();
    }

    public static db parseDelimitedFrom(InputStream inputStream) {
        return (db) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static db parseFrom(com.google.v.v vVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<db> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoundingMarker(bw bwVar) {
        Objects.requireNonNull(bwVar);
        this.boundingMarkerOneof_ = bwVar;
        this.boundingMarkerOneofCase_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoundingMarkerId(long j2) {
        this.bitField0_ |= 1;
        this.boundingMarkerId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoundingMarkerPattern(com.google.k.a.a.fg fgVar) {
        Objects.requireNonNull(fgVar);
        this.boundingMarkerOneof_ = fgVar;
        this.boundingMarkerOneofCase_ = 9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoundingMarkerStatus(com.google.k.a.a.jh jhVar) {
        this.boundingMarkerOneof_ = Integer.valueOf(jhVar.getNumber());
        this.boundingMarkerOneofCase_ = 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoundingMarkerToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.boundingMarkerToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoundingMarkerTokenBytes(com.google.v.v vVar) {
        this.boundingMarkerToken_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlowlineAdjacencyBeginFraction(double d2) {
        this.bitField0_ |= 16;
        this.flowlineAdjacencyBeginFraction_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlowlineAdjacencyEndFraction(double d2) {
        this.bitField0_ |= 32;
        this.flowlineAdjacencyEndFraction_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMarkerAdjacencyBeginFraction(double d2) {
        this.bitField0_ |= 4;
        this.markerAdjacencyBeginFraction_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMarkerAdjacencyEndFraction(double d2) {
        this.bitField0_ |= 8;
        this.markerAdjacencyEndFraction_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSide(cz czVar) {
        this.side_ = czVar.getNumber();
        this.bitField0_ |= 2;
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
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0001\u0001\u0001\u000b\n\u0000\u0000\u0001\u0001м\u0000\u0002᠌\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004\u0006က\u0005\u0007ဈ\u0006\b\u083f\u0000\t<\u0000\u000bဃ\u0000", new Object[]{"boundingMarkerOneof_", "boundingMarkerOneofCase_", "bitField0_", bw.class, "side_", c.r, "markerAdjacencyBeginFraction_", "markerAdjacencyEndFraction_", "flowlineAdjacencyBeginFraction_", "flowlineAdjacencyEndFraction_", "boundingMarkerToken_", com.google.k.a.a.jh.b(), com.google.k.a.a.fg.class, "boundingMarkerId_"});
            case 3:
                return new db();
            case 4:
                return new da(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<db> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (db.class) {
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

    public bw getBoundingMarker() {
        return this.boundingMarkerOneofCase_ == 1 ? (bw) this.boundingMarkerOneof_ : bw.getDefaultInstance();
    }

    public long getBoundingMarkerId() {
        return this.boundingMarkerId_;
    }

    public cy getBoundingMarkerOneofCase() {
        int i2 = this.boundingMarkerOneofCase_;
        if (i2 == 0) {
            return cy.f11220d;
        }
        if (i2 == 1) {
            return cy.f11218b;
        }
        if (i2 == 8) {
            return cy.f11217a;
        }
        if (i2 != 9) {
            return null;
        }
        return cy.f11219c;
    }

    public com.google.k.a.a.fg getBoundingMarkerPattern() {
        return this.boundingMarkerOneofCase_ == 9 ? (com.google.k.a.a.fg) this.boundingMarkerOneof_ : com.google.k.a.a.fg.getDefaultInstance();
    }

    public com.google.k.a.a.jh getBoundingMarkerStatus() {
        com.google.k.a.a.jh jhVarA;
        return (this.boundingMarkerOneofCase_ != 8 || (jhVarA = com.google.k.a.a.jh.a(((Integer) this.boundingMarkerOneof_).intValue())) == null) ? com.google.k.a.a.jh.PROPERTY_VALUE_STATUS_UNSPECIFIED : jhVarA;
    }

    public String getBoundingMarkerToken() {
        return this.boundingMarkerToken_;
    }

    public com.google.v.v getBoundingMarkerTokenBytes() {
        return com.google.v.v.s(this.boundingMarkerToken_);
    }

    public double getFlowlineAdjacencyBeginFraction() {
        return this.flowlineAdjacencyBeginFraction_;
    }

    public double getFlowlineAdjacencyEndFraction() {
        return this.flowlineAdjacencyEndFraction_;
    }

    public double getMarkerAdjacencyBeginFraction() {
        return this.markerAdjacencyBeginFraction_;
    }

    public double getMarkerAdjacencyEndFraction() {
        return this.markerAdjacencyEndFraction_;
    }

    public cz getSide() {
        cz czVarA = cz.a(this.side_);
        return czVarA == null ? cz.UNKNOWN : czVarA;
    }

    public boolean hasBoundingMarker() {
        return this.boundingMarkerOneofCase_ == 1;
    }

    public boolean hasBoundingMarkerId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasBoundingMarkerPattern() {
        return this.boundingMarkerOneofCase_ == 9;
    }

    public boolean hasBoundingMarkerStatus() {
        return this.boundingMarkerOneofCase_ == 8;
    }

    public boolean hasBoundingMarkerToken() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasFlowlineAdjacencyBeginFraction() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasFlowlineAdjacencyEndFraction() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasMarkerAdjacencyBeginFraction() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasMarkerAdjacencyEndFraction() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSide() {
        return (this.bitField0_ & 2) != 0;
    }

    public static da newBuilder(db dbVar) {
        return (da) DEFAULT_INSTANCE.createBuilder(dbVar);
    }

    public static db parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (db) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static db parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static db parseFrom(com.google.v.z zVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static db parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static db parseFrom(InputStream inputStream) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static db parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static db parseFrom(ByteBuffer byteBuffer) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static db parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static db parseFrom(byte[] bArr) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static db parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (db) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
