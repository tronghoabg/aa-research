package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ql extends com.google.v.du<ql, qk> implements qm {
    private static final ql DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ql> PARSER = null;
    public static final int PIN_LOCATION_FIELD_NUMBER = 3;
    public static final int ROAD_TYPE_FIELD_NUMBER = 2;
    public static final int SERVER_SEGMENT_ID_FIELD_NUMBER = 1;
    private int bitField0_;
    private i.b.s pinLocation_;
    private com.google.v.ek serverSegmentId_ = emptyIntList();
    private int roadType_ = 1;

    static {
        ql qlVar = new ql();
        DEFAULT_INSTANCE = qlVar;
        com.google.v.du.registerDefaultInstance(ql.class, qlVar);
    }

    private ql() {
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
    public void clearPinLocation() {
        this.pinLocation_ = null;
        this.bitField0_ &= -3;
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

    public static ql getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePinLocation(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.pinLocation_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.pinLocation_ = sVar;
        this.bitField0_ |= 2;
    }

    public static qk newBuilder() {
        return (qk) DEFAULT_INSTANCE.createBuilder();
    }

    public static ql parseDelimitedFrom(InputStream inputStream) {
        return (ql) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ql parseFrom(com.google.v.v vVar) {
        return (ql) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ql> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPinLocation(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.pinLocation_ = sVar;
        this.bitField0_ |= 2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001\u0016\u0002᠌\u0000\u0003ဉ\u0001", new Object[]{"bitField0_", "serverSegmentId_", "roadType_", i.a.a.g.a(), "pinLocation_"});
        }
        if (iOrdinal == 3) {
            return new ql();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new qk(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ql> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ql.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.s getPinLocation() {
        i.b.s sVar = this.pinLocation_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
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

    public boolean hasPinLocation() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRoadType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static qk newBuilder(ql qlVar) {
        return (qk) DEFAULT_INSTANCE.createBuilder(qlVar);
    }

    public static ql parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ql) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ql parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ql) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ql parseFrom(com.google.v.z zVar) {
        return (ql) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ql parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ql) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ql parseFrom(InputStream inputStream) {
        return (ql) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ql parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ql) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ql parseFrom(ByteBuffer byteBuffer) {
        return (ql) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ql parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ql) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ql parseFrom(byte[] bArr) {
        return (ql) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ql parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ql) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
