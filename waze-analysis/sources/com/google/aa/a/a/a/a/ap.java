package com.google.aa.a.a.a.a;

import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ap extends du<ap, an> implements fj {
    private static final ap DEFAULT_INSTANCE;
    public static final int IS_FINAL_FIELD_NUMBER = 2;
    private static volatile fo<ap> PARSER = null;
    public static final int PERSISTED_LOG_EXPIRED_COUNT_FIELD_NUMBER = 5;
    public static final int PERSISTED_LOG_RECOVERED_COUNT_FIELD_NUMBER = 4;
    public static final int RETRY_COUNT_FIELD_NUMBER = 3;
    public static final int TRANSMISSION_TYPE_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean isFinal_;
    private int persistedLogExpiredCount_;
    private int persistedLogRecoveredCount_;
    private int retryCount_;
    private int transmissionType_;

    static {
        ap apVar = new ap();
        DEFAULT_INSTANCE = apVar;
        du.registerDefaultInstance(ap.class, apVar);
    }

    private ap() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFinal() {
        this.bitField0_ &= -3;
        this.isFinal_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPersistedLogExpiredCount() {
        this.bitField0_ &= -17;
        this.persistedLogExpiredCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPersistedLogRecoveredCount() {
        this.bitField0_ &= -9;
        this.persistedLogRecoveredCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRetryCount() {
        this.bitField0_ &= -5;
        this.retryCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTransmissionType() {
        this.bitField0_ &= -2;
        this.transmissionType_ = 0;
    }

    public static ap getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static an newBuilder() {
        return (an) DEFAULT_INSTANCE.createBuilder();
    }

    public static ap parseDelimitedFrom(InputStream inputStream) {
        return (ap) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ap parseFrom(com.google.v.v vVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ap> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFinal(boolean z) {
        this.bitField0_ |= 2;
        this.isFinal_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPersistedLogExpiredCount(int i2) {
        this.bitField0_ |= 16;
        this.persistedLogExpiredCount_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPersistedLogRecoveredCount(int i2) {
        this.bitField0_ |= 8;
        this.persistedLogRecoveredCount_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRetryCount(int i2) {
        this.bitField0_ |= 4;
        this.retryCount_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTransmissionType(ao aoVar) {
        this.transmissionType_ = aoVar.getNumber();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002ဇ\u0001\u0003င\u0002\u0004င\u0003\u0005င\u0004", new Object[]{"bitField0_", "transmissionType_", i.f3793k, "isFinal_", "retryCount_", "persistedLogRecoveredCount_", "persistedLogExpiredCount_"});
        }
        if (iOrdinal == 3) {
            return new ap();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new an(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ap> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ap.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIsFinal() {
        return this.isFinal_;
    }

    public int getPersistedLogExpiredCount() {
        return this.persistedLogExpiredCount_;
    }

    public int getPersistedLogRecoveredCount() {
        return this.persistedLogRecoveredCount_;
    }

    public int getRetryCount() {
        return this.retryCount_;
    }

    public ao getTransmissionType() {
        ao aoVarA = ao.a(this.transmissionType_);
        return aoVarA == null ? ao.TRANSMISSION_TYPE_UNKNOWN : aoVarA;
    }

    public boolean hasIsFinal() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPersistedLogExpiredCount() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPersistedLogRecoveredCount() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasRetryCount() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTransmissionType() {
        return (this.bitField0_ & 1) != 0;
    }

    public static an newBuilder(ap apVar) {
        return (an) DEFAULT_INSTANCE.createBuilder(apVar);
    }

    public static ap parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ap) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ap parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ap parseFrom(com.google.v.z zVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ap parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ap parseFrom(InputStream inputStream) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ap parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ap parseFrom(ByteBuffer byteBuffer) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ap parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ap parseFrom(byte[] bArr) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ap parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ap) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
