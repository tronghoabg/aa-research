package com.google.firebase.perf.f;

import com.google.aa.a.a.a.a.bv;
import com.google.aa.a.a.a.a.by;
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
/* loaded from: classes4.dex */
public final class t extends du<t, s> implements fj {
    public static final int BUNDLE_SHORT_VERSION_FIELD_NUMBER = 3;
    private static final t DEFAULT_INSTANCE;
    public static final int MCC_MNC_FIELD_NUMBER = 4;
    public static final int NETWORK_CONNECTION_INFO_FIELD_NUMBER = 5;
    private static volatile fo<t> PARSER = null;
    public static final int SDK_VERSION_FIELD_NUMBER = 2;
    private int bitField0_;
    private by networkConnectionInfo_;
    private String sdkVersion_ = "";
    private String bundleShortVersion_ = "";
    private String mccMnc_ = "";

    static {
        t tVar = new t();
        DEFAULT_INSTANCE = tVar;
        du.registerDefaultInstance(t.class, tVar);
    }

    private t() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBundleShortVersion() {
        this.bitField0_ &= -3;
        this.bundleShortVersion_ = getDefaultInstance().getBundleShortVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMccMnc() {
        this.bitField0_ &= -5;
        this.mccMnc_ = getDefaultInstance().getMccMnc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearNetworkConnectionInfo() {
        this.networkConnectionInfo_ = null;
        this.bitField0_ &= -9;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSdkVersion() {
        this.bitField0_ &= -2;
        this.sdkVersion_ = getDefaultInstance().getSdkVersion();
    }

    public static t getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeNetworkConnectionInfo(by byVar) {
        Objects.requireNonNull(byVar);
        by byVar2 = this.networkConnectionInfo_;
        if (byVar2 != null && byVar2 != by.getDefaultInstance()) {
            bv bvVarNewBuilder = by.newBuilder(byVar2);
            bvVarNewBuilder.mergeFrom((bv) byVar);
            byVar = bvVarNewBuilder.buildPartial();
        }
        this.networkConnectionInfo_ = byVar;
        this.bitField0_ |= 8;
    }

    public static s newBuilder() {
        return (s) DEFAULT_INSTANCE.createBuilder();
    }

    public static t parseDelimitedFrom(InputStream inputStream) {
        return (t) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static t parseFrom(com.google.v.v vVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<t> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBundleShortVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.bundleShortVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBundleShortVersionBytes(com.google.v.v vVar) {
        this.bundleShortVersion_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMccMnc(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.mccMnc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMccMncBytes(com.google.v.v vVar) {
        this.mccMnc_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNetworkConnectionInfo(by byVar) {
        Objects.requireNonNull(byVar);
        this.networkConnectionInfo_ = byVar;
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.sdkVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSdkVersionBytes(com.google.v.v vVar) {
        this.sdkVersion_ = vVar.u();
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
            return newMessageInfo(DEFAULT_INSTANCE, "\u0004\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0000\u0000\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002\u0005ဉ\u0003", new Object[]{"bitField0_", "sdkVersion_", "bundleShortVersion_", "mccMnc_", "networkConnectionInfo_"});
        }
        if (iOrdinal == 3) {
            return new t();
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
        fo<t> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (t.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getBundleShortVersion() {
        return this.bundleShortVersion_;
    }

    public com.google.v.v getBundleShortVersionBytes() {
        return com.google.v.v.s(this.bundleShortVersion_);
    }

    public String getMccMnc() {
        return this.mccMnc_;
    }

    public com.google.v.v getMccMncBytes() {
        return com.google.v.v.s(this.mccMnc_);
    }

    public by getNetworkConnectionInfo() {
        by byVar = this.networkConnectionInfo_;
        return byVar == null ? by.getDefaultInstance() : byVar;
    }

    public String getSdkVersion() {
        return this.sdkVersion_;
    }

    public com.google.v.v getSdkVersionBytes() {
        return com.google.v.v.s(this.sdkVersion_);
    }

    public boolean hasBundleShortVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasMccMnc() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasNetworkConnectionInfo() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasSdkVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public static s newBuilder(t tVar) {
        return (s) DEFAULT_INSTANCE.createBuilder(tVar);
    }

    public static t parseDelimitedFrom(InputStream inputStream, de deVar) {
        return (t) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static t parseFrom(com.google.v.v vVar, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static t parseFrom(com.google.v.z zVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static t parseFrom(com.google.v.z zVar, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static t parseFrom(InputStream inputStream) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static t parseFrom(InputStream inputStream, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static t parseFrom(ByteBuffer byteBuffer) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static t parseFrom(ByteBuffer byteBuffer, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static t parseFrom(byte[] bArr) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static t parseFrom(byte[] bArr, de deVar) {
        return (t) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
