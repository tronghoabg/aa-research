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
public final class ay extends du<ay, ax> implements fj {
    public static final int APP_VERSION_FIELD_NUMBER = 1;
    public static final int CORE_APP_VERSION_FIELD_NUMBER = 3;
    private static final ay DEFAULT_INSTANCE;
    public static final int DEVICE_MODEL_FIELD_NUMBER = 2;
    public static final int LOCALE_FIELD_NUMBER = 5;
    public static final int MCC_MNC_FIELD_NUMBER = 4;
    private static volatile fo<ay> PARSER;
    private int bitField0_;
    private String appVersion_ = "";
    private String coreAppVersion_ = "";
    private String deviceModel_ = "";
    private String mccMnc_ = "";
    private String locale_ = "";

    static {
        ay ayVar = new ay();
        DEFAULT_INSTANCE = ayVar;
        du.registerDefaultInstance(ay.class, ayVar);
    }

    private ay() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAppVersion() {
        this.bitField0_ &= -2;
        this.appVersion_ = getDefaultInstance().getAppVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCoreAppVersion() {
        this.bitField0_ &= -3;
        this.coreAppVersion_ = getDefaultInstance().getCoreAppVersion();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDeviceModel() {
        this.bitField0_ &= -5;
        this.deviceModel_ = getDefaultInstance().getDeviceModel();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocale() {
        this.bitField0_ &= -17;
        this.locale_ = getDefaultInstance().getLocale();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMccMnc() {
        this.bitField0_ &= -9;
        this.mccMnc_ = getDefaultInstance().getMccMnc();
    }

    public static ay getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static ax newBuilder() {
        return (ax) DEFAULT_INSTANCE.createBuilder();
    }

    public static ay parseDelimitedFrom(InputStream inputStream) {
        return (ay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ay parseFrom(com.google.v.v vVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, vVar);
    }

    public static fo<ay> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 1;
        this.appVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAppVersionBytes(com.google.v.v vVar) {
        this.appVersion_ = vVar.u();
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoreAppVersion(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 2;
        this.coreAppVersion_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCoreAppVersionBytes(com.google.v.v vVar) {
        this.coreAppVersion_ = vVar.u();
        this.bitField0_ |= 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceModel(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 4;
        this.deviceModel_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDeviceModelBytes(com.google.v.v vVar) {
        this.deviceModel_ = vVar.u();
        this.bitField0_ |= 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocale(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 16;
        this.locale_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setLocaleBytes(com.google.v.v vVar) {
        this.locale_ = vVar.u();
        this.bitField0_ |= 16;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMccMnc(String str) {
        Objects.requireNonNull(str);
        this.bitField0_ |= 8;
        this.mccMnc_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMccMncBytes(com.google.v.v vVar) {
        this.mccMnc_ = vVar.u();
        this.bitField0_ |= 8;
    }

    @Override // com.google.v.du
    protected final Object dynamicMethod(dt dtVar, Object obj, Object obj2) {
        fo dnVar;
        int iOrdinal = dtVar.ordinal();
        if (iOrdinal == 0) {
            return (byte) 1;
        }
        if (iOrdinal == 2) {
            return newMessageInfo(DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0002\u0003ဈ\u0001\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{"bitField0_", "appVersion_", "deviceModel_", "coreAppVersion_", "mccMnc_", "locale_"});
        }
        if (iOrdinal == 3) {
            return new ay();
        }
        byte[] bArr = null;
        if (iOrdinal == 4) {
            return new ax(bArr);
        }
        if (iOrdinal == 5) {
            return DEFAULT_INSTANCE;
        }
        if (iOrdinal != 6) {
            throw null;
        }
        fo<ay> foVar = PARSER;
        if (foVar != null) {
            return foVar;
        }
        synchronized (ay.class) {
            dnVar = PARSER;
            if (dnVar == null) {
                dnVar = new dn(DEFAULT_INSTANCE);
                PARSER = dnVar;
            }
        }
        return dnVar;
    }

    public String getAppVersion() {
        return this.appVersion_;
    }

    public com.google.v.v getAppVersionBytes() {
        return com.google.v.v.s(this.appVersion_);
    }

    public String getCoreAppVersion() {
        return this.coreAppVersion_;
    }

    public com.google.v.v getCoreAppVersionBytes() {
        return com.google.v.v.s(this.coreAppVersion_);
    }

    public String getDeviceModel() {
        return this.deviceModel_;
    }

    public com.google.v.v getDeviceModelBytes() {
        return com.google.v.v.s(this.deviceModel_);
    }

    public String getLocale() {
        return this.locale_;
    }

    public com.google.v.v getLocaleBytes() {
        return com.google.v.v.s(this.locale_);
    }

    public String getMccMnc() {
        return this.mccMnc_;
    }

    public com.google.v.v getMccMncBytes() {
        return com.google.v.v.s(this.mccMnc_);
    }

    public boolean hasAppVersion() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasCoreAppVersion() {
        return (this.bitField0_ & 2) != 0;
    }

    public boolean hasDeviceModel() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasLocale() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasMccMnc() {
        return (this.bitField0_ & 8) != 0;
    }

    public static ax newBuilder(ay ayVar) {
        return (ax) DEFAULT_INSTANCE.createBuilder(ayVar);
    }

    public static ay parseDelimitedFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ay) parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ay parseFrom(com.google.v.v vVar, com.google.v.de deVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, vVar, deVar);
    }

    public static ay parseFrom(com.google.v.z zVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, zVar);
    }

    public static ay parseFrom(com.google.v.z zVar, com.google.v.de deVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, zVar, deVar);
    }

    public static ay parseFrom(InputStream inputStream) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ay parseFrom(InputStream inputStream, com.google.v.de deVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, inputStream, deVar);
    }

    public static ay parseFrom(ByteBuffer byteBuffer) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static ay parseFrom(ByteBuffer byteBuffer, com.google.v.de deVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, byteBuffer, deVar);
    }

    public static ay parseFrom(byte[] bArr) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ay parseFrom(byte[] bArr, com.google.v.de deVar) {
        return (ay) du.parseFrom(DEFAULT_INSTANCE, bArr, deVar);
    }
}
