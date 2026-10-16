package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class big extends com.google.v.du<big, bie> implements com.google.v.fj {
    public static final int CLIENT_LINE_FROM_NODE_ID_FIELD_NUMBER = 6;
    public static final int CLIENT_LINE_ID_FIELD_NUMBER = 5;
    public static final int CLIENT_LINE_TO_NODE_ID_FIELD_NUMBER = 7;
    public static final int CLIENT_TILE_VERSION_FIELD_NUMBER = 3;
    private static final big DEFAULT_INSTANCE;
    public static final int INCONSISTENCY_TYPE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<big> PARSER = null;
    public static final int ROUTING_LINE_START_NODE_ID_FIELD_NUMBER = 8;
    public static final int SERVER_TILE_VERSION_FIELD_NUMBER = 4;
    public static final int TILE_ID_FIELD_NUMBER = 2;
    private int bitField0_;
    private long clientLineFromNodeId_;
    private long clientLineId_;
    private long clientLineToNodeId_;
    private long clientTileVersion_;
    private int inconsistencyType_;
    private long routingLineStartNodeId_;
    private long serverTileVersion_;
    private long tileId_;

    static {
        big bigVar = new big();
        DEFAULT_INSTANCE = bigVar;
        com.google.v.du.registerDefaultInstance(big.class, bigVar);
    }

    private big() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientLineFromNodeId() {
        this.bitField0_ &= -17;
        this.clientLineFromNodeId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientLineId() {
        this.bitField0_ &= -9;
        this.clientLineId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientLineToNodeId() {
        this.bitField0_ &= -33;
        this.clientLineToNodeId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientTileVersion() {
        this.bitField0_ &= -3;
        this.clientTileVersion_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearInconsistencyType() {
        this.inconsistencyType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingLineStartNodeId() {
        this.bitField0_ &= -65;
        this.routingLineStartNodeId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerTileVersion() {
        this.bitField0_ &= -5;
        this.serverTileVersion_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTileId() {
        this.bitField0_ &= -2;
        this.tileId_ = 0L;
    }

    public static big getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bie newBuilder() {
        return (bie) DEFAULT_INSTANCE.createBuilder();
    }

    public static big parseDelimitedFrom(InputStream inputStream) {
        return (big) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static big parseFrom(com.google.v.v vVar) {
        return (big) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<big> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientLineFromNodeId(long j2) {
        this.bitField0_ |= 16;
        this.clientLineFromNodeId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientLineId(long j2) {
        this.bitField0_ |= 8;
        this.clientLineId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientLineToNodeId(long j2) {
        this.bitField0_ |= 32;
        this.clientLineToNodeId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientTileVersion(long j2) {
        this.bitField0_ |= 2;
        this.clientTileVersion_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInconsistencyType(bif bifVar) {
        this.inconsistencyType_ = bifVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setInconsistencyTypeValue(int i2) {
        this.inconsistencyType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingLineStartNodeId(long j2) {
        this.bitField0_ |= 64;
        this.routingLineStartNodeId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerTileVersion(long j2) {
        this.bitField0_ |= 4;
        this.serverTileVersion_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTileId(long j2) {
        this.bitField0_ |= 1;
        this.tileId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001\f\u0002ဂ\u0000\u0003ဂ\u0001\u0004ဂ\u0002\u0005ဂ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\bဂ\u0006", new Object[]{"bitField0_", "inconsistencyType_", "tileId_", "clientTileVersion_", "serverTileVersion_", "clientLineId_", "clientLineFromNodeId_", "clientLineToNodeId_", "routingLineStartNodeId_"});
        }
        if (iOrdinal == 3) {
            return new big();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bie(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<big> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (big.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getClientLineFromNodeId() {
        return this.clientLineFromNodeId_;
    }

    public long getClientLineId() {
        return this.clientLineId_;
    }

    public long getClientLineToNodeId() {
        return this.clientLineToNodeId_;
    }

    public long getClientTileVersion() {
        return this.clientTileVersion_;
    }

    public bif getInconsistencyType() {
        int i2 = this.inconsistencyType_;
        bif bifVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : bif.OLD_TRAFFIC_TILE_VERSION : bif.OLD_ROUTING_TILE_VERSION : bif.TILE_CONTENT_MISMATCH : bif.MISSING_TILE : bif.INCONSISTENCY_TYPE_UNSPECIFIED;
        return bifVar == null ? bif.UNRECOGNIZED : bifVar;
    }

    public int getInconsistencyTypeValue() {
        return this.inconsistencyType_;
    }

    public long getRoutingLineStartNodeId() {
        return this.routingLineStartNodeId_;
    }

    public long getServerTileVersion() {
        return this.serverTileVersion_;
    }

    public long getTileId() {
        return this.tileId_;
    }

    public boolean hasClientLineFromNodeId() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasClientLineId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasClientLineToNodeId() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasClientTileVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRoutingLineStartNodeId() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasServerTileVersion() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTileId() {
        return (this.bitField0_ & 1) != 0;
    }

    public static bie newBuilder(big bigVar) {
        return (bie) DEFAULT_INSTANCE.createBuilder(bigVar);
    }

    public static big parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (big) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static big parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (big) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static big parseFrom(com.google.v.z zVar) {
        return (big) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static big parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (big) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static big parseFrom(InputStream inputStream) {
        return (big) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static big parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (big) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static big parseFrom(ByteBuffer byteBuffer) {
        return (big) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static big parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (big) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static big parseFrom(byte[] bArr) {
        return (big) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static big parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (big) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
