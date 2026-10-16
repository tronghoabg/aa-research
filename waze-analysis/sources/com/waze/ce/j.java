package com.waze.ce;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class j extends du<j, h> implements fj {
    private static final j DEFAULT_INSTANCE;
    private static volatile fo<j> PARSER = null;
    public static final int REROUTE_EXPLANATION_VOICE_DATA_FIELD_NUMBER = 3;
    public static final int ROUTE_INITIAL_ANNOUNCEMENT_DATA_FIELD_NUMBER = 2;
    public static final int VOICE_FIELD_NUMBER = 1;
    private int bitField0_;
    private int notificationDataCase_ = 0;
    private Object notificationData_;
    private r voice_;

    static {
        j jVar = new j();
        DEFAULT_INSTANCE = jVar;
        du.registerDefaultInstance(j.class, jVar);
    }

    private j() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNotificationData() {
        this.notificationDataCase_ = 0;
        this.notificationData_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRerouteExplanationVoiceData() {
        if (this.notificationDataCase_ == 3) {
            this.notificationDataCase_ = 0;
            this.notificationData_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRouteInitialAnnouncementData() {
        if (this.notificationDataCase_ == 2) {
            this.notificationDataCase_ = 0;
            this.notificationData_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoice() {
        this.voice_ = null;
        this.bitField0_ &= -2;
    }

    public static j getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoice(r rVar) {
        Objects.requireNonNull(rVar);
        r rVar2 = this.voice_;
        if (rVar2 != null && rVar2 != r.getDefaultInstance()) {
            q qVarNewBuilder = r.newBuilder(rVar2);
            qVarNewBuilder.mergeFrom((q) rVar);
            rVar = qVarNewBuilder.buildPartial();
        }
        this.voice_ = rVar;
        this.bitField0_ |= 1;
    }

    public static h newBuilder() {
        return (h) DEFAULT_INSTANCE.createBuilder();
    }

    public static j parseDelimitedFrom(InputStream inputStream) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static j parseFrom(com.google.v.v vVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<j> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRerouteExplanationVoiceData(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.notificationDataCase_ = 3;
        this.notificationData_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRouteInitialAnnouncementData(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.notificationDataCase_ = 2;
        this.notificationData_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoice(r rVar) {
        Objects.requireNonNull(rVar);
        this.voice_ = rVar;
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဉ\u0000\u0002=\u0000\u0003=\u0000", new Object[]{"notificationData_", "notificationDataCase_", "bitField0_", "voice_"});
        }
        if (iOrdinal == 3) {
            return new j();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new h(bArr);
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

    public i getNotificationDataCase() {
        int i2 = this.notificationDataCase_;
        if (i2 == 0) {
            return i.f22164c;
        }
        if (i2 == 2) {
            return i.f22162a;
        }
        if (i2 != 3) {
            return null;
        }
        return i.f22163b;
    }

    public com.google.v.v getRerouteExplanationVoiceData() {
        return this.notificationDataCase_ == 3 ? (com.google.v.v) this.notificationData_ : com.google.v.v.f13054a;
    }

    public com.google.v.v getRouteInitialAnnouncementData() {
        return this.notificationDataCase_ == 2 ? (com.google.v.v) this.notificationData_ : com.google.v.v.f13054a;
    }

    public r getVoice() {
        r rVar = this.voice_;
        return rVar == null ? r.getDefaultInstance() : rVar;
    }

    public boolean hasRerouteExplanationVoiceData() {
        return this.notificationDataCase_ == 3;
    }

    public boolean hasRouteInitialAnnouncementData() {
        return this.notificationDataCase_ == 2;
    }

    public boolean hasVoice() {
        return (this.bitField0_ & 1) != 0;
    }

    public static h newBuilder(j jVar) {
        return (h) DEFAULT_INSTANCE.createBuilder(jVar);
    }

    public static j parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (j) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static j parseFrom(com.google.v.v vVar, de deVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static j parseFrom(com.google.v.z zVar) {
        return (j) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static j parseFrom(com.google.v.z zVar, de deVar) {
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
