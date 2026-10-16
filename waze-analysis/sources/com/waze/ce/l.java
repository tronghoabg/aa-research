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
public final class l extends du<l, k> implements fj {
    private static final l DEFAULT_INSTANCE;
    private static volatile fo<l> PARSER = null;
    public static final int VOICE_ASSET_FIELD_NUMBER = 1;
    private int bitField0_;
    private u voiceAsset_;

    static {
        l lVar = new l();
        DEFAULT_INSTANCE = lVar;
        du.registerDefaultInstance(l.class, lVar);
    }

    private l() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVoiceAsset() {
        this.voiceAsset_ = null;
        this.bitField0_ &= -2;
    }

    public static l getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeVoiceAsset(u uVar) {
        Objects.requireNonNull(uVar);
        u uVar2 = this.voiceAsset_;
        if (uVar2 != null && uVar2 != u.getDefaultInstance()) {
            t tVarNewBuilder = u.newBuilder(uVar2);
            tVarNewBuilder.mergeFrom((t) uVar);
            uVar = tVarNewBuilder.buildPartial();
        }
        this.voiceAsset_ = uVar;
        this.bitField0_ |= 1;
    }

    public static k newBuilder() {
        return (k) DEFAULT_INSTANCE.createBuilder();
    }

    public static l parseDelimitedFrom(InputStream inputStream) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(com.google.v.v vVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<l> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVoiceAsset(u uVar) {
        Objects.requireNonNull(uVar);
        this.voiceAsset_ = uVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "voiceAsset_"});
        }
        if (iOrdinal == 3) {
            return new l();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new k(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<l> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (l.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public u getVoiceAsset() {
        u uVar = this.voiceAsset_;
        return uVar == null ? u.getDefaultInstance() : uVar;
    }

    public boolean hasVoiceAsset() {
        return (this.bitField0_ & 1) != 0;
    }

    public static k newBuilder(l lVar) {
        return (k) DEFAULT_INSTANCE.createBuilder(lVar);
    }

    public static l parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (l) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(com.google.v.v vVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static l parseFrom(com.google.v.z zVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static l parseFrom(com.google.v.z zVar, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static l parseFrom(InputStream inputStream) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static l parseFrom(InputStream inputStream, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static l parseFrom(ByteBuffer byteBuffer) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static l parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static l parseFrom(byte[] bArr) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static l parseFrom(byte[] bArr, de deVar) {
        return (l) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
