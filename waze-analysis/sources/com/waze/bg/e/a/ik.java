package com.waze.bg.e.a;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class ik extends com.google.v.du<ik, ii> implements il {
    public static final int CITY_FIELD_NUMBER = 7;
    private static final ik DEFAULT_INSTANCE;
    public static final int DELAY_SECONDS_FIELD_NUMBER = 8;
    public static final int ENCODEDS2POINTS_FIELD_NUMBER = 3;
    public static final int HISTORIC_DELAY_SECONDS_FIELD_NUMBER = 9;
    public static final int JAM_ID_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ik> PARSER = null;
    public static final int RELATIVE_END_POSITION_IN_TIME_FIELD_NUMBER = 5;
    public static final int RELATIVE_START_POSITION_IN_TIME_FIELD_NUMBER = 4;
    public static final int STREET_FIELD_NUMBER = 6;
    public static final int TOTAL_LENGTH_METERS_FIELD_NUMBER = 11;
    public static final int TOTAL_TIME_SECONDS_FIELD_NUMBER = 10;
    public static final int TRAFFIC_SEVERITY_FIELD_NUMBER = 2;
    private int bitField0_;
    private int delaySeconds_;
    private int historicDelaySeconds_;
    private long jamId_;
    private double relativeEndPositionInTime_;
    private double relativeStartPositionInTime_;
    private int totalLengthMeters_;
    private int totalTimeSeconds_;
    private int trafficSeverity_;
    private com.google.v.v encodedS2Points_ = com.google.v.v.f13054a;
    private String street_ = "";
    private String city_ = "";

    static {
        ik ikVar = new ik();
        DEFAULT_INSTANCE = ikVar;
        com.google.v.du.registerDefaultInstance(ik.class, ikVar);
    }

    private ik() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCity() {
        this.bitField0_ &= -65;
        this.city_ = getDefaultInstance().getCity();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDelaySeconds() {
        this.bitField0_ &= -129;
        this.delaySeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEncodedS2Points() {
        this.bitField0_ &= -5;
        this.encodedS2Points_ = getDefaultInstance().getEncodedS2Points();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHistoricDelaySeconds() {
        this.bitField0_ &= -257;
        this.historicDelaySeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearJamId() {
        this.bitField0_ &= -2;
        this.jamId_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelativeEndPositionInTime() {
        this.bitField0_ &= -17;
        this.relativeEndPositionInTime_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRelativeStartPositionInTime() {
        this.bitField0_ &= -9;
        this.relativeStartPositionInTime_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStreet() {
        this.bitField0_ &= -33;
        this.street_ = getDefaultInstance().getStreet();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalLengthMeters() {
        this.bitField0_ &= -1025;
        this.totalLengthMeters_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalTimeSeconds() {
        this.bitField0_ &= -513;
        this.totalTimeSeconds_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficSeverity() {
        this.bitField0_ &= -3;
        this.trafficSeverity_ = 0;
    }

    public static ik getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ii newBuilder() {
        return (ii) DEFAULT_INSTANCE.createBuilder();
    }

    public static ik parseDelimitedFrom(InputStream inputStream) {
        return (ik) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ik parseFrom(com.google.v.v vVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ik> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCity(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 64;
        this.city_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCityBytes(com.google.v.v vVar) {
        this.city_ = vVar.u();
        this.bitField0_ |= 64;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDelaySeconds(int i2) {
        this.bitField0_ |= 128;
        this.delaySeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEncodedS2Points(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 4;
        this.encodedS2Points_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHistoricDelaySeconds(int i2) {
        this.bitField0_ |= 256;
        this.historicDelaySeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setJamId(long j2) {
        this.bitField0_ |= 1;
        this.jamId_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelativeEndPositionInTime(double d2) {
        this.bitField0_ |= 16;
        this.relativeEndPositionInTime_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRelativeStartPositionInTime(double d2) {
        this.bitField0_ |= 8;
        this.relativeStartPositionInTime_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreet(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.street_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStreetBytes(com.google.v.v vVar) {
        this.street_ = vVar.u();
        this.bitField0_ |= 32;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalLengthMeters(int i2) {
        this.bitField0_ |= 1024;
        this.totalLengthMeters_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalTimeSeconds(int i2) {
        this.bitField0_ |= 512;
        this.totalTimeSeconds_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficSeverity(ij ijVar) {
        this.trafficSeverity_ = ijVar.getNumber();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u000b\u0000\u0001\u0001\u000b\u000b\u0000\u0000\u0000\u0001ဂ\u0000\u0002᠌\u0001\u0003ည\u0002\u0004က\u0003\u0005က\u0004\u0006ဈ\u0005\u0007ဈ\u0006\bင\u0007\tင\b\nင\t\u000bင\n", new Object[]{"bitField0_", "jamId_", "trafficSeverity_", ci.f16642h, "encodedS2Points_", "relativeStartPositionInTime_", "relativeEndPositionInTime_", "street_", "city_", "delaySeconds_", "historicDelaySeconds_", "totalTimeSeconds_", "totalLengthMeters_"});
        }
        if (iOrdinal == 3) {
            return new ik();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ii(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ik> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ik.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getCity() {
        return this.city_;
    }

    public com.google.v.v getCityBytes() {
        return com.google.v.v.s(this.city_);
    }

    public int getDelaySeconds() {
        return this.delaySeconds_;
    }

    public com.google.v.v getEncodedS2Points() {
        return this.encodedS2Points_;
    }

    public int getHistoricDelaySeconds() {
        return this.historicDelaySeconds_;
    }

    public long getJamId() {
        return this.jamId_;
    }

    public double getRelativeEndPositionInTime() {
        return this.relativeEndPositionInTime_;
    }

    public double getRelativeStartPositionInTime() {
        return this.relativeStartPositionInTime_;
    }

    public String getStreet() {
        return this.street_;
    }

    public com.google.v.v getStreetBytes() {
        return com.google.v.v.s(this.street_);
    }

    public int getTotalLengthMeters() {
        return this.totalLengthMeters_;
    }

    public int getTotalTimeSeconds() {
        return this.totalTimeSeconds_;
    }

    public ij getTrafficSeverity() {
        ij ijVarA = ij.a(this.trafficSeverity_);
        return ijVarA == null ? ij.SEVERITY_UNSPECIFIED : ijVarA;
    }

    public boolean hasCity() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasDelaySeconds() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasEncodedS2Points() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasHistoricDelaySeconds() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasJamId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasRelativeEndPositionInTime() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasRelativeStartPositionInTime() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasStreet() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasTotalLengthMeters() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasTotalTimeSeconds() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasTrafficSeverity() {
        return (this.bitField0_ & 2) != 0;
    }

    public static ii newBuilder(ik ikVar) {
        return (ii) DEFAULT_INSTANCE.createBuilder(ikVar);
    }

    public static ik parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ik) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ik parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ik parseFrom(com.google.v.z zVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ik parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ik parseFrom(InputStream inputStream) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ik parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ik parseFrom(ByteBuffer byteBuffer) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ik parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ik parseFrom(byte[] bArr) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ik parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ik) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
