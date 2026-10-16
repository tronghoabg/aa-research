package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class y extends com.google.v.du<y, x> implements fj {
    private static final y DEFAULT_INSTANCE;
    private static volatile fo<y> PARSER = null;
    public static final int SECONDS_SINCE_REPORT_FIELD_NUMBER = 3;
    public static final int SENDER_INFO_FIELD_NUMBER = 1;
    private int bitField0_;
    private int secondsSinceReport_;
    private bh senderInfo_;

    static {
        y yVar = new y();
        DEFAULT_INSTANCE = yVar;
        com.google.v.du.registerDefaultInstance(y.class, yVar);
    }

    private y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSecondsSinceReport() {
        this.bitField0_ &= -3;
        this.secondsSinceReport_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSenderInfo() {
        this.senderInfo_ = null;
        this.bitField0_ &= -2;
    }

    public static y getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSenderInfo(bh bhVar) {
        Objects.requireNonNull(bhVar);
        bh bhVar2 = this.senderInfo_;
        if (bhVar2 != null && bhVar2 != bh.getDefaultInstance()) {
            bg bgVarNewBuilder = bh.newBuilder(bhVar2);
            bgVarNewBuilder.mergeFrom((bg) bhVar);
            bhVar = bgVarNewBuilder.buildPartial();
        }
        this.senderInfo_ = bhVar;
        this.bitField0_ |= 1;
    }

    public static x newBuilder() {
        return (x) DEFAULT_INSTANCE.createBuilder();
    }

    public static y parseDelimitedFrom(InputStream inputStream) {
        return (y) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static y parseFrom(com.google.v.v vVar) {
        return (y) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<y> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSecondsSinceReport(int i2) {
        this.bitField0_ |= 2;
        this.secondsSinceReport_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSenderInfo(bh bhVar) {
        Objects.requireNonNull(bhVar);
        this.senderInfo_ = bhVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဉ\u0000\u0003င\u0001", new Object[]{"bitField0_", "senderInfo_", "secondsSinceReport_"});
        }
        if (iOrdinal == 3) {
            return new y();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new x(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<y> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (y.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getSecondsSinceReport() {
        return this.secondsSinceReport_;
    }

    public bh getSenderInfo() {
        bh bhVar = this.senderInfo_;
        return bhVar == null ? bh.getDefaultInstance() : bhVar;
    }

    public boolean hasSecondsSinceReport() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSenderInfo() {
        return (this.bitField0_ & 1) != 0;
    }

    public static x newBuilder(y yVar) {
        return (x) DEFAULT_INSTANCE.createBuilder(yVar);
    }

    public static y parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (y) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static y parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (y) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static y parseFrom(com.google.v.z zVar) {
        return (y) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static y parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (y) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static y parseFrom(InputStream inputStream) {
        return (y) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static y parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (y) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static y parseFrom(ByteBuffer byteBuffer) {
        return (y) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static y parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (y) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static y parseFrom(byte[] bArr) {
        return (y) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static y parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (y) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
