package com.waze.bg.a;

import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class g extends com.google.v.du<g, f> implements fj {
    public static final int ALERT_DETAILS_FIELD_NUMBER = 4;
    public static final int ALERT_UUID_FIELD_NUMBER = 5;
    public static final int CLIENT_ALERT_ID_FIELD_NUMBER = 3;
    private static final g DEFAULT_INSTANCE;
    private static volatile fo<g> PARSER = null;
    public static final int RECEIVED_POINTS_COUNT_FIELD_NUMBER = 2;
    public static final int STATUS_FIELD_NUMBER = 1;
    private ej alertDetails_;
    private String alertUuid_ = "";
    private int bitField0_;
    private long clientAlertId_;
    private long receivedPointsCount_;
    private i.b.ah status_;

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        com.google.v.du.registerDefaultInstance(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertDetails() {
        this.alertDetails_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertUuid() {
        this.bitField0_ &= -17;
        this.alertUuid_ = getDefaultInstance().getAlertUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClientAlertId() {
        this.bitField0_ &= -5;
        this.clientAlertId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearReceivedPointsCount() {
        this.bitField0_ &= -3;
        this.receivedPointsCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.status_ = null;
        this.bitField0_ &= -2;
    }

    public static g getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlertDetails(ej ejVar) {
        Objects.requireNonNull(ejVar);
        ej ejVar2 = this.alertDetails_;
        if (ejVar2 != null && ejVar2 != ej.getDefaultInstance()) {
            dk dkVarNewBuilder = ej.newBuilder(ejVar2);
            dkVarNewBuilder.mergeFrom((dk) ejVar);
            ejVar = dkVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = ejVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeStatus(i.b.ah ahVar) {
        Objects.requireNonNull(ahVar);
        i.b.ah ahVar2 = this.status_;
        if (ahVar2 != null && ahVar2 != i.b.ah.getDefaultInstance()) {
            i.b.af afVarNewBuilder = i.b.ah.newBuilder(ahVar2);
            afVarNewBuilder.mergeFrom((i.b.af) ahVar);
            ahVar = afVarNewBuilder.buildPartial();
        }
        this.status_ = ahVar;
        this.bitField0_ |= 1;
    }

    public static f newBuilder() {
        return (f) DEFAULT_INSTANCE.createBuilder();
    }

    public static g parseDelimitedFrom(InputStream inputStream) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(com.google.v.v vVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<g> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertDetails(ej ejVar) {
        Objects.requireNonNull(ejVar);
        this.alertDetails_ = ejVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.alertUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertUuidBytes(com.google.v.v vVar) {
        this.alertUuid_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClientAlertId(long j2) {
        this.bitField0_ |= 4;
        this.clientAlertId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setReceivedPointsCount(long j2) {
        this.bitField0_ |= 2;
        this.receivedPointsCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(i.b.ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.status_ = ahVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004ဉ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "status_", "receivedPointsCount_", "clientAlertId_", "alertDetails_", "alertUuid_"});
        }
        if (iOrdinal == 3) {
            return new g();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new f(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<g> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (g.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public ej getAlertDetails() {
        ej ejVar = this.alertDetails_;
        return ejVar == null ? ej.getDefaultInstance() : ejVar;
    }

    public String getAlertUuid() {
        return this.alertUuid_;
    }

    public com.google.v.v getAlertUuidBytes() {
        return com.google.v.v.s(this.alertUuid_);
    }

    public long getClientAlertId() {
        return this.clientAlertId_;
    }

    public long getReceivedPointsCount() {
        return this.receivedPointsCount_;
    }

    public i.b.ah getStatus() {
        i.b.ah ahVar = this.status_;
        return ahVar == null ? i.b.ah.getDefaultInstance() : ahVar;
    }

    public boolean hasAlertDetails() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasAlertUuid() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasClientAlertId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasReceivedPointsCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public static f newBuilder(g gVar) {
        return (f) DEFAULT_INSTANCE.createBuilder(gVar);
    }

    public static g parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (g) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static g parseFrom(com.google.v.z zVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static g parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static g parseFrom(InputStream inputStream) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static g parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static g parseFrom(ByteBuffer byteBuffer) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static g parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static g parseFrom(byte[] bArr) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static g parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (g) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
