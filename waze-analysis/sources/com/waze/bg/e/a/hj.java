package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class hj extends com.google.v.du<hj, hi> implements hk {
    public static final int CROSSTIME_SECONDS_FIELD_NUMBER = 3;
    private static final hj DEFAULT_INSTANCE;
    public static final int INSTRUCTION_FIELD_NUMBER = 4;
    public static final int LENGTH_METERS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<hj> PARSER = null;
    public static final int REFERENCE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int crosstimeSeconds_;
    private gf instruction_;
    private int lengthMeters_;
    private cf reference_;

    static {
        hj hjVar = new hj();
        DEFAULT_INSTANCE = hjVar;
        com.google.v.du.registerDefaultInstance(hj.class, hjVar);
    }

    private hj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCrosstimeSeconds() {
        this.bitField0_ &= -5;
        this.crosstimeSeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInstruction() {
        this.instruction_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLengthMeters() {
        this.bitField0_ &= -3;
        this.lengthMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReference() {
        this.reference_ = null;
        this.bitField0_ &= -2;
    }

    public static hj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeInstruction(gf gfVar) {
        Objects.requireNonNull(gfVar);
        gf gfVar2 = this.instruction_;
        if (gfVar2 != null && gfVar2 != gf.getDefaultInstance()) {
            en enVarNewBuilder = gf.newBuilder(gfVar2);
            enVarNewBuilder.mergeFrom((en) gfVar);
            gfVar = enVarNewBuilder.buildPartial();
        }
        this.instruction_ = gfVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReference(cf cfVar) {
        Objects.requireNonNull(cfVar);
        cf cfVar2 = this.reference_;
        if (cfVar2 != null && cfVar2 != cf.getDefaultInstance()) {
            ce ceVarNewBuilder = cf.newBuilder(cfVar2);
            ceVarNewBuilder.mergeFrom((ce) cfVar);
            cfVar = ceVarNewBuilder.buildPartial();
        }
        this.reference_ = cfVar;
        this.bitField0_ |= 1;
    }

    public static hi newBuilder() {
        return (hi) DEFAULT_INSTANCE.createBuilder();
    }

    public static hj parseDelimitedFrom(InputStream inputStream) {
        return (hj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hj parseFrom(com.google.v.v vVar) {
        return (hj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCrosstimeSeconds(int i2) {
        this.bitField0_ |= 4;
        this.crosstimeSeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInstruction(gf gfVar) {
        Objects.requireNonNull(gfVar);
        this.instruction_ = gfVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLengthMeters(int i2) {
        this.bitField0_ |= 2;
        this.lengthMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReference(cf cfVar) {
        Objects.requireNonNull(cfVar);
        this.reference_ = cfVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003င\u0002\u0004ဉ\u0003", new Object[]{"bitField0_", "reference_", "lengthMeters_", "crosstimeSeconds_", "instruction_"});
        }
        if (iOrdinal == 3) {
            return new hj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hi(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getCrosstimeSeconds() {
        return this.crosstimeSeconds_;
    }

    public gf getInstruction() {
        gf gfVar = this.instruction_;
        return gfVar == null ? gf.getDefaultInstance() : gfVar;
    }

    public int getLengthMeters() {
        return this.lengthMeters_;
    }

    public cf getReference() {
        cf cfVar = this.reference_;
        return cfVar == null ? cf.getDefaultInstance() : cfVar;
    }

    public boolean hasCrosstimeSeconds() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasInstruction() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLengthMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasReference() {
        return (this.bitField0_ & 1) != 0;
    }

    public static hi newBuilder(hj hjVar) {
        return (hi) DEFAULT_INSTANCE.createBuilder(hjVar);
    }

    public static hj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hj parseFrom(com.google.v.z zVar) {
        return (hj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hj parseFrom(InputStream inputStream) {
        return (hj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hj parseFrom(ByteBuffer byteBuffer) {
        return (hj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hj parseFrom(byte[] bArr) {
        return (hj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
