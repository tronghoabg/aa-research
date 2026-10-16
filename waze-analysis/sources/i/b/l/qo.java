package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class qo extends com.google.v.du<qo, qn> implements qp {
    private static final qo DEFAULT_INSTANCE;
    public static final int ENCODED_S2_POINTS_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<qo> PARSER = null;
    public static final int ROAD_TYPE_FIELD_NUMBER = 2;
    public static final int SERVER_SEGMENT_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private com.google.v.ek serverSegmentId_ = emptyIntList();
    private int roadType_ = 1;
    private com.google.v.v encodedS2Points_ = com.google.v.v.f13054a;

    static {
        qo qoVar = new qo();
        DEFAULT_INSTANCE = qoVar;
        com.google.v.du.registerDefaultInstance(qo.class, qoVar);
    }

    private qo() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllServerSegmentId(Iterable<? extends Integer> iterable) {
        ensureServerSegmentIdIsMutable();
        com.google.v.c.addAll(iterable, this.serverSegmentId_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addServerSegmentId(int i2) {
        ensureServerSegmentIdIsMutable();
        this.serverSegmentId_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncodedS2Points() {
        this.bitField0_ &= -3;
        this.encodedS2Points_ = getDefaultInstance().getEncodedS2Points();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadType() {
        this.bitField0_ &= -2;
        this.roadType_ = 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearServerSegmentId() {
        this.serverSegmentId_ = emptyIntList();
    }

    private void ensureServerSegmentIdIsMutable() {
        com.google.v.ek ekVar = this.serverSegmentId_;
        if (ekVar.c()) {
            return;
        }
        this.serverSegmentId_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static qo getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static qn newBuilder() {
        return (qn) DEFAULT_INSTANCE.createBuilder();
    }

    public static qo parseDelimitedFrom(InputStream inputStream) {
        return (qo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qo parseFrom(com.google.v.v vVar) {
        return (qo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<qo> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncodedS2Points(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 2;
        this.encodedS2Points_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadType(i.a.a.g gVar) {
        this.roadType_ = gVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setServerSegmentId(int i2, int i3) {
        ensureServerSegmentIdIsMutable();
        this.serverSegmentId_.e(i2, i3);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0016\u0002᠌\u0000\u0003ည\u0001", new Object[]{"bitField0_", "serverSegmentId_", "roadType_", i.a.a.g.a(), "encodedS2Points_"});
        }
        if (iOrdinal == 3) {
            return new qo();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new qn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<qo> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (qo.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.google.v.v getEncodedS2Points() {
        return this.encodedS2Points_;
    }

    public i.a.a.g getRoadType() {
        i.a.a.g gVarB = i.a.a.g.b(this.roadType_);
        return gVarB == null ? i.a.a.g.STREET : gVarB;
    }

    public int getServerSegmentId(int i2) {
        return this.serverSegmentId_.d(i2);
    }

    public int getServerSegmentIdCount() {
        return this.serverSegmentId_.size();
    }

    public List<Integer> getServerSegmentIdList() {
        return this.serverSegmentId_;
    }

    public boolean hasEncodedS2Points() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRoadType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static qn newBuilder(qo qoVar) {
        return (qn) DEFAULT_INSTANCE.createBuilder(qoVar);
    }

    public static qo parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qo) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qo parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (qo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static qo parseFrom(com.google.v.z zVar) {
        return (qo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static qo parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (qo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static qo parseFrom(InputStream inputStream) {
        return (qo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static qo parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (qo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static qo parseFrom(ByteBuffer byteBuffer) {
        return (qo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static qo parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (qo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static qo parseFrom(byte[] bArr) {
        return (qo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static qo parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (qo) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
