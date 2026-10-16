package i.b.l;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class da extends com.google.v.du<da, cz> implements com.google.v.fj {
    public static final int COORDINATE_FIELD_NUMBER = 1;
    private static final da DEFAULT_INSTANCE;
    public static final int HORIZONTAL_ACCURACY_METERS_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<da> PARSER = null;
    public static final int TIME_EPOCH_MS_FIELD_NUMBER = 3;
    private int bitField0_;
    private i.b.r coordinate_;
    private double horizontalAccuracyMeters_;
    private long timeEpochMs_;

    static {
        da daVar = new da();
        DEFAULT_INSTANCE = daVar;
        com.google.v.du.registerDefaultInstance(da.class, daVar);
    }

    private da() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinate() {
        this.coordinate_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHorizontalAccuracyMeters() {
        this.bitField0_ &= -3;
        this.horizontalAccuracyMeters_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimeEpochMs() {
        this.bitField0_ &= -5;
        this.timeEpochMs_ = 0L;
    }

    public static da getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoordinate(i.b.r rVar) {
        Objects.requireNonNull(rVar);
        i.b.r rVar2 = this.coordinate_;
        if (rVar2 != null && rVar2 != i.b.r.getDefaultInstance()) {
            i.b.q qVarNewBuilder = i.b.r.newBuilder(rVar2);
            qVarNewBuilder.mergeFrom((i.b.q) rVar);
            rVar = qVarNewBuilder.buildPartial();
        }
        this.coordinate_ = rVar;
        this.bitField0_ |= 1;
    }

    public static cz newBuilder() {
        return (cz) DEFAULT_INSTANCE.createBuilder();
    }

    public static da parseDelimitedFrom(InputStream inputStream) {
        return (da) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static da parseFrom(com.google.v.v vVar) {
        return (da) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<da> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinate(i.b.r rVar) {
        Objects.requireNonNull(rVar);
        this.coordinate_ = rVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHorizontalAccuracyMeters(double d2) {
        this.bitField0_ |= 2;
        this.horizontalAccuracyMeters_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimeEpochMs(long j2) {
        this.bitField0_ |= 4;
        this.timeEpochMs_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002က\u0001\u0003ဂ\u0002", new Object[]{"bitField0_", "coordinate_", "horizontalAccuracyMeters_", "timeEpochMs_"});
        }
        if (iOrdinal == 3) {
            return new da();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<da> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (da.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public i.b.r getCoordinate() {
        i.b.r rVar = this.coordinate_;
        return rVar == null ? i.b.r.getDefaultInstance() : rVar;
    }

    public double getHorizontalAccuracyMeters() {
        return this.horizontalAccuracyMeters_;
    }

    public long getTimeEpochMs() {
        return this.timeEpochMs_;
    }

    public boolean hasCoordinate() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasHorizontalAccuracyMeters() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTimeEpochMs() {
        return (this.bitField0_ & 4) != 0;
    }

    public static cz newBuilder(da daVar) {
        return (cz) DEFAULT_INSTANCE.createBuilder(daVar);
    }

    public static da parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (da) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static da parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (da) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static da parseFrom(com.google.v.z zVar) {
        return (da) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static da parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (da) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static da parseFrom(InputStream inputStream) {
        return (da) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static da parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (da) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static da parseFrom(ByteBuffer byteBuffer) {
        return (da) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static da parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (da) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static da parseFrom(byte[] bArr) {
        return (da) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static da parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (da) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
