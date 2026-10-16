package com.google.k.a.a;

import androidx.camera.video.AudioStats;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ay extends com.google.v.du<ay, at> implements com.google.v.fj {
    private static final ay DEFAULT_INSTANCE;
    public static final int DEPRECATED_SCALE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<ay> PARSER = null;
    public static final int SCALE_FIELD_NUMBER = 3;
    public static final int TRANSLATE_FIELD_NUMBER = 2;
    private int bitField0_;
    private double dEPRECATEDScale_;
    private av scale_;
    private ax translate_;

    static {
        ay ayVar = new ay();
        DEFAULT_INSTANCE = ayVar;
        com.google.v.du.registerDefaultInstance(ay.class, ayVar);
    }

    private ay() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDEPRECATEDScale() {
        this.bitField0_ &= -2;
        this.dEPRECATEDScale_ = AudioStats.AUDIO_AMPLITUDE_NONE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScale() {
        this.scale_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTranslate() {
        this.translate_ = null;
        this.bitField0_ &= -5;
    }

    public static ay getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeScale(av avVar) {
        Objects.requireNonNull(avVar);
        av avVar2 = this.scale_;
        if (avVar2 != null && avVar2 != av.getDefaultInstance()) {
            au auVarNewBuilder = av.newBuilder(avVar2);
            auVarNewBuilder.mergeFrom((au) avVar);
            avVar = auVarNewBuilder.buildPartial();
        }
        this.scale_ = avVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeTranslate(ax axVar) {
        Objects.requireNonNull(axVar);
        ax axVar2 = this.translate_;
        if (axVar2 != null && axVar2 != ax.getDefaultInstance()) {
            aw awVarNewBuilder = ax.newBuilder(axVar2);
            awVarNewBuilder.mergeFrom((aw) axVar);
            axVar = awVarNewBuilder.buildPartial();
        }
        this.translate_ = axVar;
        this.bitField0_ |= 4;
    }

    public static at newBuilder() {
        return (at) DEFAULT_INSTANCE.createBuilder();
    }

    public static ay parseDelimitedFrom(InputStream inputStream) {
        return (ay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ay parseFrom(com.google.v.v vVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ay> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDEPRECATEDScale(double d2) {
        this.bitField0_ |= 1;
        this.dEPRECATEDScale_ = d2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScale(av avVar) {
        Objects.requireNonNull(avVar);
        this.scale_ = avVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTranslate(ax axVar) {
        Objects.requireNonNull(axVar);
        this.translate_ = axVar;
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001က\u0000\u0002ဉ\u0002\u0003ဉ\u0001", new Object[]{"bitField0_", "dEPRECATEDScale_", "translate_", "scale_"});
        }
        if (iOrdinal == 3) {
            return new ay();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new at(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<ay> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ay.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public double getDEPRECATEDScale() {
        return this.dEPRECATEDScale_;
    }

    public av getScale() {
        av avVar = this.scale_;
        return avVar == null ? av.getDefaultInstance() : avVar;
    }

    public ax getTranslate() {
        ax axVar = this.translate_;
        return axVar == null ? ax.getDefaultInstance() : axVar;
    }

    public boolean hasDEPRECATEDScale() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasScale() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTranslate() {
        return (this.bitField0_ & 4) != 0;
    }

    public static at newBuilder(ay ayVar) {
        return (at) DEFAULT_INSTANCE.createBuilder(ayVar);
    }

    public static ay parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ay parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ay parseFrom(com.google.v.z zVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ay parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ay parseFrom(InputStream inputStream) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ay parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ay parseFrom(ByteBuffer byteBuffer) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ay parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ay parseFrom(byte[] bArr) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ay parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ay) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
