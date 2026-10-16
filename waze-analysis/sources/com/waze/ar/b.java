package com.waze.ar;

import androidx.camera.video.AudioStats;
import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import i.b.q;
import i.b.r;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes6.dex */
public final class b extends du<b, a> implements fj {
    public static final int ALTITUDE_FIELD_NUMBER = 3;
    public static final int ALT_FROM_NODE_FIELD_NUMBER = 9;
    public static final int ALT_SCORE_FIELD_NUMBER = 11;
    public static final int ALT_TO_NODE_FIELD_NUMBER = 10;
    public static final int AZYMUTH_FIELD_NUMBER = 4;
    public static final int COORDINATE_FIELD_NUMBER = 12;
    private static final b DEFAULT_INSTANCE;
    public static final int FROM_NODE_FIELD_NUMBER = 6;
    public static final int LATITUDE_FIELD_NUMBER = 2;
    public static final int LONGITUDE_FIELD_NUMBER = 1;
    private static volatile fo<b> PARSER = null;
    public static final int REFRESH_USERS_FIELD_NUMBER = 5;
    public static final int SCORE_FIELD_NUMBER = 8;
    public static final int TO_NODE_FIELD_NUMBER = 7;
    private long altFromNode_;
    private int altScore_;
    private long altToNode_;
    private double altitude_;
    private int azymuth_;
    private int bitField0_;
    private r coordinate_;
    private long fromNode_;
    private double latitude_;
    private double longitude_;
    private boolean refreshUsers_;
    private int score_;
    private long toNode_;

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltFromNode() {
        this.bitField0_ &= -513;
        this.altFromNode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltScore() {
        this.bitField0_ &= -2049;
        this.altScore_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltToNode() {
        this.bitField0_ &= -1025;
        this.altToNode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAltitude() {
        this.bitField0_ &= -9;
        this.altitude_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAzymuth() {
        this.bitField0_ &= -17;
        this.azymuth_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoordinate() {
        this.coordinate_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFromNode() {
        this.bitField0_ &= -65;
        this.fromNode_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLatitude() {
        this.bitField0_ &= -5;
        this.latitude_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLongitude() {
        this.bitField0_ &= -3;
        this.longitude_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRefreshUsers() {
        this.bitField0_ &= -33;
        this.refreshUsers_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScore() {
        this.bitField0_ &= -257;
        this.score_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearToNode() {
        this.bitField0_ &= -129;
        this.toNode_ = 0L;
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCoordinate(r rVar) {
        Objects.requireNonNull(rVar);
        r rVar2 = this.coordinate_;
        if (rVar2 != null && rVar2 != r.getDefaultInstance()) {
            q qVarNewBuilder = r.newBuilder(rVar2);
            qVarNewBuilder.mergeFrom((q) rVar);
            rVar = qVarNewBuilder.buildPartial();
        }
        this.coordinate_ = rVar;
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltFromNode(long j2) {
        this.bitField0_ |= 512;
        this.altFromNode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltScore(int i2) {
        this.bitField0_ |= 2048;
        this.altScore_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltToNode(long j2) {
        this.bitField0_ |= 1024;
        this.altToNode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAltitude(double d2) {
        this.bitField0_ |= 8;
        this.altitude_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAzymuth(int i2) {
        this.bitField0_ |= 16;
        this.azymuth_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoordinate(r rVar) {
        Objects.requireNonNull(rVar);
        this.coordinate_ = rVar;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFromNode(long j2) {
        this.bitField0_ |= 64;
        this.fromNode_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLatitude(double d2) {
        this.bitField0_ |= 4;
        this.latitude_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLongitude(double d2) {
        this.bitField0_ |= 2;
        this.longitude_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRefreshUsers(boolean z) {
        this.bitField0_ |= 32;
        this.refreshUsers_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScore(int i2) {
        this.bitField0_ |= 256;
        this.score_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToNode(long j2) {
        this.bitField0_ |= 128;
        this.toNode_ = j2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\f\u0000\u0001\u0001\f\f\u0000\u0000\u0000\u0001က\u0001\u0002က\u0002\u0003က\u0003\u0004င\u0004\u0005ဇ\u0005\u0006ဂ\u0006\u0007ဂ\u0007\bင\b\tဂ\t\nဂ\n\u000bင\u000b\fဉ\u0000", new Object[]{"bitField0_", "longitude_", "latitude_", "altitude_", "azymuth_", "refreshUsers_", "fromNode_", "toNode_", "score_", "altFromNode_", "altToNode_", "altScore_", "coordinate_"});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public long getAltFromNode() {
        return this.altFromNode_;
    }

    public int getAltScore() {
        return this.altScore_;
    }

    public long getAltToNode() {
        return this.altToNode_;
    }

    @Deprecated
    public double getAltitude() {
        return this.altitude_;
    }

    public int getAzymuth() {
        return this.azymuth_;
    }

    public r getCoordinate() {
        r rVar = this.coordinate_;
        return rVar == null ? r.getDefaultInstance() : rVar;
    }

    public long getFromNode() {
        return this.fromNode_;
    }

    @Deprecated
    public double getLatitude() {
        return this.latitude_;
    }

    @Deprecated
    public double getLongitude() {
        return this.longitude_;
    }

    public boolean getRefreshUsers() {
        return this.refreshUsers_;
    }

    public int getScore() {
        return this.score_;
    }

    public long getToNode() {
        return this.toNode_;
    }

    public boolean hasAltFromNode() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasAltScore() {
        return (this.bitField0_ & 2048) != 0;
    }

    public boolean hasAltToNode() {
        return (this.bitField0_ & 1024) != 0;
    }

    @Deprecated
    public boolean hasAltitude() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasAzymuth() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasCoordinate() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasFromNode() {
        return (this.bitField0_ & 64) != 0;
    }

    @Deprecated
    public boolean hasLatitude() {
        return (this.bitField0_ & 4) != 0;
    }

    @Deprecated
    public boolean hasLongitude() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRefreshUsers() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasScore() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasToNode() {
        return (this.bitField0_ & 128) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
