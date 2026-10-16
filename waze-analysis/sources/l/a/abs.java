package l.a;

import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes9.dex */
public final class abs extends com.google.v.du<abs, abr> implements com.google.v.fj {
    private static final abs DEFAULT_INSTANCE;
    public static final int PAGE_URL_FIELD_NUMBER = 1;
    private static volatile com.google.v.fo<abs> PARSER = null;
    public static final int URL_COUNT_FIELD_NUMBER = 2;
    public static final int WEB_VIEW_HOST_FIELD_NUMBER = 3;
    public static final int WEB_VIEW_USAGE_FIELD_NUMBER = 4;
    private int bitField0_;
    private long urlCount_;
    private String pageUrl_ = "";
    private String webViewHost_ = "";
    private String webViewUsage_ = "";

    static {
        abs absVar = new abs();
        DEFAULT_INSTANCE = absVar;
        com.google.v.du.registerDefaultInstance(abs.class, absVar);
    }

    private abs() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPageUrl() {
        this.pageUrl_ = getDefaultInstance().getPageUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUrlCount() {
        this.bitField0_ &= -2;
        this.urlCount_ = 0L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebViewHost() {
        this.webViewHost_ = getDefaultInstance().getWebViewHost();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearWebViewUsage() {
        this.webViewUsage_ = getDefaultInstance().getWebViewUsage();
    }

    public static abs getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static abr newBuilder() {
        return (abr) DEFAULT_INSTANCE.createBuilder();
    }

    public static abs parseDelimitedFrom(InputStream inputStream) {
        return (abs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static abs parseFrom(com.google.v.v vVar) {
        return (abs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static com.google.v.fo<abs> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageUrl(String str) {
        Objects.requireNonNull(str);
        this.pageUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPageUrlBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.pageUrl_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUrlCount(long j2) {
        this.bitField0_ |= 1;
        this.urlCount_ = j2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebViewHost(String str) {
        Objects.requireNonNull(str);
        this.webViewHost_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebViewHostBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.webViewHost_ = vVar.u();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebViewUsage(String str) {
        Objects.requireNonNull(str);
        this.webViewUsage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setWebViewUsageBytes(com.google.v.v vVar) {
        checkByteStringIsUtf8(vVar);
        this.webViewUsage_ = vVar.u();
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(com.google.v.dt dtVar, Object obj, Object obj2) {
        com.google.v.fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002ဂ\u0000\u0003Ȉ\u0004Ȉ", new Object[]{"bitField0_", "pageUrl_", "urlCount_", "webViewHost_", "webViewUsage_"});
        }
        if (iOrdinal == 3) {
            return new abs();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new abr(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        com.google.v.fo<abs> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (abs.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new com.google.v.dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getPageUrl() {
        return this.pageUrl_;
    }

    public com.google.v.v getPageUrlBytes() {
        return com.google.v.v.s(this.pageUrl_);
    }

    public long getUrlCount() {
        return this.urlCount_;
    }

    public String getWebViewHost() {
        return this.webViewHost_;
    }

    public com.google.v.v getWebViewHostBytes() {
        return com.google.v.v.s(this.webViewHost_);
    }

    public String getWebViewUsage() {
        return this.webViewUsage_;
    }

    public com.google.v.v getWebViewUsageBytes() {
        return com.google.v.v.s(this.webViewUsage_);
    }

    public boolean hasUrlCount() {
        return (this.bitField0_ & 1) != 0;
    }

    public static abr newBuilder(abs absVar) {
        return (abr) DEFAULT_INSTANCE.createBuilder(absVar);
    }

    public static abs parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (abs) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static abs parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (abs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static abs parseFrom(com.google.v.z zVar) {
        return (abs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static abs parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (abs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static abs parseFrom(InputStream inputStream) {
        return (abs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static abs parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (abs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static abs parseFrom(ByteBuffer byteBuffer) {
        return (abs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static abs parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (abs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static abs parseFrom(byte[] bArr) {
        return (abs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static abs parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (abs) com.google.v.du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
