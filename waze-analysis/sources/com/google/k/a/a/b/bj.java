package com.google.k.a.a.b;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class bj extends com.google.v.du<bj, bi> implements com.google.v.fj {
    private static final bj DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bj> PARSER;
    private int bitField0_;
    private long id_;

    static {
        bj bjVar = new bj();
        DEFAULT_INSTANCE = bjVar;
        com.google.v.du.registerDefaultInstance(bj.class, bjVar);
    }

    private bj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearId() {
        this.bitField0_ &= -2;
        this.id_ = 0L;
    }

    public static bj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bi newBuilder() {
        return (bi) DEFAULT_INSTANCE.createBuilder();
    }

    public static bj parseDelimitedFrom(InputStream inputStream) {
        return (bj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bj parseFrom(com.google.v.v vVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setId(long j2) {
        this.bitField0_ |= 1;
        this.id_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဂ\u0000", new Object[]{"bitField0_", "id_"});
        }
        if (iOrdinal == 3) {
            return new bj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bi(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getId() {
        return this.id_;
    }

    public boolean hasId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bi newBuilder(bj bjVar) {
        return (bi) DEFAULT_INSTANCE.createBuilder(bjVar);
    }

    public static bj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bj parseFrom(com.google.v.z zVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bj parseFrom(InputStream inputStream) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bj parseFrom(ByteBuffer byteBuffer) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bj parseFrom(byte[] bArr) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
