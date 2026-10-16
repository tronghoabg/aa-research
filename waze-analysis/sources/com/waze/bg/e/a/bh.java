package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class bh extends com.google.v.du<bh, bg> implements com.google.v.fj {
    private static final bh DEFAULT_INSTANCE;
    public static final int DETOUR_ID_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bh> PARSER;
    private int bitField0_;
    private long detourId_;

    static {
        bh bhVar = new bh();
        DEFAULT_INSTANCE = bhVar;
        com.google.v.du.registerDefaultInstance(bh.class, bhVar);
    }

    private bh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetourId() {
        this.bitField0_ &= -2;
        this.detourId_ = 0L;
    }

    public static bh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bg newBuilder() {
        return (bg) DEFAULT_INSTANCE.createBuilder();
    }

    public static bh parseDelimitedFrom(InputStream inputStream) {
        return (bh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bh parseFrom(com.google.v.v vVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDetourId(long j2) {
        this.bitField0_ |= 1;
        this.detourId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"bitField0_", "detourId_"});
        }
        if (iOrdinal == 3) {
            return new bh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getDetourId() {
        return this.detourId_;
    }

    public boolean hasDetourId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bg newBuilder(bh bhVar) {
        return (bg) DEFAULT_INSTANCE.createBuilder(bhVar);
    }

    public static bh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bh parseFrom(com.google.v.z zVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bh parseFrom(InputStream inputStream) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bh parseFrom(ByteBuffer byteBuffer) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bh parseFrom(byte[] bArr) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
