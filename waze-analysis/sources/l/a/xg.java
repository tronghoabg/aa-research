package l.a;

import androidx.camera.video.AudioStats;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class xg extends com.google.v.du<xg, xe> implements com.google.v.fj {
    public static final int CANVAS_TAG_FIELD_NUMBER = 4;
    private static final xg DEFAULT_INSTANCE;
    public static final int FRAMES_ABOVE_THRESHOLD_FIELD_NUMBER = 2;
    public static final int MEASURE_TIME_MS_FIELD_NUMBER = 8;
    private static volatile com.google.v.fo<xg> PARSER = null;
    public static final int THRESHOLD_MS_FIELD_NUMBER = 1;
    public static final int TIME_AVG_MS_FIELD_NUMBER = 5;
    public static final int TIME_MAX_MS_FIELD_NUMBER = 7;
    public static final int TIME_MIN_MS_FIELD_NUMBER = 6;
    public static final int TOTAL_FRAMES_FIELD_NUMBER = 3;
    private int bitField0_;
    private int canvasTag_;
    private long framesAboveThreshold_;
    private double measureTimeMs_;
    private long thresholdMs_;
    private double timeAvgMs_;
    private double timeMaxMs_;
    private double timeMinMs_;
    private long totalFrames_;

    static {
        xg xgVar = new xg();
        DEFAULT_INSTANCE = xgVar;
        com.google.v.du.registerDefaultInstance(xg.class, xgVar);
    }

    private xg() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCanvasTag() {
        this.canvasTag_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFramesAboveThreshold() {
        this.bitField0_ &= -3;
        this.framesAboveThreshold_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMeasureTimeMs() {
        this.bitField0_ &= -65;
        this.measureTimeMs_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThresholdMs() {
        this.bitField0_ &= -2;
        this.thresholdMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeAvgMs() {
        this.bitField0_ &= -9;
        this.timeAvgMs_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeMaxMs() {
        this.bitField0_ &= -33;
        this.timeMaxMs_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeMinMs() {
        this.bitField0_ &= -17;
        this.timeMinMs_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTotalFrames() {
        this.bitField0_ &= -5;
        this.totalFrames_ = 0L;
    }

    public static xg getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static xe newBuilder() {
        return (xe) DEFAULT_INSTANCE.createBuilder();
    }

    public static xg parseDelimitedFrom(InputStream inputStream) {
        return (xg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xg parseFrom(com.google.v.v vVar) {
        return (xg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<xg> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanvasTag(xf xfVar) {
        this.canvasTag_ = xfVar.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCanvasTagValue(int i2) {
        this.canvasTag_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFramesAboveThreshold(long j2) {
        this.bitField0_ |= 2;
        this.framesAboveThreshold_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMeasureTimeMs(double d2) {
        this.bitField0_ |= 64;
        this.measureTimeMs_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThresholdMs(long j2) {
        this.bitField0_ |= 1;
        this.thresholdMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeAvgMs(double d2) {
        this.bitField0_ |= 8;
        this.timeAvgMs_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeMaxMs(double d2) {
        this.bitField0_ |= 32;
        this.timeMaxMs_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeMinMs(double d2) {
        this.bitField0_ |= 16;
        this.timeMinMs_ = d2;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004\f\u0005က\u0003\u0006က\u0004\u0007က\u0005\bက\u0006", new Object[]{"bitField0_", "thresholdMs_", "framesAboveThreshold_", "totalFrames_", "canvasTag_", "timeAvgMs_", "timeMinMs_", "timeMaxMs_", "measureTimeMs_"});
        }
        if (iOrdinal == 3) {
            return new xg();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new xe(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<xg> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (xg.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public xf getCanvasTag() {
        int i2 = this.canvasTag_;
        xf xfVar = i2 != 0 ? i2 != 1 ? null : xf.MAIN_CANVAS : xf.CANVAS_TAG_UNSPECIFIED;
        return xfVar == null ? xf.UNRECOGNIZED : xfVar;
    }

    public int getCanvasTagValue() {
        return this.canvasTag_;
    }

    public long getFramesAboveThreshold() {
        return this.framesAboveThreshold_;
    }

    public double getMeasureTimeMs() {
        return this.measureTimeMs_;
    }

    public long getThresholdMs() {
        return this.thresholdMs_;
    }

    public double getTimeAvgMs() {
        return this.timeAvgMs_;
    }

    public double getTimeMaxMs() {
        return this.timeMaxMs_;
    }

    public double getTimeMinMs() {
        return this.timeMinMs_;
    }

    public long getTotalFrames() {
        return this.totalFrames_;
    }

    public boolean hasFramesAboveThreshold() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMeasureTimeMs() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasThresholdMs() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTimeAvgMs() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTimeMaxMs() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasTimeMinMs() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasTotalFrames() {
        return (this.bitField0_ & 4) != 0;
    }

    public static xe newBuilder(xg xgVar) {
        return (xe) DEFAULT_INSTANCE.createBuilder(xgVar);
    }

    public static xg parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xg) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xg parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (xg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static xg parseFrom(com.google.v.z zVar) {
        return (xg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static xg parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (xg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static xg parseFrom(InputStream inputStream) {
        return (xg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xg parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xg parseFrom(ByteBuffer byteBuffer) {
        return (xg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static xg parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (xg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static xg parseFrom(byte[] bArr) {
        return (xg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static xg parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (xg) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
