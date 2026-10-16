package com.waze.ch;

import com.google.v.da;
import com.google.v.db;
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
public final class af extends du<af, ae> implements fj {
    public static final int ADSPAM_ESSENTIAL_COOKIE_FIELD_NUMBER = 4;
    public static final int AD_VIEW_DELAY_FIELD_NUMBER = 2;
    private static final af DEFAULT_INSTANCE;
    public static final int GOOGLE_MAPS_ZOOM_LEVEL_FIELD_NUMBER = 1;
    public static final int IS_INVISIBLE_FIELD_NUMBER = 5;
    public static final int MAX_CONCURRENT_PINS_FIELD_NUMBER = 6;
    public static final int NAVIGATION_CACHE_TOKEN_FIELD_NUMBER = 3;
    private static volatile fo<af> PARSER;
    private db adViewDelay_;
    private int bitField0_;
    private int googleMapsZoomLevel_;
    private boolean isInvisible_;
    private int maxConcurrentPins_;
    private com.google.v.v navigationCacheToken_ = com.google.v.v.f13054a;
    private String adspamEssentialCookie_ = "";

    static {
        af afVar = new af();
        DEFAULT_INSTANCE = afVar;
        du.registerDefaultInstance(af.class, afVar);
    }

    private af() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdViewDelay() {
        this.adViewDelay_ = null;
        this.bitField0_ &= -3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdspamEssentialCookie() {
        this.bitField0_ &= -9;
        this.adspamEssentialCookie_ = getDefaultInstance().getAdspamEssentialCookie();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearGoogleMapsZoomLevel() {
        this.bitField0_ &= -2;
        this.googleMapsZoomLevel_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIsInvisible() {
        this.bitField0_ &= -17;
        this.isInvisible_ = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMaxConcurrentPins() {
        this.bitField0_ &= -33;
        this.maxConcurrentPins_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNavigationCacheToken() {
        this.bitField0_ &= -5;
        this.navigationCacheToken_ = getDefaultInstance().getNavigationCacheToken();
    }

    public static af getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeAdViewDelay(db dbVar) {
        Objects.requireNonNull(dbVar);
        db dbVar2 = this.adViewDelay_;
        if (dbVar2 != null && dbVar2 != db.getDefaultInstance()) {
            da daVarNewBuilder = db.newBuilder(dbVar2);
            daVarNewBuilder.mergeFrom((da) dbVar);
            dbVar = daVarNewBuilder.buildPartial();
        }
        this.adViewDelay_ = dbVar;
        this.bitField0_ |= 2;
    }

    public static ae newBuilder() {
        return (ae) DEFAULT_INSTANCE.createBuilder();
    }

    public static af parseDelimitedFrom(InputStream inputStream) {
        return (af) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static af parseFrom(com.google.v.v vVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<af> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdViewDelay(db dbVar) {
        Objects.requireNonNull(dbVar);
        this.adViewDelay_ = dbVar;
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdspamEssentialCookie(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.adspamEssentialCookie_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdspamEssentialCookieBytes(com.google.v.v vVar) {
        this.adspamEssentialCookie_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setGoogleMapsZoomLevel(int i2) {
        this.bitField0_ |= 1;
        this.googleMapsZoomLevel_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsInvisible(boolean z) {
        this.bitField0_ |= 16;
        this.isInvisible_ = z;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMaxConcurrentPins(int i2) {
        this.bitField0_ |= 32;
        this.maxConcurrentPins_ = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNavigationCacheToken(com.google.v.v vVar) {
        Objects.requireNonNull(vVar);
        this.bitField0_ |= 4;
        this.navigationCacheToken_ = vVar;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001င\u0000\u0002ဉ\u0001\u0003ည\u0002\u0004ဈ\u0003\u0005ဇ\u0004\u0006င\u0005", new Object[]{"bitField0_", "googleMapsZoomLevel_", "adViewDelay_", "navigationCacheToken_", "adspamEssentialCookie_", "isInvisible_", "maxConcurrentPins_"});
        }
        if (iOrdinal == 3) {
            return new af();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ae(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<af> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (af.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public db getAdViewDelay() {
        db dbVar = this.adViewDelay_;
        return dbVar == null ? db.getDefaultInstance() : dbVar;
    }

    public String getAdspamEssentialCookie() {
        return this.adspamEssentialCookie_;
    }

    public com.google.v.v getAdspamEssentialCookieBytes() {
        return com.google.v.v.s(this.adspamEssentialCookie_);
    }

    public int getGoogleMapsZoomLevel() {
        return this.googleMapsZoomLevel_;
    }

    public boolean getIsInvisible() {
        return this.isInvisible_;
    }

    public int getMaxConcurrentPins() {
        return this.maxConcurrentPins_;
    }

    public com.google.v.v getNavigationCacheToken() {
        return this.navigationCacheToken_;
    }

    public boolean hasAdViewDelay() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasAdspamEssentialCookie() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasGoogleMapsZoomLevel() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasIsInvisible() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasMaxConcurrentPins() {
        return (this.bitField0_ & 32) != 0;
    }

    public boolean hasNavigationCacheToken() {
        return (this.bitField0_ & 4) != 0;
    }

    public static ae newBuilder(af afVar) {
        return (ae) DEFAULT_INSTANCE.createBuilder(afVar);
    }

    public static af parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (af) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static af parseFrom(com.google.v.v vVar, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static af parseFrom(com.google.v.z zVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static af parseFrom(com.google.v.z zVar, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static af parseFrom(InputStream inputStream) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static af parseFrom(InputStream inputStream, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static af parseFrom(ByteBuffer byteBuffer) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static af parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static af parseFrom(byte[] bArr) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static af parseFrom(byte[] bArr, de deVar) {
        return (af) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
