package com.waze.copilot;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.eo;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ai extends du<ai, ah> implements fj {
    private static final ai DEFAULT_INSTANCE;
    private static volatile fo<ai> PARSER = null;
    public static final int VOICE_ASSETS_FIELD_NUMBER = 1;
    private eo<an> voiceAssets_ = emptyProtobufList();

    static {
        ai aiVar = new ai();
        DEFAULT_INSTANCE = aiVar;
        du.registerDefaultInstance(ai.class, aiVar);
    }

    private ai() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllVoiceAssets(Iterable<? extends an> iterable) {
        ensureVoiceAssetsIsMutable();
        com.google.v.c.addAll(iterable, this.voiceAssets_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVoiceAssets(int i2, an anVar) {
        Objects.requireNonNull(anVar);
        ensureVoiceAssetsIsMutable();
        this.voiceAssets_.add(i2, anVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceAssets() {
        this.voiceAssets_ = emptyProtobufList();
    }

    private void ensureVoiceAssetsIsMutable() {
        eo<an> eoVar = this.voiceAssets_;
        if (eoVar.c()) {
            return;
        }
        this.voiceAssets_ = du.mutableCopy(eoVar);
    }

    public static ai getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ah newBuilder() {
        return (ah) DEFAULT_INSTANCE.createBuilder();
    }

    public static ai parseDelimitedFrom(InputStream inputStream) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(com.google.v.v vVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ai> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeVoiceAssets(int i2) {
        ensureVoiceAssetsIsMutable();
        this.voiceAssets_.remove(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceAssets(int i2, an anVar) {
        Objects.requireNonNull(anVar);
        ensureVoiceAssetsIsMutable();
        this.voiceAssets_.set(i2, anVar);
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"voiceAssets_", an.class});
        }
        if (iOrdinal == 3) {
            return new ai();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ah(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ai> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ai.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public an getVoiceAssets(int i2) {
        return this.voiceAssets_.get(i2);
    }

    public int getVoiceAssetsCount() {
        return this.voiceAssets_.size();
    }

    public List<an> getVoiceAssetsList() {
        return this.voiceAssets_;
    }

    public ao getVoiceAssetsOrBuilder(int i2) {
        return this.voiceAssets_.get(i2);
    }

    public List<? extends ao> getVoiceAssetsOrBuilderList() {
        return this.voiceAssets_;
    }

    public static ah newBuilder(ai aiVar) {
        return (ah) DEFAULT_INSTANCE.createBuilder(aiVar);
    }

    public static ai parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (ai) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(com.google.v.v vVar, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ai parseFrom(com.google.v.z zVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ai parseFrom(com.google.v.z zVar, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addVoiceAssets(an anVar) {
        Objects.requireNonNull(anVar);
        ensureVoiceAssetsIsMutable();
        this.voiceAssets_.add(anVar);
    }

    public static ai parseFrom(InputStream inputStream) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ai parseFrom(InputStream inputStream, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ai parseFrom(ByteBuffer byteBuffer) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ai parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ai parseFrom(byte[] bArr) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ai parseFrom(byte[] bArr, de deVar) {
        return (ai) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
