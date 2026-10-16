package com.waze.copilot;

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
/* loaded from: classes5.dex */
public final class d extends du<d, c> implements fj {
    private static final d DEFAULT_INSTANCE;
    private static volatile fo<d> PARSER = null;
    public static final int PREVIEW_AUDIO_URL_FIELD_NUMBER = 2;
    public static final int PREVIEW_IMAGE_URL_FIELD_NUMBER = 1;
    private int bitField0_;
    private String previewImageUrl_ = "";
    private String previewAudioUrl_ = "";

    static {
        d dVar = new d();
        DEFAULT_INSTANCE = dVar;
        du.registerDefaultInstance(d.class, dVar);
    }

    private d() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewAudioUrl() {
        this.bitField0_ &= -3;
        this.previewAudioUrl_ = getDefaultInstance().getPreviewAudioUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreviewImageUrl() {
        this.bitField0_ &= -2;
        this.previewImageUrl_ = getDefaultInstance().getPreviewImageUrl();
    }

    public static d getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static c newBuilder() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    public static d parseDelimitedFrom(InputStream inputStream) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(com.google.v.v vVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<d> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewAudioUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.previewAudioUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewAudioUrlBytes(com.google.v.v vVar) {
        this.previewAudioUrl_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewImageUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.previewImageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreviewImageUrlBytes(com.google.v.v vVar) {
        this.previewImageUrl_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"bitField0_", "previewImageUrl_", "previewAudioUrl_"});
        }
        if (iOrdinal == 3) {
            return new d();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new c(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<d> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (d.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getPreviewAudioUrl() {
        return this.previewAudioUrl_;
    }

    public com.google.v.v getPreviewAudioUrlBytes() {
        return com.google.v.v.s(this.previewAudioUrl_);
    }

    public String getPreviewImageUrl() {
        return this.previewImageUrl_;
    }

    public com.google.v.v getPreviewImageUrlBytes() {
        return com.google.v.v.s(this.previewImageUrl_);
    }

    public boolean hasPreviewAudioUrl() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasPreviewImageUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public static c newBuilder(d dVar) {
        return (c) DEFAULT_INSTANCE.createBuilder(dVar);
    }

    public static d parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (d) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(com.google.v.v vVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static d parseFrom(com.google.v.z zVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static d parseFrom(com.google.v.z zVar, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static d parseFrom(InputStream inputStream) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static d parseFrom(InputStream inputStream, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static d parseFrom(ByteBuffer byteBuffer) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static d parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static d parseFrom(byte[] bArr) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static d parseFrom(byte[] bArr, de deVar) {
        return (d) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
