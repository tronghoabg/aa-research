package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class bf extends com.google.v.du<bf, be> implements fj {
    private static final bf DEFAULT_INSTANCE;
    private static volatile fo<bf> PARSER = null;
    public static final int RECEIVED_POINTS_FIELD_NUMBER = 1;
    private int bitField0_;
    private long receivedPoints_;

    static {
        bf bfVar = new bf();
        DEFAULT_INSTANCE = bfVar;
        com.google.v.du.registerDefaultInstance(bf.class, bfVar);
    }

    private bf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReceivedPoints() {
        this.bitField0_ &= -2;
        this.receivedPoints_ = 0L;
    }

    public static bf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static be newBuilder() {
        return (be) DEFAULT_INSTANCE.createBuilder();
    }

    public static bf parseDelimitedFrom(InputStream inputStream) {
        return (bf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bf parseFrom(com.google.v.v vVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<bf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReceivedPoints(long j2) {
        this.bitField0_ |= 1;
        this.receivedPoints_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"bitField0_", "receivedPoints_"});
        }
        if (iOrdinal == 3) {
            return new bf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new be(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<bf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getReceivedPoints() {
        return this.receivedPoints_;
    }

    public boolean hasReceivedPoints() {
        return (this.bitField0_ & 1) != 0;
    }

    public static be newBuilder(bf bfVar) {
        return (be) DEFAULT_INSTANCE.createBuilder(bfVar);
    }

    public static bf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bf parseFrom(com.google.v.z zVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bf parseFrom(InputStream inputStream) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bf parseFrom(ByteBuffer byteBuffer) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bf parseFrom(byte[] bArr) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
