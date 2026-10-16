package com.google.k.a.a.b;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class ec extends com.google.v.du<ec, eb> implements ed {
    private static final ec DEFAULT_INSTANCE;
    public static final int LANGUAGE_FIELD_NUMBER = 1;
    public static final int OFFICIAL_FIELD_NUMBER = 3;
    private static volatile com.google.v.fo<ec> PARSER = null;
    public static final int PREFERENCE_FIELD_NUMBER = 2;
    public static final int SPEAKING_PERCENT_FIELD_NUMBER = 4;
    public static final int WRITING_PERCENT_FIELD_NUMBER = 5;
    private int bitField0_;
    private boolean official_;
    private float preference_;
    private float speakingPercent_;
    private float writingPercent_;
    private byte memoizedIsInitialized = 2;
    private String language_ = "";

    static {
        ec ecVar = new ec();
        DEFAULT_INSTANCE = ecVar;
        com.google.v.du.registerDefaultInstance(ec.class, ecVar);
    }

    private ec() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLanguage() {
        this.bitField0_ &= -2;
        this.language_ = getDefaultInstance().getLanguage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOfficial() {
        this.bitField0_ &= -5;
        this.official_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPreference() {
        this.bitField0_ &= -3;
        this.preference_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpeakingPercent() {
        this.bitField0_ &= -9;
        this.speakingPercent_ = 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWritingPercent() {
        this.bitField0_ &= -17;
        this.writingPercent_ = 0.0f;
    }

    public static ec getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static eb newBuilder() {
        return (eb) DEFAULT_INSTANCE.createBuilder();
    }

    public static ec parseDelimitedFrom(InputStream inputStream) {
        return (ec) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ec parseFrom(com.google.v.v vVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<ec> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.language_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLanguageBytes(com.google.v.v vVar) {
        this.language_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOfficial(boolean z) {
        this.bitField0_ |= 4;
        this.official_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPreference(float f2) {
        this.bitField0_ |= 2;
        this.preference_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpeakingPercent(float f2) {
        this.bitField0_ |= 8;
        this.speakingPercent_ = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWritingPercent(float f2) {
        this.bitField0_ |= 16;
        this.writingPercent_ = f2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0001\u0001ᔈ\u0000\u0002ခ\u0001\u0003ဇ\u0002\u0004ခ\u0003\u0005ခ\u0004", new Object[]{"bitField0_", "language_", "preference_", "official_", "speakingPercent_", "writingPercent_"});
            case 3:
                return new ec();
            case 4:
                return new eb(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.v.fo<ec> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (ec.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public String getLanguage() {
        return this.language_;
    }

    public com.google.v.v getLanguageBytes() {
        return com.google.v.v.s(this.language_);
    }

    public boolean getOfficial() {
        return this.official_;
    }

    public float getPreference() {
        return this.preference_;
    }

    public float getSpeakingPercent() {
        return this.speakingPercent_;
    }

    public float getWritingPercent() {
        return this.writingPercent_;
    }

    public boolean hasLanguage() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasOfficial() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasPreference() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasSpeakingPercent() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasWritingPercent() {
        return (this.bitField0_ & 16) != 0;
    }

    public static eb newBuilder(ec ecVar) {
        return (eb) DEFAULT_INSTANCE.createBuilder(ecVar);
    }

    public static ec parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ec) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ec parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ec parseFrom(com.google.v.z zVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ec parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ec parseFrom(InputStream inputStream) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ec parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ec parseFrom(ByteBuffer byteBuffer) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ec parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ec parseFrom(byte[] bArr) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ec parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ec) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
