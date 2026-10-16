package l.a;

import androidx.camera.video.AudioStats;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class xk extends com.google.v.du<xk, xj> implements com.google.v.fj {
    public static final int AVG_DISTANCE_METERS_FIELD_NUMBER = 4;
    private static final xk DEFAULT_INSTANCE;
    public static final int FIRST_IN_SESSION_FIELD_NUMBER = 6;
    public static final int MAX_DISTANCE_METERS_FIELD_NUMBER = 5;
    public static final int NAVIGATION_IN_PERIOD_FIELD_NUMBER = 7;
    public static final int NO_CRAWL_BACK_COUNT_FIELD_NUMBER = 3;
    public static final int NO_FUTURE_PATH_COUNT_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<xk> PARSER = null;
    public static final int REGULAR_COUNT_FIELD_NUMBER = 1;
    private double avgDistanceMeters_;
    private int bitField0_;
    private boolean firstInSession_;
    private double maxDistanceMeters_;
    private boolean navigationInPeriod_;
    private long noCrawlBackCount_;
    private long noFuturePathCount_;
    private long regularCount_;

    static {
        xk xkVar = new xk();
        DEFAULT_INSTANCE = xkVar;
        com.google.v.du.registerDefaultInstance(xk.class, xkVar);
    }

    private xk() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAvgDistanceMeters() {
        this.bitField0_ &= -9;
        this.avgDistanceMeters_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFirstInSession() {
        this.bitField0_ &= -33;
        this.firstInSession_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxDistanceMeters() {
        this.bitField0_ &= -17;
        this.maxDistanceMeters_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationInPeriod() {
        this.bitField0_ &= -65;
        this.navigationInPeriod_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoCrawlBackCount() {
        this.bitField0_ &= -5;
        this.noCrawlBackCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNoFuturePathCount() {
        this.bitField0_ &= -3;
        this.noFuturePathCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRegularCount() {
        this.bitField0_ &= -2;
        this.regularCount_ = 0L;
    }

    public static xk getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static xj newBuilder() {
        return (xj) DEFAULT_INSTANCE.createBuilder();
    }

    public static xk parseDelimitedFrom(InputStream inputStream) {
        return (xk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xk parseFrom(com.google.v.v vVar) {
        return (xk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<xk> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAvgDistanceMeters(double d2) {
        this.bitField0_ |= 8;
        this.avgDistanceMeters_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFirstInSession(boolean z) {
        this.bitField0_ |= 32;
        this.firstInSession_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxDistanceMeters(double d2) {
        this.bitField0_ |= 16;
        this.maxDistanceMeters_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationInPeriod(boolean z) {
        this.bitField0_ |= 64;
        this.navigationInPeriod_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoCrawlBackCount(long j2) {
        this.bitField0_ |= 4;
        this.noCrawlBackCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNoFuturePathCount(long j2) {
        this.bitField0_ |= 2;
        this.noFuturePathCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRegularCount(long j2) {
        this.bitField0_ |= 1;
        this.regularCount_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001ဂ\u0000\u0002ဂ\u0001\u0003ဂ\u0002\u0004က\u0003\u0005က\u0004\u0006ဇ\u0005\u0007ဇ\u0006", new Object[]{"bitField0_", "regularCount_", "noFuturePathCount_", "noCrawlBackCount_", "avgDistanceMeters_", "maxDistanceMeters_", "firstInSession_", "navigationInPeriod_"});
        }
        if (iOrdinal == 3) {
            return new xk();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new xj(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<xk> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (xk.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public double getAvgDistanceMeters() {
        return this.avgDistanceMeters_;
    }

    public boolean getFirstInSession() {
        return this.firstInSession_;
    }

    public double getMaxDistanceMeters() {
        return this.maxDistanceMeters_;
    }

    public boolean getNavigationInPeriod() {
        return this.navigationInPeriod_;
    }

    public long getNoCrawlBackCount() {
        return this.noCrawlBackCount_;
    }

    public long getNoFuturePathCount() {
        return this.noFuturePathCount_;
    }

    public long getRegularCount() {
        return this.regularCount_;
    }

    public boolean hasAvgDistanceMeters() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasFirstInSession() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasMaxDistanceMeters() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasNavigationInPeriod() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasNoCrawlBackCount() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasNoFuturePathCount() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRegularCount() {
        return (this.bitField0_ & 1) != 0;
    }

    public static xj newBuilder(xk xkVar) {
        return (xj) DEFAULT_INSTANCE.createBuilder(xkVar);
    }

    public static xk parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xk) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xk parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (xk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static xk parseFrom(com.google.v.z zVar) {
        return (xk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static xk parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (xk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static xk parseFrom(InputStream inputStream) {
        return (xk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static xk parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (xk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static xk parseFrom(ByteBuffer byteBuffer) {
        return (xk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static xk parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (xk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static xk parseFrom(byte[] bArr) {
        return (xk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static xk parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (xk) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
