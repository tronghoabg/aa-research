package l.a;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class hy extends com.google.v.du<hy, hx> implements com.google.v.fj {
    public static final int BATTERY_VOLTAGE_MV_FIELD_NUMBER = 4;
    public static final int BATTERY_VOLT_MV_FIELD_NUMBER = 7;
    public static final int BEACON_ID_SUFFIX_FIELD_NUMBER = 1;
    private static final hy DEFAULT_INSTANCE;
    public static final int FIRST_SAMPLE_TIMESTAMP_MS_FIELD_NUMBER = 6;
    private static volatile com.google.v.fo<hy> PARSER = null;
    public static final int PDU_COUNT_FIELD_NUMBER = 3;
    public static final int TEMPERATURE_DEGREE_CELSIUS_FIELD_NUMBER = 2;
    public static final int TIME_SINCE_LAST_REBOOT_MS_FIELD_NUMBER = 5;
    private double batteryVoltMv_;
    private long batteryVoltageMv_;
    private String beaconIdSuffix_ = "";
    private int bitField0_;
    private long firstSampleTimestampMs_;
    private long pduCount_;
    private double temperatureDegreeCelsius_;
    private long timeSinceLastRebootMs_;

    static {
        hy hyVar = new hy();
        DEFAULT_INSTANCE = hyVar;
        com.google.v.du.registerDefaultInstance(hy.class, hyVar);
    }

    private hy() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatteryVoltMv() {
        this.bitField0_ &= -33;
        this.batteryVoltMv_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBatteryVoltageMv() {
        this.bitField0_ &= -5;
        this.batteryVoltageMv_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBeaconIdSuffix() {
        this.beaconIdSuffix_ = getDefaultInstance().getBeaconIdSuffix();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstSampleTimestampMs() {
        this.bitField0_ &= -17;
        this.firstSampleTimestampMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPduCount() {
        this.bitField0_ &= -3;
        this.pduCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTemperatureDegreeCelsius() {
        this.bitField0_ &= -2;
        this.temperatureDegreeCelsius_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeSinceLastRebootMs() {
        this.bitField0_ &= -9;
        this.timeSinceLastRebootMs_ = 0L;
    }

    public static hy getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static hx newBuilder() {
        return (hx) DEFAULT_INSTANCE.createBuilder();
    }

    public static hy parseDelimitedFrom(InputStream inputStream) {
        return (hy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hy parseFrom(com.google.v.v vVar) {
        return (hy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<hy> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatteryVoltMv(double d2) {
        this.bitField0_ |= 32;
        this.batteryVoltMv_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBatteryVoltageMv(long j2) {
        this.bitField0_ |= 4;
        this.batteryVoltageMv_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeaconIdSuffix(String str) {
        Objects.requireNonNull(str);
        this.beaconIdSuffix_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBeaconIdSuffixBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.beaconIdSuffix_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstSampleTimestampMs(long j2) {
        this.bitField0_ |= 16;
        this.firstSampleTimestampMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPduCount(long j2) {
        this.bitField0_ |= 2;
        this.pduCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTemperatureDegreeCelsius(double d2) {
        this.bitField0_ |= 1;
        this.temperatureDegreeCelsius_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeSinceLastRebootMs(long j2) {
        this.bitField0_ |= 8;
        this.timeSinceLastRebootMs_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȉ\u0002က\u0000\u0003တ\u0001\u0004တ\u0002\u0005တ\u0003\u0006ဂ\u0004\u0007က\u0005", new Object[]{"bitField0_", "beaconIdSuffix_", "temperatureDegreeCelsius_", "pduCount_", "batteryVoltageMv_", "timeSinceLastRebootMs_", "firstSampleTimestampMs_", "batteryVoltMv_"});
        }
        if (iOrdinal == 3) {
            return new hy();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new hx(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<hy> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (hy.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public double getBatteryVoltMv() {
        return this.batteryVoltMv_;
    }

    @Deprecated
    public long getBatteryVoltageMv() {
        return this.batteryVoltageMv_;
    }

    public String getBeaconIdSuffix() {
        return this.beaconIdSuffix_;
    }

    public com.google.v.v getBeaconIdSuffixBytes() {
        return com.google.v.v.s(this.beaconIdSuffix_);
    }

    public long getFirstSampleTimestampMs() {
        return this.firstSampleTimestampMs_;
    }

    public long getPduCount() {
        return this.pduCount_;
    }

    public double getTemperatureDegreeCelsius() {
        return this.temperatureDegreeCelsius_;
    }

    public long getTimeSinceLastRebootMs() {
        return this.timeSinceLastRebootMs_;
    }

    public boolean hasBatteryVoltMv() {
        return (this.bitField0_ & 32) != 0;
    }

    @Deprecated
    public boolean hasBatteryVoltageMv() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasFirstSampleTimestampMs() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasPduCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTemperatureDegreeCelsius() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTimeSinceLastRebootMs() {
        return (this.bitField0_ & 8) != 0;
    }

    public static hx newBuilder(hy hyVar) {
        return (hx) DEFAULT_INSTANCE.createBuilder(hyVar);
    }

    public static hy parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hy) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hy parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (hy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static hy parseFrom(com.google.v.z zVar) {
        return (hy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static hy parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (hy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static hy parseFrom(InputStream inputStream) {
        return (hy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static hy parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (hy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static hy parseFrom(ByteBuffer byteBuffer) {
        return (hy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static hy parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (hy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static hy parseFrom(byte[] bArr) {
        return (hy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static hy parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (hy) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
