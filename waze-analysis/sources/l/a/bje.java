package l.a;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class bje extends com.google.v.du<bje, bjc> implements com.google.v.fj {
    public static final int ACQUISITION_TIMESTAMP_UNIX_MS_FIELD_NUMBER = 8;
    public static final int ALTITUDE_METERS_FIELD_NUMBER = 3;
    public static final int BEARING_DEGREES_FIELD_NUMBER = 4;
    public static final int COORDINATES_FIELD_NUMBER = 2;
    private static final bje DEFAULT_INSTANCE;
    public static final int HORIZONTAL_ACCURACY_METERS_FIELD_NUMBER = 5;
    public static final int LOCATION_PROVIDER_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<bje> PARSER = null;
    public static final int SPEED_METERS_PER_SECOND_FIELD_NUMBER = 7;
    public static final int TIME_ELAPSED_SINCE_ACQUISITION_MS_FIELD_NUMBER = 9;
    public static final int VERTICAL_ACCURACY_METERS_FIELD_NUMBER = 6;
    private long acquisitionTimestampUnixMs_;
    private double altitudeMeters_;
    private double bearingDegrees_;
    private int bitField0_;
    private afx coordinates_;
    private double horizontalAccuracyMeters_;
    private int locationProvider_;
    private double speedMetersPerSecond_;
    private long timeElapsedSinceAcquisitionMs_;
    private double verticalAccuracyMeters_;

    static {
        bje bjeVar = new bje();
        DEFAULT_INSTANCE = bjeVar;
        com.google.v.du.registerDefaultInstance(bje.class, bjeVar);
    }

    private bje() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAcquisitionTimestampUnixMs() {
        this.bitField0_ &= -65;
        this.acquisitionTimestampUnixMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltitudeMeters() {
        this.bitField0_ &= -3;
        this.altitudeMeters_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBearingDegrees() {
        this.bitField0_ &= -5;
        this.bearingDegrees_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinates() {
        this.coordinates_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHorizontalAccuracyMeters() {
        this.bitField0_ &= -9;
        this.horizontalAccuracyMeters_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocationProvider() {
        this.locationProvider_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeedMetersPerSecond() {
        this.bitField0_ &= -33;
        this.speedMetersPerSecond_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeElapsedSinceAcquisitionMs() {
        this.bitField0_ &= -129;
        this.timeElapsedSinceAcquisitionMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVerticalAccuracyMeters() {
        this.bitField0_ &= -17;
        this.verticalAccuracyMeters_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static bje getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        afx afxVar2 = this.coordinates_;
        if (afxVar2 != null && afxVar2 != afx.getDefaultInstance()) {
            afw afwVarNewBuilder = afx.newBuilder(afxVar2);
            afwVarNewBuilder.mergeFrom((afw) afxVar);
            afxVar = afwVarNewBuilder.buildPartial();
        }
        this.coordinates_ = afxVar;
        this.bitField0_ |= 1;
    }

    public static bjc newBuilder() {
        return (bjc) DEFAULT_INSTANCE.createBuilder();
    }

    public static bje parseDelimitedFrom(InputStream inputStream) {
        return (bje) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bje parseFrom(com.google.v.v vVar) {
        return (bje) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<bje> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAcquisitionTimestampUnixMs(long j2) {
        this.bitField0_ |= 64;
        this.acquisitionTimestampUnixMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltitudeMeters(double d2) {
        this.bitField0_ |= 2;
        this.altitudeMeters_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBearingDegrees(double d2) {
        this.bitField0_ |= 4;
        this.bearingDegrees_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinates(afx afxVar) {
        Objects.requireNonNull(afxVar);
        this.coordinates_ = afxVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHorizontalAccuracyMeters(double d2) {
        this.bitField0_ |= 8;
        this.horizontalAccuracyMeters_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationProvider(bjd bjdVar) {
        this.locationProvider_ = bjdVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocationProviderValue(int i2) {
        this.locationProvider_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeedMetersPerSecond(double d2) {
        this.bitField0_ |= 32;
        this.speedMetersPerSecond_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeElapsedSinceAcquisitionMs(long j2) {
        this.bitField0_ |= 128;
        this.timeElapsedSinceAcquisitionMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVerticalAccuracyMeters(double d2) {
        this.bitField0_ |= 16;
        this.verticalAccuracyMeters_ = d2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003က\u0001\u0004က\u0002\u0005က\u0003\u0006က\u0004\u0007က\u0005\bဂ\u0006\tဂ\u0007", new Object[]{"bitField0_", "locationProvider_", "coordinates_", "altitudeMeters_", "bearingDegrees_", "horizontalAccuracyMeters_", "verticalAccuracyMeters_", "speedMetersPerSecond_", "acquisitionTimestampUnixMs_", "timeElapsedSinceAcquisitionMs_"});
        }
        if (iOrdinal == 3) {
            return new bje();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bjc(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<bje> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (bje.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getAcquisitionTimestampUnixMs() {
        return this.acquisitionTimestampUnixMs_;
    }

    public double getAltitudeMeters() {
        return this.altitudeMeters_;
    }

    public double getBearingDegrees() {
        return this.bearingDegrees_;
    }

    public afx getCoordinates() {
        afx afxVar = this.coordinates_;
        return afxVar == null ? afx.getDefaultInstance() : afxVar;
    }

    public double getHorizontalAccuracyMeters() {
        return this.horizontalAccuracyMeters_;
    }

    public bjd getLocationProvider() {
        int i2 = this.locationProvider_;
        bjd bjdVar = i2 != 0 ? i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? null : bjd.FUSED : bjd.NETWORK : bjd.GPS : bjd.CAR_GPS : bjd.LOCATION_PROVIDER_UNSPECIFIED;
        return bjdVar == null ? bjd.UNRECOGNIZED : bjdVar;
    }

    public int getLocationProviderValue() {
        return this.locationProvider_;
    }

    public double getSpeedMetersPerSecond() {
        return this.speedMetersPerSecond_;
    }

    public long getTimeElapsedSinceAcquisitionMs() {
        return this.timeElapsedSinceAcquisitionMs_;
    }

    public double getVerticalAccuracyMeters() {
        return this.verticalAccuracyMeters_;
    }

    public boolean hasAcquisitionTimestampUnixMs() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasAltitudeMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasBearingDegrees() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasCoordinates() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasHorizontalAccuracyMeters() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSpeedMetersPerSecond() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasTimeElapsedSinceAcquisitionMs() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasVerticalAccuracyMeters() {
        return (this.bitField0_ & 16) != 0;
    }

    public static bjc newBuilder(bje bjeVar) {
        return (bjc) DEFAULT_INSTANCE.createBuilder(bjeVar);
    }

    public static bje parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bje) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bje parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (bje) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static bje parseFrom(com.google.v.z zVar) {
        return (bje) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static bje parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (bje) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static bje parseFrom(InputStream inputStream) {
        return (bje) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static bje parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (bje) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static bje parseFrom(ByteBuffer byteBuffer) {
        return (bje) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static bje parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (bje) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static bje parseFrom(byte[] bArr) {
        return (bje) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static bje parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (bje) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
