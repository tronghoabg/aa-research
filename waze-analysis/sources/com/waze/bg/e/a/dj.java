package com.waze.bg.e.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class dj extends com.google.v.du<dj, di> implements com.google.v.fj {
    private static final dj DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<dj> PARSER;
    private int bitField0_;
    private String errorMessage_ = "";

    static {
        dj djVar = new dj();
        DEFAULT_INSTANCE = djVar;
        com.google.v.du.registerDefaultInstance(dj.class, djVar);
    }

    private dj() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorMessage() {
        this.bitField0_ &= -2;
        this.errorMessage_ = getDefaultInstance().getErrorMessage();
    }

    public static dj getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static di newBuilder() {
        return (di) DEFAULT_INSTANCE.createBuilder();
    }

    public static dj parseDelimitedFrom(InputStream inputStream) {
        return (dj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dj parseFrom(com.google.v.v vVar) {
        return (dj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<dj> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorMessage(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.errorMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorMessageBytes(com.google.v.v vVar) {
        this.errorMessage_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"bitField0_", "errorMessage_"});
        }
        if (iOrdinal == 3) {
            return new dj();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new di(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<dj> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (dj.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getErrorMessage() {
        return this.errorMessage_;
    }

    public com.google.v.v getErrorMessageBytes() {
        return com.google.v.v.s(this.errorMessage_);
    }

    public boolean hasErrorMessage() {
        return (this.bitField0_ & 1) != 0;
    }

    public static di newBuilder(dj djVar) {
        return (di) DEFAULT_INSTANCE.createBuilder(djVar);
    }

    public static dj parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dj) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dj parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (dj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static dj parseFrom(com.google.v.z zVar) {
        return (dj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static dj parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (dj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static dj parseFrom(InputStream inputStream) {
        return (dj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static dj parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (dj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static dj parseFrom(ByteBuffer byteBuffer) {
        return (dj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static dj parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (dj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static dj parseFrom(byte[] bArr) {
        return (dj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static dj parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (dj) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
