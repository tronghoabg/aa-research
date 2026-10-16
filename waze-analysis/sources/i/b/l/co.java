package i.b.l;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes8.dex */
public final class co extends com.google.v.du<co, cn> implements com.google.v.fj {
    public static final int ANALYTICS_ID_FIELD_NUMBER = 6;
    public static final int BODY_FIELD_NUMBER = 2;
    public static final int BUTTON_FIELD_NUMBER = 3;
    public static final int DEEP_LINK_FIELD_NUMBER = 4;
    private static final co DEFAULT_INSTANCE;
    public static final int HIDE_CLOSE_BUTTON_FIELD_NUMBER = 7;
    private static volatile com.google.v.fo<co> PARSER = null;
    public static final int SHOW_AS_TOAST_FIELD_NUMBER = 5;
    public static final int TERMINAL_FIELD_NUMBER = 8;
    public static final int TITLE_FIELD_NUMBER = 1;
    private int bitField0_;
    private boolean hideCloseButton_;
    private boolean showAsToast_;
    private boolean terminal_;
    private String title_ = "";
    private String body_ = "";
    private String button_ = "";
    private String deepLink_ = "";
    private String analyticsId_ = "";

    static {
        co coVar = new co();
        DEFAULT_INSTANCE = coVar;
        com.google.v.du.registerDefaultInstance(co.class, coVar);
    }

    private co() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAnalyticsId() {
        this.bitField0_ &= -33;
        this.analyticsId_ = getDefaultInstance().getAnalyticsId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBody() {
        this.bitField0_ &= -3;
        this.body_ = getDefaultInstance().getBody();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearButton() {
        this.bitField0_ &= -5;
        this.button_ = getDefaultInstance().getButton();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeepLink() {
        this.bitField0_ &= -9;
        this.deepLink_ = getDefaultInstance().getDeepLink();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHideCloseButton() {
        this.bitField0_ &= -65;
        this.hideCloseButton_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearShowAsToast() {
        this.bitField0_ &= -17;
        this.showAsToast_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTerminal() {
        this.bitField0_ &= -129;
        this.terminal_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTitle() {
        this.bitField0_ &= -2;
        this.title_ = getDefaultInstance().getTitle();
    }

    public static co getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static cn newBuilder() {
        return (cn) DEFAULT_INSTANCE.createBuilder();
    }

    public static co parseDelimitedFrom(InputStream inputStream) {
        return (co) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static co parseFrom(com.google.v.v vVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<co> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnalyticsId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 32;
        this.analyticsId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAnalyticsIdBytes(com.google.v.v vVar) {
        this.analyticsId_ = vVar.u();
        this.bitField0_ |= 32;
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
    public void setButton(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.button_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setButtonBytes(com.google.v.v vVar) {
        this.button_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeepLink(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.deepLink_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeepLinkBytes(com.google.v.v vVar) {
        this.deepLink_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHideCloseButton(boolean z) {
        this.bitField0_ |= 64;
        this.hideCloseButton_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setShowAsToast(boolean z) {
        this.bitField0_ |= 16;
        this.showAsToast_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTerminal(boolean z) {
        this.bitField0_ |= 128;
        this.terminal_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitle(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.title_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTitleBytes(com.google.v.v vVar) {
        this.title_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006ဈ\u0005\u0007ဇ\u0006\bဇ\u0007", new Object[]{"bitField0_", "title_", "body_", "button_", "deepLink_", "showAsToast_", "analyticsId_", "hideCloseButton_", "terminal_"});
        }
        if (iOrdinal == 3) {
            return new co();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new cn(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<co> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (co.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAnalyticsId() {
        return this.analyticsId_;
    }

    public com.google.v.v getAnalyticsIdBytes() {
        return com.google.v.v.s(this.analyticsId_);
    }

    public String getBody() {
        return this.body_;
    }

    public com.google.v.v getBodyBytes() {
        return com.google.v.v.s(this.body_);
    }

    public String getButton() {
        return this.button_;
    }

    public com.google.v.v getButtonBytes() {
        return com.google.v.v.s(this.button_);
    }

    public String getDeepLink() {
        return this.deepLink_;
    }

    public com.google.v.v getDeepLinkBytes() {
        return com.google.v.v.s(this.deepLink_);
    }

    public boolean getHideCloseButton() {
        return this.hideCloseButton_;
    }

    public boolean getShowAsToast() {
        return this.showAsToast_;
    }

    public boolean getTerminal() {
        return this.terminal_;
    }

    public String getTitle() {
        return this.title_;
    }

    public com.google.v.v getTitleBytes() {
        return com.google.v.v.s(this.title_);
    }

    public boolean hasAnalyticsId() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasBody() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasButton() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasDeepLink() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasHideCloseButton() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasShowAsToast() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasTerminal() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasTitle() {
        return (this.bitField0_ & 1) != 0;
    }

    public static cn newBuilder(co coVar) {
        return (cn) DEFAULT_INSTANCE.createBuilder(coVar);
    }

    public static co parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (co) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static co parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static co parseFrom(com.google.v.z zVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static co parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static co parseFrom(InputStream inputStream) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static co parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static co parseFrom(ByteBuffer byteBuffer) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static co parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static co parseFrom(byte[] bArr) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static co parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (co) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
