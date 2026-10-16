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
public final class e extends du<e, c> implements fj {
    public static final int ADSPAM_ESSENTIAL_COOKIE_FIELD_NUMBER = 1;
    private static final e DEFAULT_INSTANCE;
    public static final int DISPLAY_PLATFORM_FIELD_NUMBER = 4;
    public static final int IS_CLIENT_TEST_FIELD_NUMBER = 2;
    private static volatile fo<e> PARSER = null;
    public static final int TRUSTLESS_GAIA_TOKEN_FIELD_NUMBER = 3;
    private int bitField0_;
    private int displayPlatform_;
    private boolean isClientTest_;
    private String adspamEssentialCookie_ = "";
    private String trustlessGaiaToken_ = "";

    static {
        e eVar = new e();
        DEFAULT_INSTANCE = eVar;
        du.registerDefaultInstance(e.class, eVar);
    }

    private e() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdspamEssentialCookie() {
        this.bitField0_ &= -2;
        this.adspamEssentialCookie_ = getDefaultInstance().getAdspamEssentialCookie();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayPlatform() {
        this.bitField0_ &= -9;
        this.displayPlatform_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsClientTest() {
        this.bitField0_ &= -3;
        this.isClientTest_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTrustlessGaiaToken() {
        this.bitField0_ &= -5;
        this.trustlessGaiaToken_ = getDefaultInstance().getTrustlessGaiaToken();
    }

    public static e getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static c newBuilder() {
        return (c) DEFAULT_INSTANCE.createBuilder();
    }

    public static e parseDelimitedFrom(InputStream inputStream) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(com.google.v.v vVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<e> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdspamEssentialCookie(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.adspamEssentialCookie_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdspamEssentialCookieBytes(com.google.v.v vVar) {
        this.adspamEssentialCookie_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayPlatform(d dVar) {
        this.displayPlatform_ = dVar.getNumber();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsClientTest(boolean z) {
        this.bitField0_ |= 2;
        this.isClientTest_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrustlessGaiaToken(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.trustlessGaiaToken_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTrustlessGaiaTokenBytes(com.google.v.v vVar) {
        this.trustlessGaiaToken_ = vVar.u();
        this.bitField0_ |= 4;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဇ\u0001\u0003ဈ\u0002\u0004᠌\u0003", new Object[]{"bitField0_", "adspamEssentialCookie_", "isClientTest_", "trustlessGaiaToken_", "displayPlatform_", j.f22365b});
        }
        if (iOrdinal == 3) {
            return new e();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new c(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<e> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (e.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAdspamEssentialCookie() {
        return this.adspamEssentialCookie_;
    }

    public com.google.v.v getAdspamEssentialCookieBytes() {
        return com.google.v.v.s(this.adspamEssentialCookie_);
    }

    public d getDisplayPlatform() {
        d dVarA = d.a(this.displayPlatform_);
        return dVarA == null ? d.DISPLAY_PLATFORM_UNSPECIFIED : dVarA;
    }

    public boolean getIsClientTest() {
        return this.isClientTest_;
    }

    public String getTrustlessGaiaToken() {
        return this.trustlessGaiaToken_;
    }

    public com.google.v.v getTrustlessGaiaTokenBytes() {
        return com.google.v.v.s(this.trustlessGaiaToken_);
    }

    public boolean hasAdspamEssentialCookie() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasDisplayPlatform() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIsClientTest() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasTrustlessGaiaToken() {
        return (this.bitField0_ & 4) != 0;
    }

    public static c newBuilder(e eVar) {
        return (c) DEFAULT_INSTANCE.createBuilder(eVar);
    }

    public static e parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (e) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(com.google.v.v vVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static e parseFrom(com.google.v.z zVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static e parseFrom(com.google.v.z zVar, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static e parseFrom(InputStream inputStream) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static e parseFrom(InputStream inputStream, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static e parseFrom(ByteBuffer byteBuffer) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static e parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static e parseFrom(byte[] bArr) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static e parseFrom(byte[] bArr, de deVar) {
        return (e) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
