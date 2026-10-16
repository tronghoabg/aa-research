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
public final class i extends du<i, h> implements fj {
    public static final int ADD_STOP_URL_FIELD_NUMBER = 3;
    public static final int AD_CLICKED_URL_FIELD_NUMBER = 2;
    public static final int AD_VIEWED_URL_FIELD_NUMBER = 1;
    private static final i DEFAULT_INSTANCE;
    private static volatile fo<i> PARSER;
    private int bitField0_;
    private String adViewedUrl_ = "";
    private String adClickedUrl_ = "";
    private String addStopUrl_ = "";

    static {
        i iVar = new i();
        DEFAULT_INSTANCE = iVar;
        du.registerDefaultInstance(i.class, iVar);
    }

    private i() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdClickedUrl() {
        this.bitField0_ &= -3;
        this.adClickedUrl_ = getDefaultInstance().getAdClickedUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAdViewedUrl() {
        this.bitField0_ &= -2;
        this.adViewedUrl_ = getDefaultInstance().getAdViewedUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAddStopUrl() {
        this.bitField0_ &= -5;
        this.addStopUrl_ = getDefaultInstance().getAddStopUrl();
    }

    public static i getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static h newBuilder() {
        return (h) DEFAULT_INSTANCE.createBuilder();
    }

    public static i parseDelimitedFrom(InputStream inputStream) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(com.google.v.v vVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<i> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdClickedUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.adClickedUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdClickedUrlBytes(com.google.v.v vVar) {
        this.adClickedUrl_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdViewedUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.adViewedUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAdViewedUrlBytes(com.google.v.v vVar) {
        this.adViewedUrl_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddStopUrl(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.addStopUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAddStopUrlBytes(com.google.v.v vVar) {
        this.addStopUrl_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002", new Object[]{"bitField0_", "adViewedUrl_", "adClickedUrl_", "addStopUrl_"});
        }
        if (iOrdinal == 3) {
            return new i();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new h(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<i> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (i.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAdClickedUrl() {
        return this.adClickedUrl_;
    }

    public com.google.v.v getAdClickedUrlBytes() {
        return com.google.v.v.s(this.adClickedUrl_);
    }

    public String getAdViewedUrl() {
        return this.adViewedUrl_;
    }

    public com.google.v.v getAdViewedUrlBytes() {
        return com.google.v.v.s(this.adViewedUrl_);
    }

    public String getAddStopUrl() {
        return this.addStopUrl_;
    }

    public com.google.v.v getAddStopUrlBytes() {
        return com.google.v.v.s(this.addStopUrl_);
    }

    public boolean hasAdClickedUrl() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasAdViewedUrl() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasAddStopUrl() {
        return (this.bitField0_ & 4) != 0;
    }

    public static h newBuilder(i iVar) {
        return (h) DEFAULT_INSTANCE.createBuilder(iVar);
    }

    public static i parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (i) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(com.google.v.v vVar, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static i parseFrom(com.google.v.z zVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static i parseFrom(com.google.v.z zVar, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static i parseFrom(InputStream inputStream) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static i parseFrom(InputStream inputStream, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static i parseFrom(ByteBuffer byteBuffer) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static i parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static i parseFrom(byte[] bArr) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static i parseFrom(byte[] bArr, de deVar) {
        return (i) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
