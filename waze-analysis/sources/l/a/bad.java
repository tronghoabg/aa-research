package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bad extends com.google.v.du<bad, bac> implements com.google.v.fj {
    private static final bad DEFAULT_INSTANCE;
    public static final int FORWARD_FIELD_NUMBER = 3;
    public static final int FROM_NODE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bad> PARSER = null;
    public static final int SEGMENT_ID_FIELD_NUMBER = 4;
    public static final int TO_NODE_FIELD_NUMBER = 2;
    private int bitField0_;
    private boolean forward_;
    private long fromNode_;
    private long segmentId_;
    private long toNode_;

    static {
        bad badVar = new bad();
        DEFAULT_INSTANCE = badVar;
        com.google.v.du.registerDefaultInstance(bad.class, badVar);
    }

    private bad() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearForward() {
        this.bitField0_ &= -5;
        this.forward_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromNode() {
        this.bitField0_ &= -2;
        this.fromNode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentId() {
        this.bitField0_ &= -9;
        this.segmentId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToNode() {
        this.bitField0_ &= -3;
        this.toNode_ = 0L;
    }

    public static bad getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bac newBuilder() {
        return (bac) DEFAULT_INSTANCE.createBuilder();
    }

    public static bad parseDelimitedFrom(InputStream inputStream) {
        return (bad) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bad parseFrom(com.google.v.v vVar) {
        return (bad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bad> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setForward(boolean z) {
        this.bitField0_ |= 4;
        this.forward_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromNode(long j2) {
        this.bitField0_ |= 1;
        this.fromNode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentId(long j2) {
        this.bitField0_ |= 8;
        this.segmentId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToNode(long j2) {
        this.bitField0_ |= 2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဇ\u0002\u0004ဂ\u0003", new Object[]{"bitField0_", "fromNode_", "toNode_", "forward_", "segmentId_"});
        }
        if (iOrdinal == 3) {
            return new bad();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bac(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bad> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bad.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getForward() {
        return this.forward_;
    }

    public long getFromNode() {
        return this.fromNode_;
    }

    public long getSegmentId() {
        return this.segmentId_;
    }

    public long getToNode() {
        return this.toNode_;
    }

    public boolean hasForward() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasFromNode() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasSegmentId() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasToNode() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bac newBuilder(bad badVar) {
        return (bac) DEFAULT_INSTANCE.createBuilder(badVar);
    }

    public static bad parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bad) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bad parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bad parseFrom(com.google.v.z zVar) {
        return (bad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bad parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bad parseFrom(InputStream inputStream) {
        return (bad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bad parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bad parseFrom(ByteBuffer byteBuffer) {
        return (bad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bad parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bad parseFrom(byte[] bArr) {
        return (bad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bad parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bad) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
