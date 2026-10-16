package com.waze.bg.d;

import androidx.camera.video.AudioStats;
import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import i.b.p;
import i.b.s;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class j extends du<j, i> implements fj {
    public static final int ALT_SCORE_FIELD_NUMBER = 12;
    public static final int ALT_SEGMENT_ID_FIELD_NUMBER = 13;
    public static final int AZIMUTH_FIELD_NUMBER = 2;
    public static final int COORDINATE_FIELD_NUMBER = 1;
    private static final j DEFAULT_INSTANCE;
    public static final int IPC_AREA_ID_FIELD_NUMBER = 9;
    public static final int IPC_SERVER_ID_FIELD_NUMBER = 10;
    public static final int METRO_ID_FIELD_NUMBER = 7;
    private static volatile fo<j> PARSER = null;
    public static final int SCORE_FIELD_NUMBER = 11;
    public static final int SEGMENT_ID_FIELD_NUMBER = 3;
    public static final int SPEED_FIELD_NUMBER = 4;
    public static final int STATE_ID_FIELD_NUMBER = 8;
    public static final int TIMESTAMP_FIELD_NUMBER = 6;
    private int altScore_;
    private h altSegmentId_;
    private int azimuth_;
    private int bitField0_;
    private s coordinate_;
    private String ipcAreaId_ = "";
    private String ipcServerId_ = "";
    private int metroId_;
    private int score_;
    private h segmentId_;
    private double speed_;
    private int stateId_;
    private long timestamp_;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        du.registerDefaultInstance(j.class, jVar);
    }

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltScore() {
        this.bitField0_ &= -1025;
        this.altScore_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltSegmentId() {
        this.altSegmentId_ = null;
        this.bitField0_ &= -2049;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAzimuth() {
        this.bitField0_ &= -3;
        this.azimuth_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinate() {
        this.coordinate_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIpcAreaId() {
        this.bitField0_ &= -129;
        this.ipcAreaId_ = getDefaultInstance().getIpcAreaId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIpcServerId() {
        this.bitField0_ &= -257;
        this.ipcServerId_ = getDefaultInstance().getIpcServerId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMetroId() {
        this.bitField0_ &= -33;
        this.metroId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScore() {
        this.bitField0_ &= -513;
        this.score_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSegmentId() {
        this.segmentId_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeed() {
        this.bitField0_ &= -9;
        this.speed_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStateId() {
        this.bitField0_ &= -65;
        this.stateId_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTimestamp() {
        this.bitField0_ &= -17;
        this.timestamp_ = 0L;
    }

    public static j getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAltSegmentId(h hVar) {
        Objects.requireNonNull(hVar);
        h hVar2 = this.altSegmentId_;
        if (hVar2 != null && hVar2 != h.getDefaultInstance()) {
            g gVarNewBuilder = h.newBuilder(hVar2);
            gVarNewBuilder.mergeFrom((g) hVar);
            hVar = gVarNewBuilder.buildPartial();
        }
        this.altSegmentId_ = hVar;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoordinate(s sVar) {
        Objects.requireNonNull(sVar);
        s sVar2 = this.coordinate_;
        if (sVar2 != null && sVar2 != s.getDefaultInstance()) {
            p pVarNewBuilder = s.newBuilder(sVar2);
            pVarNewBuilder.mergeFrom((p) sVar);
            sVar = pVarNewBuilder.buildPartial();
        }
        this.coordinate_ = sVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeSegmentId(h hVar) {
        Objects.requireNonNull(hVar);
        h hVar2 = this.segmentId_;
        if (hVar2 != null && hVar2 != h.getDefaultInstance()) {
            g gVarNewBuilder = h.newBuilder(hVar2);
            gVarNewBuilder.mergeFrom((g) hVar);
            hVar = gVarNewBuilder.buildPartial();
        }
        this.segmentId_ = hVar;
        this.bitField0_ |= 4;
    }

    public static i newBuilder() {
        return (i) DEFAULT_INSTANCE.createBuilder();
    }

    public static j parseDelimitedFrom(InputStream inputStream) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(v vVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<j> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltScore(int i2) {
        this.bitField0_ |= 1024;
        this.altScore_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltSegmentId(h hVar) {
        Objects.requireNonNull(hVar);
        this.altSegmentId_ = hVar;
        this.bitField0_ |= 2048;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAzimuth(int i2) {
        this.bitField0_ |= 2;
        this.azimuth_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinate(s sVar) {
        Objects.requireNonNull(sVar);
        this.coordinate_ = sVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIpcAreaId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 128;
        this.ipcAreaId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIpcAreaIdBytes(v vVar) {
        this.ipcAreaId_ = vVar.u();
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIpcServerId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 256;
        this.ipcServerId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIpcServerIdBytes(v vVar) {
        this.ipcServerId_ = vVar.u();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMetroId(int i2) {
        this.bitField0_ |= 32;
        this.metroId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScore(int i2) {
        this.bitField0_ |= 512;
        this.score_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSegmentId(h hVar) {
        Objects.requireNonNull(hVar);
        this.segmentId_ = hVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeed(double d2) {
        this.bitField0_ |= 8;
        this.speed_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStateId(int i2) {
        this.bitField0_ |= 64;
        this.stateId_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTimestamp(long j2) {
        this.bitField0_ |= 16;
        this.timestamp_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\r\f\u0000\u0000\u0000\u0001ဉ\u0000\u0002င\u0001\u0003ဉ\u0002\u0004က\u0003\u0006ဂ\u0004\u0007င\u0005\bင\u0006\tဈ\u0007\nဈ\b\u000bင\t\fင\n\rဉ\u000b", new Object[]{"bitField0_", "coordinate_", "azimuth_", "segmentId_", "speed_", "timestamp_", "metroId_", "stateId_", "ipcAreaId_", "ipcServerId_", "score_", "altScore_", "altSegmentId_"});
        }
        if (iOrdinal == 3) {
            return new j();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new i(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<j> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (j.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public int getAltScore() {
        return this.altScore_;
    }

    public h getAltSegmentId() {
        h hVar = this.altSegmentId_;
        return hVar == null ? h.getDefaultInstance() : hVar;
    }

    public int getAzimuth() {
        return this.azimuth_;
    }

    public s getCoordinate() {
        s sVar = this.coordinate_;
        return sVar == null ? s.getDefaultInstance() : sVar;
    }

    public String getIpcAreaId() {
        return this.ipcAreaId_;
    }

    public v getIpcAreaIdBytes() {
        return v.s(this.ipcAreaId_);
    }

    public String getIpcServerId() {
        return this.ipcServerId_;
    }

    public v getIpcServerIdBytes() {
        return v.s(this.ipcServerId_);
    }

    public int getMetroId() {
        return this.metroId_;
    }

    public int getScore() {
        return this.score_;
    }

    public h getSegmentId() {
        h hVar = this.segmentId_;
        return hVar == null ? h.getDefaultInstance() : hVar;
    }

    public double getSpeed() {
        return this.speed_;
    }

    public int getStateId() {
        return this.stateId_;
    }

    public long getTimestamp() {
        return this.timestamp_;
    }

    public boolean hasAltScore() {
        return (this.bitField0_ & 1024) != 0;
    }

    public boolean hasAltSegmentId() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasAzimuth() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCoordinate() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIpcAreaId() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasIpcServerId() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasMetroId() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasScore() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasSegmentId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasSpeed() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasStateId() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasTimestamp() {
        return (this.bitField0_ & 16) != 0;
    }

    public static i newBuilder(j jVar) {
        return (i) DEFAULT_INSTANCE.createBuilder(jVar);
    }

    public static j parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(v vVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static j parseFrom(z zVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static j parseFrom(z zVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static j parseFrom(InputStream inputStream) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(InputStream inputStream, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(ByteBuffer byteBuffer) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static j parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static j parseFrom(byte[] bArr) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static j parseFrom(byte[] bArr, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
