package com.waze.copilot;

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
public final class u extends du<u, t> implements v {
    public static final int CAR_FIELD_NUMBER = 4;
    private static final u DEFAULT_INSTANCE;
    public static final int IS_FALLBACK_FIELD_NUMBER = 5;
    public static final int MOOD_FIELD_NUMBER = 2;
    private static volatile fo<u> PARSER = null;
    public static final int STATUS_FIELD_NUMBER = 1;
    public static final int VOICE_FIELD_NUMBER = 3;
    private int assetCase_ = 0;
    private Object asset_;
    private int bitField0_;
    private boolean isFallback_;
    private int status_;

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        du.registerDefaultInstance(u.class, uVar);
    }

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAsset() {
        this.assetCase_ = 0;
        this.asset_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCar() {
        if (this.assetCase_ == 4) {
            this.assetCase_ = 0;
            this.asset_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsFallback() {
        this.bitField0_ &= -3;
        this.isFallback_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMood() {
        if (this.assetCase_ == 2) {
            this.assetCase_ = 0;
            this.asset_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStatus() {
        this.bitField0_ &= -2;
        this.status_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoice() {
        if (this.assetCase_ == 3) {
            this.assetCase_ = 0;
            this.asset_ = null;
        }
    }

    public static u getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeCar(j jVar) {
        Objects.requireNonNull(jVar);
        if (this.assetCase_ == 4 && this.asset_ != j.getDefaultInstance()) {
            i iVarNewBuilder = j.newBuilder((j) this.asset_);
            iVarNewBuilder.mergeFrom((i) jVar);
            jVar = iVarNewBuilder.buildPartial();
        }
        this.asset_ = jVar;
        this.assetCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMood(al alVar) {
        Objects.requireNonNull(alVar);
        if (this.assetCase_ == 2 && this.asset_ != al.getDefaultInstance()) {
            ak akVarNewBuilder = al.newBuilder((al) this.asset_);
            akVarNewBuilder.mergeFrom((ak) alVar);
            alVar = akVarNewBuilder.buildPartial();
        }
        this.asset_ = alVar;
        this.assetCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoice(an anVar) {
        Objects.requireNonNull(anVar);
        if (this.assetCase_ == 3 && this.asset_ != an.getDefaultInstance()) {
            am amVarNewBuilder = an.newBuilder((an) this.asset_);
            amVarNewBuilder.mergeFrom((am) anVar);
            anVar = amVarNewBuilder.buildPartial();
        }
        this.asset_ = anVar;
        this.assetCase_ = 3;
    }

    public static t newBuilder() {
        return (t) DEFAULT_INSTANCE.createBuilder();
    }

    public static u parseDelimitedFrom(InputStream inputStream) {
        return (u) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static u parseFrom(com.google.v.v vVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<u> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCar(j jVar) {
        Objects.requireNonNull(jVar);
        this.asset_ = jVar;
        this.assetCase_ = 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsFallback(boolean z) {
        this.bitField0_ |= 2;
        this.isFallback_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMood(al alVar) {
        Objects.requireNonNull(alVar);
        this.asset_ = alVar;
        this.assetCase_ = 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStatus(aj ajVar) {
        this.status_ = ajVar.getNumber();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoice(an anVar) {
        Objects.requireNonNull(anVar);
        this.asset_ = anVar;
        this.assetCase_ = 3;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0001\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001᠌\u0000\u0002<\u0000\u0003<\u0000\u0004<\u0000\u0005ဇ\u0001", new Object[]{"asset_", "assetCase_", "bitField0_", "status_", ap.f22897b, al.class, an.class, j.class, "isFallback_"});
        }
        if (iOrdinal == 3) {
            return new u();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new t(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<u> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (u.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public s getAssetCase() {
        int i2 = this.assetCase_;
        if (i2 == 0) {
            return s.f23168d;
        }
        if (i2 == 2) {
            return s.f23165a;
        }
        if (i2 == 3) {
            return s.f23166b;
        }
        if (i2 != 4) {
            return null;
        }
        return s.f23167c;
    }

    public j getCar() {
        return this.assetCase_ == 4 ? (j) this.asset_ : j.getDefaultInstance();
    }

    public boolean getIsFallback() {
        return this.isFallback_;
    }

    public al getMood() {
        return this.assetCase_ == 2 ? (al) this.asset_ : al.getDefaultInstance();
    }

    public aj getStatus() {
        aj ajVarA = aj.a(this.status_);
        return ajVarA == null ? aj.STATUS_UNSPECIFIED : ajVarA;
    }

    public an getVoice() {
        return this.assetCase_ == 3 ? (an) this.asset_ : an.getDefaultInstance();
    }

    public boolean hasCar() {
        return this.assetCase_ == 4;
    }

    public boolean hasIsFallback() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMood() {
        return this.assetCase_ == 2;
    }

    public boolean hasStatus() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasVoice() {
        return this.assetCase_ == 3;
    }

    public static t newBuilder(u uVar) {
        return (t) DEFAULT_INSTANCE.createBuilder(uVar);
    }

    public static u parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (u) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static u parseFrom(com.google.v.v vVar, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static u parseFrom(com.google.v.z zVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static u parseFrom(com.google.v.z zVar, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static u parseFrom(InputStream inputStream) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static u parseFrom(InputStream inputStream, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static u parseFrom(ByteBuffer byteBuffer) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static u parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static u parseFrom(byte[] bArr) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static u parseFrom(byte[] bArr, de deVar) {
        return (u) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
