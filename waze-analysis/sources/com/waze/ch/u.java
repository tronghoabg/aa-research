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
public final class u extends du<u, s> implements fj {
    public static final int ADSPAM_ESSENTIAL_COOKIE_FIELD_NUMBER = 5;
    public static final int ALTERNATIVE_ROUTE_UUID_FIELD_NUMBER = 2;
    private static final u DEFAULT_INSTANCE;
    public static final int DISPLAY_PLATFORM_FIELD_NUMBER = 11;
    public static final int DISPLAY_VIEWPORT_FIELD_NUMBER = 3;
    public static final int GOOGLE_MAPS_ZOOM_LEVEL_FIELD_NUMBER = 4;
    public static final int IS_CLIENT_TEST_FIELD_NUMBER = 6;
    public static final int NAVIGATION_CACHE_TOKEN_FIELD_NUMBER = 7;
    private static volatile fo<u> PARSER = null;
    public static final int TRIGGER_REASON_FIELD_NUMBER = 10;
    public static final int USER_ADS_ATTRIBUTES_FIELD_NUMBER = 8;
    public static final int USER_POSITION_FIELD_NUMBER = 1;
    private int bitField0_;
    private int displayPlatform_;
    private i.b.x displayViewport_;
    private int googleMapsZoomLevel_;
    private boolean isClientTest_;
    private int triggerReason_;
    private ah userAdsAttributes_;
    private com.waze.bg.d.d userPosition_;
    private String alternativeRouteUuid_ = "";
    private String adspamEssentialCookie_ = "";
    private com.google.v.v navigationCacheToken_ = com.google.v.v.f13054a;

    static {
        u uVar = new u();
        DEFAULT_INSTANCE = uVar;
        du.registerDefaultInstance(u.class, uVar);
    }

    private u() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdspamEssentialCookie() {
        this.bitField0_ &= -17;
        this.adspamEssentialCookie_ = getDefaultInstance().getAdspamEssentialCookie();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAlternativeRouteUuid() {
        this.bitField0_ &= -3;
        this.alternativeRouteUuid_ = getDefaultInstance().getAlternativeRouteUuid();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayPlatform() {
        this.bitField0_ &= -513;
        this.displayPlatform_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDisplayViewport() {
        this.displayViewport_ = null;
        this.bitField0_ &= -5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleMapsZoomLevel() {
        this.bitField0_ &= -9;
        this.googleMapsZoomLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsClientTest() {
        this.bitField0_ &= -33;
        this.isClientTest_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationCacheToken() {
        this.bitField0_ &= -65;
        this.navigationCacheToken_ = getDefaultInstance().getNavigationCacheToken();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTriggerReason() {
        this.bitField0_ &= -257;
        this.triggerReason_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserAdsAttributes() {
        this.userAdsAttributes_ = null;
        this.bitField0_ &= -129;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearUserPosition() {
        this.userPosition_ = null;
        this.bitField0_ &= -2;
    }

    public static u getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeDisplayViewport(i.b.x xVar) {
        Objects.requireNonNull(xVar);
        i.b.x xVar2 = this.displayViewport_;
        if (xVar2 != null && xVar2 != i.b.x.getDefaultInstance()) {
            i.b.w wVarNewBuilder = i.b.x.newBuilder(xVar2);
            wVarNewBuilder.mergeFrom((i.b.w) xVar);
            xVar = wVarNewBuilder.buildPartial();
        }
        this.displayViewport_ = xVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserAdsAttributes(ah ahVar) {
        Objects.requireNonNull(ahVar);
        ah ahVar2 = this.userAdsAttributes_;
        if (ahVar2 != null && ahVar2 != ah.getDefaultInstance()) {
            ag agVarNewBuilder = ah.newBuilder(ahVar2);
            agVarNewBuilder.mergeFrom((ag) ahVar);
            ahVar = agVarNewBuilder.buildPartial();
        }
        this.userAdsAttributes_ = ahVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeUserPosition(com.waze.bg.d.d dVar) {
        Objects.requireNonNull(dVar);
        com.waze.bg.d.d dVar2 = this.userPosition_;
        if (dVar2 != null && dVar2 != com.waze.bg.d.d.getDefaultInstance()) {
            com.waze.bg.d.c cVarNewBuilder = com.waze.bg.d.d.newBuilder(dVar2);
            cVarNewBuilder.mergeFrom((com.waze.bg.d.c) dVar);
            dVar = cVarNewBuilder.buildPartial();
        }
        this.userPosition_ = dVar;
        this.bitField0_ |= 1;
    }

    public static s newBuilder() {
        return (s) DEFAULT_INSTANCE.createBuilder();
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
    public void setAdspamEssentialCookie(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.adspamEssentialCookie_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdspamEssentialCookieBytes(com.google.v.v vVar) {
        this.adspamEssentialCookie_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuid(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.alternativeRouteUuid_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAlternativeRouteUuidBytes(com.google.v.v vVar) {
        this.alternativeRouteUuid_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayPlatform(k kVar) {
        this.displayPlatform_ = kVar.getNumber();
        this.bitField0_ |= 512;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDisplayViewport(i.b.x xVar) {
        Objects.requireNonNull(xVar);
        this.displayViewport_ = xVar;
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleMapsZoomLevel(int i2) {
        this.bitField0_ |= 8;
        this.googleMapsZoomLevel_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsClientTest(boolean z) {
        this.bitField0_ |= 32;
        this.isClientTest_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationCacheToken(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 64;
        this.navigationCacheToken_ = vVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTriggerReason(t tVar) {
        this.triggerReason_ = tVar.getNumber();
        this.bitField0_ |= 256;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserAdsAttributes(ah ahVar) {
        Objects.requireNonNull(ahVar);
        this.userAdsAttributes_ = ahVar;
        this.bitField0_ |= 128;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setUserPosition(com.waze.bg.d.d dVar) {
        Objects.requireNonNull(dVar);
        this.userPosition_ = dVar;
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\n\u0000\u0001\u0001\u000b\n\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0003ဉ\u0002\u0004င\u0003\u0005ဈ\u0004\u0006ဇ\u0005\u0007ည\u0006\bဉ\u0007\n᠌\b\u000b᠌\t", new Object[]{"bitField0_", "userPosition_", "alternativeRouteUuid_", "displayViewport_", "googleMapsZoomLevel_", "adspamEssentialCookie_", "isClientTest_", "navigationCacheToken_", "userAdsAttributes_", "triggerReason_", j.f22369f, "displayPlatform_", j.f22364a});
        }
        if (iOrdinal == 3) {
            return new u();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new s(bArr);
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

    public String getAdspamEssentialCookie() {
        return this.adspamEssentialCookie_;
    }

    public com.google.v.v getAdspamEssentialCookieBytes() {
        return com.google.v.v.s(this.adspamEssentialCookie_);
    }

    public String getAlternativeRouteUuid() {
        return this.alternativeRouteUuid_;
    }

    public com.google.v.v getAlternativeRouteUuidBytes() {
        return com.google.v.v.s(this.alternativeRouteUuid_);
    }

    public k getDisplayPlatform() {
        k kVarA = k.a(this.displayPlatform_);
        return kVarA == null ? k.DISPLAY_PLATFORM_UNSPECIFIED : kVarA;
    }

    public i.b.x getDisplayViewport() {
        i.b.x xVar = this.displayViewport_;
        return xVar == null ? i.b.x.getDefaultInstance() : xVar;
    }

    public int getGoogleMapsZoomLevel() {
        return this.googleMapsZoomLevel_;
    }

    public boolean getIsClientTest() {
        return this.isClientTest_;
    }

    public com.google.v.v getNavigationCacheToken() {
        return this.navigationCacheToken_;
    }

    public t getTriggerReason() {
        t tVarA = t.a(this.triggerReason_);
        return tVarA == null ? t.TRIGGER_REASON_UNSPECIFIED : tVarA;
    }

    public ah getUserAdsAttributes() {
        ah ahVar = this.userAdsAttributes_;
        return ahVar == null ? ah.getDefaultInstance() : ahVar;
    }

    public com.waze.bg.d.d getUserPosition() {
        com.waze.bg.d.d dVar = this.userPosition_;
        return dVar == null ? com.waze.bg.d.d.getDefaultInstance() : dVar;
    }

    public boolean hasAdspamEssentialCookie() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasAlternativeRouteUuid() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDisplayPlatform() {
        return (this.bitField0_ & 512) != 0;
    }

    public boolean hasDisplayViewport() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasGoogleMapsZoomLevel() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasIsClientTest() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasNavigationCacheToken() {
        return (this.bitField0_ & 64) != 0;
    }

    public boolean hasTriggerReason() {
        return (this.bitField0_ & 256) != 0;
    }

    public boolean hasUserAdsAttributes() {
        return (this.bitField0_ & 128) != 0;
    }

    public boolean hasUserPosition() {
        return (this.bitField0_ & 1) != 0;
    }

    public static s newBuilder(u uVar) {
        return (s) DEFAULT_INSTANCE.createBuilder(uVar);
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
