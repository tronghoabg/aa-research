package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ei extends com.google.v.du<ei, eh> implements com.google.v.fj {
    public static final int COORDINATE_FIELD_NUMBER = 1;
    private static final ei DEFAULT_INSTANCE;
    public static final int FROM_NODE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<ei> PARSER = null;
    public static final int TO_NODE_FIELD_NUMBER = 3;
    private int bitField0_;
    private i.b.s coordinate_;
    private long fromNode_;
    private long toNode_;

    static {
        ei eiVar = new ei();
        DEFAULT_INSTANCE = eiVar;
        com.google.v.du.registerDefaultInstance(ei.class, eiVar);
    }

    private ei() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinate() {
        this.coordinate_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromNode() {
        this.bitField0_ &= -3;
        this.fromNode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToNode() {
        this.bitField0_ &= -5;
        this.toNode_ = 0L;
    }

    public static ei getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoordinate(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.coordinate_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.coordinate_ = sVar;
        this.bitField0_ |= 1;
    }

    public static eh newBuilder() {
        return (eh) DEFAULT_INSTANCE.createBuilder();
    }

    public static ei parseDelimitedFrom(InputStream inputStream) {
        return (ei) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ei parseFrom(com.google.v.v vVar) {
        return (ei) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ei> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinate(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.coordinate_ = sVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromNode(long j2) {
        this.bitField0_ |= 2;
        this.fromNode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToNode(long j2) {
        this.bitField0_ |= 4;
        this.toNode_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "coordinate_", "fromNode_", "toNode_"});
        }
        if (iOrdinal == 3) {
            return new ei();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new eh(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ei> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ei.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.s getCoordinate() {
        i.b.s sVar = this.coordinate_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public long getFromNode() {
        return this.fromNode_;
    }

    public long getToNode() {
        return this.toNode_;
    }

    public boolean hasCoordinate() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFromNode() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasToNode() {
        return (this.bitField0_ & 4) != 0;
    }

    public static eh newBuilder(ei eiVar) {
        return (eh) DEFAULT_INSTANCE.createBuilder(eiVar);
    }

    public static ei parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ei) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ei parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ei) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ei parseFrom(com.google.v.z zVar) {
        return (ei) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ei parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ei) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ei parseFrom(InputStream inputStream) {
        return (ei) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ei parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ei) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ei parseFrom(ByteBuffer byteBuffer) {
        return (ei) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ei parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ei) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ei parseFrom(byte[] bArr) {
        return (ei) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ei parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ei) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
