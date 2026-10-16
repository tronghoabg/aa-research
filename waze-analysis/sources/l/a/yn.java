package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class yn extends com.google.v.du<yn, ym> implements com.google.v.fj {
    public static final int BODY_FIELD_NUMBER = 2;
    public static final int CALL_TO_ACTION_FIELD_NUMBER = 3;
    public static final int CLICK_URL_FIELD_NUMBER = 5;
    private static final yn DEFAULT_INSTANCE;
    public static final int HEADLINE_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<yn> PARSER = null;
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
        yn ynVar = new yn();
        DEFAULT_INSTANCE = ynVar;
        com.google.v.du.registerDefaultInstance(yn.class, ynVar);
    }

    private yn() {
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

    public static yn getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ym newBuilder() {
        return (ym) DEFAULT_INSTANCE.createBuilder();
    }

    public static yn parseDelimitedFrom(InputStream inputStream) {
        return (yn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static yn parseFrom(com.google.v.v vVar) {
        return (yn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<yn> parser() {
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
        checkByteStringIsUtf8(vVar);
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
        checkByteStringIsUtf8(vVar);
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
        checkByteStringIsUtf8(vVar);
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
        checkByteStringIsUtf8(vVar);
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
        checkByteStringIsUtf8(vVar);
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
        checkByteStringIsUtf8(vVar);
        this.visibleUrl_ = vVar.u();
        this.bitField0_ |= 32;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001ለ\u0000\u0002ለ\u0001\u0003ለ\u0002\u0004ለ\u0003\u0005ለ\u0004\u0006ለ\u0005", new Object[]{"bitField0_", "headline_", "body_", "callToAction_", "thumbnailUrl_", "clickUrl_", "visibleUrl_"});
        }
        if (iOrdinal == 3) {
            return new yn();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ym(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<yn> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (yn.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
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

    public static ym newBuilder(yn ynVar) {
        return (ym) DEFAULT_INSTANCE.createBuilder(ynVar);
    }

    public static yn parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (yn) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static yn parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (yn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static yn parseFrom(com.google.v.z zVar) {
        return (yn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static yn parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (yn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static yn parseFrom(InputStream inputStream) {
        return (yn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static yn parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (yn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static yn parseFrom(ByteBuffer byteBuffer) {
        return (yn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static yn parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (yn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static yn parseFrom(byte[] bArr) {
        return (yn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static yn parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (yn) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
