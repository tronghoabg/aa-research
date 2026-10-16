package l.a;

import androidx.camera.video.AudioStats;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class wh extends com.google.v.du<wh, wg> implements com.google.v.fj {
    public static final int ALTERNATE_PATH_REROUTES_FIELD_NUMBER = 13;
    private static final wh DEFAULT_INSTANCE;
    public static final int MODE_ALTERNATE_PATH_SECONDS_FIELD_NUMBER = 8;
    public static final int MODE_OFF_PATH_SECONDS_FIELD_NUMBER = 5;
    public static final int MODE_ON_PATH_SECONDS_FIELD_NUMBER = 4;
    public static final int OFF_PATH_PROBABILITY_FIELD_NUMBER = 2;
    public static final int OFF_PATH_REROUTES_FIELD_NUMBER = 10;
    public static final int OFF_ROAD_REROUTES_FIELD_NUMBER = 9;
    public static final int OFF_ROAD_SECONDS_FIELD_NUMBER = 6;
    public static final int ON_PATH_PROBABILITY_FIELD_NUMBER = 1;
    public static final int ON_PATH_REROUTES_FIELD_NUMBER = 11;
    private static volatile com.google.v.fo<wh> PARSER = null;
    public static final int UNRESOLVED_PROBABILITY_FIELD_NUMBER = 3;
    public static final int UNRESOLVED_REROUTES_FIELD_NUMBER = 12;
    public static final int UNRESOLVED_SECONDS_FIELD_NUMBER = 7;
    private long alternatePathReroutes_;
    private int bitField0_;
    private double modeAlternatePathSeconds_;
    private double modeOffPathSeconds_;
    private double modeOnPathSeconds_;
    private double offPathProbability_;
    private long offPathReroutes_;
    private long offRoadReroutes_;
    private double offRoadSeconds_;
    private double onPathProbability_;
    private long onPathReroutes_;
    private double unresolvedProbability_;
    private long unresolvedReroutes_;
    private double unresolvedSeconds_;

    static {
        wh whVar = new wh();
        DEFAULT_INSTANCE = whVar;
        com.google.v.du.registerDefaultInstance(wh.class, whVar);
    }

    private wh() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternatePathReroutes() {
        this.bitField0_ &= -4097;
        this.alternatePathReroutes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModeAlternatePathSeconds() {
        this.bitField0_ &= -129;
        this.modeAlternatePathSeconds_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModeOffPathSeconds() {
        this.bitField0_ &= -17;
        this.modeOffPathSeconds_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearModeOnPathSeconds() {
        this.bitField0_ &= -9;
        this.modeOnPathSeconds_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffPathProbability() {
        this.bitField0_ &= -3;
        this.offPathProbability_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffPathReroutes() {
        this.bitField0_ &= -513;
        this.offPathReroutes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffRoadReroutes() {
        this.bitField0_ &= -257;
        this.offRoadReroutes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOffRoadSeconds() {
        this.bitField0_ &= -33;
        this.offRoadSeconds_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnPathProbability() {
        this.bitField0_ &= -2;
        this.onPathProbability_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOnPathReroutes() {
        this.bitField0_ &= -1025;
        this.onPathReroutes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnresolvedProbability() {
        this.bitField0_ &= -5;
        this.unresolvedProbability_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnresolvedReroutes() {
        this.bitField0_ &= -2049;
        this.unresolvedReroutes_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUnresolvedSeconds() {
        this.bitField0_ &= -65;
        this.unresolvedSeconds_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    public static wh getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static wg newBuilder() {
        return (wg) DEFAULT_INSTANCE.createBuilder();
    }

    public static wh parseDelimitedFrom(InputStream inputStream) {
        return (wh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static wh parseFrom(com.google.v.v vVar) {
        return (wh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<wh> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternatePathReroutes(long j2) {
        this.bitField0_ |= 4096;
        this.alternatePathReroutes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModeAlternatePathSeconds(double d2) {
        this.bitField0_ |= 128;
        this.modeAlternatePathSeconds_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModeOffPathSeconds(double d2) {
        this.bitField0_ |= 16;
        this.modeOffPathSeconds_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setModeOnPathSeconds(double d2) {
        this.bitField0_ |= 8;
        this.modeOnPathSeconds_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffPathProbability(double d2) {
        this.bitField0_ |= 2;
        this.offPathProbability_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffPathReroutes(long j2) {
        this.bitField0_ |= 512;
        this.offPathReroutes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffRoadReroutes(long j2) {
        this.bitField0_ |= 256;
        this.offRoadReroutes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOffRoadSeconds(double d2) {
        this.bitField0_ |= 32;
        this.offRoadSeconds_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnPathProbability(double d2) {
        this.bitField0_ |= 1;
        this.onPathProbability_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOnPathReroutes(long j2) {
        this.bitField0_ |= 1024;
        this.onPathReroutes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnresolvedProbability(double d2) {
        this.bitField0_ |= 4;
        this.unresolvedProbability_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnresolvedReroutes(long j2) {
        this.bitField0_ |= 2048;
        this.unresolvedReroutes_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUnresolvedSeconds(double d2) {
        this.bitField0_ |= 64;
        this.unresolvedSeconds_ = d2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\r\u0000\u0001\u0001\r\r\u0000\u0000\u0000\u0001က\u0000\u0002က\u0001\u0003က\u0002\u0004က\u0003\u0005က\u0004\u0006က\u0005\u0007က\u0006\bက\u0007\tဂ\b\nဂ\t\u000bဂ\n\fဂ\u000b\rဂ\f", new Object[]{"bitField0_", "onPathProbability_", "offPathProbability_", "unresolvedProbability_", "modeOnPathSeconds_", "modeOffPathSeconds_", "offRoadSeconds_", "unresolvedSeconds_", "modeAlternatePathSeconds_", "offRoadReroutes_", "offPathReroutes_", "onPathReroutes_", "unresolvedReroutes_", "alternatePathReroutes_"});
        }
        if (iOrdinal == 3) {
            return new wh();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new wg(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<wh> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (wh.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getAlternatePathReroutes() {
        return this.alternatePathReroutes_;
    }

    public double getModeAlternatePathSeconds() {
        return this.modeAlternatePathSeconds_;
    }

    public double getModeOffPathSeconds() {
        return this.modeOffPathSeconds_;
    }

    public double getModeOnPathSeconds() {
        return this.modeOnPathSeconds_;
    }

    public double getOffPathProbability() {
        return this.offPathProbability_;
    }

    public long getOffPathReroutes() {
        return this.offPathReroutes_;
    }

    public long getOffRoadReroutes() {
        return this.offRoadReroutes_;
    }

    public double getOffRoadSeconds() {
        return this.offRoadSeconds_;
    }

    public double getOnPathProbability() {
        return this.onPathProbability_;
    }

    public long getOnPathReroutes() {
        return this.onPathReroutes_;
    }

    public double getUnresolvedProbability() {
        return this.unresolvedProbability_;
    }

    public long getUnresolvedReroutes() {
        return this.unresolvedReroutes_;
    }

    public double getUnresolvedSeconds() {
        return this.unresolvedSeconds_;
    }

    public boolean hasAlternatePathReroutes() {
        return (this.bitField0_ & 4096) != 0;
    }

    public boolean hasModeAlternatePathSeconds() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasModeOffPathSeconds() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasModeOnPathSeconds() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasOffPathProbability() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasOffPathReroutes() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasOffRoadReroutes() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasOffRoadSeconds() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasOnPathProbability() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOnPathReroutes() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasUnresolvedProbability() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasUnresolvedReroutes() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasUnresolvedSeconds() {
        return (this.bitField0_ & 64) != 0;
    }

    public static wg newBuilder(wh whVar) {
        return (wg) DEFAULT_INSTANCE.createBuilder(whVar);
    }

    public static wh parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (wh) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static wh parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (wh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static wh parseFrom(com.google.v.z zVar) {
        return (wh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static wh parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (wh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static wh parseFrom(InputStream inputStream) {
        return (wh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static wh parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (wh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static wh parseFrom(ByteBuffer byteBuffer) {
        return (wh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static wh parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (wh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static wh parseFrom(byte[] bArr) {
        return (wh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static wh parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (wh) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
