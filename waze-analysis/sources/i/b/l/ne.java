package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class ne extends com.google.v.du<ne, nb> implements nf {
    private static final ne DEFAULT_INSTANCE;
    private static volatile com.google.v.fo<ne> PARSER = null;
    public static final int TIME_SPAN_FIELD_NUMBER = 2;
    public static final int TRAFFIC_STATE_FIELD_NUMBER = 1;
    private int bitField0_;
    private nd timeSpan_;
    private int trafficState_;

    static {
        ne neVar = new ne();
        DEFAULT_INSTANCE = neVar;
        com.google.v.du.registerDefaultInstance(ne.class, neVar);
    }

    private ne() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeSpan() {
        this.timeSpan_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficState() {
        this.bitField0_ &= -2;
        this.trafficState_ = 0;
    }

    public static ne getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTimeSpan(nd ndVar) {
        Objects.requireNonNull(ndVar);
        nd ndVar2 = this.timeSpan_;
        if (ndVar2 != null && ndVar2 != nd.getDefaultInstance()) {
            nc ncVarNewBuilder = nd.newBuilder(ndVar2);
            ncVarNewBuilder.mergeFrom((nc) ndVar);
            ndVar = ncVarNewBuilder.buildPartial();
        }
        this.timeSpan_ = ndVar;
        this.bitField0_ |= 2;
    }

    public static nb newBuilder() {
        return (nb) DEFAULT_INSTANCE.createBuilder();
    }

    public static ne parseDelimitedFrom(InputStream inputStream) {
        return (ne) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ne parseFrom(com.google.v.v vVar) {
        return (ne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ne> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeSpan(nd ndVar) {
        Objects.requireNonNull(ndVar);
        this.timeSpan_ = ndVar;
        this.bitField0_ |= 2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001᠌\u0000\u0002ဉ\u0001", new Object[]{"bitField0_", "trafficState_", hf.t, "timeSpan_"});
        }
        if (iOrdinal == 3) {
            return new ne();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new nb(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ne> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ne.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public nd getTimeSpan() {
        nd ndVar = this.timeSpan_;
        return ndVar == null ? nd.getDefaultInstance() : ndVar;
    }

    public nj getTrafficState() {
        nj njVarA = nj.a(this.trafficState_);
        return njVarA == null ? nj.TRAFFIC_STATE_UNSPECIFIED : njVarA;
    }

    public boolean hasTimeSpan() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTrafficState() {
        return (this.bitField0_ & 1) != 0;
    }

    public static nb newBuilder(ne neVar) {
        return (nb) DEFAULT_INSTANCE.createBuilder(neVar);
    }

    public static ne parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ne) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ne parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ne parseFrom(com.google.v.z zVar) {
        return (ne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ne parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ne parseFrom(InputStream inputStream) {
        return (ne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ne parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ne parseFrom(ByteBuffer byteBuffer) {
        return (ne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ne parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ne parseFrom(byte[] bArr) {
        return (ne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ne parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ne) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
