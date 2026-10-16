package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class fg extends com.google.v.du<fg, ff> implements com.google.v.fj {
    public static final int BARRIER_MATERIALS_FIELD_NUMBER = 3;
    public static final int CROSSING_PATTERN_FIELD_NUMBER = 2;
    private static final fg DEFAULT_INSTANCE;
    public static final int LINEAR_PATTERN_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<fg> PARSER;
    private fa barrierMaterials_;
    private int bitField0_;
    private fe crossingPattern_;
    private fi linearPattern_;

    static {
        fg fgVar = new fg();
        DEFAULT_INSTANCE = fgVar;
        com.google.v.du.registerDefaultInstance(fg.class, fgVar);
    }

    private fg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBarrierMaterials() {
        this.barrierMaterials_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrossingPattern() {
        this.crossingPattern_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLinearPattern() {
        this.linearPattern_ = null;
        this.bitField0_ &= -2;
    }

    public static fg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeBarrierMaterials(fa faVar) {
        Objects.requireNonNull(faVar);
        fa faVar2 = this.barrierMaterials_;
        if (faVar2 != null && faVar2 != fa.getDefaultInstance()) {
            ez ezVarNewBuilder = fa.newBuilder(faVar2);
            ezVarNewBuilder.mergeFrom((ez) faVar);
            faVar = ezVarNewBuilder.buildPartial();
        }
        this.barrierMaterials_ = faVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCrossingPattern(fe feVar) {
        Objects.requireNonNull(feVar);
        fe feVar2 = this.crossingPattern_;
        if (feVar2 != null && feVar2 != fe.getDefaultInstance()) {
            fc fcVarNewBuilder = fe.newBuilder(feVar2);
            fcVarNewBuilder.mergeFrom((fc) feVar);
            feVar = fcVarNewBuilder.buildPartial();
        }
        this.crossingPattern_ = feVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeLinearPattern(fi fiVar) {
        Objects.requireNonNull(fiVar);
        fi fiVar2 = this.linearPattern_;
        if (fiVar2 != null && fiVar2 != fi.getDefaultInstance()) {
            fh fhVarNewBuilder = fi.newBuilder(fiVar2);
            fhVarNewBuilder.mergeFrom((fh) fiVar);
            fiVar = fhVarNewBuilder.buildPartial();
        }
        this.linearPattern_ = fiVar;
        this.bitField0_ |= 1;
    }

    public static ff newBuilder() {
        return (ff) DEFAULT_INSTANCE.createBuilder();
    }

    public static fg parseDelimitedFrom(InputStream inputStream) {
        return (fg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fg parseFrom(com.google.v.v vVar) {
        return (fg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<fg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBarrierMaterials(fa faVar) {
        Objects.requireNonNull(faVar);
        this.barrierMaterials_ = faVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrossingPattern(fe feVar) {
        Objects.requireNonNull(feVar);
        this.crossingPattern_ = feVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLinearPattern(fi fiVar) {
        Objects.requireNonNull(fiVar);
        this.linearPattern_ = fiVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003ဉ\u0002", new Object[]{"bitField0_", "linearPattern_", "crossingPattern_", "barrierMaterials_"});
        }
        if (iOrdinal == 3) {
            return new fg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ff(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<fg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (fg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public fa getBarrierMaterials() {
        fa faVar = this.barrierMaterials_;
        return faVar == null ? fa.getDefaultInstance() : faVar;
    }

    public fe getCrossingPattern() {
        fe feVar = this.crossingPattern_;
        return feVar == null ? fe.getDefaultInstance() : feVar;
    }

    public fi getLinearPattern() {
        fi fiVar = this.linearPattern_;
        return fiVar == null ? fi.getDefaultInstance() : fiVar;
    }

    public boolean hasBarrierMaterials() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCrossingPattern() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasLinearPattern() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ff newBuilder(fg fgVar) {
        return (ff) DEFAULT_INSTANCE.createBuilder(fgVar);
    }

    public static fg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (fg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static fg parseFrom(com.google.v.z zVar) {
        return (fg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static fg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (fg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static fg parseFrom(InputStream inputStream) {
        return (fg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static fg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (fg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static fg parseFrom(ByteBuffer byteBuffer) {
        return (fg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static fg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (fg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static fg parseFrom(byte[] bArr) {
        return (fg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static fg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (fg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
