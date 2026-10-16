package com.waze.bg.e.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class cf extends com.google.v.du<cf, ce> implements cg {
    public static final int CLIENT_LINE_ID_FIELD_NUMBER = 3;
    public static final int CLIENT_TILE_ID_FIELD_NUMBER = 1;
    public static final int CLIENT_TILE_VERSION_FIELD_NUMBER = 2;
    private static final cf DEFAULT_INSTANCE;
    public static final int FROM_NODE_FIELD_NUMBER = 4;
    private static volatile com.google.v.fo<cf> PARSER;
    private int bitField0_;
    private int clientLineId_;
    private int clientTileId_;
    private int clientTileVersion_;
    private int fromNode_;

    static {
        cf cfVar = new cf();
        DEFAULT_INSTANCE = cfVar;
        com.google.v.du.registerDefaultInstance(cf.class, cfVar);
    }

    private cf() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientLineId() {
        this.bitField0_ &= -5;
        this.clientLineId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientTileId() {
        this.bitField0_ &= -2;
        this.clientTileId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientTileVersion() {
        this.bitField0_ &= -3;
        this.clientTileVersion_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromNode() {
        this.bitField0_ &= -9;
        this.fromNode_ = 0;
    }

    public static cf getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ce newBuilder() {
        return (ce) DEFAULT_INSTANCE.createBuilder();
    }

    public static cf parseDelimitedFrom(InputStream inputStream) {
        return (cf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cf parseFrom(com.google.v.v vVar) {
        return (cf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<cf> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientLineId(int i2) {
        this.bitField0_ |= 4;
        this.clientLineId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientTileId(int i2) {
        this.bitField0_ |= 1;
        this.clientTileId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientTileVersion(int i2) {
        this.bitField0_ |= 2;
        this.clientTileVersion_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromNode(int i2) {
        this.bitField0_ |= 8;
        this.fromNode_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001င\u0000\u0002င\u0001\u0003င\u0002\u0004င\u0003", new Object[]{"bitField0_", "clientTileId_", "clientTileVersion_", "clientLineId_", "fromNode_"});
        }
        if (iOrdinal == 3) {
            return new cf();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ce(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<cf> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cf.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getClientLineId() {
        return this.clientLineId_;
    }

    public int getClientTileId() {
        return this.clientTileId_;
    }

    public int getClientTileVersion() {
        return this.clientTileVersion_;
    }

    public int getFromNode() {
        return this.fromNode_;
    }

    public boolean hasClientLineId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasClientTileId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasClientTileVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasFromNode() {
        return (this.bitField0_ & 8) != 0;
    }

    public static ce newBuilder(cf cfVar) {
        return (ce) DEFAULT_INSTANCE.createBuilder(cfVar);
    }

    public static cf parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cf) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cf parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cf parseFrom(com.google.v.z zVar) {
        return (cf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cf parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cf parseFrom(InputStream inputStream) {
        return (cf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cf parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cf parseFrom(ByteBuffer byteBuffer) {
        return (cf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cf parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cf parseFrom(byte[] bArr) {
        return (cf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cf parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cf) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
