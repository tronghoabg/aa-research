package com.google.k.a.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class is extends com.google.v.du<is, io> implements it {
    private static final is DEFAULT_INSTANCE;
    public static final int GOOGLE_URL_FIELD_NUMBER = 1;
    public static final int MEDIA_FORMAT_FIELD_NUMBER = 3;
    public static final int MEDIA_KEY_FIELD_NUMBER = 4;
    public static final int MEDIA_SIZE_FIELD_NUMBER = 2;
    private static volatile com.google.v.fo<is> PARSER;
    private int bitField0_;
    private int mediaFormat_;
    private ir mediaSize_;
    private String googleUrl_ = "";
    private String mediaKey_ = "";

    static {
        is isVar = new is();
        DEFAULT_INSTANCE = isVar;
        com.google.v.du.registerDefaultInstance(is.class, isVar);
    }

    private is() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleUrl() {
        this.bitField0_ &= -2;
        this.googleUrl_ = getDefaultInstance().getGoogleUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediaFormat() {
        this.bitField0_ &= -9;
        this.mediaFormat_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediaKey() {
        this.bitField0_ &= -3;
        this.mediaKey_ = getDefaultInstance().getMediaKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMediaSize() {
        this.mediaSize_ = null;
        this.bitField0_ &= -5;
    }

    public static is getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMediaSize(ir irVar) {
        Objects.requireNonNull(irVar);
        ir irVar2 = this.mediaSize_;
        if (irVar2 != null && irVar2 != ir.getDefaultInstance()) {
            iq iqVarNewBuilder = ir.newBuilder(irVar2);
            iqVarNewBuilder.mergeFrom((iq) irVar);
            irVar = iqVarNewBuilder.buildPartial();
        }
        this.mediaSize_ = irVar;
        this.bitField0_ |= 4;
    }

    public static io newBuilder() {
        return (io) DEFAULT_INSTANCE.createBuilder();
    }

    public static is parseDelimitedFrom(InputStream inputStream) {
        return (is) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static is parseFrom(com.google.v.v vVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<is> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.googleUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleUrlBytes(com.google.v.v vVar) {
        this.googleUrl_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaFormat(ip ipVar) {
        this.mediaFormat_ = ipVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaKey(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.mediaKey_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaKeyBytes(com.google.v.v vVar) {
        this.mediaKey_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediaSize(ir irVar) {
        Objects.requireNonNull(irVar);
        this.mediaSize_ = irVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဉ\u0002\u0003᠌\u0003\u0004ဈ\u0001", new Object[]{"bitField0_", "googleUrl_", "mediaSize_", "mediaFormat_", ha.f11895l, "mediaKey_"});
        }
        if (iOrdinal == 3) {
            return new is();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new io(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<is> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (is.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getGoogleUrl() {
        return this.googleUrl_;
    }

    public com.google.v.v getGoogleUrlBytes() {
        return com.google.v.v.s(this.googleUrl_);
    }

    public ip getMediaFormat() {
        ip ipVarA = ip.a(this.mediaFormat_);
        return ipVarA == null ? ip.MEDIA_FORMAT_UNSPECIFIED : ipVarA;
    }

    public String getMediaKey() {
        return this.mediaKey_;
    }

    public com.google.v.v getMediaKeyBytes() {
        return com.google.v.v.s(this.mediaKey_);
    }

    public ir getMediaSize() {
        ir irVar = this.mediaSize_;
        return irVar == null ? ir.getDefaultInstance() : irVar;
    }

    public boolean hasGoogleUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMediaFormat() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasMediaKey() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMediaSize() {
        return (this.bitField0_ & 4) != 0;
    }

    public static io newBuilder(is isVar) {
        return (io) DEFAULT_INSTANCE.createBuilder(isVar);
    }

    public static is parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (is) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static is parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static is parseFrom(com.google.v.z zVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static is parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static is parseFrom(InputStream inputStream) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static is parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static is parseFrom(ByteBuffer byteBuffer) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static is parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static is parseFrom(byte[] bArr) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static is parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (is) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
