package com.google.aa.a.a.a.a;

import com.google.v.dn;
import com.google.v.dt;
import com.google.v.du;
import com.google.v.fj;
import com.google.v.fo;
import j$.util.Objects;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* compiled from: WazeSource */
/* loaded from: classes5.dex */
public final class r extends du<r, q> implements fj {
    public static final int BROWSER_FIELD_NUMBER = 2;
    public static final int BROWSER_VERSION_FIELD_NUMBER = 3;
    private static final r DEFAULT_INSTANCE;
    public static final int FLASH_VERSION_FIELD_NUMBER = 4;
    public static final int LOCALE_FIELD_NUMBER = 1;
    private static volatile fo<r> PARSER;
    private int bitField0_;
    private String locale_ = "";
    private String browser_ = "";
    private String browserVersion_ = "";
    private String flashVersion_ = "";

    static {
        r rVar = new r();
        DEFAULT_INSTANCE = rVar;
        du.registerDefaultInstance(r.class, rVar);
    }

    private r() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrowser() {
        this.bitField0_ &= -3;
        this.browser_ = getDefaultInstance().getBrowser();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBrowserVersion() {
        this.bitField0_ &= -5;
        this.browserVersion_ = getDefaultInstance().getBrowserVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFlashVersion() {
        this.bitField0_ &= -9;
        this.flashVersion_ = getDefaultInstance().getFlashVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.bitField0_ &= -2;
        this.locale_ = getDefaultInstance().getLocale();
    }

    public static r getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static q newBuilder() {
        return (q) DEFAULT_INSTANCE.createBuilder();
    }

    public static r parseDelimitedFrom(InputStream inputStream) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(com.google.v.v vVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<r> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrowser(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.browser_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrowserBytes(com.google.v.v vVar) {
        this.browser_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrowserVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.browserVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrowserVersionBytes(com.google.v.v vVar) {
        this.browserVersion_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlashVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.flashVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFlashVersionBytes(com.google.v.v vVar) {
        this.flashVersion_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.locale_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocaleBytes(com.google.v.v vVar) {
        this.locale_ = vVar.u();
        this.bitField0_ |= 1;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဈ\u0003", new Object[]{"bitField0_", "locale_", "browser_", "browserVersion_", "flashVersion_"});
        }
        if (iOrdinal == 3) {
            return new r();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new q(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<r> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (r.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getBrowser() {
        return this.browser_;
    }

    public com.google.v.v getBrowserBytes() {
        return com.google.v.v.s(this.browser_);
    }

    public String getBrowserVersion() {
        return this.browserVersion_;
    }

    public com.google.v.v getBrowserVersionBytes() {
        return com.google.v.v.s(this.browserVersion_);
    }

    public String getFlashVersion() {
        return this.flashVersion_;
    }

    public com.google.v.v getFlashVersionBytes() {
        return com.google.v.v.s(this.flashVersion_);
    }

    public String getLocale() {
        return this.locale_;
    }

    public com.google.v.v getLocaleBytes() {
        return com.google.v.v.s(this.locale_);
    }

    public boolean hasBrowser() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasBrowserVersion() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasFlashVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasLocale() {
        return (this.bitField0_ & 1) != 0;
    }

    public static q newBuilder(r rVar) {
        return (q) DEFAULT_INSTANCE.createBuilder(rVar);
    }

    public static r parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (r) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static r parseFrom(com.google.v.z zVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static r parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static r parseFrom(InputStream inputStream) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static r parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static r parseFrom(ByteBuffer byteBuffer) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static r parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static r parseFrom(byte[] bArr) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static r parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (r) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
