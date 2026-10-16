package l.a;

import androidx.camera.video.AudioStats;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class ss extends com.google.v.du<ss, sr> implements com.google.v.fj {
    private static final ss DEFAULT_INSTANCE;
    public static final int DOWNLOADER_MANAGER_VERSION_FIELD_NUMBER = 7;
    public static final int FIRST_SESSION_FIELD_NUMBER = 1;
    public static final int NETWORK_VERSION_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ss> PARSER = null;
    public static final int TASKS_COUNT_FIELD_NUMBER = 4;
    public static final int TASKS_IN_QUEUE_AVG_FIELD_NUMBER = 5;
    public static final int TASKS_IN_QUEUE_MAX_FIELD_NUMBER = 6;
    public static final int TIME_IN_QUEUE_AVG_MS_FIELD_NUMBER = 11;
    public static final int TIME_IN_QUEUE_MAX_MS_FIELD_NUMBER = 12;
    public static final int TIME_SINCE_APP_STARTUP_SECONDS_FIELD_NUMBER = 8;
    public static final int TIME_SINCE_LOGIN_SECONDS_FIELD_NUMBER = 2;
    public static final int TIME_TO_COMPLETE_TASK_AVG_MS_FIELD_NUMBER = 9;
    public static final int TIME_TO_COMPLETE_TASK_MAX_MS_FIELD_NUMBER = 10;
    private int bitField0_;
    private long downloaderManagerVersion_;
    private boolean firstSession_;
    private long networkVersion_;
    private long tasksCount_;
    private double tasksInQueueAvg_;
    private long tasksInQueueMax_;
    private long timeInQueueAvgMs_;
    private long timeInQueueMaxMs_;
    private long timeSinceAppStartupSeconds_;
    private long timeSinceLoginSeconds_;
    private long timeToCompleteTaskAvgMs_;
    private long timeToCompleteTaskMaxMs_;

    static {
        ss ssVar = new ss();
        DEFAULT_INSTANCE = ssVar;
        com.google.v.du.registerDefaultInstance(ss.class, ssVar);
    }

    private ss() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDownloaderManagerVersion() {
        this.bitField0_ &= -65;
        this.downloaderManagerVersion_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstSession() {
        this.bitField0_ &= -2;
        this.firstSession_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkVersion() {
        this.bitField0_ &= -5;
        this.networkVersion_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTasksCount() {
        this.bitField0_ &= -9;
        this.tasksCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTasksInQueueAvg() {
        this.bitField0_ &= -17;
        this.tasksInQueueAvg_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTasksInQueueMax() {
        this.bitField0_ &= -33;
        this.tasksInQueueMax_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeInQueueAvgMs() {
        this.bitField0_ &= -1025;
        this.timeInQueueAvgMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeInQueueMaxMs() {
        this.bitField0_ &= -2049;
        this.timeInQueueMaxMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeSinceAppStartupSeconds() {
        this.bitField0_ &= -129;
        this.timeSinceAppStartupSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeSinceLoginSeconds() {
        this.bitField0_ &= -3;
        this.timeSinceLoginSeconds_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToCompleteTaskAvgMs() {
        this.bitField0_ &= -257;
        this.timeToCompleteTaskAvgMs_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeToCompleteTaskMaxMs() {
        this.bitField0_ &= -513;
        this.timeToCompleteTaskMaxMs_ = 0L;
    }

    public static ss getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static sr newBuilder() {
        return (sr) DEFAULT_INSTANCE.createBuilder();
    }

    public static ss parseDelimitedFrom(InputStream inputStream) {
        return (ss) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ss parseFrom(com.google.v.v vVar) {
        return (ss) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ss> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDownloaderManagerVersion(long j2) {
        this.bitField0_ |= 64;
        this.downloaderManagerVersion_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstSession(boolean z) {
        this.bitField0_ |= 1;
        this.firstSession_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkVersion(long j2) {
        this.bitField0_ |= 4;
        this.networkVersion_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTasksCount(long j2) {
        this.bitField0_ |= 8;
        this.tasksCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTasksInQueueAvg(double d2) {
        this.bitField0_ |= 16;
        this.tasksInQueueAvg_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTasksInQueueMax(long j2) {
        this.bitField0_ |= 32;
        this.tasksInQueueMax_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeInQueueAvgMs(long j2) {
        this.bitField0_ |= 1024;
        this.timeInQueueAvgMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeInQueueMaxMs(long j2) {
        this.bitField0_ |= 2048;
        this.timeInQueueMaxMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeSinceAppStartupSeconds(long j2) {
        this.bitField0_ |= 128;
        this.timeSinceAppStartupSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeSinceLoginSeconds(long j2) {
        this.bitField0_ |= 2;
        this.timeSinceLoginSeconds_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToCompleteTaskAvgMs(long j2) {
        this.bitField0_ |= 256;
        this.timeToCompleteTaskAvgMs_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeToCompleteTaskMaxMs(long j2) {
        this.bitField0_ |= 512;
        this.timeToCompleteTaskMaxMs_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001ဇ\u0000\u0002တ\u0001\u0003ဂ\u0002\u0004ဂ\u0003\u0005က\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bတ\u0007\tတ\b\nတ\t\u000bတ\n\fဂ\u000b", new Object[]{"bitField0_", "firstSession_", "timeSinceLoginSeconds_", "networkVersion_", "tasksCount_", "tasksInQueueAvg_", "tasksInQueueMax_", "downloaderManagerVersion_", "timeSinceAppStartupSeconds_", "timeToCompleteTaskAvgMs_", "timeToCompleteTaskMaxMs_", "timeInQueueAvgMs_", "timeInQueueMaxMs_"});
        }
        if (iOrdinal == 3) {
            return new ss();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new sr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ss> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ss.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getDownloaderManagerVersion() {
        return this.downloaderManagerVersion_;
    }

    public boolean getFirstSession() {
        return this.firstSession_;
    }

    public long getNetworkVersion() {
        return this.networkVersion_;
    }

    public long getTasksCount() {
        return this.tasksCount_;
    }

    public double getTasksInQueueAvg() {
        return this.tasksInQueueAvg_;
    }

    public long getTasksInQueueMax() {
        return this.tasksInQueueMax_;
    }

    public long getTimeInQueueAvgMs() {
        return this.timeInQueueAvgMs_;
    }

    public long getTimeInQueueMaxMs() {
        return this.timeInQueueMaxMs_;
    }

    public long getTimeSinceAppStartupSeconds() {
        return this.timeSinceAppStartupSeconds_;
    }

    public long getTimeSinceLoginSeconds() {
        return this.timeSinceLoginSeconds_;
    }

    public long getTimeToCompleteTaskAvgMs() {
        return this.timeToCompleteTaskAvgMs_;
    }

    public long getTimeToCompleteTaskMaxMs() {
        return this.timeToCompleteTaskMaxMs_;
    }

    public boolean hasDownloaderManagerVersion() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasFirstSession() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasNetworkVersion() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasTasksCount() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasTasksInQueueAvg() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasTasksInQueueMax() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasTimeInQueueAvgMs() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasTimeInQueueMaxMs() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasTimeSinceAppStartupSeconds() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasTimeSinceLoginSeconds() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTimeToCompleteTaskAvgMs() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasTimeToCompleteTaskMaxMs() {
        return (this.bitField0_ & 512) != 0;
    }

    public static sr newBuilder(ss ssVar) {
        return (sr) DEFAULT_INSTANCE.createBuilder(ssVar);
    }

    public static ss parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ss) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ss parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ss) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ss parseFrom(com.google.v.z zVar) {
        return (ss) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ss parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ss) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ss parseFrom(InputStream inputStream) {
        return (ss) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ss parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ss) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ss parseFrom(ByteBuffer byteBuffer) {
        return (ss) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ss parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ss) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ss parseFrom(byte[] bArr) {
        return (ss) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ss parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ss) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
