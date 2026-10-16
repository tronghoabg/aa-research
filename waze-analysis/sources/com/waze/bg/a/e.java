package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class e extends com.google.v.du<e, c> implements fj {
    public static final int ALERT_DETAILS_FIELD_NUMBER = 3;
    public static final int AZYMUTH_FIELD_NUMBER = 2;
    private static final e DEFAULT_INSTANCE;
    public static final int IS_OFFLINE_DELAYED_REPORT_FIELD_NUMBER = 6;
    private static volatile fo<e> PARSER = null;
    public static final int REPORTING_MANNER_FIELD_NUMBER = 7;
    public static final int REPORT_TIME_FIELD_NUMBER = 5;
    public static final int SEGMENT_DIRECTION_FIELD_NUMBER = 4;
    public static final int USER_POSITION_FIELD_NUMBER = 1;
    private de alertDetails_;
    private int azymuth_;
    private int bitField0_;
    private boolean isOfflineDelayedReport_;
    private com.waze.ca.e reportTime_;
    private int reportingManner_;
    private int segmentDirection_;
    private com.waze.bg.d.d userPosition_;

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        com.google.v.du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertDetails() {
        this.alertDetails_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAzymuth() {
        this.bitField0_ &= -3;
        this.azymuth_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsOfflineDelayedReport() {
        this.bitField0_ &= -33;
        this.isOfflineDelayedReport_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportTime() {
        this.reportTime_ = null;
        this.bitField0_ &= -17;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReportingManner() {
        this.bitField0_ &= -65;
        this.reportingManner_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentDirection() {
        this.bitField0_ &= -9;
        this.segmentDirection_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserPosition() {
        this.userPosition_ = null;
        this.bitField0_ &= -2;
    }

    public static e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlertDetails(de deVar) {
        Objects.requireNonNull(deVar);
        de deVar2 = this.alertDetails_;
        if (deVar2 != null && deVar2 != de.getDefaultInstance()) {
            cj cjVarNewBuilder = de.newBuilder(deVar2);
            cjVarNewBuilder.mergeFrom((cj) deVar);
            deVar = cjVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = deVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeReportTime(com.waze.ca.e eVar) {
        Objects.requireNonNull(eVar);
        com.waze.ca.e eVar2 = this.reportTime_;
        if (eVar2 != null && eVar2 != com.waze.ca.e.getDefaultInstance()) {
            com.waze.ca.d dVarNewBuilder = com.waze.ca.e.newBuilder(eVar2);
            dVarNewBuilder.mergeFrom((com.waze.ca.d) eVar);
            eVar = dVarNewBuilder.buildPartial();
        }
        this.reportTime_ = eVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserPosition(com.waze.bg.d.d dVar) {
        Objects.requireNonNull(dVar);
        com.waze.bg.d.d dVar2 = this.userPosition_;
        if (dVar2 != null && dVar2 != com.waze.bg.d.d.getDefaultInstance()) {
            com.waze.bg.d.c cVarNewBuilder = com.waze.bg.d.d.newBuilder(dVar2);
            cVarNewBuilder.mergeFrom((com.waze.bg.d.c) dVar);
            dVar = cVarNewBuilder.buildPartial();
        }
        this.userPosition_ = dVar;
        this.bitField0_ |= 1;
    }

    public static c newBuilder() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    public static e parseDelimitedFrom(InputStream inputStream) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(com.google.v.v vVar) {
        return (e) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertDetails(de deVar) {
        Objects.requireNonNull(deVar);
        this.alertDetails_ = deVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAzymuth(int i2) {
        this.bitField0_ |= 2;
        this.azymuth_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsOfflineDelayedReport(boolean z) {
        this.bitField0_ |= 32;
        this.isOfflineDelayedReport_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportTime(com.waze.ca.e eVar) {
        Objects.requireNonNull(eVar);
        this.reportTime_ = eVar;
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReportingManner(d dVar) {
        this.reportingManner_ = dVar.getNumber();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentDirection(com.waze.bg.d.f fVar) {
        this.segmentDirection_ = fVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserPosition(com.waze.bg.d.d dVar) {
        Objects.requireNonNull(dVar);
        this.userPosition_ = dVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဉ\u0002\u0004᠌\u0003\u0005ဉ\u0004\u0006ဇ\u0005\u0007᠌\u0006", new Object[]{"bitField0_", "userPosition_", "azymuth_", "alertDetails_", "segmentDirection_", com.waze.bg.d.f.a(), "reportTime_", "isOfflineDelayedReport_", "reportingManner_", o.f16556b});
        }
        if (iOrdinal == 3) {
            return new e();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new c(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<e> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (e.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public de getAlertDetails() {
        de deVar = this.alertDetails_;
        return deVar == null ? de.getDefaultInstance() : deVar;
    }

    public int getAzymuth() {
        return this.azymuth_;
    }

    public boolean getIsOfflineDelayedReport() {
        return this.isOfflineDelayedReport_;
    }

    public com.waze.ca.e getReportTime() {
        com.waze.ca.e eVar = this.reportTime_;
        return eVar == null ? com.waze.ca.e.getDefaultInstance() : eVar;
    }

    public d getReportingManner() {
        d dVarA = d.a(this.reportingManner_);
        return dVarA == null ? d.REPORTING_MANNER_UNSPECIFIED : dVarA;
    }

    public com.waze.bg.d.f getSegmentDirection() {
        com.waze.bg.d.f fVarB = com.waze.bg.d.f.b(this.segmentDirection_);
        return fVarB == null ? com.waze.bg.d.f.UNKNOWN_DIRECTION : fVarB;
    }

    public com.waze.bg.d.d getUserPosition() {
        com.waze.bg.d.d dVar = this.userPosition_;
        return dVar == null ? com.waze.bg.d.d.getDefaultInstance() : dVar;
    }

    public boolean hasAlertDetails() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasAzymuth() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasIsOfflineDelayedReport() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasReportTime() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasReportingManner() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasSegmentDirection() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasUserPosition() {
        return (this.bitField0_ & 1) != 0;
    }

    public static c newBuilder(e eVar) {
        return (c) DEFAULT_INSTANCE.createBuilder(eVar);
    }

    public static e parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (e) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static e parseFrom(com.google.v.z zVar) {
        return (e) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static e parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (e) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static e parseFrom(InputStream inputStream) {
        return (e) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (e) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(ByteBuffer byteBuffer) {
        return (e) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (e) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static e parseFrom(byte[] bArr) {
        return (e) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static e parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (e) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
