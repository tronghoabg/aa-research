package l.a;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class atw extends com.google.v.du<atw, atu> implements com.google.v.fj {
    private static final atw DEFAULT_INSTANCE;
    public static final int FROM_NODE_ID_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<atw> PARSER = null;
    public static final int REASON_FIELD_NUMBER = 1;
    public static final int TO_NODE_ID_FIELD_NUMBER = 3;
    private int bitField0_;
    private long fromNodeId_;
    private int reason_;
    private long toNodeId_;

    static {
        atw atwVar = new atw();
        DEFAULT_INSTANCE = atwVar;
        com.google.v.du.registerDefaultInstance(atw.class, atwVar);
    }

    private atw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromNodeId() {
        this.bitField0_ &= -2;
        this.fromNodeId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReason() {
        this.reason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToNodeId() {
        this.bitField0_ &= -3;
        this.toNodeId_ = 0L;
    }

    public static atw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static atu newBuilder() {
        return (atu) DEFAULT_INSTANCE.createBuilder();
    }

    public static atw parseDelimitedFrom(InputStream inputStream) {
        return (atw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static atw parseFrom(com.google.v.v vVar) {
        return (atw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<atw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromNodeId(long j2) {
        this.bitField0_ |= 1;
        this.fromNodeId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReason(atv atvVar) {
        this.reason_ = atvVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReasonValue(int i2) {
        this.reason_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToNodeId(long j2) {
        this.bitField0_ |= 2;
        this.toNodeId_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002တ\u0000\u0003တ\u0001", new Object[]{"bitField0_", "reason_", "fromNodeId_", "toNodeId_"});
        }
        if (iOrdinal == 3) {
            return new atw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new atu(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<atw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (atw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getFromNodeId() {
        return this.fromNodeId_;
    }

    public atv getReason() {
        atv atvVar;
        switch (this.reason_) {
            case 0:
                atvVar = atv.REASON_UNSPECIFIED;
                break;
            case 1:
                atvVar = atv.TIMER;
                break;
            case 2:
                atvVar = atv.JAMMED;
                break;
            case 3:
                atvVar = atv.NETWORK;
                break;
            case 4:
                atvVar = atv.FORCED;
                break;
            case 5:
                atvVar = atv.KICKED;
                break;
            case 6:
                atvVar = atv.LOGIN;
                break;
            default:
                atvVar = null;
                break;
        }
        return atvVar == null ? atv.UNRECOGNIZED : atvVar;
    }

    public int getReasonValue() {
        return this.reason_;
    }

    public long getToNodeId() {
        return this.toNodeId_;
    }

    public boolean hasFromNodeId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasToNodeId() {
        return (this.bitField0_ & 2) != 0;
    }

    public static atu newBuilder(atw atwVar) {
        return (atu) DEFAULT_INSTANCE.createBuilder(atwVar);
    }

    public static atw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (atw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static atw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (atw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static atw parseFrom(com.google.v.z zVar) {
        return (atw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static atw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (atw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static atw parseFrom(InputStream inputStream) {
        return (atw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static atw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (atw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static atw parseFrom(ByteBuffer byteBuffer) {
        return (atw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static atw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (atw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static atw parseFrom(byte[] bArr) {
        return (atw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static atw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (atw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
