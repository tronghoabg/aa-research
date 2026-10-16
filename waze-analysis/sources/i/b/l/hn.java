package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class hn extends com.google.v.du<hn, hm> implements ho {
    private static final hn DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<hn> PARSER = null;
    public static final int ROAD_TYPE_FIELD_NUMBER = 1;
    public static final int SPEED_LIMIT_FIELD_NUMBER = 2;
    private int bitField0_;
    private int roadType_;
    private com.google.v.ek speedLimit_ = emptyIntList();

    static {
        hn hnVar = new hn();
        DEFAULT_INSTANCE = hnVar;
        com.google.v.du.registerDefaultInstance(hn.class, hnVar);
    }

    private hn() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSpeedLimit(Iterable<? extends Integer> iterable) {
        ensureSpeedLimitIsMutable();
        com.google.v.c.addAll(iterable, this.speedLimit_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpeedLimit(int i2) {
        ensureSpeedLimitIsMutable();
        this.speedLimit_.i(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoadType() {
        this.bitField0_ &= -2;
        this.roadType_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedLimit() {
        this.speedLimit_ = emptyIntList();
    }

    private void ensureSpeedLimitIsMutable() {
        com.google.v.ek ekVar = this.speedLimit_;
        if (ekVar.c()) {
            return;
        }
        this.speedLimit_ = com.google.v.du.mutableCopy(ekVar);
    }

    public static hn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hm newBuilder() {
        return (hm) DEFAULT_INSTANCE.createBuilder();
    }

    public static hn parseDelimitedFrom(InputStream inputStream) {
        return (hn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hn parseFrom(com.google.v.v vVar) {
        return (hn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hn> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoadType(int i2) {
        this.bitField0_ |= 1;
        this.roadType_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedLimit(int i2, int i3) {
        ensureSpeedLimitIsMutable();
        this.speedLimit_.e(i2, i3);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001င\u0000\u0002\u0016", new Object[]{"bitField0_", "roadType_", "speedLimit_"});
        }
        if (iOrdinal == 3) {
            return new hn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hm(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getRoadType() {
        return this.roadType_;
    }

    public int getSpeedLimit(int i2) {
        return this.speedLimit_.d(i2);
    }

    public int getSpeedLimitCount() {
        return this.speedLimit_.size();
    }

    public List<Integer> getSpeedLimitList() {
        return this.speedLimit_;
    }

    public boolean hasRoadType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static hm newBuilder(hn hnVar) {
        return (hm) DEFAULT_INSTANCE.createBuilder(hnVar);
    }

    public static hn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hn parseFrom(com.google.v.z zVar) {
        return (hn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hn parseFrom(InputStream inputStream) {
        return (hn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hn parseFrom(ByteBuffer byteBuffer) {
        return (hn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hn parseFrom(byte[] bArr) {
        return (hn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
