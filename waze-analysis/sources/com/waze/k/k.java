package com.waze.k;

import com.google.v.de;
import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import com.google.v.v;
import com.google.v.z;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class k extends du<k, j> implements fj {
    public static final int CONTENT_FIELD_NUMBER = 1;
    public static final int CTA_CONTENT_FIELD_NUMBER = 2;
    public static final int DEEPLINK_FIELD_NUMBER = 3;
    private static final k DEFAULT_INSTANCE;
    public static final int IMAGE_URI_FIELD_NUMBER = 4;
    private static volatile fo<k> PARSER;
    private int bitField0_;
    private String content_ = "";
    private String ctaContent_ = "";
    private String deeplink_ = "";
    private String imageUri_ = "";

    static {
        k kVar = new k();
        DEFAULT_INSTANCE = kVar;
        du.registerDefaultInstance(k.class, kVar);
    }

    private k() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearContent() {
        this.bitField0_ &= -2;
        this.content_ = getDefaultInstance().getContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCtaContent() {
        this.bitField0_ &= -3;
        this.ctaContent_ = getDefaultInstance().getCtaContent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeeplink() {
        this.bitField0_ &= -5;
        this.deeplink_ = getDefaultInstance().getDeeplink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearImageUri() {
        this.bitField0_ &= -9;
        this.imageUri_ = getDefaultInstance().getImageUri();
    }

    public static k getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static j newBuilder() {
        return (j) DEFAULT_INSTANCE.createBuilder();
    }

    public static k parseDelimitedFrom(InputStream inputStream) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(v vVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<k> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContent(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.content_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setContentBytes(v vVar) {
        this.content_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtaContent(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.ctaContent_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCtaContentBytes(v vVar) {
        this.ctaContent_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeeplink(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.deeplink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeeplinkBytes(v vVar) {
        this.deeplink_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUri(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.imageUri_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setImageUriBytes(v vVar) {
        this.imageUri_ = vVar.u();
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "content_", "ctaContent_", "deeplink_", "imageUri_"});
        }
        if (iOrdinal == 3) {
            return new k();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new j(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<k> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (k.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getContent() {
        return this.content_;
    }

    public v getContentBytes() {
        return v.s(this.content_);
    }

    public String getCtaContent() {
        return this.ctaContent_;
    }

    public v getCtaContentBytes() {
        return v.s(this.ctaContent_);
    }

    public String getDeeplink() {
        return this.deeplink_;
    }

    public v getDeeplinkBytes() {
        return v.s(this.deeplink_);
    }

    public String getImageUri() {
        return this.imageUri_;
    }

    public v getImageUriBytes() {
        return v.s(this.imageUri_);
    }

    public boolean hasContent() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCtaContent() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDeeplink() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasImageUri() {
        return (this.bitField0_ & 8) != 0;
    }

    public static j newBuilder(k kVar) {
        return (j) DEFAULT_INSTANCE.createBuilder(kVar);
    }

    public static k parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (k) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(v vVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static k parseFrom(z zVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static k parseFrom(z zVar, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static k parseFrom(InputStream inputStream) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static k parseFrom(InputStream inputStream, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static k parseFrom(ByteBuffer byteBuffer) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static k parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static k parseFrom(byte[] bArr) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static k parseFrom(byte[] bArr, de deVar) {
        return (k) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
