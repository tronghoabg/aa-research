package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ave extends com.google.v.du<ave, avd> implements com.google.v.fj {
    public static final int ALTERNATIVE_ROUTE_UUID_FIELD_NUMBER = 6;
    private static final ave DEFAULT_INSTANCE;
    public static final int DELTA_SECONDS_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ave> PARSER = null;
    public static final int PREV_ROUTE_REMAINING_SECONDS_FIELD_NUMBER = 2;
    public static final int REASSURANCE_FIELD_NUMBER = 5;
    public static final int ROUTING_RESPONSE_ID_FIELD_NUMBER = 3;
    public static final int USE_CASE_FIELD_NUMBER = 4;
    private int bitField0_;
    private long deltaSeconds_;
    private long prevRouteRemainingSeconds_;
    private boolean reassurance_;
    private int useCase_;
    private String routingResponseId_ = "";
    private String alternativeRouteUuid_ = "";

    static {
        ave aveVar = new ave();
        DEFAULT_INSTANCE = aveVar;
        com.google.v.du.registerDefaultInstance(ave.class, aveVar);
    }

    private ave() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRouteUuid() {
        this.alternativeRouteUuid_ = getDefaultInstance().getAlternativeRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeltaSeconds() {
        this.bitField0_ &= -2;
        this.deltaSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPrevRouteRemainingSeconds() {
        this.bitField0_ &= -3;
        this.prevRouteRemainingSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReassurance() {
        this.bitField0_ &= -5;
        this.reassurance_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutingResponseId() {
        this.routingResponseId_ = getDefaultInstance().getRoutingResponseId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseCase() {
        this.useCase_ = 0;
    }

    public static ave getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static avd newBuilder() {
        return (avd) DEFAULT_INSTANCE.createBuilder();
    }

    public static ave parseDelimitedFrom(InputStream inputStream) {
        return (ave) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ave parseFrom(com.google.v.v vVar) {
        return (ave) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ave> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.alternativeRouteUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuidBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.alternativeRouteUuid_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeltaSeconds(long j2) {
        this.bitField0_ |= 1;
        this.deltaSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPrevRouteRemainingSeconds(long j2) {
        this.bitField0_ |= 2;
        this.prevRouteRemainingSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReassurance(boolean z) {
        this.bitField0_ |= 4;
        this.reassurance_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingResponseId(String str) {
        Objects.requireNonNull(str);
        this.routingResponseId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutingResponseIdBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.routingResponseId_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseCase(awx awxVar) {
        this.useCase_ = awxVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUseCaseValue(int i2) {
        this.useCase_ = i2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001တ\u0000\u0002ဂ\u0001\u0003Ȉ\u0004\f\u0005ဇ\u0002\u0006Ȉ", new Object[]{"bitField0_", "deltaSeconds_", "prevRouteRemainingSeconds_", "routingResponseId_", "useCase_", "reassurance_", "alternativeRouteUuid_"});
        }
        if (iOrdinal == 3) {
            return new ave();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new avd(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ave> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ave.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAlternativeRouteUuid() {
        return this.alternativeRouteUuid_;
    }

    public com.google.v.v getAlternativeRouteUuidBytes() {
        return com.google.v.v.s(this.alternativeRouteUuid_);
    }

    public long getDeltaSeconds() {
        return this.deltaSeconds_;
    }

    public long getPrevRouteRemainingSeconds() {
        return this.prevRouteRemainingSeconds_;
    }

    public boolean getReassurance() {
        return this.reassurance_;
    }

    @Deprecated
    public String getRoutingResponseId() {
        return this.routingResponseId_;
    }

    @Deprecated
    public com.google.v.v getRoutingResponseIdBytes() {
        return com.google.v.v.s(this.routingResponseId_);
    }

    public awx getUseCase() {
        awx awxVarA = awx.a(this.useCase_);
        return awxVarA == null ? awx.UNRECOGNIZED : awxVarA;
    }

    public int getUseCaseValue() {
        return this.useCase_;
    }

    public boolean hasDeltaSeconds() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasPrevRouteRemainingSeconds() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasReassurance() {
        return (this.bitField0_ & 4) != 0;
    }

    public static avd newBuilder(ave aveVar) {
        return (avd) DEFAULT_INSTANCE.createBuilder(aveVar);
    }

    public static ave parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ave) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ave parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ave) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ave parseFrom(com.google.v.z zVar) {
        return (ave) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ave parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ave) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ave parseFrom(InputStream inputStream) {
        return (ave) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ave parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ave) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ave parseFrom(ByteBuffer byteBuffer) {
        return (ave) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ave parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ave) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ave parseFrom(byte[] bArr) {
        return (ave) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ave parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ave) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
