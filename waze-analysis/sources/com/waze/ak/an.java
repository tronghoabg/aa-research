package com.waze.ak;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class an extends du<an, al> implements ao {
    private static final an DEFAULT_INSTANCE;
    public static final int INCLUDE_IN_VOICE_INSTRUCTIONS_FIELD_NUMBER = 3;
    private static volatile fo<an> PARSER = null;
    public static final int RENDER_ON_MAP_FIELD_NUMBER = 2;
    public static final int TRAFFIC_LIGHT_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean includeInVoiceInstructions_;
    private int landmarkCase_ = 0;
    private Object landmark_;
    private boolean renderOnMap_;

    static {
        an anVar = new an();
        DEFAULT_INSTANCE = anVar;
        du.registerDefaultInstance(an.class, anVar);
    }

    private an() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIncludeInVoiceInstructions() {
        this.bitField0_ &= -3;
        this.includeInVoiceInstructions_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLandmark() {
        this.landmarkCase_ = 0;
        this.landmark_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRenderOnMap() {
        this.bitField0_ &= -2;
        this.renderOnMap_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrafficLight() {
        if (this.landmarkCase_ == 1) {
            this.landmarkCase_ = 0;
            this.landmark_ = null;
        }
    }

    public static an getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTrafficLight(ar arVar) {
        Objects.requireNonNull(arVar);
        if (this.landmarkCase_ == 1 && this.landmark_ != ar.getDefaultInstance()) {
            ap apVarNewBuilder = ar.newBuilder((ar) this.landmark_);
            apVarNewBuilder.mergeFrom((ap) arVar);
            arVar = apVarNewBuilder.buildPartial();
        }
        this.landmark_ = arVar;
        this.landmarkCase_ = 1;
    }

    public static al newBuilder() {
        return (al) DEFAULT_INSTANCE.createBuilder();
    }

    public static an parseDelimitedFrom(InputStream inputStream) {
        return (an) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static an parseFrom(com.google.v.v vVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<an> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIncludeInVoiceInstructions(boolean z) {
        this.bitField0_ |= 2;
        this.includeInVoiceInstructions_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRenderOnMap(boolean z) {
        this.bitField0_ |= 1;
        this.renderOnMap_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrafficLight(ar arVar) {
        Objects.requireNonNull(arVar);
        this.landmark_ = arVar;
        this.landmarkCase_ = 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001<\u0000\u0002ဇ\u0000\u0003ဇ\u0001", new Object[]{"landmark_", "landmarkCase_", "bitField0_", ar.class, "renderOnMap_", "includeInVoiceInstructions_"});
        }
        if (iOrdinal == 3) {
            return new an();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new al(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<an> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (an.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public boolean getIncludeInVoiceInstructions() {
        return this.includeInVoiceInstructions_;
    }

    public am getLandmarkCase() {
        int i2 = this.landmarkCase_;
        if (i2 == 0) {
            return am.f14094b;
        }
        if (i2 != 1) {
            return null;
        }
        return am.f14093a;
    }

    public boolean getRenderOnMap() {
        return this.renderOnMap_;
    }

    public ar getTrafficLight() {
        return this.landmarkCase_ == 1 ? (ar) this.landmark_ : ar.getDefaultInstance();
    }

    public boolean hasIncludeInVoiceInstructions() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasRenderOnMap() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTrafficLight() {
        return this.landmarkCase_ == 1;
    }

    public static al newBuilder(an anVar) {
        return (al) DEFAULT_INSTANCE.createBuilder(anVar);
    }

    public static an parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (an) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static an parseFrom(com.google.v.v vVar, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static an parseFrom(com.google.v.z zVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static an parseFrom(com.google.v.z zVar, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static an parseFrom(InputStream inputStream) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static an parseFrom(InputStream inputStream, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static an parseFrom(ByteBuffer byteBuffer) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static an parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static an parseFrom(byte[] bArr) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static an parseFrom(byte[] bArr, de deVar) {
        return (an) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
