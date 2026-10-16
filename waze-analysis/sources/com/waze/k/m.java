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
public final class m extends du<m, l> implements fj {
    public static final int CONTENT_FIELD_NUMBER = 1;
    public static final int CTA_CONTENT_FIELD_NUMBER = 2;
    public static final int DEEPLINK_FIELD_NUMBER = 3;
    private static final m DEFAULT_INSTANCE;
    public static final int IMAGE_URI_FIELD_NUMBER = 4;
    private static volatile fo<m> PARSER;
    private int bitField0_;
    private String content_ = "";
    private String ctaContent_ = "";
    private String deeplink_ = "";
    private String imageUri_ = "";

    static {
        m mVar = new m();
        DEFAULT_INSTANCE = mVar;
        du.registerDefaultInstance(m.class, mVar);
    }

    private m() {
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

    public static m getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static l newBuilder() {
        return (l) DEFAULT_INSTANCE.createBuilder();
    }

    public static m parseDelimitedFrom(InputStream inputStream) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(v vVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<m> parser() {
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
            return new m();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new l(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<m> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (m.class) {
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

    public static l newBuilder(m mVar) {
        return (l) DEFAULT_INSTANCE.createBuilder(mVar);
    }

    public static m parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (m) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(v vVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static m parseFrom(z zVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static m parseFrom(z zVar, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static m parseFrom(InputStream inputStream) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static m parseFrom(InputStream inputStream, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static m parseFrom(ByteBuffer byteBuffer) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static m parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static m parseFrom(byte[] bArr) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static m parseFrom(byte[] bArr, de deVar) {
        return (m) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
