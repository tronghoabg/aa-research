package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class baw extends com.google.v.du<baw, bav> implements com.google.v.fj {
    private static final baw DEFAULT_INSTANCE;
    public static final int GENERIC_RESPONSE_DATA_FIELD_NUMBER = 1;
    public static final int LATENCY_INCLUDING_RETRIES_MS_FIELD_NUMBER = 7;
    public static final int LOGGED_IN_FIELD_NUMBER = 4;
    public static final int NETWORK_RETRIES_COUNT_FIELD_NUMBER = 6;
    public static final int ORIGINAL_USE_CASE_FIELD_NUMBER = 8;
    private static volatile com.google.v.fo<baw> PARSER = null;
    public static final int PERIODIC_RETRIES_COUNT_FIELD_NUMBER = 5;
    public static final int ROUTES_COUNT_FIELD_NUMBER = 3;
    public static final int USE_CASE_FIELD_NUMBER = 2;
    private int bitField0_;
    private bas genericResponseData_;
    private long latencyIncludingRetriesMs_;
    private boolean loggedIn_;
    private long networkRetriesCount_;
    private int originalUseCase_;
    private long periodicRetriesCount_;
    private long routesCount_;
    private int useCase_;

    static {
        baw bawVar = new baw();
        DEFAULT_INSTANCE = bawVar;
        com.google.v.du.registerDefaultInstance(baw.class, bawVar);
    }

    private baw() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGenericResponseData() {
        this.genericResponseData_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatencyIncludingRetriesMs() {
        this.bitField0_ &= -33;
        this.latencyIncludingRetriesMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLoggedIn() {
        this.bitField0_ &= -5;
        this.loggedIn_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkRetriesCount() {
        this.bitField0_ &= -17;
        this.networkRetriesCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOriginalUseCase() {
        this.originalUseCase_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPeriodicRetriesCount() {
        this.bitField0_ &= -9;
        this.periodicRetriesCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRoutesCount() {
        this.bitField0_ &= -3;
        this.routesCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUseCase() {
        this.useCase_ = 0;
    }

    public static baw getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeGenericResponseData(bas basVar) {
        Objects.requireNonNull(basVar);
        bas basVar2 = this.genericResponseData_;
        if (basVar2 != null && basVar2 != bas.getDefaultInstance()) {
            bao baoVarNewBuilder = bas.newBuilder(basVar2);
            baoVarNewBuilder.mergeFrom((bao) basVar);
            basVar = baoVarNewBuilder.buildPartial();
        }
        this.genericResponseData_ = basVar;
        this.bitField0_ |= 1;
    }

    public static bav newBuilder() {
        return (bav) DEFAULT_INSTANCE.createBuilder();
    }

    public static baw parseDelimitedFrom(InputStream inputStream) {
        return (baw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static baw parseFrom(com.google.v.v vVar) {
        return (baw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<baw> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGenericResponseData(bas basVar) {
        Objects.requireNonNull(basVar);
        this.genericResponseData_ = basVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatencyIncludingRetriesMs(long j2) {
        this.bitField0_ |= 32;
        this.latencyIncludingRetriesMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLoggedIn(boolean z) {
        this.bitField0_ |= 4;
        this.loggedIn_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkRetriesCount(long j2) {
        this.bitField0_ |= 16;
        this.networkRetriesCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginalUseCase(awx awxVar) {
        this.originalUseCase_ = awxVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOriginalUseCaseValue(int i2) {
        this.originalUseCase_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPeriodicRetriesCount(long j2) {
        this.bitField0_ |= 8;
        this.periodicRetriesCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRoutesCount(long j2) {
        this.bitField0_ |= 2;
        this.routesCount_ = j2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဉ\u0000\u0002\f\u0003ဂ\u0001\u0004ဇ\u0002\u0005ဂ\u0003\u0006ဂ\u0004\u0007ဂ\u0005\b\f", new Object[]{"bitField0_", "genericResponseData_", "useCase_", "routesCount_", "loggedIn_", "periodicRetriesCount_", "networkRetriesCount_", "latencyIncludingRetriesMs_", "originalUseCase_"});
        }
        if (iOrdinal == 3) {
            return new baw();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bav(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<baw> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (baw.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public bas getGenericResponseData() {
        bas basVar = this.genericResponseData_;
        return basVar == null ? bas.getDefaultInstance() : basVar;
    }

    public long getLatencyIncludingRetriesMs() {
        return this.latencyIncludingRetriesMs_;
    }

    public boolean getLoggedIn() {
        return this.loggedIn_;
    }

    public long getNetworkRetriesCount() {
        return this.networkRetriesCount_;
    }

    public awx getOriginalUseCase() {
        awx awxVarA = awx.a(this.originalUseCase_);
        return awxVarA == null ? awx.UNRECOGNIZED : awxVarA;
    }

    public int getOriginalUseCaseValue() {
        return this.originalUseCase_;
    }

    public long getPeriodicRetriesCount() {
        return this.periodicRetriesCount_;
    }

    public long getRoutesCount() {
        return this.routesCount_;
    }

    public awx getUseCase() {
        awx awxVarA = awx.a(this.useCase_);
        return awxVarA == null ? awx.UNRECOGNIZED : awxVarA;
    }

    public int getUseCaseValue() {
        return this.useCase_;
    }

    public boolean hasGenericResponseData() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasLatencyIncludingRetriesMs() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasLoggedIn() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasNetworkRetriesCount() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPeriodicRetriesCount() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasRoutesCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bav newBuilder(baw bawVar) {
        return (bav) DEFAULT_INSTANCE.createBuilder(bawVar);
    }

    public static baw parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (baw) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static baw parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (baw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static baw parseFrom(com.google.v.z zVar) {
        return (baw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static baw parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (baw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static baw parseFrom(InputStream inputStream) {
        return (baw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static baw parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (baw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static baw parseFrom(ByteBuffer byteBuffer) {
        return (baw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static baw parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (baw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static baw parseFrom(byte[] bArr) {
        return (baw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static baw parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (baw) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
