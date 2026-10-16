package i.b.l;

import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class nh extends com.google.v.du<nh, ng> implements com.google.v.fj {
    private static final nh DEFAULT_INSTANCE;
    public static final int DURATION_SECONDS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<nh> PARSER = null;
    public static final int TRAFFIC_STATE_FIELD_NUMBER = 1;
    private int bitField0_;
    private long durationSeconds_;
    private int trafficState_;

    static {
        nh nhVar = new nh();
        DEFAULT_INSTANCE = nhVar;
        com.google.v.du.registerDefaultInstance(nh.class, nhVar);
    }

    private nh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDurationSeconds() {
        this.bitField0_ &= -3;
        this.durationSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficState() {
        this.bitField0_ &= -2;
        this.trafficState_ = 0;
    }

    public static nh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ng newBuilder() {
        return (ng) DEFAULT_INSTANCE.createBuilder();
    }

    public static nh parseDelimitedFrom(InputStream inputStream) {
        return (nh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nh parseFrom(com.google.v.v vVar) {
        return (nh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<nh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDurationSeconds(long j2) {
        this.bitField0_ |= 2;
        this.durationSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficState(nj njVar) {
        this.trafficState_ = njVar.getNumber();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဂ\u0001", new Object[]{"bitField0_", "trafficState_", hf.t, "durationSeconds_"});
        }
        if (iOrdinal == 3) {
            return new nh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ng(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<nh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (nh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getDurationSeconds() {
        return this.durationSeconds_;
    }

    public nj getTrafficState() {
        nj njVarA = nj.a(this.trafficState_);
        return njVarA == null ? nj.TRAFFIC_STATE_UNSPECIFIED : njVarA;
    }

    public boolean hasDurationSeconds() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTrafficState() {
        return (this.bitField0_ & 1) != 0;
    }

    public static ng newBuilder(nh nhVar) {
        return (ng) DEFAULT_INSTANCE.createBuilder(nhVar);
    }

    public static nh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (nh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static nh parseFrom(com.google.v.z zVar) {
        return (nh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static nh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (nh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static nh parseFrom(InputStream inputStream) {
        return (nh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static nh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (nh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static nh parseFrom(ByteBuffer byteBuffer) {
        return (nh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static nh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (nh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static nh parseFrom(byte[] bArr) {
        return (nh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static nh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (nh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
