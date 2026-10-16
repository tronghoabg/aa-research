package com.waze.bg.e.a;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ie extends com.google.v.du<ie, id> implements Cif {
    public static final int ALERT_DETAILS_FIELD_NUMBER = 2;
    public static final int ALERT_ID_FIELD_NUMBER = 1;
    public static final int CITY_FIELD_NUMBER = 6;
    private static final ie DEFAULT_INSTANCE;
    public static final int NUM_REPORTED_FIELD_NUMBER = 7;
    private static volatile com.google.v.fo<ie> PARSER = null;
    public static final int POSITION_FIELD_NUMBER = 3;
    public static final int RELATIVE_POSITION_IN_TIME_FIELD_NUMBER = 4;
    public static final int STREET_FIELD_NUMBER = 5;
    private com.waze.bg.a.ej alertDetails_;
    private long alertId_;
    private int bitField0_;
    private int numReported_;
    private i.b.s position_;
    private double relativePositionInTime_;
    private String street_ = "";
    private String city_ = "";

    static {
        ie ieVar = new ie();
        DEFAULT_INSTANCE = ieVar;
        com.google.v.du.registerDefaultInstance(ie.class, ieVar);
    }

    private ie() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertDetails() {
        this.alertDetails_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlertId() {
        this.bitField0_ &= -2;
        this.alertId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCity() {
        this.bitField0_ &= -33;
        this.city_ = getDefaultInstance().getCity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNumReported() {
        this.bitField0_ &= -65;
        this.numReported_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPosition() {
        this.position_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelativePositionInTime() {
        this.bitField0_ &= -9;
        this.relativePositionInTime_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreet() {
        this.bitField0_ &= -17;
        this.street_ = getDefaultInstance().getStreet();
    }

    public static ie getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAlertDetails(com.waze.bg.a.ej ejVar) {
        Objects.requireNonNull(ejVar);
        com.waze.bg.a.ej ejVar2 = this.alertDetails_;
        if (ejVar2 != null && ejVar2 != com.waze.bg.a.ej.getDefaultInstance()) {
            com.waze.bg.a.dk dkVarNewBuilder = com.waze.bg.a.ej.newBuilder(ejVar2);
            dkVarNewBuilder.mergeFrom((com.waze.bg.a.dk) ejVar);
            ejVar = dkVarNewBuilder.buildPartial();
        }
        this.alertDetails_ = ejVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePosition(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        i.b.s sVar2 = this.position_;
        if (sVar2 != null && sVar2 != i.b.s.getDefaultInstance()) {
            i.b.p pVarNewBuilder = i.b.s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((i.b.p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.position_ = sVar;
        this.bitField0_ |= 4;
    }

    public static id newBuilder() {
        return (id) DEFAULT_INSTANCE.createBuilder();
    }

    public static ie parseDelimitedFrom(InputStream inputStream) {
        return (ie) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ie parseFrom(com.google.v.v vVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ie> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertDetails(com.waze.bg.a.ej ejVar) {
        Objects.requireNonNull(ejVar);
        this.alertDetails_ = ejVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlertId(long j2) {
        this.bitField0_ |= 1;
        this.alertId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCity(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.city_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityBytes(com.google.v.v vVar) {
        this.city_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNumReported(int i2) {
        this.bitField0_ |= 64;
        this.numReported_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPosition(i.b.s sVar) {
        Objects.requireNonNull(sVar);
        this.position_ = sVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelativePositionInTime(double d2) {
        this.bitField0_ |= 8;
        this.relativePositionInTime_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreet(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.street_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetBytes(com.google.v.v vVar) {
        this.street_ = vVar.u();
        this.bitField0_ |= 16;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဉ\u0001\u0003ဉ\u0002\u0004က\u0003\u0005ဈ\u0004\u0006ဈ\u0005\u0007င\u0006", new Object[]{"bitField0_", "alertId_", "alertDetails_", "position_", "relativePositionInTime_", "street_", "city_", "numReported_"});
        }
        if (iOrdinal == 3) {
            return new ie();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new id(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ie> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ie.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public com.waze.bg.a.ej getAlertDetails() {
        com.waze.bg.a.ej ejVar = this.alertDetails_;
        return ejVar == null ? com.waze.bg.a.ej.getDefaultInstance() : ejVar;
    }

    public long getAlertId() {
        return this.alertId_;
    }

    public String getCity() {
        return this.city_;
    }

    public com.google.v.v getCityBytes() {
        return com.google.v.v.s(this.city_);
    }

    public int getNumReported() {
        return this.numReported_;
    }

    public i.b.s getPosition() {
        i.b.s sVar = this.position_;
        return sVar == null ? i.b.s.getDefaultInstance() : sVar;
    }

    public double getRelativePositionInTime() {
        return this.relativePositionInTime_;
    }

    public String getStreet() {
        return this.street_;
    }

    public com.google.v.v getStreetBytes() {
        return com.google.v.v.s(this.street_);
    }

    public boolean hasAlertDetails() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasAlertId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCity() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasNumReported() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasPosition() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasRelativePositionInTime() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasStreet() {
        return (this.bitField0_ & 16) != 0;
    }

    public static id newBuilder(ie ieVar) {
        return (id) DEFAULT_INSTANCE.createBuilder(ieVar);
    }

    public static ie parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ie) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ie parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ie parseFrom(com.google.v.z zVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ie parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ie parseFrom(InputStream inputStream) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ie parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ie parseFrom(ByteBuffer byteBuffer) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ie parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ie parseFrom(byte[] bArr) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ie parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ie) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
