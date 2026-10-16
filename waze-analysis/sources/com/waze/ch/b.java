package com.waze.ch;

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
public final class b extends du<b, a> implements fj {
    public static final int BODY_FIELD_NUMBER = 2;
    public static final int CALL_TO_ACTION_FIELD_NUMBER = 3;
    public static final int CLICK_URL_FIELD_NUMBER = 5;
    private static final b DEFAULT_INSTANCE;
    public static final int HEADLINE_FIELD_NUMBER = 1;
    private static volatile fo<b> PARSER = null;
    public static final int THUMBNAIL_URL_FIELD_NUMBER = 4;
    public static final int VISIBLE_URL_FIELD_NUMBER = 6;
    private int bitField0_;
    private String headline_ = "";
    private String body_ = "";
    private String callToAction_ = "";
    private String thumbnailUrl_ = "";
    private String clickUrl_ = "";
    private String visibleUrl_ = "";

    static {
        b bVar = new b();
        DEFAULT_INSTANCE = bVar;
        du.registerDefaultInstance(b.class, bVar);
    }

    private b() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBody() {
        this.bitField0_ &= -3;
        this.body_ = getDefaultInstance().getBody();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCallToAction() {
        this.bitField0_ &= -5;
        this.callToAction_ = getDefaultInstance().getCallToAction();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearClickUrl() {
        this.bitField0_ &= -17;
        this.clickUrl_ = getDefaultInstance().getClickUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeadline() {
        this.bitField0_ &= -2;
        this.headline_ = getDefaultInstance().getHeadline();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearThumbnailUrl() {
        this.bitField0_ &= -9;
        this.thumbnailUrl_ = getDefaultInstance().getThumbnailUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVisibleUrl() {
        this.bitField0_ &= -33;
        this.visibleUrl_ = getDefaultInstance().getVisibleUrl();
    }

    public static b getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static a newBuilder() {
        return (a) DEFAULT_INSTANCE.createBuilder();
    }

    public static b parseDelimitedFrom(InputStream inputStream) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(com.google.v.v vVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<b> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBody(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.body_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBodyBytes(com.google.v.v vVar) {
        this.body_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallToAction(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.callToAction_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCallToActionBytes(com.google.v.v vVar) {
        this.callToAction_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.clickUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setClickUrlBytes(com.google.v.v vVar) {
        this.clickUrl_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeadline(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.headline_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeadlineBytes(com.google.v.v vVar) {
        this.headline_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThumbnailUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.thumbnailUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setThumbnailUrlBytes(com.google.v.v vVar) {
        this.thumbnailUrl_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisibleUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.visibleUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVisibleUrlBytes(com.google.v.v vVar) {
        this.visibleUrl_ = vVar.u();
        this.bitField0_ |= 32;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဈ\u0005", new Object[]{"bitField0_", "headline_", "body_", "callToAction_", "thumbnailUrl_", "clickUrl_", "visibleUrl_"});
        }
        if (iOrdinal == 3) {
            return new b();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new a(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<b> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (b.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getBody() {
        return this.body_;
    }

    public com.google.v.v getBodyBytes() {
        return com.google.v.v.s(this.body_);
    }

    public String getCallToAction() {
        return this.callToAction_;
    }

    public com.google.v.v getCallToActionBytes() {
        return com.google.v.v.s(this.callToAction_);
    }

    public String getClickUrl() {
        return this.clickUrl_;
    }

    public com.google.v.v getClickUrlBytes() {
        return com.google.v.v.s(this.clickUrl_);
    }

    public String getHeadline() {
        return this.headline_;
    }

    public com.google.v.v getHeadlineBytes() {
        return com.google.v.v.s(this.headline_);
    }

    public String getThumbnailUrl() {
        return this.thumbnailUrl_;
    }

    public com.google.v.v getThumbnailUrlBytes() {
        return com.google.v.v.s(this.thumbnailUrl_);
    }

    public String getVisibleUrl() {
        return this.visibleUrl_;
    }

    public com.google.v.v getVisibleUrlBytes() {
        return com.google.v.v.s(this.visibleUrl_);
    }

    public boolean hasBody() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasCallToAction() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasClickUrl() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasHeadline() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasThumbnailUrl() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasVisibleUrl() {
        return (this.bitField0_ & 32) != 0;
    }

    public static a newBuilder(b bVar) {
        return (a) DEFAULT_INSTANCE.createBuilder(bVar);
    }

    public static b parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (b) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(com.google.v.v vVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static b parseFrom(com.google.v.z zVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static b parseFrom(com.google.v.z zVar, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static b parseFrom(InputStream inputStream) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static b parseFrom(InputStream inputStream, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static b parseFrom(ByteBuffer byteBuffer) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static b parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static b parseFrom(byte[] bArr) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static b parseFrom(byte[] bArr, de deVar) {
        return (b) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
