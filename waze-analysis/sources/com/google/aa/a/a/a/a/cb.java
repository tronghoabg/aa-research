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
public final class cb extends du<cb, bz> implements fj {
    public static final int APP_ID_FIELD_NUMBER = 3;
    public static final int APP_VERSION_FIELD_NUMBER = 4;
    private static final cb DEFAULT_INSTANCE;
    public static final int DEVICE_ID_FIELD_NUMBER = 1;
    public static final int MCC_MNC_FIELD_NUMBER = 5;
    public static final int OS_FIELD_NUMBER = 2;
    private static volatile fo<cb> PARSER;
    private int bitField0_;
    private int os_;
    private String deviceId_ = "";
    private String appId_ = "";
    private String appVersion_ = "";
    private String mccMnc_ = "";

    static {
        cb cbVar = new cb();
        DEFAULT_INSTANCE = cbVar;
        du.registerDefaultInstance(cb.class, cbVar);
    }

    private cb() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppId() {
        this.bitField0_ &= -5;
        this.appId_ = getDefaultInstance().getAppId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppVersion() {
        this.bitField0_ &= -9;
        this.appVersion_ = getDefaultInstance().getAppVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceId() {
        this.bitField0_ &= -2;
        this.deviceId_ = getDefaultInstance().getDeviceId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMccMnc() {
        this.bitField0_ &= -17;
        this.mccMnc_ = getDefaultInstance().getMccMnc();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOs() {
        this.bitField0_ &= -3;
        this.os_ = 0;
    }

    public static cb getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static bz newBuilder() {
        return (bz) DEFAULT_INSTANCE.createBuilder();
    }

    public static cb parseDelimitedFrom(InputStream inputStream) {
        return (cb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cb parseFrom(com.google.v.v vVar) {
        return (cb) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<cb> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.appId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppIdBytes(com.google.v.v vVar) {
        this.appId_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.appVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersionBytes(com.google.v.v vVar) {
        this.appVersion_ = vVar.u();
        this.bitField0_ |= 8;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceId(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.deviceId_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceIdBytes(com.google.v.v vVar) {
        this.deviceId_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMccMnc(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.mccMnc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMccMncBytes(com.google.v.v vVar) {
        this.mccMnc_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOs(ca caVar) {
        this.os_ = caVar.getNumber();
        this.bitField0_ |= 2;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002᠌\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "deviceId_", "os_", i.t, "appId_", "appVersion_", "mccMnc_"});
        }
        if (iOrdinal == 3) {
            return new cb();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new bz(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<cb> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (cb.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAppId() {
        return this.appId_;
    }

    public com.google.v.v getAppIdBytes() {
        return com.google.v.v.s(this.appId_);
    }

    public String getAppVersion() {
        return this.appVersion_;
    }

    public com.google.v.v getAppVersionBytes() {
        return com.google.v.v.s(this.appVersion_);
    }

    public String getDeviceId() {
        return this.deviceId_;
    }

    public com.google.v.v getDeviceIdBytes() {
        return com.google.v.v.s(this.deviceId_);
    }

    public String getMccMnc() {
        return this.mccMnc_;
    }

    public com.google.v.v getMccMncBytes() {
        return com.google.v.v.s(this.mccMnc_);
    }

    public ca getOs() {
        ca caVarA = ca.a(this.os_);
        return caVarA == null ? ca.OS_TYPE_UNKNOWN : caVarA;
    }

    public boolean hasAppId() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasAppVersion() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasDeviceId() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasMccMnc() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasOs() {
        return (this.bitField0_ & 2) != 0;
    }

    public static bz newBuilder(cb cbVar) {
        return (bz) DEFAULT_INSTANCE.createBuilder(cbVar);
    }

    public static cb parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cb) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cb parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (cb) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static cb parseFrom(com.google.v.z zVar) {
        return (cb) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static cb parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (cb) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static cb parseFrom(InputStream inputStream) {
        return (cb) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static cb parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (cb) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static cb parseFrom(ByteBuffer byteBuffer) {
        return (cb) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static cb parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (cb) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static cb parseFrom(byte[] bArr) {
        return (cb) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static cb parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (cb) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
