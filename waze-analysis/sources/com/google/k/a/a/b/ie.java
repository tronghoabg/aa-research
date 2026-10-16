package com.google.k.a.a.b;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ie extends com.google.v.du<ie, id> implements com.google.v.fj {
    private static final ie DEFAULT_INSTANCE;
    public static final int MAX_CONNECTED_PRIORITY_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ie> PARSER;
    private int bitField0_;
    private int maxConnectedPriority_;

    static {
        ie ieVar = new ie();
        DEFAULT_INSTANCE = ieVar;
        com.google.v.du.registerDefaultInstance(ie.class, ieVar);
    }

    private ie() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxConnectedPriority() {
        this.bitField0_ &= -2;
        this.maxConnectedPriority_ = 0;
    }

    public static ie getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static id newBuilder() {
        return (id) DEFAULT_INSTANCE.createBuilder();
    }

    public static ie parseDelimitedFrom(InputStream inputStream) {
        return (ie) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ie parseFrom(com.google.v.v vVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ie> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxConnectedPriority(ic icVar) {
        this.maxConnectedPriority_ = icVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001᠌\u0000", new Object[]{"bitField0_", "maxConnectedPriority_", hs.f11482j});
        }
        if (iOrdinal == 3) {
            return new ie();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new id(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ie> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ie.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ic getMaxConnectedPriority() {
        ic icVarA = ic.a(this.maxConnectedPriority_);
        return icVarA == null ? ic.PRIORITY_UNKNOWN : icVarA;
    }

    public boolean hasMaxConnectedPriority() {
        return (this.bitField0_ & 1) != 0;
    }

    public static id newBuilder(ie ieVar) {
        return (id) DEFAULT_INSTANCE.createBuilder(ieVar);
    }

    public static ie parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ie) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ie parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ie parseFrom(com.google.v.z zVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ie parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ie parseFrom(InputStream inputStream) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ie parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ie parseFrom(ByteBuffer byteBuffer) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ie parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ie parseFrom(byte[] bArr) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ie parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
