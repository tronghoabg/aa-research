package com.waze.ce;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes7.dex */
public final class u extends du<u, t> implements v {
    private static final u DEFAULT_INSTANCE;
    private static volatile fo<u> PARSER = null;
    public static final int TEXT_FIELD_NUMBER = 1;
    public static final int URL_FIELD_NUMBER = 2;
    private int bitField0_;
    private String text_ = "";
    private String url_ = "";

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        du.registerDefaultInstance(u.class, uVar);
    }

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearText() {
        this.bitField0_ &= -2;
        this.text_ = getDefaultInstance().getText();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrl() {
        this.bitField0_ &= -3;
        this.url_ = getDefaultInstance().getUrl();
    }

    public static u getDefaultInstance() {
        return DEFAULT_INSTANCE;
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
    public void setText(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.text_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTextBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.text_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.url_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.url_ = vVar.u();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001", new Object[]{"bitField0_", "text_", "url_"});
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

    public String getText() {
        return this.text_;
    }

    public com.google.v.v getTextBytes() {
        return com.google.v.v.s(this.text_);
    }

    public String getUrl() {
        return this.url_;
    }

    public com.google.v.v getUrlBytes() {
        return com.google.v.v.s(this.url_);
    }

    public boolean hasText() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasUrl() {
        return (this.bitField0_ & 2) != 0;
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
