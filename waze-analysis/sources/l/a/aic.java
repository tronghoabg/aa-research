package l.a;

import androidx.camera.video.AudioStats;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class aic extends com.google.v.du<aic, aib> implements com.google.v.fj {
    public static final int AVERAGE_RENDER_TIME_MS_FIELD_NUMBER = 4;
    private static final aic DEFAULT_INSTANCE;
    public static final int FRAMES_ABOVE_THRESHOLD_FIELD_NUMBER = 2;
    public static final int MAX_RENDER_TIME_MS_FIELD_NUMBER = 6;
    public static final int MEASUREMENT_WINDOW_DURATION_MS_FIELD_NUMBER = 7;
    public static final int MIN_RENDER_TIME_MS_FIELD_NUMBER = 5;
    private static volatile com.google.v.fo<aic> PARSER = null;
    public static final int THRESHOLD_MS_FIELD_NUMBER = 1;
    public static final int TOTAL_FRAMES_FIELD_NUMBER = 3;
    private double averageRenderTimeMs_;
    private int bitField0_;
    private long framesAboveThreshold_;
    private long maxRenderTimeMs_;
    private long measurementWindowDurationMs_;
    private long minRenderTimeMs_;
    private long thresholdMs_;
    private long totalFrames_;

    static {
        aic aicVar = new aic();
        DEFAULT_INSTANCE = aicVar;
        com.google.v.du.registerDefaultInstance(aic.class, aicVar);
    }

    private aic() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAverageRenderTimeMs() {
        this.bitField0_ &= -9;
        this.averageRenderTimeMs_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFramesAboveThreshold() {
        this.bitField0_ &= -3;
        this.framesAboveThreshold_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxRenderTimeMs() {
        this.bitField0_ &= -33;
        this.maxRenderTimeMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeasurementWindowDurationMs() {
        this.bitField0_ &= -65;
        this.measurementWindowDurationMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMinRenderTimeMs() {
        this.bitField0_ &= -17;
        this.minRenderTimeMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThresholdMs() {
        this.bitField0_ &= -2;
        this.thresholdMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalFrames() {
        this.bitField0_ &= -5;
        this.totalFrames_ = 0L;
    }

    public static aic getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static aib newBuilder() {
        return (aib) DEFAULT_INSTANCE.createBuilder();
    }

    public static aic parseDelimitedFrom(InputStream inputStream) {
        return (aic) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aic parseFrom(com.google.v.v vVar) {
        return (aic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<aic> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAverageRenderTimeMs(double d2) {
        this.bitField0_ |= 8;
        this.averageRenderTimeMs_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFramesAboveThreshold(long j2) {
        this.bitField0_ |= 2;
        this.framesAboveThreshold_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxRenderTimeMs(long j2) {
        this.bitField0_ |= 32;
        this.maxRenderTimeMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeasurementWindowDurationMs(long j2) {
        this.bitField0_ |= 64;
        this.measurementWindowDurationMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMinRenderTimeMs(long j2) {
        this.bitField0_ |= 16;
        this.minRenderTimeMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThresholdMs(long j2) {
        this.bitField0_ |= 1;
        this.thresholdMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTotalFrames(long j2) {
        this.bitField0_ |= 4;
        this.totalFrames_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004က\u0003\u0005ဂ\u0004\u0006ဂ\u0005\u0007ဂ\u0006", new Object[]{"bitField0_", "thresholdMs_", "framesAboveThreshold_", "totalFrames_", "averageRenderTimeMs_", "minRenderTimeMs_", "maxRenderTimeMs_", "measurementWindowDurationMs_"});
        }
        if (iOrdinal == 3) {
            return new aic();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new aib(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<aic> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (aic.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public double getAverageRenderTimeMs() {
        return this.averageRenderTimeMs_;
    }

    public long getFramesAboveThreshold() {
        return this.framesAboveThreshold_;
    }

    public long getMaxRenderTimeMs() {
        return this.maxRenderTimeMs_;
    }

    public long getMeasurementWindowDurationMs() {
        return this.measurementWindowDurationMs_;
    }

    public long getMinRenderTimeMs() {
        return this.minRenderTimeMs_;
    }

    public long getThresholdMs() {
        return this.thresholdMs_;
    }

    public long getTotalFrames() {
        return this.totalFrames_;
    }

    public boolean hasAverageRenderTimeMs() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasFramesAboveThreshold() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMaxRenderTimeMs() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasMeasurementWindowDurationMs() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasMinRenderTimeMs() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasThresholdMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTotalFrames() {
        return (this.bitField0_ & 4) != 0;
    }

    public static aib newBuilder(aic aicVar) {
        return (aib) DEFAULT_INSTANCE.createBuilder(aicVar);
    }

    public static aic parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aic) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aic parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (aic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static aic parseFrom(com.google.v.z zVar) {
        return (aic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static aic parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (aic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static aic parseFrom(InputStream inputStream) {
        return (aic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static aic parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (aic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static aic parseFrom(ByteBuffer byteBuffer) {
        return (aic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static aic parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (aic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static aic parseFrom(byte[] bArr) {
        return (aic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static aic parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (aic) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
