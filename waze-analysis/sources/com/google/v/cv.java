package com.google.v;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class cv extends du<cv, cu> implements cw {
    private static final cv DEFAULT_INSTANCE;
    public static final int IS_EXTENSION_FIELD_NUMBER = 2;
    public static final int NAME_PART_FIELD_NUMBER = 1;
    private static volatile fo<cv> PARSER;
    private int bitField0_;
    private boolean isExtension_;
    private byte memoizedIsInitialized = 2;
    private String namePart_ = "";

    static {
        cv cvVar = new cv();
        DEFAULT_INSTANCE = cvVar;
        du.registerDefaultInstance(cv.class, cvVar);
    }

    private cv() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsExtension() {
        this.bitField0_ &= -3;
        this.isExtension_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNamePart() {
        this.bitField0_ &= -2;
        this.namePart_ = getDefaultInstance().getNamePart();
    }

    public static cv getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cu newBuilder() {
        return (cu) DEFAULT_INSTANCE.createBuilder();
    }

    public static cv parseDelimitedFrom(InputStream inputStream) {
        return (cv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cv parseFrom(v vVar) {
        return (cv) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cv> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsExtension(boolean z) {
        this.bitField0_ |= 2;
        this.isExtension_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNamePart(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.namePart_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNamePartBytes(v vVar) {
        this.namePart_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        byte[] bArr = null;
        switch (dtVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.memoizedIsInitialized);
            case 1:
                this.memoizedIsInitialized = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᔈ\u0000\u0002ᔇ\u0001", new Object[]{"bitField0_", "namePart_", "isExtension_"});
            case 3:
                return new cv();
            case 4:
                return new cu(bArr);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                fo<cv> foVar = PARSER;
                if (foVar != null) {
                    return foVar;
                }
                synchronized (cv.class) {
                    dnVar = PARSER;
                    if (dnVar == null) {
                        dnVar = new dn(DEFAULT_INSTANCE);
                        PARSER = dnVar;
                    }
                }
                return dnVar;
            default:
                throw null;
        }
    }

    public boolean getIsExtension() {
        return this.isExtension_;
    }

    public String getNamePart() {
        return this.namePart_;
    }

    public v getNamePartBytes() {
        return v.s(this.namePart_);
    }

    public boolean hasIsExtension() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasNamePart() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cu newBuilder(cv cvVar) {
        return (cu) DEFAULT_INSTANCE.createBuilder(cvVar);
    }

    public static cv parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (cv) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cv parseFrom(v vVar, de deVar) {
        return (cv) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cv parseFrom(z zVar) {
        return (cv) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cv parseFrom(z zVar, de deVar) {
        return (cv) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cv parseFrom(InputStream inputStream) {
        return (cv) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cv parseFrom(InputStream inputStream, de deVar) {
        return (cv) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cv parseFrom(ByteBuffer byteBuffer) {
        return (cv) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cv parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (cv) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cv parseFrom(byte[] bArr) {
        return (cv) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cv parseFrom(byte[] bArr, de deVar) {
        return (cv) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
